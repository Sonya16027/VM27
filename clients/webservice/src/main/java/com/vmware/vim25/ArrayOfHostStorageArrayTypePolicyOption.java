/**
 * ArrayOfHostStorageArrayTypePolicyOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostStorageArrayTypePolicyOption implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostStorageArrayTypePolicyOption[] hostStorageArrayTypePolicyOption;

	public ArrayOfHostStorageArrayTypePolicyOption() {
	}

	public ArrayOfHostStorageArrayTypePolicyOption(
			com.vmware.vim25.HostStorageArrayTypePolicyOption[] hostStorageArrayTypePolicyOption) {
		this.hostStorageArrayTypePolicyOption = hostStorageArrayTypePolicyOption;
	}

	/**
	 * Gets the hostStorageArrayTypePolicyOption value for this
	 * ArrayOfHostStorageArrayTypePolicyOption.
	 * 
	 * @return hostStorageArrayTypePolicyOption
	 */
	public com.vmware.vim25.HostStorageArrayTypePolicyOption[] getHostStorageArrayTypePolicyOption() {
		return hostStorageArrayTypePolicyOption;
	}

	/**
	 * Sets the hostStorageArrayTypePolicyOption value for this
	 * ArrayOfHostStorageArrayTypePolicyOption.
	 * 
	 * @param hostStorageArrayTypePolicyOption
	 */
	public void setHostStorageArrayTypePolicyOption(
			com.vmware.vim25.HostStorageArrayTypePolicyOption[] hostStorageArrayTypePolicyOption) {
		this.hostStorageArrayTypePolicyOption = hostStorageArrayTypePolicyOption;
	}

	public com.vmware.vim25.HostStorageArrayTypePolicyOption getHostStorageArrayTypePolicyOption(
			int i) {
		return this.hostStorageArrayTypePolicyOption[i];
	}

	public void setHostStorageArrayTypePolicyOption(int i,
			com.vmware.vim25.HostStorageArrayTypePolicyOption _value) {
		this.hostStorageArrayTypePolicyOption[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostStorageArrayTypePolicyOption)) {
			return false;
		}
		ArrayOfHostStorageArrayTypePolicyOption other = (ArrayOfHostStorageArrayTypePolicyOption) obj;
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
		_equals = true && ((this.hostStorageArrayTypePolicyOption == null && other
				.getHostStorageArrayTypePolicyOption() == null) || (this.hostStorageArrayTypePolicyOption != null && java.util.Arrays
				.equals(this.hostStorageArrayTypePolicyOption, other
						.getHostStorageArrayTypePolicyOption())));
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
		if (getHostStorageArrayTypePolicyOption() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostStorageArrayTypePolicyOption()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostStorageArrayTypePolicyOption(), i);
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
			ArrayOfHostStorageArrayTypePolicyOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostStorageArrayTypePolicyOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostStorageArrayTypePolicyOption");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostStorageArrayTypePolicyOption"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostStorageArrayTypePolicyOption"));
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
