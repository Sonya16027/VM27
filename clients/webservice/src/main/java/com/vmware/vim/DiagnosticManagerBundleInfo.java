/**
 * DiagnosticManagerBundleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class DiagnosticManagerBundleInfo extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference system;

	private java.lang.String url;

	public DiagnosticManagerBundleInfo() {
	}

	public DiagnosticManagerBundleInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.ManagedObjectReference system, java.lang.String url) {
		super(dynamicType, dynamicProperty);
		this.system = system;
		this.url = url;
	}

	/**
	 * Gets the system value for this DiagnosticManagerBundleInfo.
	 * 
	 * @return system
	 */
	public com.vmware.vim.ManagedObjectReference getSystem() {
		return system;
	}

	/**
	 * Sets the system value for this DiagnosticManagerBundleInfo.
	 * 
	 * @param system
	 */
	public void setSystem(com.vmware.vim.ManagedObjectReference system) {
		this.system = system;
	}

	/**
	 * Gets the url value for this DiagnosticManagerBundleInfo.
	 * 
	 * @return url
	 */
	public java.lang.String getUrl() {
		return url;
	}

	/**
	 * Sets the url value for this DiagnosticManagerBundleInfo.
	 * 
	 * @param url
	 */
	public void setUrl(java.lang.String url) {
		this.url = url;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DiagnosticManagerBundleInfo)) {
			return false;
		}
		DiagnosticManagerBundleInfo other = (DiagnosticManagerBundleInfo) obj;
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
				&& ((this.system == null && other.getSystem() == null) || (this.system != null && this.system
						.equals(other.getSystem())))
				&& ((this.url == null && other.getUrl() == null) || (this.url != null && this.url
						.equals(other.getUrl())));
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
		if (getSystem() != null) {
			_hashCode += getSystem().hashCode();
		}
		if (getUrl() != null) {
			_hashCode += getUrl().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DiagnosticManagerBundleInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"DiagnosticManagerBundleInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("system");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "system"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("url");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "url"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
