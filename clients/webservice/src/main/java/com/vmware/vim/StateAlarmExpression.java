/**
 * StateAlarmExpression.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class StateAlarmExpression extends com.vmware.vim.AlarmExpression
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.StateAlarmOperator operator;

	private java.lang.String type;

	private java.lang.String statePath;

	private java.lang.String yellow;

	private java.lang.String red;

	public StateAlarmExpression() {
	}

	public StateAlarmExpression(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.StateAlarmOperator operator, java.lang.String type,
			java.lang.String statePath, java.lang.String yellow,
			java.lang.String red) {
		super(dynamicType, dynamicProperty);
		this.operator = operator;
		this.type = type;
		this.statePath = statePath;
		this.yellow = yellow;
		this.red = red;
	}

	/**
	 * Gets the operator value for this StateAlarmExpression.
	 * 
	 * @return operator
	 */
	public com.vmware.vim.StateAlarmOperator getOperator() {
		return operator;
	}

	/**
	 * Sets the operator value for this StateAlarmExpression.
	 * 
	 * @param operator
	 */
	public void setOperator(com.vmware.vim.StateAlarmOperator operator) {
		this.operator = operator;
	}

	/**
	 * Gets the type value for this StateAlarmExpression.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this StateAlarmExpression.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the statePath value for this StateAlarmExpression.
	 * 
	 * @return statePath
	 */
	public java.lang.String getStatePath() {
		return statePath;
	}

	/**
	 * Sets the statePath value for this StateAlarmExpression.
	 * 
	 * @param statePath
	 */
	public void setStatePath(java.lang.String statePath) {
		this.statePath = statePath;
	}

	/**
	 * Gets the yellow value for this StateAlarmExpression.
	 * 
	 * @return yellow
	 */
	public java.lang.String getYellow() {
		return yellow;
	}

	/**
	 * Sets the yellow value for this StateAlarmExpression.
	 * 
	 * @param yellow
	 */
	public void setYellow(java.lang.String yellow) {
		this.yellow = yellow;
	}

	/**
	 * Gets the red value for this StateAlarmExpression.
	 * 
	 * @return red
	 */
	public java.lang.String getRed() {
		return red;
	}

	/**
	 * Sets the red value for this StateAlarmExpression.
	 * 
	 * @param red
	 */
	public void setRed(java.lang.String red) {
		this.red = red;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof StateAlarmExpression)) {
			return false;
		}
		StateAlarmExpression other = (StateAlarmExpression) obj;
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
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& ((this.statePath == null && other.getStatePath() == null) || (this.statePath != null && this.statePath
						.equals(other.getStatePath())))
				&& ((this.yellow == null && other.getYellow() == null) || (this.yellow != null && this.yellow
						.equals(other.getYellow())))
				&& ((this.red == null && other.getRed() == null) || (this.red != null && this.red
						.equals(other.getRed())));
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
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getStatePath() != null) {
			_hashCode += getStatePath().hashCode();
		}
		if (getYellow() != null) {
			_hashCode += getYellow().hashCode();
		}
		if (getRed() != null) {
			_hashCode += getRed().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			StateAlarmExpression.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"StateAlarmExpression"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("operator");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"operator"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"StateAlarmOperator"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("statePath");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"statePath"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("yellow");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "yellow"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("red");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "red"));
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
