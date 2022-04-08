/**
 */
package emmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emmm.Dataset#getDatafeature <em>Datafeature</em>}</li>
 * </ul>
 *
 * @see emmm.EmmmPackage#getDataset()
 * @model
 * @generated
 */
public interface Dataset extends Asset {
	/**
	 * Returns the value of the '<em><b>Datafeature</b></em>' containment reference list.
	 * The list contents are of type {@link emmm.DataFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datafeature</em>' containment reference list.
	 * @see emmm.EmmmPackage#getDataset_Datafeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataFeature> getDatafeature();

} // Dataset
