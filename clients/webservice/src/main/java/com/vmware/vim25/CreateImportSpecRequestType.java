/**
 * CreateImportSpecRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CreateImportSpecRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String ovfDescriptor;

	private com.vmware.vim25.ManagedObjectReference resourcePool;

	private com.vmware.vim25.ManagedObjectReference datastore;

	private com.vmware.vim25.OvfCreateImportSpecParams cisp;

	public CreateImportSpecRequestType() {
	}

	public CreateImportSpecRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String ovfDescriptor,
			com.vmware.vim25.ManagedObjectReference resourcePool,
			com.vmware.vim25.ManagedObjectReference datastore,
			com.vmware.vim25.OvfCreateImportSpecParams cisp) {
		this._this = _this;
		this.ovfDescriptor = ovfDescriptor;
		this.resourcePool = resourcePool;
		this.datastore = datastore;
		this.cisp = cisp;
	}

	/**
	 * Gets the _this value for this CreateImportSpecRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this CreateImportSpecRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the ovfDescriptor value for this CreateImportSpecRequestType.
	 * 
	 * @return ovfDescriptor
	 */
	public java.lang.String getOvfDescriptor() {
		return ovfDescriptor;
	}

	/**
	 * Sets the ovfDescriptor value for this CreateImportSpecRequestType.
	 * 
	 * @param ovfDescriptor
	 */
	public void setOvfDescriptor(java.lang.String ovfDescriptor) {
		this.ovfDescriptor = ovfDescriptor;
	}

	/**
	 * Gets the resourcePool value for this CreateImportSpecRequestType.
	 * 
	 * @return resourcePool
	 */
	public com.vmware.vim25.ManagedObjectReference getResourcePool() {
		return resourcePool;
	}

	/**
	 * Sets the resourcePool value for this CreateImportSpecRequestType.
	 * 
	 * @param resourcePool
	 */
	public void setResourcePool(
			com.vmware.vim25.ManagedObjectReference resourcePool) {
		this.resourcePool = resourcePool;
	}

	/**
	 * Gets the datastore value for this CreateImportSpecRequestType.
	 * 
	 * @return datastore
	 */
	public com.vmware.vim25.ManagedObjectReference getDatastore() {
		return datastore;
	}

	/**
	 * Sets the datastore value for this CreateImportSpecRequestType.
	 * 
	 * @param datastore
	 */
	public void setDatastore(com.vmware.vim25.ManagedObjectReference datastore) {
		this.datastore = datastore;
	}

	/**
	 * Gets the cisp value for this CreateImportSpecRequestType.
	 * 
	 * @return cisp
	 */
	public com.vmware.vim25.OvfCreateImportSpecParams getCisp() {
		return cisp;
	}

	/**
	 * Sets the cisp value for this CreateImportSpecRequestType.
	 * 
	 * @param cisp
	 */
	public void setCisp(com.vmware.vim25.OvfCreateImportSpecParams cisp) {
		this.cisp = cisp;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CreateImportSpecRequestType)) {
			return false;
		}
		CreateImportSpecRequestType other = (CreateImportSpecRequestType) obj;
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
				&& ((this.ovfDescriptor == null && other.getOvfDescriptor() == null) || (this.ovfDescriptor != null && this.ovfDescriptor
						.equals(other.getOvfDescriptor())))
				&& ((this.resourcePool == null && other.getResourcePool() == null) || (this.resourcePool != null && this.resourcePool
						.equals(other.getResourcePool())))
				&& ((this.datastore == null && other.getDatastore() == null) || (this.datastore != null && this.datastore
						.equals(other.getDatastore())))
				&& ((this.cisp == null && other.getCisp() == null) || (this.cisp != null && this.cisp
						.equals(other.getCisp())));
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
		if (getOvfDescriptor() != null) {
			_hashCode += getOvfDescriptor().hashCode();
		}
		if (getResourcePool() != null) {
			_hashCode += getResourcePool().hashCode();
		}
		if (getDatastore() != null) {
			_hashCode += getDatastore().hashCode();
		}
		if (getCisp() != null) {
			_hashCode += getCisp().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CreateImportSpecRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CreateImportSpecRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ovfDescriptor");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ovfDescriptor"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("resourcePool");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"resourcePool"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datastore");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"datastore"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cisp");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cisp"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OvfCreateImportSpecParams"));
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
