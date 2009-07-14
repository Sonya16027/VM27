/**
 * HostConfigManager.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostConfigManager extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference cpuScheduler;

	private com.vmware.vim.ManagedObjectReference datastoreSystem;

	private com.vmware.vim.ManagedObjectReference memoryManager;

	private com.vmware.vim.ManagedObjectReference storageSystem;

	private com.vmware.vim.ManagedObjectReference networkSystem;

	private com.vmware.vim.ManagedObjectReference vmotionSystem;

	private com.vmware.vim.ManagedObjectReference serviceSystem;

	private com.vmware.vim.ManagedObjectReference firewallSystem;

	private com.vmware.vim.ManagedObjectReference advancedOption;

	private com.vmware.vim.ManagedObjectReference diagnosticSystem;

	private com.vmware.vim.ManagedObjectReference autoStartManager;

	private com.vmware.vim.ManagedObjectReference snmpSystem;

	public HostConfigManager() {
	}

	public HostConfigManager(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.ManagedObjectReference cpuScheduler,
			com.vmware.vim.ManagedObjectReference datastoreSystem,
			com.vmware.vim.ManagedObjectReference memoryManager,
			com.vmware.vim.ManagedObjectReference storageSystem,
			com.vmware.vim.ManagedObjectReference networkSystem,
			com.vmware.vim.ManagedObjectReference vmotionSystem,
			com.vmware.vim.ManagedObjectReference serviceSystem,
			com.vmware.vim.ManagedObjectReference firewallSystem,
			com.vmware.vim.ManagedObjectReference advancedOption,
			com.vmware.vim.ManagedObjectReference diagnosticSystem,
			com.vmware.vim.ManagedObjectReference autoStartManager,
			com.vmware.vim.ManagedObjectReference snmpSystem) {
		super(dynamicType, dynamicProperty);
		this.cpuScheduler = cpuScheduler;
		this.datastoreSystem = datastoreSystem;
		this.memoryManager = memoryManager;
		this.storageSystem = storageSystem;
		this.networkSystem = networkSystem;
		this.vmotionSystem = vmotionSystem;
		this.serviceSystem = serviceSystem;
		this.firewallSystem = firewallSystem;
		this.advancedOption = advancedOption;
		this.diagnosticSystem = diagnosticSystem;
		this.autoStartManager = autoStartManager;
		this.snmpSystem = snmpSystem;
	}

	/**
	 * Gets the cpuScheduler value for this HostConfigManager.
	 * 
	 * @return cpuScheduler
	 */
	public com.vmware.vim.ManagedObjectReference getCpuScheduler() {
		return cpuScheduler;
	}

	/**
	 * Sets the cpuScheduler value for this HostConfigManager.
	 * 
	 * @param cpuScheduler
	 */
	public void setCpuScheduler(
			com.vmware.vim.ManagedObjectReference cpuScheduler) {
		this.cpuScheduler = cpuScheduler;
	}

	/**
	 * Gets the datastoreSystem value for this HostConfigManager.
	 * 
	 * @return datastoreSystem
	 */
	public com.vmware.vim.ManagedObjectReference getDatastoreSystem() {
		return datastoreSystem;
	}

	/**
	 * Sets the datastoreSystem value for this HostConfigManager.
	 * 
	 * @param datastoreSystem
	 */
	public void setDatastoreSystem(
			com.vmware.vim.ManagedObjectReference datastoreSystem) {
		this.datastoreSystem = datastoreSystem;
	}

	/**
	 * Gets the memoryManager value for this HostConfigManager.
	 * 
	 * @return memoryManager
	 */
	public com.vmware.vim.ManagedObjectReference getMemoryManager() {
		return memoryManager;
	}

	/**
	 * Sets the memoryManager value for this HostConfigManager.
	 * 
	 * @param memoryManager
	 */
	public void setMemoryManager(
			com.vmware.vim.ManagedObjectReference memoryManager) {
		this.memoryManager = memoryManager;
	}

	/**
	 * Gets the storageSystem value for this HostConfigManager.
	 * 
	 * @return storageSystem
	 */
	public com.vmware.vim.ManagedObjectReference getStorageSystem() {
		return storageSystem;
	}

	/**
	 * Sets the storageSystem value for this HostConfigManager.
	 * 
	 * @param storageSystem
	 */
	public void setStorageSystem(
			com.vmware.vim.ManagedObjectReference storageSystem) {
		this.storageSystem = storageSystem;
	}

	/**
	 * Gets the networkSystem value for this HostConfigManager.
	 * 
	 * @return networkSystem
	 */
	public com.vmware.vim.ManagedObjectReference getNetworkSystem() {
		return networkSystem;
	}

	/**
	 * Sets the networkSystem value for this HostConfigManager.
	 * 
	 * @param networkSystem
	 */
	public void setNetworkSystem(
			com.vmware.vim.ManagedObjectReference networkSystem) {
		this.networkSystem = networkSystem;
	}

	/**
	 * Gets the vmotionSystem value for this HostConfigManager.
	 * 
	 * @return vmotionSystem
	 */
	public com.vmware.vim.ManagedObjectReference getVmotionSystem() {
		return vmotionSystem;
	}

	/**
	 * Sets the vmotionSystem value for this HostConfigManager.
	 * 
	 * @param vmotionSystem
	 */
	public void setVmotionSystem(
			com.vmware.vim.ManagedObjectReference vmotionSystem) {
		this.vmotionSystem = vmotionSystem;
	}

	/**
	 * Gets the serviceSystem value for this HostConfigManager.
	 * 
	 * @return serviceSystem
	 */
	public com.vmware.vim.ManagedObjectReference getServiceSystem() {
		return serviceSystem;
	}

	/**
	 * Sets the serviceSystem value for this HostConfigManager.
	 * 
	 * @param serviceSystem
	 */
	public void setServiceSystem(
			com.vmware.vim.ManagedObjectReference serviceSystem) {
		this.serviceSystem = serviceSystem;
	}

	/**
	 * Gets the firewallSystem value for this HostConfigManager.
	 * 
	 * @return firewallSystem
	 */
	public com.vmware.vim.ManagedObjectReference getFirewallSystem() {
		return firewallSystem;
	}

	/**
	 * Sets the firewallSystem value for this HostConfigManager.
	 * 
	 * @param firewallSystem
	 */
	public void setFirewallSystem(
			com.vmware.vim.ManagedObjectReference firewallSystem) {
		this.firewallSystem = firewallSystem;
	}

	/**
	 * Gets the advancedOption value for this HostConfigManager.
	 * 
	 * @return advancedOption
	 */
	public com.vmware.vim.ManagedObjectReference getAdvancedOption() {
		return advancedOption;
	}

	/**
	 * Sets the advancedOption value for this HostConfigManager.
	 * 
	 * @param advancedOption
	 */
	public void setAdvancedOption(
			com.vmware.vim.ManagedObjectReference advancedOption) {
		this.advancedOption = advancedOption;
	}

	/**
	 * Gets the diagnosticSystem value for this HostConfigManager.
	 * 
	 * @return diagnosticSystem
	 */
	public com.vmware.vim.ManagedObjectReference getDiagnosticSystem() {
		return diagnosticSystem;
	}

	/**
	 * Sets the diagnosticSystem value for this HostConfigManager.
	 * 
	 * @param diagnosticSystem
	 */
	public void setDiagnosticSystem(
			com.vmware.vim.ManagedObjectReference diagnosticSystem) {
		this.diagnosticSystem = diagnosticSystem;
	}

	/**
	 * Gets the autoStartManager value for this HostConfigManager.
	 * 
	 * @return autoStartManager
	 */
	public com.vmware.vim.ManagedObjectReference getAutoStartManager() {
		return autoStartManager;
	}

	/**
	 * Sets the autoStartManager value for this HostConfigManager.
	 * 
	 * @param autoStartManager
	 */
	public void setAutoStartManager(
			com.vmware.vim.ManagedObjectReference autoStartManager) {
		this.autoStartManager = autoStartManager;
	}

	/**
	 * Gets the snmpSystem value for this HostConfigManager.
	 * 
	 * @return snmpSystem
	 */
	public com.vmware.vim.ManagedObjectReference getSnmpSystem() {
		return snmpSystem;
	}

	/**
	 * Sets the snmpSystem value for this HostConfigManager.
	 * 
	 * @param snmpSystem
	 */
	public void setSnmpSystem(com.vmware.vim.ManagedObjectReference snmpSystem) {
		this.snmpSystem = snmpSystem;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
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
						.equals(other.getSnmpSystem())));
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
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostConfigManager.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostConfigManager"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpuScheduler");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"cpuScheduler"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datastoreSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"datastoreSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memoryManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"memoryManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("storageSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"storageSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("networkSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"networkSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmotionSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"vmotionSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serviceSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"serviceSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("firewallSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"firewallSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("advancedOption");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"advancedOption"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diagnosticSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"diagnosticSystem"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoStartManager");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"autoStartManager"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("snmpSystem");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"snmpSystem"));
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
