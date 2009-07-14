/**
 * DVPortgroupConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVPortgroupConfigSpec extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String configVersion;

	private java.lang.String name;

	private java.lang.Integer numPorts;

	private java.lang.String portNameFormat;

	private com.vmware.vim25.DVPortSetting defaultPortConfig;

	private java.lang.String description;

	private java.lang.String type;

	private com.vmware.vim25.ManagedObjectReference[] scope;

	private com.vmware.vim25.DVPortgroupPolicy policy;

	private com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;

	public DVPortgroupConfigSpec() {
	}

	public DVPortgroupConfigSpec(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String configVersion,
			java.lang.String name,
			java.lang.Integer numPorts,
			java.lang.String portNameFormat,
			com.vmware.vim25.DVPortSetting defaultPortConfig,
			java.lang.String description,
			java.lang.String type,
			com.vmware.vim25.ManagedObjectReference[] scope,
			com.vmware.vim25.DVPortgroupPolicy policy,
			com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
		super(dynamicType, dynamicProperty);
		this.configVersion = configVersion;
		this.name = name;
		this.numPorts = numPorts;
		this.portNameFormat = portNameFormat;
		this.defaultPortConfig = defaultPortConfig;
		this.description = description;
		this.type = type;
		this.scope = scope;
		this.policy = policy;
		this.vendorSpecificConfig = vendorSpecificConfig;
	}

	/**
	 * Gets the configVersion value for this DVPortgroupConfigSpec.
	 * 
	 * @return configVersion
	 */
	public java.lang.String getConfigVersion() {
		return configVersion;
	}

	/**
	 * Sets the configVersion value for this DVPortgroupConfigSpec.
	 * 
	 * @param configVersion
	 */
	public void setConfigVersion(java.lang.String configVersion) {
		this.configVersion = configVersion;
	}

	/**
	 * Gets the name value for this DVPortgroupConfigSpec.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this DVPortgroupConfigSpec.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the numPorts value for this DVPortgroupConfigSpec.
	 * 
	 * @return numPorts
	 */
	public java.lang.Integer getNumPorts() {
		return numPorts;
	}

	/**
	 * Sets the numPorts value for this DVPortgroupConfigSpec.
	 * 
	 * @param numPorts
	 */
	public void setNumPorts(java.lang.Integer numPorts) {
		this.numPorts = numPorts;
	}

	/**
	 * Gets the portNameFormat value for this DVPortgroupConfigSpec.
	 * 
	 * @return portNameFormat
	 */
	public java.lang.String getPortNameFormat() {
		return portNameFormat;
	}

	/**
	 * Sets the portNameFormat value for this DVPortgroupConfigSpec.
	 * 
	 * @param portNameFormat
	 */
	public void setPortNameFormat(java.lang.String portNameFormat) {
		this.portNameFormat = portNameFormat;
	}

	/**
	 * Gets the defaultPortConfig value for this DVPortgroupConfigSpec.
	 * 
	 * @return defaultPortConfig
	 */
	public com.vmware.vim25.DVPortSetting getDefaultPortConfig() {
		return defaultPortConfig;
	}

	/**
	 * Sets the defaultPortConfig value for this DVPortgroupConfigSpec.
	 * 
	 * @param defaultPortConfig
	 */
	public void setDefaultPortConfig(
			com.vmware.vim25.DVPortSetting defaultPortConfig) {
		this.defaultPortConfig = defaultPortConfig;
	}

	/**
	 * Gets the description value for this DVPortgroupConfigSpec.
	 * 
	 * @return description
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this DVPortgroupConfigSpec.
	 * 
	 * @param description
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**
	 * Gets the type value for this DVPortgroupConfigSpec.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this DVPortgroupConfigSpec.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the scope value for this DVPortgroupConfigSpec.
	 * 
	 * @return scope
	 */
	public com.vmware.vim25.ManagedObjectReference[] getScope() {
		return scope;
	}

	/**
	 * Sets the scope value for this DVPortgroupConfigSpec.
	 * 
	 * @param scope
	 */
	public void setScope(com.vmware.vim25.ManagedObjectReference[] scope) {
		this.scope = scope;
	}

	public com.vmware.vim25.ManagedObjectReference getScope(int i) {
		return this.scope[i];
	}

	public void setScope(int i, com.vmware.vim25.ManagedObjectReference _value) {
		this.scope[i] = _value;
	}

	/**
	 * Gets the policy value for this DVPortgroupConfigSpec.
	 * 
	 * @return policy
	 */
	public com.vmware.vim25.DVPortgroupPolicy getPolicy() {
		return policy;
	}

	/**
	 * Sets the policy value for this DVPortgroupConfigSpec.
	 * 
	 * @param policy
	 */
	public void setPolicy(com.vmware.vim25.DVPortgroupPolicy policy) {
		this.policy = policy;
	}

	/**
	 * Gets the vendorSpecificConfig value for this DVPortgroupConfigSpec.
	 * 
	 * @return vendorSpecificConfig
	 */
	public com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
		return vendorSpecificConfig;
	}

	/**
	 * Sets the vendorSpecificConfig value for this DVPortgroupConfigSpec.
	 * 
	 * @param vendorSpecificConfig
	 */
	public void setVendorSpecificConfig(
			com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig) {
		this.vendorSpecificConfig = vendorSpecificConfig;
	}

	public com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob getVendorSpecificConfig(
			int i) {
		return this.vendorSpecificConfig[i];
	}

	public void setVendorSpecificConfig(int i,
			com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob _value) {
		this.vendorSpecificConfig[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DVPortgroupConfigSpec)) {
			return false;
		}
		DVPortgroupConfigSpec other = (DVPortgroupConfigSpec) obj;
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
				&& ((this.configVersion == null && other.getConfigVersion() == null) || (this.configVersion != null && this.configVersion
						.equals(other.getConfigVersion())))
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.numPorts == null && other.getNumPorts() == null) || (this.numPorts != null && this.numPorts
						.equals(other.getNumPorts())))
				&& ((this.portNameFormat == null && other.getPortNameFormat() == null) || (this.portNameFormat != null && this.portNameFormat
						.equals(other.getPortNameFormat())))
				&& ((this.defaultPortConfig == null && other
						.getDefaultPortConfig() == null) || (this.defaultPortConfig != null && this.defaultPortConfig
						.equals(other.getDefaultPortConfig())))
				&& ((this.description == null && other.getDescription() == null) || (this.description != null && this.description
						.equals(other.getDescription())))
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& ((this.scope == null && other.getScope() == null) || (this.scope != null && java.util.Arrays
						.equals(this.scope, other.getScope())))
				&& ((this.policy == null && other.getPolicy() == null) || (this.policy != null && this.policy
						.equals(other.getPolicy())))
				&& ((this.vendorSpecificConfig == null && other
						.getVendorSpecificConfig() == null) || (this.vendorSpecificConfig != null && java.util.Arrays
						.equals(this.vendorSpecificConfig, other
								.getVendorSpecificConfig())));
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
		if (getConfigVersion() != null) {
			_hashCode += getConfigVersion().hashCode();
		}
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getNumPorts() != null) {
			_hashCode += getNumPorts().hashCode();
		}
		if (getPortNameFormat() != null) {
			_hashCode += getPortNameFormat().hashCode();
		}
		if (getDefaultPortConfig() != null) {
			_hashCode += getDefaultPortConfig().hashCode();
		}
		if (getDescription() != null) {
			_hashCode += getDescription().hashCode();
		}
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getScope() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getScope()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getScope(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getPolicy() != null) {
			_hashCode += getPolicy().hashCode();
		}
		if (getVendorSpecificConfig() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getVendorSpecificConfig()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVendorSpecificConfig(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DVPortgroupConfigSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVPortgroupConfigSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("configVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"configVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numPorts");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numPorts"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portNameFormat");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"portNameFormat"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultPortConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"defaultPortConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVPortSetting"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("description");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"description"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("scope");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scope"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("policy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"policy"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVPortgroupPolicy"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vendorSpecificConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vendorSpecificConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchKeyedOpaqueBlob"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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
