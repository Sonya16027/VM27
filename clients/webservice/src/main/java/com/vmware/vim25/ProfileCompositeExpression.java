/**
 * ProfileCompositeExpression.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ProfileCompositeExpression extends
		com.vmware.vim25.ProfileExpression implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String operator;

	private java.lang.String[] expressionName;

	public ProfileCompositeExpression() {
	}

	public ProfileCompositeExpression(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String id, java.lang.String displayName, boolean negated,
			java.lang.String operator, java.lang.String[] expressionName) {
		super(dynamicType, dynamicProperty, id, displayName, negated);
		this.operator = operator;
		this.expressionName = expressionName;
	}

	/**
	 * Gets the operator value for this ProfileCompositeExpression.
	 * 
	 * @return operator
	 */
	public java.lang.String getOperator() {
		return operator;
	}

	/**
	 * Sets the operator value for this ProfileCompositeExpression.
	 * 
	 * @param operator
	 */
	public void setOperator(java.lang.String operator) {
		this.operator = operator;
	}

	/**
	 * Gets the expressionName value for this ProfileCompositeExpression.
	 * 
	 * @return expressionName
	 */
	public java.lang.String[] getExpressionName() {
		return expressionName;
	}

	/**
	 * Sets the expressionName value for this ProfileCompositeExpression.
	 * 
	 * @param expressionName
	 */
	public void setExpressionName(java.lang.String[] expressionName) {
		this.expressionName = expressionName;
	}

	public java.lang.String getExpressionName(int i) {
		return this.expressionName[i];
	}

	public void setExpressionName(int i, java.lang.String _value) {
		this.expressionName[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ProfileCompositeExpression)) {
			return false;
		}
		ProfileCompositeExpression other = (ProfileCompositeExpression) obj;
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
				&& ((this.operator == null && other.getOperator() == null) || (this.operator != null && this.operator
						.equals(other.getOperator())))
				&& ((this.expressionName == null && other.getExpressionName() == null) || (this.expressionName != null && java.util.Arrays
						.equals(this.expressionName, other.getExpressionName())));
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
		if (getOperator() != null) {
			_hashCode += getOperator().hashCode();
		}
		if (getExpressionName() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getExpressionName()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getExpressionName(), i);
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
			ProfileCompositeExpression.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfileCompositeExpression"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("operator");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"operator"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("expressionName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"expressionName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
