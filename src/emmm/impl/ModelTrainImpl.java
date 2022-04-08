/**
 */
package emmm.impl;

import emmm.DataFeature;
import emmm.EmmmPackage;
import emmm.Model;
import emmm.ModelTrain;
import emmm.TrainingSet;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Train</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link emmm.impl.ModelTrainImpl#getTrainingset <em>Trainingset</em>}</li>
 *   <li>{@link emmm.impl.ModelTrainImpl#getInputFeature <em>Input Feature</em>}</li>
 *   <li>{@link emmm.impl.ModelTrainImpl#getOutputModel <em>Output Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelTrainImpl extends ImplementationImpl implements ModelTrain {
	/**
	 * The cached value of the '{@link #getTrainingset() <em>Trainingset</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingset()
	 * @generated
	 * @ordered
	 */
	protected EList<TrainingSet> trainingset;

	/**
	 * The cached value of the '{@link #getInputFeature() <em>Input Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFeature> inputFeature;

	/**
	 * The cached value of the '{@link #getOutputModel() <em>Output Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputModel()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> outputModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmmmPackage.Literals.MODEL_TRAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrainingSet> getTrainingset() {
		if (trainingset == null) {
			trainingset = new EObjectResolvingEList<TrainingSet>(TrainingSet.class, this, EmmmPackage.MODEL_TRAIN__TRAININGSET);
		}
		return trainingset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFeature> getInputFeature() {
		if (inputFeature == null) {
			inputFeature = new EObjectResolvingEList<DataFeature>(DataFeature.class, this, EmmmPackage.MODEL_TRAIN__INPUT_FEATURE);
		}
		return inputFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getOutputModel() {
		if (outputModel == null) {
			outputModel = new EObjectResolvingEList<Model>(Model.class, this, EmmmPackage.MODEL_TRAIN__OUTPUT_MODEL);
		}
		return outputModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmmmPackage.MODEL_TRAIN__TRAININGSET:
				return getTrainingset();
			case EmmmPackage.MODEL_TRAIN__INPUT_FEATURE:
				return getInputFeature();
			case EmmmPackage.MODEL_TRAIN__OUTPUT_MODEL:
				return getOutputModel();
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
			case EmmmPackage.MODEL_TRAIN__TRAININGSET:
				getTrainingset().clear();
				getTrainingset().addAll((Collection<? extends TrainingSet>)newValue);
				return;
			case EmmmPackage.MODEL_TRAIN__INPUT_FEATURE:
				getInputFeature().clear();
				getInputFeature().addAll((Collection<? extends DataFeature>)newValue);
				return;
			case EmmmPackage.MODEL_TRAIN__OUTPUT_MODEL:
				getOutputModel().clear();
				getOutputModel().addAll((Collection<? extends Model>)newValue);
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
			case EmmmPackage.MODEL_TRAIN__TRAININGSET:
				getTrainingset().clear();
				return;
			case EmmmPackage.MODEL_TRAIN__INPUT_FEATURE:
				getInputFeature().clear();
				return;
			case EmmmPackage.MODEL_TRAIN__OUTPUT_MODEL:
				getOutputModel().clear();
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
			case EmmmPackage.MODEL_TRAIN__TRAININGSET:
				return trainingset != null && !trainingset.isEmpty();
			case EmmmPackage.MODEL_TRAIN__INPUT_FEATURE:
				return inputFeature != null && !inputFeature.isEmpty();
			case EmmmPackage.MODEL_TRAIN__OUTPUT_MODEL:
				return outputModel != null && !outputModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelTrainImpl
