/**
 * ArrayOfHostVMotionCompatibility.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostVMotionCompatibility implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.HostVMotionCompatibility[] hostVMotionCompatibility;

	public ArrayOfHostVMotionCompatibility() {
	}

	public ArrayOfHostVMotionCompatibility(
			com.vmware.vim.HostVMotionCompatibility[] hostVMotionCompatibility) {
		this.hostVMotionCompatibility = hostVMotionCompatibility;
	}

	/**
	 * Gets the hostVMotionCompatibility value for this
	 * ArrayOfHostVMotionCompatibility.
	 * 
	 * @return hostVMotionCompatibility
	 */
	public com.vmware.vim.HostVMotionCompatibility[] getHostVMotionCompatibility() {
		return hostVMotionCompatibility;
	}

	/**
	 * Sets the hostVMotionCompatibility value for this
	 * ArrayOfHostVMotionCompatibility.
	 * 
	 * @param hostVMotionCompatibility
	 */
	public void setHostVMotionCompatibility(
			com.vmware.vim.HostVMotionCompatibility[] hostVMotionCompatibility) {
		this.hostVMotionCompatibility = hostVMotionCompatibility;
	}

	public com.vmware.vim.HostVMotionCompatibility getHostVMotionCompatibility(
			int i) {
		return this.hostVMotionCompatibility[i];
	}

	public void setHostVMotionCompatibility(int i,
			com.vmware.vim.HostVMotionCompatibility _value) {
		this.hostVMotionCompatibility[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostVMotionCompatibility)) {
			return false;
		}
		ArrayOfHostVMotionCompatibility other = (ArrayOfHostVMotionCompatibility) obj;
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
		_equals = true && ((this.hostVMotionCompatibility == null && other
				.getHostVMotionCompatibility() == null) || (this.hostVMotionCompatibility != null && java.util.Arrays
				.equals(this.hostVMotionCompatibility, other
						.getHostVMotionCompatibility())));
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
		if (getHostVMotionCompatibility() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostVMotionCompatibility()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostVMotionCompatibility(), i);
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
			ArrayOfHostVMotionCompatibility.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfHostVMotionCompatibility"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostVMotionCompatibility");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"HostVMotionCompatibility"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostVMotionCompatibility"));
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
