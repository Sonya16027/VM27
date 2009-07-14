/**
 * QueryListRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class QueryListRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.sms.ManagedObjectReference _this;

	private com.vmware.vim.sms.EntityReference contextEntity;

	private com.vmware.vim.sms.EntityReferenceEntityType queryEntityType;

	private com.vmware.vim.sms.QuerySpec querySpec;

	public QueryListRequestType() {
	}

	public QueryListRequestType(
			com.vmware.vim.sms.ManagedObjectReference _this,
			com.vmware.vim.sms.EntityReference contextEntity,
			com.vmware.vim.sms.EntityReferenceEntityType queryEntityType,
			com.vmware.vim.sms.QuerySpec querySpec) {
		this._this = _this;
		this.contextEntity = contextEntity;
		this.queryEntityType = queryEntityType;
		this.querySpec = querySpec;
	}

	/**
	 * Gets the _this value for this QueryListRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.sms.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this QueryListRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.sms.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the contextEntity value for this QueryListRequestType.
	 * 
	 * @return contextEntity
	 */
	public com.vmware.vim.sms.EntityReference getContextEntity() {
		return contextEntity;
	}

	/**
	 * Sets the contextEntity value for this QueryListRequestType.
	 * 
	 * @param contextEntity
	 */
	public void setContextEntity(
			com.vmware.vim.sms.EntityReference contextEntity) {
		this.contextEntity = contextEntity;
	}

	/**
	 * Gets the queryEntityType value for this QueryListRequestType.
	 * 
	 * @return queryEntityType
	 */
	public com.vmware.vim.sms.EntityReferenceEntityType getQueryEntityType() {
		return queryEntityType;
	}

	/**
	 * Sets the queryEntityType value for this QueryListRequestType.
	 * 
	 * @param queryEntityType
	 */
	public void setQueryEntityType(
			com.vmware.vim.sms.EntityReferenceEntityType queryEntityType) {
		this.queryEntityType = queryEntityType;
	}

	/**
	 * Gets the querySpec value for this QueryListRequestType.
	 * 
	 * @return querySpec
	 */
	public com.vmware.vim.sms.QuerySpec getQuerySpec() {
		return querySpec;
	}

	/**
	 * Sets the querySpec value for this QueryListRequestType.
	 * 
	 * @param querySpec
	 */
	public void setQuerySpec(com.vmware.vim.sms.QuerySpec querySpec) {
		this.querySpec = querySpec;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof QueryListRequestType)) {
			return false;
		}
		QueryListRequestType other = (QueryListRequestType) obj;
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
				&& ((this.contextEntity == null && other.getContextEntity() == null) || (this.contextEntity != null && this.contextEntity
						.equals(other.getContextEntity())))
				&& ((this.queryEntityType == null && other.getQueryEntityType() == null) || (this.queryEntityType != null && this.queryEntityType
						.equals(other.getQueryEntityType())))
				&& ((this.querySpec == null && other.getQuerySpec() == null) || (this.querySpec != null && this.querySpec
						.equals(other.getQuerySpec())));
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
		if (getContextEntity() != null) {
			_hashCode += getContextEntity().hashCode();
		}
		if (getQueryEntityType() != null) {
			_hashCode += getQueryEntityType().hashCode();
		}
		if (getQuerySpec() != null) {
			_hashCode += getQuerySpec().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			QueryListRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"QueryListRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("contextEntity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"contextEntity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"EntityReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("queryEntityType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"queryEntityType"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"EntityReferenceEntityType"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("querySpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"querySpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"QuerySpec"));
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
