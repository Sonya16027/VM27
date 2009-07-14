/**
 * PatchBinariesNotFound.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PatchBinariesNotFound extends com.vmware.vim25.VimFault implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String patchID;

	private java.lang.String[] binary;

	public PatchBinariesNotFound() {
	}

	public PatchBinariesNotFound(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.LocalizedMethodFault faultCause,
			com.vmware.vim25.LocalizableMessage[] faultMessage,
			java.lang.String patchID, java.lang.String[] binary) {
		super(dynamicType, dynamicProperty, faultCause, faultMessage);
		this.patchID = patchID;
		this.binary = binary;
	}

	/**
	 * Gets the patchID value for this PatchBinariesNotFound.
	 * 
	 * @return patchID
	 */
	public java.lang.String getPatchID() {
		return patchID;
	}

	/**
	 * Sets the patchID value for this PatchBinariesNotFound.
	 * 
	 * @param patchID
	 */
	public void setPatchID(java.lang.String patchID) {
		this.patchID = patchID;
	}

	/**
	 * Gets the binary value for this PatchBinariesNotFound.
	 * 
	 * @return binary
	 */
	public java.lang.String[] getBinary() {
		return binary;
	}

	/**
	 * Sets the binary value for this PatchBinariesNotFound.
	 * 
	 * @param binary
	 */
	public void setBinary(java.lang.String[] binary) {
		this.binary = binary;
	}

	public java.lang.String getBinary(int i) {
		return this.binary[i];
	}

	public void setBinary(int i, java.lang.String _value) {
		this.binary[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PatchBinariesNotFound)) {
			return false;
		}
		PatchBinariesNotFound other = (PatchBinariesNotFound) obj;
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
		_equals = super.equals(obj)
				&& ((this.patchID == null && other.getPatchID() == null) || (this.patchID != null && this.patchID
						.equals(other.getPatchID())))
				&& ((this.binary == null && other.getBinary() == null) || (this.binary != null && java.util.Arrays
						.equals(this.binary, other.getBinary())));
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
		if (getPatchID() != null) {
			_hashCode += getPatchID().hashCode();
		}
		if (getBinary() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getBinary()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getBinary(),
						i);
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
			PatchBinariesNotFound.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PatchBinariesNotFound"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("patchID");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"patchID"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("binary");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"binary"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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

	/**
	 * Writes the exception data to the faultDetails
	 */
	@Override
	public void writeDetails(javax.xml.namespace.QName qname,
			org.apache.axis.encoding.SerializationContext context)
			throws java.io.IOException {
		context.serialize(qname, null, this);
	}
}
