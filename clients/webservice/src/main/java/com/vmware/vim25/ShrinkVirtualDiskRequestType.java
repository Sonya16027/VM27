/**
 * ShrinkVirtualDiskRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ShrinkVirtualDiskRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String name;

	private com.vmware.vim25.ManagedObjectReference datacenter;

	private java.lang.Boolean copy;

	public ShrinkVirtualDiskRequestType() {
	}

	public ShrinkVirtualDiskRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter,
			java.lang.Boolean copy) {
		this._this = _this;
		this.name = name;
		this.datacenter = datacenter;
		this.copy = copy;
	}

	/**
	 * Gets the _this value for this ShrinkVirtualDiskRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this ShrinkVirtualDiskRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the name value for this ShrinkVirtualDiskRequestType.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this ShrinkVirtualDiskRequestType.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the datacenter value for this ShrinkVirtualDiskRequestType.
	 * 
	 * @return datacenter
	 */
	public com.vmware.vim25.ManagedObjectReference getDatacenter() {
		return datacenter;
	}

	/**
	 * Sets the datacenter value for this ShrinkVirtualDiskRequestType.
	 * 
	 * @param datacenter
	 */
	public void setDatacenter(com.vmware.vim25.ManagedObjectReference datacenter) {
		this.datacenter = datacenter;
	}

	/**
	 * Gets the copy value for this ShrinkVirtualDiskRequestType.
	 * 
	 * @return copy
	 */
	public java.lang.Boolean getCopy() {
		return copy;
	}

	/**
	 * Sets the copy value for this ShrinkVirtualDiskRequestType.
	 * 
	 * @param copy
	 */
	public void setCopy(java.lang.Boolean copy) {
		this.copy = copy;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ShrinkVirtualDiskRequestType)) {
			return false;
		}
		ShrinkVirtualDiskRequestType other = (ShrinkVirtualDiskRequestType) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.datacenter == null && other.getDatacenter() == null) || (this.datacenter != null && this.datacenter
						.equals(other.getDatacenter())))
				&& ((this.copy == null && other.getCopy() == null) || (this.copy != null && this.copy
						.equals(other.getCopy())));
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getDatacenter() != null) {
			_hashCode += getDatacenter().hashCode();
		}
		if (getCopy() != null) {
			_hashCode += getCopy().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ShrinkVirtualDiskRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ShrinkVirtualDiskRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datacenter");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"datacenter"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("copy");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "copy"));
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
