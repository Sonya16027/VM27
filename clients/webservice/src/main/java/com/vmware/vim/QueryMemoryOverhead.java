/**
 * QueryMemoryOverhead.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class QueryMemoryOverhead implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private long memorySize;

	private java.lang.Integer videoRamSize;

	private int numVcpus;

	public QueryMemoryOverhead() {
	}

	public QueryMemoryOverhead(com.vmware.vim.ManagedObjectReference _this,
			long memorySize, java.lang.Integer videoRamSize, int numVcpus) {
		this._this = _this;
		this.memorySize = memorySize;
		this.videoRamSize = videoRamSize;
		this.numVcpus = numVcpus;
	}

	/**
	 * Gets the _this value for this QueryMemoryOverhead.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this QueryMemoryOverhead.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the memorySize value for this QueryMemoryOverhead.
	 * 
	 * @return memorySize
	 */
	public long getMemorySize() {
		return memorySize;
	}

	/**
	 * Sets the memorySize value for this QueryMemoryOverhead.
	 * 
	 * @param memorySize
	 */
	public void setMemorySize(long memorySize) {
		this.memorySize = memorySize;
	}

	/**
	 * Gets the videoRamSize value for this QueryMemoryOverhead.
	 * 
	 * @return videoRamSize
	 */
	public java.lang.Integer getVideoRamSize() {
		return videoRamSize;
	}

	/**
	 * Sets the videoRamSize value for this QueryMemoryOverhead.
	 * 
	 * @param videoRamSize
	 */
	public void setVideoRamSize(java.lang.Integer videoRamSize) {
		this.videoRamSize = videoRamSize;
	}

	/**
	 * Gets the numVcpus value for this QueryMemoryOverhead.
	 * 
	 * @return numVcpus
	 */
	public int getNumVcpus() {
		return numVcpus;
	}

	/**
	 * Sets the numVcpus value for this QueryMemoryOverhead.
	 * 
	 * @param numVcpus
	 */
	public void setNumVcpus(int numVcpus) {
		this.numVcpus = numVcpus;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof QueryMemoryOverhead)) {
			return false;
		}
		QueryMemoryOverhead other = (QueryMemoryOverhead) obj;
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
				&& this.memorySize == other.getMemorySize()
				&& ((this.videoRamSize == null && other.getVideoRamSize() == null) || (this.videoRamSize != null && this.videoRamSize
						.equals(other.getVideoRamSize())))
				&& this.numVcpus == other.getNumVcpus();
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
		_hashCode += new Long(getMemorySize()).hashCode();
		if (getVideoRamSize() != null) {
			_hashCode += getVideoRamSize().hashCode();
		}
		_hashCode += getNumVcpus();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			QueryMemoryOverhead.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">QueryMemoryOverhead"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memorySize");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"memorySize"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("videoRamSize");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"videoRamSize"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numVcpus");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"numVcpus"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
