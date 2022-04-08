/**
 */
package emmm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Training Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emmm.TrainingSet#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @see emmm.EmmmPackage#getTrainingSet()
 * @model
 * @generated
 */
public interface TrainingSet extends Asset {

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' reference.
	 * @see #setDataset(Dataset)
	 * @see emmm.EmmmPackage#getTrainingSet_Dataset()
	 * @model
	 * @generated
	 */
	Dataset getDataset();

	/**
	 * Sets the value of the '{@link emmm.TrainingSet#getDataset <em>Dataset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset</em>' reference.
	 * @see #getDataset()
	 * @generated
	 */
	void setDataset(Dataset value);
} // TrainingSet
