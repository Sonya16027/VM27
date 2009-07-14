/**
 * HostIpRouteConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostIpRouteConfig extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String defaultGateway;

	private java.lang.String gatewayDevice;

	public HostIpRouteConfig() {
	}

	public HostIpRouteConfig(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String defaultGateway, java.lang.String gatewayDevice) {
		super(dynamicType, dynamicProperty);
		this.defaultGateway = defaultGateway;
		this.gatewayDevice = gatewayDevice;
	}

	/**
	 * Gets the defaultGateway value for this HostIpRouteConfig.
	 * 
	 * @return defaultGateway
	 */
	public java.lang.String getDefaultGateway() {
		return defaultGateway;
	}

	/**
	 * Sets the defaultGateway value for this HostIpRouteConfig.
	 * 
	 * @param defaultGateway
	 */
	public void setDefaultGateway(java.lang.String defaultGateway) {
		this.defaultGateway = defaultGateway;
	}

	/**
	 * Gets the gatewayDevice value for this HostIpRouteConfig.
	 * 
	 * @return gatewayDevice
	 */
	public java.lang.String getGatewayDevice() {
		return gatewayDevice;
	}

	/**
	 * Sets the gatewayDevice value for this HostIpRouteConfig.
	 * 
	 * @param gatewayDevice
	 */
	public void setGatewayDevice(java.lang.String gatewayDevice) {
		this.gatewayDevice = gatewayDevice;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostIpRouteConfig)) {
			return false;
		}
		HostIpRouteConfig other = (HostIpRouteConfig) obj;
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
				&& ((this.defaultGateway == null && other.getDefaultGateway() == null) || (this.defaultGateway != null && this.defaultGateway
						.equals(other.getDefaultGateway())))
				&& ((this.gatewayDevice == null && other.getGatewayDevice() == null) || (this.gatewayDevice != null && this.gatewayDevice
						.equals(other.getGatewayDevice())));
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
		if (getDefaultGateway() != null) {
			_hashCode += getDefaultGateway().hashCode();
		}
		if (getGatewayDevice() != null) {
			_hashCode += getGatewayDevice().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostIpRouteConfig.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostIpRouteConfig"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultGateway");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"defaultGateway"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("gatewayDevice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"gatewayDevice"));
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
