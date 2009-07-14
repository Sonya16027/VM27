/**
 * ProfileSimpleExpression.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ProfileSimpleExpression extends com.vmware.vim25.ProfileExpression
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String expressionType;

	private com.vmware.vim25.KeyAnyValue[] parameter;

	public ProfileSimpleExpression() {
	}

	public ProfileSimpleExpression(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String id, java.lang.String displayName, boolean negated,
			java.lang.String expressionType,
			com.vmware.vim25.KeyAnyValue[] parameter) {
		super(dynamicType, dynamicProperty, id, displayName, negated);
		this.expressionType = expressionType;
		this.parameter = parameter;
	}

	/**
	 * Gets the expressionType value for this ProfileSimpleExpression.
	 * 
	 * @return expressionType
	 */
	public java.lang.String getExpressionType() {
		return expressionType;
	}

	/**
	 * Sets the expressionType value for this ProfileSimpleExpression.
	 * 
	 * @param expressionType
	 */
	public void setExpressionType(java.lang.String expressionType) {
		this.expressionType = expressionType;
	}

	/**
	 * Gets the parameter value for this ProfileSimpleExpression.
	 * 
	 * @return parameter
	 */
	public com.vmware.vim25.KeyAnyValue[] getParameter() {
		return parameter;
	}

	/**
	 * Sets the parameter value for this ProfileSimpleExpression.
	 * 
	 * @param parameter
	 */
	public void setParameter(com.vmware.vim25.KeyAnyValue[] parameter) {
		this.parameter = parameter;
	}

	public com.vmware.vim25.KeyAnyValue getParameter(int i) {
		return this.parameter[i];
	}

	public void setParameter(int i, com.vmware.vim25.KeyAnyValue _value) {
		this.parameter[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ProfileSimpleExpression)) {
			return false;
		}
		ProfileSimpleExpression other = (ProfileSimpleExpression) obj;
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
				&& ((this.expressionType == null && other.getExpressionType() == null) || (this.expressionType != null && this.expressionType
						.equals(other.getExpressionType())))
				&& ((this.parameter == null && other.getParameter() == null) || (this.parameter != null && java.util.Arrays
						.equals(this.parameter, other.getParameter())));
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
		if (getExpressionType() != null) {
			_hashCode += getExpressionType().hashCode();
		}
		if (getParameter() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getParameter()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getParameter(), i);
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
			ProfileSimpleExpression.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfileSimpleExpression"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("expressionType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"expressionType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parameter");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"parameter"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KeyAnyValue"));
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
