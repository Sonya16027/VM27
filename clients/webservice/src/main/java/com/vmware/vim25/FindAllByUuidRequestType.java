/**
 * FindAllByUuidRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class FindAllByUuidRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.ManagedObjectReference datacenter;

	private java.lang.String uuid;

	private boolean vmSearch;

	private java.lang.Boolean instanceUuid;

	public FindAllByUuidRequestType() {
	}

	public FindAllByUuidRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference datacenter,
			java.lang.String uuid, boolean vmSearch,
			java.lang.Boolean instanceUuid) {
		this._this = _this;
		this.datacenter = datacenter;
		this.uuid = uuid;
		this.vmSearch = vmSearch;
		this.instanceUuid = instanceUuid;
	}

	/**
	 * Gets the _this value for this FindAllByUuidRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this FindAllByUuidRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the datacenter value for this FindAllByUuidRequestType.
	 * 
	 * @return datacenter
	 */
	public com.vmware.vim25.ManagedObjectReference getDatacenter() {
		return datacenter;
	}

	/**
	 * Sets the datacenter value for this FindAllByUuidRequestType.
	 * 
	 * @param datacenter
	 */
	public void setDatacenter(com.vmware.vim25.ManagedObjectReference datacenter) {
		this.datacenter = datacenter;
	}

	/**
	 * Gets the uuid value for this FindAllByUuidRequestType.
	 * 
	 * @return uuid
	 */
	public java.lang.String getUuid() {
		return uuid;
	}

	/**
	 * Sets the uuid value for this FindAllByUuidRequestType.
	 * 
	 * @param uuid
	 */
	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	/**
	 * Gets the vmSearch value for this FindAllByUuidRequestType.
	 * 
	 * @return vmSearch
	 */
	public boolean isVmSearch() {
		return vmSearch;
	}

	/**
	 * Sets the vmSearch value for this FindAllByUuidRequestType.
	 * 
	 * @param vmSearch
	 */
	public void setVmSearch(boolean vmSearch) {
		this.vmSearch = vmSearch;
	}

	/**
	 * Gets the instanceUuid value for this FindAllByUuidRequestType.
	 * 
	 * @return instanceUuid
	 */
	public java.lang.Boolean getInstanceUuid() {
		return instanceUuid;
	}

	/**
	 * Sets the instanceUuid value for this FindAllByUuidRequestType.
	 * 
	 * @param instanceUuid
	 */
	public void setInstanceUuid(java.lang.Boolean instanceUuid) {
		this.instanceUuid = instanceUuid;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof FindAllByUuidRequestType)) {
			return false;
		}
		FindAllByUuidRequestType other = (FindAllByUuidRequestType) obj;
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
				&& ((this.datacenter == null && other.getDatacenter() == null) || (this.datacenter != null && this.datacenter
						.equals(other.getDatacenter())))
				&& ((this.uuid == null && other.getUuid() == null) || (this.uuid != null && this.uuid
						.equals(other.getUuid())))
				&& this.vmSearch == other.isVmSearch()
				&& ((this.instanceUuid == null && other.getInstanceUuid() == null) || (this.instanceUuid != null && this.instanceUuid
						.equals(other.getInstanceUuid())));
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
		if (getDatacenter() != null) {
			_hashCode += getDatacenter().hashCode();
		}
		if (getUuid() != null) {
			_hashCode += getUuid().hashCode();
		}
		_hashCode += (isVmSearch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getInstanceUuid() != null) {
			_hashCode += getInstanceUuid().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			FindAllByUuidRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"FindAllByUuidRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
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
		elemField.setFieldName("uuid");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmSearch");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vmSearch"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("instanceUuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"instanceUuid"));
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
