/**
 * IpPoolIpPoolConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class IpPoolIpPoolConfigInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String subnetAddress;

	private java.lang.String netmask;

	private java.lang.String gateway;

	private java.lang.String range;

	private java.lang.String[] dns;

	private java.lang.Boolean dhcpServerAvailable;

	private java.lang.Boolean ipPoolEnabled;

	public IpPoolIpPoolConfigInfo() {
	}

	public IpPoolIpPoolConfigInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String subnetAddress, java.lang.String netmask,
			java.lang.String gateway, java.lang.String range,
			java.lang.String[] dns, java.lang.Boolean dhcpServerAvailable,
			java.lang.Boolean ipPoolEnabled) {
		super(dynamicType, dynamicProperty);
		this.subnetAddress = subnetAddress;
		this.netmask = netmask;
		this.gateway = gateway;
		this.range = range;
		this.dns = dns;
		this.dhcpServerAvailable = dhcpServerAvailable;
		this.ipPoolEnabled = ipPoolEnabled;
	}

	/**
	 * Gets the subnetAddress value for this IpPoolIpPoolConfigInfo.
	 * 
	 * @return subnetAddress
	 */
	public java.lang.String getSubnetAddress() {
		return subnetAddress;
	}

	/**
	 * Sets the subnetAddress value for this IpPoolIpPoolConfigInfo.
	 * 
	 * @param subnetAddress
	 */
	public void setSubnetAddress(java.lang.String subnetAddress) {
		this.subnetAddress = subnetAddress;
	}

	/**
	 * Gets the netmask value for this IpPoolIpPoolConfigInfo.
	 * 
	 * @return netmask
	 */
	public java.lang.String getNetmask() {
		return netmask;
	}

	/**
	 * Sets the netmask value for this IpPoolIpPoolConfigInfo.
	 * 
	 * @param netmask
	 */
	public void setNetmask(java.lang.String netmask) {
		this.netmask = netmask;
	}

	/**
	 * Gets the gateway value for this IpPoolIpPoolConfigInfo.
	 * 
	 * @return gateway
	 */
	public java.lang.String getGateway() {
		return gateway;
	}

	/**
	 * Sets the gateway value for this IpPoolIpPoolConfigInfo.
	 * 
	 * @param gateway
	 */
	public void setGateway(java.lang.String gateway) {
		this.gateway = gateway;
	}

	/**
	 * Gets the range value for this IpPoolIpPoolConfigInfo.
	 * 
	 * @return range
	 */
	public java.lang.String getRange() {
		return range;
	}

	/**
	 * Sets the range value for this IpPoolIpPoolConfigInfo.
	 * 
	 * @param range
	 */
	public void setRange(java.lang.String range) {
		this.range = range;
	}

	/**
	 * Gets the dns value for this IpPoolIpPoolConfigInfo.
	 * 
	 * @return dns
	 */
	public java.lang.String[] getDns() {
		return dns;
	}

	/**
	 * Sets the dns value for this IpPoolIpPoolConfigInfo.
	 * 
	 * @param dns
	 */
	public void setDns(java.lang.String[] dns) {
		this.dns = dns;
	}

	public java.lang.String getDns(int i) {
		return this.dns[i];
	}

	public void setDns(int i, java.lang.String _value) {
		this.dns[i] = _value;
	}

	/**
	 * Gets the dhcpServerAvailable value for this IpPoolIpPoolConfigInfo.
	 * 
	 * @return dhcpServerAvailable
	 */
	public java.lang.Boolean getDhcpServerAvailable() {
		return dhcpServerAvailable;
	}

	/**
	 * Sets the dhcpServerAvailable value for this IpPoolIpPoolConfigInfo.
	 * 
	 * @param dhcpServerAvailable
	 */
	public void setDhcpServerAvailable(java.lang.Boolean dhcpServerAvailable) {
		this.dhcpServerAvailable = dhcpServerAvailable;
	}

	/**
	 * Gets the ipPoolEnabled value for this IpPoolIpPoolConfigInfo.
	 * 
	 * @return ipPoolEnabled
	 */
	public java.lang.Boolean getIpPoolEnabled() {
		return ipPoolEnabled;
	}

	/**
	 * Sets the ipPoolEnabled value for this IpPoolIpPoolConfigInfo.
	 * 
	 * @param ipPoolEnabled
	 */
	public void setIpPoolEnabled(java.lang.Boolean ipPoolEnabled) {
		this.ipPoolEnabled = ipPoolEnabled;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IpPoolIpPoolConfigInfo)) {
			return false;
		}
		IpPoolIpPoolConfigInfo other = (IpPoolIpPoolConfigInfo) obj;
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
				&& ((this.subnetAddress == null && other.getSubnetAddress() == null) || (this.subnetAddress != null && this.subnetAddress
						.equals(other.getSubnetAddress())))
				&& ((this.netmask == null && other.getNetmask() == null) || (this.netmask != null && this.netmask
						.equals(other.getNetmask())))
				&& ((this.gateway == null && other.getGateway() == null) || (this.gateway != null && this.gateway
						.equals(other.getGateway())))
				&& ((this.range == null && other.getRange() == null) || (this.range != null && this.range
						.equals(other.getRange())))
				&& ((this.dns == null && other.getDns() == null) || (this.dns != null && java.util.Arrays
						.equals(this.dns, other.getDns())))
				&& ((this.dhcpServerAvailable == null && other
						.getDhcpServerAvailable() == null) || (this.dhcpServerAvailable != null && this.dhcpServerAvailable
						.equals(other.getDhcpServerAvailable())))
				&& ((this.ipPoolEnabled == null && other.getIpPoolEnabled() == null) || (this.ipPoolEnabled != null && this.ipPoolEnabled
						.equals(other.getIpPoolEnabled())));
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
		if (getSubnetAddress() != null) {
			_hashCode += getSubnetAddress().hashCode();
		}
		if (getNetmask() != null) {
			_hashCode += getNetmask().hashCode();
		}
		if (getGateway() != null) {
			_hashCode += getGateway().hashCode();
		}
		if (getRange() != null) {
			_hashCode += getRange().hashCode();
		}
		if (getDns() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getDns()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getDns(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDhcpServerAvailable() != null) {
			_hashCode += getDhcpServerAvailable().hashCode();
		}
		if (getIpPoolEnabled() != null) {
			_hashCode += getIpPoolEnabled().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			IpPoolIpPoolConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IpPoolIpPoolConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("subnetAddress");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"subnetAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("netmask");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"netmask"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("gateway");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"gateway"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("range");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "range"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dns");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dns"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dhcpServerAvailable");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dhcpServerAvailable"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipPoolEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipPoolEnabled"));
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
