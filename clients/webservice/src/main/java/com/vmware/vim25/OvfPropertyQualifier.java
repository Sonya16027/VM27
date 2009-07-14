/**
 * OvfPropertyQualifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class OvfPropertyQualifier extends com.vmware.vim25.OvfProperty
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String qualifier;

	public OvfPropertyQualifier() {
	}

	public OvfPropertyQualifier(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage, int lineNumber,
			java.lang.String type, java.lang.String value,
			java.lang.String qualifier) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage,
				lineNumber, type, value);
		this.qualifier = qualifier;
	}

	/**
	 * Gets the qualifier value for this OvfPropertyQualifier.
	 * 
	 * @return qualifier
	 */
	public java.lang.String getQualifier() {
		return qualifier;
	}

	/**
	 * Sets the qualifier value for this OvfPropertyQualifier.
	 * 
	 * @param qualifier
	 */
	public void setQualifier(java.lang.String qualifier) {
		this.qualifier = qualifier;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof OvfPropertyQualifier)) {
			return false;
		}
		OvfPropertyQualifier other = (OvfPropertyQualifier) obj;
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
				&& ((this.qualifier == null && other.getQualifier() == null) || (this.qualifier != null && this.qualifier
						.equals(other.getQualifier())));
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
		if (getQualifier() != null) {
			_hashCode += getQualifier().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			OvfPropertyQualifier.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OvfPropertyQualifier"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("qualifier");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"qualifier"));
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
