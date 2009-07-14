/**
 * CreateVM_Task.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class CreateVM_Task implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private com.vmware.vim.VirtualMachineConfigSpec config;

	private com.vmware.vim.ManagedObjectReference pool;

	private com.vmware.vim.ManagedObjectReference host;

	public CreateVM_Task() {
	}

	public CreateVM_Task(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.VirtualMachineConfigSpec config,
			com.vmware.vim.ManagedObjectReference pool,
			com.vmware.vim.ManagedObjectReference host) {
		this._this = _this;
		this.config = config;
		this.pool = pool;
		this.host = host;
	}

	/**
	 * Gets the _this value for this CreateVM_Task.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this CreateVM_Task.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the config value for this CreateVM_Task.
	 * 
	 * @return config
	 */
	public com.vmware.vim.VirtualMachineConfigSpec getConfig() {
		return config;
	}

	/**
	 * Sets the config value for this CreateVM_Task.
	 * 
	 * @param config
	 */
	public void setConfig(com.vmware.vim.VirtualMachineConfigSpec config) {
		this.config = config;
	}

	/**
	 * Gets the pool value for this CreateVM_Task.
	 * 
	 * @return pool
	 */
	public com.vmware.vim.ManagedObjectReference getPool() {
		return pool;
	}

	/**
	 * Sets the pool value for this CreateVM_Task.
	 * 
	 * @param pool
	 */
	public void setPool(com.vmware.vim.ManagedObjectReference pool) {
		this.pool = pool;
	}

	/**
	 * Gets the host value for this CreateVM_Task.
	 * 
	 * @return host
	 */
	public com.vmware.vim.ManagedObjectReference getHost() {
		return host;
	}

	/**
	 * Sets the host value for this CreateVM_Task.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim.ManagedObjectReference host) {
		this.host = host;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CreateVM_Task)) {
			return false;
		}
		CreateVM_Task other = (CreateVM_Task) obj;
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
				&& ((this.config == null && other.getConfig() == null) || (this.config != null && this.config
						.equals(other.getConfig())))
				&& ((this.pool == null && other.getPool() == null) || (this.pool != null && this.pool
						.equals(other.getPool())))
				&& ((this.host == null && other.getHost() == null) || (this.host != null && this.host
						.equals(other.getHost())));
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
		if (getConfig() != null) {
			_hashCode += getConfig().hashCode();
		}
		if (getPool() != null) {
			_hashCode += getPool().hashCode();
		}
		if (getHost() != null) {
			_hashCode += getHost().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CreateVM_Task.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">CreateVM_Task"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("config");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "config"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineConfigSpec"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pool");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "pool"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "host"));
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
