/**
 * ArrayOfObjectUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfObjectUpdate implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.ObjectUpdate[] objectUpdate;

	public ArrayOfObjectUpdate() {
	}

	public ArrayOfObjectUpdate(com.vmware.vim.ObjectUpdate[] objectUpdate) {
		this.objectUpdate = objectUpdate;
	}

	/**
	 * Gets the objectUpdate value for this ArrayOfObjectUpdate.
	 * 
	 * @return objectUpdate
	 */
	public com.vmware.vim.ObjectUpdate[] getObjectUpdate() {
		return objectUpdate;
	}

	/**
	 * Sets the objectUpdate value for this ArrayOfObjectUpdate.
	 * 
	 * @param objectUpdate
	 */
	public void setObjectUpdate(com.vmware.vim.ObjectUpdate[] objectUpdate) {
		this.objectUpdate = objectUpdate;
	}

	public com.vmware.vim.ObjectUpdate getObjectUpdate(int i) {
		return this.objectUpdate[i];
	}

	public void setObjectUpdate(int i, com.vmware.vim.ObjectUpdate _value) {
		this.objectUpdate[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfObjectUpdate)) {
			return false;
		}
		ArrayOfObjectUpdate other = (ArrayOfObjectUpdate) obj;
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
		_equals = true && ((this.objectUpdate == null && other
				.getObjectUpdate() == null) || (this.objectUpdate != null && java.util.Arrays
				.equals(this.objectUpdate, other.getObjectUpdate())));
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
		if (getObjectUpdate() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getObjectUpdate()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getObjectUpdate(), i);
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
			ArrayOfObjectUpdate.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfObjectUpdate"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("objectUpdate");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"ObjectUpdate"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ObjectUpdate"));
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
