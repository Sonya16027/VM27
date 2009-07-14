/**
 * FilterSpecConstraint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class FilterSpecConstraint extends com.vmware.vim.sms.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String propertyName;

	private java.lang.String propertyValue;

	private com.vmware.vim.sms.FilterSpecComparisonOperator comparisonOperator;

	private com.vmware.vim.sms.FilterSpecConstraint[] childConstraint;

	private com.vmware.vim.sms.FilterSpecLogicalOperator childConstraintLogicalOperator;

	public FilterSpecConstraint() {
	}

	public FilterSpecConstraint(
			java.lang.String dynamicType,
			com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
			java.lang.String propertyName,
			java.lang.String propertyValue,
			com.vmware.vim.sms.FilterSpecComparisonOperator comparisonOperator,
			com.vmware.vim.sms.FilterSpecConstraint[] childConstraint,
			com.vmware.vim.sms.FilterSpecLogicalOperator childConstraintLogicalOperator) {
		super(dynamicType, dynamicProperty);
		this.propertyName = propertyName;
		this.propertyValue = propertyValue;
		this.comparisonOperator = comparisonOperator;
		this.childConstraint = childConstraint;
		this.childConstraintLogicalOperator = childConstraintLogicalOperator;
	}

	/**
	 * Gets the propertyName value for this FilterSpecConstraint.
	 * 
	 * @return propertyName
	 */
	public java.lang.String getPropertyName() {
		return propertyName;
	}

	/**
	 * Sets the propertyName value for this FilterSpecConstraint.
	 * 
	 * @param propertyName
	 */
	public void setPropertyName(java.lang.String propertyName) {
		this.propertyName = propertyName;
	}

	/**
	 * Gets the propertyValue value for this FilterSpecConstraint.
	 * 
	 * @return propertyValue
	 */
	public java.lang.String getPropertyValue() {
		return propertyValue;
	}

	/**
	 * Sets the propertyValue value for this FilterSpecConstraint.
	 * 
	 * @param propertyValue
	 */
	public void setPropertyValue(java.lang.String propertyValue) {
		this.propertyValue = propertyValue;
	}

	/**
	 * Gets the comparisonOperator value for this FilterSpecConstraint.
	 * 
	 * @return comparisonOperator
	 */
	public com.vmware.vim.sms.FilterSpecComparisonOperator getComparisonOperator() {
		return comparisonOperator;
	}

	/**
	 * Sets the comparisonOperator value for this FilterSpecConstraint.
	 * 
	 * @param comparisonOperator
	 */
	public void setComparisonOperator(
			com.vmware.vim.sms.FilterSpecComparisonOperator comparisonOperator) {
		this.comparisonOperator = comparisonOperator;
	}

	/**
	 * Gets the childConstraint value for this FilterSpecConstraint.
	 * 
	 * @return childConstraint
	 */
	public com.vmware.vim.sms.FilterSpecConstraint[] getChildConstraint() {
		return childConstraint;
	}

	/**
	 * Sets the childConstraint value for this FilterSpecConstraint.
	 * 
	 * @param childConstraint
	 */
	public void setChildConstraint(
			com.vmware.vim.sms.FilterSpecConstraint[] childConstraint) {
		this.childConstraint = childConstraint;
	}

	public com.vmware.vim.sms.FilterSpecConstraint getChildConstraint(int i) {
		return this.childConstraint[i];
	}

	public void setChildConstraint(int i,
			com.vmware.vim.sms.FilterSpecConstraint _value) {
		this.childConstraint[i] = _value;
	}

	/**
	 * Gets the childConstraintLogicalOperator value for this
	 * FilterSpecConstraint.
	 * 
	 * @return childConstraintLogicalOperator
	 */
	public com.vmware.vim.sms.FilterSpecLogicalOperator getChildConstraintLogicalOperator() {
		return childConstraintLogicalOperator;
	}

	/**
	 * Sets the childConstraintLogicalOperator value for this
	 * FilterSpecConstraint.
	 * 
	 * @param childConstraintLogicalOperator
	 */
	public void setChildConstraintLogicalOperator(
			com.vmware.vim.sms.FilterSpecLogicalOperator childConstraintLogicalOperator) {
		this.childConstraintLogicalOperator = childConstraintLogicalOperator;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof FilterSpecConstraint)) {
			return false;
		}
		FilterSpecConstraint other = (FilterSpecConstraint) obj;
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
				&& ((this.propertyName == null && other.getPropertyName() == null) || (this.propertyName != null && this.propertyName
						.equals(other.getPropertyName())))
				&& ((this.propertyValue == null && other.getPropertyValue() == null) || (this.propertyValue != null && this.propertyValue
						.equals(other.getPropertyValue())))
				&& ((this.comparisonOperator == null && other
						.getComparisonOperator() == null) || (this.comparisonOperator != null && this.comparisonOperator
						.equals(other.getComparisonOperator())))
				&& ((this.childConstraint == null && other.getChildConstraint() == null) || (this.childConstraint != null && java.util.Arrays
						.equals(this.childConstraint, other
								.getChildConstraint())))
				&& ((this.childConstraintLogicalOperator == null && other
						.getChildConstraintLogicalOperator() == null) || (this.childConstraintLogicalOperator != null && this.childConstraintLogicalOperator
						.equals(other.getChildConstraintLogicalOperator())));
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
		if (getPropertyName() != null) {
			_hashCode += getPropertyName().hashCode();
		}
		if (getPropertyValue() != null) {
			_hashCode += getPropertyValue().hashCode();
		}
		if (getComparisonOperator() != null) {
			_hashCode += getComparisonOperator().hashCode();
		}
		if (getChildConstraint() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getChildConstraint()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getChildConstraint(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getChildConstraintLogicalOperator() != null) {
			_hashCode += getChildConstraintLogicalOperator().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			FilterSpecConstraint.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"FilterSpecConstraint"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("propertyName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"propertyName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("propertyValue");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"propertyValue"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("comparisonOperator");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"comparisonOperator"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"FilterSpecComparisonOperator"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("childConstraint");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"childConstraint"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"FilterSpecConstraint"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("childConstraintLogicalOperator");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"childConstraintLogicalOperator"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"FilterSpecLogicalOperator"));
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
