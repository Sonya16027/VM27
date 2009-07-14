/**
 * ArrayOfHostUnresolvedVmfsResolutionResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostUnresolvedVmfsResolutionResult implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostUnresolvedVmfsResolutionResult[] hostUnresolvedVmfsResolutionResult;

	public ArrayOfHostUnresolvedVmfsResolutionResult() {
	}

	public ArrayOfHostUnresolvedVmfsResolutionResult(
			com.vmware.vim25.HostUnresolvedVmfsResolutionResult[] hostUnresolvedVmfsResolutionResult) {
		this.hostUnresolvedVmfsResolutionResult = hostUnresolvedVmfsResolutionResult;
	}

	/**
	 * Gets the hostUnresolvedVmfsResolutionResult value for this
	 * ArrayOfHostUnresolvedVmfsResolutionResult.
	 * 
	 * @return hostUnresolvedVmfsResolutionResult
	 */
	public com.vmware.vim25.HostUnresolvedVmfsResolutionResult[] getHostUnresolvedVmfsResolutionResult() {
		return hostUnresolvedVmfsResolutionResult;
	}

	/**
	 * Sets the hostUnresolvedVmfsResolutionResult value for this
	 * ArrayOfHostUnresolvedVmfsResolutionResult.
	 * 
	 * @param hostUnresolvedVmfsResolutionResult
	 */
	public void setHostUnresolvedVmfsResolutionResult(
			com.vmware.vim25.HostUnresolvedVmfsResolutionResult[] hostUnresolvedVmfsResolutionResult) {
		this.hostUnresolvedVmfsResolutionResult = hostUnresolvedVmfsResolutionResult;
	}

	public com.vmware.vim25.HostUnresolvedVmfsResolutionResult getHostUnresolvedVmfsResolutionResult(
			int i) {
		return this.hostUnresolvedVmfsResolutionResult[i];
	}

	public void setHostUnresolvedVmfsResolutionResult(int i,
			com.vmware.vim25.HostUnresolvedVmfsResolutionResult _value) {
		this.hostUnresolvedVmfsResolutionResult[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostUnresolvedVmfsResolutionResult)) {
			return false;
		}
		ArrayOfHostUnresolvedVmfsResolutionResult other = (ArrayOfHostUnresolvedVmfsResolutionResult) obj;
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
		_equals = true && ((this.hostUnresolvedVmfsResolutionResult == null && other
				.getHostUnresolvedVmfsResolutionResult() == null) || (this.hostUnresolvedVmfsResolutionResult != null && java.util.Arrays
				.equals(this.hostUnresolvedVmfsResolutionResult, other
						.getHostUnresolvedVmfsResolutionResult())));
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
		if (getHostUnresolvedVmfsResolutionResult() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostUnresolvedVmfsResolutionResult()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostUnresolvedVmfsResolutionResult(), i);
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
			ArrayOfHostUnresolvedVmfsResolutionResult.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostUnresolvedVmfsResolutionResult"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostUnresolvedVmfsResolutionResult");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostUnresolvedVmfsResolutionResult"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostUnresolvedVmfsResolutionResult"));
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
