/**
 * ArrayOfIpPoolAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfIpPoolAssociation implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.IpPoolAssociation[] ipPoolAssociation;

	public ArrayOfIpPoolAssociation() {
	}

	public ArrayOfIpPoolAssociation(
			com.vmware.vim25.IpPoolAssociation[] ipPoolAssociation) {
		this.ipPoolAssociation = ipPoolAssociation;
	}

	/**
	 * Gets the ipPoolAssociation value for this ArrayOfIpPoolAssociation.
	 * 
	 * @return ipPoolAssociation
	 */
	public com.vmware.vim25.IpPoolAssociation[] getIpPoolAssociation() {
		return ipPoolAssociation;
	}

	/**
	 * Sets the ipPoolAssociation value for this ArrayOfIpPoolAssociation.
	 * 
	 * @param ipPoolAssociation
	 */
	public void setIpPoolAssociation(
			com.vmware.vim25.IpPoolAssociation[] ipPoolAssociation) {
		this.ipPoolAssociation = ipPoolAssociation;
	}

	public com.vmware.vim25.IpPoolAssociation getIpPoolAssociation(int i) {
		return this.ipPoolAssociation[i];
	}

	public void setIpPoolAssociation(int i,
			com.vmware.vim25.IpPoolAssociation _value) {
		this.ipPoolAssociation[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfIpPoolAssociation)) {
			return false;
		}
		ArrayOfIpPoolAssociation other = (ArrayOfIpPoolAssociation) obj;
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
		_equals = true && ((this.ipPoolAssociation == null && other
				.getIpPoolAssociation() == null) || (this.ipPoolAssociation != null && java.util.Arrays
				.equals(this.ipPoolAssociation, other.getIpPoolAssociation())));
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
		if (getIpPoolAssociation() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getIpPoolAssociation()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getIpPoolAssociation(), i);
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
			ArrayOfIpPoolAssociation.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfIpPoolAssociation"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipPoolAssociation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"IpPoolAssociation"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IpPoolAssociation"));
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
