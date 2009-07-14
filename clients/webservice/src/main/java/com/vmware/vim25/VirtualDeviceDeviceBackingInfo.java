/**
 * VirtualDeviceDeviceBackingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualDeviceDeviceBackingInfo extends
		com.vmware.vim25.VirtualDeviceBackingInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String deviceName;

	private java.lang.Boolean useAutoDetect;

	public VirtualDeviceDeviceBackingInfo() {
	}

	public VirtualDeviceDeviceBackingInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String deviceName, java.lang.Boolean useAutoDetect) {
		super(dynamicType, dynamicProperty);
		this.deviceName = deviceName;
		this.useAutoDetect = useAutoDetect;
	}

	/**
	 * Gets the deviceName value for this VirtualDeviceDeviceBackingInfo.
	 * 
	 * @return deviceName
	 */
	public java.lang.String getDeviceName() {
		return deviceName;
	}

	/**
	 * Sets the deviceName value for this VirtualDeviceDeviceBackingInfo.
	 * 
	 * @param deviceName
	 */
	public void setDeviceName(java.lang.String deviceName) {
		this.deviceName = deviceName;
	}

	/**
	 * Gets the useAutoDetect value for this VirtualDeviceDeviceBackingInfo.
	 * 
	 * @return useAutoDetect
	 */
	public java.lang.Boolean getUseAutoDetect() {
		return useAutoDetect;
	}

	/**
	 * Sets the useAutoDetect value for this VirtualDeviceDeviceBackingInfo.
	 * 
	 * @param useAutoDetect
	 */
	public void setUseAutoDetect(java.lang.Boolean useAutoDetect) {
		this.useAutoDetect = useAutoDetect;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualDeviceDeviceBackingInfo)) {
			return false;
		}
		VirtualDeviceDeviceBackingInfo other = (VirtualDeviceDeviceBackingInfo) obj;
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
				&& ((this.deviceName == null && other.getDeviceName() == null) || (this.deviceName != null && this.deviceName
						.equals(other.getDeviceName())))
				&& ((this.useAutoDetect == null && other.getUseAutoDetect() == null) || (this.useAutoDetect != null && this.useAutoDetect
						.equals(other.getUseAutoDetect())));
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
		if (getDeviceName() != null) {
			_hashCode += getDeviceName().hashCode();
		}
		if (getUseAutoDetect() != null) {
			_hashCode += getUseAutoDetect().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualDeviceDeviceBackingInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualDeviceDeviceBackingInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deviceName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"deviceName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("useAutoDetect");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"useAutoDetect"));
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
