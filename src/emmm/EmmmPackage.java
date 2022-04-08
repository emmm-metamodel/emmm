/**
 */
package emmm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see emmm.EmmmFactory
 * @model kind="package"
 * @generated
 */
public interface EmmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmmmPackage eINSTANCE = emmm.impl.EmmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link emmm.impl.RunImpl <em>Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.RunImpl
	 * @see emmm.impl.EmmmPackageImpl#getRun()
	 * @generated
	 */
	int RUN = 0;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__ASSET = 0;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__VERSION_ID = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__METADATA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__NAME = 3;

	/**
	 * The number of structural features of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emmm.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.AssetImpl
	 * @see emmm.impl.EmmmPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 18;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__VERSION_ID = 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__METADATA = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = 2;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emmm.impl.ImplementationImpl <em>Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.ImplementationImpl
	 * @see emmm.impl.EmmmPackageImpl#getImplementation()
	 * @generated
	 */
	int IMPLEMENTATION = 8;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__VERSION_ID = ASSET__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__METADATA = ASSET__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Source File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__SOURCE_FILE = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__DEPENDENCY = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__INPUTS = ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION__OUTPUTS = ASSET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_FEATURE_COUNT = ASSET_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.ModelTrainImpl <em>Model Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.ModelTrainImpl
	 * @see emmm.impl.EmmmPackageImpl#getModelTrain()
	 * @generated
	 */
	int MODEL_TRAIN = 1;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRAIN__VERSION_ID = IMPLEMENTATION__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRAIN__METADATA = IMPLEMENTATION__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRAIN__NAME = IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Source File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRAIN__SOURCE_FILE = IMPLEMENTATION__SOURCE_FILE;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRAIN__DEPENDENCY = IMPLEMENTATION__DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRAIN__INPUTS = IMPLEMENTATION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRAIN__OUTPUTS = IMPLEMENTATION__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Trainingset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRAIN__TRAININGSET = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRAIN__INPUT_FEATURE = IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRAIN__OUTPUT_MODEL = IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRAIN_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Model Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRAIN_OPERATION_COUNT = IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.ExperimentImpl <em>Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.ExperimentImpl
	 * @see emmm.impl.EmmmPackageImpl#getExperiment()
	 * @generated
	 */
	int EXPERIMENT = 2;

	/**
	 * The feature id for the '<em><b>Run</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__RUN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT__METADATA = 3;

	/**
	 * The number of structural features of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emmm.impl.ExecutionDataImpl <em>Execution Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.ExecutionDataImpl
	 * @see emmm.impl.EmmmPackageImpl#getExecutionData()
	 * @generated
	 */
	int EXECUTION_DATA = 3;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA__VERSION_ID = ASSET__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA__METADATA = ASSET__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA__NAME = ASSET__NAME;

	/**
	 * The number of structural features of the '<em>Execution Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_DATA_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.ParameterImpl
	 * @see emmm.impl.EmmmPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VERSION_ID = ASSET__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__METADATA = ASSET__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = ASSET__NAME;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.ModelEvalImpl <em>Model Eval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.ModelEvalImpl
	 * @see emmm.impl.EmmmPackageImpl#getModelEval()
	 * @generated
	 */
	int MODEL_EVAL = 5;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EVAL__VERSION_ID = IMPLEMENTATION__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EVAL__METADATA = IMPLEMENTATION__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EVAL__NAME = IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Source File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EVAL__SOURCE_FILE = IMPLEMENTATION__SOURCE_FILE;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EVAL__DEPENDENCY = IMPLEMENTATION__DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EVAL__INPUTS = IMPLEMENTATION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EVAL__OUTPUTS = IMPLEMENTATION__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Evalset</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EVAL__EVALSET = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EVAL__INPUT_MODEL = IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Eval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EVAL_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model Eval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_EVAL_OPERATION_COUNT = IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.ModelPerformanceImpl <em>Model Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.ModelPerformanceImpl
	 * @see emmm.impl.EmmmPackageImpl#getModelPerformance()
	 * @generated
	 */
	int MODEL_PERFORMANCE = 6;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PERFORMANCE__VERSION_ID = EXECUTION_DATA__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PERFORMANCE__METADATA = EXECUTION_DATA__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PERFORMANCE__NAME = EXECUTION_DATA__NAME;

	/**
	 * The number of structural features of the '<em>Model Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PERFORMANCE_FEATURE_COUNT = EXECUTION_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PERFORMANCE_OPERATION_COUNT = EXECUTION_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.ExperimentStoreImpl <em>Experiment Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.ExperimentStoreImpl
	 * @see emmm.impl.EmmmPackageImpl#getExperimentStore()
	 * @generated
	 */
	int EXPERIMENT_STORE = 7;

	/**
	 * The feature id for the '<em><b>Experiment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_STORE__EXPERIMENT = 0;

	/**
	 * The number of structural features of the '<em>Experiment Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_STORE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Experiment Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENT_STORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emmm.impl.DatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.DatasetImpl
	 * @see emmm.impl.EmmmPackageImpl#getDataset()
	 * @generated
	 */
	int DATASET = 14;

	/**
	 * The meta object id for the '{@link emmm.impl.TrainingSetImpl <em>Training Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.TrainingSetImpl
	 * @see emmm.impl.EmmmPackageImpl#getTrainingSet()
	 * @generated
	 */
	int TRAINING_SET = 9;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_SET__VERSION_ID = ASSET__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_SET__METADATA = ASSET__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_SET__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_SET__DATASET = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Training Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_SET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Training Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_SET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.EvalSetImpl <em>Eval Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.EvalSetImpl
	 * @see emmm.impl.EmmmPackageImpl#getEvalSet()
	 * @generated
	 */
	int EVAL_SET = 10;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_SET__VERSION_ID = ASSET__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_SET__METADATA = ASSET__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_SET__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Dataset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_SET__DATASET = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Eval Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_SET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Eval Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_SET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.GenericFileImpl <em>Generic File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.GenericFileImpl
	 * @see emmm.impl.EmmmPackageImpl#getGenericFile()
	 * @generated
	 */
	int GENERIC_FILE = 11;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_FILE__VERSION_ID = ASSET__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_FILE__METADATA = ASSET__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_FILE__NAME = ASSET__NAME;

	/**
	 * The number of structural features of the '<em>Generic File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_FILE_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_FILE_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.ExecutionInfoImpl <em>Execution Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.ExecutionInfoImpl
	 * @see emmm.impl.EmmmPackageImpl#getExecutionInfo()
	 * @generated
	 */
	int EXECUTION_INFO = 12;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_INFO__VERSION_ID = EXECUTION_DATA__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_INFO__METADATA = EXECUTION_DATA__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_INFO__NAME = EXECUTION_DATA__NAME;

	/**
	 * The number of structural features of the '<em>Execution Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_INFO_FEATURE_COUNT = EXECUTION_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_INFO_OPERATION_COUNT = EXECUTION_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.DataOrientedImpl <em>Data Oriented</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.DataOrientedImpl
	 * @see emmm.impl.EmmmPackageImpl#getDataOriented()
	 * @generated
	 */
	int DATA_ORIENTED = 13;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ORIENTED__VERSION_ID = IMPLEMENTATION__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ORIENTED__METADATA = IMPLEMENTATION__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ORIENTED__NAME = IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Source File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ORIENTED__SOURCE_FILE = IMPLEMENTATION__SOURCE_FILE;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ORIENTED__DEPENDENCY = IMPLEMENTATION__DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ORIENTED__INPUTS = IMPLEMENTATION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ORIENTED__OUTPUTS = IMPLEMENTATION__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ORIENTED__INPUT_DATA = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ORIENTED__OUTPUT_DATA = IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Oriented</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ORIENTED_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Oriented</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ORIENTED_OPERATION_COUNT = IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__VERSION_ID = ASSET__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__METADATA = ASSET__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Datafeature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET__DATAFEATURE = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.DataFeatureImpl <em>Data Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.DataFeatureImpl
	 * @see emmm.impl.EmmmPackageImpl#getDataFeature()
	 * @generated
	 */
	int DATA_FEATURE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE__DTYPE = 1;

	/**
	 * The number of structural features of the '<em>Data Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emmm.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.ModelImpl
	 * @see emmm.impl.EmmmPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 16;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__VERSION_ID = ASSET__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__METADATA = ASSET__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Datafeature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DATAFEATURE = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.DependencyImpl
	 * @see emmm.impl.EmmmPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 17;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__VERSION_ID = ASSET__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__METADATA = ASSET__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = ASSET__NAME;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.MetadataImpl
	 * @see emmm.impl.EmmmPackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 19;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emmm.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.PipelineImpl
	 * @see emmm.impl.EmmmPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 20;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__VERSION_ID = ASSET__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__METADATA = ASSET__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ENTRY_POINT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pipeline Stage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PIPELINE_STAGE = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.ArbitraryFileImpl <em>Arbitrary File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.ArbitraryFileImpl
	 * @see emmm.impl.EmmmPackageImpl#getArbitraryFile()
	 * @generated
	 */
	int ARBITRARY_FILE = 21;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_FILE__VERSION_ID = GENERIC_FILE__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_FILE__METADATA = GENERIC_FILE__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_FILE__NAME = GENERIC_FILE__NAME;

	/**
	 * The number of structural features of the '<em>Arbitrary File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_FILE_FEATURE_COUNT = GENERIC_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arbitrary File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRARY_FILE_OPERATION_COUNT = GENERIC_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.impl.GenericImplImpl <em>Generic Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.impl.GenericImplImpl
	 * @see emmm.impl.EmmmPackageImpl#getGenericImpl()
	 * @generated
	 */
	int GENERIC_IMPL = 22;

	/**
	 * The feature id for the '<em><b>Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IMPL__VERSION_ID = IMPLEMENTATION__VERSION_ID;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IMPL__METADATA = IMPLEMENTATION__METADATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IMPL__NAME = IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Source File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IMPL__SOURCE_FILE = IMPLEMENTATION__SOURCE_FILE;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IMPL__DEPENDENCY = IMPLEMENTATION__DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IMPL__INPUTS = IMPLEMENTATION__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IMPL__OUTPUTS = IMPLEMENTATION__OUTPUTS;

	/**
	 * The number of structural features of the '<em>Generic Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IMPL_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_IMPL_OPERATION_COUNT = IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link emmm.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emmm.DataType
	 * @see emmm.impl.EmmmPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 23;


	/**
	 * Returns the meta object for class '{@link emmm.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run</em>'.
	 * @see emmm.Run
	 * @generated
	 */
	EClass getRun();

	/**
	 * Returns the meta object for the containment reference list '{@link emmm.Run#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asset</em>'.
	 * @see emmm.Run#getAsset()
	 * @see #getRun()
	 * @generated
	 */
	EReference getRun_Asset();

	/**
	 * Returns the meta object for the attribute '{@link emmm.Run#getVersionID <em>Version ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version ID</em>'.
	 * @see emmm.Run#getVersionID()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_VersionID();

	/**
	 * Returns the meta object for the containment reference list '{@link emmm.Run#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see emmm.Run#getMetadata()
	 * @see #getRun()
	 * @generated
	 */
	EReference getRun_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link emmm.Run#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emmm.Run#getName()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Name();

	/**
	 * Returns the meta object for class '{@link emmm.ModelTrain <em>Model Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Train</em>'.
	 * @see emmm.ModelTrain
	 * @generated
	 */
	EClass getModelTrain();

	/**
	 * Returns the meta object for the reference list '{@link emmm.ModelTrain#getTrainingset <em>Trainingset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trainingset</em>'.
	 * @see emmm.ModelTrain#getTrainingset()
	 * @see #getModelTrain()
	 * @generated
	 */
	EReference getModelTrain_Trainingset();

	/**
	 * Returns the meta object for the reference list '{@link emmm.ModelTrain#getInputFeature <em>Input Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Feature</em>'.
	 * @see emmm.ModelTrain#getInputFeature()
	 * @see #getModelTrain()
	 * @generated
	 */
	EReference getModelTrain_InputFeature();

	/**
	 * Returns the meta object for the reference list '{@link emmm.ModelTrain#getOutputModel <em>Output Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Model</em>'.
	 * @see emmm.ModelTrain#getOutputModel()
	 * @see #getModelTrain()
	 * @generated
	 */
	EReference getModelTrain_OutputModel();

	/**
	 * Returns the meta object for class '{@link emmm.Experiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment</em>'.
	 * @see emmm.Experiment
	 * @generated
	 */
	EClass getExperiment();

	/**
	 * Returns the meta object for the containment reference list '{@link emmm.Experiment#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Run</em>'.
	 * @see emmm.Experiment#getRun()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_Run();

	/**
	 * Returns the meta object for the attribute '{@link emmm.Experiment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emmm.Experiment#getName()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_Name();

	/**
	 * Returns the meta object for the attribute '{@link emmm.Experiment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see emmm.Experiment#getDescription()
	 * @see #getExperiment()
	 * @generated
	 */
	EAttribute getExperiment_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link emmm.Experiment#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see emmm.Experiment#getMetadata()
	 * @see #getExperiment()
	 * @generated
	 */
	EReference getExperiment_Metadata();

	/**
	 * Returns the meta object for class '{@link emmm.ExecutionData <em>Execution Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Data</em>'.
	 * @see emmm.ExecutionData
	 * @generated
	 */
	EClass getExecutionData();

	/**
	 * Returns the meta object for class '{@link emmm.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see emmm.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link emmm.ModelEval <em>Model Eval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Eval</em>'.
	 * @see emmm.ModelEval
	 * @generated
	 */
	EClass getModelEval();

	/**
	 * Returns the meta object for the reference list '{@link emmm.ModelEval#getEvalset <em>Evalset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evalset</em>'.
	 * @see emmm.ModelEval#getEvalset()
	 * @see #getModelEval()
	 * @generated
	 */
	EReference getModelEval_Evalset();

	/**
	 * Returns the meta object for the reference list '{@link emmm.ModelEval#getInputModel <em>Input Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Model</em>'.
	 * @see emmm.ModelEval#getInputModel()
	 * @see #getModelEval()
	 * @generated
	 */
	EReference getModelEval_InputModel();

	/**
	 * Returns the meta object for class '{@link emmm.ModelPerformance <em>Model Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Performance</em>'.
	 * @see emmm.ModelPerformance
	 * @generated
	 */
	EClass getModelPerformance();

	/**
	 * Returns the meta object for class '{@link emmm.ExperimentStore <em>Experiment Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experiment Store</em>'.
	 * @see emmm.ExperimentStore
	 * @generated
	 */
	EClass getExperimentStore();

	/**
	 * Returns the meta object for the containment reference list '{@link emmm.ExperimentStore#getExperiment <em>Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Experiment</em>'.
	 * @see emmm.ExperimentStore#getExperiment()
	 * @see #getExperimentStore()
	 * @generated
	 */
	EReference getExperimentStore_Experiment();

	/**
	 * Returns the meta object for class '{@link emmm.Implementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation</em>'.
	 * @see emmm.Implementation
	 * @generated
	 */
	EClass getImplementation();

	/**
	 * Returns the meta object for the attribute '{@link emmm.Implementation#getSourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source File</em>'.
	 * @see emmm.Implementation#getSourceFile()
	 * @see #getImplementation()
	 * @generated
	 */
	EAttribute getImplementation_SourceFile();

	/**
	 * Returns the meta object for the reference list '{@link emmm.Implementation#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependency</em>'.
	 * @see emmm.Implementation#getDependency()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Dependency();

	/**
	 * Returns the meta object for the reference list '{@link emmm.Implementation#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see emmm.Implementation#getInputs()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link emmm.Implementation#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see emmm.Implementation#getOutputs()
	 * @see #getImplementation()
	 * @generated
	 */
	EReference getImplementation_Outputs();

	/**
	 * Returns the meta object for class '{@link emmm.TrainingSet <em>Training Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training Set</em>'.
	 * @see emmm.TrainingSet
	 * @generated
	 */
	EClass getTrainingSet();

	/**
	 * Returns the meta object for the reference '{@link emmm.TrainingSet#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataset</em>'.
	 * @see emmm.TrainingSet#getDataset()
	 * @see #getTrainingSet()
	 * @generated
	 */
	EReference getTrainingSet_Dataset();

	/**
	 * Returns the meta object for class '{@link emmm.EvalSet <em>Eval Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eval Set</em>'.
	 * @see emmm.EvalSet
	 * @generated
	 */
	EClass getEvalSet();

	/**
	 * Returns the meta object for the reference '{@link emmm.EvalSet#getDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataset</em>'.
	 * @see emmm.EvalSet#getDataset()
	 * @see #getEvalSet()
	 * @generated
	 */
	EReference getEvalSet_Dataset();

	/**
	 * Returns the meta object for class '{@link emmm.GenericFile <em>Generic File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic File</em>'.
	 * @see emmm.GenericFile
	 * @generated
	 */
	EClass getGenericFile();

	/**
	 * Returns the meta object for class '{@link emmm.ExecutionInfo <em>Execution Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Info</em>'.
	 * @see emmm.ExecutionInfo
	 * @generated
	 */
	EClass getExecutionInfo();

	/**
	 * Returns the meta object for class '{@link emmm.DataOriented <em>Data Oriented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Oriented</em>'.
	 * @see emmm.DataOriented
	 * @generated
	 */
	EClass getDataOriented();

	/**
	 * Returns the meta object for the reference list '{@link emmm.DataOriented#getInputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Data</em>'.
	 * @see emmm.DataOriented#getInputData()
	 * @see #getDataOriented()
	 * @generated
	 */
	EReference getDataOriented_InputData();

	/**
	 * Returns the meta object for the reference list '{@link emmm.DataOriented#getOutputData <em>Output Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Data</em>'.
	 * @see emmm.DataOriented#getOutputData()
	 * @see #getDataOriented()
	 * @generated
	 */
	EReference getDataOriented_OutputData();

	/**
	 * Returns the meta object for class '{@link emmm.Dataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see emmm.Dataset
	 * @generated
	 */
	EClass getDataset();

	/**
	 * Returns the meta object for the containment reference list '{@link emmm.Dataset#getDatafeature <em>Datafeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datafeature</em>'.
	 * @see emmm.Dataset#getDatafeature()
	 * @see #getDataset()
	 * @generated
	 */
	EReference getDataset_Datafeature();

	/**
	 * Returns the meta object for class '{@link emmm.DataFeature <em>Data Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Feature</em>'.
	 * @see emmm.DataFeature
	 * @generated
	 */
	EClass getDataFeature();

	/**
	 * Returns the meta object for the attribute '{@link emmm.DataFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emmm.DataFeature#getName()
	 * @see #getDataFeature()
	 * @generated
	 */
	EAttribute getDataFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link emmm.DataFeature#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtype</em>'.
	 * @see emmm.DataFeature#getDtype()
	 * @see #getDataFeature()
	 * @generated
	 */
	EAttribute getDataFeature_Dtype();

	/**
	 * Returns the meta object for class '{@link emmm.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see emmm.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the reference list '{@link emmm.Model#getDatafeature <em>Datafeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datafeature</em>'.
	 * @see emmm.Model#getDatafeature()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Datafeature();

	/**
	 * Returns the meta object for class '{@link emmm.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see emmm.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for class '{@link emmm.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see emmm.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link emmm.Asset#getVersionID <em>Version ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version ID</em>'.
	 * @see emmm.Asset#getVersionID()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_VersionID();

	/**
	 * Returns the meta object for the containment reference list '{@link emmm.Asset#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see emmm.Asset#getMetadata()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link emmm.Asset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emmm.Asset#getName()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Name();

	/**
	 * Returns the meta object for class '{@link emmm.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see emmm.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute '{@link emmm.Metadata#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see emmm.Metadata#getKey()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Key();

	/**
	 * Returns the meta object for the attribute '{@link emmm.Metadata#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see emmm.Metadata#getValue()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Value();

	/**
	 * Returns the meta object for class '{@link emmm.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see emmm.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the attribute '{@link emmm.Pipeline#getEntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Point</em>'.
	 * @see emmm.Pipeline#getEntryPoint()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_EntryPoint();

	/**
	 * Returns the meta object for the reference list '{@link emmm.Pipeline#getPipelineStage <em>Pipeline Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pipeline Stage</em>'.
	 * @see emmm.Pipeline#getPipelineStage()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_PipelineStage();

	/**
	 * Returns the meta object for class '{@link emmm.ArbitraryFile <em>Arbitrary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrary File</em>'.
	 * @see emmm.ArbitraryFile
	 * @generated
	 */
	EClass getArbitraryFile();

	/**
	 * Returns the meta object for class '{@link emmm.GenericImpl <em>Generic Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Impl</em>'.
	 * @see emmm.GenericImpl
	 * @generated
	 */
	EClass getGenericImpl();

	/**
	 * Returns the meta object for enum '{@link emmm.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see emmm.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmmmFactory getEmmmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link emmm.impl.RunImpl <em>Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.RunImpl
		 * @see emmm.impl.EmmmPackageImpl#getRun()
		 * @generated
		 */
		EClass RUN = eINSTANCE.getRun();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN__ASSET = eINSTANCE.getRun_Asset();

		/**
		 * The meta object literal for the '<em><b>Version ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__VERSION_ID = eINSTANCE.getRun_VersionID();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN__METADATA = eINSTANCE.getRun_Metadata();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__NAME = eINSTANCE.getRun_Name();

		/**
		 * The meta object literal for the '{@link emmm.impl.ModelTrainImpl <em>Model Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.ModelTrainImpl
		 * @see emmm.impl.EmmmPackageImpl#getModelTrain()
		 * @generated
		 */
		EClass MODEL_TRAIN = eINSTANCE.getModelTrain();

		/**
		 * The meta object literal for the '<em><b>Trainingset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TRAIN__TRAININGSET = eINSTANCE.getModelTrain_Trainingset();

		/**
		 * The meta object literal for the '<em><b>Input Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TRAIN__INPUT_FEATURE = eINSTANCE.getModelTrain_InputFeature();

		/**
		 * The meta object literal for the '<em><b>Output Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TRAIN__OUTPUT_MODEL = eINSTANCE.getModelTrain_OutputModel();

		/**
		 * The meta object literal for the '{@link emmm.impl.ExperimentImpl <em>Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.ExperimentImpl
		 * @see emmm.impl.EmmmPackageImpl#getExperiment()
		 * @generated
		 */
		EClass EXPERIMENT = eINSTANCE.getExperiment();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__RUN = eINSTANCE.getExperiment_Run();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__NAME = eINSTANCE.getExperiment_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPERIMENT__DESCRIPTION = eINSTANCE.getExperiment_Description();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT__METADATA = eINSTANCE.getExperiment_Metadata();

		/**
		 * The meta object literal for the '{@link emmm.impl.ExecutionDataImpl <em>Execution Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.ExecutionDataImpl
		 * @see emmm.impl.EmmmPackageImpl#getExecutionData()
		 * @generated
		 */
		EClass EXECUTION_DATA = eINSTANCE.getExecutionData();

		/**
		 * The meta object literal for the '{@link emmm.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.ParameterImpl
		 * @see emmm.impl.EmmmPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link emmm.impl.ModelEvalImpl <em>Model Eval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.ModelEvalImpl
		 * @see emmm.impl.EmmmPackageImpl#getModelEval()
		 * @generated
		 */
		EClass MODEL_EVAL = eINSTANCE.getModelEval();

		/**
		 * The meta object literal for the '<em><b>Evalset</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_EVAL__EVALSET = eINSTANCE.getModelEval_Evalset();

		/**
		 * The meta object literal for the '<em><b>Input Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_EVAL__INPUT_MODEL = eINSTANCE.getModelEval_InputModel();

		/**
		 * The meta object literal for the '{@link emmm.impl.ModelPerformanceImpl <em>Model Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.ModelPerformanceImpl
		 * @see emmm.impl.EmmmPackageImpl#getModelPerformance()
		 * @generated
		 */
		EClass MODEL_PERFORMANCE = eINSTANCE.getModelPerformance();

		/**
		 * The meta object literal for the '{@link emmm.impl.ExperimentStoreImpl <em>Experiment Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.ExperimentStoreImpl
		 * @see emmm.impl.EmmmPackageImpl#getExperimentStore()
		 * @generated
		 */
		EClass EXPERIMENT_STORE = eINSTANCE.getExperimentStore();

		/**
		 * The meta object literal for the '<em><b>Experiment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPERIMENT_STORE__EXPERIMENT = eINSTANCE.getExperimentStore_Experiment();

		/**
		 * The meta object literal for the '{@link emmm.impl.ImplementationImpl <em>Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.ImplementationImpl
		 * @see emmm.impl.EmmmPackageImpl#getImplementation()
		 * @generated
		 */
		EClass IMPLEMENTATION = eINSTANCE.getImplementation();

		/**
		 * The meta object literal for the '<em><b>Source File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTATION__SOURCE_FILE = eINSTANCE.getImplementation_SourceFile();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__DEPENDENCY = eINSTANCE.getImplementation_Dependency();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__INPUTS = eINSTANCE.getImplementation_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTATION__OUTPUTS = eINSTANCE.getImplementation_Outputs();

		/**
		 * The meta object literal for the '{@link emmm.impl.TrainingSetImpl <em>Training Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.TrainingSetImpl
		 * @see emmm.impl.EmmmPackageImpl#getTrainingSet()
		 * @generated
		 */
		EClass TRAINING_SET = eINSTANCE.getTrainingSet();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINING_SET__DATASET = eINSTANCE.getTrainingSet_Dataset();

		/**
		 * The meta object literal for the '{@link emmm.impl.EvalSetImpl <em>Eval Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.EvalSetImpl
		 * @see emmm.impl.EmmmPackageImpl#getEvalSet()
		 * @generated
		 */
		EClass EVAL_SET = eINSTANCE.getEvalSet();

		/**
		 * The meta object literal for the '<em><b>Dataset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVAL_SET__DATASET = eINSTANCE.getEvalSet_Dataset();

		/**
		 * The meta object literal for the '{@link emmm.impl.GenericFileImpl <em>Generic File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.GenericFileImpl
		 * @see emmm.impl.EmmmPackageImpl#getGenericFile()
		 * @generated
		 */
		EClass GENERIC_FILE = eINSTANCE.getGenericFile();

		/**
		 * The meta object literal for the '{@link emmm.impl.ExecutionInfoImpl <em>Execution Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.ExecutionInfoImpl
		 * @see emmm.impl.EmmmPackageImpl#getExecutionInfo()
		 * @generated
		 */
		EClass EXECUTION_INFO = eINSTANCE.getExecutionInfo();

		/**
		 * The meta object literal for the '{@link emmm.impl.DataOrientedImpl <em>Data Oriented</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.DataOrientedImpl
		 * @see emmm.impl.EmmmPackageImpl#getDataOriented()
		 * @generated
		 */
		EClass DATA_ORIENTED = eINSTANCE.getDataOriented();

		/**
		 * The meta object literal for the '<em><b>Input Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ORIENTED__INPUT_DATA = eINSTANCE.getDataOriented_InputData();

		/**
		 * The meta object literal for the '<em><b>Output Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ORIENTED__OUTPUT_DATA = eINSTANCE.getDataOriented_OutputData();

		/**
		 * The meta object literal for the '{@link emmm.impl.DatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.DatasetImpl
		 * @see emmm.impl.EmmmPackageImpl#getDataset()
		 * @generated
		 */
		EClass DATASET = eINSTANCE.getDataset();

		/**
		 * The meta object literal for the '<em><b>Datafeature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATASET__DATAFEATURE = eINSTANCE.getDataset_Datafeature();

		/**
		 * The meta object literal for the '{@link emmm.impl.DataFeatureImpl <em>Data Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.DataFeatureImpl
		 * @see emmm.impl.EmmmPackageImpl#getDataFeature()
		 * @generated
		 */
		EClass DATA_FEATURE = eINSTANCE.getDataFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FEATURE__NAME = eINSTANCE.getDataFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FEATURE__DTYPE = eINSTANCE.getDataFeature_Dtype();

		/**
		 * The meta object literal for the '{@link emmm.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.ModelImpl
		 * @see emmm.impl.EmmmPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Datafeature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DATAFEATURE = eINSTANCE.getModel_Datafeature();

		/**
		 * The meta object literal for the '{@link emmm.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.DependencyImpl
		 * @see emmm.impl.EmmmPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link emmm.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.AssetImpl
		 * @see emmm.impl.EmmmPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Version ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__VERSION_ID = eINSTANCE.getAsset_VersionID();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__METADATA = eINSTANCE.getAsset_Metadata();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

		/**
		 * The meta object literal for the '{@link emmm.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.MetadataImpl
		 * @see emmm.impl.EmmmPackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__KEY = eINSTANCE.getMetadata_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__VALUE = eINSTANCE.getMetadata_Value();

		/**
		 * The meta object literal for the '{@link emmm.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.PipelineImpl
		 * @see emmm.impl.EmmmPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Entry Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__ENTRY_POINT = eINSTANCE.getPipeline_EntryPoint();

		/**
		 * The meta object literal for the '<em><b>Pipeline Stage</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__PIPELINE_STAGE = eINSTANCE.getPipeline_PipelineStage();

		/**
		 * The meta object literal for the '{@link emmm.impl.ArbitraryFileImpl <em>Arbitrary File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.ArbitraryFileImpl
		 * @see emmm.impl.EmmmPackageImpl#getArbitraryFile()
		 * @generated
		 */
		EClass ARBITRARY_FILE = eINSTANCE.getArbitraryFile();

		/**
		 * The meta object literal for the '{@link emmm.impl.GenericImplImpl <em>Generic Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.impl.GenericImplImpl
		 * @see emmm.impl.EmmmPackageImpl#getGenericImpl()
		 * @generated
		 */
		EClass GENERIC_IMPL = eINSTANCE.getGenericImpl();

		/**
		 * The meta object literal for the '{@link emmm.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emmm.DataType
		 * @see emmm.impl.EmmmPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //EmmmPackage
