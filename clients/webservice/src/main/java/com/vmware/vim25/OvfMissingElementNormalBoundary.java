/**
 * OvfMissingElementNormalBoundary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class OvfMissingElementNormalBoundary extends
		com.vmware.vim25.OvfMissingElement implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String boundary;

	public OvfMissingElementNormalBoundary() {
	}

	public OvfMissingElementNormalBoundary(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage, int lineNumber,
			java.lang.String name, java.lang.String boundary) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage,
				lineNumber, name);
		this.boundary = boundary;
	}

	/**
	 * Gets the boundary value for this OvfMissingElementNormalBoundary.
	 * 
	 * @return boundary
	 */
	public java.lang.String getBoundary() {
		return boundary;
	}

	/**
	 * Sets the boundary value for this OvfMissingElementNormalBoundary.
	 * 
	 * @param boundary
	 */
	public void setBoundary(java.lang.String boundary) {
		this.boundary = boundary;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof OvfMissingElementNormalBoundary)) {
			return false;
		}
		OvfMissingElementNormalBoundary other = (OvfMissingElementNormalBoundary) obj;
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
				&& ((this.boundary == null && other.getBoundary() == null) || (this.boundary != null && this.boundary
						.equals(other.getBoundary())));
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
		if (getBoundary() != null) {
			_hashCode += getBoundary().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			OvfMissingElementNormalBoundary.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OvfMissingElementNormalBoundary"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("boundary");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"boundary"));
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
