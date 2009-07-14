/**
 * ArrayOfPerfSampleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfPerfSampleInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.PerfSampleInfo[] perfSampleInfo;

	public ArrayOfPerfSampleInfo() {
	}

	public ArrayOfPerfSampleInfo(
			com.vmware.vim25.PerfSampleInfo[] perfSampleInfo) {
		this.perfSampleInfo = perfSampleInfo;
	}

	/**
	 * Gets the perfSampleInfo value for this ArrayOfPerfSampleInfo.
	 * 
	 * @return perfSampleInfo
	 */
	public com.vmware.vim25.PerfSampleInfo[] getPerfSampleInfo() {
		return perfSampleInfo;
	}

	/**
	 * Sets the perfSampleInfo value for this ArrayOfPerfSampleInfo.
	 * 
	 * @param perfSampleInfo
	 */
	public void setPerfSampleInfo(
			com.vmware.vim25.PerfSampleInfo[] perfSampleInfo) {
		this.perfSampleInfo = perfSampleInfo;
	}

	public com.vmware.vim25.PerfSampleInfo getPerfSampleInfo(int i) {
		return this.perfSampleInfo[i];
	}

	public void setPerfSampleInfo(int i, com.vmware.vim25.PerfSampleInfo _value) {
		this.perfSampleInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfPerfSampleInfo)) {
			return false;
		}
		ArrayOfPerfSampleInfo other = (ArrayOfPerfSampleInfo) obj;
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
		_equals = true && ((this.perfSampleInfo == null && other
				.getPerfSampleInfo() == null) || (this.perfSampleInfo != null && java.util.Arrays
				.equals(this.perfSampleInfo, other.getPerfSampleInfo())));
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
		int _hashCode = 1;
		if (getPerfSampleInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPerfSampleInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPerfSampleInfo(), i);
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
			ArrayOfPerfSampleInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfPerfSampleInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("perfSampleInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"PerfSampleInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PerfSampleInfo"));
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
