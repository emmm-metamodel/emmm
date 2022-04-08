/**
 */
package emmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Eval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emmm.ModelEval#getEvalset <em>Evalset</em>}</li>
 *   <li>{@link emmm.ModelEval#getInputModel <em>Input Model</em>}</li>
 * </ul>
 *
 * @see emmm.EmmmPackage#getModelEval()
 * @model
 * @generated
 */
public interface ModelEval extends Implementation {
	/**
	 * Returns the value of the '<em><b>Evalset</b></em>' reference list.
	 * The list contents are of type {@link emmm.EvalSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evalset</em>' reference list.
	 * @see emmm.EmmmPackage#getModelEval_Evalset()
	 * @model
	 * @generated
	 */
	EList<EvalSet> getEvalset();

	/**
	 * Returns the value of the '<em><b>Input Model</b></em>' reference list.
	 * The list contents are of type {@link emmm.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Model</em>' reference list.
	 * @see emmm.EmmmPackage#getModelEval_InputModel()
	 * @model
	 * @generated
	 */
	EList<Model> getInputModel();

} // ModelEval
