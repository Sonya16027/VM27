/**
 * ArrayOfHostDiagnosticPartitionCreateOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostDiagnosticPartitionCreateOption implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostDiagnosticPartitionCreateOption[] hostDiagnosticPartitionCreateOption;

	public ArrayOfHostDiagnosticPartitionCreateOption() {
	}

	public ArrayOfHostDiagnosticPartitionCreateOption(
			com.vmware.vim25.HostDiagnosticPartitionCreateOption[] hostDiagnosticPartitionCreateOption) {
		this.hostDiagnosticPartitionCreateOption = hostDiagnosticPartitionCreateOption;
	}

	/**
	 * Gets the hostDiagnosticPartitionCreateOption value for this
	 * ArrayOfHostDiagnosticPartitionCreateOption.
	 * 
	 * @return hostDiagnosticPartitionCreateOption
	 */
	public com.vmware.vim25.HostDiagnosticPartitionCreateOption[] getHostDiagnosticPartitionCreateOption() {
		return hostDiagnosticPartitionCreateOption;
	}

	/**
	 * Sets the hostDiagnosticPartitionCreateOption value for this
	 * ArrayOfHostDiagnosticPartitionCreateOption.
	 * 
	 * @param hostDiagnosticPartitionCreateOption
	 */
	public void setHostDiagnosticPartitionCreateOption(
			com.vmware.vim25.HostDiagnosticPartitionCreateOption[] hostDiagnosticPartitionCreateOption) {
		this.hostDiagnosticPartitionCreateOption = hostDiagnosticPartitionCreateOption;
	}

	public com.vmware.vim25.HostDiagnosticPartitionCreateOption getHostDiagnosticPartitionCreateOption(
			int i) {
		return this.hostDiagnosticPartitionCreateOption[i];
	}

	public void setHostDiagnosticPartitionCreateOption(int i,
			com.vmware.vim25.HostDiagnosticPartitionCreateOption _value) {
		this.hostDiagnosticPartitionCreateOption[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostDiagnosticPartitionCreateOption)) {
			return false;
		}
		ArrayOfHostDiagnosticPartitionCreateOption other = (ArrayOfHostDiagnosticPartitionCreateOption) obj;
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
		_equals = true && ((this.hostDiagnosticPartitionCreateOption == null && other
				.getHostDiagnosticPartitionCreateOption() == null) || (this.hostDiagnosticPartitionCreateOption != null && java.util.Arrays
				.equals(this.hostDiagnosticPartitionCreateOption, other
						.getHostDiagnosticPartitionCreateOption())));
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
		if (getHostDiagnosticPartitionCreateOption() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostDiagnosticPartitionCreateOption()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostDiagnosticPartitionCreateOption(), i);
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
			ArrayOfHostDiagnosticPartitionCreateOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostDiagnosticPartitionCreateOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostDiagnosticPartitionCreateOption");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostDiagnosticPartitionCreateOption"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDiagnosticPartitionCreateOption"));
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
