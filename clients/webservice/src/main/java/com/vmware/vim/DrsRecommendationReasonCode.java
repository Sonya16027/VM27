/**
 * DrsRecommendationReasonCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class DrsRecommendationReasonCode implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected DrsRecommendationReasonCode(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _fairnessCpuAvg = "fairnessCpuAvg";
	public static final java.lang.String _fairnessMemAvg = "fairnessMemAvg";
	public static final java.lang.String _jointAffin = "jointAffin";
	public static final java.lang.String _antiAffin = "antiAffin";
	public static final java.lang.String _hostMaint = "hostMaint";
	public static final DrsRecommendationReasonCode fairnessCpuAvg = new DrsRecommendationReasonCode(
			_fairnessCpuAvg);
	public static final DrsRecommendationReasonCode fairnessMemAvg = new DrsRecommendationReasonCode(
			_fairnessMemAvg);
	public static final DrsRecommendationReasonCode jointAffin = new DrsRecommendationReasonCode(
			_jointAffin);
	public static final DrsRecommendationReasonCode antiAffin = new DrsRecommendationReasonCode(
			_antiAffin);
	public static final DrsRecommendationReasonCode hostMaint = new DrsRecommendationReasonCode(
			_hostMaint);

	public java.lang.String getValue() {
		return _value_;
	}

	public static DrsRecommendationReasonCode fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		DrsRecommendationReasonCode enumeration = (DrsRecommendationReasonCode) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static DrsRecommendationReasonCode fromString(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		return fromValue(value);
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public java.lang.String toString() {
		return _value_;
	}

	public java.lang.Object readResolve() throws java.io.ObjectStreamException {
		return fromValue(_value_);
	}

	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumSerializer(_javaType,
				_xmlType);
	}

	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumDeserializer(_javaType,
				_xmlType);
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DrsRecommendationReasonCode.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"DrsRecommendationReasonCode"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
