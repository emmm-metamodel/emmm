/**
 */
package emmm.impl;

import emmm.DataOriented;
import emmm.Dataset;
import emmm.EmmmPackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Oriented</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emmm.impl.DataOrientedImpl#getInputData <em>Input Data</em>}</li>
 *   <li>{@link emmm.impl.DataOrientedImpl#getOutputData <em>Output Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataOrientedImpl extends ImplementationImpl implements DataOriented {
	/**
	 * The cached value of the '{@link #getInputData() <em>Input Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputData()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataset> inputData;

	/**
	 * The cached value of the '{@link #getOutputData() <em>Output Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputData()
	 * @generated
	 * @ordered
	 */
	protected EList<Dataset> outputData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataOrientedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmmmPackage.Literals.DATA_ORIENTED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dataset> getInputData() {
		if (inputData == null) {
			inputData = new EObjectResolvingEList<Dataset>(Dataset.class, this, EmmmPackage.DATA_ORIENTED__INPUT_DATA);
		}
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dataset> getOutputData() {
		if (outputData == null) {
			outputData = new EObjectResolvingEList<Dataset>(Dataset.class, this, EmmmPackage.DATA_ORIENTED__OUTPUT_DATA);
		}
		return outputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmmmPackage.DATA_ORIENTED__INPUT_DATA:
				return getInputData();
			case EmmmPackage.DATA_ORIENTED__OUTPUT_DATA:
				return getOutputData();
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
			case EmmmPackage.DATA_ORIENTED__INPUT_DATA:
				getInputData().clear();
				getInputData().addAll((Collection<? extends Dataset>)newValue);
				return;
			case EmmmPackage.DATA_ORIENTED__OUTPUT_DATA:
				getOutputData().clear();
				getOutputData().addAll((Collection<? extends Dataset>)newValue);
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
			case EmmmPackage.DATA_ORIENTED__INPUT_DATA:
				getInputData().clear();
				return;
			case EmmmPackage.DATA_ORIENTED__OUTPUT_DATA:
				getOutputData().clear();
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
			case EmmmPackage.DATA_ORIENTED__INPUT_DATA:
				return inputData != null && !inputData.isEmpty();
			case EmmmPackage.DATA_ORIENTED__OUTPUT_DATA:
				return outputData != null && !outputData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataOrientedImpl
