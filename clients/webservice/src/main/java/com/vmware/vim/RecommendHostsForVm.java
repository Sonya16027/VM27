/**
 * RecommendHostsForVm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class RecommendHostsForVm implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private com.vmware.vim.ManagedObjectReference vm;

	private com.vmware.vim.ManagedObjectReference pool;

	public RecommendHostsForVm() {
	}

	public RecommendHostsForVm(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference vm,
			com.vmware.vim.ManagedObjectReference pool) {
		this._this = _this;
		this.vm = vm;
		this.pool = pool;
	}

	/**
	 * Gets the _this value for this RecommendHostsForVm.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this RecommendHostsForVm.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the vm value for this RecommendHostsForVm.
	 * 
	 * @return vm
	 */
	public com.vmware.vim.ManagedObjectReference getVm() {
		return vm;
	}

	/**
	 * Sets the vm value for this RecommendHostsForVm.
	 * 
	 * @param vm
	 */
	public void setVm(com.vmware.vim.ManagedObjectReference vm) {
		this.vm = vm;
	}

	/**
	 * Gets the pool value for this RecommendHostsForVm.
	 * 
	 * @return pool
	 */
	public com.vmware.vim.ManagedObjectReference getPool() {
		return pool;
	}

	/**
	 * Sets the pool value for this RecommendHostsForVm.
	 * 
	 * @param pool
	 */
	public void setPool(com.vmware.vim.ManagedObjectReference pool) {
		this.pool = pool;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof RecommendHostsForVm)) {
			return false;
		}
		RecommendHostsForVm other = (RecommendHostsForVm) obj;
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
				&& ((this.vm == null && other.getVm() == null) || (this.vm != null && this.vm
						.equals(other.getVm())))
				&& ((this.pool == null && other.getPool() == null) || (this.pool != null && this.pool
						.equals(other.getPool())));
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
			_hashCode += getVm().hashCode();
		}
		if (getPool() != null) {
			_hashCode += getPool().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			RecommendHostsForVm.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">RecommendHostsForVm"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "vm"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pool");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "pool"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
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
