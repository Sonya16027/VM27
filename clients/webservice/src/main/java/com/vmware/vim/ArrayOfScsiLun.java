/**
 * ArrayOfScsiLun.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfScsiLun implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.ScsiLun[] scsiLun;

	public ArrayOfScsiLun() {
	}

	public ArrayOfScsiLun(com.vmware.vim.ScsiLun[] scsiLun) {
		this.scsiLun = scsiLun;
	}

	/**
	 * Gets the scsiLun value for this ArrayOfScsiLun.
	 * 
	 * @return scsiLun
	 */
	public com.vmware.vim.ScsiLun[] getScsiLun() {
		return scsiLun;
	}

	/**
	 * Sets the scsiLun value for this ArrayOfScsiLun.
	 * 
	 * @param scsiLun
	 */
	public void setScsiLun(com.vmware.vim.ScsiLun[] scsiLun) {
		this.scsiLun = scsiLun;
	}

	public com.vmware.vim.ScsiLun getScsiLun(int i) {
		return this.scsiLun[i];
	}

	public void setScsiLun(int i, com.vmware.vim.ScsiLun _value) {
		this.scsiLun[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfScsiLun)) {
			return false;
		}
		ArrayOfScsiLun other = (ArrayOfScsiLun) obj;
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
		_equals = true && ((this.scsiLun == null && other.getScsiLun() == null) || (this.scsiLun != null && java.util.Arrays
				.equals(this.scsiLun, other.getScsiLun())));
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
		if (getScsiLun() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getScsiLun()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getScsiLun(), i);
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
			ArrayOfScsiLun.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfScsiLun"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("scsiLun");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"ScsiLun"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ScsiLun"));
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
