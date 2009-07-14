/**
 * QueryPartitionCreateDescRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class QueryPartitionCreateDescRequestType implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String diskUuid;

	private java.lang.String diagnosticType;

	public QueryPartitionCreateDescRequestType() {
	}

	public QueryPartitionCreateDescRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String diskUuid, java.lang.String diagnosticType) {
		this._this = _this;
		this.diskUuid = diskUuid;
		this.diagnosticType = diagnosticType;
	}

	/**
	 * Gets the _this value for this QueryPartitionCreateDescRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this QueryPartitionCreateDescRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the diskUuid value for this QueryPartitionCreateDescRequestType.
	 * 
	 * @return diskUuid
	 */
	public java.lang.String getDiskUuid() {
		return diskUuid;
	}

	/**
	 * Sets the diskUuid value for this QueryPartitionCreateDescRequestType.
	 * 
	 * @param diskUuid
	 */
	public void setDiskUuid(java.lang.String diskUuid) {
		this.diskUuid = diskUuid;
	}

	/**
	 * Gets the diagnosticType value for this
	 * QueryPartitionCreateDescRequestType.
	 * 
	 * @return diagnosticType
	 */
	public java.lang.String getDiagnosticType() {
		return diagnosticType;
	}

	/**
	 * Sets the diagnosticType value for this
	 * QueryPartitionCreateDescRequestType.
	 * 
	 * @param diagnosticType
	 */
	public void setDiagnosticType(java.lang.String diagnosticType) {
		this.diagnosticType = diagnosticType;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof QueryPartitionCreateDescRequestType)) {
			return false;
		}
		QueryPartitionCreateDescRequestType other = (QueryPartitionCreateDescRequestType) obj;
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
				&& ((this.diskUuid == null && other.getDiskUuid() == null) || (this.diskUuid != null && this.diskUuid
						.equals(other.getDiskUuid())))
				&& ((this.diagnosticType == null && other.getDiagnosticType() == null) || (this.diagnosticType != null && this.diagnosticType
						.equals(other.getDiagnosticType())));
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
		if (getDiskUuid() != null) {
			_hashCode += getDiskUuid().hashCode();
		}
		if (getDiagnosticType() != null) {
			_hashCode += getDiagnosticType().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			QueryPartitionCreateDescRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"QueryPartitionCreateDescRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diskUuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"diskUuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diagnosticType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"diagnosticType"));
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
