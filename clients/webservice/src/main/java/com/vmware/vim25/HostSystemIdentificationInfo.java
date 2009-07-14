/**
 * HostSystemIdentificationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostSystemIdentificationInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String identifierValue;

	private com.vmware.vim25.ElementDescription identifierType;

	public HostSystemIdentificationInfo() {
	}

	public HostSystemIdentificationInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String identifierValue,
			com.vmware.vim25.ElementDescription identifierType) {
		super(dynamicType, dynamicProperty);
		this.identifierValue = identifierValue;
		this.identifierType = identifierType;
	}

	/**
	 * Gets the identifierValue value for this HostSystemIdentificationInfo.
	 * 
	 * @return identifierValue
	 */
	public java.lang.String getIdentifierValue() {
		return identifierValue;
	}

	/**
	 * Sets the identifierValue value for this HostSystemIdentificationInfo.
	 * 
	 * @param identifierValue
	 */
	public void setIdentifierValue(java.lang.String identifierValue) {
		this.identifierValue = identifierValue;
	}

	/**
	 * Gets the identifierType value for this HostSystemIdentificationInfo.
	 * 
	 * @return identifierType
	 */
	public com.vmware.vim25.ElementDescription getIdentifierType() {
		return identifierType;
	}

	/**
	 * Sets the identifierType value for this HostSystemIdentificationInfo.
	 * 
	 * @param identifierType
	 */
	public void setIdentifierType(
			com.vmware.vim25.ElementDescription identifierType) {
		this.identifierType = identifierType;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostSystemIdentificationInfo)) {
			return false;
		}
		HostSystemIdentificationInfo other = (HostSystemIdentificationInfo) obj;
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
				&& ((this.identifierValue == null && other.getIdentifierValue() == null) || (this.identifierValue != null && this.identifierValue
						.equals(other.getIdentifierValue())))
				&& ((this.identifierType == null && other.getIdentifierType() == null) || (this.identifierType != null && this.identifierType
						.equals(other.getIdentifierType())));
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
		if (getIdentifierValue() != null) {
			_hashCode += getIdentifierValue().hashCode();
		}
		if (getIdentifierType() != null) {
			_hashCode += getIdentifierType().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostSystemIdentificationInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostSystemIdentificationInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("identifierValue");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"identifierValue"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("identifierType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"identifierType"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ElementDescription"));
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
