/**
 */
package emmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emmm.Model#getDatafeature <em>Datafeature</em>}</li>
 * </ul>
 *
 * @see emmm.EmmmPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends Asset {
	/**
	 * Returns the value of the '<em><b>Datafeature</b></em>' reference list.
	 * The list contents are of type {@link emmm.DataFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datafeature</em>' reference list.
	 * @see emmm.EmmmPackage#getModel_Datafeature()
	 * @model
	 * @generated
	 */
	EList<DataFeature> getDatafeature();

} // Model
