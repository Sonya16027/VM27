/**
 * ArrayOfOptionProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfOptionProfile implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.OptionProfile[] optionProfile;

	public ArrayOfOptionProfile() {
	}

	public ArrayOfOptionProfile(com.vmware.vim25.OptionProfile[] optionProfile) {
		this.optionProfile = optionProfile;
	}

	/**
	 * Gets the optionProfile value for this ArrayOfOptionProfile.
	 * 
	 * @return optionProfile
	 */
	public com.vmware.vim25.OptionProfile[] getOptionProfile() {
		return optionProfile;
	}

	/**
	 * Sets the optionProfile value for this ArrayOfOptionProfile.
	 * 
	 * @param optionProfile
	 */
	public void setOptionProfile(com.vmware.vim25.OptionProfile[] optionProfile) {
		this.optionProfile = optionProfile;
	}

	public com.vmware.vim25.OptionProfile getOptionProfile(int i) {
		return this.optionProfile[i];
	}

	public void setOptionProfile(int i, com.vmware.vim25.OptionProfile _value) {
		this.optionProfile[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfOptionProfile)) {
			return false;
		}
		ArrayOfOptionProfile other = (ArrayOfOptionProfile) obj;
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
		_equals = true && ((this.optionProfile == null && other
				.getOptionProfile() == null) || (this.optionProfile != null && java.util.Arrays
				.equals(this.optionProfile, other.getOptionProfile())));
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
		if (getOptionProfile() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getOptionProfile()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getOptionProfile(), i);
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
			ArrayOfOptionProfile.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfOptionProfile"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("optionProfile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"OptionProfile"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OptionProfile"));
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
