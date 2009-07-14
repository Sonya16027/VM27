/**
 * VMwareDVSConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VMwareDVSConfigSpec extends com.vmware.vim25.DVSConfigSpec
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.VMwareDVSPvlanConfigSpec[] pvlanConfigSpec;

	private java.lang.Integer maxMtu;

	private com.vmware.vim25.LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;

	public VMwareDVSConfigSpec() {
	}

	public VMwareDVSConfigSpec(
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
			com.vmware.vim25.DVSContactInfo contact,
			com.vmware.vim25.VMwareDVSPvlanConfigSpec[] pvlanConfigSpec,
			java.lang.Integer maxMtu,
			com.vmware.vim25.LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig) {
		super(dynamicType, dynamicProperty, configVersion, name,
				numStandalonePorts, maxPorts, uplinkPortPolicy,
				uplinkPortgroup, defaultPortConfig, host, extensionKey,
				description, policy, vendorSpecificConfig, contact);
		this.pvlanConfigSpec = pvlanConfigSpec;
		this.maxMtu = maxMtu;
		this.linkDiscoveryProtocolConfig = linkDiscoveryProtocolConfig;
	}

	/**
	 * Gets the pvlanConfigSpec value for this VMwareDVSConfigSpec.
	 * 
	 * @return pvlanConfigSpec
	 */
	public com.vmware.vim25.VMwareDVSPvlanConfigSpec[] getPvlanConfigSpec() {
		return pvlanConfigSpec;
	}

	/**
	 * Sets the pvlanConfigSpec value for this VMwareDVSConfigSpec.
	 * 
	 * @param pvlanConfigSpec
	 */
	public void setPvlanConfigSpec(
			com.vmware.vim25.VMwareDVSPvlanConfigSpec[] pvlanConfigSpec) {
		this.pvlanConfigSpec = pvlanConfigSpec;
	}

	public com.vmware.vim25.VMwareDVSPvlanConfigSpec getPvlanConfigSpec(int i) {
		return this.pvlanConfigSpec[i];
	}

	public void setPvlanConfigSpec(int i,
			com.vmware.vim25.VMwareDVSPvlanConfigSpec _value) {
		this.pvlanConfigSpec[i] = _value;
	}

	/**
	 * Gets the maxMtu value for this VMwareDVSConfigSpec.
	 * 
	 * @return maxMtu
	 */
	public java.lang.Integer getMaxMtu() {
		return maxMtu;
	}

	/**
	 * Sets the maxMtu value for this VMwareDVSConfigSpec.
	 * 
	 * @param maxMtu
	 */
	public void setMaxMtu(java.lang.Integer maxMtu) {
		this.maxMtu = maxMtu;
	}

	/**
	 * Gets the linkDiscoveryProtocolConfig value for this VMwareDVSConfigSpec.
	 * 
	 * @return linkDiscoveryProtocolConfig
	 */
	public com.vmware.vim25.LinkDiscoveryProtocolConfig getLinkDiscoveryProtocolConfig() {
		return linkDiscoveryProtocolConfig;
	}

	/**
	 * Sets the linkDiscoveryProtocolConfig value for this VMwareDVSConfigSpec.
	 * 
	 * @param linkDiscoveryProtocolConfig
	 */
	public void setLinkDiscoveryProtocolConfig(
			com.vmware.vim25.LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig) {
		this.linkDiscoveryProtocolConfig = linkDiscoveryProtocolConfig;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VMwareDVSConfigSpec)) {
			return false;
		}
		VMwareDVSConfigSpec other = (VMwareDVSConfigSpec) obj;
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
				&& ((this.pvlanConfigSpec == null && other.getPvlanConfigSpec() == null) || (this.pvlanConfigSpec != null && java.util.Arrays
						.equals(this.pvlanConfigSpec, other
								.getPvlanConfigSpec())))
				&& ((this.maxMtu == null && other.getMaxMtu() == null) || (this.maxMtu != null && this.maxMtu
						.equals(other.getMaxMtu())))
				&& ((this.linkDiscoveryProtocolConfig == null && other
						.getLinkDiscoveryProtocolConfig() == null) || (this.linkDiscoveryProtocolConfig != null && this.linkDiscoveryProtocolConfig
						.equals(other.getLinkDiscoveryProtocolConfig())));
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
		if (getPvlanConfigSpec() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPvlanConfigSpec()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPvlanConfigSpec(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getMaxMtu() != null) {
			_hashCode += getMaxMtu().hashCode();
		}
		if (getLinkDiscoveryProtocolConfig() != null) {
			_hashCode += getLinkDiscoveryProtocolConfig().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VMwareDVSConfigSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VMwareDVSConfigSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pvlanConfigSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"pvlanConfigSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VMwareDVSPvlanConfigSpec"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxMtu");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"maxMtu"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("linkDiscoveryProtocolConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"linkDiscoveryProtocolConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LinkDiscoveryProtocolConfig"));
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
