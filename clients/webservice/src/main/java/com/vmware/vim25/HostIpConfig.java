/**
 * HostIpConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostIpConfig extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean dhcp;

	private java.lang.String ipAddress;

	private java.lang.String subnetMask;

	private com.vmware.vim25.HostIpConfigIpV6AddressConfiguration ipV6Config;

	public HostIpConfig() {
	}

	public HostIpConfig(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, boolean dhcp,
			java.lang.String ipAddress, java.lang.String subnetMask,
			com.vmware.vim25.HostIpConfigIpV6AddressConfiguration ipV6Config) {
		super(dynamicType, dynamicProperty);
		this.dhcp = dhcp;
		this.ipAddress = ipAddress;
		this.subnetMask = subnetMask;
		this.ipV6Config = ipV6Config;
	}

	/**
	 * Gets the dhcp value for this HostIpConfig.
	 * 
	 * @return dhcp
	 */
	public boolean isDhcp() {
		return dhcp;
	}

	/**
	 * Sets the dhcp value for this HostIpConfig.
	 * 
	 * @param dhcp
	 */
	public void setDhcp(boolean dhcp) {
		this.dhcp = dhcp;
	}

	/**
	 * Gets the ipAddress value for this HostIpConfig.
	 * 
	 * @return ipAddress
	 */
	public java.lang.String getIpAddress() {
		return ipAddress;
	}

	/**
	 * Sets the ipAddress value for this HostIpConfig.
	 * 
	 * @param ipAddress
	 */
	public void setIpAddress(java.lang.String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * Gets the subnetMask value for this HostIpConfig.
	 * 
	 * @return subnetMask
	 */
	public java.lang.String getSubnetMask() {
		return subnetMask;
	}

	/**
	 * Sets the subnetMask value for this HostIpConfig.
	 * 
	 * @param subnetMask
	 */
	public void setSubnetMask(java.lang.String subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Gets the ipV6Config value for this HostIpConfig.
	 * 
	 * @return ipV6Config
	 */
	public com.vmware.vim25.HostIpConfigIpV6AddressConfiguration getIpV6Config() {
		return ipV6Config;
	}

	/**
	 * Sets the ipV6Config value for this HostIpConfig.
	 * 
	 * @param ipV6Config
	 */
	public void setIpV6Config(
			com.vmware.vim25.HostIpConfigIpV6AddressConfiguration ipV6Config) {
		this.ipV6Config = ipV6Config;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostIpConfig)) {
			return false;
		}
		HostIpConfig other = (HostIpConfig) obj;
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
				&& this.dhcp == other.isDhcp()
				&& ((this.ipAddress == null && other.getIpAddress() == null) || (this.ipAddress != null && this.ipAddress
						.equals(other.getIpAddress())))
				&& ((this.subnetMask == null && other.getSubnetMask() == null) || (this.subnetMask != null && this.subnetMask
						.equals(other.getSubnetMask())))
				&& ((this.ipV6Config == null && other.getIpV6Config() == null) || (this.ipV6Config != null && this.ipV6Config
						.equals(other.getIpV6Config())));
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
		_hashCode += (isDhcp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getIpAddress() != null) {
			_hashCode += getIpAddress().hashCode();
		}
		if (getSubnetMask() != null) {
			_hashCode += getSubnetMask().hashCode();
		}
		if (getIpV6Config() != null) {
			_hashCode += getIpV6Config().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostIpConfig.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostIpConfig"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dhcp");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dhcp"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipAddress");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("subnetMask");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"subnetMask"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipV6Config");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipV6Config"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostIpConfigIpV6AddressConfiguration"));
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
