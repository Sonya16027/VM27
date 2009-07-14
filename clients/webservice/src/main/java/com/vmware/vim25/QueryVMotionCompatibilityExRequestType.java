/**
 * QueryVMotionCompatibilityExRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class QueryVMotionCompatibilityExRequestType implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.ManagedObjectReference[] vm;

	private com.vmware.vim25.ManagedObjectReference[] host;

	public QueryVMotionCompatibilityExRequestType() {
	}

	public QueryVMotionCompatibilityExRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] vm,
			com.vmware.vim25.ManagedObjectReference[] host) {
		this._this = _this;
		this.vm = vm;
		this.host = host;
	}

	/**
	 * Gets the _this value for this QueryVMotionCompatibilityExRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this QueryVMotionCompatibilityExRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the vm value for this QueryVMotionCompatibilityExRequestType.
	 * 
	 * @return vm
	 */
	public com.vmware.vim25.ManagedObjectReference[] getVm() {
		return vm;
	}

	/**
	 * Sets the vm value for this QueryVMotionCompatibilityExRequestType.
	 * 
	 * @param vm
	 */
	public void setVm(com.vmware.vim25.ManagedObjectReference[] vm) {
		this.vm = vm;
	}

	public com.vmware.vim25.ManagedObjectReference getVm(int i) {
		return this.vm[i];
	}

	public void setVm(int i, com.vmware.vim25.ManagedObjectReference _value) {
		this.vm[i] = _value;
	}

	/**
	 * Gets the host value for this QueryVMotionCompatibilityExRequestType.
	 * 
	 * @return host
	 */
	public com.vmware.vim25.ManagedObjectReference[] getHost() {
		return host;
	}

	/**
	 * Sets the host value for this QueryVMotionCompatibilityExRequestType.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim25.ManagedObjectReference[] host) {
		this.host = host;
	}

	public com.vmware.vim25.ManagedObjectReference getHost(int i) {
		return this.host[i];
	}

	public void setHost(int i, com.vmware.vim25.ManagedObjectReference _value) {
		this.host[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof QueryVMotionCompatibilityExRequestType)) {
			return false;
		}
		QueryVMotionCompatibilityExRequestType other = (QueryVMotionCompatibilityExRequestType) obj;
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
				&& ((this.vm == null && other.getVm() == null) || (this.vm != null && java.util.Arrays
						.equals(this.vm, other.getVm())))
				&& ((this.host == null && other.getHost() == null) || (this.host != null && java.util.Arrays
						.equals(this.host, other.getHost())));
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
		if (getVm() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getVm()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getVm(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getHost() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getHost()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getHost(), i);
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
			QueryVMotionCompatibilityExRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"QueryVMotionCompatibilityExRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
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
