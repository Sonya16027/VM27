/**
 * HostInternetScsiHbaIPProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostInternetScsiHbaIPProperties extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String mac;

	private java.lang.String address;

	private boolean dhcpConfigurationEnabled;

	private java.lang.String subnetMask;

	private java.lang.String defaultGateway;

	private java.lang.String primaryDnsServerAddress;

	private java.lang.String alternateDnsServerAddress;

	private java.lang.String ipv6Address;

	private java.lang.String ipv6SubnetMask;

	private java.lang.String ipv6DefaultGateway;

	private java.lang.Boolean arpRedirectEnabled;

	private java.lang.Integer mtu;

	private java.lang.Boolean jumboFramesEnabled;

	public HostInternetScsiHbaIPProperties() {
	}

	public HostInternetScsiHbaIPProperties(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String mac, java.lang.String address,
			boolean dhcpConfigurationEnabled, java.lang.String subnetMask,
			java.lang.String defaultGateway,
			java.lang.String primaryDnsServerAddress,
			java.lang.String alternateDnsServerAddress,
			java.lang.String ipv6Address, java.lang.String ipv6SubnetMask,
			java.lang.String ipv6DefaultGateway,
			java.lang.Boolean arpRedirectEnabled, java.lang.Integer mtu,
			java.lang.Boolean jumboFramesEnabled) {
		super(dynamicType, dynamicProperty);
		this.mac = mac;
		this.address = address;
		this.dhcpConfigurationEnabled = dhcpConfigurationEnabled;
		this.subnetMask = subnetMask;
		this.defaultGateway = defaultGateway;
		this.primaryDnsServerAddress = primaryDnsServerAddress;
		this.alternateDnsServerAddress = alternateDnsServerAddress;
		this.ipv6Address = ipv6Address;
		this.ipv6SubnetMask = ipv6SubnetMask;
		this.ipv6DefaultGateway = ipv6DefaultGateway;
		this.arpRedirectEnabled = arpRedirectEnabled;
		this.mtu = mtu;
		this.jumboFramesEnabled = jumboFramesEnabled;
	}

	/**
	 * Gets the mac value for this HostInternetScsiHbaIPProperties.
	 * 
	 * @return mac
	 */
	public java.lang.String getMac() {
		return mac;
	}

	/**
	 * Sets the mac value for this HostInternetScsiHbaIPProperties.
	 * 
	 * @param mac
	 */
	public void setMac(java.lang.String mac) {
		this.mac = mac;
	}

	/**
	 * Gets the address value for this HostInternetScsiHbaIPProperties.
	 * 
	 * @return address
	 */
	public java.lang.String getAddress() {
		return address;
	}

	/**
	 * Sets the address value for this HostInternetScsiHbaIPProperties.
	 * 
	 * @param address
	 */
	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	/**
	 * Gets the dhcpConfigurationEnabled value for this
	 * HostInternetScsiHbaIPProperties.
	 * 
	 * @return dhcpConfigurationEnabled
	 */
	public boolean isDhcpConfigurationEnabled() {
		return dhcpConfigurationEnabled;
	}

	/**
	 * Sets the dhcpConfigurationEnabled value for this
	 * HostInternetScsiHbaIPProperties.
	 * 
	 * @param dhcpConfigurationEnabled
	 */
	public void setDhcpConfigurationEnabled(boolean dhcpConfigurationEnabled) {
		this.dhcpConfigurationEnabled = dhcpConfigurationEnabled;
	}

	/**
	 * Gets the subnetMask value for this HostInternetScsiHbaIPProperties.
	 * 
	 * @return subnetMask
	 */
	public java.lang.String getSubnetMask() {
		return subnetMask;
	}

	/**
	 * Sets the subnetMask value for this HostInternetScsiHbaIPProperties.
	 * 
	 * @param subnetMask
	 */
	public void setSubnetMask(java.lang.String subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Gets the defaultGateway value for this HostInternetScsiHbaIPProperties.
	 * 
	 * @return defaultGateway
	 */
	public java.lang.String getDefaultGateway() {
		return defaultGateway;
	}

	/**
	 * Sets the defaultGateway value for this HostInternetScsiHbaIPProperties.
	 * 
	 * @param defaultGateway
	 */
	public void setDefaultGateway(java.lang.String defaultGateway) {
		this.defaultGateway = defaultGateway;
	}

	/**
	 * Gets the primaryDnsServerAddress value for this
	 * HostInternetScsiHbaIPProperties.
	 * 
	 * @return primaryDnsServerAddress
	 */
	public java.lang.String getPrimaryDnsServerAddress() {
		return primaryDnsServerAddress;
	}

	/**
	 * Sets the primaryDnsServerAddress value for this
	 * HostInternetScsiHbaIPProperties.
	 * 
	 * @param primaryDnsServerAddress
	 */
	public void setPrimaryDnsServerAddress(
			java.lang.String primaryDnsServerAddress) {
		this.primaryDnsServerAddress = primaryDnsServerAddress;
	}

	/**
	 * Gets the alternateDnsServerAddress value for this
	 * HostInternetScsiHbaIPProperties.
	 * 
	 * @return alternateDnsServerAddress
	 */
	public java.lang.String getAlternateDnsServerAddress() {
		return alternateDnsServerAddress;
	}

	/**
	 * Sets the alternateDnsServerAddress value for this
	 * HostInternetScsiHbaIPProperties.
	 * 
	 * @param alternateDnsServerAddress
	 */
	public void setAlternateDnsServerAddress(
			java.lang.String alternateDnsServerAddress) {
		this.alternateDnsServerAddress = alternateDnsServerAddress;
	}

	/**
	 * Gets the ipv6Address value for this HostInternetScsiHbaIPProperties.
	 * 
	 * @return ipv6Address
	 */
	public java.lang.String getIpv6Address() {
		return ipv6Address;
	}

	/**
	 * Sets the ipv6Address value for this HostInternetScsiHbaIPProperties.
	 * 
	 * @param ipv6Address
	 */
	public void setIpv6Address(java.lang.String ipv6Address) {
		this.ipv6Address = ipv6Address;
	}

	/**
	 * Gets the ipv6SubnetMask value for this HostInternetScsiHbaIPProperties.
	 * 
	 * @return ipv6SubnetMask
	 */
	public java.lang.String getIpv6SubnetMask() {
		return ipv6SubnetMask;
	}

	/**
	 * Sets the ipv6SubnetMask value for this HostInternetScsiHbaIPProperties.
	 * 
	 * @param ipv6SubnetMask
	 */
	public void setIpv6SubnetMask(java.lang.String ipv6SubnetMask) {
		this.ipv6SubnetMask = ipv6SubnetMask;
	}

	/**
	 * Gets the ipv6DefaultGateway value for this
	 * HostInternetScsiHbaIPProperties.
	 * 
	 * @return ipv6DefaultGateway
	 */
	public java.lang.String getIpv6DefaultGateway() {
		return ipv6DefaultGateway;
	}

	/**
	 * Sets the ipv6DefaultGateway value for this
	 * HostInternetScsiHbaIPProperties.
	 * 
	 * @param ipv6DefaultGateway
	 */
	public void setIpv6DefaultGateway(java.lang.String ipv6DefaultGateway) {
		this.ipv6DefaultGateway = ipv6DefaultGateway;
	}

	/**
	 * Gets the arpRedirectEnabled value for this
	 * HostInternetScsiHbaIPProperties.
	 * 
	 * @return arpRedirectEnabled
	 */
	public java.lang.Boolean getArpRedirectEnabled() {
		return arpRedirectEnabled;
	}

	/**
	 * Sets the arpRedirectEnabled value for this
	 * HostInternetScsiHbaIPProperties.
	 * 
	 * @param arpRedirectEnabled
	 */
	public void setArpRedirectEnabled(java.lang.Boolean arpRedirectEnabled) {
		this.arpRedirectEnabled = arpRedirectEnabled;
	}

	/**
	 * Gets the mtu value for this HostInternetScsiHbaIPProperties.
	 * 
	 * @return mtu
	 */
	public java.lang.Integer getMtu() {
		return mtu;
	}

	/**
	 * Sets the mtu value for this HostInternetScsiHbaIPProperties.
	 * 
	 * @param mtu
	 */
	public void setMtu(java.lang.Integer mtu) {
		this.mtu = mtu;
	}

	/**
	 * Gets the jumboFramesEnabled value for this
	 * HostInternetScsiHbaIPProperties.
	 * 
	 * @return jumboFramesEnabled
	 */
	public java.lang.Boolean getJumboFramesEnabled() {
		return jumboFramesEnabled;
	}

	/**
	 * Sets the jumboFramesEnabled value for this
	 * HostInternetScsiHbaIPProperties.
	 * 
	 * @param jumboFramesEnabled
	 */
	public void setJumboFramesEnabled(java.lang.Boolean jumboFramesEnabled) {
		this.jumboFramesEnabled = jumboFramesEnabled;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostInternetScsiHbaIPProperties)) {
			return false;
		}
		HostInternetScsiHbaIPProperties other = (HostInternetScsiHbaIPProperties) obj;
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
				&& ((this.mac == null && other.getMac() == null) || (this.mac != null && this.mac
						.equals(other.getMac())))
				&& ((this.address == null && other.getAddress() == null) || (this.address != null && this.address
						.equals(other.getAddress())))
				&& this.dhcpConfigurationEnabled == other
						.isDhcpConfigurationEnabled()
				&& ((this.subnetMask == null && other.getSubnetMask() == null) || (this.subnetMask != null && this.subnetMask
						.equals(other.getSubnetMask())))
				&& ((this.defaultGateway == null && other.getDefaultGateway() == null) || (this.defaultGateway != null && this.defaultGateway
						.equals(other.getDefaultGateway())))
				&& ((this.primaryDnsServerAddress == null && other
						.getPrimaryDnsServerAddress() == null) || (this.primaryDnsServerAddress != null && this.primaryDnsServerAddress
						.equals(other.getPrimaryDnsServerAddress())))
				&& ((this.alternateDnsServerAddress == null && other
						.getAlternateDnsServerAddress() == null) || (this.alternateDnsServerAddress != null && this.alternateDnsServerAddress
						.equals(other.getAlternateDnsServerAddress())))
				&& ((this.ipv6Address == null && other.getIpv6Address() == null) || (this.ipv6Address != null && this.ipv6Address
						.equals(other.getIpv6Address())))
				&& ((this.ipv6SubnetMask == null && other.getIpv6SubnetMask() == null) || (this.ipv6SubnetMask != null && this.ipv6SubnetMask
						.equals(other.getIpv6SubnetMask())))
				&& ((this.ipv6DefaultGateway == null && other
						.getIpv6DefaultGateway() == null) || (this.ipv6DefaultGateway != null && this.ipv6DefaultGateway
						.equals(other.getIpv6DefaultGateway())))
				&& ((this.arpRedirectEnabled == null && other
						.getArpRedirectEnabled() == null) || (this.arpRedirectEnabled != null && this.arpRedirectEnabled
						.equals(other.getArpRedirectEnabled())))
				&& ((this.mtu == null && other.getMtu() == null) || (this.mtu != null && this.mtu
						.equals(other.getMtu())))
				&& ((this.jumboFramesEnabled == null && other
						.getJumboFramesEnabled() == null) || (this.jumboFramesEnabled != null && this.jumboFramesEnabled
						.equals(other.getJumboFramesEnabled())));
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
		if (getMac() != null) {
			_hashCode += getMac().hashCode();
		}
		if (getAddress() != null) {
			_hashCode += getAddress().hashCode();
		}
		_hashCode += (isDhcpConfigurationEnabled() ? Boolean.TRUE
				: Boolean.FALSE).hashCode();
		if (getSubnetMask() != null) {
			_hashCode += getSubnetMask().hashCode();
		}
		if (getDefaultGateway() != null) {
			_hashCode += getDefaultGateway().hashCode();
		}
		if (getPrimaryDnsServerAddress() != null) {
			_hashCode += getPrimaryDnsServerAddress().hashCode();
		}
		if (getAlternateDnsServerAddress() != null) {
			_hashCode += getAlternateDnsServerAddress().hashCode();
		}
		if (getIpv6Address() != null) {
			_hashCode += getIpv6Address().hashCode();
		}
		if (getIpv6SubnetMask() != null) {
			_hashCode += getIpv6SubnetMask().hashCode();
		}
		if (getIpv6DefaultGateway() != null) {
			_hashCode += getIpv6DefaultGateway().hashCode();
		}
		if (getArpRedirectEnabled() != null) {
			_hashCode += getArpRedirectEnabled().hashCode();
		}
		if (getMtu() != null) {
			_hashCode += getMtu().hashCode();
		}
		if (getJumboFramesEnabled() != null) {
			_hashCode += getJumboFramesEnabled().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostInternetScsiHbaIPProperties.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaIPProperties"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mac");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mac"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("address");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"address"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dhcpConfigurationEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dhcpConfigurationEnabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
		elemField.setFieldName("defaultGateway");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"defaultGateway"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("primaryDnsServerAddress");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"primaryDnsServerAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("alternateDnsServerAddress");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"alternateDnsServerAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipv6Address");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipv6Address"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipv6SubnetMask");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipv6SubnetMask"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipv6DefaultGateway");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipv6DefaultGateway"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("arpRedirectEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"arpRedirectEnabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mtu");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mtu"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("jumboFramesEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"jumboFramesEnabled"));
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
