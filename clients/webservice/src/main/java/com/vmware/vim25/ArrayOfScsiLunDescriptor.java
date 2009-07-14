/**
 * ArrayOfScsiLunDescriptor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfScsiLunDescriptor implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ScsiLunDescriptor[] scsiLunDescriptor;

	public ArrayOfScsiLunDescriptor() {
	}

	public ArrayOfScsiLunDescriptor(
			com.vmware.vim25.ScsiLunDescriptor[] scsiLunDescriptor) {
		this.scsiLunDescriptor = scsiLunDescriptor;
	}

	/**
	 * Gets the scsiLunDescriptor value for this ArrayOfScsiLunDescriptor.
	 * 
	 * @return scsiLunDescriptor
	 */
	public com.vmware.vim25.ScsiLunDescriptor[] getScsiLunDescriptor() {
		return scsiLunDescriptor;
	}

	/**
	 * Sets the scsiLunDescriptor value for this ArrayOfScsiLunDescriptor.
	 * 
	 * @param scsiLunDescriptor
	 */
	public void setScsiLunDescriptor(
			com.vmware.vim25.ScsiLunDescriptor[] scsiLunDescriptor) {
		this.scsiLunDescriptor = scsiLunDescriptor;
	}

	public com.vmware.vim25.ScsiLunDescriptor getScsiLunDescriptor(int i) {
		return this.scsiLunDescriptor[i];
	}

	public void setScsiLunDescriptor(int i,
			com.vmware.vim25.ScsiLunDescriptor _value) {
		this.scsiLunDescriptor[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfScsiLunDescriptor)) {
			return false;
		}
		ArrayOfScsiLunDescriptor other = (ArrayOfScsiLunDescriptor) obj;
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
		_equals = true && ((this.scsiLunDescriptor == null && other
				.getScsiLunDescriptor() == null) || (this.scsiLunDescriptor != null && java.util.Arrays
				.equals(this.scsiLunDescriptor, other.getScsiLunDescriptor())));
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
		if (getScsiLunDescriptor() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getScsiLunDescriptor()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getScsiLunDescriptor(), i);
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
			ArrayOfScsiLunDescriptor.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfScsiLunDescriptor"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("scsiLunDescriptor");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ScsiLunDescriptor"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ScsiLunDescriptor"));
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
