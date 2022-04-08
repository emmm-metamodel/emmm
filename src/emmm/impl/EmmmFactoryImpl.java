/**
 */
package emmm.impl;

import emmm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmmmFactoryImpl extends EFactoryImpl implements EmmmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmmmFactory init() {
		try {
			EmmmFactory theEmmmFactory = (EmmmFactory)EPackage.Registry.INSTANCE.getEFactory(EmmmPackage.eNS_URI);
			if (theEmmmFactory != null) {
				return theEmmmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmmmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmmmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EmmmPackage.RUN: return createRun();
			case EmmmPackage.MODEL_TRAIN: return createModelTrain();
			case EmmmPackage.EXPERIMENT: return createExperiment();
			case EmmmPackage.PARAMETER: return createParameter();
			case EmmmPackage.MODEL_EVAL: return createModelEval();
			case EmmmPackage.MODEL_PERFORMANCE: return createModelPerformance();
			case EmmmPackage.EXPERIMENT_STORE: return createExperimentStore();
			case EmmmPackage.TRAINING_SET: return createTrainingSet();
			case EmmmPackage.EVAL_SET: return createEvalSet();
			case EmmmPackage.EXECUTION_INFO: return createExecutionInfo();
			case EmmmPackage.DATA_ORIENTED: return createDataOriented();
			case EmmmPackage.DATASET: return createDataset();
			case EmmmPackage.DATA_FEATURE: return createDataFeature();
			case EmmmPackage.MODEL: return createModel();
			case EmmmPackage.DEPENDENCY: return createDependency();
			case EmmmPackage.METADATA: return createMetadata();
			case EmmmPackage.PIPELINE: return createPipeline();
			case EmmmPackage.ARBITRARY_FILE: return createArbitraryFile();
			case EmmmPackage.GENERIC_IMPL: return createGenericImpl();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EmmmPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EmmmPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Run createRun() {
		RunImpl run = new RunImpl();
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTrain createModelTrain() {
		ModelTrainImpl modelTrain = new ModelTrainImpl();
		return modelTrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Experiment createExperiment() {
		ExperimentImpl experiment = new ExperimentImpl();
		return experiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelEval createModelEval() {
		ModelEvalImpl modelEval = new ModelEvalImpl();
		return modelEval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPerformance createModelPerformance() {
		ModelPerformanceImpl modelPerformance = new ModelPerformanceImpl();
		return modelPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentStore createExperimentStore() {
		ExperimentStoreImpl experimentStore = new ExperimentStoreImpl();
		return experimentStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainingSet createTrainingSet() {
		TrainingSetImpl trainingSet = new TrainingSetImpl();
		return trainingSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvalSet createEvalSet() {
		EvalSetImpl evalSet = new EvalSetImpl();
		return evalSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionInfo createExecutionInfo() {
		ExecutionInfoImpl executionInfo = new ExecutionInfoImpl();
		return executionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOriented createDataOriented() {
		DataOrientedImpl dataOriented = new DataOrientedImpl();
		return dataOriented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataset createDataset() {
		DatasetImpl dataset = new DatasetImpl();
		return dataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFeature createDataFeature() {
		DataFeatureImpl dataFeature = new DataFeatureImpl();
		return dataFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pipeline createPipeline() {
		PipelineImpl pipeline = new PipelineImpl();
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArbitraryFile createArbitraryFile() {
		ArbitraryFileImpl arbitraryFile = new ArbitraryFileImpl();
		return arbitraryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericImpl createGenericImpl() {
		GenericImplImpl genericImpl = new GenericImplImpl();
		return genericImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmmmPackage getEmmmPackage() {
		return (EmmmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmmmPackage getPackage() {
		return EmmmPackage.eINSTANCE;
	}

} //EmmmFactoryImpl
