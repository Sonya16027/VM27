/**
 * VirtualUSBController.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualUSBController extends com.vmware.vim25.VirtualController
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Boolean autoConnectDevices;

	private java.lang.Boolean ehciEnabled;

	public VirtualUSBController() {
	}

	public VirtualUSBController(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int key,
			com.vmware.vim25.Description deviceInfo,
			com.vmware.vim25.VirtualDeviceBackingInfo backing,
			com.vmware.vim25.VirtualDeviceConnectInfo connectable,
			java.lang.Integer controllerKey, java.lang.Integer unitNumber,
			int busNumber, int[] device, java.lang.Boolean autoConnectDevices,
			java.lang.Boolean ehciEnabled) {
		super(dynamicType, dynamicProperty, key, deviceInfo, backing,
				connectable, controllerKey, unitNumber, busNumber, device);
		this.autoConnectDevices = autoConnectDevices;
		this.ehciEnabled = ehciEnabled;
	}

	/**
	 * Gets the autoConnectDevices value for this VirtualUSBController.
	 * 
	 * @return autoConnectDevices
	 */
	public java.lang.Boolean getAutoConnectDevices() {
		return autoConnectDevices;
	}

	/**
	 * Sets the autoConnectDevices value for this VirtualUSBController.
	 * 
	 * @param autoConnectDevices
	 */
	public void setAutoConnectDevices(java.lang.Boolean autoConnectDevices) {
		this.autoConnectDevices = autoConnectDevices;
	}

	/**
	 * Gets the ehciEnabled value for this VirtualUSBController.
	 * 
	 * @return ehciEnabled
	 */
	public java.lang.Boolean getEhciEnabled() {
		return ehciEnabled;
	}

	/**
	 * Sets the ehciEnabled value for this VirtualUSBController.
	 * 
	 * @param ehciEnabled
	 */
	public void setEhciEnabled(java.lang.Boolean ehciEnabled) {
		this.ehciEnabled = ehciEnabled;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualUSBController)) {
			return false;
		}
		VirtualUSBController other = (VirtualUSBController) obj;
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
				&& ((this.autoConnectDevices == null && other
						.getAutoConnectDevices() == null) || (this.autoConnectDevices != null && this.autoConnectDevices
						.equals(other.getAutoConnectDevices())))
				&& ((this.ehciEnabled == null && other.getEhciEnabled() == null) || (this.ehciEnabled != null && this.ehciEnabled
						.equals(other.getEhciEnabled())));
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
		if (getAutoConnectDevices() != null) {
			_hashCode += getAutoConnectDevices().hashCode();
		}
		if (getEhciEnabled() != null) {
			_hashCode += getEhciEnabled().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualUSBController.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualUSBController"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("autoConnectDevices");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"autoConnectDevices"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ehciEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ehciEnabled"));
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
