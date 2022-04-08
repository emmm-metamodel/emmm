/**
 */
package emmm.impl;

import emmm.EmmmPackage;
import emmm.Implementation;
import emmm.Pipeline;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emmm.impl.PipelineImpl#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link emmm.impl.PipelineImpl#getPipelineStage <em>Pipeline Stage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends AssetImpl implements Pipeline {
	/**
	 * The default value of the '{@link #getEntryPoint() <em>Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryPoint() <em>Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected String entryPoint = ENTRY_POINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPipelineStage() <em>Pipeline Stage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipelineStage()
	 * @generated
	 * @ordered
	 */
	protected EList<Implementation> pipelineStage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmmmPackage.Literals.PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntryPoint() {
		return entryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPoint(String newEntryPoint) {
		String oldEntryPoint = entryPoint;
		entryPoint = newEntryPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmmmPackage.PIPELINE__ENTRY_POINT, oldEntryPoint, entryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Implementation> getPipelineStage() {
		if (pipelineStage == null) {
			pipelineStage = new EObjectResolvingEList<Implementation>(Implementation.class, this, EmmmPackage.PIPELINE__PIPELINE_STAGE);
		}
		return pipelineStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmmmPackage.PIPELINE__ENTRY_POINT:
				return getEntryPoint();
			case EmmmPackage.PIPELINE__PIPELINE_STAGE:
				return getPipelineStage();
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
			case EmmmPackage.PIPELINE__ENTRY_POINT:
				setEntryPoint((String)newValue);
				return;
			case EmmmPackage.PIPELINE__PIPELINE_STAGE:
				getPipelineStage().clear();
				getPipelineStage().addAll((Collection<? extends Implementation>)newValue);
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
			case EmmmPackage.PIPELINE__ENTRY_POINT:
				setEntryPoint(ENTRY_POINT_EDEFAULT);
				return;
			case EmmmPackage.PIPELINE__PIPELINE_STAGE:
				getPipelineStage().clear();
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
			case EmmmPackage.PIPELINE__ENTRY_POINT:
				return ENTRY_POINT_EDEFAULT == null ? entryPoint != null : !ENTRY_POINT_EDEFAULT.equals(entryPoint);
			case EmmmPackage.PIPELINE__PIPELINE_STAGE:
				return pipelineStage != null && !pipelineStage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (entryPoint: ");
		result.append(entryPoint);
		result.append(')');
		return result.toString();
	}

} //PipelineImpl
