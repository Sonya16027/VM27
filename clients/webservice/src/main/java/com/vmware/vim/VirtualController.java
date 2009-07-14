/**
 * VirtualController.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualController extends com.vmware.vim.VirtualDevice implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int busNumber;

	private int[] device;

	public VirtualController() {
	}

	public VirtualController(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, int key,
			com.vmware.vim.Description deviceInfo,
			com.vmware.vim.VirtualDeviceBackingInfo backing,
			com.vmware.vim.VirtualDeviceConnectInfo connectable,
			java.lang.Integer controllerKey, java.lang.Integer unitNumber,
			int busNumber, int[] device) {
		super(dynamicType, dynamicProperty, key, deviceInfo, backing,
				connectable, controllerKey, unitNumber);
		this.busNumber = busNumber;
		this.device = device;
	}

	/**
	 * Gets the busNumber value for this VirtualController.
	 * 
	 * @return busNumber
	 */
	public int getBusNumber() {
		return busNumber;
	}

	/**
	 * Sets the busNumber value for this VirtualController.
	 * 
	 * @param busNumber
	 */
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	/**
	 * Gets the device value for this VirtualController.
	 * 
	 * @return device
	 */
	public int[] getDevice() {
		return device;
	}

	/**
	 * Sets the device value for this VirtualController.
	 * 
	 * @param device
	 */
	public void setDevice(int[] device) {
		this.device = device;
	}

	public int getDevice(int i) {
		return this.device[i];
	}

	public void setDevice(int i, int _value) {
		this.device[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualController)) {
			return false;
		}
		VirtualController other = (VirtualController) obj;
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
				&& this.busNumber == other.getBusNumber()
				&& ((this.device == null && other.getDevice() == null) || (this.device != null && java.util.Arrays
						.equals(this.device, other.getDevice())));
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
		_hashCode += getBusNumber();
		if (getDevice() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getDevice()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getDevice(),
						i);
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
			VirtualController.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualController"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("busNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"busNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("device");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "device"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
