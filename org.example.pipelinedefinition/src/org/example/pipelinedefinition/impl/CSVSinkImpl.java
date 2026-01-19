/**
 */
package org.example.pipelinedefinition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.pipelinedefinition.CSVSink;
import org.example.pipelinedefinition.PipelinedefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSV Sink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.pipelinedefinition.impl.CSVSinkImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.impl.CSVSinkImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.example.pipelinedefinition.impl.CSVSinkImpl#isIncludeHeader <em>Include Header</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSVSinkImpl extends DataSinkImpl implements CSVSink {
	/**
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected String filePath = FILE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected String separator = SEPARATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeHeader() <em>Include Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_HEADER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeHeader() <em>Include Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeHeader()
	 * @generated
	 * @ordered
	 */
	protected boolean includeHeader = INCLUDE_HEADER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSVSinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinedefinitionPackage.Literals.CSV_SINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilePath(String newFilePath) {
		String oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinedefinitionPackage.CSV_SINK__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeparator(String newSeparator) {
		String oldSeparator = separator;
		separator = newSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinedefinitionPackage.CSV_SINK__SEPARATOR, oldSeparator, separator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeHeader() {
		return includeHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeHeader(boolean newIncludeHeader) {
		boolean oldIncludeHeader = includeHeader;
		includeHeader = newIncludeHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipelinedefinitionPackage.CSV_SINK__INCLUDE_HEADER, oldIncludeHeader, includeHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinedefinitionPackage.CSV_SINK__FILE_PATH:
				return getFilePath();
			case PipelinedefinitionPackage.CSV_SINK__SEPARATOR:
				return getSeparator();
			case PipelinedefinitionPackage.CSV_SINK__INCLUDE_HEADER:
				return isIncludeHeader();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PipelinedefinitionPackage.CSV_SINK__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case PipelinedefinitionPackage.CSV_SINK__SEPARATOR:
				setSeparator((String)newValue);
				return;
			case PipelinedefinitionPackage.CSV_SINK__INCLUDE_HEADER:
				setIncludeHeader((Boolean)newValue);
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
			case PipelinedefinitionPackage.CSV_SINK__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case PipelinedefinitionPackage.CSV_SINK__SEPARATOR:
				setSeparator(SEPARATOR_EDEFAULT);
				return;
			case PipelinedefinitionPackage.CSV_SINK__INCLUDE_HEADER:
				setIncludeHeader(INCLUDE_HEADER_EDEFAULT);
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
			case PipelinedefinitionPackage.CSV_SINK__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
			case PipelinedefinitionPackage.CSV_SINK__SEPARATOR:
				return SEPARATOR_EDEFAULT == null ? separator != null : !SEPARATOR_EDEFAULT.equals(separator);
			case PipelinedefinitionPackage.CSV_SINK__INCLUDE_HEADER:
				return includeHeader != INCLUDE_HEADER_EDEFAULT;
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
		result.append(" (filePath: ");
		result.append(filePath);
		result.append(", separator: ");
		result.append(separator);
		result.append(", includeHeader: ");
		result.append(includeHeader);
		result.append(')');
		return result.toString();
	}

} //CSVSinkImpl
