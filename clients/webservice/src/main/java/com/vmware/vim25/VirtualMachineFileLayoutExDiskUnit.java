/**
 * VirtualMachineFileLayoutExDiskUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineFileLayoutExDiskUnit extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int[] fileKey;

	public VirtualMachineFileLayoutExDiskUnit() {
	}

	public VirtualMachineFileLayoutExDiskUnit(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int[] fileKey) {
		super(dynamicType, dynamicProperty);
		this.fileKey = fileKey;
	}

	/**
	 * Gets the fileKey value for this VirtualMachineFileLayoutExDiskUnit.
	 * 
	 * @return fileKey
	 */
	public int[] getFileKey() {
		return fileKey;
	}

	/**
	 * Sets the fileKey value for this VirtualMachineFileLayoutExDiskUnit.
	 * 
	 * @param fileKey
	 */
	public void setFileKey(int[] fileKey) {
		this.fileKey = fileKey;
	}

	public int getFileKey(int i) {
		return this.fileKey[i];
	}

	public void setFileKey(int i, int _value) {
		this.fileKey[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineFileLayoutExDiskUnit)) {
			return false;
		}
		VirtualMachineFileLayoutExDiskUnit other = (VirtualMachineFileLayoutExDiskUnit) obj;
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
		_equals = super.equals(obj)
				&& ((this.fileKey == null && other.getFileKey() == null) || (this.fileKey != null && java.util.Arrays
						.equals(this.fileKey, other.getFileKey())));
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
		int _hashCode = super.hashCode();
		if (getFileKey() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getFileKey()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getFileKey(), i);
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
			VirtualMachineFileLayoutExDiskUnit.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineFileLayoutExDiskUnit"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fileKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"fileKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
