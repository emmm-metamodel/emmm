/**
 */
package emmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emmm.AssetStore#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @see emmm.EmmmPackage#getAssetStore()
 * @model
 * @generated
 */
public interface AssetStore extends EObject {
	/**
	 * Returns the value of the '<em><b>Asset</b></em>' containment reference list.
	 * The list contents are of type {@link emmm.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' containment reference list.
	 * @see emmm.EmmmPackage#getAssetStore_Asset()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asset> getAsset();

} // AssetStore
