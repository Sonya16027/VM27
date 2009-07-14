/**
 * ClusterDpmConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterDpmConfigInfo extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Boolean enabled;

	private com.vmware.vim25.DpmBehavior defaultDpmBehavior;

	private java.lang.Integer hostPowerActionRate;

	private com.vmware.vim25.OptionValue[] option;

	public ClusterDpmConfigInfo() {
	}

	public ClusterDpmConfigInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.Boolean enabled,
			com.vmware.vim25.DpmBehavior defaultDpmBehavior,
			java.lang.Integer hostPowerActionRate,
			com.vmware.vim25.OptionValue[] option) {
		super(dynamicType, dynamicProperty);
		this.enabled = enabled;
		this.defaultDpmBehavior = defaultDpmBehavior;
		this.hostPowerActionRate = hostPowerActionRate;
		this.option = option;
	}

	/**
	 * Gets the enabled value for this ClusterDpmConfigInfo.
	 * 
	 * @return enabled
	 */
	public java.lang.Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled value for this ClusterDpmConfigInfo.
	 * 
	 * @param enabled
	 */
	public void setEnabled(java.lang.Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Gets the defaultDpmBehavior value for this ClusterDpmConfigInfo.
	 * 
	 * @return defaultDpmBehavior
	 */
	public com.vmware.vim25.DpmBehavior getDefaultDpmBehavior() {
		return defaultDpmBehavior;
	}

	/**
	 * Sets the defaultDpmBehavior value for this ClusterDpmConfigInfo.
	 * 
	 * @param defaultDpmBehavior
	 */
	public void setDefaultDpmBehavior(
			com.vmware.vim25.DpmBehavior defaultDpmBehavior) {
		this.defaultDpmBehavior = defaultDpmBehavior;
	}

	/**
	 * Gets the hostPowerActionRate value for this ClusterDpmConfigInfo.
	 * 
	 * @return hostPowerActionRate
	 */
	public java.lang.Integer getHostPowerActionRate() {
		return hostPowerActionRate;
	}

	/**
	 * Sets the hostPowerActionRate value for this ClusterDpmConfigInfo.
	 * 
	 * @param hostPowerActionRate
	 */
	public void setHostPowerActionRate(java.lang.Integer hostPowerActionRate) {
		this.hostPowerActionRate = hostPowerActionRate;
	}

	/**
	 * Gets the option value for this ClusterDpmConfigInfo.
	 * 
	 * @return option
	 */
	public com.vmware.vim25.OptionValue[] getOption() {
		return option;
	}

	/**
	 * Sets the option value for this ClusterDpmConfigInfo.
	 * 
	 * @param option
	 */
	public void setOption(com.vmware.vim25.OptionValue[] option) {
		this.option = option;
	}

	public com.vmware.vim25.OptionValue getOption(int i) {
		return this.option[i];
	}

	public void setOption(int i, com.vmware.vim25.OptionValue _value) {
		this.option[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClusterDpmConfigInfo)) {
			return false;
		}
		ClusterDpmConfigInfo other = (ClusterDpmConfigInfo) obj;
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
				&& ((this.enabled == null && other.getEnabled() == null) || (this.enabled != null && this.enabled
						.equals(other.getEnabled())))
				&& ((this.defaultDpmBehavior == null && other
						.getDefaultDpmBehavior() == null) || (this.defaultDpmBehavior != null && this.defaultDpmBehavior
						.equals(other.getDefaultDpmBehavior())))
				&& ((this.hostPowerActionRate == null && other
						.getHostPowerActionRate() == null) || (this.hostPowerActionRate != null && this.hostPowerActionRate
						.equals(other.getHostPowerActionRate())))
				&& ((this.option == null && other.getOption() == null) || (this.option != null && java.util.Arrays
						.equals(this.option, other.getOption())));
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
		if (getEnabled() != null) {
			_hashCode += getEnabled().hashCode();
		}
		if (getDefaultDpmBehavior() != null) {
			_hashCode += getDefaultDpmBehavior().hashCode();
		}
		if (getHostPowerActionRate() != null) {
			_hashCode += getHostPowerActionRate().hashCode();
		}
		if (getOption() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getOption()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getOption(),
						i);
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
			ClusterDpmConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDpmConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("enabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"enabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultDpmBehavior");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"defaultDpmBehavior"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DpmBehavior"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostPowerActionRate");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hostPowerActionRate"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("option");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"option"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OptionValue"));
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
