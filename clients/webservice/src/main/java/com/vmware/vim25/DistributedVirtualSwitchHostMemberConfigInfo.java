/**
 * DistributedVirtualSwitchHostMemberConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DistributedVirtualSwitchHostMemberConfigInfo extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference host;

	private int maxProxySwitchPorts;

	private com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig;

	private com.vmware.vim25.DistributedVirtualSwitchHostMemberBacking backing;

	public DistributedVirtualSwitchHostMemberConfigInfo() {
	}

	public DistributedVirtualSwitchHostMemberConfigInfo(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference host,
			int maxProxySwitchPorts,
			com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] vendorSpecificConfig,
			com.vmware.vim25.DistributedVirtualSwitchHostMemberBacking backing) {
		super(dynamicType, dynamicProperty);
		this.host = host;
		this.maxProxySwitchPorts = maxProxySwitchPorts;
		this.vendorSpecificConfig = vendorSpecificConfig;
		this.backing = backing;
	}

	/**
	 * Gets the host value for this
	 * DistributedVirtualSwitchHostMemberConfigInfo.
	 * 
	 * @return host
	 */
	public com.vmware.vim25.ManagedObjectReference getHost() {
		return host;
	}

	/**
	 * Sets the host value for this
	 * DistributedVirtualSwitchHostMemberConfigInfo.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim25.ManagedObjectReference host) {
		this.host = host;
	}

	/**
	 * Gets the maxProxySwitchPorts value for this
	 * DistributedVirtualSwitchHostMemberConfigInfo.
	 * 
	 * @return maxProxySwitchPorts
	 */
	public int getMaxProxySwitchPorts() {
		return maxProxySwitchPorts;
	}

	/**
	 * Sets the maxProxySwitchPorts value for this
	 * DistributedVirtualSwitchHostMemberConfigInfo.
	 * 
	 * @param maxProxySwitchPorts
	 */
	public void setMaxProxySwitchPorts(int maxProxySwitchPorts) {
		this.maxProxySwitchPorts = maxProxySwitchPorts;
	}

	/**
	 * Gets the vendorSpecificConfig value for this
	 * DistributedVirtualSwitchHostMemberConfigInfo.
	 * 
	 * @return vendorSpecificConfig
	 */
	public com.vmware.vim25.DistributedVirtualSwitchKeyedOpaqueBlob[] getVendorSpecificConfig() {
		return vendorSpecificConfig;
	}

	/**
	 * Sets the vendorSpecificConfig value for this
	 * DistributedVirtualSwitchHostMemberConfigInfo.
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
	 * Gets the backing value for this
	 * DistributedVirtualSwitchHostMemberConfigInfo.
	 * 
	 * @return backing
	 */
	public com.vmware.vim25.DistributedVirtualSwitchHostMemberBacking getBacking() {
		return backing;
	}

	/**
	 * Sets the backing value for this
	 * DistributedVirtualSwitchHostMemberConfigInfo.
	 * 
	 * @param backing
	 */
	public void setBacking(
			com.vmware.vim25.DistributedVirtualSwitchHostMemberBacking backing) {
		this.backing = backing;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DistributedVirtualSwitchHostMemberConfigInfo)) {
			return false;
		}
		DistributedVirtualSwitchHostMemberConfigInfo other = (DistributedVirtualSwitchHostMemberConfigInfo) obj;
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
				&& ((this.host == null && other.getHost() == null) || (this.host != null && this.host
						.equals(other.getHost())))
				&& this.maxProxySwitchPorts == other.getMaxProxySwitchPorts()
				&& ((this.vendorSpecificConfig == null && other
						.getVendorSpecificConfig() == null) || (this.vendorSpecificConfig != null && java.util.Arrays
						.equals(this.vendorSpecificConfig, other
								.getVendorSpecificConfig())))
				&& ((this.backing == null && other.getBacking() == null) || (this.backing != null && this.backing
						.equals(other.getBacking())));
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
		if (getHost() != null) {
			_hashCode += getHost().hashCode();
		}
		_hashCode += getMaxProxySwitchPorts();
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
		if (getBacking() != null) {
			_hashCode += getBacking().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DistributedVirtualSwitchHostMemberConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchHostMemberConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxProxySwitchPorts");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"maxProxySwitchPorts"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
		elemField.setFieldName("backing");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"backing"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchHostMemberBacking"));
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
