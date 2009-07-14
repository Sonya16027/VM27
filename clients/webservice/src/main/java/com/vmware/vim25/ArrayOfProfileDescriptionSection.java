/**
 * ArrayOfProfileDescriptionSection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfProfileDescriptionSection implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ProfileDescriptionSection[] profileDescriptionSection;

	public ArrayOfProfileDescriptionSection() {
	}

	public ArrayOfProfileDescriptionSection(
			com.vmware.vim25.ProfileDescriptionSection[] profileDescriptionSection) {
		this.profileDescriptionSection = profileDescriptionSection;
	}

	/**
	 * Gets the profileDescriptionSection value for this
	 * ArrayOfProfileDescriptionSection.
	 * 
	 * @return profileDescriptionSection
	 */
	public com.vmware.vim25.ProfileDescriptionSection[] getProfileDescriptionSection() {
		return profileDescriptionSection;
	}

	/**
	 * Sets the profileDescriptionSection value for this
	 * ArrayOfProfileDescriptionSection.
	 * 
	 * @param profileDescriptionSection
	 */
	public void setProfileDescriptionSection(
			com.vmware.vim25.ProfileDescriptionSection[] profileDescriptionSection) {
		this.profileDescriptionSection = profileDescriptionSection;
	}

	public com.vmware.vim25.ProfileDescriptionSection getProfileDescriptionSection(
			int i) {
		return this.profileDescriptionSection[i];
	}

	public void setProfileDescriptionSection(int i,
			com.vmware.vim25.ProfileDescriptionSection _value) {
		this.profileDescriptionSection[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfProfileDescriptionSection)) {
			return false;
		}
		ArrayOfProfileDescriptionSection other = (ArrayOfProfileDescriptionSection) obj;
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
		_equals = true && ((this.profileDescriptionSection == null && other
				.getProfileDescriptionSection() == null) || (this.profileDescriptionSection != null && java.util.Arrays
				.equals(this.profileDescriptionSection, other
						.getProfileDescriptionSection())));
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
		if (getProfileDescriptionSection() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getProfileDescriptionSection()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getProfileDescriptionSection(), i);
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
			ArrayOfProfileDescriptionSection.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfProfileDescriptionSection"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("profileDescriptionSection");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ProfileDescriptionSection"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfileDescriptionSection"));
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
