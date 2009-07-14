/**
 * PerfSampleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PerfSampleInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.util.Calendar timestamp;

	private int interval;

	public PerfSampleInfo() {
	}

	public PerfSampleInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.util.Calendar timestamp, int interval) {
		super(dynamicType, dynamicProperty);
		this.timestamp = timestamp;
		this.interval = interval;
	}

	/**
	 * Gets the timestamp value for this PerfSampleInfo.
	 * 
	 * @return timestamp
	 */
	public java.util.Calendar getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp value for this PerfSampleInfo.
	 * 
	 * @param timestamp
	 */
	public void setTimestamp(java.util.Calendar timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Gets the interval value for this PerfSampleInfo.
	 * 
	 * @return interval
	 */
	public int getInterval() {
		return interval;
	}

	/**
	 * Sets the interval value for this PerfSampleInfo.
	 * 
	 * @param interval
	 */
	public void setInterval(int interval) {
		this.interval = interval;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PerfSampleInfo)) {
			return false;
		}
		PerfSampleInfo other = (PerfSampleInfo) obj;
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
				&& ((this.timestamp == null && other.getTimestamp() == null) || (this.timestamp != null && this.timestamp
						.equals(other.getTimestamp())))
				&& this.interval == other.getInterval();
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
		if (getTimestamp() != null) {
			_hashCode += getTimestamp().hashCode();
		}
		_hashCode += getInterval();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			PerfSampleInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PerfSampleInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("timestamp");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"timestamp"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("interval");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"interval"));
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
