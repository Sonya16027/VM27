/**
 * ComplianceProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ComplianceProfile extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ProfileExpression[] expression;

	private java.lang.String rootExpression;

	public ComplianceProfile() {
	}

	public ComplianceProfile(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ProfileExpression[] expression,
			java.lang.String rootExpression) {
		super(dynamicType, dynamicProperty);
		this.expression = expression;
		this.rootExpression = rootExpression;
	}

	/**
	 * Gets the expression value for this ComplianceProfile.
	 * 
	 * @return expression
	 */
	public com.vmware.vim25.ProfileExpression[] getExpression() {
		return expression;
	}

	/**
	 * Sets the expression value for this ComplianceProfile.
	 * 
	 * @param expression
	 */
	public void setExpression(com.vmware.vim25.ProfileExpression[] expression) {
		this.expression = expression;
	}

	public com.vmware.vim25.ProfileExpression getExpression(int i) {
		return this.expression[i];
	}

	public void setExpression(int i, com.vmware.vim25.ProfileExpression _value) {
		this.expression[i] = _value;
	}

	/**
	 * Gets the rootExpression value for this ComplianceProfile.
	 * 
	 * @return rootExpression
	 */
	public java.lang.String getRootExpression() {
		return rootExpression;
	}

	/**
	 * Sets the rootExpression value for this ComplianceProfile.
	 * 
	 * @param rootExpression
	 */
	public void setRootExpression(java.lang.String rootExpression) {
		this.rootExpression = rootExpression;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ComplianceProfile)) {
			return false;
		}
		ComplianceProfile other = (ComplianceProfile) obj;
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
				&& ((this.expression == null && other.getExpression() == null) || (this.expression != null && java.util.Arrays
						.equals(this.expression, other.getExpression())))
				&& ((this.rootExpression == null && other.getRootExpression() == null) || (this.rootExpression != null && this.rootExpression
						.equals(other.getRootExpression())));
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
		if (getExpression() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getExpression()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getExpression(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getRootExpression() != null) {
			_hashCode += getRootExpression().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ComplianceProfile.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ComplianceProfile"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("expression");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"expression"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfileExpression"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rootExpression");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"rootExpression"));
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
