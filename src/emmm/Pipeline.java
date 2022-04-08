/**
 */
package emmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emmm.Pipeline#getEntryPoint <em>Entry Point</em>}</li>
 *   <li>{@link emmm.Pipeline#getPipelineStage <em>Pipeline Stage</em>}</li>
 * </ul>
 *
 * @see emmm.EmmmPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends Asset {
	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' attribute.
	 * @see #setEntryPoint(String)
	 * @see emmm.EmmmPackage#getPipeline_EntryPoint()
	 * @model
	 * @generated
	 */
	String getEntryPoint();

	/**
	 * Sets the value of the '{@link emmm.Pipeline#getEntryPoint <em>Entry Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point</em>' attribute.
	 * @see #getEntryPoint()
	 * @generated
	 */
	void setEntryPoint(String value);

	/**
	 * Returns the value of the '<em><b>Pipeline Stage</b></em>' reference list.
	 * The list contents are of type {@link emmm.Implementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline Stage</em>' reference list.
	 * @see emmm.EmmmPackage#getPipeline_PipelineStage()
	 * @model
	 * @generated
	 */
	EList<Implementation> getPipelineStage();

} // Pipeline
