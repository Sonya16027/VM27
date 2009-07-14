/**
 * EnterMaintenanceModeRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class EnterMaintenanceModeRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private int timeout;

	private java.lang.Boolean evacuatePoweredOffVms;

	public EnterMaintenanceModeRequestType() {
	}

	public EnterMaintenanceModeRequestType(
			com.vmware.vim25.ManagedObjectReference _this, int timeout,
			java.lang.Boolean evacuatePoweredOffVms) {
		this._this = _this;
		this.timeout = timeout;
		this.evacuatePoweredOffVms = evacuatePoweredOffVms;
	}

	/**
	 * Gets the _this value for this EnterMaintenanceModeRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this EnterMaintenanceModeRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the timeout value for this EnterMaintenanceModeRequestType.
	 * 
	 * @return timeout
	 */
	public int getTimeout() {
		return timeout;
	}

	/**
	 * Sets the timeout value for this EnterMaintenanceModeRequestType.
	 * 
	 * @param timeout
	 */
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	/**
	 * Gets the evacuatePoweredOffVms value for this
	 * EnterMaintenanceModeRequestType.
	 * 
	 * @return evacuatePoweredOffVms
	 */
	public java.lang.Boolean getEvacuatePoweredOffVms() {
		return evacuatePoweredOffVms;
	}

	/**
	 * Sets the evacuatePoweredOffVms value for this
	 * EnterMaintenanceModeRequestType.
	 * 
	 * @param evacuatePoweredOffVms
	 */
	public void setEvacuatePoweredOffVms(java.lang.Boolean evacuatePoweredOffVms) {
		this.evacuatePoweredOffVms = evacuatePoweredOffVms;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof EnterMaintenanceModeRequestType)) {
			return false;
		}
		EnterMaintenanceModeRequestType other = (EnterMaintenanceModeRequestType) obj;
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
				&& this.timeout == other.getTimeout()
				&& ((this.evacuatePoweredOffVms == null && other
						.getEvacuatePoweredOffVms() == null) || (this.evacuatePoweredOffVms != null && this.evacuatePoweredOffVms
						.equals(other.getEvacuatePoweredOffVms())));
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
		_hashCode += getTimeout();
		if (getEvacuatePoweredOffVms() != null) {
			_hashCode += getEvacuatePoweredOffVms().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			EnterMaintenanceModeRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"EnterMaintenanceModeRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("timeout");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"timeout"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("evacuatePoweredOffVms");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"evacuatePoweredOffVms"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
