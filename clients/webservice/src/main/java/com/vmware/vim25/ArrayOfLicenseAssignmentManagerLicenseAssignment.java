/**
 * ArrayOfLicenseAssignmentManagerLicenseAssignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfLicenseAssignmentManagerLicenseAssignment implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.LicenseAssignmentManagerLicenseAssignment[] licenseAssignmentManagerLicenseAssignment;

	public ArrayOfLicenseAssignmentManagerLicenseAssignment() {
	}

	public ArrayOfLicenseAssignmentManagerLicenseAssignment(
			com.vmware.vim25.LicenseAssignmentManagerLicenseAssignment[] licenseAssignmentManagerLicenseAssignment) {
		this.licenseAssignmentManagerLicenseAssignment = licenseAssignmentManagerLicenseAssignment;
	}

	/**
	 * Gets the licenseAssignmentManagerLicenseAssignment value for this
	 * ArrayOfLicenseAssignmentManagerLicenseAssignment.
	 * 
	 * @return licenseAssignmentManagerLicenseAssignment
	 */
	public com.vmware.vim25.LicenseAssignmentManagerLicenseAssignment[] getLicenseAssignmentManagerLicenseAssignment() {
		return licenseAssignmentManagerLicenseAssignment;
	}

	/**
	 * Sets the licenseAssignmentManagerLicenseAssignment value for this
	 * ArrayOfLicenseAssignmentManagerLicenseAssignment.
	 * 
	 * @param licenseAssignmentManagerLicenseAssignment
	 */
	public void setLicenseAssignmentManagerLicenseAssignment(
			com.vmware.vim25.LicenseAssignmentManagerLicenseAssignment[] licenseAssignmentManagerLicenseAssignment) {
		this.licenseAssignmentManagerLicenseAssignment = licenseAssignmentManagerLicenseAssignment;
	}

	public com.vmware.vim25.LicenseAssignmentManagerLicenseAssignment getLicenseAssignmentManagerLicenseAssignment(
			int i) {
		return this.licenseAssignmentManagerLicenseAssignment[i];
	}

	public void setLicenseAssignmentManagerLicenseAssignment(int i,
			com.vmware.vim25.LicenseAssignmentManagerLicenseAssignment _value) {
		this.licenseAssignmentManagerLicenseAssignment[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfLicenseAssignmentManagerLicenseAssignment)) {
			return false;
		}
		ArrayOfLicenseAssignmentManagerLicenseAssignment other = (ArrayOfLicenseAssignmentManagerLicenseAssignment) obj;
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
		_equals = true && ((this.licenseAssignmentManagerLicenseAssignment == null && other
				.getLicenseAssignmentManagerLicenseAssignment() == null) || (this.licenseAssignmentManagerLicenseAssignment != null && java.util.Arrays
				.equals(this.licenseAssignmentManagerLicenseAssignment, other
						.getLicenseAssignmentManagerLicenseAssignment())));
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
		if (getLicenseAssignmentManagerLicenseAssignment() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getLicenseAssignmentManagerLicenseAssignment()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getLicenseAssignmentManagerLicenseAssignment(), i);
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
			ArrayOfLicenseAssignmentManagerLicenseAssignment.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfLicenseAssignmentManagerLicenseAssignment"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licenseAssignmentManagerLicenseAssignment");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"LicenseAssignmentManagerLicenseAssignment"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LicenseAssignmentManagerLicenseAssignment"));
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
