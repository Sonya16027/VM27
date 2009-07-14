/**
 * HostPciPassthruInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostPciPassthruInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String id;

	private java.lang.String dependentDevice;

	private boolean passthruEnabled;

	private boolean passthruCapable;

	private boolean passthruActive;

	public HostPciPassthruInfo() {
	}

	public HostPciPassthruInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String id, java.lang.String dependentDevice,
			boolean passthruEnabled, boolean passthruCapable,
			boolean passthruActive) {
		super(dynamicType, dynamicProperty);
		this.id = id;
		this.dependentDevice = dependentDevice;
		this.passthruEnabled = passthruEnabled;
		this.passthruCapable = passthruCapable;
		this.passthruActive = passthruActive;
	}

	/**
	 * Gets the id value for this HostPciPassthruInfo.
	 * 
	 * @return id
	 */
	public java.lang.String getId() {
		return id;
	}

	/**
	 * Sets the id value for this HostPciPassthruInfo.
	 * 
	 * @param id
	 */
	public void setId(java.lang.String id) {
		this.id = id;
	}

	/**
	 * Gets the dependentDevice value for this HostPciPassthruInfo.
	 * 
	 * @return dependentDevice
	 */
	public java.lang.String getDependentDevice() {
		return dependentDevice;
	}

	/**
	 * Sets the dependentDevice value for this HostPciPassthruInfo.
	 * 
	 * @param dependentDevice
	 */
	public void setDependentDevice(java.lang.String dependentDevice) {
		this.dependentDevice = dependentDevice;
	}

	/**
	 * Gets the passthruEnabled value for this HostPciPassthruInfo.
	 * 
	 * @return passthruEnabled
	 */
	public boolean isPassthruEnabled() {
		return passthruEnabled;
	}

	/**
	 * Sets the passthruEnabled value for this HostPciPassthruInfo.
	 * 
	 * @param passthruEnabled
	 */
	public void setPassthruEnabled(boolean passthruEnabled) {
		this.passthruEnabled = passthruEnabled;
	}

	/**
	 * Gets the passthruCapable value for this HostPciPassthruInfo.
	 * 
	 * @return passthruCapable
	 */
	public boolean isPassthruCapable() {
		return passthruCapable;
	}

	/**
	 * Sets the passthruCapable value for this HostPciPassthruInfo.
	 * 
	 * @param passthruCapable
	 */
	public void setPassthruCapable(boolean passthruCapable) {
		this.passthruCapable = passthruCapable;
	}

	/**
	 * Gets the passthruActive value for this HostPciPassthruInfo.
	 * 
	 * @return passthruActive
	 */
	public boolean isPassthruActive() {
		return passthruActive;
	}

	/**
	 * Sets the passthruActive value for this HostPciPassthruInfo.
	 * 
	 * @param passthruActive
	 */
	public void setPassthruActive(boolean passthruActive) {
		this.passthruActive = passthruActive;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostPciPassthruInfo)) {
			return false;
		}
		HostPciPassthruInfo other = (HostPciPassthruInfo) obj;
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
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id
						.equals(other.getId())))
				&& ((this.dependentDevice == null && other.getDependentDevice() == null) || (this.dependentDevice != null && this.dependentDevice
						.equals(other.getDependentDevice())))
				&& this.passthruEnabled == other.isPassthruEnabled()
				&& this.passthruCapable == other.isPassthruCapable()
				&& this.passthruActive == other.isPassthruActive();
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
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		if (getDependentDevice() != null) {
			_hashCode += getDependentDevice().hashCode();
		}
		_hashCode += (isPassthruEnabled() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isPassthruCapable() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isPassthruActive() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostPciPassthruInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPciPassthruInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dependentDevice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dependentDevice"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("passthruEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"passthruEnabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("passthruCapable");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"passthruCapable"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("passthruActive");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"passthruActive"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
