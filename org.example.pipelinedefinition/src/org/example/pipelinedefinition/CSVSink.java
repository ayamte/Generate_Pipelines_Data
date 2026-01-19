/**
 */
package org.example.pipelinedefinition;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSV Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Destination CSV (extension future)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.pipelinedefinition.CSVSink#getFilePath <em>File Path</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.CSVSink#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.CSVSink#isIncludeHeader <em>Include Header</em>}</li>
 * </ul>
 *
 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getCSVSink()
 * @model
 * @generated
 */
public interface CSVSink extends DataSink {
	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getCSVSink_FilePath()
	 * @model
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.CSVSink#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator</em>' attribute.
	 * @see #setSeparator(String)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getCSVSink_Separator()
	 * @model
	 * @generated
	 */
	String getSeparator();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.CSVSink#getSeparator <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' attribute.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(String value);

	/**
	 * Returns the value of the '<em><b>Include Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Header</em>' attribute.
	 * @see #setIncludeHeader(boolean)
	 * @see org.example.pipelinedefinition.PipelinedefinitionPackage#getCSVSink_IncludeHeader()
	 * @model
	 * @generated
	 */
	boolean isIncludeHeader();

	/**
	 * Sets the value of the '{@link org.example.pipelinedefinition.CSVSink#isIncludeHeader <em>Include Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Header</em>' attribute.
	 * @see #isIncludeHeader()
	 * @generated
	 */
	void setIncludeHeader(boolean value);

} // CSVSink
