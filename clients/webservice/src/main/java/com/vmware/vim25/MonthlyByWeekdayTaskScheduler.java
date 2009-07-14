/**
 * MonthlyByWeekdayTaskScheduler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class MonthlyByWeekdayTaskScheduler extends
		com.vmware.vim25.MonthlyTaskScheduler implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.WeekOfMonth offset;

	private com.vmware.vim25.DayOfWeek weekday;

	public MonthlyByWeekdayTaskScheduler() {
	}

	public MonthlyByWeekdayTaskScheduler(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.util.Calendar activeTime, java.util.Calendar expireTime,
			int interval, int minute, int hour,
			com.vmware.vim25.WeekOfMonth offset,
			com.vmware.vim25.DayOfWeek weekday) {
		super(dynamicType, dynamicProperty, activeTime, expireTime, interval,
				minute, hour);
		this.offset = offset;
		this.weekday = weekday;
	}

	/**
	 * Gets the offset value for this MonthlyByWeekdayTaskScheduler.
	 * 
	 * @return offset
	 */
	public com.vmware.vim25.WeekOfMonth getOffset() {
		return offset;
	}

	/**
	 * Sets the offset value for this MonthlyByWeekdayTaskScheduler.
	 * 
	 * @param offset
	 */
	public void setOffset(com.vmware.vim25.WeekOfMonth offset) {
		this.offset = offset;
	}

	/**
	 * Gets the weekday value for this MonthlyByWeekdayTaskScheduler.
	 * 
	 * @return weekday
	 */
	public com.vmware.vim25.DayOfWeek getWeekday() {
		return weekday;
	}

	/**
	 * Sets the weekday value for this MonthlyByWeekdayTaskScheduler.
	 * 
	 * @param weekday
	 */
	public void setWeekday(com.vmware.vim25.DayOfWeek weekday) {
		this.weekday = weekday;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof MonthlyByWeekdayTaskScheduler)) {
			return false;
		}
		MonthlyByWeekdayTaskScheduler other = (MonthlyByWeekdayTaskScheduler) obj;
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
				&& ((this.offset == null && other.getOffset() == null) || (this.offset != null && this.offset
						.equals(other.getOffset())))
				&& ((this.weekday == null && other.getWeekday() == null) || (this.weekday != null && this.weekday
						.equals(other.getWeekday())));
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
		if (getOffset() != null) {
			_hashCode += getOffset().hashCode();
		}
		if (getWeekday() != null) {
			_hashCode += getWeekday().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			MonthlyByWeekdayTaskScheduler.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"MonthlyByWeekdayTaskScheduler"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("offset");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"offset"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"WeekOfMonth"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("weekday");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"weekday"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DayOfWeek"));
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
