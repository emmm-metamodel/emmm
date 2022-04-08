package emmm.eval;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import emmm.ArbitraryFile;
import emmm.DataFeature;
import emmm.DataOriented;
import emmm.DataType;
import emmm.Dataset;
import emmm.EmmmFactory;
import emmm.EvalSet;
import emmm.ExecutionInfo;
import emmm.Metadata;
import emmm.Model;
import emmm.ModelEval;
import emmm.ModelPerformance;
import emmm.ModelTrain;
import emmm.Parameter;
import emmm.TrainingSet;

public final class BuilderUtils {
   
	
	public static Metadata buildMetadata(String key, String value) {
		Metadata meta = EmmmFactory.eINSTANCE.createMetadata();
		meta.setKey(key);
		meta.setValue(value);

		return meta;
	}
	
	public static void initAssetVersion(HashMap<String, Integer> assetVersion) {
		assetVersion.put("dataset", 1);
		assetVersion.put("trainingSet", 1);
		assetVersion.put("evalSet", 1);
		assetVersion.put("parameter", 1);
		assetVersion.put("models", 1);
		assetVersion.put("dataOrientedScript", 1);
		assetVersion.put("modelTrainScript", 1);
		assetVersion.put("modelEvalScript", 1);
		assetVersion.put("executionInfo", 1);
		assetVersion.put("modelPerformance", 1);
	}
	
	public static void incrementAssetVersion(String asset, HashMap<String, Integer> assetVersion){
		assetVersion.put(asset, assetVersion.get(asset) + 1);
	}
	
	
	public static DataFeature buildDataFeature(DataType type, String name) {

		DataFeature feature = EmmmFactory.eINSTANCE.createDataFeature();
		feature.setDtype(type);
		feature.setName(name);

		return feature;
	}
	
	public static Dataset buildDataset(int currentVersion) {

		Dataset titanicDataset = EmmmFactory.eINSTANCE.createDataset();
		titanicDataset.setVersionID(currentVersion);
		titanicDataset.setName("Titanic @v" + currentVersion);

		Collection<Metadata> metadatas = new ArrayList<Metadata>();

		metadatas.add(buildMetadata("URI", "/kaggle/input/titanic/data.csv"));
		metadatas.add(buildMetadata("Dataset Format", "CSV"));

		titanicDataset.getMetadata().addAll(metadatas);

		// Features
		Collection<DataFeature> features = new ArrayList<DataFeature>();

		features.add(buildDataFeature(DataType.INT, "PassengerId"));
		features.add(buildDataFeature(DataType.INT, "Survived"));
		features.add(buildDataFeature(DataType.INT, "Pclass"));
		features.add(buildDataFeature(DataType.STRING, "Name"));
		features.add(buildDataFeature(DataType.STRING, "Sex"));
		features.add(buildDataFeature(DataType.INT, "Age"));
		features.add(buildDataFeature(DataType.INT, "SibSp"));
		features.add(buildDataFeature(DataType.INT, "Parch"));
		features.add(buildDataFeature(DataType.STRING, "Ticket"));
		features.add(buildDataFeature(DataType.INT, "Fare"));
		features.add(buildDataFeature(DataType.STRING, "Cabin"));
		features.add(buildDataFeature(DataType.STRING, "Embarked"));

		titanicDataset.getDatafeature().addAll(features);

		return titanicDataset;
	}

	
	public static TrainingSet buildTrainingSet(int currentVersion) {
		TrainingSet trainingSet = EmmmFactory.eINSTANCE.createTrainingSet();
		trainingSet.setName("TrainingSet @v" + currentVersion);
		
		Collection<Metadata> metadatas = new ArrayList<Metadata>();
		metadatas.add(BuilderUtils.buildMetadata("URI", "/kaggle/input/titanic/train.csv"));
		metadatas.add(BuilderUtils.buildMetadata("Dataset Format", "CSV"));
		trainingSet.getMetadata().addAll(metadatas);
		
		return trainingSet;
	}
	
	public static EvalSet buildEvalSet(int currentVersion) {
		EvalSet evalSet = EmmmFactory.eINSTANCE.createEvalSet();
		evalSet.setName("Titanic EvaluationSet @v" + currentVersion);
		
		Collection<Metadata> metadatas = new ArrayList<Metadata>();
		metadatas.add(BuilderUtils.buildMetadata("URI", "/kaggle/input/titanic/test.csv"));
		metadatas.add(BuilderUtils.buildMetadata("Dataset Format", "CSV"));
		evalSet.getMetadata().addAll(metadatas);
		
		return evalSet;
	}
	
	
	

	
	
	
	public static Parameter buildParameter(int currentVersion) {
		Parameter parameter = EmmmFactory.eINSTANCE.createParameter();
		parameter.setVersionID(currentVersion);
		parameter.setName("@v"+currentVersion);
		parameter.getMetadata().add(buildMetadata("Data Split random_seed", "42"));
		parameter.getMetadata().add(buildMetadata("Cross Validation", "5"));
		parameter.getMetadata().add(buildMetadata("rfc_n_estimators", "300"));
		parameter.getMetadata().add(buildMetadata("rfc_max_leaf", "100"));
		parameter.getMetadata().add(buildMetadata("rfc_random_state", "0"));
		parameter.getMetadata().add(buildMetadata("xgb_use_label_encoder","False"));
		parameter.getMetadata().add(buildMetadata("xgb_verbosity","0"));
		parameter.getMetadata().add(buildMetadata("xgb_gamma","0.5"));
		parameter.getMetadata().add(buildMetadata("xgb_reg_lambda","10"));
		
		return parameter;
	}
	
	
	
	///// scripts
	
	public static DataOriented buildDataOrientedScript(int currentVersion, Dataset ds, Parameter p) {

		DataOriented script = EmmmFactory.eINSTANCE.createDataOriented();
		script.setVersionID(currentVersion);
		script.setSourceFile("/kaggle/data_script.py @v" + currentVersion);
		script.setName("EDA & Data preprocessing @v" + currentVersion);
		
		script.getInputData().add(ds);
		script.getOutputData().add(ds);
		script.getInputs().add(p); //params

		Collection<Metadata> metadatas = new ArrayList<Metadata>();
		metadatas.add(BuilderUtils.buildMetadata("Script Type", "Python"));
		metadatas.add(BuilderUtils.buildMetadata("Name", "EDA @v" + currentVersion));
		script.getMetadata().addAll(metadatas);

		return script;
	}
	public static ModelTrain buildTrainModelScript(int currentVersion, TrainingSet ts) {

		ModelTrain script = EmmmFactory.eINSTANCE.createModelTrain();
		script.setVersionID(currentVersion);
		script.setSourceFile("/kaggle/train_model_script.py @v" + currentVersion);
		script.setName("Model training @v" + currentVersion);
		
		script.getTrainingset().add(ts);

		Collection<Metadata> metadatas = new ArrayList<Metadata>();
		metadatas.add(BuilderUtils.buildMetadata("Script Type", "Python"));
		script.getMetadata().addAll(metadatas);

		return script;
	}
	public static ModelEval buildModelEvalScript(int currentVersion, EvalSet es, ArrayList<Model> models) {
		ModelEval script = EmmmFactory.eINSTANCE.createModelEval();
		script.setVersionID(currentVersion);
		script.setSourceFile("/kaggle/eval_model_script.py @v" + currentVersion);
		script.setName("Model testing @v" + currentVersion);
		
		script.getEvalset().add(es);
		
		Collection<Metadata> metadatas = new ArrayList<Metadata>();
		metadatas.add(BuilderUtils.buildMetadata("Script Type", "Python"));
		script.getMetadata().addAll(metadatas);
		
		script.getInputModel().addAll(models);
		
		return script;
	}
	
	
	
	
	///  output & executions
	
	
	public static ArrayList<Model> buildModel(int currentVersion) {
		ArrayList<Model> models = new ArrayList<Model>();
		
		Model model = EmmmFactory.eINSTANCE.createModel();
		model.setVersionID(currentVersion);
		model.setName("Random Forest Model @v" + currentVersion);
		models.add(model);
		
		model = EmmmFactory.eINSTANCE.createModel();
		model.setVersionID(currentVersion);
		model.setName("Logistic Regression Model @v" + currentVersion);
		models.add(model);
		
		
		model = EmmmFactory.eINSTANCE.createModel();
		model.setVersionID(currentVersion);
		model.setName("XGB Model @v" + currentVersion);
		models.add(model);
		
		
		model = EmmmFactory.eINSTANCE.createModel();
		model.setVersionID(currentVersion);
		model.setName("SVC Model @v" + currentVersion);
		models.add(model);
		
		model = EmmmFactory.eINSTANCE.createModel();
		model.setVersionID(currentVersion);
		model.setName("MLP Model @v" + currentVersion);
		models.add(model);
		
		model = EmmmFactory.eINSTANCE.createModel();
		model.setVersionID(currentVersion);
		model.setName("Voting Model @v" + currentVersion);
		models.add(model);
		
		return models;
	}
	
	
	
	
	public static ExecutionInfo buildExecutionInfo(int currentVersion) {
		ExecutionInfo executionInfo = EmmmFactory.eINSTANCE.createExecutionInfo();
		executionInfo.setVersionID(currentVersion);
		executionInfo.setName("@v" + currentVersion);

		Collection<Metadata> metadatas = new ArrayList<Metadata>();

		String[] durationLists = { "76.6s", "69s", "80s", "67s", "36s", "76.6s", "69s", "80s", "67s", "36s" , "76.6s", "69s", "80s", "67s", "36s",  "76.6s", "69s", "80s", "67s", "36s"  };

		metadatas.add(BuilderUtils.buildMetadata("Run duration", durationLists[currentVersion]));
		metadatas.add(BuilderUtils.buildMetadata("Logs", "/kaggle/experiment/logs @v" + currentVersion));

		executionInfo.getMetadata().addAll(metadatas);
		return executionInfo;
	}
	
	
	public static ArbitraryFile buildArbitraryFile(int currentVersion) {
		ArbitraryFile plot = EmmmFactory.eINSTANCE.createArbitraryFile();
		
		
		return plot;
	}
	
	
	
	public static ModelPerformance buildModelPerformance(int currentVersion) {
		ModelPerformance modelPerformance = EmmmFactory.eINSTANCE.createModelPerformance();
		modelPerformance.setVersionID(currentVersion);
		modelPerformance.setName("@v"+ currentVersion);

		switch (currentVersion) {
		case 1: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier Accuracy Score", "82.58%"));
			modelPerformance.getMetadata().add(buildMetadata("ConfusionMatrix", "/kaggle/voting_classifier_confusion_matrix.csv"));
			break;

		}
		case 2: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 3: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 4: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 5: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 6: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 7: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 8: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 9: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 10: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 11: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 12: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 13: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 14: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 15: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 16: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 17: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		case 18: {
			modelPerformance.getMetadata().add(buildMetadata("Random Forest CV Scores",
					"[0.8258427  0.79213483 0.84831461 0.78651685 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Random Forest", "0.8211832666793628"));

			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression CV Scores",
					"[0.78651685 0.79775281 0.78089888 0.78651685 0.81355932]"));
			modelPerformance.getMetadata().add(buildMetadata("Logistic Regression", "0.7930489430584651"));

			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier CV Scores",
					"[0.80898876 0.83146067 0.89325843 0.84269663 0.84745763]"));
			modelPerformance.getMetadata().add(buildMetadata("XGB Classifier", "0.8447724243001332"));

			modelPerformance.getMetadata()
					.add(buildMetadata("SVC CV Scores", "[0.8258427  0.82022472 0.80337079 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("SVC", "0.8223068621849807"));

			modelPerformance.getMetadata()
					.add(buildMetadata("MLP CV Scores", "[0.76404494 0.80337079 0.83146067 0.80337079 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("MLP", "0.8110709071288008"));

			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier CV Scores",
					"[0.8258427  0.83146067 0.85393258 0.80898876 0.85310734]"));
			modelPerformance.getMetadata().add(buildMetadata("Voting Classifier", "0.8346664127467782"));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + currentVersion);

		}

		return modelPerformance;
	}

	

	
    
}
