/**
 * HostConnectInfoNetworkInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostConnectInfoNetworkInfo extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.NetworkSummary summary;

	public HostConnectInfoNetworkInfo() {
	}

	public HostConnectInfoNetworkInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.NetworkSummary summary) {
		super(dynamicType, dynamicProperty);
		this.summary = summary;
	}

	/**
	 * Gets the summary value for this HostConnectInfoNetworkInfo.
	 * 
	 * @return summary
	 */
	public com.vmware.vim.NetworkSummary getSummary() {
		return summary;
	}

	/**
	 * Sets the summary value for this HostConnectInfoNetworkInfo.
	 * 
	 * @param summary
	 */
	public void setSummary(com.vmware.vim.NetworkSummary summary) {
		this.summary = summary;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostConnectInfoNetworkInfo)) {
			return false;
		}
		HostConnectInfoNetworkInfo other = (HostConnectInfoNetworkInfo) obj;
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
				&& ((this.summary == null && other.getSummary() == null) || (this.summary != null && this.summary
						.equals(other.getSummary())));
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
		if (getSummary() != null) {
			_hashCode += getSummary().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostConnectInfoNetworkInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostConnectInfoNetworkInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("summary");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"summary"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"NetworkSummary"));
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
