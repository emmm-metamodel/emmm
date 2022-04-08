/**
 */
package emmm.impl;

import emmm.EmmmPackage;
import emmm.EvalSet;
import emmm.Model;
import emmm.ModelEval;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Eval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emmm.impl.ModelEvalImpl#getEvalset <em>Evalset</em>}</li>
 *   <li>{@link emmm.impl.ModelEvalImpl#getInputModel <em>Input Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelEvalImpl extends ImplementationImpl implements ModelEval {
	/**
	 * The cached value of the '{@link #getEvalset() <em>Evalset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvalset()
	 * @generated
	 * @ordered
	 */
	protected EList<EvalSet> evalset;

	/**
	 * The cached value of the '{@link #getInputModel() <em>Input Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputModel()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> inputModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelEvalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmmmPackage.Literals.MODEL_EVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvalSet> getEvalset() {
		if (evalset == null) {
			evalset = new EObjectResolvingEList<EvalSet>(EvalSet.class, this, EmmmPackage.MODEL_EVAL__EVALSET);
		}
		return evalset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getInputModel() {
		if (inputModel == null) {
			inputModel = new EObjectResolvingEList<Model>(Model.class, this, EmmmPackage.MODEL_EVAL__INPUT_MODEL);
		}
		return inputModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmmmPackage.MODEL_EVAL__EVALSET:
				return getEvalset();
			case EmmmPackage.MODEL_EVAL__INPUT_MODEL:
				return getInputModel();
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
			case EmmmPackage.MODEL_EVAL__EVALSET:
				getEvalset().clear();
				getEvalset().addAll((Collection<? extends EvalSet>)newValue);
				return;
			case EmmmPackage.MODEL_EVAL__INPUT_MODEL:
				getInputModel().clear();
				getInputModel().addAll((Collection<? extends Model>)newValue);
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
			case EmmmPackage.MODEL_EVAL__EVALSET:
				getEvalset().clear();
				return;
			case EmmmPackage.MODEL_EVAL__INPUT_MODEL:
				getInputModel().clear();
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
			case EmmmPackage.MODEL_EVAL__EVALSET:
				return evalset != null && !evalset.isEmpty();
			case EmmmPackage.MODEL_EVAL__INPUT_MODEL:
				return inputModel != null && !inputModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelEvalImpl
