/**
 * AddStandaloneHost_Task.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class AddStandaloneHost_Task implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private com.vmware.vim.HostConnectSpec spec;

	private boolean addConnected;

	public AddStandaloneHost_Task() {
	}

	public AddStandaloneHost_Task(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostConnectSpec spec, boolean addConnected) {
		this._this = _this;
		this.spec = spec;
		this.addConnected = addConnected;
	}

	/**
	 * Gets the _this value for this AddStandaloneHost_Task.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this AddStandaloneHost_Task.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the spec value for this AddStandaloneHost_Task.
	 * 
	 * @return spec
	 */
	public com.vmware.vim.HostConnectSpec getSpec() {
		return spec;
	}

	/**
	 * Sets the spec value for this AddStandaloneHost_Task.
	 * 
	 * @param spec
	 */
	public void setSpec(com.vmware.vim.HostConnectSpec spec) {
		this.spec = spec;
	}

	/**
	 * Gets the addConnected value for this AddStandaloneHost_Task.
	 * 
	 * @return addConnected
	 */
	public boolean isAddConnected() {
		return addConnected;
	}

	/**
	 * Sets the addConnected value for this AddStandaloneHost_Task.
	 * 
	 * @param addConnected
	 */
	public void setAddConnected(boolean addConnected) {
		this.addConnected = addConnected;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AddStandaloneHost_Task)) {
			return false;
		}
		AddStandaloneHost_Task other = (AddStandaloneHost_Task) obj;
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
				&& ((this.spec == null && other.getSpec() == null) || (this.spec != null && this.spec
						.equals(other.getSpec())))
				&& this.addConnected == other.isAddConnected();
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
		if (getSpec() != null) {
			_hashCode += getSpec().hashCode();
		}
		_hashCode += (isAddConnected() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AddStandaloneHost_Task.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">AddStandaloneHost_Task"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("spec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "spec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostConnectSpec"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("addConnected");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"addConnected"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
