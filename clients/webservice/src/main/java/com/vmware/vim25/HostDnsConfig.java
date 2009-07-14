/**
 * HostDnsConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDnsConfig extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean dhcp;

	private java.lang.String virtualNicDevice;

	private java.lang.String hostName;

	private java.lang.String domainName;

	private java.lang.String[] address;

	private java.lang.String[] searchDomain;

	public HostDnsConfig() {
	}

	public HostDnsConfig(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, boolean dhcp,
			java.lang.String virtualNicDevice, java.lang.String hostName,
			java.lang.String domainName, java.lang.String[] address,
			java.lang.String[] searchDomain) {
		super(dynamicType, dynamicProperty);
		this.dhcp = dhcp;
		this.virtualNicDevice = virtualNicDevice;
		this.hostName = hostName;
		this.domainName = domainName;
		this.address = address;
		this.searchDomain = searchDomain;
	}

	/**
	 * Gets the dhcp value for this HostDnsConfig.
	 * 
	 * @return dhcp
	 */
	public boolean isDhcp() {
		return dhcp;
	}

	/**
	 * Sets the dhcp value for this HostDnsConfig.
	 * 
	 * @param dhcp
	 */
	public void setDhcp(boolean dhcp) {
		this.dhcp = dhcp;
	}

	/**
	 * Gets the virtualNicDevice value for this HostDnsConfig.
	 * 
	 * @return virtualNicDevice
	 */
	public java.lang.String getVirtualNicDevice() {
		return virtualNicDevice;
	}

	/**
	 * Sets the virtualNicDevice value for this HostDnsConfig.
	 * 
	 * @param virtualNicDevice
	 */
	public void setVirtualNicDevice(java.lang.String virtualNicDevice) {
		this.virtualNicDevice = virtualNicDevice;
	}

	/**
	 * Gets the hostName value for this HostDnsConfig.
	 * 
	 * @return hostName
	 */
	public java.lang.String getHostName() {
		return hostName;
	}

	/**
	 * Sets the hostName value for this HostDnsConfig.
	 * 
	 * @param hostName
	 */
	public void setHostName(java.lang.String hostName) {
		this.hostName = hostName;
	}

	/**
	 * Gets the domainName value for this HostDnsConfig.
	 * 
	 * @return domainName
	 */
	public java.lang.String getDomainName() {
		return domainName;
	}

	/**
	 * Sets the domainName value for this HostDnsConfig.
	 * 
	 * @param domainName
	 */
	public void setDomainName(java.lang.String domainName) {
		this.domainName = domainName;
	}

	/**
	 * Gets the address value for this HostDnsConfig.
	 * 
	 * @return address
	 */
	public java.lang.String[] getAddress() {
		return address;
	}

	/**
	 * Sets the address value for this HostDnsConfig.
	 * 
	 * @param address
	 */
	public void setAddress(java.lang.String[] address) {
		this.address = address;
	}

	public java.lang.String getAddress(int i) {
		return this.address[i];
	}

	public void setAddress(int i, java.lang.String _value) {
		this.address[i] = _value;
	}

	/**
	 * Gets the searchDomain value for this HostDnsConfig.
	 * 
	 * @return searchDomain
	 */
	public java.lang.String[] getSearchDomain() {
		return searchDomain;
	}

	/**
	 * Sets the searchDomain value for this HostDnsConfig.
	 * 
	 * @param searchDomain
	 */
	public void setSearchDomain(java.lang.String[] searchDomain) {
		this.searchDomain = searchDomain;
	}

	public java.lang.String getSearchDomain(int i) {
		return this.searchDomain[i];
	}

	public void setSearchDomain(int i, java.lang.String _value) {
		this.searchDomain[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostDnsConfig)) {
			return false;
		}
		HostDnsConfig other = (HostDnsConfig) obj;
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
				&& ((this.virtualNicDevice == null && other
						.getVirtualNicDevice() == null) || (this.virtualNicDevice != null && this.virtualNicDevice
						.equals(other.getVirtualNicDevice())))
				&& ((this.hostName == null && other.getHostName() == null) || (this.hostName != null && this.hostName
						.equals(other.getHostName())))
				&& ((this.domainName == null && other.getDomainName() == null) || (this.domainName != null && this.domainName
						.equals(other.getDomainName())))
				&& ((this.address == null && other.getAddress() == null) || (this.address != null && java.util.Arrays
						.equals(this.address, other.getAddress())))
				&& ((this.searchDomain == null && other.getSearchDomain() == null) || (this.searchDomain != null && java.util.Arrays
						.equals(this.searchDomain, other.getSearchDomain())));
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
		if (getVirtualNicDevice() != null) {
			_hashCode += getVirtualNicDevice().hashCode();
		}
		if (getHostName() != null) {
			_hashCode += getHostName().hashCode();
		}
		if (getDomainName() != null) {
			_hashCode += getDomainName().hashCode();
		}
		if (getAddress() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getAddress()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getAddress(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getSearchDomain() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSearchDomain()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSearchDomain(), i);
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
			HostDnsConfig.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDnsConfig"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dhcp");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dhcp"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualNicDevice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"virtualNicDevice"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hostName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("domainName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"domainName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("searchDomain");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"searchDomain"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
