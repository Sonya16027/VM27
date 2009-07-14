/**
 * DeviceBackedVirtualDiskSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DeviceBackedVirtualDiskSpec extends
		com.vmware.vim25.VirtualDiskSpec implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String device;

	public DeviceBackedVirtualDiskSpec() {
	}

	public DeviceBackedVirtualDiskSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String diskType, java.lang.String adapterType,
			java.lang.String device) {
		super(dynamicType, dynamicProperty, diskType, adapterType);
		this.device = device;
	}

	/**
	 * Gets the device value for this DeviceBackedVirtualDiskSpec.
	 * 
	 * @return device
	 */
	public java.lang.String getDevice() {
		return device;
	}

	/**
	 * Sets the device value for this DeviceBackedVirtualDiskSpec.
	 * 
	 * @param device
	 */
	public void setDevice(java.lang.String device) {
		this.device = device;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DeviceBackedVirtualDiskSpec)) {
			return false;
		}
		DeviceBackedVirtualDiskSpec other = (DeviceBackedVirtualDiskSpec) obj;
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
				&& ((this.device == null && other.getDevice() == null) || (this.device != null && this.device
						.equals(other.getDevice())));
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
		if (getDevice() != null) {
			_hashCode += getDevice().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DeviceBackedVirtualDiskSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DeviceBackedVirtualDiskSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("device");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"device"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
