/**
 * ArrayOfProfileUpdateFailedUpdateFailure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfProfileUpdateFailedUpdateFailure implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ProfileUpdateFailedUpdateFailure[] profileUpdateFailedUpdateFailure;

	public ArrayOfProfileUpdateFailedUpdateFailure() {
	}

	public ArrayOfProfileUpdateFailedUpdateFailure(
			com.vmware.vim25.ProfileUpdateFailedUpdateFailure[] profileUpdateFailedUpdateFailure) {
		this.profileUpdateFailedUpdateFailure = profileUpdateFailedUpdateFailure;
	}

	/**
	 * Gets the profileUpdateFailedUpdateFailure value for this
	 * ArrayOfProfileUpdateFailedUpdateFailure.
	 * 
	 * @return profileUpdateFailedUpdateFailure
	 */
	public com.vmware.vim25.ProfileUpdateFailedUpdateFailure[] getProfileUpdateFailedUpdateFailure() {
		return profileUpdateFailedUpdateFailure;
	}

	/**
	 * Sets the profileUpdateFailedUpdateFailure value for this
	 * ArrayOfProfileUpdateFailedUpdateFailure.
	 * 
	 * @param profileUpdateFailedUpdateFailure
	 */
	public void setProfileUpdateFailedUpdateFailure(
			com.vmware.vim25.ProfileUpdateFailedUpdateFailure[] profileUpdateFailedUpdateFailure) {
		this.profileUpdateFailedUpdateFailure = profileUpdateFailedUpdateFailure;
	}

	public com.vmware.vim25.ProfileUpdateFailedUpdateFailure getProfileUpdateFailedUpdateFailure(
			int i) {
		return this.profileUpdateFailedUpdateFailure[i];
	}

	public void setProfileUpdateFailedUpdateFailure(int i,
			com.vmware.vim25.ProfileUpdateFailedUpdateFailure _value) {
		this.profileUpdateFailedUpdateFailure[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfProfileUpdateFailedUpdateFailure)) {
			return false;
		}
		ArrayOfProfileUpdateFailedUpdateFailure other = (ArrayOfProfileUpdateFailedUpdateFailure) obj;
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
		_equals = true && ((this.profileUpdateFailedUpdateFailure == null && other
				.getProfileUpdateFailedUpdateFailure() == null) || (this.profileUpdateFailedUpdateFailure != null && java.util.Arrays
				.equals(this.profileUpdateFailedUpdateFailure, other
						.getProfileUpdateFailedUpdateFailure())));
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
		if (getProfileUpdateFailedUpdateFailure() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getProfileUpdateFailedUpdateFailure()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getProfileUpdateFailedUpdateFailure(), i);
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
			ArrayOfProfileUpdateFailedUpdateFailure.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfProfileUpdateFailedUpdateFailure"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("profileUpdateFailedUpdateFailure");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ProfileUpdateFailedUpdateFailure"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfileUpdateFailedUpdateFailure"));
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
