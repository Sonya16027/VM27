/**
 * LoginExtensionBySubjectNameRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class LoginExtensionBySubjectNameRequestType implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String extensionKey;

	private java.lang.String locale;

	public LoginExtensionBySubjectNameRequestType() {
	}

	public LoginExtensionBySubjectNameRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String extensionKey, java.lang.String locale) {
		this._this = _this;
		this.extensionKey = extensionKey;
		this.locale = locale;
	}

	/**
	 * Gets the _this value for this LoginExtensionBySubjectNameRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this LoginExtensionBySubjectNameRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the extensionKey value for this
	 * LoginExtensionBySubjectNameRequestType.
	 * 
	 * @return extensionKey
	 */
	public java.lang.String getExtensionKey() {
		return extensionKey;
	}

	/**
	 * Sets the extensionKey value for this
	 * LoginExtensionBySubjectNameRequestType.
	 * 
	 * @param extensionKey
	 */
	public void setExtensionKey(java.lang.String extensionKey) {
		this.extensionKey = extensionKey;
	}

	/**
	 * Gets the locale value for this LoginExtensionBySubjectNameRequestType.
	 * 
	 * @return locale
	 */
	public java.lang.String getLocale() {
		return locale;
	}

	/**
	 * Sets the locale value for this LoginExtensionBySubjectNameRequestType.
	 * 
	 * @param locale
	 */
	public void setLocale(java.lang.String locale) {
		this.locale = locale;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof LoginExtensionBySubjectNameRequestType)) {
			return false;
		}
		LoginExtensionBySubjectNameRequestType other = (LoginExtensionBySubjectNameRequestType) obj;
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
				&& ((this.extensionKey == null && other.getExtensionKey() == null) || (this.extensionKey != null && this.extensionKey
						.equals(other.getExtensionKey())))
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
		if (getExtensionKey() != null) {
			_hashCode += getExtensionKey().hashCode();
		}
		if (getLocale() != null) {
			_hashCode += getLocale().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			LoginExtensionBySubjectNameRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LoginExtensionBySubjectNameRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("extensionKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"extensionKey"));
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
