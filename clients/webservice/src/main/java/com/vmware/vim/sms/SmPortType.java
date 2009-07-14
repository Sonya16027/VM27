/**
 * SmPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public interface SmPortType extends java.rmi.Remote {
	public void destroyPropertyFilter(
			com.vmware.vim.sms.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.sms.RuntimeFault;

	public com.vmware.vim.sms.ManagedObjectReference createFilter(
			com.vmware.vim.sms.ManagedObjectReference _this,
			com.vmware.vim.sms.PropertyFilterSpec spec, boolean partialUpdates)
			throws java.rmi.RemoteException,
			com.vmware.vim.sms.InvalidProperty, com.vmware.vim.sms.RuntimeFault;

	public com.vmware.vim.sms.ObjectContent[] retrieveProperties(
			com.vmware.vim.sms.ManagedObjectReference _this,
			com.vmware.vim.sms.PropertyFilterSpec[] specSet)
			throws java.rmi.RemoteException,
			com.vmware.vim.sms.InvalidProperty, com.vmware.vim.sms.RuntimeFault;

	public com.vmware.vim.sms.UpdateSet checkForUpdates(
			com.vmware.vim.sms.ManagedObjectReference _this,
			java.lang.String version) throws java.rmi.RemoteException,
			com.vmware.vim.sms.InvalidCollectorVersion,
			com.vmware.vim.sms.RuntimeFault;

	public com.vmware.vim.sms.UpdateSet waitForUpdates(
			com.vmware.vim.sms.ManagedObjectReference _this,
			java.lang.String version) throws java.rmi.RemoteException,
			com.vmware.vim.sms.InvalidCollectorVersion,
			com.vmware.vim.sms.RuntimeFault;

	public void cancelWaitForUpdates(
			com.vmware.vim.sms.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.sms.RuntimeFault;

	public com.vmware.vim.sms.QueryResult queryList(
			com.vmware.vim.sms.ManagedObjectReference _this,
			com.vmware.vim.sms.EntityReference contextEntity,
			com.vmware.vim.sms.EntityReferenceEntityType queryEntityType,
			com.vmware.vim.sms.QuerySpec querySpec)
			throws java.rmi.RemoteException,
			com.vmware.vim.sms.AuthenticationFailed,
			com.vmware.vim.sms.ServiceNotInitialized,
			com.vmware.vim.sms.QueryExecutionFailed,
			com.vmware.vim.sms.EntityNotFound, com.vmware.vim.sms.RuntimeFault,
			com.vmware.vim.sms.InvalidArgument;

	public com.vmware.vim.sms.Map queryTopology(
			com.vmware.vim.sms.ManagedObjectReference _this,
			com.vmware.vim.sms.EntityReference entity)
			throws java.rmi.RemoteException,
			com.vmware.vim.sms.AuthenticationFailed,
			com.vmware.vim.sms.ServiceNotInitialized,
			com.vmware.vim.sms.QueryExecutionFailed,
			com.vmware.vim.sms.EntityNotFound, com.vmware.vim.sms.RuntimeFault,
			com.vmware.vim.sms.InvalidArgument;

	public void sync(com.vmware.vim.sms.ManagedObjectReference _this)
			throws java.rmi.RemoteException,
			com.vmware.vim.sms.AuthenticationFailed,
			com.vmware.vim.sms.ServiceNotInitialized,
			com.vmware.vim.sms.RuntimeFault,
			com.vmware.vim.sms.ProviderSyncFailed;

	public void configureSyncInterval(
			com.vmware.vim.sms.ManagedObjectReference _this, int interval)
			throws java.rmi.RemoteException,
			com.vmware.vim.sms.AuthenticationFailed,
			com.vmware.vim.sms.ServiceNotInitialized,
			com.vmware.vim.sms.RuntimeFault, com.vmware.vim.sms.InvalidArgument;

	public void updateVcDbConnectionInfo(
			com.vmware.vim.sms.ManagedObjectReference _this,
			com.vmware.vim.sms.DbConnectionSpec dbConnectionSpec)
			throws java.rmi.RemoteException,
			com.vmware.vim.sms.ServiceInitializationFailed,
			com.vmware.vim.sms.AuthenticationFailed,
			com.vmware.vim.sms.RuntimeFault, com.vmware.vim.sms.InvalidArgument;
}
