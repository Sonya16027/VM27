/**
 * ArrayOfHostVmfsRescanResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostVmfsRescanResult implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostVmfsRescanResult[] hostVmfsRescanResult;

	public ArrayOfHostVmfsRescanResult() {
	}

	public ArrayOfHostVmfsRescanResult(
			com.vmware.vim25.HostVmfsRescanResult[] hostVmfsRescanResult) {
		this.hostVmfsRescanResult = hostVmfsRescanResult;
	}

	/**
	 * Gets the hostVmfsRescanResult value for this ArrayOfHostVmfsRescanResult.
	 * 
	 * @return hostVmfsRescanResult
	 */
	public com.vmware.vim25.HostVmfsRescanResult[] getHostVmfsRescanResult() {
		return hostVmfsRescanResult;
	}

	/**
	 * Sets the hostVmfsRescanResult value for this ArrayOfHostVmfsRescanResult.
	 * 
	 * @param hostVmfsRescanResult
	 */
	public void setHostVmfsRescanResult(
			com.vmware.vim25.HostVmfsRescanResult[] hostVmfsRescanResult) {
		this.hostVmfsRescanResult = hostVmfsRescanResult;
	}

	public com.vmware.vim25.HostVmfsRescanResult getHostVmfsRescanResult(int i) {
		return this.hostVmfsRescanResult[i];
	}

	public void setHostVmfsRescanResult(int i,
			com.vmware.vim25.HostVmfsRescanResult _value) {
		this.hostVmfsRescanResult[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostVmfsRescanResult)) {
			return false;
		}
		ArrayOfHostVmfsRescanResult other = (ArrayOfHostVmfsRescanResult) obj;
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
		_equals = true && ((this.hostVmfsRescanResult == null && other
				.getHostVmfsRescanResult() == null) || (this.hostVmfsRescanResult != null && java.util.Arrays
				.equals(this.hostVmfsRescanResult, other
						.getHostVmfsRescanResult())));
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
		if (getHostVmfsRescanResult() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostVmfsRescanResult()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostVmfsRescanResult(), i);
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
			ArrayOfHostVmfsRescanResult.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostVmfsRescanResult"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostVmfsRescanResult");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostVmfsRescanResult"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostVmfsRescanResult"));
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
