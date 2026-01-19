/**
 */
package org.example.pipelinedefinition.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.pipelinedefinition.DataSink;
import org.example.pipelinedefinition.PipelinedefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DataSinkImpl extends MinimalEObjectImpl.Container implements DataSink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinedefinitionPackage.Literals.DATA_SINK;
	}

} //DataSinkImpl
