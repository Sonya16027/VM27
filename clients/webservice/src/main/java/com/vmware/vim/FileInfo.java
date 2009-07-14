/**
 * FileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class FileInfo extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String path;

	private java.lang.Long fileSize;

	private java.util.Calendar modification;

	public FileInfo() {
	}

	public FileInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String path, java.lang.Long fileSize,
			java.util.Calendar modification) {
		super(dynamicType, dynamicProperty);
		this.path = path;
		this.fileSize = fileSize;
		this.modification = modification;
	}

	/**
	 * Gets the path value for this FileInfo.
	 * 
	 * @return path
	 */
	public java.lang.String getPath() {
		return path;
	}

	/**
	 * Sets the path value for this FileInfo.
	 * 
	 * @param path
	 */
	public void setPath(java.lang.String path) {
		this.path = path;
	}

	/**
	 * Gets the fileSize value for this FileInfo.
	 * 
	 * @return fileSize
	 */
	public java.lang.Long getFileSize() {
		return fileSize;
	}

	/**
	 * Sets the fileSize value for this FileInfo.
	 * 
	 * @param fileSize
	 */
	public void setFileSize(java.lang.Long fileSize) {
		this.fileSize = fileSize;
	}

	/**
	 * Gets the modification value for this FileInfo.
	 * 
	 * @return modification
	 */
	public java.util.Calendar getModification() {
		return modification;
	}

	/**
	 * Sets the modification value for this FileInfo.
	 * 
	 * @param modification
	 */
	public void setModification(java.util.Calendar modification) {
		this.modification = modification;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof FileInfo)) {
			return false;
		}
		FileInfo other = (FileInfo) obj;
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
				&& ((this.path == null && other.getPath() == null) || (this.path != null && this.path
						.equals(other.getPath())))
				&& ((this.fileSize == null && other.getFileSize() == null) || (this.fileSize != null && this.fileSize
						.equals(other.getFileSize())))
				&& ((this.modification == null && other.getModification() == null) || (this.modification != null && this.modification
						.equals(other.getModification())));
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
		if (getPath() != null) {
			_hashCode += getPath().hashCode();
		}
		if (getFileSize() != null) {
			_hashCode += getFileSize().hashCode();
		}
		if (getModification() != null) {
			_hashCode += getModification().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			FileInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"FileInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("path");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "path"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fileSize");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"fileSize"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("modification");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"modification"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
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
