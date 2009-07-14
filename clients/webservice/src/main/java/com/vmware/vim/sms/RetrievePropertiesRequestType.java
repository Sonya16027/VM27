/**
 * RetrievePropertiesRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class RetrievePropertiesRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.sms.ManagedObjectReference _this;

	private com.vmware.vim.sms.PropertyFilterSpec[] specSet;

	public RetrievePropertiesRequestType() {
	}

	public RetrievePropertiesRequestType(
			com.vmware.vim.sms.ManagedObjectReference _this,
			com.vmware.vim.sms.PropertyFilterSpec[] specSet) {
		this._this = _this;
		this.specSet = specSet;
	}

	/**
	 * Gets the _this value for this RetrievePropertiesRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.sms.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this RetrievePropertiesRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.sms.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the specSet value for this RetrievePropertiesRequestType.
	 * 
	 * @return specSet
	 */
	public com.vmware.vim.sms.PropertyFilterSpec[] getSpecSet() {
		return specSet;
	}

	/**
	 * Sets the specSet value for this RetrievePropertiesRequestType.
	 * 
	 * @param specSet
	 */
	public void setSpecSet(com.vmware.vim.sms.PropertyFilterSpec[] specSet) {
		this.specSet = specSet;
	}

	public com.vmware.vim.sms.PropertyFilterSpec getSpecSet(int i) {
		return this.specSet[i];
	}

	public void setSpecSet(int i, com.vmware.vim.sms.PropertyFilterSpec _value) {
		this.specSet[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof RetrievePropertiesRequestType)) {
			return false;
		}
		RetrievePropertiesRequestType other = (RetrievePropertiesRequestType) obj;
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
				&& ((this.specSet == null && other.getSpecSet() == null) || (this.specSet != null && java.util.Arrays
						.equals(this.specSet, other.getSpecSet())));
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
		if (getSpecSet() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getSpecSet()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSpecSet(), i);
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
			RetrievePropertiesRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"RetrievePropertiesRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("specSet");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:sm1", "specSet"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"PropertyFilterSpec"));
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
