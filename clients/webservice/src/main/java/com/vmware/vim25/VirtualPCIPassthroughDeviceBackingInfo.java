/**
 * VirtualPCIPassthroughDeviceBackingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualPCIPassthroughDeviceBackingInfo extends
		com.vmware.vim25.VirtualDeviceDeviceBackingInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String id;

	private java.lang.String deviceId;

	private java.lang.String systemId;

	private short vendorId;

	public VirtualPCIPassthroughDeviceBackingInfo() {
	}

	public VirtualPCIPassthroughDeviceBackingInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String deviceName, java.lang.Boolean useAutoDetect,
			java.lang.String id, java.lang.String deviceId,
			java.lang.String systemId, short vendorId) {
		super(dynamicType, dynamicProperty, deviceName, useAutoDetect);
		this.id = id;
		this.deviceId = deviceId;
		this.systemId = systemId;
		this.vendorId = vendorId;
	}

	/**
	 * Gets the id value for this VirtualPCIPassthroughDeviceBackingInfo.
	 * 
	 * @return id
	 */
	public java.lang.String getId() {
		return id;
	}

	/**
	 * Sets the id value for this VirtualPCIPassthroughDeviceBackingInfo.
	 * 
	 * @param id
	 */
	public void setId(java.lang.String id) {
		this.id = id;
	}

	/**
	 * Gets the deviceId value for this VirtualPCIPassthroughDeviceBackingInfo.
	 * 
	 * @return deviceId
	 */
	public java.lang.String getDeviceId() {
		return deviceId;
	}

	/**
	 * Sets the deviceId value for this VirtualPCIPassthroughDeviceBackingInfo.
	 * 
	 * @param deviceId
	 */
	public void setDeviceId(java.lang.String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * Gets the systemId value for this VirtualPCIPassthroughDeviceBackingInfo.
	 * 
	 * @return systemId
	 */
	public java.lang.String getSystemId() {
		return systemId;
	}

	/**
	 * Sets the systemId value for this VirtualPCIPassthroughDeviceBackingInfo.
	 * 
	 * @param systemId
	 */
	public void setSystemId(java.lang.String systemId) {
		this.systemId = systemId;
	}

	/**
	 * Gets the vendorId value for this VirtualPCIPassthroughDeviceBackingInfo.
	 * 
	 * @return vendorId
	 */
	public short getVendorId() {
		return vendorId;
	}

	/**
	 * Sets the vendorId value for this VirtualPCIPassthroughDeviceBackingInfo.
	 * 
	 * @param vendorId
	 */
	public void setVendorId(short vendorId) {
		this.vendorId = vendorId;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualPCIPassthroughDeviceBackingInfo)) {
			return false;
		}
		VirtualPCIPassthroughDeviceBackingInfo other = (VirtualPCIPassthroughDeviceBackingInfo) obj;
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
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id
						.equals(other.getId())))
				&& ((this.deviceId == null && other.getDeviceId() == null) || (this.deviceId != null && this.deviceId
						.equals(other.getDeviceId())))
				&& ((this.systemId == null && other.getSystemId() == null) || (this.systemId != null && this.systemId
						.equals(other.getSystemId())))
				&& this.vendorId == other.getVendorId();
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
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		if (getDeviceId() != null) {
			_hashCode += getDeviceId().hashCode();
		}
		if (getSystemId() != null) {
			_hashCode += getSystemId().hashCode();
		}
		_hashCode += getVendorId();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualPCIPassthroughDeviceBackingInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualPCIPassthroughDeviceBackingInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deviceId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"deviceId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("systemId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"systemId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vendorId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vendorId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
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
