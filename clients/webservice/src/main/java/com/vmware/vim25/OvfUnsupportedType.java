/**
 * OvfUnsupportedType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class OvfUnsupportedType extends com.vmware.vim25.OvfUnsupportedPackage
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String name;

	private java.lang.String instanceId;

	private int deviceType;

	public OvfUnsupportedType() {
	}

	public OvfUnsupportedType(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			java.lang.Integer lineNumber, java.lang.String name,
			java.lang.String instanceId, int deviceType) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage,
				lineNumber);
		this.name = name;
		this.instanceId = instanceId;
		this.deviceType = deviceType;
	}

	/**
	 * Gets the name value for this OvfUnsupportedType.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this OvfUnsupportedType.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the instanceId value for this OvfUnsupportedType.
	 * 
	 * @return instanceId
	 */
	public java.lang.String getInstanceId() {
		return instanceId;
	}

	/**
	 * Sets the instanceId value for this OvfUnsupportedType.
	 * 
	 * @param instanceId
	 */
	public void setInstanceId(java.lang.String instanceId) {
		this.instanceId = instanceId;
	}

	/**
	 * Gets the deviceType value for this OvfUnsupportedType.
	 * 
	 * @return deviceType
	 */
	public int getDeviceType() {
		return deviceType;
	}

	/**
	 * Sets the deviceType value for this OvfUnsupportedType.
	 * 
	 * @param deviceType
	 */
	public void setDeviceType(int deviceType) {
		this.deviceType = deviceType;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof OvfUnsupportedType)) {
			return false;
		}
		OvfUnsupportedType other = (OvfUnsupportedType) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.instanceId == null && other.getInstanceId() == null) || (this.instanceId != null && this.instanceId
						.equals(other.getInstanceId())))
				&& this.deviceType == other.getDeviceType();
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getInstanceId() != null) {
			_hashCode += getInstanceId().hashCode();
		}
		_hashCode += getDeviceType();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			OvfUnsupportedType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OvfUnsupportedType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
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
