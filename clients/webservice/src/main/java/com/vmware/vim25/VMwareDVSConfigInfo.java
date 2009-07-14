/**
 * VMwareDVSConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VMwareDVSConfigInfo extends com.vmware.vim25.DVSConfigInfo
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.VMwareDVSPvlanMapEntry[] pvlanConfig;

	private int maxMtu;

	private com.vmware.vim25.LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig;

	public VMwareDVSConfigInfo() {
	}

	public VMwareDVSConfigInfo(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String uuid,
			java.lang.String name,
			int numStandalonePorts,
			int numPorts,
			int maxPorts,
			com.vmware.vim25.DVSUplinkPortPolicy uplinkPortPolicy,
			com.vmware.vim25.ManagedObjectReference[] uplinkPortgroup,
			com.vmware.vim25.DVPortSetting defaultPortConfig,
			com.vmware.vim25.DistributedVirtualSwitchHostMember[] host,
			com.vmware.vim25.DistributedVirtualSwitchProductSpec productInfo,
			com.vmware.vim25.DistributedVirtualSwitchProductSpec targetInfo,
			java.lang.String extensionKey,
			com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig,
			com.vmware.vim25.DVSPolicy policy,
			java.lang.String description,
			java.lang.String configVersion,
			com.vmware.vim25.DVSContactInfo contact,
			java.util.Calendar createTime,
			com.vmware.vim25.VMwareDVSPvlanMapEntry[] pvlanConfig,
			int maxMtu,
			com.vmware.vim25.LinkDiscoveryProtocolConfig linkDiscoveryProtocolConfig) {
		super(dynamicType, dynamicProperty, uuid, name, numStandalonePorts,
				numPorts, maxPorts, uplinkPortPolicy, uplinkPortgroup,
				defaultPortConfig, host, productInfo, targetInfo, extensionKey,
				vendorSpecificConfig, policy, description, configVersion,
				contact, createTime);
		this.pvlanConfig = pvlanConfig;
		this.maxMtu = maxMtu;
		this.linkDiscoveryProtocolConfig = linkDiscoveryProtocolConfig;
	}

	/**
	 * Gets the pvlanConfig value for this VMwareDVSConfigInfo.
	 * 
	 * @return pvlanConfig
	 */
	public com.vmware.vim25.VMwareDVSPvlanMapEntry[] getPvlanConfig() {
		return pvlanConfig;
	}

	/**
	 * Sets the pvlanConfig value for this VMwareDVSConfigInfo.
	 * 
	 * @param pvlanConfig
	 */
	public void setPvlanConfig(
			com.vmware.vim25.VMwareDVSPvlanMapEntry[] pvlanConfig) {
		this.pvlanConfig = pvlanConfig;
	}

	public com.vmware.vim25.VMwareDVSPvlanMapEntry getPvlanConfig(int i) {
		return this.pvlanConfig[i];
	}

	public void setPvlanConfig(int i,
			com.vmware.vim25.VMwareDVSPvlanMapEntry _value) {
		this.pvlanConfig[i] = _value;
	}

	/**
	 * Gets the maxMtu value for this VMwareDVSConfigInfo.
	 * 
	 * @return maxMtu
	 */
	public int getMaxMtu() {
		return maxMtu;
	}

	/**
	 * Sets the maxMtu value for this VMwareDVSConfigInfo.
	 * 
	 * @param maxMtu
	 */
	public void setMaxMtu(int maxMtu) {
		this.maxMtu = maxMtu;
	}

	/**
	 * Gets the linkDiscoveryProtocolConfig value for this VMwareDVSConfigInfo.
	 * 
	 * @return linkDiscoveryProtocolConfig
	 */
	public com.vmware.vim25.LinkDiscoveryProtocolConfig getLinkDiscoveryProtocolConfig() {
		return linkDiscoveryProtocolConfig;
	}

	/**
	 * Sets the linkDiscoveryProtocolConfig value for this VMwareDVSConfigInfo.
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
		if (!(obj instanceof VMwareDVSConfigInfo)) {
			return false;
		}
		VMwareDVSConfigInfo other = (VMwareDVSConfigInfo) obj;
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
				&& ((this.pvlanConfig == null && other.getPvlanConfig() == null) || (this.pvlanConfig != null && java.util.Arrays
						.equals(this.pvlanConfig, other.getPvlanConfig())))
				&& this.maxMtu == other.getMaxMtu()
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
		if (getPvlanConfig() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPvlanConfig()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPvlanConfig(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += getMaxMtu();
		if (getLinkDiscoveryProtocolConfig() != null) {
			_hashCode += getLinkDiscoveryProtocolConfig().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VMwareDVSConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VMwareDVSConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pvlanConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"pvlanConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VMwareDVSPvlanMapEntry"));
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
