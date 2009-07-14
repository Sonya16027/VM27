/**
 * ArrayOfKernelModuleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfKernelModuleInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.KernelModuleInfo[] kernelModuleInfo;

	public ArrayOfKernelModuleInfo() {
	}

	public ArrayOfKernelModuleInfo(
			com.vmware.vim25.KernelModuleInfo[] kernelModuleInfo) {
		this.kernelModuleInfo = kernelModuleInfo;
	}

	/**
	 * Gets the kernelModuleInfo value for this ArrayOfKernelModuleInfo.
	 * 
	 * @return kernelModuleInfo
	 */
	public com.vmware.vim25.KernelModuleInfo[] getKernelModuleInfo() {
		return kernelModuleInfo;
	}

	/**
	 * Sets the kernelModuleInfo value for this ArrayOfKernelModuleInfo.
	 * 
	 * @param kernelModuleInfo
	 */
	public void setKernelModuleInfo(
			com.vmware.vim25.KernelModuleInfo[] kernelModuleInfo) {
		this.kernelModuleInfo = kernelModuleInfo;
	}

	public com.vmware.vim25.KernelModuleInfo getKernelModuleInfo(int i) {
		return this.kernelModuleInfo[i];
	}

	public void setKernelModuleInfo(int i,
			com.vmware.vim25.KernelModuleInfo _value) {
		this.kernelModuleInfo[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfKernelModuleInfo)) {
			return false;
		}
		ArrayOfKernelModuleInfo other = (ArrayOfKernelModuleInfo) obj;
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
		_equals = true && ((this.kernelModuleInfo == null && other
				.getKernelModuleInfo() == null) || (this.kernelModuleInfo != null && java.util.Arrays
				.equals(this.kernelModuleInfo, other.getKernelModuleInfo())));
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
		if (getKernelModuleInfo() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getKernelModuleInfo()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getKernelModuleInfo(), i);
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
			ArrayOfKernelModuleInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfKernelModuleInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("kernelModuleInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"KernelModuleInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KernelModuleInfo"));
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
