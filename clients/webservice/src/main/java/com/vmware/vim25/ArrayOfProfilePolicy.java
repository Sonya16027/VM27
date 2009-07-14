/**
 * ArrayOfProfilePolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfProfilePolicy implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ProfilePolicy[] profilePolicy;

	public ArrayOfProfilePolicy() {
	}

	public ArrayOfProfilePolicy(com.vmware.vim25.ProfilePolicy[] profilePolicy) {
		this.profilePolicy = profilePolicy;
	}

	/**
	 * Gets the profilePolicy value for this ArrayOfProfilePolicy.
	 * 
	 * @return profilePolicy
	 */
	public com.vmware.vim25.ProfilePolicy[] getProfilePolicy() {
		return profilePolicy;
	}

	/**
	 * Sets the profilePolicy value for this ArrayOfProfilePolicy.
	 * 
	 * @param profilePolicy
	 */
	public void setProfilePolicy(com.vmware.vim25.ProfilePolicy[] profilePolicy) {
		this.profilePolicy = profilePolicy;
	}

	public com.vmware.vim25.ProfilePolicy getProfilePolicy(int i) {
		return this.profilePolicy[i];
	}

	public void setProfilePolicy(int i, com.vmware.vim25.ProfilePolicy _value) {
		this.profilePolicy[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfProfilePolicy)) {
			return false;
		}
		ArrayOfProfilePolicy other = (ArrayOfProfilePolicy) obj;
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
		_equals = true && ((this.profilePolicy == null && other
				.getProfilePolicy() == null) || (this.profilePolicy != null && java.util.Arrays
				.equals(this.profilePolicy, other.getProfilePolicy())));
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
		if (getProfilePolicy() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getProfilePolicy()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getProfilePolicy(), i);
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
			ArrayOfProfilePolicy.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfProfilePolicy"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("profilePolicy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ProfilePolicy"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfilePolicy"));
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
