/**
 * ArrayOfOvfFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfOvfFile implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.OvfFile[] ovfFile;

	public ArrayOfOvfFile() {
	}

	public ArrayOfOvfFile(com.vmware.vim25.OvfFile[] ovfFile) {
		this.ovfFile = ovfFile;
	}

	/**
	 * Gets the ovfFile value for this ArrayOfOvfFile.
	 * 
	 * @return ovfFile
	 */
	public com.vmware.vim25.OvfFile[] getOvfFile() {
		return ovfFile;
	}

	/**
	 * Sets the ovfFile value for this ArrayOfOvfFile.
	 * 
	 * @param ovfFile
	 */
	public void setOvfFile(com.vmware.vim25.OvfFile[] ovfFile) {
		this.ovfFile = ovfFile;
	}

	public com.vmware.vim25.OvfFile getOvfFile(int i) {
		return this.ovfFile[i];
	}

	public void setOvfFile(int i, com.vmware.vim25.OvfFile _value) {
		this.ovfFile[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfOvfFile)) {
			return false;
		}
		ArrayOfOvfFile other = (ArrayOfOvfFile) obj;
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
		_equals = true && ((this.ovfFile == null && other.getOvfFile() == null) || (this.ovfFile != null && java.util.Arrays
				.equals(this.ovfFile, other.getOvfFile())));
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
		if (getOvfFile() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getOvfFile()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getOvfFile(), i);
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
			ArrayOfOvfFile.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfOvfFile"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ovfFile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"OvfFile"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OvfFile"));
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
