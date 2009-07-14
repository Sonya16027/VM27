/**
 * ArrayOfStaticRouteProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfStaticRouteProfile implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.StaticRouteProfile[] staticRouteProfile;

	public ArrayOfStaticRouteProfile() {
	}

	public ArrayOfStaticRouteProfile(
			com.vmware.vim25.StaticRouteProfile[] staticRouteProfile) {
		this.staticRouteProfile = staticRouteProfile;
	}

	/**
	 * Gets the staticRouteProfile value for this ArrayOfStaticRouteProfile.
	 * 
	 * @return staticRouteProfile
	 */
	public com.vmware.vim25.StaticRouteProfile[] getStaticRouteProfile() {
		return staticRouteProfile;
	}

	/**
	 * Sets the staticRouteProfile value for this ArrayOfStaticRouteProfile.
	 * 
	 * @param staticRouteProfile
	 */
	public void setStaticRouteProfile(
			com.vmware.vim25.StaticRouteProfile[] staticRouteProfile) {
		this.staticRouteProfile = staticRouteProfile;
	}

	public com.vmware.vim25.StaticRouteProfile getStaticRouteProfile(int i) {
		return this.staticRouteProfile[i];
	}

	public void setStaticRouteProfile(int i,
			com.vmware.vim25.StaticRouteProfile _value) {
		this.staticRouteProfile[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfStaticRouteProfile)) {
			return false;
		}
		ArrayOfStaticRouteProfile other = (ArrayOfStaticRouteProfile) obj;
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
		_equals = true && ((this.staticRouteProfile == null && other
				.getStaticRouteProfile() == null) || (this.staticRouteProfile != null && java.util.Arrays
				.equals(this.staticRouteProfile, other.getStaticRouteProfile())));
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
		if (getStaticRouteProfile() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getStaticRouteProfile()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getStaticRouteProfile(), i);
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
			ArrayOfStaticRouteProfile.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfStaticRouteProfile"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("staticRouteProfile");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"StaticRouteProfile"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"StaticRouteProfile"));
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
