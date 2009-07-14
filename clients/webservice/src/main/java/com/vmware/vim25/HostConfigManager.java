/**
 * HostConfigManager.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostConfigManager extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference cpuScheduler;

	private com.vmware.vim25.ManagedObjectReference datastoreSystem;

	private com.vmware.vim25.ManagedObjectReference memoryManager;

	private com.vmware.vim25.ManagedObjectReference storageSystem;

	private com.vmware.vim25.ManagedObjectReference networkSystem;

	private com.vmware.vim25.ManagedObjectReference vmotionSystem;

	private com.vmware.vim25.ManagedObjectReference virtualNicManager;

	private com.vmware.vim25.ManagedObjectReference serviceSystem;

	private com.vmware.vim25.ManagedObjectReference firewallSystem;

	private com.vmware.vim25.ManagedObjectReference advancedOption;

	private com.vmware.vim25.ManagedObjectReference diagnosticSystem;

	private com.vmware.vim25.ManagedObjectReference autoStartManager;

	private com.vmware.vim25.ManagedObjectReference snmpSystem;

	private com.vmware.vim25.ManagedObjectReference dateTimeSystem;

	private com.vmware.vim25.ManagedObjectReference patchManager;

	private com.vmware.vim25.ManagedObjectReference bootDeviceSystem;

	private com.vmware.vim25.ManagedObjectReference firmwareSystem;

	private com.vmware.vim25.ManagedObjectReference healthStatusSystem;

	private com.vmware.vim25.ManagedObjectReference pciPassthruSystem;

	private com.vmware.vim25.ManagedObjectReference licenseManager;

	private com.vmware.vim25.ManagedObjectReference kernelModuleSystem;

	public HostConfigManager() {
	}

	public HostConfigManager(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference cpuScheduler,
			com.vmware.vim25.ManagedObjectReference datastoreSystem,
			com.vmware.vim25.ManagedObjectReference memoryManager,
			com.vmware.vim25.ManagedObjectReference storageSystem,
			com.vmware.vim25.ManagedObjectReference networkSystem,
			com.vmware.vim25.ManagedObjectReference vmotionSystem,
			com.vmware.vim25.ManagedObjectReference virtualNicManager,
			com.vmware.vim25.ManagedObjectReference serviceSystem,
			com.vmware.vim25.ManagedObjectReference firewallSystem,
			com.vmware.vim25.ManagedObjectReference advancedOption,
			com.vmware.vim25.ManagedObjectReference diagnosticSystem,
			com.vmware.vim25.ManagedObjectReference autoStartManager,
			com.vmware.vim25.ManagedObjectReference snmpSystem,
			com.vmware.vim25.ManagedObjectReference dateTimeSystem,
			com.vmware.vim25.ManagedObjectReference patchManager,
			com.vmware.vim25.ManagedObjectReference bootDeviceSystem,
			com.vmware.vim25.ManagedObjectReference firmwareSystem,
			com.vmware.vim25.ManagedObjectReference healthStatusSystem,
			com.vmware.vim25.ManagedObjectReference pciPassthruSystem,
			com.vmware.vim25.ManagedObjectReference licenseManager,
			com.vmware.vim25.ManagedObjectReference kernelModuleSystem) {
		super(dynamicType, dynamicProperty);
		this.cpuScheduler = cpuScheduler;
		this.datastoreSystem = datastoreSystem;
		this.memoryManager = memoryManager;
		this.storageSystem = storageSystem;
		this.networkSystem = networkSystem;
		this.vmotionSystem = vmotionSystem;
		this.virtualNicManager = virtualNicManager;
		this.serviceSystem = serviceSystem;
		this.firewallSystem = firewallSystem;
		this.advancedOption = advancedOption;
		this.diagnosticSystem = diagnosticSystem;
		this.autoStartManager = autoStartManager;
		this.snmpSystem = snmpSystem;
		this.dateTimeSystem = dateTimeSystem;
		this.patchManager = patchManager;
		this.bootDeviceSystem = bootDeviceSystem;
		this.firmwareSystem = firmwareSystem;
		this.healthStatusSystem = healthStatusSystem;
		this.pciPassthruSystem = pciPassthruSystem;
		this.licenseManager = licenseManager;
		this.kernelModuleSystem = kernelModuleSystem;
	}

	/**
	 * Gets the cpuScheduler value for this HostConfigManager.
	 * 
	 * @return cpuScheduler
	 */
	public com.vmware.vim25.ManagedObjectReference getCpuScheduler() {
		return cpuScheduler;
	}

	/**
	 * Sets the cpuScheduler value for this HostConfigManager.
	 * 
	 * @param cpuScheduler
	 */
	public void setCpuScheduler(
			com.vmware.vim25.ManagedObjectReference cpuScheduler) {
		this.cpuScheduler = cpuScheduler;
	}

	/**
	 * Gets the datastoreSystem value for this HostConfigManager.
	 * 
	 * @return datastoreSystem
	 */
	public com.vmware.vim25.ManagedObjectReference getDatastoreSystem() {
		return datastoreSystem;
	}

	/**
	 * Sets the datastoreSystem value for this HostConfigManager.
	 * 
	 * @param datastoreSystem
	 */
	public void setDatastoreSystem(
			com.vmware.vim25.ManagedObjectReference datastoreSystem) {
		this.datastoreSystem = datastoreSystem;
	}

	/**
	 * Gets the memoryManager value for this HostConfigManager.
	 * 
	 * @return memoryManager
	 */
	public com.vmware.vim25.ManagedObjectReference getMemoryManager() {
		return memoryManager;
	}

	/**
	 * Sets the memoryManager value for this HostConfigManager.
	 * 
	 * @param memoryManager
	 */
	public void setMemoryManager(
			com.vmware.vim25.ManagedObjectReference memoryManager) {
		this.memoryManager = memoryManager;
	}

	/**
	 * Gets the storageSystem value for this HostConfigManager.
	 * 
	 * @return storageSystem
	 */
	public com.vmware.vim25.ManagedObjectReference getStorageSystem() {
		return storageSystem;
	}

	/**
	 * Sets the storageSystem value for this HostConfigManager.
	 * 
	 * @param storageSystem
	 */
	public void setStorageSystem(
			com.vmware.vim25.ManagedObjectReference storageSystem) {
		this.storageSystem = storageSystem;
	}

	/**
	 * Gets the networkSystem value for this HostConfigManager.
	 * 
	 * @return networkSystem
	 */
	public com.vmware.vim25.ManagedObjectReference getNetworkSystem() {
		return networkSystem;
	}

	/**
	 * Sets the networkSystem value for this HostConfigManager.
	 * 
	 * @param networkSystem
	 */
	public void setNetworkSystem(
			com.vmware.vim25.ManagedObjectReference networkSystem) {
		this.networkSystem = networkSystem;
	}

	/**
	 * Gets the vmotionSystem value for this HostConfigManager.
	 * 
	 * @return vmotionSystem
	 */
	public com.vmware.vim25.ManagedObjectReference getVmotionSystem() {
		return vmotionSystem;
	}

	/**
	 * Sets the vmotionSystem value for this HostConfigManager.
	 * 
	 * @param vmotionSystem
	 */
	public void setVmotionSystem(
			com.vmware.vim25.ManagedObjectReference vmotionSystem) {
		this.vmotionSystem = vmotionSystem;
	}

	/**
	 * Gets the virtualNicManager value for this HostConfigManager.
	 * 
	 * @return virtualNicManager
	 */
	public com.vmware.vim25.ManagedObjectReference getVirtualNicManager() {
		return virtualNicManager;
	}

	/**
	 * Sets the virtualNicManager value for this HostConfigManager.
	 * 
	 * @param virtualNicManager
	 */
	public void setVirtualNicManager(
			com.vmware.vim25.ManagedObjectReference virtualNicManager) {
		this.virtualNicManager = virtualNicManager;
	}

	/**
	 * Gets the serviceSystem value for this HostConfigManager.
	 * 
	 * @return serviceSystem
	 */
	public com.vmware.vim25.ManagedObjectReference getServiceSystem() {
		return serviceSystem;
	}

	/**
	 * Sets the serviceSystem value for this HostConfigManager.
	 * 
	 * @param serviceSystem
	 */
	public void setServiceSystem(
			com.vmware.vim25.ManagedObjectReference serviceSystem) {
		this.serviceSystem = serviceSystem;
	}

	/**
	 * Gets the firewallSystem value for this HostConfigManager.
	 * 
	 * @return firewallSystem
	 */
	public com.vmware.vim25.ManagedObjectReference getFirewallSystem() {
		return firewallSystem;
	}

	/**
	 * Sets the firewallSystem value for this HostConfigManager.
	 * 
	 * @param firewallSystem
	 */
	public void setFirewallSystem(
			com.vmware.vim25.ManagedObjectReference firewallSystem) {
		this.firewallSystem = firewallSystem;
	}

	/**
	 * Gets the advancedOption value for this HostConfigManager.
	 * 
	 * @return advancedOption
	 */
	public com.vmware.vim25.ManagedObjectReference getAdvancedOption() {
		return advancedOption;
	}

	/**
	 * Sets the advancedOption value for this HostConfigManager.
	 * 
	 * @param advancedOption
	 */
	public void setAdvancedOption(
			com.vmware.vim25.ManagedObjectReference advancedOption) {
		this.advancedOption = advancedOption;
	}

	/**
	 * Gets the diagnosticSystem value for this HostConfigManager.
	 * 
	 * @return diagnosticSystem
	 */
	public com.vmware.vim25.ManagedObjectReference getDiagnosticSystem() {
		return diagnosticSystem;
	}

	/**
	 * Sets the diagnosticSystem value for this HostConfigManager.
	 * 
	 * @param diagnosticSystem
	 */
	public void setDiagnosticSystem(
			com.vmware.vim25.ManagedObjectReference diagnosticSystem) {
		this.diagnosticSystem = diagnosticSystem;
	}

	/**
	 * Gets the autoStartManager value for this HostConfigManager.
	 * 
	 * @return autoStartManager
	 */
	public com.vmware.vim25.ManagedObjectReference getAutoStartManager() {
		return autoStartManager;
	}

	/**
	 * Sets the autoStartManager value for this HostConfigManager.
	 * 
	 * @param autoStartManager
	 */
	public void setAutoStartManager(
			com.vmware.vim25.ManagedObjectReference autoStartManager) {
		this.autoStartManager = autoStartManager;
	}

	/**
	 * Gets the snmpSystem value for this HostConfigManager.
	 * 
	 * @return snmpSystem
	 */
	public com.vmware.vim25.ManagedObjectReference getSnmpSystem() {
		return snmpSystem;
	}

	/**
	 * Sets the snmpSystem value for this HostConfigManager.
	 * 
	 * @param snmpSystem
	 */
	public void setSnmpSystem(com.vmware.vim25.ManagedObjectReference snmpSystem) {
		this.snmpSystem = snmpSystem;
	}

	/**
	 * Gets the dateTimeSystem value for this HostConfigManager.
	 * 
	 * @return dateTimeSystem
	 */
	public com.vmware.vim25.ManagedObjectReference getDateTimeSystem() {
		return dateTimeSystem;
	}

	/**
	 * Sets the dateTimeSystem value for this HostConfigManager.
	 * 
	 * @param dateTimeSystem
	 */
	public void setDateTimeSystem(
			com.vmware.vim25.ManagedObjectReference dateTimeSystem) {
		this.dateTimeSystem = dateTimeSystem;
	}

	/**
	 * Gets the patchManager value for this HostConfigManager.
	 * 
	 * @return patchManager
	 */
	public com.vmware.vim25.ManagedObjectReference getPatchManager() {
		return patchManager;
	}

	/**
	 * Sets the patchManager value for this HostConfigManager.
	 * 
	 * @param patchManager
	 */
	public void setPatchManager(
			com.vmware.vim25.ManagedObjectReference patchManager) {
		this.patchManager = patchManager;
	}

	/**
	 * Gets the bootDeviceSystem value for this HostConfigManager.
	 * 
	 * @return bootDeviceSystem
	 */
	public com.vmware.vim25.ManagedObjectReference getBootDeviceSystem() {
		return bootDeviceSystem;
	}

	/**
	 * Sets the bootDeviceSystem value for this HostConfigManager.
	 * 
	 * @param bootDeviceSystem
	 */
	public void setBootDeviceSystem(
			com.vmware.vim25.ManagedObjectReference bootDeviceSystem) {
		this.bootDeviceSystem = bootDeviceSystem;
	}

	/**
	 * Gets the firmwareSystem value for this HostConfigManager.
	 * 
	 * @return firmwareSystem
	 */
	public com.vmware.vim25.ManagedObjectReference getFirmwareSystem() {
		return firmwareSystem;
	}

	/**
	 * Sets the firmwareSystem value for this HostConfigManager.
	 * 
	 * @param firmwareSystem
	 */
	public void setFirmwareSystem(
			com.vmware.vim25.ManagedObjectReference firmwareSystem) {
		this.firmwareSystem = firmwareSystem;
	}

	/**
	 * Gets the healthStatusSystem value for this HostConfigManager.
	 * 
	 * @return healthStatusSystem
	 */
	public com.vmware.vim25.ManagedObjectReference getHealthStatusSystem() {
		return healthStatusSystem;
	}

	/**
	 * Sets the healthStatusSystem value for this HostConfigManager.
	 * 
	 * @param healthStatusSystem
	 */
	public void setHealthStatusSystem(
			com.vmware.vim25.ManagedObjectReference healthStatusSystem) {
		this.healthStatusSystem = healthStatusSystem;
	}

	/**
	 * Gets the pciPassthruSystem value for this HostConfigManager.
	 * 
	 * @return pciPassthruSystem
	 */
	public com.vmware.vim25.ManagedObjectReference getPciPassthruSystem() {
		return pciPassthruSystem;
	}

	/**
	 * Sets the pciPassthruSystem value for this HostConfigManager.
	 * 
	 * @param pciPassthruSystem
	 */
	public void setPciPassthruSystem(
			com.vmware.vim25.ManagedObjectReference pciPassthruSystem) {
		this.pciPassthruSystem = pciPassthruSystem;
	}

	/**
	 * Gets the licenseManager value for this HostConfigManager.
	 * 
	 * @return licenseManager
	 */
	public com.vmware.vim25.ManagedObjectReference getLicenseManager() {
		return licenseManager;
	}

	/**
	 * Sets the licenseManager value for this HostConfigManager.
	 * 
	 * @param licenseManager
	 */
	public void setLicenseManager(
			com.vmware.vim25.ManagedObjectReference licenseManager) {
		this.licenseManager = licenseManager;
	}

	/**
	 * Gets the kernelModuleSystem value for this HostConfigManager.
	 * 
	 * @return kernelModuleSystem
	 */
	public com.vmware.vim25.ManagedObjectReference getKernelModuleSystem() {
		return kernelModuleSystem;
	}

	/**
	 * Sets the kernelModuleSystem value for this HostConfigManager.
	 * 
	 * @param kernelModuleSystem
	 */
	public void setKernelModuleSystem(
			com.vmware.vim25.ManagedObjectReference kernelModuleSystem) {
		this.kernelModuleSystem = kernelModuleSystem;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostConfigManager)) {
			return false;
		}
		HostConfigManager other = (HostConfigManager) obj;
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
				&& ((this.cpuScheduler == null && other.getCpuScheduler() == null) || (this.cpuScheduler != null && this.cpuScheduler
						.equals(other.getCpuScheduler())))
				&& ((this.datastoreSystem == null && other.getDatastoreSystem() == null) || (this.datastoreSystem != null && this.datastoreSystem
						.equals(other.getDatastoreSystem())))
				&& ((this.memoryManager == null && other.getMemoryManager() == null) || (this.memoryManager != null && this.memoryManager
						.equals(other.getMemoryManager())))
				&& ((this.storageSystem == null && other.getStorageSystem() == null) || (this.storageSystem != null && this.storageSystem
						.equals(other.getStorageSystem())))
				&& ((this.networkSystem == null && other.getNetworkSystem() == null) || (this.networkSystem != null && this.networkSystem
						.equals(other.getNetworkSystem())))
				&& ((this.vmotionSystem == null && other.getVmotionSystem() == null) || (this.vmotionSystem != null && this.vmotionSystem
						.equals(other.getVmotionSystem())))
				&& ((this.virtualNicManager == null && other
						.getVirtualNicManager() == null) || (this.virtualNicManager != null && this.virtualNicManager
						.equals(other.getVirtualNicManager())))
				&& ((this.serviceSystem == null && other.getServiceSystem() == null) || (this.serviceSystem != null && this.serviceSystem
						.equals(other.getServiceSystem())))
				&& ((this.firewallSystem == null && other.getFirewallSystem() == null) || (this.firewallSystem != null && this.firewallSystem
						.equals(other.getFirewallSystem())))
				&& ((this.advancedOption == null && other.getAdvancedOption() == null) || (this.advancedOption != null && this.advancedOption
						.equals(other.getAdvancedOption())))
				&& ((this.diagnosticSystem == null && other
						.getDiagnosticSystem() == null) || (this.diagnosticSystem != null && this.diagnosticSystem
						.equals(other.getDiagnosticSystem())))
				&& ((this.autoStartManager == null && other
						.getAutoStartManager() == null) || (this.autoStartManager != null && this.autoStartManager
						.equals(other.getAutoStartManager())))
				&& ((this.snmpSystem == null && other.getSnmpSystem() == null) || (this.snmpSystem != null && this.snmpSystem
						.equals(other.getSnmpSystem())))
				&& ((this.dateTimeSystem == null && other.getDateTimeSystem() == null) || (this.dateTimeSystem != null && this.dateTimeSystem
						.equals(other.getDateTimeSystem())))
				&& ((this.patchManager == null && other.getPatchManager() == null) || (this.patchManager != null && this.patchManager
						.equals(other.getPatchManager())))
				&& ((this.bootDeviceSystem == null && other
						.getBootDeviceSystem() == null) || (this.bootDeviceSystem != null && this.bootDeviceSystem
						.equals(other.getBootDeviceSystem())))
				&& ((this.firmwareSystem == null && other.getFirmwareSystem() == null) || (this.firmwareSystem != null && this.firmwareSystem
						.equals(other.getFirmwareSystem())))
				&& ((this.healthStatusSystem == null && other
						.getHealthStatusSystem() == null) || (this.healthStatusSystem != null && this.healthStatusSystem
						.equals(other.getHealthStatusSystem())))
				&& ((this.pciPassthruSystem == null && other
						.getPciPassthruSystem() == null) || (this.pciPassthruSystem != null && this.pciPassthruSystem
						.equals(other.getPciPassthruSystem())))
				&& ((this.licenseManager == null && other.getLicenseManager() == null) || (this.licenseManager != null && this.licenseManager
						.equals(other.getLicenseManager())))
				&& ((this.kernelModuleSystem == null && other
						.getKernelModuleSystem() == null) || (this.kernelModuleSystem != null && this.kernelModuleSystem
						.equals(other.getKernelModuleSystem())));
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
		if (getCpuScheduler() != null) {
			_hashCode += getCpuScheduler().hashCode();
		}
		if (getDatastoreSystem() != null) {
			_hashCode += getDatastoreSystem().hashCode();
		}
		if (getMemoryManager() != null) {
			_hashCode += getMemoryManager().hashCode();
		}
		if (getStorageSystem() != null) {
			_hashCode += getStorageSystem().hashCode();
		}
		if (getNetworkSystem() != null) {
			_hashCode += getNetworkSystem().hashCode();
		}
		if (getVmotionSystem() != null) {
			_hashCode += getVmotionSystem().hashCode();
		}
		if (getVirtualNicManager() != null) {
			_hashCode += getVirtualNicManager().hashCode();
		}
		if (getServiceSystem() != null) {
			_hashCode += getServiceSystem().hashCode();
		}
		if (getFirewallSystem() != null) {
			_hashCode += getFirewallSystem().hashCode();
		}
		if (getAdvancedOption() != null) {
			_hashCode += getAdvancedOption().hashCode();
		}
		if (getDiagnosticSystem() != null) {
			_hashCode += getDiagnosticSystem().hashCode();
		}
		if (getAutoStartManager() != null) {
			_hashCode += getAutoStartManager().hashCode();
		}
		if (getSnmpSystem() != null) {
			_hashCode += getSnmpSystem().hashCode();
		}
		if (getDateTimeSystem() != null) {
			_hashCode += getDateTimeSystem().hashCode();
		}
		if (getPatchManager() != null) {
			_hashCode += getPatchManager().hashCode();
		}
		if (getBootDeviceSystem() != null) {
			_hashCode += getBootDeviceSystem().hashCode();
		}
		if (getFirmwareSystem() != null) {
			_hashCode += getFirmwareSystem().hashCode();
		}
		if (getHealthStatusSystem() != null) {
			_hashCode += getHealthStatusSystem().hashCode();
		}
		if (getPciPassthruSystem() != null) {
			_hashCode += getPciPassthruSystem().hashCode();
		}
		if (getLicenseManager() != null) {
			_hashCode += getLicenseManager().hashCode();
		}
		if (getKernelModuleSystem() != null) {
			_hashCode += getKernelModuleSystem().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostConfigManager.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostConfigManager"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpuScheduler");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"cpuScheduler"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datastoreSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"datastoreSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memoryManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"memoryManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("storageSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"storageSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("networkSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"networkSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmotionSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vmotionSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualNicManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"virtualNicManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serviceSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"serviceSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("firewallSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"firewallSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("advancedOption");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"advancedOption"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diagnosticSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"diagnosticSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoStartManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"autoStartManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("snmpSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"snmpSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dateTimeSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dateTimeSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("patchManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"patchManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("bootDeviceSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"bootDeviceSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("firmwareSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"firmwareSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("healthStatusSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"healthStatusSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pciPassthruSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"pciPassthruSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licenseManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"licenseManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("kernelModuleSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"kernelModuleSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
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
