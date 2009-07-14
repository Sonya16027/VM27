/**
 * ArrayOfPolicyOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfPolicyOption implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.PolicyOption[] policyOption;

	public ArrayOfPolicyOption() {
	}

	public ArrayOfPolicyOption(com.vmware.vim25.PolicyOption[] policyOption) {
		this.policyOption = policyOption;
	}

	/**
	 * Gets the policyOption value for this ArrayOfPolicyOption.
	 * 
	 * @return policyOption
	 */
	public com.vmware.vim25.PolicyOption[] getPolicyOption() {
		return policyOption;
	}

	/**
	 * Sets the policyOption value for this ArrayOfPolicyOption.
	 * 
	 * @param policyOption
	 */
	public void setPolicyOption(com.vmware.vim25.PolicyOption[] policyOption) {
		this.policyOption = policyOption;
	}

	public com.vmware.vim25.PolicyOption getPolicyOption(int i) {
		return this.policyOption[i];
	}

	public void setPolicyOption(int i, com.vmware.vim25.PolicyOption _value) {
		this.policyOption[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfPolicyOption)) {
			return false;
		}
		ArrayOfPolicyOption other = (ArrayOfPolicyOption) obj;
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
		_equals = true && ((this.policyOption == null && other
				.getPolicyOption() == null) || (this.policyOption != null && java.util.Arrays
				.equals(this.policyOption, other.getPolicyOption())));
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
		if (getPolicyOption() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPolicyOption()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPolicyOption(), i);
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
			ArrayOfPolicyOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfPolicyOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("policyOption");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"PolicyOption"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PolicyOption"));
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
