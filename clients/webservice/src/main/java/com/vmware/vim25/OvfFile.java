/**
 * OvfFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class OvfFile extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String deviceId;

	private java.lang.String path;

	private java.lang.String compressionMethod;

	private java.lang.Long chunkSize;

	private long size;

	public OvfFile() {
	}

	public OvfFile(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String deviceId, java.lang.String path,
			java.lang.String compressionMethod, java.lang.Long chunkSize,
			long size) {
		super(dynamicType, dynamicProperty);
		this.deviceId = deviceId;
		this.path = path;
		this.compressionMethod = compressionMethod;
		this.chunkSize = chunkSize;
		this.size = size;
	}

	/**
	 * Gets the deviceId value for this OvfFile.
	 * 
	 * @return deviceId
	 */
	public java.lang.String getDeviceId() {
		return deviceId;
	}

	/**
	 * Sets the deviceId value for this OvfFile.
	 * 
	 * @param deviceId
	 */
	public void setDeviceId(java.lang.String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * Gets the path value for this OvfFile.
	 * 
	 * @return path
	 */
	public java.lang.String getPath() {
		return path;
	}

	/**
	 * Sets the path value for this OvfFile.
	 * 
	 * @param path
	 */
	public void setPath(java.lang.String path) {
		this.path = path;
	}

	/**
	 * Gets the compressionMethod value for this OvfFile.
	 * 
	 * @return compressionMethod
	 */
	public java.lang.String getCompressionMethod() {
		return compressionMethod;
	}

	/**
	 * Sets the compressionMethod value for this OvfFile.
	 * 
	 * @param compressionMethod
	 */
	public void setCompressionMethod(java.lang.String compressionMethod) {
		this.compressionMethod = compressionMethod;
	}

	/**
	 * Gets the chunkSize value for this OvfFile.
	 * 
	 * @return chunkSize
	 */
	public java.lang.Long getChunkSize() {
		return chunkSize;
	}

	/**
	 * Sets the chunkSize value for this OvfFile.
	 * 
	 * @param chunkSize
	 */
	public void setChunkSize(java.lang.Long chunkSize) {
		this.chunkSize = chunkSize;
	}

	/**
	 * Gets the size value for this OvfFile.
	 * 
	 * @return size
	 */
	public long getSize() {
		return size;
	}

	/**
	 * Sets the size value for this OvfFile.
	 * 
	 * @param size
	 */
	public void setSize(long size) {
		this.size = size;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof OvfFile)) {
			return false;
		}
		OvfFile other = (OvfFile) obj;
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
				&& ((this.deviceId == null && other.getDeviceId() == null) || (this.deviceId != null && this.deviceId
						.equals(other.getDeviceId())))
				&& ((this.path == null && other.getPath() == null) || (this.path != null && this.path
						.equals(other.getPath())))
				&& ((this.compressionMethod == null && other
						.getCompressionMethod() == null) || (this.compressionMethod != null && this.compressionMethod
						.equals(other.getCompressionMethod())))
				&& ((this.chunkSize == null && other.getChunkSize() == null) || (this.chunkSize != null && this.chunkSize
						.equals(other.getChunkSize())))
				&& this.size == other.getSize();
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
		if (getDeviceId() != null) {
			_hashCode += getDeviceId().hashCode();
		}
		if (getPath() != null) {
			_hashCode += getPath().hashCode();
		}
		if (getCompressionMethod() != null) {
			_hashCode += getCompressionMethod().hashCode();
		}
		if (getChunkSize() != null) {
			_hashCode += getChunkSize().hashCode();
		}
		_hashCode += new Long(getSize()).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			OvfFile.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OvfFile"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deviceId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"deviceId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("path");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "path"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("compressionMethod");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"compressionMethod"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("chunkSize");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"chunkSize"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("size");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "size"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
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
