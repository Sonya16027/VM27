/**
 * QueryPerfRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class QueryPerfRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.PerfQuerySpec[] querySpec;

	public QueryPerfRequestType() {
	}

	public QueryPerfRequestType(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.PerfQuerySpec[] querySpec) {
		this._this = _this;
		this.querySpec = querySpec;
	}

	/**
	 * Gets the _this value for this QueryPerfRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this QueryPerfRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the querySpec value for this QueryPerfRequestType.
	 * 
	 * @return querySpec
	 */
	public com.vmware.vim25.PerfQuerySpec[] getQuerySpec() {
		return querySpec;
	}

	/**
	 * Sets the querySpec value for this QueryPerfRequestType.
	 * 
	 * @param querySpec
	 */
	public void setQuerySpec(com.vmware.vim25.PerfQuerySpec[] querySpec) {
		this.querySpec = querySpec;
	}

	public com.vmware.vim25.PerfQuerySpec getQuerySpec(int i) {
		return this.querySpec[i];
	}

	public void setQuerySpec(int i, com.vmware.vim25.PerfQuerySpec _value) {
		this.querySpec[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof QueryPerfRequestType)) {
			return false;
		}
		QueryPerfRequestType other = (QueryPerfRequestType) obj;
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
				&& ((this.querySpec == null && other.getQuerySpec() == null) || (this.querySpec != null && java.util.Arrays
						.equals(this.querySpec, other.getQuerySpec())));
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
		if (getQuerySpec() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getQuerySpec()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getQuerySpec(), i);
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
			QueryPerfRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"QueryPerfRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("querySpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"querySpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PerfQuerySpec"));
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
