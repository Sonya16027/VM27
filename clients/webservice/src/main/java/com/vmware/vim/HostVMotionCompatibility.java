/**
 * HostVMotionCompatibility.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostVMotionCompatibility extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference host;

	private java.lang.String[] compatibility;

	public HostVMotionCompatibility() {
	}

	public HostVMotionCompatibility(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.ManagedObjectReference host,
			java.lang.String[] compatibility) {
		super(dynamicType, dynamicProperty);
		this.host = host;
		this.compatibility = compatibility;
	}

	/**
	 * Gets the host value for this HostVMotionCompatibility.
	 * 
	 * @return host
	 */
	public com.vmware.vim.ManagedObjectReference getHost() {
		return host;
	}

	/**
	 * Sets the host value for this HostVMotionCompatibility.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim.ManagedObjectReference host) {
		this.host = host;
	}

	/**
	 * Gets the compatibility value for this HostVMotionCompatibility.
	 * 
	 * @return compatibility
	 */
	public java.lang.String[] getCompatibility() {
		return compatibility;
	}

	/**
	 * Sets the compatibility value for this HostVMotionCompatibility.
	 * 
	 * @param compatibility
	 */
	public void setCompatibility(java.lang.String[] compatibility) {
		this.compatibility = compatibility;
	}

	public java.lang.String getCompatibility(int i) {
		return this.compatibility[i];
	}

	public void setCompatibility(int i, java.lang.String _value) {
		this.compatibility[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostVMotionCompatibility)) {
			return false;
		}
		HostVMotionCompatibility other = (HostVMotionCompatibility) obj;
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
				&& ((this.host == null && other.getHost() == null) || (this.host != null && this.host
						.equals(other.getHost())))
				&& ((this.compatibility == null && other.getCompatibility() == null) || (this.compatibility != null && java.util.Arrays
						.equals(this.compatibility, other.getCompatibility())));
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
		if (getHost() != null) {
			_hashCode += getHost().hashCode();
		}
		if (getCompatibility() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getCompatibility()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getCompatibility(), i);
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
			HostVMotionCompatibility.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostVMotionCompatibility"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("compatibility");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"compatibility"));
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
