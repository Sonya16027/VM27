/**
 * OvfUnsupportedPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class OvfUnsupportedPackage extends com.vmware.vim25.OvfFault implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.Integer lineNumber;

	public OvfUnsupportedPackage() {
	}

	public OvfUnsupportedPackage(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			java.lang.Integer lineNumber) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.lineNumber = lineNumber;
	}

	/**
	 * Gets the lineNumber value for this OvfUnsupportedPackage.
	 * 
	 * @return lineNumber
	 */
	public java.lang.Integer getLineNumber() {
		return lineNumber;
	}

	/**
	 * Sets the lineNumber value for this OvfUnsupportedPackage.
	 * 
	 * @param lineNumber
	 */
	public void setLineNumber(java.lang.Integer lineNumber) {
		this.lineNumber = lineNumber;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof OvfUnsupportedPackage)) {
			return false;
		}
		OvfUnsupportedPackage other = (OvfUnsupportedPackage) obj;
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
				&& ((this.lineNumber == null && other.getLineNumber() == null) || (this.lineNumber != null && this.lineNumber
						.equals(other.getLineNumber())));
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
		if (getLineNumber() != null) {
			_hashCode += getLineNumber().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			OvfUnsupportedPackage.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OvfUnsupportedPackage"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lineNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"lineNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
