/**
 * ExtendVirtualDiskRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ExtendVirtualDiskRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String name;

	private com.vmware.vim25.ManagedObjectReference datacenter;

	private long newCapacityKb;

	private java.lang.Boolean eagerZero;

	public ExtendVirtualDiskRequestType() {
	}

	public ExtendVirtualDiskRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String name,
			com.vmware.vim25.ManagedObjectReference datacenter,
			long newCapacityKb, java.lang.Boolean eagerZero) {
		this._this = _this;
		this.name = name;
		this.datacenter = datacenter;
		this.newCapacityKb = newCapacityKb;
		this.eagerZero = eagerZero;
	}

	/**
	 * Gets the _this value for this ExtendVirtualDiskRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this ExtendVirtualDiskRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the name value for this ExtendVirtualDiskRequestType.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this ExtendVirtualDiskRequestType.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the datacenter value for this ExtendVirtualDiskRequestType.
	 * 
	 * @return datacenter
	 */
	public com.vmware.vim25.ManagedObjectReference getDatacenter() {
		return datacenter;
	}

	/**
	 * Sets the datacenter value for this ExtendVirtualDiskRequestType.
	 * 
	 * @param datacenter
	 */
	public void setDatacenter(com.vmware.vim25.ManagedObjectReference datacenter) {
		this.datacenter = datacenter;
	}

	/**
	 * Gets the newCapacityKb value for this ExtendVirtualDiskRequestType.
	 * 
	 * @return newCapacityKb
	 */
	public long getNewCapacityKb() {
		return newCapacityKb;
	}

	/**
	 * Sets the newCapacityKb value for this ExtendVirtualDiskRequestType.
	 * 
	 * @param newCapacityKb
	 */
	public void setNewCapacityKb(long newCapacityKb) {
		this.newCapacityKb = newCapacityKb;
	}

	/**
	 * Gets the eagerZero value for this ExtendVirtualDiskRequestType.
	 * 
	 * @return eagerZero
	 */
	public java.lang.Boolean getEagerZero() {
		return eagerZero;
	}

	/**
	 * Sets the eagerZero value for this ExtendVirtualDiskRequestType.
	 * 
	 * @param eagerZero
	 */
	public void setEagerZero(java.lang.Boolean eagerZero) {
		this.eagerZero = eagerZero;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ExtendVirtualDiskRequestType)) {
			return false;
		}
		ExtendVirtualDiskRequestType other = (ExtendVirtualDiskRequestType) obj;
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
				&& this.newCapacityKb == other.getNewCapacityKb()
				&& ((this.eagerZero == null && other.getEagerZero() == null) || (this.eagerZero != null && this.eagerZero
						.equals(other.getEagerZero())));
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
		_hashCode += new Long(getNewCapacityKb()).hashCode();
		if (getEagerZero() != null) {
			_hashCode += getEagerZero().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ExtendVirtualDiskRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ExtendVirtualDiskRequestType"));
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
		elemField.setFieldName("newCapacityKb");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"newCapacityKb"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("eagerZero");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"eagerZero"));
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
