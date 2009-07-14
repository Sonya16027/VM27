/**
 * ArrayOfFilterSpecConstraint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class ArrayOfFilterSpecConstraint implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.sms.FilterSpecConstraint[] filterSpecConstraint;

	public ArrayOfFilterSpecConstraint() {
	}

	public ArrayOfFilterSpecConstraint(
			com.vmware.vim.sms.FilterSpecConstraint[] filterSpecConstraint) {
		this.filterSpecConstraint = filterSpecConstraint;
	}

	/**
	 * Gets the filterSpecConstraint value for this ArrayOfFilterSpecConstraint.
	 * 
	 * @return filterSpecConstraint
	 */
	public com.vmware.vim.sms.FilterSpecConstraint[] getFilterSpecConstraint() {
		return filterSpecConstraint;
	}

	/**
	 * Sets the filterSpecConstraint value for this ArrayOfFilterSpecConstraint.
	 * 
	 * @param filterSpecConstraint
	 */
	public void setFilterSpecConstraint(
			com.vmware.vim.sms.FilterSpecConstraint[] filterSpecConstraint) {
		this.filterSpecConstraint = filterSpecConstraint;
	}

	public com.vmware.vim.sms.FilterSpecConstraint getFilterSpecConstraint(int i) {
		return this.filterSpecConstraint[i];
	}

	public void setFilterSpecConstraint(int i,
			com.vmware.vim.sms.FilterSpecConstraint _value) {
		this.filterSpecConstraint[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfFilterSpecConstraint)) {
			return false;
		}
		ArrayOfFilterSpecConstraint other = (ArrayOfFilterSpecConstraint) obj;
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
		_equals = true && ((this.filterSpecConstraint == null && other
				.getFilterSpecConstraint() == null) || (this.filterSpecConstraint != null && java.util.Arrays
				.equals(this.filterSpecConstraint, other
						.getFilterSpecConstraint())));
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
		if (getFilterSpecConstraint() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getFilterSpecConstraint()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getFilterSpecConstraint(), i);
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
			ArrayOfFilterSpecConstraint.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"ArrayOfFilterSpecConstraint"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("filterSpecConstraint");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1",
				"FilterSpecConstraint"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"FilterSpecConstraint"));
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
