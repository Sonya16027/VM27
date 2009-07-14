/**
 * ArrayOfHostDiskMappingPartitionOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostDiskMappingPartitionOption implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.HostDiskMappingPartitionOption[] hostDiskMappingPartitionOption;

	public ArrayOfHostDiskMappingPartitionOption() {
	}

	public ArrayOfHostDiskMappingPartitionOption(
			com.vmware.vim.HostDiskMappingPartitionOption[] hostDiskMappingPartitionOption) {
		this.hostDiskMappingPartitionOption = hostDiskMappingPartitionOption;
	}

	/**
	 * Gets the hostDiskMappingPartitionOption value for this
	 * ArrayOfHostDiskMappingPartitionOption.
	 * 
	 * @return hostDiskMappingPartitionOption
	 */
	public com.vmware.vim.HostDiskMappingPartitionOption[] getHostDiskMappingPartitionOption() {
		return hostDiskMappingPartitionOption;
	}

	/**
	 * Sets the hostDiskMappingPartitionOption value for this
	 * ArrayOfHostDiskMappingPartitionOption.
	 * 
	 * @param hostDiskMappingPartitionOption
	 */
	public void setHostDiskMappingPartitionOption(
			com.vmware.vim.HostDiskMappingPartitionOption[] hostDiskMappingPartitionOption) {
		this.hostDiskMappingPartitionOption = hostDiskMappingPartitionOption;
	}

	public com.vmware.vim.HostDiskMappingPartitionOption getHostDiskMappingPartitionOption(
			int i) {
		return this.hostDiskMappingPartitionOption[i];
	}

	public void setHostDiskMappingPartitionOption(int i,
			com.vmware.vim.HostDiskMappingPartitionOption _value) {
		this.hostDiskMappingPartitionOption[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostDiskMappingPartitionOption)) {
			return false;
		}
		ArrayOfHostDiskMappingPartitionOption other = (ArrayOfHostDiskMappingPartitionOption) obj;
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
		_equals = true && ((this.hostDiskMappingPartitionOption == null && other
				.getHostDiskMappingPartitionOption() == null) || (this.hostDiskMappingPartitionOption != null && java.util.Arrays
				.equals(this.hostDiskMappingPartitionOption, other
						.getHostDiskMappingPartitionOption())));
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
		if (getHostDiskMappingPartitionOption() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostDiskMappingPartitionOption()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostDiskMappingPartitionOption(), i);
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
			ArrayOfHostDiskMappingPartitionOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfHostDiskMappingPartitionOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostDiskMappingPartitionOption");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"HostDiskMappingPartitionOption"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostDiskMappingPartitionOption"));
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
