/**
 * ServiceContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ServiceContent  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference rootFolder;

    private com.vmware.vim25.ManagedObjectReference propertyCollector;

    private com.vmware.vim25.ManagedObjectReference viewManager;

    private com.vmware.vim25.AboutInfo about;

    private com.vmware.vim25.ManagedObjectReference setting;

    private com.vmware.vim25.ManagedObjectReference userDirectory;

    private com.vmware.vim25.ManagedObjectReference sessionManager;

    private com.vmware.vim25.ManagedObjectReference authorizationManager;

    private com.vmware.vim25.ManagedObjectReference perfManager;

    private com.vmware.vim25.ManagedObjectReference scheduledTaskManager;

    private com.vmware.vim25.ManagedObjectReference alarmManager;

    private com.vmware.vim25.ManagedObjectReference eventManager;

    private com.vmware.vim25.ManagedObjectReference taskManager;

    private com.vmware.vim25.ManagedObjectReference extensionManager;

    private com.vmware.vim25.ManagedObjectReference customizationSpecManager;

    private com.vmware.vim25.ManagedObjectReference customFieldsManager;

    private com.vmware.vim25.ManagedObjectReference accountManager;

    private com.vmware.vim25.ManagedObjectReference diagnosticManager;

    private com.vmware.vim25.ManagedObjectReference licenseManager;

    private com.vmware.vim25.ManagedObjectReference searchIndex;

    private com.vmware.vim25.ManagedObjectReference fileManager;

    private com.vmware.vim25.ManagedObjectReference virtualDiskManager;

    private com.vmware.vim25.ManagedObjectReference virtualizationManager;

    private com.vmware.vim25.ManagedObjectReference snmpSystem;

    private com.vmware.vim25.ManagedObjectReference vmProvisioningChecker;

    private com.vmware.vim25.ManagedObjectReference vmCompatibilityChecker;

    private com.vmware.vim25.ManagedObjectReference ovfManager;

    private com.vmware.vim25.ManagedObjectReference ipPoolManager;

    private com.vmware.vim25.ManagedObjectReference dvSwitchManager;

    private com.vmware.vim25.ManagedObjectReference hostProfileManager;

    private com.vmware.vim25.ManagedObjectReference clusterProfileManager;

    private com.vmware.vim25.ManagedObjectReference complianceManager;

    private com.vmware.vim25.ManagedObjectReference localizationManager;

    public ServiceContent() {
    }

    public ServiceContent(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ManagedObjectReference rootFolder,
           com.vmware.vim25.ManagedObjectReference propertyCollector,
           com.vmware.vim25.ManagedObjectReference viewManager,
           com.vmware.vim25.AboutInfo about,
           com.vmware.vim25.ManagedObjectReference setting,
           com.vmware.vim25.ManagedObjectReference userDirectory,
           com.vmware.vim25.ManagedObjectReference sessionManager,
           com.vmware.vim25.ManagedObjectReference authorizationManager,
           com.vmware.vim25.ManagedObjectReference perfManager,
           com.vmware.vim25.ManagedObjectReference scheduledTaskManager,
           com.vmware.vim25.ManagedObjectReference alarmManager,
           com.vmware.vim25.ManagedObjectReference eventManager,
           com.vmware.vim25.ManagedObjectReference taskManager,
           com.vmware.vim25.ManagedObjectReference extensionManager,
           com.vmware.vim25.ManagedObjectReference customizationSpecManager,
           com.vmware.vim25.ManagedObjectReference customFieldsManager,
           com.vmware.vim25.ManagedObjectReference accountManager,
           com.vmware.vim25.ManagedObjectReference diagnosticManager,
           com.vmware.vim25.ManagedObjectReference licenseManager,
           com.vmware.vim25.ManagedObjectReference searchIndex,
           com.vmware.vim25.ManagedObjectReference fileManager,
           com.vmware.vim25.ManagedObjectReference virtualDiskManager,
           com.vmware.vim25.ManagedObjectReference virtualizationManager,
           com.vmware.vim25.ManagedObjectReference snmpSystem,
           com.vmware.vim25.ManagedObjectReference vmProvisioningChecker,
           com.vmware.vim25.ManagedObjectReference vmCompatibilityChecker,
           com.vmware.vim25.ManagedObjectReference ovfManager,
           com.vmware.vim25.ManagedObjectReference ipPoolManager,
           com.vmware.vim25.ManagedObjectReference dvSwitchManager,
           com.vmware.vim25.ManagedObjectReference hostProfileManager,
           com.vmware.vim25.ManagedObjectReference clusterProfileManager,
           com.vmware.vim25.ManagedObjectReference complianceManager,
           com.vmware.vim25.ManagedObjectReference localizationManager) {
        super(
            dynamicType,
            dynamicProperty);
        this.rootFolder = rootFolder;
        this.propertyCollector = propertyCollector;
        this.viewManager = viewManager;
        this.about = about;
        this.setting = setting;
        this.userDirectory = userDirectory;
        this.sessionManager = sessionManager;
        this.authorizationManager = authorizationManager;
        this.perfManager = perfManager;
        this.scheduledTaskManager = scheduledTaskManager;
        this.alarmManager = alarmManager;
        this.eventManager = eventManager;
        this.taskManager = taskManager;
        this.extensionManager = extensionManager;
        this.customizationSpecManager = customizationSpecManager;
        this.customFieldsManager = customFieldsManager;
        this.accountManager = accountManager;
        this.diagnosticManager = diagnosticManager;
        this.licenseManager = licenseManager;
        this.searchIndex = searchIndex;
        this.fileManager = fileManager;
        this.virtualDiskManager = virtualDiskManager;
        this.virtualizationManager = virtualizationManager;
        this.snmpSystem = snmpSystem;
        this.vmProvisioningChecker = vmProvisioningChecker;
        this.vmCompatibilityChecker = vmCompatibilityChecker;
        this.ovfManager = ovfManager;
        this.ipPoolManager = ipPoolManager;
        this.dvSwitchManager = dvSwitchManager;
        this.hostProfileManager = hostProfileManager;
        this.clusterProfileManager = clusterProfileManager;
        this.complianceManager = complianceManager;
        this.localizationManager = localizationManager;
    }


    /**
     * Gets the rootFolder value for this ServiceContent.
     * 
     * @return rootFolder
     */
    public com.vmware.vim25.ManagedObjectReference getRootFolder() {
        return rootFolder;
    }


    /**
     * Sets the rootFolder value for this ServiceContent.
     * 
     * @param rootFolder
     */
    public void setRootFolder(com.vmware.vim25.ManagedObjectReference rootFolder) {
        this.rootFolder = rootFolder;
    }


    /**
     * Gets the propertyCollector value for this ServiceContent.
     * 
     * @return propertyCollector
     */
    public com.vmware.vim25.ManagedObjectReference getPropertyCollector() {
        return propertyCollector;
    }


    /**
     * Sets the propertyCollector value for this ServiceContent.
     * 
     * @param propertyCollector
     */
    public void setPropertyCollector(com.vmware.vim25.ManagedObjectReference propertyCollector) {
        this.propertyCollector = propertyCollector;
    }


    /**
     * Gets the viewManager value for this ServiceContent.
     * 
     * @return viewManager
     */
    public com.vmware.vim25.ManagedObjectReference getViewManager() {
        return viewManager;
    }


    /**
     * Sets the viewManager value for this ServiceContent.
     * 
     * @param viewManager
     */
    public void setViewManager(com.vmware.vim25.ManagedObjectReference viewManager) {
        this.viewManager = viewManager;
    }


    /**
     * Gets the about value for this ServiceContent.
     * 
     * @return about
     */
    public com.vmware.vim25.AboutInfo getAbout() {
        return about;
    }


    /**
     * Sets the about value for this ServiceContent.
     * 
     * @param about
     */
    public void setAbout(com.vmware.vim25.AboutInfo about) {
        this.about = about;
    }


    /**
     * Gets the setting value for this ServiceContent.
     * 
     * @return setting
     */
    public com.vmware.vim25.ManagedObjectReference getSetting() {
        return setting;
    }


    /**
     * Sets the setting value for this ServiceContent.
     * 
     * @param setting
     */
    public void setSetting(com.vmware.vim25.ManagedObjectReference setting) {
        this.setting = setting;
    }


    /**
     * Gets the userDirectory value for this ServiceContent.
     * 
     * @return userDirectory
     */
    public com.vmware.vim25.ManagedObjectReference getUserDirectory() {
        return userDirectory;
    }


    /**
     * Sets the userDirectory value for this ServiceContent.
     * 
     * @param userDirectory
     */
    public void setUserDirectory(com.vmware.vim25.ManagedObjectReference userDirectory) {
        this.userDirectory = userDirectory;
    }


    /**
     * Gets the sessionManager value for this ServiceContent.
     * 
     * @return sessionManager
     */
    public com.vmware.vim25.ManagedObjectReference getSessionManager() {
        return sessionManager;
    }


    /**
     * Sets the sessionManager value for this ServiceContent.
     * 
     * @param sessionManager
     */
    public void setSessionManager(com.vmware.vim25.ManagedObjectReference sessionManager) {
        this.sessionManager = sessionManager;
    }


    /**
     * Gets the authorizationManager value for this ServiceContent.
     * 
     * @return authorizationManager
     */
    public com.vmware.vim25.ManagedObjectReference getAuthorizationManager() {
        return authorizationManager;
    }


    /**
     * Sets the authorizationManager value for this ServiceContent.
     * 
     * @param authorizationManager
     */
    public void setAuthorizationManager(com.vmware.vim25.ManagedObjectReference authorizationManager) {
        this.authorizationManager = authorizationManager;
    }


    /**
     * Gets the perfManager value for this ServiceContent.
     * 
     * @return perfManager
     */
    public com.vmware.vim25.ManagedObjectReference getPerfManager() {
        return perfManager;
    }


    /**
     * Sets the perfManager value for this ServiceContent.
     * 
     * @param perfManager
     */
    public void setPerfManager(com.vmware.vim25.ManagedObjectReference perfManager) {
        this.perfManager = perfManager;
    }


    /**
     * Gets the scheduledTaskManager value for this ServiceContent.
     * 
     * @return scheduledTaskManager
     */
    public com.vmware.vim25.ManagedObjectReference getScheduledTaskManager() {
        return scheduledTaskManager;
    }


    /**
     * Sets the scheduledTaskManager value for this ServiceContent.
     * 
     * @param scheduledTaskManager
     */
    public void setScheduledTaskManager(com.vmware.vim25.ManagedObjectReference scheduledTaskManager) {
        this.scheduledTaskManager = scheduledTaskManager;
    }


    /**
     * Gets the alarmManager value for this ServiceContent.
     * 
     * @return alarmManager
     */
    public com.vmware.vim25.ManagedObjectReference getAlarmManager() {
        return alarmManager;
    }


    /**
     * Sets the alarmManager value for this ServiceContent.
     * 
     * @param alarmManager
     */
    public void setAlarmManager(com.vmware.vim25.ManagedObjectReference alarmManager) {
        this.alarmManager = alarmManager;
    }


    /**
     * Gets the eventManager value for this ServiceContent.
     * 
     * @return eventManager
     */
    public com.vmware.vim25.ManagedObjectReference getEventManager() {
        return eventManager;
    }


    /**
     * Sets the eventManager value for this ServiceContent.
     * 
     * @param eventManager
     */
    public void setEventManager(com.vmware.vim25.ManagedObjectReference eventManager) {
        this.eventManager = eventManager;
    }


    /**
     * Gets the taskManager value for this ServiceContent.
     * 
     * @return taskManager
     */
    public com.vmware.vim25.ManagedObjectReference getTaskManager() {
        return taskManager;
    }


    /**
     * Sets the taskManager value for this ServiceContent.
     * 
     * @param taskManager
     */
    public void setTaskManager(com.vmware.vim25.ManagedObjectReference taskManager) {
        this.taskManager = taskManager;
    }


    /**
     * Gets the extensionManager value for this ServiceContent.
     * 
     * @return extensionManager
     */
    public com.vmware.vim25.ManagedObjectReference getExtensionManager() {
        return extensionManager;
    }


    /**
     * Sets the extensionManager value for this ServiceContent.
     * 
     * @param extensionManager
     */
    public void setExtensionManager(com.vmware.vim25.ManagedObjectReference extensionManager) {
        this.extensionManager = extensionManager;
    }


    /**
     * Gets the customizationSpecManager value for this ServiceContent.
     * 
     * @return customizationSpecManager
     */
    public com.vmware.vim25.ManagedObjectReference getCustomizationSpecManager() {
        return customizationSpecManager;
    }


    /**
     * Sets the customizationSpecManager value for this ServiceContent.
     * 
     * @param customizationSpecManager
     */
    public void setCustomizationSpecManager(com.vmware.vim25.ManagedObjectReference customizationSpecManager) {
        this.customizationSpecManager = customizationSpecManager;
    }


    /**
     * Gets the customFieldsManager value for this ServiceContent.
     * 
     * @return customFieldsManager
     */
    public com.vmware.vim25.ManagedObjectReference getCustomFieldsManager() {
        return customFieldsManager;
    }


    /**
     * Sets the customFieldsManager value for this ServiceContent.
     * 
     * @param customFieldsManager
     */
    public void setCustomFieldsManager(com.vmware.vim25.ManagedObjectReference customFieldsManager) {
        this.customFieldsManager = customFieldsManager;
    }


    /**
     * Gets the accountManager value for this ServiceContent.
     * 
     * @return accountManager
     */
    public com.vmware.vim25.ManagedObjectReference getAccountManager() {
        return accountManager;
    }


    /**
     * Sets the accountManager value for this ServiceContent.
     * 
     * @param accountManager
     */
    public void setAccountManager(com.vmware.vim25.ManagedObjectReference accountManager) {
        this.accountManager = accountManager;
    }


    /**
     * Gets the diagnosticManager value for this ServiceContent.
     * 
     * @return diagnosticManager
     */
    public com.vmware.vim25.ManagedObjectReference getDiagnosticManager() {
        return diagnosticManager;
    }


    /**
     * Sets the diagnosticManager value for this ServiceContent.
     * 
     * @param diagnosticManager
     */
    public void setDiagnosticManager(com.vmware.vim25.ManagedObjectReference diagnosticManager) {
        this.diagnosticManager = diagnosticManager;
    }


    /**
     * Gets the licenseManager value for this ServiceContent.
     * 
     * @return licenseManager
     */
    public com.vmware.vim25.ManagedObjectReference getLicenseManager() {
        return licenseManager;
    }


    /**
     * Sets the licenseManager value for this ServiceContent.
     * 
     * @param licenseManager
     */
    public void setLicenseManager(com.vmware.vim25.ManagedObjectReference licenseManager) {
        this.licenseManager = licenseManager;
    }


    /**
     * Gets the searchIndex value for this ServiceContent.
     * 
     * @return searchIndex
     */
    public com.vmware.vim25.ManagedObjectReference getSearchIndex() {
        return searchIndex;
    }


    /**
     * Sets the searchIndex value for this ServiceContent.
     * 
     * @param searchIndex
     */
    public void setSearchIndex(com.vmware.vim25.ManagedObjectReference searchIndex) {
        this.searchIndex = searchIndex;
    }


    /**
     * Gets the fileManager value for this ServiceContent.
     * 
     * @return fileManager
     */
    public com.vmware.vim25.ManagedObjectReference getFileManager() {
        return fileManager;
    }


    /**
     * Sets the fileManager value for this ServiceContent.
     * 
     * @param fileManager
     */
    public void setFileManager(com.vmware.vim25.ManagedObjectReference fileManager) {
        this.fileManager = fileManager;
    }


    /**
     * Gets the virtualDiskManager value for this ServiceContent.
     * 
     * @return virtualDiskManager
     */
    public com.vmware.vim25.ManagedObjectReference getVirtualDiskManager() {
        return virtualDiskManager;
    }


    /**
     * Sets the virtualDiskManager value for this ServiceContent.
     * 
     * @param virtualDiskManager
     */
    public void setVirtualDiskManager(com.vmware.vim25.ManagedObjectReference virtualDiskManager) {
        this.virtualDiskManager = virtualDiskManager;
    }


    /**
     * Gets the virtualizationManager value for this ServiceContent.
     * 
     * @return virtualizationManager
     */
    public com.vmware.vim25.ManagedObjectReference getVirtualizationManager() {
        return virtualizationManager;
    }


    /**
     * Sets the virtualizationManager value for this ServiceContent.
     * 
     * @param virtualizationManager
     */
    public void setVirtualizationManager(com.vmware.vim25.ManagedObjectReference virtualizationManager) {
        this.virtualizationManager = virtualizationManager;
    }


    /**
     * Gets the snmpSystem value for this ServiceContent.
     * 
     * @return snmpSystem
     */
    public com.vmware.vim25.ManagedObjectReference getSnmpSystem() {
        return snmpSystem;
    }


    /**
     * Sets the snmpSystem value for this ServiceContent.
     * 
     * @param snmpSystem
     */
    public void setSnmpSystem(com.vmware.vim25.ManagedObjectReference snmpSystem) {
        this.snmpSystem = snmpSystem;
    }


    /**
     * Gets the vmProvisioningChecker value for this ServiceContent.
     * 
     * @return vmProvisioningChecker
     */
    public com.vmware.vim25.ManagedObjectReference getVmProvisioningChecker() {
        return vmProvisioningChecker;
    }


    /**
     * Sets the vmProvisioningChecker value for this ServiceContent.
     * 
     * @param vmProvisioningChecker
     */
    public void setVmProvisioningChecker(com.vmware.vim25.ManagedObjectReference vmProvisioningChecker) {
        this.vmProvisioningChecker = vmProvisioningChecker;
    }


    /**
     * Gets the vmCompatibilityChecker value for this ServiceContent.
     * 
     * @return vmCompatibilityChecker
     */
    public com.vmware.vim25.ManagedObjectReference getVmCompatibilityChecker() {
        return vmCompatibilityChecker;
    }


    /**
     * Sets the vmCompatibilityChecker value for this ServiceContent.
     * 
     * @param vmCompatibilityChecker
     */
    public void setVmCompatibilityChecker(com.vmware.vim25.ManagedObjectReference vmCompatibilityChecker) {
        this.vmCompatibilityChecker = vmCompatibilityChecker;
    }


    /**
     * Gets the ovfManager value for this ServiceContent.
     * 
     * @return ovfManager
     */
    public com.vmware.vim25.ManagedObjectReference getOvfManager() {
        return ovfManager;
    }


    /**
     * Sets the ovfManager value for this ServiceContent.
     * 
     * @param ovfManager
     */
    public void setOvfManager(com.vmware.vim25.ManagedObjectReference ovfManager) {
        this.ovfManager = ovfManager;
    }


    /**
     * Gets the ipPoolManager value for this ServiceContent.
     * 
     * @return ipPoolManager
     */
    public com.vmware.vim25.ManagedObjectReference getIpPoolManager() {
        return ipPoolManager;
    }


    /**
     * Sets the ipPoolManager value for this ServiceContent.
     * 
     * @param ipPoolManager
     */
    public void setIpPoolManager(com.vmware.vim25.ManagedObjectReference ipPoolManager) {
        this.ipPoolManager = ipPoolManager;
    }


    /**
     * Gets the dvSwitchManager value for this ServiceContent.
     * 
     * @return dvSwitchManager
     */
    public com.vmware.vim25.ManagedObjectReference getDvSwitchManager() {
        return dvSwitchManager;
    }


    /**
     * Sets the dvSwitchManager value for this ServiceContent.
     * 
     * @param dvSwitchManager
     */
    public void setDvSwitchManager(com.vmware.vim25.ManagedObjectReference dvSwitchManager) {
        this.dvSwitchManager = dvSwitchManager;
    }


    /**
     * Gets the hostProfileManager value for this ServiceContent.
     * 
     * @return hostProfileManager
     */
    public com.vmware.vim25.ManagedObjectReference getHostProfileManager() {
        return hostProfileManager;
    }


    /**
     * Sets the hostProfileManager value for this ServiceContent.
     * 
     * @param hostProfileManager
     */
    public void setHostProfileManager(com.vmware.vim25.ManagedObjectReference hostProfileManager) {
        this.hostProfileManager = hostProfileManager;
    }


    /**
     * Gets the clusterProfileManager value for this ServiceContent.
     * 
     * @return clusterProfileManager
     */
    public com.vmware.vim25.ManagedObjectReference getClusterProfileManager() {
        return clusterProfileManager;
    }


    /**
     * Sets the clusterProfileManager value for this ServiceContent.
     * 
     * @param clusterProfileManager
     */
    public void setClusterProfileManager(com.vmware.vim25.ManagedObjectReference clusterProfileManager) {
        this.clusterProfileManager = clusterProfileManager;
    }


    /**
     * Gets the complianceManager value for this ServiceContent.
     * 
     * @return complianceManager
     */
    public com.vmware.vim25.ManagedObjectReference getComplianceManager() {
        return complianceManager;
    }


    /**
     * Sets the complianceManager value for this ServiceContent.
     * 
     * @param complianceManager
     */
    public void setComplianceManager(com.vmware.vim25.ManagedObjectReference complianceManager) {
        this.complianceManager = complianceManager;
    }


    /**
     * Gets the localizationManager value for this ServiceContent.
     * 
     * @return localizationManager
     */
    public com.vmware.vim25.ManagedObjectReference getLocalizationManager() {
        return localizationManager;
    }


    /**
     * Sets the localizationManager value for this ServiceContent.
     * 
     * @param localizationManager
     */
    public void setLocalizationManager(com.vmware.vim25.ManagedObjectReference localizationManager) {
        this.localizationManager = localizationManager;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceContent)) return false;
        ServiceContent other = (ServiceContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rootFolder==null && other.getRootFolder()==null) || 
             (this.rootFolder!=null &&
              this.rootFolder.equals(other.getRootFolder()))) &&
            ((this.propertyCollector==null && other.getPropertyCollector()==null) || 
             (this.propertyCollector!=null &&
              this.propertyCollector.equals(other.getPropertyCollector()))) &&
            ((this.viewManager==null && other.getViewManager()==null) || 
             (this.viewManager!=null &&
              this.viewManager.equals(other.getViewManager()))) &&
            ((this.about==null && other.getAbout()==null) || 
             (this.about!=null &&
              this.about.equals(other.getAbout()))) &&
            ((this.setting==null && other.getSetting()==null) || 
             (this.setting!=null &&
              this.setting.equals(other.getSetting()))) &&
            ((this.userDirectory==null && other.getUserDirectory()==null) || 
             (this.userDirectory!=null &&
              this.userDirectory.equals(other.getUserDirectory()))) &&
            ((this.sessionManager==null && other.getSessionManager()==null) || 
             (this.sessionManager!=null &&
              this.sessionManager.equals(other.getSessionManager()))) &&
            ((this.authorizationManager==null && other.getAuthorizationManager()==null) || 
             (this.authorizationManager!=null &&
              this.authorizationManager.equals(other.getAuthorizationManager()))) &&
            ((this.perfManager==null && other.getPerfManager()==null) || 
             (this.perfManager!=null &&
              this.perfManager.equals(other.getPerfManager()))) &&
            ((this.scheduledTaskManager==null && other.getScheduledTaskManager()==null) || 
             (this.scheduledTaskManager!=null &&
              this.scheduledTaskManager.equals(other.getScheduledTaskManager()))) &&
            ((this.alarmManager==null && other.getAlarmManager()==null) || 
             (this.alarmManager!=null &&
              this.alarmManager.equals(other.getAlarmManager()))) &&
            ((this.eventManager==null && other.getEventManager()==null) || 
             (this.eventManager!=null &&
              this.eventManager.equals(other.getEventManager()))) &&
            ((this.taskManager==null && other.getTaskManager()==null) || 
             (this.taskManager!=null &&
              this.taskManager.equals(other.getTaskManager()))) &&
            ((this.extensionManager==null && other.getExtensionManager()==null) || 
             (this.extensionManager!=null &&
              this.extensionManager.equals(other.getExtensionManager()))) &&
            ((this.customizationSpecManager==null && other.getCustomizationSpecManager()==null) || 
             (this.customizationSpecManager!=null &&
              this.customizationSpecManager.equals(other.getCustomizationSpecManager()))) &&
            ((this.customFieldsManager==null && other.getCustomFieldsManager()==null) || 
             (this.customFieldsManager!=null &&
              this.customFieldsManager.equals(other.getCustomFieldsManager()))) &&
            ((this.accountManager==null && other.getAccountManager()==null) || 
             (this.accountManager!=null &&
              this.accountManager.equals(other.getAccountManager()))) &&
            ((this.diagnosticManager==null && other.getDiagnosticManager()==null) || 
             (this.diagnosticManager!=null &&
              this.diagnosticManager.equals(other.getDiagnosticManager()))) &&
            ((this.licenseManager==null && other.getLicenseManager()==null) || 
             (this.licenseManager!=null &&
              this.licenseManager.equals(other.getLicenseManager()))) &&
            ((this.searchIndex==null && other.getSearchIndex()==null) || 
             (this.searchIndex!=null &&
              this.searchIndex.equals(other.getSearchIndex()))) &&
            ((this.fileManager==null && other.getFileManager()==null) || 
             (this.fileManager!=null &&
              this.fileManager.equals(other.getFileManager()))) &&
            ((this.virtualDiskManager==null && other.getVirtualDiskManager()==null) || 
             (this.virtualDiskManager!=null &&
              this.virtualDiskManager.equals(other.getVirtualDiskManager()))) &&
            ((this.virtualizationManager==null && other.getVirtualizationManager()==null) || 
             (this.virtualizationManager!=null &&
              this.virtualizationManager.equals(other.getVirtualizationManager()))) &&
            ((this.snmpSystem==null && other.getSnmpSystem()==null) || 
             (this.snmpSystem!=null &&
              this.snmpSystem.equals(other.getSnmpSystem()))) &&
            ((this.vmProvisioningChecker==null && other.getVmProvisioningChecker()==null) || 
             (this.vmProvisioningChecker!=null &&
              this.vmProvisioningChecker.equals(other.getVmProvisioningChecker()))) &&
            ((this.vmCompatibilityChecker==null && other.getVmCompatibilityChecker()==null) || 
             (this.vmCompatibilityChecker!=null &&
              this.vmCompatibilityChecker.equals(other.getVmCompatibilityChecker()))) &&
            ((this.ovfManager==null && other.getOvfManager()==null) || 
             (this.ovfManager!=null &&
              this.ovfManager.equals(other.getOvfManager()))) &&
            ((this.ipPoolManager==null && other.getIpPoolManager()==null) || 
             (this.ipPoolManager!=null &&
              this.ipPoolManager.equals(other.getIpPoolManager()))) &&
            ((this.dvSwitchManager==null && other.getDvSwitchManager()==null) || 
             (this.dvSwitchManager!=null &&
              this.dvSwitchManager.equals(other.getDvSwitchManager()))) &&
            ((this.hostProfileManager==null && other.getHostProfileManager()==null) || 
             (this.hostProfileManager!=null &&
              this.hostProfileManager.equals(other.getHostProfileManager()))) &&
            ((this.clusterProfileManager==null && other.getClusterProfileManager()==null) || 
             (this.clusterProfileManager!=null &&
              this.clusterProfileManager.equals(other.getClusterProfileManager()))) &&
            ((this.complianceManager==null && other.getComplianceManager()==null) || 
             (this.complianceManager!=null &&
              this.complianceManager.equals(other.getComplianceManager()))) &&
            ((this.localizationManager==null && other.getLocalizationManager()==null) || 
             (this.localizationManager!=null &&
              this.localizationManager.equals(other.getLocalizationManager())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getRootFolder() != null) {
            _hashCode += getRootFolder().hashCode();
        }
        if (getPropertyCollector() != null) {
            _hashCode += getPropertyCollector().hashCode();
        }
        if (getViewManager() != null) {
            _hashCode += getViewManager().hashCode();
        }
        if (getAbout() != null) {
            _hashCode += getAbout().hashCode();
        }
        if (getSetting() != null) {
            _hashCode += getSetting().hashCode();
        }
        if (getUserDirectory() != null) {
            _hashCode += getUserDirectory().hashCode();
        }
        if (getSessionManager() != null) {
            _hashCode += getSessionManager().hashCode();
        }
        if (getAuthorizationManager() != null) {
            _hashCode += getAuthorizationManager().hashCode();
        }
        if (getPerfManager() != null) {
            _hashCode += getPerfManager().hashCode();
        }
        if (getScheduledTaskManager() != null) {
            _hashCode += getScheduledTaskManager().hashCode();
        }
        if (getAlarmManager() != null) {
            _hashCode += getAlarmManager().hashCode();
        }
        if (getEventManager() != null) {
            _hashCode += getEventManager().hashCode();
        }
        if (getTaskManager() != null) {
            _hashCode += getTaskManager().hashCode();
        }
        if (getExtensionManager() != null) {
            _hashCode += getExtensionManager().hashCode();
        }
        if (getCustomizationSpecManager() != null) {
            _hashCode += getCustomizationSpecManager().hashCode();
        }
        if (getCustomFieldsManager() != null) {
            _hashCode += getCustomFieldsManager().hashCode();
        }
        if (getAccountManager() != null) {
            _hashCode += getAccountManager().hashCode();
        }
        if (getDiagnosticManager() != null) {
            _hashCode += getDiagnosticManager().hashCode();
        }
        if (getLicenseManager() != null) {
            _hashCode += getLicenseManager().hashCode();
        }
        if (getSearchIndex() != null) {
            _hashCode += getSearchIndex().hashCode();
        }
        if (getFileManager() != null) {
            _hashCode += getFileManager().hashCode();
        }
        if (getVirtualDiskManager() != null) {
            _hashCode += getVirtualDiskManager().hashCode();
        }
        if (getVirtualizationManager() != null) {
            _hashCode += getVirtualizationManager().hashCode();
        }
        if (getSnmpSystem() != null) {
            _hashCode += getSnmpSystem().hashCode();
        }
        if (getVmProvisioningChecker() != null) {
            _hashCode += getVmProvisioningChecker().hashCode();
        }
        if (getVmCompatibilityChecker() != null) {
            _hashCode += getVmCompatibilityChecker().hashCode();
        }
        if (getOvfManager() != null) {
            _hashCode += getOvfManager().hashCode();
        }
        if (getIpPoolManager() != null) {
            _hashCode += getIpPoolManager().hashCode();
        }
        if (getDvSwitchManager() != null) {
            _hashCode += getDvSwitchManager().hashCode();
        }
        if (getHostProfileManager() != null) {
            _hashCode += getHostProfileManager().hashCode();
        }
        if (getClusterProfileManager() != null) {
            _hashCode += getClusterProfileManager().hashCode();
        }
        if (getComplianceManager() != null) {
            _hashCode += getComplianceManager().hashCode();
        }
        if (getLocalizationManager() != null) {
            _hashCode += getLocalizationManager().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ServiceContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rootFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyCollector");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "propertyCollector"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "viewManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("about");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "about"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AboutInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "setting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDirectory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userDirectory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sessionManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "authorizationManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "perfManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledTaskManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scheduledTaskManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarmManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "alarmManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eventManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "taskManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extensionManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizationSpecManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "customizationSpecManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldsManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "customFieldsManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "accountManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diagnosticManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "licenseManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "searchIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fileManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualDiskManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualDiskManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualizationManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualizationManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snmpSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "snmpSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmProvisioningChecker");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmProvisioningChecker"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmCompatibilityChecker");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmCompatibilityChecker"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovfManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ovfManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipPoolManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipPoolManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvSwitchManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvSwitchManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostProfileManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostProfileManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterProfileManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "clusterProfileManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complianceManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "complianceManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizationManager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "localizationManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
