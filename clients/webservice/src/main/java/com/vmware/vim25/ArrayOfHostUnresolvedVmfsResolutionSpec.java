/**
 * ArrayOfHostUnresolvedVmfsResolutionSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostUnresolvedVmfsResolutionSpec implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostUnresolvedVmfsResolutionSpec[] hostUnresolvedVmfsResolutionSpec;

	public ArrayOfHostUnresolvedVmfsResolutionSpec() {
	}

	public ArrayOfHostUnresolvedVmfsResolutionSpec(
			com.vmware.vim25.HostUnresolvedVmfsResolutionSpec[] hostUnresolvedVmfsResolutionSpec) {
		this.hostUnresolvedVmfsResolutionSpec = hostUnresolvedVmfsResolutionSpec;
	}

	/**
	 * Gets the hostUnresolvedVmfsResolutionSpec value for this
	 * ArrayOfHostUnresolvedVmfsResolutionSpec.
	 * 
	 * @return hostUnresolvedVmfsResolutionSpec
	 */
	public com.vmware.vim25.HostUnresolvedVmfsResolutionSpec[] getHostUnresolvedVmfsResolutionSpec() {
		return hostUnresolvedVmfsResolutionSpec;
	}

	/**
	 * Sets the hostUnresolvedVmfsResolutionSpec value for this
	 * ArrayOfHostUnresolvedVmfsResolutionSpec.
	 * 
	 * @param hostUnresolvedVmfsResolutionSpec
	 */
	public void setHostUnresolvedVmfsResolutionSpec(
			com.vmware.vim25.HostUnresolvedVmfsResolutionSpec[] hostUnresolvedVmfsResolutionSpec) {
		this.hostUnresolvedVmfsResolutionSpec = hostUnresolvedVmfsResolutionSpec;
	}

	public com.vmware.vim25.HostUnresolvedVmfsResolutionSpec getHostUnresolvedVmfsResolutionSpec(
			int i) {
		return this.hostUnresolvedVmfsResolutionSpec[i];
	}

	public void setHostUnresolvedVmfsResolutionSpec(int i,
			com.vmware.vim25.HostUnresolvedVmfsResolutionSpec _value) {
		this.hostUnresolvedVmfsResolutionSpec[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostUnresolvedVmfsResolutionSpec)) {
			return false;
		}
		ArrayOfHostUnresolvedVmfsResolutionSpec other = (ArrayOfHostUnresolvedVmfsResolutionSpec) obj;
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
		_equals = true && ((this.hostUnresolvedVmfsResolutionSpec == null && other
				.getHostUnresolvedVmfsResolutionSpec() == null) || (this.hostUnresolvedVmfsResolutionSpec != null && java.util.Arrays
				.equals(this.hostUnresolvedVmfsResolutionSpec, other
						.getHostUnresolvedVmfsResolutionSpec())));
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
		if (getHostUnresolvedVmfsResolutionSpec() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostUnresolvedVmfsResolutionSpec()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostUnresolvedVmfsResolutionSpec(), i);
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
			ArrayOfHostUnresolvedVmfsResolutionSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostUnresolvedVmfsResolutionSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostUnresolvedVmfsResolutionSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostUnresolvedVmfsResolutionSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostUnresolvedVmfsResolutionSpec"));
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
