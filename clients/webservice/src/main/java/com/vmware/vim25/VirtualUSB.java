/**
 * VirtualUSB.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualUSB extends com.vmware.vim25.VirtualDevice implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean connected;

	public VirtualUSB() {
	}

	public VirtualUSB(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int key,
			com.vmware.vim25.Description deviceInfo,
			com.vmware.vim25.VirtualDeviceBackingInfo backing,
			com.vmware.vim25.VirtualDeviceConnectInfo connectable,
			java.lang.Integer controllerKey, java.lang.Integer unitNumber,
			boolean connected) {
		super(dynamicType, dynamicProperty, key, deviceInfo, backing,
				connectable, controllerKey, unitNumber);
		this.connected = connected;
	}

	/**
	 * Gets the connected value for this VirtualUSB.
	 * 
	 * @return connected
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * Sets the connected value for this VirtualUSB.
	 * 
	 * @param connected
	 */
	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualUSB)) {
			return false;
		}
		VirtualUSB other = (VirtualUSB) obj;
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
		_equals = super.equals(obj) && this.connected == other.isConnected();
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
		_hashCode += (isConnected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualUSB.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualUSB"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("connected");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"connected"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
