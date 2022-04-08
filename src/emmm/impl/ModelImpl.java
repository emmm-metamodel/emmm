/**
 */
package emmm.impl;

import emmm.DataFeature;
import emmm.EmmmPackage;
import emmm.Model;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emmm.impl.ModelImpl#getDatafeature <em>Datafeature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends AssetImpl implements Model {
	/**
	 * The cached value of the '{@link #getDatafeature() <em>Datafeature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatafeature()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFeature> datafeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmmmPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFeature> getDatafeature() {
		if (datafeature == null) {
			datafeature = new EObjectResolvingEList<DataFeature>(DataFeature.class, this, EmmmPackage.MODEL__DATAFEATURE);
		}
		return datafeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmmmPackage.MODEL__DATAFEATURE:
				return getDatafeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmmmPackage.MODEL__DATAFEATURE:
				getDatafeature().clear();
				getDatafeature().addAll((Collection<? extends DataFeature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmmmPackage.MODEL__DATAFEATURE:
				getDatafeature().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmmmPackage.MODEL__DATAFEATURE:
				return datafeature != null && !datafeature.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
