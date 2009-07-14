/**
 * HostIpConfigIpV6AddressConfiguration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostIpConfigIpV6AddressConfiguration extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.HostIpConfigIpV6Address[] ipV6Address;

	private java.lang.Boolean autoConfigurationEnabled;

	private java.lang.Boolean dhcpV6Enabled;

	public HostIpConfigIpV6AddressConfiguration() {
	}

	public HostIpConfigIpV6AddressConfiguration(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.HostIpConfigIpV6Address[] ipV6Address,
			java.lang.Boolean autoConfigurationEnabled,
			java.lang.Boolean dhcpV6Enabled) {
		super(dynamicType, dynamicProperty);
		this.ipV6Address = ipV6Address;
		this.autoConfigurationEnabled = autoConfigurationEnabled;
		this.dhcpV6Enabled = dhcpV6Enabled;
	}

	/**
	 * Gets the ipV6Address value for this HostIpConfigIpV6AddressConfiguration.
	 * 
	 * @return ipV6Address
	 */
	public com.vmware.vim25.HostIpConfigIpV6Address[] getIpV6Address() {
		return ipV6Address;
	}

	/**
	 * Sets the ipV6Address value for this HostIpConfigIpV6AddressConfiguration.
	 * 
	 * @param ipV6Address
	 */
	public void setIpV6Address(
			com.vmware.vim25.HostIpConfigIpV6Address[] ipV6Address) {
		this.ipV6Address = ipV6Address;
	}

	public com.vmware.vim25.HostIpConfigIpV6Address getIpV6Address(int i) {
		return this.ipV6Address[i];
	}

	public void setIpV6Address(int i,
			com.vmware.vim25.HostIpConfigIpV6Address _value) {
		this.ipV6Address[i] = _value;
	}

	/**
	 * Gets the autoConfigurationEnabled value for this
	 * HostIpConfigIpV6AddressConfiguration.
	 * 
	 * @return autoConfigurationEnabled
	 */
	public java.lang.Boolean getAutoConfigurationEnabled() {
		return autoConfigurationEnabled;
	}

	/**
	 * Sets the autoConfigurationEnabled value for this
	 * HostIpConfigIpV6AddressConfiguration.
	 * 
	 * @param autoConfigurationEnabled
	 */
	public void setAutoConfigurationEnabled(
			java.lang.Boolean autoConfigurationEnabled) {
		this.autoConfigurationEnabled = autoConfigurationEnabled;
	}

	/**
	 * Gets the dhcpV6Enabled value for this
	 * HostIpConfigIpV6AddressConfiguration.
	 * 
	 * @return dhcpV6Enabled
	 */
	public java.lang.Boolean getDhcpV6Enabled() {
		return dhcpV6Enabled;
	}

	/**
	 * Sets the dhcpV6Enabled value for this
	 * HostIpConfigIpV6AddressConfiguration.
	 * 
	 * @param dhcpV6Enabled
	 */
	public void setDhcpV6Enabled(java.lang.Boolean dhcpV6Enabled) {
		this.dhcpV6Enabled = dhcpV6Enabled;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostIpConfigIpV6AddressConfiguration)) {
			return false;
		}
		HostIpConfigIpV6AddressConfiguration other = (HostIpConfigIpV6AddressConfiguration) obj;
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
				&& ((this.ipV6Address == null && other.getIpV6Address() == null) || (this.ipV6Address != null && java.util.Arrays
						.equals(this.ipV6Address, other.getIpV6Address())))
				&& ((this.autoConfigurationEnabled == null && other
						.getAutoConfigurationEnabled() == null) || (this.autoConfigurationEnabled != null && this.autoConfigurationEnabled
						.equals(other.getAutoConfigurationEnabled())))
				&& ((this.dhcpV6Enabled == null && other.getDhcpV6Enabled() == null) || (this.dhcpV6Enabled != null && this.dhcpV6Enabled
						.equals(other.getDhcpV6Enabled())));
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
		if (getIpV6Address() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getIpV6Address()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getIpV6Address(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getAutoConfigurationEnabled() != null) {
			_hashCode += getAutoConfigurationEnabled().hashCode();
		}
		if (getDhcpV6Enabled() != null) {
			_hashCode += getDhcpV6Enabled().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostIpConfigIpV6AddressConfiguration.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostIpConfigIpV6AddressConfiguration"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipV6Address");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipV6Address"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostIpConfigIpV6Address"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoConfigurationEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"autoConfigurationEnabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dhcpV6Enabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dhcpV6Enabled"));
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
