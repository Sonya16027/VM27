/**
 * DVSConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVSConfigSpec extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String configVersion;

	private java.lang.String name;

	private java.lang.Integer numStandalonePorts;

	private java.lang.Integer maxPorts;

	private com.vmware.vim25.DVSUplinkPortPolicy uplinkPortPolicy;

	private com.vmware.vim25.ManagedObjectReference[] uplinkPortgroup;

	private com.vmware.vim25.DVPortSetting defaultPortConfig;

	private com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec[] host;

	private java.lang.String extensionKey;

	private java.lang.String description;

	private com.vmware.vim25.DVSPolicy policy;

	private com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;

	private com.vmware.vim25.DVSContactInfo contact;

	public DVSConfigSpec() {
	}

	public DVSConfigSpec(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String configVersion,
			java.lang.String name,
			java.lang.Integer numStandalonePorts,
			java.lang.Integer maxPorts,
			com.vmware.vim25.DVSUplinkPortPolicy uplinkPortPolicy,
			com.vmware.vim25.ManagedObjectReference[] uplinkPortgroup,
			com.vmware.vim25.DVPortSetting defaultPortConfig,
			com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec[] host,
			java.lang.String extensionKey,
			java.lang.String description,
			com.vmware.vim25.DVSPolicy policy,
			com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig,
			com.vmware.vim25.DVSContactInfo contact) {
		super(dynamicType, dynamicProperty);
		this.configVersion = configVersion;
		this.name = name;
		this.numStandalonePorts = numStandalonePorts;
		this.maxPorts = maxPorts;
		this.uplinkPortPolicy = uplinkPortPolicy;
		this.uplinkPortgroup = uplinkPortgroup;
		this.defaultPortConfig = defaultPortConfig;
		this.host = host;
		this.extensionKey = extensionKey;
		this.description = description;
		this.policy = policy;
		this.vendorSpecificConfig = vendorSpecificConfig;
		this.contact = contact;
	}

	/**
	 * Gets the configVersion value for this DVSConfigSpec.
	 * 
	 * @return configVersion
	 */
	public java.lang.String getConfigVersion() {
		return configVersion;
	}

	/**
	 * Sets the configVersion value for this DVSConfigSpec.
	 * 
	 * @param configVersion
	 */
	public void setConfigVersion(java.lang.String configVersion) {
		this.configVersion = configVersion;
	}

	/**
	 * Gets the name value for this DVSConfigSpec.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this DVSConfigSpec.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the numStandalonePorts value for this DVSConfigSpec.
	 * 
	 * @return numStandalonePorts
	 */
	public java.lang.Integer getNumStandalonePorts() {
		return numStandalonePorts;
	}

	/**
	 * Sets the numStandalonePorts value for this DVSConfigSpec.
	 * 
	 * @param numStandalonePorts
	 */
	public void setNumStandalonePorts(java.lang.Integer numStandalonePorts) {
		this.numStandalonePorts = numStandalonePorts;
	}

	/**
	 * Gets the maxPorts value for this DVSConfigSpec.
	 * 
	 * @return maxPorts
	 */
	public java.lang.Integer getMaxPorts() {
		return maxPorts;
	}

	/**
	 * Sets the maxPorts value for this DVSConfigSpec.
	 * 
	 * @param maxPorts
	 */
	public void setMaxPorts(java.lang.Integer maxPorts) {
		this.maxPorts = maxPorts;
	}

	/**
	 * Gets the uplinkPortPolicy value for this DVSConfigSpec.
	 * 
	 * @return uplinkPortPolicy
	 */
	public com.vmware.vim25.DVSUplinkPortPolicy getUplinkPortPolicy() {
		return uplinkPortPolicy;
	}

	/**
	 * Sets the uplinkPortPolicy value for this DVSConfigSpec.
	 * 
	 * @param uplinkPortPolicy
	 */
	public void setUplinkPortPolicy(
			com.vmware.vim25.DVSUplinkPortPolicy uplinkPortPolicy) {
		this.uplinkPortPolicy = uplinkPortPolicy;
	}

	/**
	 * Gets the uplinkPortgroup value for this DVSConfigSpec.
	 * 
	 * @return uplinkPortgroup
	 */
	public com.vmware.vim25.ManagedObjectReference[] getUplinkPortgroup() {
		return uplinkPortgroup;
	}

	/**
	 * Sets the uplinkPortgroup value for this DVSConfigSpec.
	 * 
	 * @param uplinkPortgroup
	 */
	public void setUplinkPortgroup(
			com.vmware.vim25.ManagedObjectReference[] uplinkPortgroup) {
		this.uplinkPortgroup = uplinkPortgroup;
	}

	public com.vmware.vim25.ManagedObjectReference getUplinkPortgroup(int i) {
		return this.uplinkPortgroup[i];
	}

	public void setUplinkPortgroup(int i,
			com.vmware.vim25.ManagedObjectReference _value) {
		this.uplinkPortgroup[i] = _value;
	}

	/**
	 * Gets the defaultPortConfig value for this DVSConfigSpec.
	 * 
	 * @return defaultPortConfig
	 */
	public com.vmware.vim25.DVPortSetting getDefaultPortConfig() {
		return defaultPortConfig;
	}

	/**
	 * Sets the defaultPortConfig value for this DVSConfigSpec.
	 * 
	 * @param defaultPortConfig
	 */
	public void setDefaultPortConfig(
			com.vmware.vim25.DVPortSetting defaultPortConfig) {
		this.defaultPortConfig = defaultPortConfig;
	}

	/**
	 * Gets the host value for this DVSConfigSpec.
	 * 
	 * @return host
	 */
	public com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec[] getHost() {
		return host;
	}

	/**
	 * Sets the host value for this DVSConfigSpec.
	 * 
	 * @param host
	 */
	public void setHost(
			com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec[] host) {
		this.host = host;
	}

	public com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec getHost(
			int i) {
		return this.host[i];
	}

	public void setHost(int i,
			com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec _value) {
		this.host[i] = _value;
	}

	/**
	 * Gets the extensionKey value for this DVSConfigSpec.
	 * 
	 * @return extensionKey
	 */
	public java.lang.String getExtensionKey() {
		return extensionKey;
	}

	/**
	 * Sets the extensionKey value for this DVSConfigSpec.
	 * 
	 * @param extensionKey
	 */
	public void setExtensionKey(java.lang.String extensionKey) {
		this.extensionKey = extensionKey;
	}

	/**
	 * Gets the description value for this DVSConfigSpec.
	 * 
	 * @return description
	 */
	public java.lang.String getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this DVSConfigSpec.
	 * 
	 * @param description
	 */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	/**
	 * Gets the policy value for this DVSConfigSpec.
	 * 
	 * @return policy
	 */
	public com.vmware.vim25.DVSPolicy getPolicy() {
		return policy;
	}

	/**
	 * Sets the policy value for this DVSConfigSpec.
	 * 
	 * @param policy
	 */
	public void setPolicy(com.vmware.vim25.DVSPolicy policy) {
		this.policy = policy;
	}

	/**
	 * Gets the vendorSpecificConfig value for this DVSConfigSpec.
	 * 
	 * @return vendorSpecificConfig
	 */
	public com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
		return vendorSpecificConfig;
	}

	/**
	 * Sets the vendorSpecificConfig value for this DVSConfigSpec.
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

	/**
	 * Gets the contact value for this DVSConfigSpec.
	 * 
	 * @return contact
	 */
	public com.vmware.vim25.DVSContactInfo getContact() {
		return contact;
	}

	/**
	 * Sets the contact value for this DVSConfigSpec.
	 * 
	 * @param contact
	 */
	public void setContact(com.vmware.vim25.DVSContactInfo contact) {
		this.contact = contact;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DVSConfigSpec)) {
			return false;
		}
		DVSConfigSpec other = (DVSConfigSpec) obj;
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
				&& ((this.numStandalonePorts == null && other
						.getNumStandalonePorts() == null) || (this.numStandalonePorts != null && this.numStandalonePorts
						.equals(other.getNumStandalonePorts())))
				&& ((this.maxPorts == null && other.getMaxPorts() == null) || (this.maxPorts != null && this.maxPorts
						.equals(other.getMaxPorts())))
				&& ((this.uplinkPortPolicy == null && other
						.getUplinkPortPolicy() == null) || (this.uplinkPortPolicy != null && this.uplinkPortPolicy
						.equals(other.getUplinkPortPolicy())))
				&& ((this.uplinkPortgroup == null && other.getUplinkPortgroup() == null) || (this.uplinkPortgroup != null && java.util.Arrays
						.equals(this.uplinkPortgroup, other
								.getUplinkPortgroup())))
				&& ((this.defaultPortConfig == null && other
						.getDefaultPortConfig() == null) || (this.defaultPortConfig != null && this.defaultPortConfig
						.equals(other.getDefaultPortConfig())))
				&& ((this.host == null && other.getHost() == null) || (this.host != null && java.util.Arrays
						.equals(this.host, other.getHost())))
				&& ((this.extensionKey == null && other.getExtensionKey() == null) || (this.extensionKey != null && this.extensionKey
						.equals(other.getExtensionKey())))
				&& ((this.description == null && other.getDescription() == null) || (this.description != null && this.description
						.equals(other.getDescription())))
				&& ((this.policy == null && other.getPolicy() == null) || (this.policy != null && this.policy
						.equals(other.getPolicy())))
				&& ((this.vendorSpecificConfig == null && other
						.getVendorSpecificConfig() == null) || (this.vendorSpecificConfig != null && java.util.Arrays
						.equals(this.vendorSpecificConfig, other
								.getVendorSpecificConfig())))
				&& ((this.contact == null && other.getContact() == null) || (this.contact != null && this.contact
						.equals(other.getContact())));
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
		if (getNumStandalonePorts() != null) {
			_hashCode += getNumStandalonePorts().hashCode();
		}
		if (getMaxPorts() != null) {
			_hashCode += getMaxPorts().hashCode();
		}
		if (getUplinkPortPolicy() != null) {
			_hashCode += getUplinkPortPolicy().hashCode();
		}
		if (getUplinkPortgroup() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getUplinkPortgroup()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getUplinkPortgroup(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDefaultPortConfig() != null) {
			_hashCode += getDefaultPortConfig().hashCode();
		}
		if (getHost() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getHost()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getHost(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getExtensionKey() != null) {
			_hashCode += getExtensionKey().hashCode();
		}
		if (getDescription() != null) {
			_hashCode += getDescription().hashCode();
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
		if (getContact() != null) {
			_hashCode += getContact().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DVSConfigSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVSConfigSpec"));
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
		elemField.setFieldName("numStandalonePorts");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numStandalonePorts"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxPorts");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"maxPorts"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uplinkPortPolicy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"uplinkPortPolicy"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVSUplinkPortPolicy"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uplinkPortgroup");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"uplinkPortgroup"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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
		elemField.setFieldName("host");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchHostMemberConfigSpec"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("extensionKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"extensionKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
		elemField.setFieldName("policy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"policy"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVSPolicy"));
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
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("contact");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"contact"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVSContactInfo"));
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
