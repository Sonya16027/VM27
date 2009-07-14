/**
 * ComplianceFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ComplianceFailure extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String failureType;

	private com.vmware.vim25.LocalizableMessage message;

	private java.lang.String expressionName;

	public ComplianceFailure() {
	}

	public ComplianceFailure(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String failureType,
			com.vmware.vim25.LocalizableMessage message,
			java.lang.String expressionName) {
		super(dynamicType, dynamicProperty);
		this.failureType = failureType;
		this.message = message;
		this.expressionName = expressionName;
	}

	/**
	 * Gets the failureType value for this ComplianceFailure.
	 * 
	 * @return failureType
	 */
	public java.lang.String getFailureType() {
		return failureType;
	}

	/**
	 * Sets the failureType value for this ComplianceFailure.
	 * 
	 * @param failureType
	 */
	public void setFailureType(java.lang.String failureType) {
		this.failureType = failureType;
	}

	/**
	 * Gets the message value for this ComplianceFailure.
	 * 
	 * @return message
	 */
	public com.vmware.vim25.LocalizableMessage getMessage() {
		return message;
	}

	/**
	 * Sets the message value for this ComplianceFailure.
	 * 
	 * @param message
	 */
	public void setMessage(com.vmware.vim25.LocalizableMessage message) {
		this.message = message;
	}

	/**
	 * Gets the expressionName value for this ComplianceFailure.
	 * 
	 * @return expressionName
	 */
	public java.lang.String getExpressionName() {
		return expressionName;
	}

	/**
	 * Sets the expressionName value for this ComplianceFailure.
	 * 
	 * @param expressionName
	 */
	public void setExpressionName(java.lang.String expressionName) {
		this.expressionName = expressionName;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ComplianceFailure)) {
			return false;
		}
		ComplianceFailure other = (ComplianceFailure) obj;
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
				&& ((this.failureType == null && other.getFailureType() == null) || (this.failureType != null && this.failureType
						.equals(other.getFailureType())))
				&& ((this.message == null && other.getMessage() == null) || (this.message != null && this.message
						.equals(other.getMessage())))
				&& ((this.expressionName == null && other.getExpressionName() == null) || (this.expressionName != null && this.expressionName
						.equals(other.getExpressionName())));
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
		if (getFailureType() != null) {
			_hashCode += getFailureType().hashCode();
		}
		if (getMessage() != null) {
			_hashCode += getMessage().hashCode();
		}
		if (getExpressionName() != null) {
			_hashCode += getExpressionName().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ComplianceFailure.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ComplianceFailure"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("failureType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"failureType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("message");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"message"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LocalizableMessage"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("expressionName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"expressionName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
