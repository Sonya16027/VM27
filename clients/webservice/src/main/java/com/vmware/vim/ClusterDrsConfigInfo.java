/**
 * ClusterDrsConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ClusterDrsConfigInfo extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Boolean enabled;

	private com.vmware.vim.DrsBehavior defaultVmBehavior;

	private java.lang.Integer vmotionRate;

	private com.vmware.vim.OptionValue[] option;

	public ClusterDrsConfigInfo() {
	}

	public ClusterDrsConfigInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.Boolean enabled,
			com.vmware.vim.DrsBehavior defaultVmBehavior,
			java.lang.Integer vmotionRate, com.vmware.vim.OptionValue[] option) {
		super(dynamicType, dynamicProperty);
		this.enabled = enabled;
		this.defaultVmBehavior = defaultVmBehavior;
		this.vmotionRate = vmotionRate;
		this.option = option;
	}

	/**
	 * Gets the enabled value for this ClusterDrsConfigInfo.
	 * 
	 * @return enabled
	 */
	public java.lang.Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled value for this ClusterDrsConfigInfo.
	 * 
	 * @param enabled
	 */
	public void setEnabled(java.lang.Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Gets the defaultVmBehavior value for this ClusterDrsConfigInfo.
	 * 
	 * @return defaultVmBehavior
	 */
	public com.vmware.vim.DrsBehavior getDefaultVmBehavior() {
		return defaultVmBehavior;
	}

	/**
	 * Sets the defaultVmBehavior value for this ClusterDrsConfigInfo.
	 * 
	 * @param defaultVmBehavior
	 */
	public void setDefaultVmBehavior(
			com.vmware.vim.DrsBehavior defaultVmBehavior) {
		this.defaultVmBehavior = defaultVmBehavior;
	}

	/**
	 * Gets the vmotionRate value for this ClusterDrsConfigInfo.
	 * 
	 * @return vmotionRate
	 */
	public java.lang.Integer getVmotionRate() {
		return vmotionRate;
	}

	/**
	 * Sets the vmotionRate value for this ClusterDrsConfigInfo.
	 * 
	 * @param vmotionRate
	 */
	public void setVmotionRate(java.lang.Integer vmotionRate) {
		this.vmotionRate = vmotionRate;
	}

	/**
	 * Gets the option value for this ClusterDrsConfigInfo.
	 * 
	 * @return option
	 */
	public com.vmware.vim.OptionValue[] getOption() {
		return option;
	}

	/**
	 * Sets the option value for this ClusterDrsConfigInfo.
	 * 
	 * @param option
	 */
	public void setOption(com.vmware.vim.OptionValue[] option) {
		this.option = option;
	}

	public com.vmware.vim.OptionValue getOption(int i) {
		return this.option[i];
	}

	public void setOption(int i, com.vmware.vim.OptionValue _value) {
		this.option[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClusterDrsConfigInfo)) {
			return false;
		}
		ClusterDrsConfigInfo other = (ClusterDrsConfigInfo) obj;
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
				&& ((this.defaultVmBehavior == null && other
						.getDefaultVmBehavior() == null) || (this.defaultVmBehavior != null && this.defaultVmBehavior
						.equals(other.getDefaultVmBehavior())))
				&& ((this.vmotionRate == null && other.getVmotionRate() == null) || (this.vmotionRate != null && this.vmotionRate
						.equals(other.getVmotionRate())))
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
		if (getDefaultVmBehavior() != null) {
			_hashCode += getDefaultVmBehavior().hashCode();
		}
		if (getVmotionRate() != null) {
			_hashCode += getVmotionRate().hashCode();
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
			ClusterDrsConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ClusterDrsConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("enabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"enabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultVmBehavior");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"defaultVmBehavior"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"DrsBehavior"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmotionRate");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"vmotionRate"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("option");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "option"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
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
