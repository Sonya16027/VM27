/**
 * DVSNameArrayUplinkPortPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVSNameArrayUplinkPortPolicy extends
		com.vmware.vim25.DVSUplinkPortPolicy implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String[] uplinkPortName;

	public DVSNameArrayUplinkPortPolicy() {
	}

	public DVSNameArrayUplinkPortPolicy(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String[] uplinkPortName) {
		super(dynamicType, dynamicProperty);
		this.uplinkPortName = uplinkPortName;
	}

	/**
	 * Gets the uplinkPortName value for this DVSNameArrayUplinkPortPolicy.
	 * 
	 * @return uplinkPortName
	 */
	public java.lang.String[] getUplinkPortName() {
		return uplinkPortName;
	}

	/**
	 * Sets the uplinkPortName value for this DVSNameArrayUplinkPortPolicy.
	 * 
	 * @param uplinkPortName
	 */
	public void setUplinkPortName(java.lang.String[] uplinkPortName) {
		this.uplinkPortName = uplinkPortName;
	}

	public java.lang.String getUplinkPortName(int i) {
		return this.uplinkPortName[i];
	}

	public void setUplinkPortName(int i, java.lang.String _value) {
		this.uplinkPortName[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DVSNameArrayUplinkPortPolicy)) {
			return false;
		}
		DVSNameArrayUplinkPortPolicy other = (DVSNameArrayUplinkPortPolicy) obj;
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
				&& ((this.uplinkPortName == null && other.getUplinkPortName() == null) || (this.uplinkPortName != null && java.util.Arrays
						.equals(this.uplinkPortName, other.getUplinkPortName())));
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
		if (getUplinkPortName() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getUplinkPortName()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getUplinkPortName(), i);
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
			DVSNameArrayUplinkPortPolicy.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVSNameArrayUplinkPortPolicy"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uplinkPortName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"uplinkPortName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
