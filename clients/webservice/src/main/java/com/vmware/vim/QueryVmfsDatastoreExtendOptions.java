/**
 * QueryVmfsDatastoreExtendOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class QueryVmfsDatastoreExtendOptions implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private com.vmware.vim.ManagedObjectReference datastore;

	private java.lang.String devicePath;

	public QueryVmfsDatastoreExtendOptions() {
	}

	public QueryVmfsDatastoreExtendOptions(
			com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.ManagedObjectReference datastore,
			java.lang.String devicePath) {
		this._this = _this;
		this.datastore = datastore;
		this.devicePath = devicePath;
	}

	/**
	 * Gets the _this value for this QueryVmfsDatastoreExtendOptions.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this QueryVmfsDatastoreExtendOptions.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the datastore value for this QueryVmfsDatastoreExtendOptions.
	 * 
	 * @return datastore
	 */
	public com.vmware.vim.ManagedObjectReference getDatastore() {
		return datastore;
	}

	/**
	 * Sets the datastore value for this QueryVmfsDatastoreExtendOptions.
	 * 
	 * @param datastore
	 */
	public void setDatastore(com.vmware.vim.ManagedObjectReference datastore) {
		this.datastore = datastore;
	}

	/**
	 * Gets the devicePath value for this QueryVmfsDatastoreExtendOptions.
	 * 
	 * @return devicePath
	 */
	public java.lang.String getDevicePath() {
		return devicePath;
	}

	/**
	 * Sets the devicePath value for this QueryVmfsDatastoreExtendOptions.
	 * 
	 * @param devicePath
	 */
	public void setDevicePath(java.lang.String devicePath) {
		this.devicePath = devicePath;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof QueryVmfsDatastoreExtendOptions)) {
			return false;
		}
		QueryVmfsDatastoreExtendOptions other = (QueryVmfsDatastoreExtendOptions) obj;
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
				&& ((this.datastore == null && other.getDatastore() == null) || (this.datastore != null && this.datastore
						.equals(other.getDatastore())))
				&& ((this.devicePath == null && other.getDevicePath() == null) || (this.devicePath != null && this.devicePath
						.equals(other.getDevicePath())));
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
		if (getDatastore() != null) {
			_hashCode += getDatastore().hashCode();
		}
		if (getDevicePath() != null) {
			_hashCode += getDevicePath().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			QueryVmfsDatastoreExtendOptions.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">QueryVmfsDatastoreExtendOptions"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datastore");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"datastore"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("devicePath");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"devicePath"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
