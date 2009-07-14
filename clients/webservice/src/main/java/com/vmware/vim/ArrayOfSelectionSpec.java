/**
 * ArrayOfSelectionSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfSelectionSpec implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.SelectionSpec[] selectionSpec;

	public ArrayOfSelectionSpec() {
	}

	public ArrayOfSelectionSpec(com.vmware.vim.SelectionSpec[] selectionSpec) {
		this.selectionSpec = selectionSpec;
	}

	/**
	 * Gets the selectionSpec value for this ArrayOfSelectionSpec.
	 * 
	 * @return selectionSpec
	 */
	public com.vmware.vim.SelectionSpec[] getSelectionSpec() {
		return selectionSpec;
	}

	/**
	 * Sets the selectionSpec value for this ArrayOfSelectionSpec.
	 * 
	 * @param selectionSpec
	 */
	public void setSelectionSpec(com.vmware.vim.SelectionSpec[] selectionSpec) {
		this.selectionSpec = selectionSpec;
	}

	public com.vmware.vim.SelectionSpec getSelectionSpec(int i) {
		return this.selectionSpec[i];
	}

	public void setSelectionSpec(int i, com.vmware.vim.SelectionSpec _value) {
		this.selectionSpec[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfSelectionSpec)) {
			return false;
		}
		ArrayOfSelectionSpec other = (ArrayOfSelectionSpec) obj;
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
		_equals = true && ((this.selectionSpec == null && other
				.getSelectionSpec() == null) || (this.selectionSpec != null && java.util.Arrays
				.equals(this.selectionSpec, other.getSelectionSpec())));
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
		if (getSelectionSpec() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSelectionSpec()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSelectionSpec(), i);
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
			ArrayOfSelectionSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfSelectionSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("selectionSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"SelectionSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"SelectionSpec"));
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
