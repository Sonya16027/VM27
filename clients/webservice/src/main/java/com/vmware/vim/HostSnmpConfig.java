/**
 * HostSnmpConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostSnmpConfig extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Boolean autoStartMasterSnmpAgentEnabled;

	private java.lang.String startupScript;

	private java.lang.String configFile;

	private java.lang.Boolean vmwareSubagentEnabled;

	private java.lang.Boolean vmwareTrapsEnabled;

	public HostSnmpConfig() {
	}

	public HostSnmpConfig(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.Boolean autoStartMasterSnmpAgentEnabled,
			java.lang.String startupScript, java.lang.String configFile,
			java.lang.Boolean vmwareSubagentEnabled,
			java.lang.Boolean vmwareTrapsEnabled) {
		super(dynamicType, dynamicProperty);
		this.autoStartMasterSnmpAgentEnabled = autoStartMasterSnmpAgentEnabled;
		this.startupScript = startupScript;
		this.configFile = configFile;
		this.vmwareSubagentEnabled = vmwareSubagentEnabled;
		this.vmwareTrapsEnabled = vmwareTrapsEnabled;
	}

	/**
	 * Gets the autoStartMasterSnmpAgentEnabled value for this HostSnmpConfig.
	 * 
	 * @return autoStartMasterSnmpAgentEnabled
	 */
	public java.lang.Boolean getAutoStartMasterSnmpAgentEnabled() {
		return autoStartMasterSnmpAgentEnabled;
	}

	/**
	 * Sets the autoStartMasterSnmpAgentEnabled value for this HostSnmpConfig.
	 * 
	 * @param autoStartMasterSnmpAgentEnabled
	 */
	public void setAutoStartMasterSnmpAgentEnabled(
			java.lang.Boolean autoStartMasterSnmpAgentEnabled) {
		this.autoStartMasterSnmpAgentEnabled = autoStartMasterSnmpAgentEnabled;
	}

	/**
	 * Gets the startupScript value for this HostSnmpConfig.
	 * 
	 * @return startupScript
	 */
	public java.lang.String getStartupScript() {
		return startupScript;
	}

	/**
	 * Sets the startupScript value for this HostSnmpConfig.
	 * 
	 * @param startupScript
	 */
	public void setStartupScript(java.lang.String startupScript) {
		this.startupScript = startupScript;
	}

	/**
	 * Gets the configFile value for this HostSnmpConfig.
	 * 
	 * @return configFile
	 */
	public java.lang.String getConfigFile() {
		return configFile;
	}

	/**
	 * Sets the configFile value for this HostSnmpConfig.
	 * 
	 * @param configFile
	 */
	public void setConfigFile(java.lang.String configFile) {
		this.configFile = configFile;
	}

	/**
	 * Gets the vmwareSubagentEnabled value for this HostSnmpConfig.
	 * 
	 * @return vmwareSubagentEnabled
	 */
	public java.lang.Boolean getVmwareSubagentEnabled() {
		return vmwareSubagentEnabled;
	}

	/**
	 * Sets the vmwareSubagentEnabled value for this HostSnmpConfig.
	 * 
	 * @param vmwareSubagentEnabled
	 */
	public void setVmwareSubagentEnabled(java.lang.Boolean vmwareSubagentEnabled) {
		this.vmwareSubagentEnabled = vmwareSubagentEnabled;
	}

	/**
	 * Gets the vmwareTrapsEnabled value for this HostSnmpConfig.
	 * 
	 * @return vmwareTrapsEnabled
	 */
	public java.lang.Boolean getVmwareTrapsEnabled() {
		return vmwareTrapsEnabled;
	}

	/**
	 * Sets the vmwareTrapsEnabled value for this HostSnmpConfig.
	 * 
	 * @param vmwareTrapsEnabled
	 */
	public void setVmwareTrapsEnabled(java.lang.Boolean vmwareTrapsEnabled) {
		this.vmwareTrapsEnabled = vmwareTrapsEnabled;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostSnmpConfig)) {
			return false;
		}
		HostSnmpConfig other = (HostSnmpConfig) obj;
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
				&& ((this.autoStartMasterSnmpAgentEnabled == null && other
						.getAutoStartMasterSnmpAgentEnabled() == null) || (this.autoStartMasterSnmpAgentEnabled != null && this.autoStartMasterSnmpAgentEnabled
						.equals(other.getAutoStartMasterSnmpAgentEnabled())))
				&& ((this.startupScript == null && other.getStartupScript() == null) || (this.startupScript != null && this.startupScript
						.equals(other.getStartupScript())))
				&& ((this.configFile == null && other.getConfigFile() == null) || (this.configFile != null && this.configFile
						.equals(other.getConfigFile())))
				&& ((this.vmwareSubagentEnabled == null && other
						.getVmwareSubagentEnabled() == null) || (this.vmwareSubagentEnabled != null && this.vmwareSubagentEnabled
						.equals(other.getVmwareSubagentEnabled())))
				&& ((this.vmwareTrapsEnabled == null && other
						.getVmwareTrapsEnabled() == null) || (this.vmwareTrapsEnabled != null && this.vmwareTrapsEnabled
						.equals(other.getVmwareTrapsEnabled())));
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
		if (getAutoStartMasterSnmpAgentEnabled() != null) {
			_hashCode += getAutoStartMasterSnmpAgentEnabled().hashCode();
		}
		if (getStartupScript() != null) {
			_hashCode += getStartupScript().hashCode();
		}
		if (getConfigFile() != null) {
			_hashCode += getConfigFile().hashCode();
		}
		if (getVmwareSubagentEnabled() != null) {
			_hashCode += getVmwareSubagentEnabled().hashCode();
		}
		if (getVmwareTrapsEnabled() != null) {
			_hashCode += getVmwareTrapsEnabled().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostSnmpConfig.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostSnmpConfig"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoStartMasterSnmpAgentEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"autoStartMasterSnmpAgentEnabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("startupScript");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"startupScript"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("configFile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"configFile"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmwareSubagentEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"vmwareSubagentEnabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmwareTrapsEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"vmwareTrapsEnabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
