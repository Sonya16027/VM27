/**
 * OvfUnsupportedSubType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class OvfUnsupportedSubType extends
		com.vmware.vim25.OvfUnsupportedPackage implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String elementName;

	private java.lang.String instanceId;

	private int deviceType;

	private java.lang.String deviceSubType;

	public OvfUnsupportedSubType() {
	}

	public OvfUnsupportedSubType(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			java.lang.Integer lineNumber, java.lang.String elementName,
			java.lang.String instanceId, int deviceType,
			java.lang.String deviceSubType) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage,
				lineNumber);
		this.elementName = elementName;
		this.instanceId = instanceId;
		this.deviceType = deviceType;
		this.deviceSubType = deviceSubType;
	}

	/**
	 * Gets the elementName value for this OvfUnsupportedSubType.
	 * 
	 * @return elementName
	 */
	public java.lang.String getElementName() {
		return elementName;
	}

	/**
	 * Sets the elementName value for this OvfUnsupportedSubType.
	 * 
	 * @param elementName
	 */
	public void setElementName(java.lang.String elementName) {
		this.elementName = elementName;
	}

	/**
	 * Gets the instanceId value for this OvfUnsupportedSubType.
	 * 
	 * @return instanceId
	 */
	public java.lang.String getInstanceId() {
		return instanceId;
	}

	/**
	 * Sets the instanceId value for this OvfUnsupportedSubType.
	 * 
	 * @param instanceId
	 */
	public void setInstanceId(java.lang.String instanceId) {
		this.instanceId = instanceId;
	}

	/**
	 * Gets the deviceType value for this OvfUnsupportedSubType.
	 * 
	 * @return deviceType
	 */
	public int getDeviceType() {
		return deviceType;
	}

	/**
	 * Sets the deviceType value for this OvfUnsupportedSubType.
	 * 
	 * @param deviceType
	 */
	public void setDeviceType(int deviceType) {
		this.deviceType = deviceType;
	}

	/**
	 * Gets the deviceSubType value for this OvfUnsupportedSubType.
	 * 
	 * @return deviceSubType
	 */
	public java.lang.String getDeviceSubType() {
		return deviceSubType;
	}

	/**
	 * Sets the deviceSubType value for this OvfUnsupportedSubType.
	 * 
	 * @param deviceSubType
	 */
	public void setDeviceSubType(java.lang.String deviceSubType) {
		this.deviceSubType = deviceSubType;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof OvfUnsupportedSubType)) {
			return false;
		}
		OvfUnsupportedSubType other = (OvfUnsupportedSubType) obj;
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
				&& ((this.elementName == null && other.getElementName() == null) || (this.elementName != null && this.elementName
						.equals(other.getElementName())))
				&& ((this.instanceId == null && other.getInstanceId() == null) || (this.instanceId != null && this.instanceId
						.equals(other.getInstanceId())))
				&& this.deviceType == other.getDeviceType()
				&& ((this.deviceSubType == null && other.getDeviceSubType() == null) || (this.deviceSubType != null && this.deviceSubType
						.equals(other.getDeviceSubType())));
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
		if (getElementName() != null) {
			_hashCode += getElementName().hashCode();
		}
		if (getInstanceId() != null) {
			_hashCode += getInstanceId().hashCode();
		}
		_hashCode += getDeviceType();
		if (getDeviceSubType() != null) {
			_hashCode += getDeviceSubType().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			OvfUnsupportedSubType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OvfUnsupportedSubType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("elementName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"elementName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("instanceId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"instanceId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deviceType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"deviceType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deviceSubType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"deviceSubType"));
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
