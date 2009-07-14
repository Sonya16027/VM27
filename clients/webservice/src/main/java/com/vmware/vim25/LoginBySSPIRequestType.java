/**
 * LoginBySSPIRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class LoginBySSPIRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String base64Token;

	private java.lang.String locale;

	public LoginBySSPIRequestType() {
	}

	public LoginBySSPIRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String base64Token, java.lang.String locale) {
		this._this = _this;
		this.base64Token = base64Token;
		this.locale = locale;
	}

	/**
	 * Gets the _this value for this LoginBySSPIRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this LoginBySSPIRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the base64Token value for this LoginBySSPIRequestType.
	 * 
	 * @return base64Token
	 */
	public java.lang.String getBase64Token() {
		return base64Token;
	}

	/**
	 * Sets the base64Token value for this LoginBySSPIRequestType.
	 * 
	 * @param base64Token
	 */
	public void setBase64Token(java.lang.String base64Token) {
		this.base64Token = base64Token;
	}

	/**
	 * Gets the locale value for this LoginBySSPIRequestType.
	 * 
	 * @return locale
	 */
	public java.lang.String getLocale() {
		return locale;
	}

	/**
	 * Sets the locale value for this LoginBySSPIRequestType.
	 * 
	 * @param locale
	 */
	public void setLocale(java.lang.String locale) {
		this.locale = locale;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof LoginBySSPIRequestType)) {
			return false;
		}
		LoginBySSPIRequestType other = (LoginBySSPIRequestType) obj;
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
				&& ((this.base64Token == null && other.getBase64Token() == null) || (this.base64Token != null && this.base64Token
						.equals(other.getBase64Token())))
				&& ((this.locale == null && other.getLocale() == null) || (this.locale != null && this.locale
						.equals(other.getLocale())));
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
		if (getBase64Token() != null) {
			_hashCode += getBase64Token().hashCode();
		}
		if (getLocale() != null) {
			_hashCode += getLocale().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			LoginBySSPIRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LoginBySSPIRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("base64Token");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"base64Token"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("locale");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"locale"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
