/**
 * HostDatastoreBrowserSearchResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDatastoreBrowserSearchResults extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference datastore;

	private java.lang.String folderPath;

	private com.vmware.vim25.FileInfo[] file;

	public HostDatastoreBrowserSearchResults() {
	}

	public HostDatastoreBrowserSearchResults(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference datastore,
			java.lang.String folderPath, com.vmware.vim25.FileInfo[] file) {
		super(dynamicType, dynamicProperty);
		this.datastore = datastore;
		this.folderPath = folderPath;
		this.file = file;
	}

	/**
	 * Gets the datastore value for this HostDatastoreBrowserSearchResults.
	 * 
	 * @return datastore
	 */
	public com.vmware.vim25.ManagedObjectReference getDatastore() {
		return datastore;
	}

	/**
	 * Sets the datastore value for this HostDatastoreBrowserSearchResults.
	 * 
	 * @param datastore
	 */
	public void setDatastore(com.vmware.vim25.ManagedObjectReference datastore) {
		this.datastore = datastore;
	}

	/**
	 * Gets the folderPath value for this HostDatastoreBrowserSearchResults.
	 * 
	 * @return folderPath
	 */
	public java.lang.String getFolderPath() {
		return folderPath;
	}

	/**
	 * Sets the folderPath value for this HostDatastoreBrowserSearchResults.
	 * 
	 * @param folderPath
	 */
	public void setFolderPath(java.lang.String folderPath) {
		this.folderPath = folderPath;
	}

	/**
	 * Gets the file value for this HostDatastoreBrowserSearchResults.
	 * 
	 * @return file
	 */
	public com.vmware.vim25.FileInfo[] getFile() {
		return file;
	}

	/**
	 * Sets the file value for this HostDatastoreBrowserSearchResults.
	 * 
	 * @param file
	 */
	public void setFile(com.vmware.vim25.FileInfo[] file) {
		this.file = file;
	}

	public com.vmware.vim25.FileInfo getFile(int i) {
		return this.file[i];
	}

	public void setFile(int i, com.vmware.vim25.FileInfo _value) {
		this.file[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostDatastoreBrowserSearchResults)) {
			return false;
		}
		HostDatastoreBrowserSearchResults other = (HostDatastoreBrowserSearchResults) obj;
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
		_equals = super.equals(obj)
				&& ((this.datastore == null && other.getDatastore() == null) || (this.datastore != null && this.datastore
						.equals(other.getDatastore())))
				&& ((this.folderPath == null && other.getFolderPath() == null) || (this.folderPath != null && this.folderPath
						.equals(other.getFolderPath())))
				&& ((this.file == null && other.getFile() == null) || (this.file != null && java.util.Arrays
						.equals(this.file, other.getFile())));
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
		int _hashCode = super.hashCode();
		if (getDatastore() != null) {
			_hashCode += getDatastore().hashCode();
		}
		if (getFolderPath() != null) {
			_hashCode += getFolderPath().hashCode();
		}
		if (getFile() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getFile()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getFile(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostDatastoreBrowserSearchResults.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDatastoreBrowserSearchResults"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datastore");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"datastore"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("folderPath");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"folderPath"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("file");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "file"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"FileInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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
