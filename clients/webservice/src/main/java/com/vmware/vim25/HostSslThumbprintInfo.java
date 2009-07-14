/**
 * HostSslThumbprintInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostSslThumbprintInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String principal;

	private java.lang.String[] sslThumbprints;

	public HostSslThumbprintInfo() {
	}

	public HostSslThumbprintInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String principal, java.lang.String[] sslThumbprints) {
		super(dynamicType, dynamicProperty);
		this.principal = principal;
		this.sslThumbprints = sslThumbprints;
	}

	/**
	 * Gets the principal value for this HostSslThumbprintInfo.
	 * 
	 * @return principal
	 */
	public java.lang.String getPrincipal() {
		return principal;
	}

	/**
	 * Sets the principal value for this HostSslThumbprintInfo.
	 * 
	 * @param principal
	 */
	public void setPrincipal(java.lang.String principal) {
		this.principal = principal;
	}

	/**
	 * Gets the sslThumbprints value for this HostSslThumbprintInfo.
	 * 
	 * @return sslThumbprints
	 */
	public java.lang.String[] getSslThumbprints() {
		return sslThumbprints;
	}

	/**
	 * Sets the sslThumbprints value for this HostSslThumbprintInfo.
	 * 
	 * @param sslThumbprints
	 */
	public void setSslThumbprints(java.lang.String[] sslThumbprints) {
		this.sslThumbprints = sslThumbprints;
	}

	public java.lang.String getSslThumbprints(int i) {
		return this.sslThumbprints[i];
	}

	public void setSslThumbprints(int i, java.lang.String _value) {
		this.sslThumbprints[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostSslThumbprintInfo)) {
			return false;
		}
		HostSslThumbprintInfo other = (HostSslThumbprintInfo) obj;
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
				&& ((this.principal == null && other.getPrincipal() == null) || (this.principal != null && this.principal
						.equals(other.getPrincipal())))
				&& ((this.sslThumbprints == null && other.getSslThumbprints() == null) || (this.sslThumbprints != null && java.util.Arrays
						.equals(this.sslThumbprints, other.getSslThumbprints())));
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
		if (getPrincipal() != null) {
			_hashCode += getPrincipal().hashCode();
		}
		if (getSslThumbprints() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSslThumbprints()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSslThumbprints(), i);
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
			HostSslThumbprintInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostSslThumbprintInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("principal");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"principal"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sslThumbprints");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sslThumbprints"));
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
