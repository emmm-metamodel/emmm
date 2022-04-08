/**
 */
package emmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emmm.ExperimentStore#getExperiment <em>Experiment</em>}</li>
 * </ul>
 *
 * @see emmm.EmmmPackage#getExperimentStore()
 * @model
 * @generated
 */
public interface ExperimentStore extends EObject {
	/**
	 * Returns the value of the '<em><b>Experiment</b></em>' containment reference list.
	 * The list contents are of type {@link emmm.Experiment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment</em>' containment reference list.
	 * @see emmm.EmmmPackage#getExperimentStore_Experiment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Experiment> getExperiment();

} // ExperimentStore
