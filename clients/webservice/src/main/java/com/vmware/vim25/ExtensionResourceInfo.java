/**
 * ExtensionResourceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ExtensionResourceInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String locale;

	private java.lang.String module;

	private com.vmware.vim25.KeyValue[] data;

	public ExtensionResourceInfo() {
	}

	public ExtensionResourceInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String locale, java.lang.String module,
			com.vmware.vim25.KeyValue[] data) {
		super(dynamicType, dynamicProperty);
		this.locale = locale;
		this.module = module;
		this.data = data;
	}

	/**
	 * Gets the locale value for this ExtensionResourceInfo.
	 * 
	 * @return locale
	 */
	public java.lang.String getLocale() {
		return locale;
	}

	/**
	 * Sets the locale value for this ExtensionResourceInfo.
	 * 
	 * @param locale
	 */
	public void setLocale(java.lang.String locale) {
		this.locale = locale;
	}

	/**
	 * Gets the module value for this ExtensionResourceInfo.
	 * 
	 * @return module
	 */
	public java.lang.String getModule() {
		return module;
	}

	/**
	 * Sets the module value for this ExtensionResourceInfo.
	 * 
	 * @param module
	 */
	public void setModule(java.lang.String module) {
		this.module = module;
	}

	/**
	 * Gets the data value for this ExtensionResourceInfo.
	 * 
	 * @return data
	 */
	public com.vmware.vim25.KeyValue[] getData() {
		return data;
	}

	/**
	 * Sets the data value for this ExtensionResourceInfo.
	 * 
	 * @param data
	 */
	public void setData(com.vmware.vim25.KeyValue[] data) {
		this.data = data;
	}

	public com.vmware.vim25.KeyValue getData(int i) {
		return this.data[i];
	}

	public void setData(int i, com.vmware.vim25.KeyValue _value) {
		this.data[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ExtensionResourceInfo)) {
			return false;
		}
		ExtensionResourceInfo other = (ExtensionResourceInfo) obj;
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
				&& ((this.locale == null && other.getLocale() == null) || (this.locale != null && this.locale
						.equals(other.getLocale())))
				&& ((this.module == null && other.getModule() == null) || (this.module != null && this.module
						.equals(other.getModule())))
				&& ((this.data == null && other.getData() == null) || (this.data != null && java.util.Arrays
						.equals(this.data, other.getData())));
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
		if (getLocale() != null) {
			_hashCode += getLocale().hashCode();
		}
		if (getModule() != null) {
			_hashCode += getModule().hashCode();
		}
		if (getData() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getData()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getData(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ExtensionResourceInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ExtensionResourceInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("locale");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"locale"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("module");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"module"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("data");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "data"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KeyValue"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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
