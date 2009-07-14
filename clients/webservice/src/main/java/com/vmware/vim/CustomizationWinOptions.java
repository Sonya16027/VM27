/**
 * CustomizationWinOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class CustomizationWinOptions extends
		com.vmware.vim.CustomizationOptions implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean changeSID;

	private boolean deleteAccounts;

	public CustomizationWinOptions() {
	}

	public CustomizationWinOptions(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			boolean changeSID, boolean deleteAccounts) {
		super(dynamicType, dynamicProperty);
		this.changeSID = changeSID;
		this.deleteAccounts = deleteAccounts;
	}

	/**
	 * Gets the changeSID value for this CustomizationWinOptions.
	 * 
	 * @return changeSID
	 */
	public boolean isChangeSID() {
		return changeSID;
	}

	/**
	 * Sets the changeSID value for this CustomizationWinOptions.
	 * 
	 * @param changeSID
	 */
	public void setChangeSID(boolean changeSID) {
		this.changeSID = changeSID;
	}

	/**
	 * Gets the deleteAccounts value for this CustomizationWinOptions.
	 * 
	 * @return deleteAccounts
	 */
	public boolean isDeleteAccounts() {
		return deleteAccounts;
	}

	/**
	 * Sets the deleteAccounts value for this CustomizationWinOptions.
	 * 
	 * @param deleteAccounts
	 */
	public void setDeleteAccounts(boolean deleteAccounts) {
		this.deleteAccounts = deleteAccounts;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CustomizationWinOptions)) {
			return false;
		}
		CustomizationWinOptions other = (CustomizationWinOptions) obj;
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
		_equals = super.equals(obj) && this.changeSID == other.isChangeSID()
				&& this.deleteAccounts == other.isDeleteAccounts();
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
		int _hashCode = super.hashCode();
		_hashCode += (isChangeSID() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isDeleteAccounts() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CustomizationWinOptions.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"CustomizationWinOptions"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("changeSID");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"changeSID"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deleteAccounts");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"deleteAccounts"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
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
