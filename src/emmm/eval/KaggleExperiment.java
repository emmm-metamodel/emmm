package emmm.eval;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import emmm.ArbitraryFile;
import emmm.DataOriented;
import emmm.Dataset;
import emmm.EmmmFactory;
import emmm.EvalSet;
import emmm.ExecutionInfo;
import emmm.Experiment;
import emmm.ExperimentStore;
import emmm.Model;
import emmm.ModelEval;
import emmm.ModelPerformance;
import emmm.ModelTrain;
import emmm.Parameter;
import emmm.Run;
import emmm.TrainingSet;

public class KaggleExperiment {

	// XMI model file
	final String modelOutputFile = "../EMMM.model2/model/expstore.xmi";

	// Declare assets
	ExperimentStore expStore;

	Dataset dataset;
	EvalSet evalSet;
	TrainingSet trainingSet;

	Parameter parameter;

	DataOriented dataOrientedScript;
	ModelTrain modelTrainScript;
	ModelEval modelEvalScript;

	ArrayList<Model> models;

	ExecutionInfo executionInfo;
	ModelPerformance modelPerformance;

	ArbitraryFile plots;

	HashMap<String, Integer> assetVersion = new HashMap<String, Integer>();

	// Constructor
	public KaggleExperiment() {
		// Create Experiment store
		expStore = EmmmFactory.eINSTANCE.createExperimentStore();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KaggleExperiment builder = new KaggleExperiment();

		builder.buildExperiment();
		builder.saveModel();
	}

	public void saveModel() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(modelOutputFile));

		resource.getContents().add(expStore);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void buildExperiment() {
		// Create an Experiment
		String experimentName = "Titanic Survival Preiction";
		String experimentDescription = "The following experiment uses the following models with voting classifier: SVC, Random Forest Classifier"
				+ "Logistic Regression, XGBOOST, MLP Classifier. All models were ensembled using voting classifier with higher weights for the higher acc models.";

		Experiment experiment = EmmmFactory.eINSTANCE.createExperiment();
		experiment.setName(experimentName);
		experiment.setDescription(experimentDescription);
		experiment.getMetadata().add(BuilderUtils.buildMetadata("Author", "John Doe"));
		experiment.getMetadata().add(BuilderUtils.buildMetadata("ML Framework", "Scikit Learn"));

		// add a new experiment
		expStore.getExperiment().add(experiment);

		// make 18 experiment runs
		for (int i = 1; i <= 18; i++) {
			buildExperimentRun(experiment, i);
		}
	}

	public void buildExperimentRun(Experiment experiment, int currentVersion) {
		System.out.println("Building new experiment run: " + currentVersion);
		Run run = EmmmFactory.eINSTANCE.createRun();
		run.setVersionID(currentVersion);
		run.setName("@v" + currentVersion);

		switch (currentVersion) {
		case 1: {

			dataset = BuilderUtils.buildDataset(currentVersion);
			trainingSet = BuilderUtils.buildTrainingSet(currentVersion);
			evalSet = BuilderUtils.buildEvalSet(currentVersion);
			parameter = BuilderUtils.buildParameter(currentVersion);
			models = BuilderUtils.buildModel(currentVersion);
			dataOrientedScript = BuilderUtils.buildDataOrientedScript(currentVersion, dataset, parameter);
			modelTrainScript = BuilderUtils.buildTrainModelScript(currentVersion, trainingSet);
			modelEvalScript = BuilderUtils.buildModelEvalScript(currentVersion, evalSet, models);
			executionInfo = BuilderUtils.buildExecutionInfo(currentVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(currentVersion);

			BuilderUtils.initAssetVersion(assetVersion);

			run.getAsset().add(dataset);
			run.getAsset().add(trainingSet);
			run.getAsset().add(evalSet);

			run.getAsset().add(parameter);

			run.getAsset().add(dataOrientedScript);
			run.getAsset().add(modelTrainScript);
			run.getAsset().add(modelEvalScript);

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);

			break;
		}

		case 2: {

			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(EcoreUtil.copy(parameter));

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));
			run.getAsset().add(EcoreUtil.copy(modelTrainScript));
			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);

			break;
		}

		case 3: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			BuilderUtils.incrementAssetVersion("evalSet", assetVersion);
			modelEvalScript = BuilderUtils.buildModelEvalScript(assetVersion.get("evalSet"), evalSet, models);

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(EcoreUtil.copy(parameter));

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));
			run.getAsset().add(EcoreUtil.copy(modelTrainScript));
			run.getAsset().add(modelEvalScript);

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}

		case 4: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(EcoreUtil.copy(parameter));

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));
			run.getAsset().add(EcoreUtil.copy(modelTrainScript));
			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}

		case 5: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			BuilderUtils.incrementAssetVersion("parameter", assetVersion);
			parameter = BuilderUtils.buildParameter(assetVersion.get("parameter"));

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(parameter);

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));
			run.getAsset().add(EcoreUtil.copy(modelTrainScript));
			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);

			break;
		}
		case 6: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(EcoreUtil.copy(parameter));

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));

			run.getAsset().add(EcoreUtil.copy(modelTrainScript));

			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}
		case 7: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			BuilderUtils.incrementAssetVersion("modelTrainScript", assetVersion);
			modelTrainScript = BuilderUtils.buildTrainModelScript(assetVersion.get("modelTrainScript"), trainingSet);

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(EcoreUtil.copy(parameter));

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));

			run.getAsset().add(modelTrainScript);

			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}
		case 8: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			BuilderUtils.incrementAssetVersion("modelTrainScript", assetVersion);
			modelTrainScript = BuilderUtils.buildTrainModelScript(assetVersion.get("modelTrainScript"), trainingSet);

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(EcoreUtil.copy(parameter));

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));

			run.getAsset().add(modelTrainScript);

			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}
		case 9: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			BuilderUtils.incrementAssetVersion("modelTrainScript", assetVersion);
			modelTrainScript = BuilderUtils.buildTrainModelScript(assetVersion.get("modelTrainScript"), trainingSet);

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(EcoreUtil.copy(parameter));

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));

			run.getAsset().add(modelTrainScript);

			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}
		case 10: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			BuilderUtils.incrementAssetVersion("parameter", assetVersion);
			parameter = BuilderUtils.buildParameter(assetVersion.get("parameter"));

			BuilderUtils.incrementAssetVersion("modelTrainScript", assetVersion);
			modelTrainScript = BuilderUtils.buildTrainModelScript(assetVersion.get("modelTrainScript"), trainingSet);

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(parameter);

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));
			run.getAsset().add(modelTrainScript);
			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}
		case 11: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			BuilderUtils.incrementAssetVersion("parameter", assetVersion);
			parameter = BuilderUtils.buildParameter(assetVersion.get("parameter"));

			BuilderUtils.incrementAssetVersion("modelTrainScript", assetVersion);
			modelTrainScript = BuilderUtils.buildTrainModelScript(assetVersion.get("modelTrainScript"), trainingSet);

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(parameter);

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));
			run.getAsset().add(modelTrainScript);
			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}
		case 12: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(EcoreUtil.copy(parameter));

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));
			run.getAsset().add(EcoreUtil.copy(modelTrainScript));
			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}
		case 13: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(EcoreUtil.copy(parameter));

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));
			run.getAsset().add(EcoreUtil.copy(modelTrainScript));
			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}
		case 14: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			BuilderUtils.incrementAssetVersion("parameter", assetVersion);
			parameter = BuilderUtils.buildParameter(assetVersion.get("parameter"));

			BuilderUtils.incrementAssetVersion("modelTrainScript", assetVersion);
			modelTrainScript = BuilderUtils.buildTrainModelScript(assetVersion.get("modelTrainScript"), trainingSet);

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(parameter);

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));
			run.getAsset().add(modelTrainScript);
			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}
		case 15: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			BuilderUtils.incrementAssetVersion("modelTrainScript", assetVersion);
			modelTrainScript = BuilderUtils.buildTrainModelScript(assetVersion.get("modelTrainScript"), trainingSet);

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(EcoreUtil.copy(parameter));

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));

			run.getAsset().add(modelTrainScript);

			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}
		case 16: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(EcoreUtil.copy(parameter));

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));
			run.getAsset().add(EcoreUtil.copy(modelTrainScript));
			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}
		case 17: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(EcoreUtil.copy(parameter));

			run.getAsset().add(EcoreUtil.copy(dataOrientedScript));
			run.getAsset().add(EcoreUtil.copy(modelTrainScript));
			run.getAsset().add(EcoreUtil.copy(modelEvalScript));

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}
		case 18: {
			BuilderUtils.incrementAssetVersion("models", assetVersion);
			models = BuilderUtils.buildModel(assetVersion.get("models"));
			BuilderUtils.incrementAssetVersion("executionInfo", assetVersion);
			executionInfo = BuilderUtils.buildExecutionInfo(assetVersion.get("executionInfo"));
			BuilderUtils.incrementAssetVersion("modelPerformance", assetVersion);
			modelPerformance = BuilderUtils.buildModelPerformance(assetVersion.get("modelPerformance"));

			BuilderUtils.incrementAssetVersion("dataOrientedScript", assetVersion);
			dataOrientedScript = BuilderUtils.buildDataOrientedScript(assetVersion.get("dataOrientedScript"), dataset,
					parameter);

			BuilderUtils.incrementAssetVersion("modelTrainScript", assetVersion);
			modelTrainScript = BuilderUtils.buildTrainModelScript(assetVersion.get("modelTrainScript"), trainingSet);

			BuilderUtils.incrementAssetVersion("modelEvalScript", assetVersion);
			modelEvalScript = BuilderUtils.buildModelEvalScript(assetVersion.get("modelEvalScript"), evalSet, models);

			run.getAsset().add(EcoreUtil.copy(dataset));
			run.getAsset().add(EcoreUtil.copy(trainingSet));
			run.getAsset().add(EcoreUtil.copy(evalSet));

			run.getAsset().add(EcoreUtil.copy(parameter));

			run.getAsset().add(dataOrientedScript);
			run.getAsset().add(modelTrainScript);
			run.getAsset().add(modelEvalScript);

			run.getAsset().add(executionInfo);
			run.getAsset().addAll(models);
			run.getAsset().add(modelPerformance);
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + currentVersion);
		}

		System.out.println("Adding created run to experiment");
		experiment.getRun().add(run);
	}

}
