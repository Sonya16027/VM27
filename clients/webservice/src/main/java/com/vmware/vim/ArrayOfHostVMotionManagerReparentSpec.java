/**
 * ArrayOfHostVMotionManagerReparentSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostVMotionManagerReparentSpec implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.HostVMotionManagerReparentSpec[] hostVMotionManagerReparentSpec;

	public ArrayOfHostVMotionManagerReparentSpec() {
	}

	public ArrayOfHostVMotionManagerReparentSpec(
			com.vmware.vim.HostVMotionManagerReparentSpec[] hostVMotionManagerReparentSpec) {
		this.hostVMotionManagerReparentSpec = hostVMotionManagerReparentSpec;
	}

	/**
	 * Gets the hostVMotionManagerReparentSpec value for this
	 * ArrayOfHostVMotionManagerReparentSpec.
	 * 
	 * @return hostVMotionManagerReparentSpec
	 */
	public com.vmware.vim.HostVMotionManagerReparentSpec[] getHostVMotionManagerReparentSpec() {
		return hostVMotionManagerReparentSpec;
	}

	/**
	 * Sets the hostVMotionManagerReparentSpec value for this
	 * ArrayOfHostVMotionManagerReparentSpec.
	 * 
	 * @param hostVMotionManagerReparentSpec
	 */
	public void setHostVMotionManagerReparentSpec(
			com.vmware.vim.HostVMotionManagerReparentSpec[] hostVMotionManagerReparentSpec) {
		this.hostVMotionManagerReparentSpec = hostVMotionManagerReparentSpec;
	}

	public com.vmware.vim.HostVMotionManagerReparentSpec getHostVMotionManagerReparentSpec(
			int i) {
		return this.hostVMotionManagerReparentSpec[i];
	}

	public void setHostVMotionManagerReparentSpec(int i,
			com.vmware.vim.HostVMotionManagerReparentSpec _value) {
		this.hostVMotionManagerReparentSpec[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostVMotionManagerReparentSpec)) {
			return false;
		}
		ArrayOfHostVMotionManagerReparentSpec other = (ArrayOfHostVMotionManagerReparentSpec) obj;
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
		_equals = true && ((this.hostVMotionManagerReparentSpec == null && other
				.getHostVMotionManagerReparentSpec() == null) || (this.hostVMotionManagerReparentSpec != null && java.util.Arrays
				.equals(this.hostVMotionManagerReparentSpec, other
						.getHostVMotionManagerReparentSpec())));
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
		if (getHostVMotionManagerReparentSpec() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostVMotionManagerReparentSpec()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostVMotionManagerReparentSpec(), i);
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
			ArrayOfHostVMotionManagerReparentSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfHostVMotionManagerReparentSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostVMotionManagerReparentSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"HostVMotionManagerReparentSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostVMotionManagerReparentSpec"));
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
