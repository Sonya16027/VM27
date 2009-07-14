/**
 * ProfileDescriptionSection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ProfileDescriptionSection extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ExtendedElementDescription description;

	private com.vmware.vim25.LocalizableMessage[] message;

	public ProfileDescriptionSection() {
	}

	public ProfileDescriptionSection(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ExtendedElementDescription description,
			com.vmware.vim25.LocalizableMessage[] message) {
		super(dynamicType, dynamicProperty);
		this.description = description;
		this.message = message;
	}

	/**
	 * Gets the description value for this ProfileDescriptionSection.
	 * 
	 * @return description
	 */
	public com.vmware.vim25.ExtendedElementDescription getDescription() {
		return description;
	}

	/**
	 * Sets the description value for this ProfileDescriptionSection.
	 * 
	 * @param description
	 */
	public void setDescription(
			com.vmware.vim25.ExtendedElementDescription description) {
		this.description = description;
	}

	/**
	 * Gets the message value for this ProfileDescriptionSection.
	 * 
	 * @return message
	 */
	public com.vmware.vim25.LocalizableMessage[] getMessage() {
		return message;
	}

	/**
	 * Sets the message value for this ProfileDescriptionSection.
	 * 
	 * @param message
	 */
	public void setMessage(com.vmware.vim25.LocalizableMessage[] message) {
		this.message = message;
	}

	public com.vmware.vim25.LocalizableMessage getMessage(int i) {
		return this.message[i];
	}

	public void setMessage(int i, com.vmware.vim25.LocalizableMessage _value) {
		this.message[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ProfileDescriptionSection)) {
			return false;
		}
		ProfileDescriptionSection other = (ProfileDescriptionSection) obj;
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
				&& ((this.description == null && other.getDescription() == null) || (this.description != null && this.description
						.equals(other.getDescription())))
				&& ((this.message == null && other.getMessage() == null) || (this.message != null && java.util.Arrays
						.equals(this.message, other.getMessage())));
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
		if (getDescription() != null) {
			_hashCode += getDescription().hashCode();
		}
		if (getMessage() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getMessage()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getMessage(), i);
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
			ProfileDescriptionSection.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfileDescriptionSection"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("description");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"description"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ExtendedElementDescription"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("message");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"message"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LocalizableMessage"));
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
