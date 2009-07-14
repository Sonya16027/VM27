/**
 * ArrayOfCheckResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfCheckResult implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.CheckResult[] checkResult;

	public ArrayOfCheckResult() {
	}

	public ArrayOfCheckResult(com.vmware.vim25.CheckResult[] checkResult) {
		this.checkResult = checkResult;
	}

	/**
	 * Gets the checkResult value for this ArrayOfCheckResult.
	 * 
	 * @return checkResult
	 */
	public com.vmware.vim25.CheckResult[] getCheckResult() {
		return checkResult;
	}

	/**
	 * Sets the checkResult value for this ArrayOfCheckResult.
	 * 
	 * @param checkResult
	 */
	public void setCheckResult(com.vmware.vim25.CheckResult[] checkResult) {
		this.checkResult = checkResult;
	}

	public com.vmware.vim25.CheckResult getCheckResult(int i) {
		return this.checkResult[i];
	}

	public void setCheckResult(int i, com.vmware.vim25.CheckResult _value) {
		this.checkResult[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfCheckResult)) {
			return false;
		}
		ArrayOfCheckResult other = (ArrayOfCheckResult) obj;
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
		_equals = true && ((this.checkResult == null && other.getCheckResult() == null) || (this.checkResult != null && java.util.Arrays
				.equals(this.checkResult, other.getCheckResult())));
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
		if (getCheckResult() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getCheckResult()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getCheckResult(), i);
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
			ArrayOfCheckResult.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfCheckResult"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("checkResult");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"CheckResult"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CheckResult"));
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
