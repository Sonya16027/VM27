/**
 * ExecuteHostProfileRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ExecuteHostProfileRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.ManagedObjectReference host;

	private com.vmware.vim25.ProfileDeferredPolicyOptionParameter[] deferredParam;

	public ExecuteHostProfileRequestType() {
	}

	public ExecuteHostProfileRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host,
			com.vmware.vim25.ProfileDeferredPolicyOptionParameter[] deferredParam) {
		this._this = _this;
		this.host = host;
		this.deferredParam = deferredParam;
	}

	/**
	 * Gets the _this value for this ExecuteHostProfileRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this ExecuteHostProfileRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the host value for this ExecuteHostProfileRequestType.
	 * 
	 * @return host
	 */
	public com.vmware.vim25.ManagedObjectReference getHost() {
		return host;
	}

	/**
	 * Sets the host value for this ExecuteHostProfileRequestType.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim25.ManagedObjectReference host) {
		this.host = host;
	}

	/**
	 * Gets the deferredParam value for this ExecuteHostProfileRequestType.
	 * 
	 * @return deferredParam
	 */
	public com.vmware.vim25.ProfileDeferredPolicyOptionParameter[] getDeferredParam() {
		return deferredParam;
	}

	/**
	 * Sets the deferredParam value for this ExecuteHostProfileRequestType.
	 * 
	 * @param deferredParam
	 */
	public void setDeferredParam(
			com.vmware.vim25.ProfileDeferredPolicyOptionParameter[] deferredParam) {
		this.deferredParam = deferredParam;
	}

	public com.vmware.vim25.ProfileDeferredPolicyOptionParameter getDeferredParam(
			int i) {
		return this.deferredParam[i];
	}

	public void setDeferredParam(int i,
			com.vmware.vim25.ProfileDeferredPolicyOptionParameter _value) {
		this.deferredParam[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ExecuteHostProfileRequestType)) {
			return false;
		}
		ExecuteHostProfileRequestType other = (ExecuteHostProfileRequestType) obj;
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
				&& ((this.host == null && other.getHost() == null) || (this.host != null && this.host
						.equals(other.getHost())))
				&& ((this.deferredParam == null && other.getDeferredParam() == null) || (this.deferredParam != null && java.util.Arrays
						.equals(this.deferredParam, other.getDeferredParam())));
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
		if (getHost() != null) {
			_hashCode += getHost().hashCode();
		}
		if (getDeferredParam() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDeferredParam()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDeferredParam(), i);
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
			ExecuteHostProfileRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ExecuteHostProfileRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deferredParam");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"deferredParam"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfileDeferredPolicyOptionParameter"));
		elemField.setMinOccurs(0);
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
