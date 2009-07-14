/**
 * CustomizationGlobalIPSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CustomizationGlobalIPSettings extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String[] dnsSuffixList;

	private java.lang.String[] dnsServerList;

	public CustomizationGlobalIPSettings() {
	}

	public CustomizationGlobalIPSettings(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String[] dnsSuffixList, java.lang.String[] dnsServerList) {
		super(dynamicType, dynamicProperty);
		this.dnsSuffixList = dnsSuffixList;
		this.dnsServerList = dnsServerList;
	}

	/**
	 * Gets the dnsSuffixList value for this CustomizationGlobalIPSettings.
	 * 
	 * @return dnsSuffixList
	 */
	public java.lang.String[] getDnsSuffixList() {
		return dnsSuffixList;
	}

	/**
	 * Sets the dnsSuffixList value for this CustomizationGlobalIPSettings.
	 * 
	 * @param dnsSuffixList
	 */
	public void setDnsSuffixList(java.lang.String[] dnsSuffixList) {
		this.dnsSuffixList = dnsSuffixList;
	}

	public java.lang.String getDnsSuffixList(int i) {
		return this.dnsSuffixList[i];
	}

	public void setDnsSuffixList(int i, java.lang.String _value) {
		this.dnsSuffixList[i] = _value;
	}

	/**
	 * Gets the dnsServerList value for this CustomizationGlobalIPSettings.
	 * 
	 * @return dnsServerList
	 */
	public java.lang.String[] getDnsServerList() {
		return dnsServerList;
	}

	/**
	 * Sets the dnsServerList value for this CustomizationGlobalIPSettings.
	 * 
	 * @param dnsServerList
	 */
	public void setDnsServerList(java.lang.String[] dnsServerList) {
		this.dnsServerList = dnsServerList;
	}

	public java.lang.String getDnsServerList(int i) {
		return this.dnsServerList[i];
	}

	public void setDnsServerList(int i, java.lang.String _value) {
		this.dnsServerList[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CustomizationGlobalIPSettings)) {
			return false;
		}
		CustomizationGlobalIPSettings other = (CustomizationGlobalIPSettings) obj;
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
				&& ((this.dnsSuffixList == null && other.getDnsSuffixList() == null) || (this.dnsSuffixList != null && java.util.Arrays
						.equals(this.dnsSuffixList, other.getDnsSuffixList())))
				&& ((this.dnsServerList == null && other.getDnsServerList() == null) || (this.dnsServerList != null && java.util.Arrays
						.equals(this.dnsServerList, other.getDnsServerList())));
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
		if (getDnsSuffixList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDnsSuffixList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDnsSuffixList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDnsServerList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDnsServerList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDnsServerList(), i);
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
			CustomizationGlobalIPSettings.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"CustomizationGlobalIPSettings"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dnsSuffixList");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dnsSuffixList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dnsServerList");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dnsServerList"));
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

}
