/**
 * HostIpConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostIpConfig extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean dhcp;

	private java.lang.String ipAddress;

	private java.lang.String subnetMask;

	public HostIpConfig() {
	}

	public HostIpConfig(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, boolean dhcp,
			java.lang.String ipAddress, java.lang.String subnetMask) {
		super(dynamicType, dynamicProperty);
		this.dhcp = dhcp;
		this.ipAddress = ipAddress;
		this.subnetMask = subnetMask;
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
						.equals(other.getSubnetMask())));
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
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostIpConfig.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostIpConfig"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dhcp");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "dhcp"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipAddress");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"ipAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("subnetMask");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"subnetMask"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
