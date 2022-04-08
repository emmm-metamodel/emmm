/**
 */
package emmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emmm.DataFeature#getName <em>Name</em>}</li>
 *   <li>{@link emmm.DataFeature#getDtype <em>Dtype</em>}</li>
 * </ul>
 *
 * @see emmm.EmmmPackage#getDataFeature()
 * @model
 * @generated
 */
public interface DataFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see emmm.EmmmPackage#getDataFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link emmm.DataFeature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dtype</b></em>' attribute.
	 * The literals are from the enumeration {@link emmm.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtype</em>' attribute.
	 * @see emmm.DataType
	 * @see #setDtype(DataType)
	 * @see emmm.EmmmPackage#getDataFeature_Dtype()
	 * @model
	 * @generated
	 */
	DataType getDtype();

	/**
	 * Sets the value of the '{@link emmm.DataFeature#getDtype <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtype</em>' attribute.
	 * @see emmm.DataType
	 * @see #getDtype()
	 * @generated
	 */
	void setDtype(DataType value);

} // DataFeature
