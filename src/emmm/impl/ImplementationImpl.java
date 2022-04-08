/**
 */
package emmm.impl;

import emmm.Asset;
import emmm.Dependency;
import emmm.EmmmPackage;
import emmm.Implementation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emmm.impl.ImplementationImpl#getSourceFile <em>Source File</em>}</li>
 *   <li>{@link emmm.impl.ImplementationImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link emmm.impl.ImplementationImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link emmm.impl.ImplementationImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ImplementationImpl extends AssetImpl implements Implementation {
	/**
	 * The default value of the '{@link #getSourceFile() <em>Source File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFile()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceFile() <em>Source File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFile()
	 * @generated
	 * @ordered
	 */
	protected String sourceFile = SOURCE_FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependency;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmmmPackage.Literals.IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceFile() {
		return sourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFile(String newSourceFile) {
		String oldSourceFile = sourceFile;
		sourceFile = newSourceFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmmmPackage.IMPLEMENTATION__SOURCE_FILE, oldSourceFile, sourceFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependency() {
		if (dependency == null) {
			dependency = new EObjectResolvingEList<Dependency>(Dependency.class, this, EmmmPackage.IMPLEMENTATION__DEPENDENCY);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<Asset>(Asset.class, this, EmmmPackage.IMPLEMENTATION__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectResolvingEList<Asset>(Asset.class, this, EmmmPackage.IMPLEMENTATION__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmmmPackage.IMPLEMENTATION__SOURCE_FILE:
				return getSourceFile();
			case EmmmPackage.IMPLEMENTATION__DEPENDENCY:
				return getDependency();
			case EmmmPackage.IMPLEMENTATION__INPUTS:
				return getInputs();
			case EmmmPackage.IMPLEMENTATION__OUTPUTS:
				return getOutputs();
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
			case EmmmPackage.IMPLEMENTATION__SOURCE_FILE:
				setSourceFile((String)newValue);
				return;
			case EmmmPackage.IMPLEMENTATION__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection<? extends Dependency>)newValue);
				return;
			case EmmmPackage.IMPLEMENTATION__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Asset>)newValue);
				return;
			case EmmmPackage.IMPLEMENTATION__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Asset>)newValue);
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
			case EmmmPackage.IMPLEMENTATION__SOURCE_FILE:
				setSourceFile(SOURCE_FILE_EDEFAULT);
				return;
			case EmmmPackage.IMPLEMENTATION__DEPENDENCY:
				getDependency().clear();
				return;
			case EmmmPackage.IMPLEMENTATION__INPUTS:
				getInputs().clear();
				return;
			case EmmmPackage.IMPLEMENTATION__OUTPUTS:
				getOutputs().clear();
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
			case EmmmPackage.IMPLEMENTATION__SOURCE_FILE:
				return SOURCE_FILE_EDEFAULT == null ? sourceFile != null : !SOURCE_FILE_EDEFAULT.equals(sourceFile);
			case EmmmPackage.IMPLEMENTATION__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
			case EmmmPackage.IMPLEMENTATION__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case EmmmPackage.IMPLEMENTATION__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
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
		result.append(" (sourceFile: ");
		result.append(sourceFile);
		result.append(')');
		return result.toString();
	}

} //ImplementationImpl
