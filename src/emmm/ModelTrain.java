/**
 */
package emmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emmm.ModelTrain#getTrainingset <em>Trainingset</em>}</li>
 *   <li>{@link emmm.ModelTrain#getInputFeature <em>Input Feature</em>}</li>
 *   <li>{@link emmm.ModelTrain#getOutputModel <em>Output Model</em>}</li>
 * </ul>
 *
 * @see emmm.EmmmPackage#getModelTrain()
 * @model
 * @generated
 */
public interface ModelTrain extends Implementation {
	/**
	 * Returns the value of the '<em><b>Trainingset</b></em>' reference list.
	 * The list contents are of type {@link emmm.TrainingSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trainingset</em>' reference list.
	 * @see emmm.EmmmPackage#getModelTrain_Trainingset()
	 * @model
	 * @generated
	 */
	EList<TrainingSet> getTrainingset();

	/**
	 * Returns the value of the '<em><b>Input Feature</b></em>' reference list.
	 * The list contents are of type {@link emmm.DataFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Feature</em>' reference list.
	 * @see emmm.EmmmPackage#getModelTrain_InputFeature()
	 * @model
	 * @generated
	 */
	EList<DataFeature> getInputFeature();

	/**
	 * Returns the value of the '<em><b>Output Model</b></em>' reference list.
	 * The list contents are of type {@link emmm.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Model</em>' reference list.
	 * @see emmm.EmmmPackage#getModelTrain_OutputModel()
	 * @model
	 * @generated
	 */
	EList<Model> getOutputModel();

} // ModelTrain
