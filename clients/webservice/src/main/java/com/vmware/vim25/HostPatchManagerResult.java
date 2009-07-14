/**
 * HostPatchManagerResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostPatchManagerResult extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String version;

	private com.vmware.vim25.HostPatchManagerStatus[] status;

	private java.lang.String xmlResult;

	public HostPatchManagerResult() {
	}

	public HostPatchManagerResult(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String version,
			com.vmware.vim25.HostPatchManagerStatus[] status,
			java.lang.String xmlResult) {
		super(dynamicType, dynamicProperty);
		this.version = version;
		this.status = status;
		this.xmlResult = xmlResult;
	}

	/**
	 * Gets the version value for this HostPatchManagerResult.
	 * 
	 * @return version
	 */
	public java.lang.String getVersion() {
		return version;
	}

	/**
	 * Sets the version value for this HostPatchManagerResult.
	 * 
	 * @param version
	 */
	public void setVersion(java.lang.String version) {
		this.version = version;
	}

	/**
	 * Gets the status value for this HostPatchManagerResult.
	 * 
	 * @return status
	 */
	public com.vmware.vim25.HostPatchManagerStatus[] getStatus() {
		return status;
	}

	/**
	 * Sets the status value for this HostPatchManagerResult.
	 * 
	 * @param status
	 */
	public void setStatus(com.vmware.vim25.HostPatchManagerStatus[] status) {
		this.status = status;
	}

	public com.vmware.vim25.HostPatchManagerStatus getStatus(int i) {
		return this.status[i];
	}

	public void setStatus(int i, com.vmware.vim25.HostPatchManagerStatus _value) {
		this.status[i] = _value;
	}

	/**
	 * Gets the xmlResult value for this HostPatchManagerResult.
	 * 
	 * @return xmlResult
	 */
	public java.lang.String getXmlResult() {
		return xmlResult;
	}

	/**
	 * Sets the xmlResult value for this HostPatchManagerResult.
	 * 
	 * @param xmlResult
	 */
	public void setXmlResult(java.lang.String xmlResult) {
		this.xmlResult = xmlResult;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostPatchManagerResult)) {
			return false;
		}
		HostPatchManagerResult other = (HostPatchManagerResult) obj;
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
				&& ((this.version == null && other.getVersion() == null) || (this.version != null && this.version
						.equals(other.getVersion())))
				&& ((this.status == null && other.getStatus() == null) || (this.status != null && java.util.Arrays
						.equals(this.status, other.getStatus())))
				&& ((this.xmlResult == null && other.getXmlResult() == null) || (this.xmlResult != null && this.xmlResult
						.equals(other.getXmlResult())));
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
		if (getVersion() != null) {
			_hashCode += getVersion().hashCode();
		}
		if (getStatus() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getStatus()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getStatus(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getXmlResult() != null) {
			_hashCode += getXmlResult().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostPatchManagerResult.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPatchManagerResult"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("version");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"version"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("status");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"status"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPatchManagerStatus"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("xmlResult");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"xmlResult"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
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
