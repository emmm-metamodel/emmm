/**
 */
package emmm;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Oriented</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emmm.DataOriented#getInputData <em>Input Data</em>}</li>
 *   <li>{@link emmm.DataOriented#getOutputData <em>Output Data</em>}</li>
 * </ul>
 *
 * @see emmm.EmmmPackage#getDataOriented()
 * @model
 * @generated
 */
public interface DataOriented extends Implementation {
	/**
	 * Returns the value of the '<em><b>Input Data</b></em>' reference list.
	 * The list contents are of type {@link emmm.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data</em>' reference list.
	 * @see emmm.EmmmPackage#getDataOriented_InputData()
	 * @model
	 * @generated
	 */
	EList<Dataset> getInputData();

	/**
	 * Returns the value of the '<em><b>Output Data</b></em>' reference list.
	 * The list contents are of type {@link emmm.Dataset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Data</em>' reference list.
	 * @see emmm.EmmmPackage#getDataOriented_OutputData()
	 * @model
	 * @generated
	 */
	EList<Dataset> getOutputData();

} // DataOriented
