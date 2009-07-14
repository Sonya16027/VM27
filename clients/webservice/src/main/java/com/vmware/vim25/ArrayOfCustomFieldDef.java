/**
 * ArrayOfCustomFieldDef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfCustomFieldDef implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.CustomFieldDef[] customFieldDef;

	public ArrayOfCustomFieldDef() {
	}

	public ArrayOfCustomFieldDef(
			com.vmware.vim25.CustomFieldDef[] customFieldDef) {
		this.customFieldDef = customFieldDef;
	}

	/**
	 * Gets the customFieldDef value for this ArrayOfCustomFieldDef.
	 * 
	 * @return customFieldDef
	 */
	public com.vmware.vim25.CustomFieldDef[] getCustomFieldDef() {
		return customFieldDef;
	}

	/**
	 * Sets the customFieldDef value for this ArrayOfCustomFieldDef.
	 * 
	 * @param customFieldDef
	 */
	public void setCustomFieldDef(
			com.vmware.vim25.CustomFieldDef[] customFieldDef) {
		this.customFieldDef = customFieldDef;
	}

	public com.vmware.vim25.CustomFieldDef getCustomFieldDef(int i) {
		return this.customFieldDef[i];
	}

	public void setCustomFieldDef(int i, com.vmware.vim25.CustomFieldDef _value) {
		this.customFieldDef[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfCustomFieldDef)) {
			return false;
		}
		ArrayOfCustomFieldDef other = (ArrayOfCustomFieldDef) obj;
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
		_equals = true && ((this.customFieldDef == null && other
				.getCustomFieldDef() == null) || (this.customFieldDef != null && java.util.Arrays
				.equals(this.customFieldDef, other.getCustomFieldDef())));
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
		if (getCustomFieldDef() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getCustomFieldDef()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getCustomFieldDef(), i);
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
			ArrayOfCustomFieldDef.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfCustomFieldDef"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("customFieldDef");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"CustomFieldDef"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomFieldDef"));
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
