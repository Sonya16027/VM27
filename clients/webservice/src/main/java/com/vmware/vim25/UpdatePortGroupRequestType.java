/**
 * UpdatePortGroupRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class UpdatePortGroupRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String pgName;

	private com.vmware.vim25.HostPortGroupSpec portgrp;

	public UpdatePortGroupRequestType() {
	}

	public UpdatePortGroupRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String pgName, com.vmware.vim25.HostPortGroupSpec portgrp) {
		this._this = _this;
		this.pgName = pgName;
		this.portgrp = portgrp;
	}

	/**
	 * Gets the _this value for this UpdatePortGroupRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this UpdatePortGroupRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the pgName value for this UpdatePortGroupRequestType.
	 * 
	 * @return pgName
	 */
	public java.lang.String getPgName() {
		return pgName;
	}

	/**
	 * Sets the pgName value for this UpdatePortGroupRequestType.
	 * 
	 * @param pgName
	 */
	public void setPgName(java.lang.String pgName) {
		this.pgName = pgName;
	}

	/**
	 * Gets the portgrp value for this UpdatePortGroupRequestType.
	 * 
	 * @return portgrp
	 */
	public com.vmware.vim25.HostPortGroupSpec getPortgrp() {
		return portgrp;
	}

	/**
	 * Sets the portgrp value for this UpdatePortGroupRequestType.
	 * 
	 * @param portgrp
	 */
	public void setPortgrp(com.vmware.vim25.HostPortGroupSpec portgrp) {
		this.portgrp = portgrp;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof UpdatePortGroupRequestType)) {
			return false;
		}
		UpdatePortGroupRequestType other = (UpdatePortGroupRequestType) obj;
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
				&& ((this.pgName == null && other.getPgName() == null) || (this.pgName != null && this.pgName
						.equals(other.getPgName())))
				&& ((this.portgrp == null && other.getPortgrp() == null) || (this.portgrp != null && this.portgrp
						.equals(other.getPortgrp())));
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
		if (getPgName() != null) {
			_hashCode += getPgName().hashCode();
		}
		if (getPortgrp() != null) {
			_hashCode += getPortgrp().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			UpdatePortGroupRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"UpdatePortGroupRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pgName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"pgName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portgrp");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"portgrp"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPortGroupSpec"));
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
