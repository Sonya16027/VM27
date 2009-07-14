/**
 * ProfileParameterMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ProfileParameterMetadata extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ExtendedElementDescription id;

	private java.lang.String type;

	private boolean optional;

	private java.lang.Object defaultValue;

	public ProfileParameterMetadata() {
	}

	public ProfileParameterMetadata(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ExtendedElementDescription id,
			java.lang.String type, boolean optional,
			java.lang.Object defaultValue) {
		super(dynamicType, dynamicProperty);
		this.id = id;
		this.type = type;
		this.optional = optional;
		this.defaultValue = defaultValue;
	}

	/**
	 * Gets the id value for this ProfileParameterMetadata.
	 * 
	 * @return id
	 */
	public com.vmware.vim25.ExtendedElementDescription getId() {
		return id;
	}

	/**
	 * Sets the id value for this ProfileParameterMetadata.
	 * 
	 * @param id
	 */
	public void setId(com.vmware.vim25.ExtendedElementDescription id) {
		this.id = id;
	}

	/**
	 * Gets the type value for this ProfileParameterMetadata.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this ProfileParameterMetadata.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the optional value for this ProfileParameterMetadata.
	 * 
	 * @return optional
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * Sets the optional value for this ProfileParameterMetadata.
	 * 
	 * @param optional
	 */
	public void setOptional(boolean optional) {
		this.optional = optional;
	}

	/**
	 * Gets the defaultValue value for this ProfileParameterMetadata.
	 * 
	 * @return defaultValue
	 */
	public java.lang.Object getDefaultValue() {
		return defaultValue;
	}

	/**
	 * Sets the defaultValue value for this ProfileParameterMetadata.
	 * 
	 * @param defaultValue
	 */
	public void setDefaultValue(java.lang.Object defaultValue) {
		this.defaultValue = defaultValue;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ProfileParameterMetadata)) {
			return false;
		}
		ProfileParameterMetadata other = (ProfileParameterMetadata) obj;
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
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id
						.equals(other.getId())))
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& this.optional == other.isOptional()
				&& ((this.defaultValue == null && other.getDefaultValue() == null) || (this.defaultValue != null && this.defaultValue
						.equals(other.getDefaultValue())));
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
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		_hashCode += (isOptional() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getDefaultValue() != null) {
			_hashCode += getDefaultValue().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ProfileParameterMetadata.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfileParameterMetadata"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ExtendedElementDescription"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("optional");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"optional"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultValue");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"defaultValue"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "anyType"));
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
