/**
 * RelocateVM_TaskResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class RelocateVM_TaskResponse implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.ManagedObjectReference returnval;

	public RelocateVM_TaskResponse() {
	}

	public RelocateVM_TaskResponse(
			com.vmware.vim.ManagedObjectReference returnval) {
		this.returnval = returnval;
	}

	/**
	 * Gets the returnval value for this RelocateVM_TaskResponse.
	 * 
	 * @return returnval
	 */
	public com.vmware.vim.ManagedObjectReference getReturnval() {
		return returnval;
	}

	/**
	 * Sets the returnval value for this RelocateVM_TaskResponse.
	 * 
	 * @param returnval
	 */
	public void setReturnval(com.vmware.vim.ManagedObjectReference returnval) {
		this.returnval = returnval;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof RelocateVM_TaskResponse)) {
			return false;
		}
		RelocateVM_TaskResponse other = (RelocateVM_TaskResponse) obj;
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
		_equals = true && ((this.returnval == null && other.getReturnval() == null) || (this.returnval != null && this.returnval
				.equals(other.getReturnval())));
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
		if (getReturnval() != null) {
			_hashCode += getReturnval().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			RelocateVM_TaskResponse.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">RelocateVM_TaskResponse"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("returnval");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"returnval"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
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
