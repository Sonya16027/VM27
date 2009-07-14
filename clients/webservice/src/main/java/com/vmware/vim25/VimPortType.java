/**
 * VimPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public interface VimPortType extends java.rmi.Remote {
	public void destroyPropertyFilter(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createFilter(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.PropertyFilterSpec spec, boolean partialUpdates)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidProperty,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ObjectContent[] retrieveProperties(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.PropertyFilterSpec[] specSet)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidProperty,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.UpdateSet checkForUpdates(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String version) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidCollectorVersion,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.UpdateSet waitForUpdates(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String version) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidCollectorVersion,
			com.vmware.vim25.RuntimeFault;

	public void cancelWaitForUpdates(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public int addAuthorizationRole(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name, java.lang.String[] privIds)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.AlreadyExists, com.vmware.vim25.RuntimeFault;

	public void removeAuthorizationRole(
			com.vmware.vim25.ManagedObjectReference _this, int roleId,
			boolean failIfUsed) throws java.rmi.RemoteException,
			com.vmware.vim25.RemoveFailed, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void updateAuthorizationRole(
			com.vmware.vim25.ManagedObjectReference _this, int roleId,
			java.lang.String newName, java.lang.String[] privIds)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.AlreadyExists, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void mergePermissions(com.vmware.vim25.ManagedObjectReference _this,
			int srcRoleId, int dstRoleId) throws java.rmi.RemoteException,
			com.vmware.vim25.AuthMinimumAdminPermission,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.Permission[] retrieveRolePermissions(
			com.vmware.vim25.ManagedObjectReference _this, int roleId)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public com.vmware.vim25.Permission[] retrieveEntityPermissions(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity, boolean inherited)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.Permission[] retrieveAllPermissions(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void setEntityPermissions(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity,
			com.vmware.vim25.Permission[] permission)
			throws java.rmi.RemoteException,
			com.vmware.vim25.AuthMinimumAdminPermission,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound,
			com.vmware.vim25.UserNotFound;

	public void resetEntityPermissions(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity,
			com.vmware.vim25.Permission[] permission)
			throws java.rmi.RemoteException,
			com.vmware.vim25.AuthMinimumAdminPermission,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound,
			com.vmware.vim25.UserNotFound;

	public void removeEntityPermission(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity,
			java.lang.String user, boolean isGroup)
			throws java.rmi.RemoteException,
			com.vmware.vim25.AuthMinimumAdminPermission,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.ManagedObjectReference reconfigureCluster_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ClusterConfigSpec spec, boolean modify)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void applyRecommendation(
			com.vmware.vim25.ManagedObjectReference _this, java.lang.String key)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ClusterHostRecommendation[] recommendHostsForVm(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference vm,
			com.vmware.vim25.ManagedObjectReference pool)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference addHost_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostConnectSpec spec, boolean asConnected,
			com.vmware.vim25.ManagedObjectReference resourcePool,
			java.lang.String license) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidLogin, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.HostConnectFault, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference moveInto_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] host)
			throws java.rmi.RemoteException, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.InvalidState, com.vmware.vim25.TooManyHosts,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference moveHostInto_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host,
			com.vmware.vim25.ManagedObjectReference resourcePool)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.TooManyHosts, com.vmware.vim25.RuntimeFault;

	public void refreshRecommendation(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ClusterDasAdvancedRuntimeInfo retrieveDasAdvancedRuntimeInfo(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference reconfigureComputeResource_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ComputeResourceConfigSpec spec, boolean modify)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.CustomFieldDef addCustomFieldDef(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name, java.lang.String moType,
			com.vmware.vim25.PrivilegePolicyDef fieldDefPolicy,
			com.vmware.vim25.PrivilegePolicyDef fieldPolicy)
			throws java.rmi.RemoteException, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.InvalidPrivilege, com.vmware.vim25.RuntimeFault;

	public void removeCustomFieldDef(
			com.vmware.vim25.ManagedObjectReference _this, int key)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void renameCustomFieldDef(
			com.vmware.vim25.ManagedObjectReference _this, int key,
			java.lang.String name) throws java.rmi.RemoteException,
			com.vmware.vim25.DuplicateName, com.vmware.vim25.RuntimeFault;

	public void setField(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity, int key,
			java.lang.String value) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public boolean doesCustomizationSpecExist(
			com.vmware.vim25.ManagedObjectReference _this, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.CustomizationSpecItem getCustomizationSpec(
			com.vmware.vim25.ManagedObjectReference _this, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void createCustomizationSpec(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.CustomizationSpecItem item)
			throws java.rmi.RemoteException,
			com.vmware.vim25.CustomizationFault,
			com.vmware.vim25.AlreadyExists, com.vmware.vim25.RuntimeFault;

	public void overwriteCustomizationSpec(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.CustomizationSpecItem item)
			throws java.rmi.RemoteException,
			com.vmware.vim25.CustomizationFault,
			com.vmware.vim25.ConcurrentAccess, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void deleteCustomizationSpec(
			com.vmware.vim25.ManagedObjectReference _this, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void duplicateCustomizationSpec(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name, java.lang.String newName)
			throws java.rmi.RemoteException, com.vmware.vim25.AlreadyExists,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void renameCustomizationSpec(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name, java.lang.String newName)
			throws java.rmi.RemoteException, com.vmware.vim25.AlreadyExists,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public java.lang.String customizationSpecItemToXml(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.CustomizationSpecItem item)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.CustomizationSpecItem xmlToCustomizationSpecItem(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String specItemXml) throws java.rmi.RemoteException,
			com.vmware.vim25.CustomizationFault, com.vmware.vim25.RuntimeFault;

	public void checkCustomizationResources(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String guestOs) throws java.rmi.RemoteException,
			com.vmware.vim25.CustomizationFault, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostConnectInfo queryConnectionInfo(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String hostname, int port, java.lang.String username,
			java.lang.String password, java.lang.String sslThumbprint)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidLogin,
			com.vmware.vim25.HostConnectFault, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference powerOnMultiVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] vm)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void refreshDatastore(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void refreshDatastoreStorageInfo(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void renameDatastore(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String newName) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidName, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.RuntimeFault;

	public void destroyDatastore(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.ResourceInUse,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.DiagnosticManagerLogDescriptor[] queryDescriptions(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.DiagnosticManagerLogHeader browseDiagnosticLog(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host, java.lang.String key,
			java.lang.Integer start, java.lang.Integer lines)
			throws java.rmi.RemoteException, com.vmware.vim25.CannotAccessFile,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference generateLogBundles_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			boolean includeDefault,
			com.vmware.vim25.ManagedObjectReference[] host)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.LogBundlingFailed;

	public java.lang.String[] fetchDVPortKeys(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.DistributedVirtualSwitchPortCriteria criteria)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.DistributedVirtualPort[] fetchDVPorts(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.DistributedVirtualSwitchPortCriteria criteria)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public int[] queryUsedVlanIdInDvs(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference reconfigureDvs_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.DVSConfigSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.DvsNotAuthorized, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.DvsFault, com.vmware.vim25.ResourceNotAvailable,
			com.vmware.vim25.InvalidState, com.vmware.vim25.ResourceInUse,
			com.vmware.vim25.ConcurrentAccess, com.vmware.vim25.AlreadyExists,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound,
			com.vmware.vim25.LimitExceeded;

	public com.vmware.vim25.ManagedObjectReference performDvsProductSpecOperation_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String operation,
			com.vmware.vim25.DistributedVirtualSwitchProductSpec productSpec)
			throws java.rmi.RemoteException, com.vmware.vim25.DvsFault,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference mergeDvs_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference dvs)
			throws java.rmi.RemoteException, com.vmware.vim25.DvsFault,
			com.vmware.vim25.InvalidHostState, com.vmware.vim25.ResourceInUse,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.ManagedObjectReference addDVPortgroup_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.DVPortgroupConfigSpec[] spec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.DuplicateName, com.vmware.vim25.DvsFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference moveDVPort_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] portKey, java.lang.String destinationPortgroupKey)
			throws java.rmi.RemoteException, com.vmware.vim25.DvsFault,
			com.vmware.vim25.ConcurrentAccess, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void updateDvsCapability(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.DVSCapability capability)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference reconfigureDVPort_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.DVPortConfigSpec[] port)
			throws java.rmi.RemoteException, com.vmware.vim25.DvsFault,
			com.vmware.vim25.ConcurrentAccess, com.vmware.vim25.ResourceInUse,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void refreshDVPortState(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] portKeys) throws java.rmi.RemoteException,
			com.vmware.vim25.DvsFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public com.vmware.vim25.ManagedObjectReference rectifyDvsHost_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] hosts)
			throws java.rmi.RemoteException, com.vmware.vim25.DvsFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.VirtualMachineConfigOptionDescriptor[] queryConfigOptionDescriptor(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.VirtualMachineConfigOption queryConfigOption(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String key, com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ConfigTarget queryConfigTarget(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostCapability queryTargetCapabilities(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void setCustomValue(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String key, java.lang.String value)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void unregisterExtension(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String extensionKey) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.Extension findExtension(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String extensionKey) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public void registerExtension(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.Extension extension)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void updateExtension(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.Extension extension)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public java.lang.String getPublicKey(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void setPublicKey(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String extensionKey, java.lang.String publicKey)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void setExtensionCertificate(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String extensionKey, java.lang.String certificatePem)
			throws java.rmi.RemoteException,
			com.vmware.vim25.NoClientCertificate,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.ManagedObjectReference moveDatastoreFile_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String sourceName,
			com.vmware.vim25.ManagedObjectReference sourceDatacenter,
			java.lang.String destinationName,
			com.vmware.vim25.ManagedObjectReference destinationDatacenter,
			java.lang.Boolean force) throws java.rmi.RemoteException,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidDatastore,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference copyDatastoreFile_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String sourceName,
			com.vmware.vim25.ManagedObjectReference sourceDatacenter,
			java.lang.String destinationName,
			com.vmware.vim25.ManagedObjectReference destinationDatacenter,
			java.lang.Boolean force) throws java.rmi.RemoteException,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidDatastore,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference deleteDatastoreFile_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidDatastore, com.vmware.vim25.RuntimeFault;

	public void makeDirectory(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter,
			java.lang.Boolean createParentDirectories)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidDatastore, com.vmware.vim25.RuntimeFault;

	public void changeOwner(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter,
			java.lang.String owner) throws java.rmi.RemoteException,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidDatastore,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.UserNotFound;

	public com.vmware.vim25.ManagedObjectReference createFolder(
			com.vmware.vim25.ManagedObjectReference _this, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.DuplicateName, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference moveIntoFolder_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] list)
			throws java.rmi.RemoteException, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.InvalidFolder;

	public com.vmware.vim25.ManagedObjectReference createVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.VirtualMachineConfigSpec config,
			com.vmware.vim25.ManagedObjectReference pool,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.VmConfigFault, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.FileFault, com.vmware.vim25.OutOfBounds,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.InvalidDatastore, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference registerVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String path, java.lang.String name, boolean asTemplate,
			com.vmware.vim25.ManagedObjectReference pool,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.InvalidName, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.FileFault, com.vmware.vim25.OutOfBounds,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.InvalidDatastore, com.vmware.vim25.AlreadyExists,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.ManagedObjectReference createCluster(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name, com.vmware.vim25.ClusterConfigSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.DuplicateName, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createClusterEx(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name, com.vmware.vim25.ClusterConfigSpecEx spec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.DuplicateName, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference addStandaloneHost_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostConnectSpec spec,
			com.vmware.vim25.ComputeResourceConfigSpec compResSpec,
			boolean addConnected, java.lang.String license)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidLogin,
			com.vmware.vim25.DuplicateName, com.vmware.vim25.HostConnectFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createDatacenter(
			com.vmware.vim25.ManagedObjectReference _this, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.DuplicateName, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference unregisterAndDestroy_Task(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.ConcurrentAccess, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createDVS_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.DVSCreateSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.DvsNotAuthorized, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.DvsFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void setCollectorPageSize(
			com.vmware.vim25.ManagedObjectReference _this, int maxCount)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void rewindCollector(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void resetCollector(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void destroyCollector(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostConnectInfo queryHostConnectionInfo(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void updateSystemResources(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostSystemResourceInfo resourceInfo)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference reconnectHost_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostConnectSpec cnxSpec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.InvalidLogin, com.vmware.vim25.InvalidState,
			com.vmware.vim25.HostConnectFault, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference disconnectHost_Task(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference enterMaintenanceMode_Task(
			com.vmware.vim25.ManagedObjectReference _this, int timeout,
			java.lang.Boolean evacuatePoweredOffVms)
			throws java.rmi.RemoteException, com.vmware.vim25.Timedout,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference exitMaintenanceMode_Task(
			com.vmware.vim25.ManagedObjectReference _this, int timeout)
			throws java.rmi.RemoteException, com.vmware.vim25.Timedout,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference rebootHost_Task(
			com.vmware.vim25.ManagedObjectReference _this, boolean force)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference shutdownHost_Task(
			com.vmware.vim25.ManagedObjectReference _this, boolean force)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference powerDownHostToStandBy_Task(
			com.vmware.vim25.ManagedObjectReference _this, int timeoutSec,
			java.lang.Boolean evacuatePoweredOffVms)
			throws java.rmi.RemoteException, com.vmware.vim25.RequestCanceled,
			com.vmware.vim25.HostPowerOpFailed, com.vmware.vim25.NotSupported,
			com.vmware.vim25.Timedout, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference powerUpHostFromStandBy_Task(
			com.vmware.vim25.ManagedObjectReference _this, int timeoutSec)
			throws java.rmi.RemoteException,
			com.vmware.vim25.HostPowerOpFailed, com.vmware.vim25.NotSupported,
			com.vmware.vim25.Timedout, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public long queryMemoryOverhead(
			com.vmware.vim25.ManagedObjectReference _this, long memorySize,
			java.lang.Integer videoRamSize, int numVcpus)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public long queryMemoryOverheadEx(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.VirtualMachineConfigInfo vmConfigInfo)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference reconfigureHostForDAS_Task(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.DasConfigFault,
			com.vmware.vim25.RuntimeFault;

	public void updateFlags(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostFlagInfo flagInfo)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostServiceTicket acquireCimServicesTicket(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void updateIpmi(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostIpmiInfo ipmiInfo)
			throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidIpmiMacAddress,
			com.vmware.vim25.InvalidIpmiLoginInfo,
			com.vmware.vim25.RuntimeFault;

	public void httpNfcLeaseComplete(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.Timedout,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public void httpNfcLeaseAbort(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.LocalizedMethodFault fault)
			throws java.rmi.RemoteException, com.vmware.vim25.Timedout,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public void httpNfcLeaseProgress(
			com.vmware.vim25.ManagedObjectReference _this, int percent)
			throws java.rmi.RemoteException, com.vmware.vim25.Timedout,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.IpPool[] queryIpPools(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference dc)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public int createIpPool(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference dc,
			com.vmware.vim25.IpPool pool) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public void updateIpPool(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference dc,
			com.vmware.vim25.IpPool pool) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public void destroyIpPool(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference dc, int id, boolean force)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.LicenseManagerLicenseInfo updateAssignedLicense(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String entity, java.lang.String licenseKey,
			java.lang.String entityDisplayName)
			throws java.rmi.RemoteException,
			com.vmware.vim25.LicenseEntityNotFound,
			com.vmware.vim25.RuntimeFault;

	public void removeAssignedLicense(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String entityId) throws java.rmi.RemoteException,
			com.vmware.vim25.LicenseEntityNotFound,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.LicenseAssignmentManagerLicenseAssignment[] queryAssignedLicenses(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String entityId) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.LicenseFeatureInfo[] querySupportedFeatures(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.LicenseAvailabilityInfo[] queryLicenseSourceAvailability(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.LicenseUsageInfo queryLicenseUsage(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void setLicenseEdition(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host,
			java.lang.String featureKey) throws java.rmi.RemoteException,
			com.vmware.vim25.LicenseServerUnavailable,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public boolean checkLicenseFeature(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host,
			java.lang.String featureKey) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public boolean enableFeature(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host,
			java.lang.String featureKey) throws java.rmi.RemoteException,
			com.vmware.vim25.LicenseServerUnavailable,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public boolean disableFeature(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host,
			java.lang.String featureKey) throws java.rmi.RemoteException,
			com.vmware.vim25.LicenseServerUnavailable,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public void configureLicenseSource(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host,
			com.vmware.vim25.LicenseSource licenseSource)
			throws java.rmi.RemoteException,
			com.vmware.vim25.CannotAccessLocalSource,
			com.vmware.vim25.LicenseServerUnavailable,
			com.vmware.vim25.InvalidLicense, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.LicenseManagerLicenseInfo updateLicense(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String licenseKey, com.vmware.vim25.KeyValue[] labels)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.LicenseManagerLicenseInfo addLicense(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String licenseKey, com.vmware.vim25.KeyValue[] labels)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void removeLicense(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String licenseKey) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.LicenseManagerLicenseInfo decodeLicense(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String licenseKey) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public void updateLicenseLabel(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String licenseKey, java.lang.String labelKey,
			java.lang.String labelValue) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public void removeLicenseLabel(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String licenseKey, java.lang.String labelKey)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void reload(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference rename_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String newName) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidName, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference destroy_Task(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.VimFault,
			com.vmware.vim25.RuntimeFault;

	public void destroyNetwork(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.ResourceInUse,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.OvfValidateHostResult validateHost(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String ovfDescriptor,
			com.vmware.vim25.ManagedObjectReference host,
			com.vmware.vim25.OvfValidateHostParams vhp)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidState,
			com.vmware.vim25.ConcurrentAccess, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.OvfParseDescriptorResult parseDescriptor(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String ovfDescriptor,
			com.vmware.vim25.OvfParseDescriptorParams pdp)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState, com.vmware.vim25.ConcurrentAccess,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.OvfCreateImportSpecResult createImportSpec(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String ovfDescriptor,
			com.vmware.vim25.ManagedObjectReference resourcePool,
			com.vmware.vim25.ManagedObjectReference datastore,
			com.vmware.vim25.OvfCreateImportSpecParams cisp)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState, com.vmware.vim25.ConcurrentAccess,
			com.vmware.vim25.InvalidDatastore, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.OvfCreateDescriptorResult createDescriptor(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference obj,
			com.vmware.vim25.OvfCreateDescriptorParams cdp)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState, com.vmware.vim25.ConcurrentAccess,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.PerfProviderSummary queryPerfProviderSummary(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.PerfMetricId[] queryAvailablePerfMetric(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity,
			java.util.Calendar beginTime, java.util.Calendar endTime,
			java.lang.Integer intervalId) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.PerfCounterInfo[] queryPerfCounter(
			com.vmware.vim25.ManagedObjectReference _this, int[] counterId)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.PerfCounterInfo[] queryPerfCounterByLevel(
			com.vmware.vim25.ManagedObjectReference _this, int level)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.PerfEntityMetricBase[] queryPerf(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.PerfQuerySpec[] querySpec)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.PerfCompositeMetric queryPerfComposite(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.PerfQuerySpec querySpec)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void createPerfInterval(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.PerfInterval intervalId)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void removePerfInterval(
			com.vmware.vim25.ManagedObjectReference _this, int samplePeriod)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void updatePerfInterval(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.PerfInterval interval)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.DatabaseSizeEstimate estimateDatabaseSize(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.DatabaseSizeParam dbSizeParam)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void updateConfig(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name, com.vmware.vim25.ResourceConfigSpec config)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.DuplicateName, com.vmware.vim25.ConcurrentAccess,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.RuntimeFault;

	public void moveIntoResourcePool(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] list)
			throws java.rmi.RemoteException, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.RuntimeFault;

	public void updateChildResourceConfiguration(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ResourceConfigSpec[] spec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createResourcePool(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name, com.vmware.vim25.ResourceConfigSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.DuplicateName,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.RuntimeFault;

	public void destroyChildren(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createVApp(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name, com.vmware.vim25.ResourceConfigSpec resSpec,
			com.vmware.vim25.VAppConfigSpec configSpec,
			com.vmware.vim25.ManagedObjectReference vmFolder)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.InvalidName, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.InvalidState,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createChildVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.VirtualMachineConfigSpec config,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.VmConfigFault, com.vmware.vim25.FileFault,
			com.vmware.vim25.OutOfBounds,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.InvalidDatastore, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference registerChildVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String path, java.lang.String name,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.InvalidName, com.vmware.vim25.FileFault,
			com.vmware.vim25.OutOfBounds,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.InvalidDatastore, com.vmware.vim25.AlreadyExists,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.ManagedObjectReference importVApp(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ImportSpec spec,
			com.vmware.vim25.ManagedObjectReference folder,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.VmConfigFault, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.FileFault, com.vmware.vim25.OutOfBounds,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.InvalidDatastore, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference findByUuid(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datacenter,
			java.lang.String uuid, boolean vmSearch,
			java.lang.Boolean instanceUuid) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference findByDatastorePath(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datacenter,
			java.lang.String path) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidDatastore, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference findByDnsName(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datacenter,
			java.lang.String dnsName, boolean vmSearch)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference findByIp(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datacenter,
			java.lang.String ip, boolean vmSearch)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference findByInventoryPath(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String inventoryPath) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference findChild(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity,
			java.lang.String name) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference[] findAllByUuid(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datacenter,
			java.lang.String uuid, boolean vmSearch,
			java.lang.Boolean instanceUuid) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference[] findAllByDnsName(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datacenter,
			java.lang.String dnsName, boolean vmSearch)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference[] findAllByIp(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datacenter,
			java.lang.String ip, boolean vmSearch)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public java.util.Calendar currentTime(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ServiceContent retrieveServiceContent(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.Event[] validateMigration(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] vm,
			com.vmware.vim25.VirtualMachinePowerState state,
			java.lang.String[] testType,
			com.vmware.vim25.ManagedObjectReference pool,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostVMotionCompatibility[] queryVMotionCompatibility(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference vm,
			com.vmware.vim25.ManagedObjectReference[] host,
			java.lang.String[] compatibility) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ProductComponentInfo[] retrieveProductComponents(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void updateServiceMessage(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String message) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.UserSession login(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String userName, java.lang.String password,
			java.lang.String locale) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidLogin, com.vmware.vim25.InvalidLocale,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.UserSession loginBySSPI(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String base64Token, java.lang.String locale)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidLogin,
			com.vmware.vim25.InvalidLocale, com.vmware.vim25.SSPIChallenge,
			com.vmware.vim25.RuntimeFault;

	public void logout(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.SessionManagerLocalTicket acquireLocalTicket(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String userName) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidLogin, com.vmware.vim25.RuntimeFault;

	public void terminateSession(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] sessionId) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void setLocale(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String locale) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidLocale, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.UserSession loginExtensionBySubjectName(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String extensionKey, java.lang.String locale)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidLogin,
			com.vmware.vim25.NoSubjectName,
			com.vmware.vim25.NoClientCertificate,
			com.vmware.vim25.InvalidLocale, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public com.vmware.vim25.UserSession loginExtensionByCertificate(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String extensionKey, java.lang.String locale)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidLogin,
			com.vmware.vim25.NoClientCertificate,
			com.vmware.vim25.InvalidLocale, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.UserSession impersonateUser(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String userName, java.lang.String locale)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidLogin,
			com.vmware.vim25.InvalidLocale, com.vmware.vim25.RuntimeFault;

	public boolean sessionIsActive(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String sessionID, java.lang.String userName)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public java.lang.String acquireCloneTicket(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.UserSession cloneSession(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String cloneTicket) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidLogin, com.vmware.vim25.RuntimeFault;

	public void cancelTask(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public void updateProgress(com.vmware.vim25.ManagedObjectReference _this,
			int percentDone) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidState, com.vmware.vim25.OutOfBounds,
			com.vmware.vim25.RuntimeFault;

	public void setTaskState(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.TaskInfoState state, java.lang.Object result,
			com.vmware.vim25.LocalizedMethodFault fault)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public void setTaskDescription(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.LocalizableMessage description)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.TaskInfo[] readNextTasks(
			com.vmware.vim25.ManagedObjectReference _this, int maxCount)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.TaskInfo[] readPreviousTasks(
			com.vmware.vim25.ManagedObjectReference _this, int maxCount)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createCollectorForTasks(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.TaskFilterSpec filter)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.TaskInfo createTask(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference obj,
			java.lang.String taskTypeId, java.lang.String initiatedBy,
			boolean cancelable, java.lang.String parentTaskKey)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.UserSearchResult[] retrieveUserGroups(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String domain, java.lang.String searchStr,
			java.lang.String belongsToGroup, java.lang.String belongsToUser,
			boolean exactMatch, boolean findUsers, boolean findGroups)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void updateVAppConfig(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.VAppConfigSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.VmConfigFault, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState, com.vmware.vim25.ConcurrentAccess,
			com.vmware.vim25.InvalidDatastore,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference cloneVApp_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference target,
			com.vmware.vim25.VAppCloneSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.MigrationFault, com.vmware.vim25.InvalidDatastore,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference exportVApp(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidState,
			com.vmware.vim25.InvalidPowerState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference powerOnVApp_Task(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.VAppConfigFault,
			com.vmware.vim25.VmConfigFault, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidState,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference powerOffVApp_Task(
			com.vmware.vim25.ManagedObjectReference _this, boolean force)
			throws java.rmi.RemoteException, com.vmware.vim25.VAppConfigFault,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference unregisterVApp_Task(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.ConcurrentAccess, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createVirtualDisk_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter,
			com.vmware.vim25.VirtualDiskSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference deleteVirtualDisk_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference moveVirtualDisk_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String sourceName,
			com.vmware.vim25.ManagedObjectReference sourceDatacenter,
			java.lang.String destName,
			com.vmware.vim25.ManagedObjectReference destDatacenter,
			java.lang.Boolean force) throws java.rmi.RemoteException,
			com.vmware.vim25.FileFault, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference copyVirtualDisk_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String sourceName,
			com.vmware.vim25.ManagedObjectReference sourceDatacenter,
			java.lang.String destName,
			com.vmware.vim25.ManagedObjectReference destDatacenter,
			com.vmware.vim25.VirtualDiskSpec destSpec, java.lang.Boolean force)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference extendVirtualDisk_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter,
			long newCapacityKb, java.lang.Boolean eagerZero)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.RuntimeFault;

	public int queryVirtualDiskFragmentation(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference defragmentVirtualDisk_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference shrinkVirtualDisk_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter,
			java.lang.Boolean copy) throws java.rmi.RemoteException,
			com.vmware.vim25.FileFault, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference inflateVirtualDisk_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference eagerZeroVirtualDisk_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference zeroFillVirtualDisk_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.RuntimeFault;

	public void setVirtualDiskUuid(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter,
			java.lang.String uuid) throws java.rmi.RemoteException,
			com.vmware.vim25.FileFault, com.vmware.vim25.RuntimeFault;

	public java.lang.String queryVirtualDiskUuid(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostDiskDimensionsChs queryVirtualDiskGeometry(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.RuntimeFault;

	public void refreshStorageInfo(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createSnapshot_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name, java.lang.String description,
			boolean memory, boolean quiesce) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidName, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.SnapshotFault, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference revertToCurrentSnapshot_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host,
			java.lang.Boolean suppressPowerOn) throws java.rmi.RemoteException,
			com.vmware.vim25.VmConfigFault, com.vmware.vim25.SnapshotFault,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.InvalidState,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.ManagedObjectReference removeAllSnapshots_Task(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.SnapshotFault,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference reconfigVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.VirtualMachineConfigSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.VmConfigFault, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState, com.vmware.vim25.ConcurrentAccess,
			com.vmware.vim25.InvalidDatastore,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference upgradeVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String version) throws java.rmi.RemoteException,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.InvalidState,
			com.vmware.vim25.AlreadyUpgraded, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NoDiskFound;

	public java.lang.String extractOvfEnvironment(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference powerOnVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference powerOffVM_Task(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference suspendVM_Task(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference resetVM_Task(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public void shutdownGuest(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState, com.vmware.vim25.ToolsUnavailable,
			com.vmware.vim25.RuntimeFault;

	public void rebootGuest(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState, com.vmware.vim25.ToolsUnavailable,
			com.vmware.vim25.RuntimeFault;

	public void standbyGuest(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState, com.vmware.vim25.ToolsUnavailable,
			com.vmware.vim25.RuntimeFault;

	public void answerVM(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String questionId, java.lang.String answerChoice)
			throws java.rmi.RemoteException, com.vmware.vim25.ConcurrentAccess,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference customizeVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.CustomizationSpec spec)
			throws java.rmi.RemoteException,
			com.vmware.vim25.CustomizationFault, com.vmware.vim25.RuntimeFault;

	public void checkCustomizationSpec(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.CustomizationSpec spec)
			throws java.rmi.RemoteException,
			com.vmware.vim25.CustomizationFault, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference migrateVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference pool,
			com.vmware.vim25.ManagedObjectReference host,
			com.vmware.vim25.VirtualMachineMovePriority priority,
			com.vmware.vim25.VirtualMachinePowerState state)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.Timedout, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.MigrationFault, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference relocateVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.VirtualMachineRelocateSpec spec,
			com.vmware.vim25.VirtualMachineMovePriority priority)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.Timedout, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.MigrationFault, com.vmware.vim25.InvalidDatastore,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference cloneVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference folder,
			java.lang.String name, com.vmware.vim25.VirtualMachineCloneSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.CustomizationFault, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.MigrationFault, com.vmware.vim25.InvalidDatastore,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference exportVm(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidState,
			com.vmware.vim25.InvalidPowerState, com.vmware.vim25.RuntimeFault;

	public void markAsTemplate(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public void markAsVirtualMachine(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference pool,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidState,
			com.vmware.vim25.InvalidDatastore, com.vmware.vim25.RuntimeFault;

	public void unregisterVM(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidPowerState, com.vmware.vim25.RuntimeFault;

	public void resetGuestInformation(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public void mountToolsInstaller(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public void unmountToolsInstaller(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference upgradeTools_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String installerOptions) throws java.rmi.RemoteException,
			com.vmware.vim25.VmConfigFault, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.VmToolsUpgradeFault,
			com.vmware.vim25.InvalidState, com.vmware.vim25.ToolsUnavailable,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.VirtualMachineMksTicket acquireMksTicket(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void setScreenResolution(
			com.vmware.vim25.ManagedObjectReference _this, int width, int height)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.ToolsUnavailable, com.vmware.vim25.RuntimeFault;

	public void defragmentAllDisks(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidState,
			com.vmware.vim25.InvalidPowerState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createSecondaryVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState,
			com.vmware.vim25.VmFaultToleranceIssue,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference turnOffFaultToleranceForVM_Task(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState,
			com.vmware.vim25.VmFaultToleranceIssue,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference makePrimaryVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference vm)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState,
			com.vmware.vim25.VmFaultToleranceIssue,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference terminateFaultTolerantVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference vm)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState,
			com.vmware.vim25.VmFaultToleranceIssue,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference disableSecondaryVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference vm)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState,
			com.vmware.vim25.VmFaultToleranceIssue,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference enableSecondaryVM_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference vm,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.InvalidState,
			com.vmware.vim25.VmFaultToleranceIssue,
			com.vmware.vim25.RuntimeFault;

	public void setDisplayTopology(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.VirtualMachineDisplayTopology[] displays)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.ToolsUnavailable, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference startRecording_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name, java.lang.String description)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.VmConfigFault, com.vmware.vim25.SnapshotFault,
			com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.HostIncompatibleForRecordReplay,
			com.vmware.vim25.RecordReplayDisabled, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState, com.vmware.vim25.InvalidPowerState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference stopRecording_Task(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.SnapshotFault,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState, com.vmware.vim25.InvalidPowerState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference startReplaying_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference replaySnapshot)
			throws java.rmi.RemoteException, com.vmware.vim25.VmConfigFault,
			com.vmware.vim25.SnapshotFault, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.HostIncompatibleForRecordReplay,
			com.vmware.vim25.RecordReplayDisabled, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState, com.vmware.vim25.InvalidPowerState,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.ManagedObjectReference stopReplaying_Task(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.SnapshotFault,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidState, com.vmware.vim25.InvalidPowerState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference promoteDisks_Task(
			com.vmware.vim25.ManagedObjectReference _this, boolean unlink,
			com.vmware.vim25.VirtualDisk[] disks)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState, com.vmware.vim25.InvalidPowerState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createScreenshot_Task(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.DiskChangeInfo queryChangedDiskAreas(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference snapshot, int deviceKey,
			long startOffset, java.lang.String changeId)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public java.lang.String[] queryUnownedFiles(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void removeAlarm(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void reconfigureAlarm(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.AlarmSpec spec) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidName, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createAlarm(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity,
			com.vmware.vim25.AlarmSpec spec) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidName, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference[] getAlarm(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public boolean areAlarmActionsEnabled(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void enableAlarmActions(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity, boolean enabled)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.AlarmState[] getAlarmState(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void acknowledgeAlarm(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference alarm,
			com.vmware.vim25.ManagedObjectReference entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference reconfigureDVPortgroup_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.DVPortgroupConfigSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.DuplicateName, com.vmware.vim25.DvsFault,
			com.vmware.vim25.ConcurrentAccess, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.DistributedVirtualSwitchProductSpec[] queryAvailableDvsSpec(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference[] queryCompatibleHostForNewDvs(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference container,
			boolean recursive,
			com.vmware.vim25.DistributedVirtualSwitchProductSpec switchProductSpec)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference[] queryCompatibleHostForExistingDvs(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference container,
			boolean recursive, com.vmware.vim25.ManagedObjectReference dvs)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.DistributedVirtualSwitchHostProductSpec[] queryDvsCompatibleHostSpec(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.DistributedVirtualSwitchProductSpec switchProductSpec)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference queryDvsByUuid(
			com.vmware.vim25.ManagedObjectReference _this, java.lang.String uuid)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public com.vmware.vim25.DVSManagerDvsConfigTarget queryDvsConfigTarget(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host,
			com.vmware.vim25.ManagedObjectReference dvs)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.Event[] readNextEvents(
			com.vmware.vim25.ManagedObjectReference _this, int maxCount)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.Event[] readPreviousEvents(
			com.vmware.vim25.ManagedObjectReference _this, int maxCount)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.EventArgDesc[] retrieveArgumentDescription(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String eventTypeId) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createCollectorForEvents(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.EventFilterSpec filter)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public void logUserEvent(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity, java.lang.String msg)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.Event[] queryEvents(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.EventFilterSpec filter)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void postEvent(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.Event eventToPost,
			com.vmware.vim25.TaskInfo taskInfo)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.InvalidEvent;

	public void reconfigureAutostart(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostAutoStartManagerConfig spec)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void autoStartPowerOn(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void autoStartPowerOff(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostBootDeviceInfo queryBootDevices(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void updateBootDevice(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String key) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public void enableHyperThreading(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void disableHyperThreading(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference searchDatastore_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String datastorePath,
			com.vmware.vim25.HostDatastoreBrowserSearchSpec searchSpec)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidDatastore, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference searchDatastoreSubFolders_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String datastorePath,
			com.vmware.vim25.HostDatastoreBrowserSearchSpec searchSpec)
			throws java.rmi.RemoteException, com.vmware.vim25.FileFault,
			com.vmware.vim25.InvalidDatastore, com.vmware.vim25.RuntimeFault;

	public void deleteFile(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String datastorePath) throws java.rmi.RemoteException,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidDatastore,
			com.vmware.vim25.RuntimeFault;

	public void updateLocalSwapDatastore(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datastore)
			throws java.rmi.RemoteException,
			com.vmware.vim25.InaccessibleDatastore,
			com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.DatastoreNotWritableOnHost;

	public com.vmware.vim25.HostScsiDisk[] queryAvailableDisksForVmfs(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datastore)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.VmfsDatastoreOption[] queryVmfsDatastoreCreateOptions(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String devicePath) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public com.vmware.vim25.ManagedObjectReference createVmfsDatastore(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.VmfsDatastoreCreateSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.DuplicateName, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.VmfsDatastoreOption[] queryVmfsDatastoreExtendOptions(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datastore,
			java.lang.String devicePath,
			java.lang.Boolean suppressExpandCandidates)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.VmfsDatastoreOption[] queryVmfsDatastoreExpandOptions(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datastore)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.ManagedObjectReference extendVmfsDatastore(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datastore,
			com.vmware.vim25.VmfsDatastoreExtendSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.ManagedObjectReference expandVmfsDatastore(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datastore,
			com.vmware.vim25.VmfsDatastoreExpandSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.ManagedObjectReference createNasDatastore(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostNasVolumeSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.DuplicateName, com.vmware.vim25.AlreadyExists,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createLocalDatastore(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name, java.lang.String path)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.InvalidName, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.FileNotFound, com.vmware.vim25.RuntimeFault;

	public void removeDatastore(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datastore)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.ResourceInUse, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void configureDatastorePrincipal(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String userName, java.lang.String password)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostUnresolvedVmfsVolume[] queryUnresolvedVmfsVolumes(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference resignatureUnresolvedVmfsVolume_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostUnresolvedVmfsResignatureSpec resolutionSpec)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.VmfsAmbiguousMount, com.vmware.vim25.RuntimeFault;

	public void updateDateTimeConfig(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostDateTimeConfig config)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostDateTimeSystemTimeZone[] queryAvailableTimeZones(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public java.util.Calendar queryDateTime(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void updateDateTime(com.vmware.vim25.ManagedObjectReference _this,
			java.util.Calendar dateTime) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault;

	public void refreshDateTimeSystem(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostDiagnosticPartition[] queryAvailablePartition(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public void selectActivePartition(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostScsiDiskPartition partition)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.HostDiagnosticPartitionCreateOption[] queryPartitionCreateOptions(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String storageType, java.lang.String diagnosticType)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostDiagnosticPartitionCreateDescription queryPartitionCreateDesc(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String diskUuid, java.lang.String diagnosticType)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void createDiagnosticPartition(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostDiagnosticPartitionCreateSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void updateDefaultPolicy(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostFirewallDefaultPolicy defaultPolicy)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void enableRuleset(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String id) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void disableRuleset(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String id) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void refreshFirewall(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void resetFirmwareToFactoryDefaults(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public java.lang.String backupFirmwareConfiguration(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public java.lang.String queryFirmwareConfigUploadURL(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void restoreFirmwareConfiguration(
			com.vmware.vim25.ManagedObjectReference _this, boolean force)
			throws java.rmi.RemoteException, com.vmware.vim25.MismatchedBundle,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidState,
			com.vmware.vim25.InvalidBundle, com.vmware.vim25.RuntimeFault;

	public void refreshHealthStatusSystem(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void resetSystemHealthInfo(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.KernelModuleInfo[] queryModules(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void updateModuleOptionString(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name, java.lang.String options)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public java.lang.String queryConfiguredModuleOptionString(
			com.vmware.vim25.ManagedObjectReference _this, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void createUser(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostAccountSpec user)
			throws java.rmi.RemoteException, com.vmware.vim25.AlreadyExists,
			com.vmware.vim25.RuntimeFault;

	public void updateUser(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostAccountSpec user)
			throws java.rmi.RemoteException, com.vmware.vim25.AlreadyExists,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.UserNotFound;

	public void createGroup(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostAccountSpec group)
			throws java.rmi.RemoteException, com.vmware.vim25.AlreadyExists,
			com.vmware.vim25.RuntimeFault;

	public void removeUser(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String userName) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.UserNotFound;

	public void removeGroup(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String groupName) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.UserNotFound;

	public void assignUserToGroup(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String user, java.lang.String group)
			throws java.rmi.RemoteException, com.vmware.vim25.AlreadyExists,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.UserNotFound;

	public void unassignUserFromGroup(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String user, java.lang.String group)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.UserNotFound;

	public void reconfigureServiceConsoleReservation(
			com.vmware.vim25.ManagedObjectReference _this, long cfgBytes)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void reconfigureVirtualMachineReservation(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.VirtualMachineMemoryReservationSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostNetworkConfigResult updateNetworkConfig(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostNetworkConfig config,
			java.lang.String changeMode) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.ResourceInUse,
			com.vmware.vim25.AlreadyExists, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void updateDnsConfig(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostDnsConfig config)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void updateIpRouteConfig(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostIpRouteConfig config)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public void updateConsoleIpRouteConfig(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostIpRouteConfig config)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public void updateIpRouteTableConfig(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostIpRouteTableConfig config)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public void addVirtualSwitch(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String vswitchName,
			com.vmware.vim25.HostVirtualSwitchSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.ResourceInUse, com.vmware.vim25.AlreadyExists,
			com.vmware.vim25.RuntimeFault;

	public void removeVirtualSwitch(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String vswitchName) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.ResourceInUse,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void updateVirtualSwitch(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String vswitchName,
			com.vmware.vim25.HostVirtualSwitchSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.ResourceInUse, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void addPortGroup(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostPortGroupSpec portgrp)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.AlreadyExists, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void removePortGroup(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String pgName) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.ResourceInUse,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void updatePortGroup(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String pgName, com.vmware.vim25.HostPortGroupSpec portgrp)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.AlreadyExists, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void updatePhysicalNicLinkSpeed(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String device,
			com.vmware.vim25.PhysicalNicLinkInfo linkSpeed)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.PhysicalNicHintInfo[] queryNetworkHint(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] device) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public java.lang.String addVirtualNic(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String portgroup, com.vmware.vim25.HostVirtualNicSpec nic)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.AlreadyExists, com.vmware.vim25.RuntimeFault;

	public void removeVirtualNic(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String device) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void updateVirtualNic(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String device, com.vmware.vim25.HostVirtualNicSpec nic)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public java.lang.String addServiceConsoleVirtualNic(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String portgroup, com.vmware.vim25.HostVirtualNicSpec nic)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public void removeServiceConsoleVirtualNic(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String device) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.ResourceInUse,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void updateServiceConsoleVirtualNic(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String device, com.vmware.vim25.HostVirtualNicSpec nic)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.ResourceInUse, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void restartServiceConsoleVirtualNic(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String device) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void refreshNetworkSystem(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference checkHostPatch_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] metaUrls, java.lang.String[] bundleUrls,
			com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec spec)
			throws java.rmi.RemoteException,
			com.vmware.vim25.PlatformConfigFault,
			com.vmware.vim25.RequestCanceled, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference scanHostPatch_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostPatchManagerLocator repository,
			java.lang.String[] updateID) throws java.rmi.RemoteException,
			com.vmware.vim25.PlatformConfigFault,
			com.vmware.vim25.RequestCanceled, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.PatchMetadataInvalid;

	public com.vmware.vim25.ManagedObjectReference scanHostPatchV2_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] metaUrls, java.lang.String[] bundleUrls,
			com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec spec)
			throws java.rmi.RemoteException,
			com.vmware.vim25.PlatformConfigFault,
			com.vmware.vim25.RequestCanceled, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference stageHostPatch_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] metaUrls, java.lang.String[] bundleUrls,
			java.lang.String[] vibUrls,
			com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec spec)
			throws java.rmi.RemoteException,
			com.vmware.vim25.PlatformConfigFault,
			com.vmware.vim25.RequestCanceled, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference installHostPatch_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostPatchManagerLocator repository,
			java.lang.String updateID, java.lang.Boolean force)
			throws java.rmi.RemoteException, com.vmware.vim25.NoDiskSpace,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.RebootRequired,
			com.vmware.vim25.PatchBinariesNotFound,
			com.vmware.vim25.InvalidState, com.vmware.vim25.PatchNotApplicable,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.PatchInstallFailed,
			com.vmware.vim25.PatchMetadataInvalid;

	public com.vmware.vim25.ManagedObjectReference installHostPatchV2_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] metaUrls, java.lang.String[] bundleUrls,
			java.lang.String[] vibUrls,
			com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec spec)
			throws java.rmi.RemoteException,
			com.vmware.vim25.PlatformConfigFault,
			com.vmware.vim25.RequestCanceled, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference uninstallHostPatch_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] bulletinIds,
			com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec spec)
			throws java.rmi.RemoteException,
			com.vmware.vim25.PlatformConfigFault,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference queryHostPatch_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec spec)
			throws java.rmi.RemoteException,
			com.vmware.vim25.PlatformConfigFault,
			com.vmware.vim25.RequestCanceled, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public void refresh(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void updatePassthruConfig(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostPciPassthruConfig[] config)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public void updateServicePolicy(
			com.vmware.vim25.ManagedObjectReference _this, java.lang.String id,
			java.lang.String policy) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void startService(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String id) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void stopService(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String id) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void restartService(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String id) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void uninstallService(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String id) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void refreshServices(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void reconfigureSnmpAgent(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostSnmpConfigSpec spec)
			throws java.rmi.RemoteException,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void sendTestNotification(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.HostDiskPartitionInfo[] retrieveDiskPartitionInfo(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] devicePath) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostDiskPartitionInfo computeDiskPartitionInfo(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String devicePath,
			com.vmware.vim25.HostDiskPartitionLayout layout)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.HostDiskPartitionInfo computeDiskPartitionInfoForResize(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostScsiDiskPartition partition,
			com.vmware.vim25.HostDiskPartitionBlockRange blockRange)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void updateDiskPartitions(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String devicePath,
			com.vmware.vim25.HostDiskPartitionSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.HostVmfsVolume formatVmfs(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostVmfsSpec createSpec)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.AlreadyExists, com.vmware.vim25.RuntimeFault;

	public void rescanVmfs(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public void attachVmfsExtent(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String vmfsPath,
			com.vmware.vim25.HostScsiDiskPartition extent)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void expandVmfsExtent(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String vmfsPath,
			com.vmware.vim25.HostScsiDiskPartition extent)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void upgradeVmfs(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String vmfsPath) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void upgradeVmLayout(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostUnresolvedVmfsVolume[] queryUnresolvedVmfsVolume(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostUnresolvedVmfsResolutionResult[] resolveMultipleUnresolvedVmfsVolumes(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostUnresolvedVmfsResolutionSpec[] resolutionSpec)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public void unmountForceMountedVmfsVolume(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String vmfsUuid) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void rescanHba(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String hbaDevice) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void rescanAllHba(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public void updateSoftwareInternetScsiEnabled(
			com.vmware.vim25.ManagedObjectReference _this, boolean enabled)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public void updateInternetScsiDiscoveryProperties(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim25.HostInternetScsiHbaDiscoveryProperties discoveryProperties)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void updateInternetScsiAuthenticationProperties(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim25.HostInternetScsiHbaAuthenticationProperties authenticationProperties,
			com.vmware.vim25.HostInternetScsiHbaTargetSet targetSet)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void updateInternetScsiDigestProperties(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim25.HostInternetScsiHbaTargetSet targetSet,
			com.vmware.vim25.HostInternetScsiHbaDigestProperties digestProperties)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void updateInternetScsiAdvancedOptions(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim25.HostInternetScsiHbaTargetSet targetSet,
			com.vmware.vim25.HostInternetScsiHbaParamValue[] options)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void updateInternetScsiIPProperties(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim25.HostInternetScsiHbaIPProperties ipProperties)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void updateInternetScsiName(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice, java.lang.String iScsiName)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void updateInternetScsiAlias(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice, java.lang.String iScsiAlias)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void addInternetScsiSendTargets(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim25.HostInternetScsiHbaSendTarget[] targets)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void removeInternetScsiSendTargets(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim25.HostInternetScsiHbaSendTarget[] targets)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void addInternetScsiStaticTargets(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim25.HostInternetScsiHbaStaticTarget[] targets)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void removeInternetScsiStaticTargets(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim25.HostInternetScsiHbaStaticTarget[] targets)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void enableMultipathPath(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String pathName) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void disableMultipathPath(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String pathName) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.NotFound;

	public void setMultipathLunPolicy(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String lunId,
			com.vmware.vim25.HostMultipathInfoLogicalUnitPolicy policy)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public com.vmware.vim25.HostPathSelectionPolicyOption[] queryPathSelectionPolicyOptions(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.HostStorageArrayTypePolicyOption[] queryStorageArrayTypePolicyOptions(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public void updateScsiLunDisplayName(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String lunUuid, java.lang.String displayName)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.InvalidName, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void refreshStorageSystem(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void updateIpConfig(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostIpConfig ipConfig)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.NotFound;

	public void selectVnic(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String device) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault;

	public void deselectVnic(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.VirtualNicManagerNetConfig queryNetConfig(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String nicType) throws java.rmi.RemoteException,
			com.vmware.vim25.HostConfigFault, com.vmware.vim25.RuntimeFault,
			com.vmware.vim25.InvalidArgument;

	public void selectVnicForNicType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String nicType, java.lang.String device)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.InvalidArgument;

	public void deselectVnicForNicType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String nicType, java.lang.String device)
			throws java.rmi.RemoteException, com.vmware.vim25.HostConfigFault,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.InvalidArgument;

	public com.vmware.vim25.OptionValue[] queryOptions(
			com.vmware.vim25.ManagedObjectReference _this, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.RuntimeFault;

	public void updateOptions(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.OptionValue[] changedValue)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference checkCompliance_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] profile,
			com.vmware.vim25.ManagedObjectReference[] entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ComplianceResult[] queryComplianceStatus(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] profile,
			com.vmware.vim25.ManagedObjectReference[] entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void clearComplianceStatus(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] profile,
			com.vmware.vim25.ManagedObjectReference[] entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ProfileExpressionMetadata[] queryExpressionMetadata(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] expressionName) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public void destroyProfile(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void associateProfile(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void dissociateProfile(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference checkProfileCompliance_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public java.lang.String exportProfile(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createProfile(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ProfileCreateSpec createSpec)
			throws java.rmi.RemoteException, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ProfilePolicyMetadata[] queryPolicyMetadata(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] policyName) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference[] findAssociatedProfile(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void updateClusterProfile(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ClusterProfileConfigSpec config)
			throws java.rmi.RemoteException, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.RuntimeFault;

	public void updateReferenceHost(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void updateHostProfile(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostProfileConfigSpec config)
			throws java.rmi.RemoteException, com.vmware.vim25.DuplicateName,
			com.vmware.vim25.ProfileUpdateFailed, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ProfileExecuteResult executeHostProfile(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host,
			com.vmware.vim25.ProfileDeferredPolicyOptionParameter[] deferredParam)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference applyHostConfig_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host,
			com.vmware.vim25.HostConfigSpec configSpec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault, com.vmware.vim25.HostConfigFailed;

	public com.vmware.vim25.HostProfileManagerConfigTaskList generateConfigTaskList(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostConfigSpec configSpec,
			com.vmware.vim25.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ProfileMetadata[] queryHostProfileMetadata(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] profileName) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ApplyProfile createDefaultProfile(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String profileType) throws java.rmi.RemoteException,
			com.vmware.vim25.RuntimeFault;

	public void removeScheduledTask(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public void reconfigureScheduledTask(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ScheduledTaskSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.DuplicateName, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public void runScheduledTask(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidState,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createScheduledTask(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity,
			com.vmware.vim25.ScheduledTaskSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.DuplicateName, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference[] retrieveEntityScheduledTask(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createObjectScheduledTask(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference obj,
			com.vmware.vim25.ScheduledTaskSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.DuplicateName, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference[] retrieveObjectScheduledTask(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference obj)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference[] openInventoryViewFolder(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference[] closeInventoryViewFolder(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] entity)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference[] modifyListView(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] add,
			com.vmware.vim25.ManagedObjectReference[] remove)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference[] resetListView(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] obj)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void resetListViewFromView(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference view)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public void destroyView(com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createInventoryView(
			com.vmware.vim25.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createContainerView(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference container,
			java.lang.String[] type, boolean recursive)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createListView(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] obj)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference createListViewFromView(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference view)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference revertToSnapshot_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host,
			java.lang.Boolean suppressPowerOn) throws java.rmi.RemoteException,
			com.vmware.vim25.VmConfigFault, com.vmware.vim25.TaskInProgress,
			com.vmware.vim25.FileFault, com.vmware.vim25.InvalidState,
			com.vmware.vim25.InsufficientResourcesFault,
			com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference removeSnapshot_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			boolean removeChildren) throws java.rmi.RemoteException,
			com.vmware.vim25.TaskInProgress, com.vmware.vim25.RuntimeFault;

	public void renameSnapshot(com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name, java.lang.String description)
			throws java.rmi.RemoteException, com.vmware.vim25.InvalidName,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference checkCompatibility_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference vm,
			com.vmware.vim25.ManagedObjectReference host,
			com.vmware.vim25.ManagedObjectReference pool,
			java.lang.String[] testType) throws java.rmi.RemoteException,
			com.vmware.vim25.NoActiveHostInCluster,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference queryVMotionCompatibilityEx_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] vm,
			com.vmware.vim25.ManagedObjectReference[] host)
			throws java.rmi.RemoteException, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference checkMigrate_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference vm,
			com.vmware.vim25.ManagedObjectReference host,
			com.vmware.vim25.ManagedObjectReference pool,
			com.vmware.vim25.VirtualMachinePowerState state,
			java.lang.String[] testType) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;

	public com.vmware.vim25.ManagedObjectReference checkRelocate_Task(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference vm,
			com.vmware.vim25.VirtualMachineRelocateSpec spec,
			java.lang.String[] testType) throws java.rmi.RemoteException,
			com.vmware.vim25.InvalidState, com.vmware.vim25.RuntimeFault;
}
