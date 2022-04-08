/**
 */
package emmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emmm.Implementation#getSourceFile <em>Source File</em>}</li>
 *   <li>{@link emmm.Implementation#getDependency <em>Dependency</em>}</li>
 *   <li>{@link emmm.Implementation#getInputs <em>Inputs</em>}</li>
 *   <li>{@link emmm.Implementation#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see emmm.EmmmPackage#getImplementation()
 * @model abstract="true"
 * @generated
 */
public interface Implementation extends Asset {
	/**
	 * Returns the value of the '<em><b>Source File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source File</em>' attribute.
	 * @see #setSourceFile(String)
	 * @see emmm.EmmmPackage#getImplementation_SourceFile()
	 * @model
	 * @generated
	 */
	String getSourceFile();

	/**
	 * Sets the value of the '{@link emmm.Implementation#getSourceFile <em>Source File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source File</em>' attribute.
	 * @see #getSourceFile()
	 * @generated
	 */
	void setSourceFile(String value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' reference list.
	 * The list contents are of type {@link emmm.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' reference list.
	 * @see emmm.EmmmPackage#getImplementation_Dependency()
	 * @model
	 * @generated
	 */
	EList<Dependency> getDependency();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link emmm.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see emmm.EmmmPackage#getImplementation_Inputs()
	 * @model
	 * @generated
	 */
	EList<Asset> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link emmm.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see emmm.EmmmPackage#getImplementation_Outputs()
	 * @model
	 * @generated
	 */
	EList<Asset> getOutputs();

} // Implementation
