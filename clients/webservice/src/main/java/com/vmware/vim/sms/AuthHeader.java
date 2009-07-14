/**
 * AuthHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class AuthHeader extends com.vmware.vim.sms.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String vcSessionCookie;

	public AuthHeader() {
	}

	public AuthHeader(java.lang.String dynamicType,
			com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
			java.lang.String vcSessionCookie) {
		super(dynamicType, dynamicProperty);
		this.vcSessionCookie = vcSessionCookie;
	}

	/**
	 * Gets the vcSessionCookie value for this AuthHeader.
	 * 
	 * @return vcSessionCookie
	 */
	public java.lang.String getVcSessionCookie() {
		return vcSessionCookie;
	}

	/**
	 * Sets the vcSessionCookie value for this AuthHeader.
	 * 
	 * @param vcSessionCookie
	 */
	public void setVcSessionCookie(java.lang.String vcSessionCookie) {
		this.vcSessionCookie = vcSessionCookie;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AuthHeader)) {
			return false;
		}
		AuthHeader other = (AuthHeader) obj;
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
				&& ((this.vcSessionCookie == null && other.getVcSessionCookie() == null) || (this.vcSessionCookie != null && this.vcSessionCookie
						.equals(other.getVcSessionCookie())));
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
		if (getVcSessionCookie() != null) {
			_hashCode += getVcSessionCookie().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AuthHeader.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"AuthHeader"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vcSessionCookie");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"vcSessionCookie"));
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
