/**
 * ArrayOfProfileExpression.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfProfileExpression implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ProfileExpression[] profileExpression;

	public ArrayOfProfileExpression() {
	}

	public ArrayOfProfileExpression(
			com.vmware.vim25.ProfileExpression[] profileExpression) {
		this.profileExpression = profileExpression;
	}

	/**
	 * Gets the profileExpression value for this ArrayOfProfileExpression.
	 * 
	 * @return profileExpression
	 */
	public com.vmware.vim25.ProfileExpression[] getProfileExpression() {
		return profileExpression;
	}

	/**
	 * Sets the profileExpression value for this ArrayOfProfileExpression.
	 * 
	 * @param profileExpression
	 */
	public void setProfileExpression(
			com.vmware.vim25.ProfileExpression[] profileExpression) {
		this.profileExpression = profileExpression;
	}

	public com.vmware.vim25.ProfileExpression getProfileExpression(int i) {
		return this.profileExpression[i];
	}

	public void setProfileExpression(int i,
			com.vmware.vim25.ProfileExpression _value) {
		this.profileExpression[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfProfileExpression)) {
			return false;
		}
		ArrayOfProfileExpression other = (ArrayOfProfileExpression) obj;
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
		_equals = true && ((this.profileExpression == null && other
				.getProfileExpression() == null) || (this.profileExpression != null && java.util.Arrays
				.equals(this.profileExpression, other.getProfileExpression())));
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
		if (getProfileExpression() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getProfileExpression()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getProfileExpression(), i);
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
			ArrayOfProfileExpression.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfProfileExpression"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("profileExpression");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ProfileExpression"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfileExpression"));
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
