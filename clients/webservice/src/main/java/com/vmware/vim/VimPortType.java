/**
 * VimPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public interface VimPortType extends java.rmi.Remote {
	public void destroyPropertyFilter(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference createFilter(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.PropertyFilterSpec spec, boolean partialUpdates)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidProperty,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ObjectContent[] retrieveProperties(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.PropertyFilterSpec[] specSet)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidProperty,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.UpdateSet checkForUpdates(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String version) throws java.rmi.RemoteException,
			com.vmware.vim.InvalidCollectorVersion, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.UpdateSet waitForUpdates(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String version) throws java.rmi.RemoteException,
			com.vmware.vim.InvalidCollectorVersion, com.vmware.vim.RuntimeFault;

	public void cancelWaitForUpdates(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public int addAuthorizationRole(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String name,
			java.lang.String[] privIds) throws java.rmi.RemoteException,
			com.vmware.vim.InvalidName, com.vmware.vim.AlreadyExists,
			com.vmware.vim.RuntimeFault;

	public void removeAuthorizationRole(
			com.vmware.vim.ManagedObjectReference _this, int roleId,
			boolean failIfUsed) throws java.rmi.RemoteException,
			com.vmware.vim.RemoveFailed, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void updateAuthorizationRole(
			com.vmware.vim.ManagedObjectReference _this, int roleId,
			java.lang.String newName, java.lang.String[] privIds)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.AlreadyExists, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void mergePermissions(com.vmware.vim.ManagedObjectReference _this,
			int srcRoleId, int dstRoleId) throws java.rmi.RemoteException,
			com.vmware.vim.AuthMinimumAdminPermission,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public com.vmware.vim.Permission[] retrieveRolePermissions(
			com.vmware.vim.ManagedObjectReference _this, int roleId)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public com.vmware.vim.Permission[] retrieveEntityPermissions(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity, boolean inherited)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.Permission[] retrieveAllPermissions(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void setEntityPermissions(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity,
			com.vmware.vim.Permission[] permission)
			throws java.rmi.RemoteException,
			com.vmware.vim.AuthMinimumAdminPermission,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound,
			com.vmware.vim.UserNotFound;

	public void resetEntityPermissions(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity,
			com.vmware.vim.Permission[] permission)
			throws java.rmi.RemoteException,
			com.vmware.vim.AuthMinimumAdminPermission,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound,
			com.vmware.vim.UserNotFound;

	public void removeEntityPermission(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity,
			java.lang.String user, boolean isGroup)
			throws java.rmi.RemoteException,
			com.vmware.vim.AuthMinimumAdminPermission,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public com.vmware.vim.ManagedObjectReference reconfigureCluster_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ClusterConfigSpec spec, boolean modify)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void applyRecommendation(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String key)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ClusterHostRecommendation[] recommendHostsForVm(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference vm,
			com.vmware.vim.ManagedObjectReference pool)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference addHost_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostConnectSpec spec, boolean asConnected,
			com.vmware.vim.ManagedObjectReference resourcePool)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidLogin,
			com.vmware.vim.HostConnectFault, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference moveInto_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference[] host)
			throws java.rmi.RemoteException, com.vmware.vim.DuplicateName,
			com.vmware.vim.InvalidState, com.vmware.vim.TooManyHosts,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference moveHostInto_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host,
			com.vmware.vim.ManagedObjectReference resourcePool)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidState,
			com.vmware.vim.TooManyHosts, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.CustomFieldDef addCustomFieldDef(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim.DuplicateName,
			com.vmware.vim.RuntimeFault;

	public void removeCustomFieldDef(
			com.vmware.vim.ManagedObjectReference _this, int key)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void renameCustomFieldDef(
			com.vmware.vim.ManagedObjectReference _this, int key,
			java.lang.String name) throws java.rmi.RemoteException,
			com.vmware.vim.DuplicateName, com.vmware.vim.RuntimeFault;

	public void setField(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity, int key,
			java.lang.String value) throws java.rmi.RemoteException,
			com.vmware.vim.RuntimeFault;

	public boolean doesCustomizationSpecExist(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.CustomizationSpecItem getCustomizationSpec(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void createCustomizationSpec(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.CustomizationSpecItem item)
			throws java.rmi.RemoteException, com.vmware.vim.CustomizationFault,
			com.vmware.vim.AlreadyExists, com.vmware.vim.RuntimeFault;

	public void overwriteCustomizationSpec(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.CustomizationSpecItem item)
			throws java.rmi.RemoteException, com.vmware.vim.CustomizationFault,
			com.vmware.vim.ConcurrentAccess, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void deleteCustomizationSpec(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void duplicateCustomizationSpec(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String name,
			java.lang.String newName) throws java.rmi.RemoteException,
			com.vmware.vim.AlreadyExists, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void renameCustomizationSpec(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String name,
			java.lang.String newName) throws java.rmi.RemoteException,
			com.vmware.vim.AlreadyExists, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public java.lang.String customizationSpecItemToXml(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.CustomizationSpecItem item)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.CustomizationSpecItem xmlToCustomizationSpecItem(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String specItemXml) throws java.rmi.RemoteException,
			com.vmware.vim.CustomizationFault, com.vmware.vim.RuntimeFault;

	public void checkCustomizationResources(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String guestOs) throws java.rmi.RemoteException,
			com.vmware.vim.CustomizationFault, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.HostConnectInfo queryConnectionInfo(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String hostname, int port, java.lang.String username,
			java.lang.String password) throws java.rmi.RemoteException,
			com.vmware.vim.InvalidLogin, com.vmware.vim.HostConnectFault,
			com.vmware.vim.RuntimeFault;

	public void renameDatastore(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String newName) throws java.rmi.RemoteException,
			com.vmware.vim.InvalidName, com.vmware.vim.DuplicateName,
			com.vmware.vim.RuntimeFault;

	public void refreshDatastore(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void destroyDatastore(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.ResourceInUse,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.DiagnosticManagerLogDescriptor[] queryDescriptions(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.DiagnosticManagerLogHeader browseDiagnosticLog(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host, java.lang.String key,
			java.lang.Integer start, java.lang.Integer lines)
			throws java.rmi.RemoteException, com.vmware.vim.CannotAccessFile,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference generateLogBundles_Task(
			com.vmware.vim.ManagedObjectReference _this,
			boolean includeDefault, com.vmware.vim.ManagedObjectReference[] host)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault,
			com.vmware.vim.LogBundlingFailed;

	public com.vmware.vim.VirtualMachineConfigOptionDescriptor[] queryConfigOptionDescriptor(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.VirtualMachineConfigOption queryConfigOption(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String key,
			com.vmware.vim.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ConfigTarget queryConfigTarget(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference createFolder(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.DuplicateName, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference moveIntoFolder_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference[] list)
			throws java.rmi.RemoteException, com.vmware.vim.DuplicateName,
			com.vmware.vim.InvalidState, com.vmware.vim.RuntimeFault,
			com.vmware.vim.InvalidFolder;

	public com.vmware.vim.ManagedObjectReference createVM_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.VirtualMachineConfigSpec config,
			com.vmware.vim.ManagedObjectReference pool,
			com.vmware.vim.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.VmConfigFault, com.vmware.vim.DuplicateName,
			com.vmware.vim.FileFault, com.vmware.vim.OutOfBounds,
			com.vmware.vim.InsufficientResourcesFault,
			com.vmware.vim.InvalidDatastore, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference registerVM_Task(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String path,
			java.lang.String name, boolean asTemplate,
			com.vmware.vim.ManagedObjectReference pool,
			com.vmware.vim.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim.VmConfigFault,
			com.vmware.vim.InvalidName, com.vmware.vim.DuplicateName,
			com.vmware.vim.FileFault, com.vmware.vim.OutOfBounds,
			com.vmware.vim.InsufficientResourcesFault,
			com.vmware.vim.InvalidDatastore, com.vmware.vim.AlreadyExists,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public com.vmware.vim.ManagedObjectReference createCluster(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String name,
			com.vmware.vim.ClusterConfigSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.DuplicateName, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference addStandaloneHost_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostConnectSpec spec, boolean addConnected)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidLogin,
			com.vmware.vim.HostConnectFault, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference createDatacenter(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.DuplicateName, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference unregisterAndDestroy_Task(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidState,
			com.vmware.vim.ConcurrentAccess, com.vmware.vim.RuntimeFault;

	public void setCollectorPageSize(
			com.vmware.vim.ManagedObjectReference _this, int maxCount)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void rewindCollector(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void resetCollector(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void destroyCollector(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.HostConnectInfo queryHostConnectionInfo(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void updateSystemResources(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostSystemResourceInfo resourceInfo)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference reconnectHost_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostConnectSpec cnxSpec)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.InvalidLogin, com.vmware.vim.InvalidState,
			com.vmware.vim.HostConnectFault, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference disconnectHost_Task(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference enterMaintenanceMode_Task(
			com.vmware.vim.ManagedObjectReference _this, int timeout)
			throws java.rmi.RemoteException, com.vmware.vim.Timedout,
			com.vmware.vim.InvalidState, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference exitMaintenanceMode_Task(
			com.vmware.vim.ManagedObjectReference _this, int timeout)
			throws java.rmi.RemoteException, com.vmware.vim.Timedout,
			com.vmware.vim.InvalidState, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference rebootHost_Task(
			com.vmware.vim.ManagedObjectReference _this, boolean force)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference shutdownHost_Task(
			com.vmware.vim.ManagedObjectReference _this, boolean force)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault;

	public long queryMemoryOverhead(
			com.vmware.vim.ManagedObjectReference _this, long memorySize,
			java.lang.Integer videoRamSize, int numVcpus)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference reconfigureHostForDAS_Task(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.DasConfigFault,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.LicenseAvailabilityInfo[] queryLicenseSourceAvailability(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.LicenseUsageInfo queryLicenseUsage(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void setLicenseEdition(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host,
			java.lang.String featureKey) throws java.rmi.RemoteException,
			com.vmware.vim.LicenseServerUnavailable,
			com.vmware.vim.InvalidState, com.vmware.vim.RuntimeFault;

	public boolean checkLicenseFeature(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host,
			java.lang.String featureKey) throws java.rmi.RemoteException,
			com.vmware.vim.InvalidState, com.vmware.vim.RuntimeFault;

	public boolean enableFeature(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host,
			java.lang.String featureKey) throws java.rmi.RemoteException,
			com.vmware.vim.LicenseServerUnavailable,
			com.vmware.vim.InvalidState, com.vmware.vim.RuntimeFault;

	public boolean disableFeature(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host,
			java.lang.String featureKey) throws java.rmi.RemoteException,
			com.vmware.vim.LicenseServerUnavailable,
			com.vmware.vim.InvalidState, com.vmware.vim.RuntimeFault;

	public void configureLicenseSource(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host,
			com.vmware.vim.LicenseSource licenseSource)
			throws java.rmi.RemoteException,
			com.vmware.vim.CannotAccessLocalSource,
			com.vmware.vim.LicenseServerUnavailable,
			com.vmware.vim.InvalidLicense, com.vmware.vim.RuntimeFault;

	public void reload(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference rename_Task(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String newName) throws java.rmi.RemoteException,
			com.vmware.vim.InvalidName, com.vmware.vim.DuplicateName,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference destroy_Task(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.VimFault,
			com.vmware.vim.RuntimeFault;

	public void destroyNetwork(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.ResourceInUse,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.PerfProviderSummary queryPerfProviderSummary(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.PerfMetricId[] queryAvailablePerfMetric(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity,
			java.util.Calendar beginTime, java.util.Calendar endTime,
			java.lang.Integer intervalId) throws java.rmi.RemoteException,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.PerfCounterInfo[] queryPerfCounter(
			com.vmware.vim.ManagedObjectReference _this, int[] counterId)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.PerfEntityMetricBase[] queryPerf(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.PerfQuerySpec[] querySpec)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.PerfCompositeMetric queryPerfComposite(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.PerfQuerySpec querySpec)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void createPerfInterval(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.PerfInterval intervalId)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void removePerfInterval(com.vmware.vim.ManagedObjectReference _this,
			int samplePeriod) throws java.rmi.RemoteException,
			com.vmware.vim.RuntimeFault;

	public void updatePerfInterval(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.PerfInterval interval)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void updateConfig(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String name, com.vmware.vim.ResourceConfigSpec config)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.DuplicateName, com.vmware.vim.ConcurrentAccess,
			com.vmware.vim.InsufficientResourcesFault,
			com.vmware.vim.RuntimeFault;

	public void moveIntoResourcePool(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference[] list)
			throws java.rmi.RemoteException, com.vmware.vim.DuplicateName,
			com.vmware.vim.InsufficientResourcesFault,
			com.vmware.vim.RuntimeFault;

	public void updateChildResourceConfiguration(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ResourceConfigSpec[] spec)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidState,
			com.vmware.vim.InsufficientResourcesFault,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference createResourcePool(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String name,
			com.vmware.vim.ResourceConfigSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.DuplicateName,
			com.vmware.vim.InsufficientResourcesFault,
			com.vmware.vim.RuntimeFault;

	public void destroyChildren(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference findByUuid(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference datacenter,
			java.lang.String uuid, boolean vmSearch)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference findByDatastorePath(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference datacenter,
			java.lang.String path) throws java.rmi.RemoteException,
			com.vmware.vim.InvalidDatastore, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference findByDnsName(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference datacenter,
			java.lang.String dnsName, boolean vmSearch)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference findByIp(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference datacenter,
			java.lang.String ip, boolean vmSearch)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference findByInventoryPath(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String inventoryPath) throws java.rmi.RemoteException,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference findChild(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public java.util.Calendar currentTime(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ServiceContent retrieveServiceContent(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.Event[] validateMigration(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference[] vm,
			com.vmware.vim.VirtualMachinePowerState state,
			java.lang.String[] testType,
			com.vmware.vim.ManagedObjectReference pool,
			com.vmware.vim.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.HostVMotionCompatibility[] queryVMotionCompatibility(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference vm,
			com.vmware.vim.ManagedObjectReference[] host,
			java.lang.String[] compatibility) throws java.rmi.RemoteException,
			com.vmware.vim.RuntimeFault;

	public void updateServiceMessage(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String message) throws java.rmi.RemoteException,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.UserSession login(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String userName, java.lang.String password,
			java.lang.String locale) throws java.rmi.RemoteException,
			com.vmware.vim.InvalidLogin, com.vmware.vim.InvalidLocale,
			com.vmware.vim.RuntimeFault;

	public void logout(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.SessionManagerLocalTicket acquireLocalTicket(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String userName) throws java.rmi.RemoteException,
			com.vmware.vim.InvalidLogin, com.vmware.vim.RuntimeFault;

	public void terminateSession(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String[] sessionId) throws java.rmi.RemoteException,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void setLocale(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String locale) throws java.rmi.RemoteException,
			com.vmware.vim.InvalidLocale, com.vmware.vim.RuntimeFault;

	public void cancelTask(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.TaskInfo[] readNextTasks(
			com.vmware.vim.ManagedObjectReference _this, int maxCount)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.TaskInfo[] readPreviousTasks(
			com.vmware.vim.ManagedObjectReference _this, int maxCount)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference createCollectorForTasks(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.TaskFilterSpec filter)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.UserSearchResult[] retrieveUserGroups(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String domain, java.lang.String searchStr,
			java.lang.String belongsToGroup, java.lang.String belongsToUser,
			boolean exactMatch, boolean findUsers, boolean findGroups)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public com.vmware.vim.ManagedObjectReference createSnapshot_Task(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String name,
			java.lang.String description, boolean memory, boolean quiesce)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.VmConfigFault, com.vmware.vim.SnapshotFault,
			com.vmware.vim.TaskInProgress, com.vmware.vim.FileFault,
			com.vmware.vim.InvalidState, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference revertToCurrentSnapshot_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim.VmConfigFault,
			com.vmware.vim.SnapshotFault, com.vmware.vim.TaskInProgress,
			com.vmware.vim.InvalidState,
			com.vmware.vim.InsufficientResourcesFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public com.vmware.vim.ManagedObjectReference removeAllSnapshots_Task(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.SnapshotFault,
			com.vmware.vim.TaskInProgress, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference reconfigVM_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.VirtualMachineConfigSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.VmConfigFault, com.vmware.vim.DuplicateName,
			com.vmware.vim.TaskInProgress, com.vmware.vim.FileFault,
			com.vmware.vim.InvalidState, com.vmware.vim.ConcurrentAccess,
			com.vmware.vim.InvalidDatastore,
			com.vmware.vim.InsufficientResourcesFault,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference upgradeVM_Task(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String version) throws java.rmi.RemoteException,
			com.vmware.vim.TaskInProgress, com.vmware.vim.InvalidState,
			com.vmware.vim.AlreadyUpgraded, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NoDiskFound;

	public com.vmware.vim.ManagedObjectReference powerOnVM_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim.VmConfigFault,
			com.vmware.vim.TaskInProgress, com.vmware.vim.FileFault,
			com.vmware.vim.InvalidState,
			com.vmware.vim.InsufficientResourcesFault,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference powerOffVM_Task(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.TaskInProgress,
			com.vmware.vim.InvalidState, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference suspendVM_Task(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.TaskInProgress,
			com.vmware.vim.InvalidState, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference resetVM_Task(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.TaskInProgress,
			com.vmware.vim.InvalidState, com.vmware.vim.RuntimeFault;

	public void shutdownGuest(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.TaskInProgress,
			com.vmware.vim.InvalidState, com.vmware.vim.ToolsUnavailable,
			com.vmware.vim.RuntimeFault;

	public void rebootGuest(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.TaskInProgress,
			com.vmware.vim.InvalidState, com.vmware.vim.ToolsUnavailable,
			com.vmware.vim.RuntimeFault;

	public void standbyGuest(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.TaskInProgress,
			com.vmware.vim.InvalidState, com.vmware.vim.ToolsUnavailable,
			com.vmware.vim.RuntimeFault;

	public void answerVM(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String questionId, java.lang.String answerChoice)
			throws java.rmi.RemoteException, com.vmware.vim.ConcurrentAccess,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference customizeVM_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.CustomizationSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.CustomizationFault,
			com.vmware.vim.RuntimeFault;

	public void checkCustomizationSpec(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.CustomizationSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.CustomizationFault,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference migrateVM_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference pool,
			com.vmware.vim.ManagedObjectReference host,
			com.vmware.vim.VirtualMachineMovePriority priority,
			com.vmware.vim.VirtualMachinePowerState state)
			throws java.rmi.RemoteException, com.vmware.vim.VmConfigFault,
			com.vmware.vim.Timedout, com.vmware.vim.FileFault,
			com.vmware.vim.InvalidState,
			com.vmware.vim.InsufficientResourcesFault,
			com.vmware.vim.MigrationFault, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference relocateVM_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.VirtualMachineRelocateSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.VmConfigFault,
			com.vmware.vim.Timedout, com.vmware.vim.FileFault,
			com.vmware.vim.InvalidState,
			com.vmware.vim.InsufficientResourcesFault,
			com.vmware.vim.MigrationFault, com.vmware.vim.InvalidDatastore,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference cloneVM_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference folder,
			java.lang.String name, com.vmware.vim.VirtualMachineCloneSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.VmConfigFault,
			com.vmware.vim.TaskInProgress, com.vmware.vim.CustomizationFault,
			com.vmware.vim.FileFault, com.vmware.vim.InvalidState,
			com.vmware.vim.InsufficientResourcesFault,
			com.vmware.vim.MigrationFault, com.vmware.vim.InvalidDatastore,
			com.vmware.vim.RuntimeFault;

	public void markAsTemplate(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.VmConfigFault,
			com.vmware.vim.InvalidState, com.vmware.vim.RuntimeFault;

	public void markAsVirtualMachine(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference pool,
			com.vmware.vim.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim.VmConfigFault,
			com.vmware.vim.FileFault, com.vmware.vim.InvalidState,
			com.vmware.vim.InvalidDatastore, com.vmware.vim.RuntimeFault;

	public void unregisterVM(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidPowerState,
			com.vmware.vim.RuntimeFault;

	public void resetGuestInformation(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault;

	public void mountToolsInstaller(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault;

	public void unmountToolsInstaller(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference upgradeTools_Task(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String installerOptions) throws java.rmi.RemoteException,
			com.vmware.vim.TaskInProgress, com.vmware.vim.VmToolsUpgradeFault,
			com.vmware.vim.InvalidState, com.vmware.vim.ToolsUnavailable,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.VirtualMachineMksTicket acquireMksTicket(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void setScreenResolution(
			com.vmware.vim.ManagedObjectReference _this, int width, int height)
			throws java.rmi.RemoteException, com.vmware.vim.ToolsUnavailable,
			com.vmware.vim.InvalidPowerState, com.vmware.vim.RuntimeFault;

	public void removeAlarm(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void reconfigureAlarm(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.AlarmSpec spec) throws java.rmi.RemoteException,
			com.vmware.vim.InvalidName, com.vmware.vim.DuplicateName,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference createAlarm(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity,
			com.vmware.vim.AlarmSpec spec) throws java.rmi.RemoteException,
			com.vmware.vim.InvalidName, com.vmware.vim.DuplicateName,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference[] getAlarm(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.AlarmState[] getAlarmState(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.Event[] readNextEvents(
			com.vmware.vim.ManagedObjectReference _this, int maxCount)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.Event[] readPreviousEvents(
			com.vmware.vim.ManagedObjectReference _this, int maxCount)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference createCollectorForEvents(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.EventFilterSpec filter)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault;

	public void logUserEvent(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity, java.lang.String msg)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.Event[] queryEvents(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.EventFilterSpec filter)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void reconfigureAutostart(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostAutoStartManagerConfig spec)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void autoStartPowerOn(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void autoStartPowerOff(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void enableHyperThreading(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void disableHyperThreading(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference searchDatastore_Task(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String datastorePath,
			com.vmware.vim.HostDatastoreBrowserSearchSpec searchSpec)
			throws java.rmi.RemoteException, com.vmware.vim.FileFault,
			com.vmware.vim.InvalidDatastore, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference searchDatastoreSubFolders_Task(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String datastorePath,
			com.vmware.vim.HostDatastoreBrowserSearchSpec searchSpec)
			throws java.rmi.RemoteException, com.vmware.vim.FileFault,
			com.vmware.vim.InvalidDatastore, com.vmware.vim.RuntimeFault;

	public void deleteFile(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String datastorePath) throws java.rmi.RemoteException,
			com.vmware.vim.FileFault, com.vmware.vim.InvalidDatastore,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.HostScsiDisk[] queryAvailableDisksForVmfs(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference datastore)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public com.vmware.vim.VmfsDatastoreOption[] queryVmfsDatastoreCreateOptions(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String devicePath) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public com.vmware.vim.ManagedObjectReference createVmfsDatastore(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.VmfsDatastoreCreateSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.DuplicateName, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.VmfsDatastoreOption[] queryVmfsDatastoreExtendOptions(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference datastore,
			java.lang.String devicePath) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public com.vmware.vim.ManagedObjectReference extendVmfsDatastore(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference datastore,
			com.vmware.vim.VmfsDatastoreExtendSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public com.vmware.vim.ManagedObjectReference createNasDatastore(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostNasVolumeSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.DuplicateName, com.vmware.vim.AlreadyExists,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference createLocalDatastore(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String name,
			java.lang.String path) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.DuplicateName,
			com.vmware.vim.RuntimeFault;

	public void removeDatastore(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference datastore)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.ResourceInUse, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void configureDatastorePrincipal(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String userName, java.lang.String password)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.InvalidState, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.HostDiagnosticPartition[] queryAvailablePartition(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault;

	public void selectActivePartition(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostScsiDiskPartition partition)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public com.vmware.vim.HostDiagnosticPartitionCreateOption[] queryPartitionCreateOptions(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String storageType, java.lang.String diagnosticType)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.HostDiagnosticPartitionCreateDescription queryPartitionCreateDesc(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String diskUuid, java.lang.String diagnosticType)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void createDiagnosticPartition(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostDiagnosticPartitionCreateSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void updateDefaultPolicy(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostFirewallDefaultPolicy defaultPolicy)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void enableRuleset(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String id) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void disableRuleset(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String id) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void refreshFirewall(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void createUser(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostAccountSpec user)
			throws java.rmi.RemoteException, com.vmware.vim.AlreadyExists,
			com.vmware.vim.RuntimeFault;

	public void updateUser(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostAccountSpec user)
			throws java.rmi.RemoteException, com.vmware.vim.AlreadyExists,
			com.vmware.vim.RuntimeFault, com.vmware.vim.UserNotFound;

	public void createGroup(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostAccountSpec group)
			throws java.rmi.RemoteException, com.vmware.vim.AlreadyExists,
			com.vmware.vim.RuntimeFault;

	public void removeUser(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String userName) throws java.rmi.RemoteException,
			com.vmware.vim.RuntimeFault, com.vmware.vim.UserNotFound;

	public void removeGroup(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String groupName) throws java.rmi.RemoteException,
			com.vmware.vim.RuntimeFault, com.vmware.vim.UserNotFound;

	public void assignUserToGroup(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String user, java.lang.String group)
			throws java.rmi.RemoteException, com.vmware.vim.AlreadyExists,
			com.vmware.vim.RuntimeFault, com.vmware.vim.UserNotFound;

	public void unassignUserFromGroup(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String user,
			java.lang.String group) throws java.rmi.RemoteException,
			com.vmware.vim.RuntimeFault, com.vmware.vim.UserNotFound;

	public void reconfigureServiceConsoleReservation(
			com.vmware.vim.ManagedObjectReference _this, long cfgBytes)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.HostNetworkConfigResult updateNetworkConfig(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostNetworkConfig config, java.lang.String changeMode)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.AlreadyExists, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void updateDnsConfig(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostDnsConfig config)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void updateIpRouteConfig(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostIpRouteConfig config)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault;

	public void updateConsoleIpRouteConfig(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostIpRouteConfig config)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault;

	public void addVirtualSwitch(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String vswitchName,
			com.vmware.vim.HostVirtualSwitchSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.ResourceInUse, com.vmware.vim.AlreadyExists,
			com.vmware.vim.RuntimeFault;

	public void removeVirtualSwitch(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String vswitchName) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.ResourceInUse,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void updateVirtualSwitch(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String vswitchName,
			com.vmware.vim.HostVirtualSwitchSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.ResourceInUse, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void addPortGroup(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostPortGroupSpec portgrp)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.AlreadyExists, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void removePortGroup(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String pgName) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.ResourceInUse,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void updatePortGroup(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String pgName, com.vmware.vim.HostPortGroupSpec portgrp)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void updatePhysicalNicLinkSpeed(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String device,
			com.vmware.vim.PhysicalNicLinkInfo linkSpeed)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public com.vmware.vim.PhysicalNicHintInfo[] queryNetworkHint(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String[] device) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public java.lang.String addVirtualNic(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String portgroup, com.vmware.vim.HostVirtualNicSpec nic)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.AlreadyExists, com.vmware.vim.RuntimeFault;

	public void removeVirtualNic(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String device) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void updateVirtualNic(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String device, com.vmware.vim.HostVirtualNicSpec nic)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public java.lang.String addServiceConsoleVirtualNic(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String portgroup, com.vmware.vim.HostVirtualNicSpec nic)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault;

	public void removeServiceConsoleVirtualNic(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String device)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.ResourceInUse, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void updateServiceConsoleVirtualNic(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String device, com.vmware.vim.HostVirtualNicSpec nic)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.ResourceInUse, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void restartServiceConsoleVirtualNic(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String device)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void refreshNetworkSystem(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void updateServicePolicy(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String id,
			java.lang.String policy) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void startService(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String id) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void stopService(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String id) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void restartService(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String id) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void uninstallService(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String id) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void refreshServices(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public boolean checkIfMasterSnmpAgentRunning(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void updateSnmpConfig(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostSnmpConfig config)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault;

	public void restartMasterSnmpAgent(
			com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault;

	public void stopMasterSnmpAgent(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.InvalidState, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.HostDiskPartitionInfo[] retrieveDiskPartitionInfo(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String[] devicePath) throws java.rmi.RemoteException,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.HostDiskPartitionInfo computeDiskPartitionInfo(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String devicePath,
			com.vmware.vim.HostDiskPartitionLayout layout)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void updateDiskPartitions(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String devicePath,
			com.vmware.vim.HostDiskPartitionSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public com.vmware.vim.HostVmfsVolume formatVmfs(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostVmfsSpec createSpec)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.AlreadyExists, com.vmware.vim.RuntimeFault;

	public void rescanVmfs(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault;

	public void attachVmfsExtent(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String vmfsPath,
			com.vmware.vim.HostScsiDiskPartition extent)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void upgradeVmfs(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String vmfsPath) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void upgradeVmLayout(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void rescanHba(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String hbaDevice) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void rescanAllHba(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault;

	public void updateSoftwareInternetScsiEnabled(
			com.vmware.vim.ManagedObjectReference _this, boolean enabled)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault;

	public void updateInternetScsiDiscoveryProperties(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim.HostInternetScsiHbaDiscoveryProperties discoveryProperties)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void updateInternetScsiAuthenticationProperties(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim.HostInternetScsiHbaAuthenticationProperties authenticationProperties)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void updateInternetScsiIPProperties(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim.HostInternetScsiHbaIPProperties ipProperties)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void updateInternetScsiName(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice, java.lang.String iScsiName)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void updateInternetScsiAlias(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice, java.lang.String iScsiAlias)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void addInternetScsiSendTargets(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim.HostInternetScsiHbaSendTarget[] targets)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void removeInternetScsiSendTargets(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim.HostInternetScsiHbaSendTarget[] targets)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void addInternetScsiStaticTargets(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim.HostInternetScsiHbaStaticTarget[] targets)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void removeInternetScsiStaticTargets(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim.HostInternetScsiHbaStaticTarget[] targets)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void enableMultipathPath(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String pathName) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void disableMultipathPath(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String pathName) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.RuntimeFault,
			com.vmware.vim.NotFound;

	public void setMultipathLunPolicy(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String lunId,
			com.vmware.vim.HostMultipathInfoLogicalUnitPolicy policy)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void refreshStorageSystem(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public void updateIpConfig(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostIpConfig ipConfig)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault, com.vmware.vim.NotFound;

	public void selectVnic(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String device) throws java.rmi.RemoteException,
			com.vmware.vim.HostConfigFault, com.vmware.vim.RuntimeFault;

	public void deselectVnic(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.HostConfigFault,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.OptionValue[] queryOptions(
			com.vmware.vim.ManagedObjectReference _this, java.lang.String name)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.RuntimeFault;

	public void updateOptions(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.OptionValue[] changedValue)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.RuntimeFault;

	public void removeScheduledTask(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault;

	public void reconfigureScheduledTask(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ScheduledTaskSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.DuplicateName, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault;

	public void runScheduledTask(com.vmware.vim.ManagedObjectReference _this)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidState,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference createScheduledTask(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity,
			com.vmware.vim.ScheduledTaskSpec spec)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.DuplicateName, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference[] retrieveEntityScheduledTask(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference entity)
			throws java.rmi.RemoteException, com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference revertToSnapshot_Task(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference host)
			throws java.rmi.RemoteException, com.vmware.vim.VmConfigFault,
			com.vmware.vim.TaskInProgress, com.vmware.vim.FileFault,
			com.vmware.vim.InvalidState,
			com.vmware.vim.InsufficientResourcesFault,
			com.vmware.vim.RuntimeFault;

	public com.vmware.vim.ManagedObjectReference removeSnapshot_Task(
			com.vmware.vim.ManagedObjectReference _this, boolean removeChildren)
			throws java.rmi.RemoteException, com.vmware.vim.TaskInProgress,
			com.vmware.vim.RuntimeFault;

	public void renameSnapshot(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String name, java.lang.String description)
			throws java.rmi.RemoteException, com.vmware.vim.InvalidName,
			com.vmware.vim.RuntimeFault;
}
