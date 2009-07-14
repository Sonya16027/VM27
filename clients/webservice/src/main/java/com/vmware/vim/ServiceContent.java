/**
 * ServiceContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ServiceContent extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference rootFolder;

	private com.vmware.vim.ManagedObjectReference propertyCollector;

	private com.vmware.vim.AboutInfo about;

	private com.vmware.vim.ManagedObjectReference setting;

	private com.vmware.vim.ManagedObjectReference userDirectory;

	private com.vmware.vim.ManagedObjectReference sessionManager;

	private com.vmware.vim.ManagedObjectReference authorizationManager;

	private com.vmware.vim.ManagedObjectReference perfManager;

	private com.vmware.vim.ManagedObjectReference scheduledTaskManager;

	private com.vmware.vim.ManagedObjectReference alarmManager;

	private com.vmware.vim.ManagedObjectReference eventManager;

	private com.vmware.vim.ManagedObjectReference taskManager;

	private com.vmware.vim.ManagedObjectReference customizationSpecManager;

	private com.vmware.vim.ManagedObjectReference customFieldsManager;

	private com.vmware.vim.ManagedObjectReference accountManager;

	private com.vmware.vim.ManagedObjectReference diagnosticManager;

	private com.vmware.vim.ManagedObjectReference licenseManager;

	private com.vmware.vim.ManagedObjectReference searchIndex;

	public ServiceContent() {
	}

	public ServiceContent(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.ManagedObjectReference rootFolder,
			com.vmware.vim.ManagedObjectReference propertyCollector,
			com.vmware.vim.AboutInfo about,
			com.vmware.vim.ManagedObjectReference setting,
			com.vmware.vim.ManagedObjectReference userDirectory,
			com.vmware.vim.ManagedObjectReference sessionManager,
			com.vmware.vim.ManagedObjectReference authorizationManager,
			com.vmware.vim.ManagedObjectReference perfManager,
			com.vmware.vim.ManagedObjectReference scheduledTaskManager,
			com.vmware.vim.ManagedObjectReference alarmManager,
			com.vmware.vim.ManagedObjectReference eventManager,
			com.vmware.vim.ManagedObjectReference taskManager,
			com.vmware.vim.ManagedObjectReference customizationSpecManager,
			com.vmware.vim.ManagedObjectReference customFieldsManager,
			com.vmware.vim.ManagedObjectReference accountManager,
			com.vmware.vim.ManagedObjectReference diagnosticManager,
			com.vmware.vim.ManagedObjectReference licenseManager,
			com.vmware.vim.ManagedObjectReference searchIndex) {
		super(dynamicType, dynamicProperty);
		this.rootFolder = rootFolder;
		this.propertyCollector = propertyCollector;
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
		this.customizationSpecManager = customizationSpecManager;
		this.customFieldsManager = customFieldsManager;
		this.accountManager = accountManager;
		this.diagnosticManager = diagnosticManager;
		this.licenseManager = licenseManager;
		this.searchIndex = searchIndex;
	}

	/**
	 * Gets the rootFolder value for this ServiceContent.
	 * 
	 * @return rootFolder
	 */
	public com.vmware.vim.ManagedObjectReference getRootFolder() {
		return rootFolder;
	}

	/**
	 * Sets the rootFolder value for this ServiceContent.
	 * 
	 * @param rootFolder
	 */
	public void setRootFolder(com.vmware.vim.ManagedObjectReference rootFolder) {
		this.rootFolder = rootFolder;
	}

	/**
	 * Gets the propertyCollector value for this ServiceContent.
	 * 
	 * @return propertyCollector
	 */
	public com.vmware.vim.ManagedObjectReference getPropertyCollector() {
		return propertyCollector;
	}

	/**
	 * Sets the propertyCollector value for this ServiceContent.
	 * 
	 * @param propertyCollector
	 */
	public void setPropertyCollector(
			com.vmware.vim.ManagedObjectReference propertyCollector) {
		this.propertyCollector = propertyCollector;
	}

	/**
	 * Gets the about value for this ServiceContent.
	 * 
	 * @return about
	 */
	public com.vmware.vim.AboutInfo getAbout() {
		return about;
	}

	/**
	 * Sets the about value for this ServiceContent.
	 * 
	 * @param about
	 */
	public void setAbout(com.vmware.vim.AboutInfo about) {
		this.about = about;
	}

	/**
	 * Gets the setting value for this ServiceContent.
	 * 
	 * @return setting
	 */
	public com.vmware.vim.ManagedObjectReference getSetting() {
		return setting;
	}

	/**
	 * Sets the setting value for this ServiceContent.
	 * 
	 * @param setting
	 */
	public void setSetting(com.vmware.vim.ManagedObjectReference setting) {
		this.setting = setting;
	}

	/**
	 * Gets the userDirectory value for this ServiceContent.
	 * 
	 * @return userDirectory
	 */
	public com.vmware.vim.ManagedObjectReference getUserDirectory() {
		return userDirectory;
	}

	/**
	 * Sets the userDirectory value for this ServiceContent.
	 * 
	 * @param userDirectory
	 */
	public void setUserDirectory(
			com.vmware.vim.ManagedObjectReference userDirectory) {
		this.userDirectory = userDirectory;
	}

	/**
	 * Gets the sessionManager value for this ServiceContent.
	 * 
	 * @return sessionManager
	 */
	public com.vmware.vim.ManagedObjectReference getSessionManager() {
		return sessionManager;
	}

	/**
	 * Sets the sessionManager value for this ServiceContent.
	 * 
	 * @param sessionManager
	 */
	public void setSessionManager(
			com.vmware.vim.ManagedObjectReference sessionManager) {
		this.sessionManager = sessionManager;
	}

	/**
	 * Gets the authorizationManager value for this ServiceContent.
	 * 
	 * @return authorizationManager
	 */
	public com.vmware.vim.ManagedObjectReference getAuthorizationManager() {
		return authorizationManager;
	}

	/**
	 * Sets the authorizationManager value for this ServiceContent.
	 * 
	 * @param authorizationManager
	 */
	public void setAuthorizationManager(
			com.vmware.vim.ManagedObjectReference authorizationManager) {
		this.authorizationManager = authorizationManager;
	}

	/**
	 * Gets the perfManager value for this ServiceContent.
	 * 
	 * @return perfManager
	 */
	public com.vmware.vim.ManagedObjectReference getPerfManager() {
		return perfManager;
	}

	/**
	 * Sets the perfManager value for this ServiceContent.
	 * 
	 * @param perfManager
	 */
	public void setPerfManager(com.vmware.vim.ManagedObjectReference perfManager) {
		this.perfManager = perfManager;
	}

	/**
	 * Gets the scheduledTaskManager value for this ServiceContent.
	 * 
	 * @return scheduledTaskManager
	 */
	public com.vmware.vim.ManagedObjectReference getScheduledTaskManager() {
		return scheduledTaskManager;
	}

	/**
	 * Sets the scheduledTaskManager value for this ServiceContent.
	 * 
	 * @param scheduledTaskManager
	 */
	public void setScheduledTaskManager(
			com.vmware.vim.ManagedObjectReference scheduledTaskManager) {
		this.scheduledTaskManager = scheduledTaskManager;
	}

	/**
	 * Gets the alarmManager value for this ServiceContent.
	 * 
	 * @return alarmManager
	 */
	public com.vmware.vim.ManagedObjectReference getAlarmManager() {
		return alarmManager;
	}

	/**
	 * Sets the alarmManager value for this ServiceContent.
	 * 
	 * @param alarmManager
	 */
	public void setAlarmManager(
			com.vmware.vim.ManagedObjectReference alarmManager) {
		this.alarmManager = alarmManager;
	}

	/**
	 * Gets the eventManager value for this ServiceContent.
	 * 
	 * @return eventManager
	 */
	public com.vmware.vim.ManagedObjectReference getEventManager() {
		return eventManager;
	}

	/**
	 * Sets the eventManager value for this ServiceContent.
	 * 
	 * @param eventManager
	 */
	public void setEventManager(
			com.vmware.vim.ManagedObjectReference eventManager) {
		this.eventManager = eventManager;
	}

	/**
	 * Gets the taskManager value for this ServiceContent.
	 * 
	 * @return taskManager
	 */
	public com.vmware.vim.ManagedObjectReference getTaskManager() {
		return taskManager;
	}

	/**
	 * Sets the taskManager value for this ServiceContent.
	 * 
	 * @param taskManager
	 */
	public void setTaskManager(com.vmware.vim.ManagedObjectReference taskManager) {
		this.taskManager = taskManager;
	}

	/**
	 * Gets the customizationSpecManager value for this ServiceContent.
	 * 
	 * @return customizationSpecManager
	 */
	public com.vmware.vim.ManagedObjectReference getCustomizationSpecManager() {
		return customizationSpecManager;
	}

	/**
	 * Sets the customizationSpecManager value for this ServiceContent.
	 * 
	 * @param customizationSpecManager
	 */
	public void setCustomizationSpecManager(
			com.vmware.vim.ManagedObjectReference customizationSpecManager) {
		this.customizationSpecManager = customizationSpecManager;
	}

	/**
	 * Gets the customFieldsManager value for this ServiceContent.
	 * 
	 * @return customFieldsManager
	 */
	public com.vmware.vim.ManagedObjectReference getCustomFieldsManager() {
		return customFieldsManager;
	}

	/**
	 * Sets the customFieldsManager value for this ServiceContent.
	 * 
	 * @param customFieldsManager
	 */
	public void setCustomFieldsManager(
			com.vmware.vim.ManagedObjectReference customFieldsManager) {
		this.customFieldsManager = customFieldsManager;
	}

	/**
	 * Gets the accountManager value for this ServiceContent.
	 * 
	 * @return accountManager
	 */
	public com.vmware.vim.ManagedObjectReference getAccountManager() {
		return accountManager;
	}

	/**
	 * Sets the accountManager value for this ServiceContent.
	 * 
	 * @param accountManager
	 */
	public void setAccountManager(
			com.vmware.vim.ManagedObjectReference accountManager) {
		this.accountManager = accountManager;
	}

	/**
	 * Gets the diagnosticManager value for this ServiceContent.
	 * 
	 * @return diagnosticManager
	 */
	public com.vmware.vim.ManagedObjectReference getDiagnosticManager() {
		return diagnosticManager;
	}

	/**
	 * Sets the diagnosticManager value for this ServiceContent.
	 * 
	 * @param diagnosticManager
	 */
	public void setDiagnosticManager(
			com.vmware.vim.ManagedObjectReference diagnosticManager) {
		this.diagnosticManager = diagnosticManager;
	}

	/**
	 * Gets the licenseManager value for this ServiceContent.
	 * 
	 * @return licenseManager
	 */
	public com.vmware.vim.ManagedObjectReference getLicenseManager() {
		return licenseManager;
	}

	/**
	 * Sets the licenseManager value for this ServiceContent.
	 * 
	 * @param licenseManager
	 */
	public void setLicenseManager(
			com.vmware.vim.ManagedObjectReference licenseManager) {
		this.licenseManager = licenseManager;
	}

	/**
	 * Gets the searchIndex value for this ServiceContent.
	 * 
	 * @return searchIndex
	 */
	public com.vmware.vim.ManagedObjectReference getSearchIndex() {
		return searchIndex;
	}

	/**
	 * Sets the searchIndex value for this ServiceContent.
	 * 
	 * @param searchIndex
	 */
	public void setSearchIndex(com.vmware.vim.ManagedObjectReference searchIndex) {
		this.searchIndex = searchIndex;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ServiceContent)) {
			return false;
		}
		ServiceContent other = (ServiceContent) obj;
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = super.equals(obj)
				&& ((this.rootFolder == null && other.getRootFolder() == null) || (this.rootFolder != null && this.rootFolder
						.equals(other.getRootFolder())))
				&& ((this.propertyCollector == null && other
						.getPropertyCollector() == null) || (this.propertyCollector != null && this.propertyCollector
						.equals(other.getPropertyCollector())))
				&& ((this.about == null && other.getAbout() == null) || (this.about != null && this.about
						.equals(other.getAbout())))
				&& ((this.setting == null && other.getSetting() == null) || (this.setting != null && this.setting
						.equals(other.getSetting())))
				&& ((this.userDirectory == null && other.getUserDirectory() == null) || (this.userDirectory != null && this.userDirectory
						.equals(other.getUserDirectory())))
				&& ((this.sessionManager == null && other.getSessionManager() == null) || (this.sessionManager != null && this.sessionManager
						.equals(other.getSessionManager())))
				&& ((this.authorizationManager == null && other
						.getAuthorizationManager() == null) || (this.authorizationManager != null && this.authorizationManager
						.equals(other.getAuthorizationManager())))
				&& ((this.perfManager == null && other.getPerfManager() == null) || (this.perfManager != null && this.perfManager
						.equals(other.getPerfManager())))
				&& ((this.scheduledTaskManager == null && other
						.getScheduledTaskManager() == null) || (this.scheduledTaskManager != null && this.scheduledTaskManager
						.equals(other.getScheduledTaskManager())))
				&& ((this.alarmManager == null && other.getAlarmManager() == null) || (this.alarmManager != null && this.alarmManager
						.equals(other.getAlarmManager())))
				&& ((this.eventManager == null && other.getEventManager() == null) || (this.eventManager != null && this.eventManager
						.equals(other.getEventManager())))
				&& ((this.taskManager == null && other.getTaskManager() == null) || (this.taskManager != null && this.taskManager
						.equals(other.getTaskManager())))
				&& ((this.customizationSpecManager == null && other
						.getCustomizationSpecManager() == null) || (this.customizationSpecManager != null && this.customizationSpecManager
						.equals(other.getCustomizationSpecManager())))
				&& ((this.customFieldsManager == null && other
						.getCustomFieldsManager() == null) || (this.customFieldsManager != null && this.customFieldsManager
						.equals(other.getCustomFieldsManager())))
				&& ((this.accountManager == null && other.getAccountManager() == null) || (this.accountManager != null && this.accountManager
						.equals(other.getAccountManager())))
				&& ((this.diagnosticManager == null && other
						.getDiagnosticManager() == null) || (this.diagnosticManager != null && this.diagnosticManager
						.equals(other.getDiagnosticManager())))
				&& ((this.licenseManager == null && other.getLicenseManager() == null) || (this.licenseManager != null && this.licenseManager
						.equals(other.getLicenseManager())))
				&& ((this.searchIndex == null && other.getSearchIndex() == null) || (this.searchIndex != null && this.searchIndex
						.equals(other.getSearchIndex())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	@Override
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
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ServiceContent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ServiceContent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rootFolder");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"rootFolder"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("propertyCollector");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"propertyCollector"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("about");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "about"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"AboutInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("setting");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"setting"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("userDirectory");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"userDirectory"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sessionManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"sessionManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("authorizationManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"authorizationManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("perfManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"perfManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("scheduledTaskManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"scheduledTaskManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("alarmManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"alarmManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("eventManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"eventManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("taskManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"taskManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("customizationSpecManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"customizationSpecManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("customFieldsManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"customFieldsManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("accountManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"accountManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diagnosticManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"diagnosticManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licenseManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"licenseManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("searchIndex");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"searchIndex"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
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
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

}
