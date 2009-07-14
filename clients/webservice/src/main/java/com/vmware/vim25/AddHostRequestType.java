/**
 * AddHostRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class AddHostRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.HostConnectSpec spec;

	private boolean asConnected;

	private com.vmware.vim25.ManagedObjectReference resourcePool;

	private java.lang.String license;

	public AddHostRequestType() {
	}

	public AddHostRequestType(com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.HostConnectSpec spec, boolean asConnected,
			com.vmware.vim25.ManagedObjectReference resourcePool,
			java.lang.String license) {
		this._this = _this;
		this.spec = spec;
		this.asConnected = asConnected;
		this.resourcePool = resourcePool;
		this.license = license;
	}

	/**
	 * Gets the _this value for this AddHostRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this AddHostRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the spec value for this AddHostRequestType.
	 * 
	 * @return spec
	 */
	public com.vmware.vim25.HostConnectSpec getSpec() {
		return spec;
	}

	/**
	 * Sets the spec value for this AddHostRequestType.
	 * 
	 * @param spec
	 */
	public void setSpec(com.vmware.vim25.HostConnectSpec spec) {
		this.spec = spec;
	}

	/**
	 * Gets the asConnected value for this AddHostRequestType.
	 * 
	 * @return asConnected
	 */
	public boolean isAsConnected() {
		return asConnected;
	}

	/**
	 * Sets the asConnected value for this AddHostRequestType.
	 * 
	 * @param asConnected
	 */
	public void setAsConnected(boolean asConnected) {
		this.asConnected = asConnected;
	}

	/**
	 * Gets the resourcePool value for this AddHostRequestType.
	 * 
	 * @return resourcePool
	 */
	public com.vmware.vim25.ManagedObjectReference getResourcePool() {
		return resourcePool;
	}

	/**
	 * Sets the resourcePool value for this AddHostRequestType.
	 * 
	 * @param resourcePool
	 */
	public void setResourcePool(
			com.vmware.vim25.ManagedObjectReference resourcePool) {
		this.resourcePool = resourcePool;
	}

	/**
	 * Gets the license value for this AddHostRequestType.
	 * 
	 * @return license
	 */
	public java.lang.String getLicense() {
		return license;
	}

	/**
	 * Sets the license value for this AddHostRequestType.
	 * 
	 * @param license
	 */
	public void setLicense(java.lang.String license) {
		this.license = license;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AddHostRequestType)) {
			return false;
		}
		AddHostRequestType other = (AddHostRequestType) obj;
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
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.spec == null && other.getSpec() == null) || (this.spec != null && this.spec
						.equals(other.getSpec())))
				&& this.asConnected == other.isAsConnected()
				&& ((this.resourcePool == null && other.getResourcePool() == null) || (this.resourcePool != null && this.resourcePool
						.equals(other.getResourcePool())))
				&& ((this.license == null && other.getLicense() == null) || (this.license != null && this.license
						.equals(other.getLicense())));
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
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getSpec() != null) {
			_hashCode += getSpec().hashCode();
		}
		_hashCode += (isAsConnected() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getResourcePool() != null) {
			_hashCode += getResourcePool().hashCode();
		}
		if (getLicense() != null) {
			_hashCode += getLicense().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AddHostRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"AddHostRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("spec");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostConnectSpec"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("asConnected");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"asConnected"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("resourcePool");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"resourcePool"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("license");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"license"));
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
