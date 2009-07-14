/**
 * MetricAlarmExpression.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class MetricAlarmExpression extends com.vmware.vim25.AlarmExpression
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.MetricAlarmOperator operator;

	private java.lang.String type;

	private com.vmware.vim25.PerfMetricId metric;

	private java.lang.Integer yellow;

	private java.lang.Integer yellowInterval;

	private java.lang.Integer red;

	private java.lang.Integer redInterval;

	public MetricAlarmExpression() {
	}

	public MetricAlarmExpression(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.MetricAlarmOperator operator,
			java.lang.String type, com.vmware.vim25.PerfMetricId metric,
			java.lang.Integer yellow, java.lang.Integer yellowInterval,
			java.lang.Integer red, java.lang.Integer redInterval) {
		super(dynamicType, dynamicProperty);
		this.operator = operator;
		this.type = type;
		this.metric = metric;
		this.yellow = yellow;
		this.yellowInterval = yellowInterval;
		this.red = red;
		this.redInterval = redInterval;
	}

	/**
	 * Gets the operator value for this MetricAlarmExpression.
	 * 
	 * @return operator
	 */
	public com.vmware.vim25.MetricAlarmOperator getOperator() {
		return operator;
	}

	/**
	 * Sets the operator value for this MetricAlarmExpression.
	 * 
	 * @param operator
	 */
	public void setOperator(com.vmware.vim25.MetricAlarmOperator operator) {
		this.operator = operator;
	}

	/**
	 * Gets the type value for this MetricAlarmExpression.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this MetricAlarmExpression.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the metric value for this MetricAlarmExpression.
	 * 
	 * @return metric
	 */
	public com.vmware.vim25.PerfMetricId getMetric() {
		return metric;
	}

	/**
	 * Sets the metric value for this MetricAlarmExpression.
	 * 
	 * @param metric
	 */
	public void setMetric(com.vmware.vim25.PerfMetricId metric) {
		this.metric = metric;
	}

	/**
	 * Gets the yellow value for this MetricAlarmExpression.
	 * 
	 * @return yellow
	 */
	public java.lang.Integer getYellow() {
		return yellow;
	}

	/**
	 * Sets the yellow value for this MetricAlarmExpression.
	 * 
	 * @param yellow
	 */
	public void setYellow(java.lang.Integer yellow) {
		this.yellow = yellow;
	}

	/**
	 * Gets the yellowInterval value for this MetricAlarmExpression.
	 * 
	 * @return yellowInterval
	 */
	public java.lang.Integer getYellowInterval() {
		return yellowInterval;
	}

	/**
	 * Sets the yellowInterval value for this MetricAlarmExpression.
	 * 
	 * @param yellowInterval
	 */
	public void setYellowInterval(java.lang.Integer yellowInterval) {
		this.yellowInterval = yellowInterval;
	}

	/**
	 * Gets the red value for this MetricAlarmExpression.
	 * 
	 * @return red
	 */
	public java.lang.Integer getRed() {
		return red;
	}

	/**
	 * Sets the red value for this MetricAlarmExpression.
	 * 
	 * @param red
	 */
	public void setRed(java.lang.Integer red) {
		this.red = red;
	}

	/**
	 * Gets the redInterval value for this MetricAlarmExpression.
	 * 
	 * @return redInterval
	 */
	public java.lang.Integer getRedInterval() {
		return redInterval;
	}

	/**
	 * Sets the redInterval value for this MetricAlarmExpression.
	 * 
	 * @param redInterval
	 */
	public void setRedInterval(java.lang.Integer redInterval) {
		this.redInterval = redInterval;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof MetricAlarmExpression)) {
			return false;
		}
		MetricAlarmExpression other = (MetricAlarmExpression) obj;
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
				&& ((this.metric == null && other.getMetric() == null) || (this.metric != null && this.metric
						.equals(other.getMetric())))
				&& ((this.yellow == null && other.getYellow() == null) || (this.yellow != null && this.yellow
						.equals(other.getYellow())))
				&& ((this.yellowInterval == null && other.getYellowInterval() == null) || (this.yellowInterval != null && this.yellowInterval
						.equals(other.getYellowInterval())))
				&& ((this.red == null && other.getRed() == null) || (this.red != null && this.red
						.equals(other.getRed())))
				&& ((this.redInterval == null && other.getRedInterval() == null) || (this.redInterval != null && this.redInterval
						.equals(other.getRedInterval())));
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
		if (getMetric() != null) {
			_hashCode += getMetric().hashCode();
		}
		if (getYellow() != null) {
			_hashCode += getYellow().hashCode();
		}
		if (getYellowInterval() != null) {
			_hashCode += getYellowInterval().hashCode();
		}
		if (getRed() != null) {
			_hashCode += getRed().hashCode();
		}
		if (getRedInterval() != null) {
			_hashCode += getRedInterval().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			MetricAlarmExpression.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"MetricAlarmExpression"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("operator");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"operator"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"MetricAlarmOperator"));
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
		elemField.setFieldName("metric");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"metric"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PerfMetricId"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("yellow");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"yellow"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("yellowInterval");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"yellowInterval"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("red");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "red"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("redInterval");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"redInterval"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
