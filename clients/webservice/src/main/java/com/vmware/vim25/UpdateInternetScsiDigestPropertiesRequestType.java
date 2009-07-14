/**
 * UpdateInternetScsiDigestPropertiesRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class UpdateInternetScsiDigestPropertiesRequestType implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String iScsiHbaDevice;

	private com.vmware.vim25.HostInternetScsiHbaTargetSet targetSet;

	private com.vmware.vim25.HostInternetScsiHbaDigestProperties digestProperties;

	public UpdateInternetScsiDigestPropertiesRequestType() {
	}

	public UpdateInternetScsiDigestPropertiesRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim25.HostInternetScsiHbaTargetSet targetSet,
			com.vmware.vim25.HostInternetScsiHbaDigestProperties digestProperties) {
		this._this = _this;
		this.iScsiHbaDevice = iScsiHbaDevice;
		this.targetSet = targetSet;
		this.digestProperties = digestProperties;
	}

	/**
	 * Gets the _this value for this
	 * UpdateInternetScsiDigestPropertiesRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this
	 * UpdateInternetScsiDigestPropertiesRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the iScsiHbaDevice value for this
	 * UpdateInternetScsiDigestPropertiesRequestType.
	 * 
	 * @return iScsiHbaDevice
	 */
	public java.lang.String getIScsiHbaDevice() {
		return iScsiHbaDevice;
	}

	/**
	 * Sets the iScsiHbaDevice value for this
	 * UpdateInternetScsiDigestPropertiesRequestType.
	 * 
	 * @param iScsiHbaDevice
	 */
	public void setIScsiHbaDevice(java.lang.String iScsiHbaDevice) {
		this.iScsiHbaDevice = iScsiHbaDevice;
	}

	/**
	 * Gets the targetSet value for this
	 * UpdateInternetScsiDigestPropertiesRequestType.
	 * 
	 * @return targetSet
	 */
	public com.vmware.vim25.HostInternetScsiHbaTargetSet getTargetSet() {
		return targetSet;
	}

	/**
	 * Sets the targetSet value for this
	 * UpdateInternetScsiDigestPropertiesRequestType.
	 * 
	 * @param targetSet
	 */
	public void setTargetSet(
			com.vmware.vim25.HostInternetScsiHbaTargetSet targetSet) {
		this.targetSet = targetSet;
	}

	/**
	 * Gets the digestProperties value for this
	 * UpdateInternetScsiDigestPropertiesRequestType.
	 * 
	 * @return digestProperties
	 */
	public com.vmware.vim25.HostInternetScsiHbaDigestProperties getDigestProperties() {
		return digestProperties;
	}

	/**
	 * Sets the digestProperties value for this
	 * UpdateInternetScsiDigestPropertiesRequestType.
	 * 
	 * @param digestProperties
	 */
	public void setDigestProperties(
			com.vmware.vim25.HostInternetScsiHbaDigestProperties digestProperties) {
		this.digestProperties = digestProperties;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof UpdateInternetScsiDigestPropertiesRequestType)) {
			return false;
		}
		UpdateInternetScsiDigestPropertiesRequestType other = (UpdateInternetScsiDigestPropertiesRequestType) obj;
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
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.iScsiHbaDevice == null && other.getIScsiHbaDevice() == null) || (this.iScsiHbaDevice != null && this.iScsiHbaDevice
						.equals(other.getIScsiHbaDevice())))
				&& ((this.targetSet == null && other.getTargetSet() == null) || (this.targetSet != null && this.targetSet
						.equals(other.getTargetSet())))
				&& ((this.digestProperties == null && other
						.getDigestProperties() == null) || (this.digestProperties != null && this.digestProperties
						.equals(other.getDigestProperties())));
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
		int _hashCode = 1;
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getIScsiHbaDevice() != null) {
			_hashCode += getIScsiHbaDevice().hashCode();
		}
		if (getTargetSet() != null) {
			_hashCode += getTargetSet().hashCode();
		}
		if (getDigestProperties() != null) {
			_hashCode += getDigestProperties().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			UpdateInternetScsiDigestPropertiesRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"UpdateInternetScsiDigestPropertiesRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("IScsiHbaDevice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"iScsiHbaDevice"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("targetSet");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"targetSet"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaTargetSet"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("digestProperties");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"digestProperties"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaDigestProperties"));
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
