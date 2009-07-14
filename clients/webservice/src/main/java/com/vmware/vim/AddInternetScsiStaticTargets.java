/**
 * AddInternetScsiStaticTargets.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class AddInternetScsiStaticTargets implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private java.lang.String iScsiHbaDevice;

	private com.vmware.vim.HostInternetScsiHbaStaticTarget[] targets;

	public AddInternetScsiStaticTargets() {
	}

	public AddInternetScsiStaticTargets(
			com.vmware.vim.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim.HostInternetScsiHbaStaticTarget[] targets) {
		this._this = _this;
		this.iScsiHbaDevice = iScsiHbaDevice;
		this.targets = targets;
	}

	/**
	 * Gets the _this value for this AddInternetScsiStaticTargets.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this AddInternetScsiStaticTargets.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the iScsiHbaDevice value for this AddInternetScsiStaticTargets.
	 * 
	 * @return iScsiHbaDevice
	 */
	public java.lang.String getIScsiHbaDevice() {
		return iScsiHbaDevice;
	}

	/**
	 * Sets the iScsiHbaDevice value for this AddInternetScsiStaticTargets.
	 * 
	 * @param iScsiHbaDevice
	 */
	public void setIScsiHbaDevice(java.lang.String iScsiHbaDevice) {
		this.iScsiHbaDevice = iScsiHbaDevice;
	}

	/**
	 * Gets the targets value for this AddInternetScsiStaticTargets.
	 * 
	 * @return targets
	 */
	public com.vmware.vim.HostInternetScsiHbaStaticTarget[] getTargets() {
		return targets;
	}

	/**
	 * Sets the targets value for this AddInternetScsiStaticTargets.
	 * 
	 * @param targets
	 */
	public void setTargets(
			com.vmware.vim.HostInternetScsiHbaStaticTarget[] targets) {
		this.targets = targets;
	}

	public com.vmware.vim.HostInternetScsiHbaStaticTarget getTargets(int i) {
		return this.targets[i];
	}

	public void setTargets(int i,
			com.vmware.vim.HostInternetScsiHbaStaticTarget _value) {
		this.targets[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AddInternetScsiStaticTargets)) {
			return false;
		}
		AddInternetScsiStaticTargets other = (AddInternetScsiStaticTargets) obj;
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
				&& ((this.iScsiHbaDevice == null && other.getIScsiHbaDevice() == null) || (this.iScsiHbaDevice != null && this.iScsiHbaDevice
						.equals(other.getIScsiHbaDevice())))
				&& ((this.targets == null && other.getTargets() == null) || (this.targets != null && java.util.Arrays
						.equals(this.targets, other.getTargets())));
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
		if (getIScsiHbaDevice() != null) {
			_hashCode += getIScsiHbaDevice().hashCode();
		}
		if (getTargets() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getTargets()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getTargets(), i);
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
			AddInternetScsiStaticTargets.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">AddInternetScsiStaticTargets"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("IScsiHbaDevice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"iScsiHbaDevice"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("targets");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"targets"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostInternetScsiHbaStaticTarget"));
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
