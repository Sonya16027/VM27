/**
 * AlarmSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class AlarmSetting extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int toleranceRange;

	private int reportingFrequency;

	public AlarmSetting() {
	}

	public AlarmSetting(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			int toleranceRange, int reportingFrequency) {
		super(dynamicType, dynamicProperty);
		this.toleranceRange = toleranceRange;
		this.reportingFrequency = reportingFrequency;
	}

	/**
	 * Gets the toleranceRange value for this AlarmSetting.
	 * 
	 * @return toleranceRange
	 */
	public int getToleranceRange() {
		return toleranceRange;
	}

	/**
	 * Sets the toleranceRange value for this AlarmSetting.
	 * 
	 * @param toleranceRange
	 */
	public void setToleranceRange(int toleranceRange) {
		this.toleranceRange = toleranceRange;
	}

	/**
	 * Gets the reportingFrequency value for this AlarmSetting.
	 * 
	 * @return reportingFrequency
	 */
	public int getReportingFrequency() {
		return reportingFrequency;
	}

	/**
	 * Sets the reportingFrequency value for this AlarmSetting.
	 * 
	 * @param reportingFrequency
	 */
	public void setReportingFrequency(int reportingFrequency) {
		this.reportingFrequency = reportingFrequency;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AlarmSetting)) {
			return false;
		}
		AlarmSetting other = (AlarmSetting) obj;
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
				&& this.toleranceRange == other.getToleranceRange()
				&& this.reportingFrequency == other.getReportingFrequency();
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
		_hashCode += getToleranceRange();
		_hashCode += getReportingFrequency();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AlarmSetting.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"AlarmSetting"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toleranceRange");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"toleranceRange"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reportingFrequency");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"reportingFrequency"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
