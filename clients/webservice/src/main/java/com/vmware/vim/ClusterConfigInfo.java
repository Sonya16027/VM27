/**
 * ClusterConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ClusterConfigInfo extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ClusterDasConfigInfo dasConfig;

	private com.vmware.vim.ClusterDasVmConfigInfo[] dasVmConfig;

	private com.vmware.vim.ClusterDrsConfigInfo drsConfig;

	private com.vmware.vim.ClusterDrsVmConfigInfo[] drsVmConfig;

	private com.vmware.vim.ClusterRuleInfo[] rule;

	public ClusterConfigInfo() {
	}

	public ClusterConfigInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.ClusterDasConfigInfo dasConfig,
			com.vmware.vim.ClusterDasVmConfigInfo[] dasVmConfig,
			com.vmware.vim.ClusterDrsConfigInfo drsConfig,
			com.vmware.vim.ClusterDrsVmConfigInfo[] drsVmConfig,
			com.vmware.vim.ClusterRuleInfo[] rule) {
		super(dynamicType, dynamicProperty);
		this.dasConfig = dasConfig;
		this.dasVmConfig = dasVmConfig;
		this.drsConfig = drsConfig;
		this.drsVmConfig = drsVmConfig;
		this.rule = rule;
	}

	/**
	 * Gets the dasConfig value for this ClusterConfigInfo.
	 * 
	 * @return dasConfig
	 */
	public com.vmware.vim.ClusterDasConfigInfo getDasConfig() {
		return dasConfig;
	}

	/**
	 * Sets the dasConfig value for this ClusterConfigInfo.
	 * 
	 * @param dasConfig
	 */
	public void setDasConfig(com.vmware.vim.ClusterDasConfigInfo dasConfig) {
		this.dasConfig = dasConfig;
	}

	/**
	 * Gets the dasVmConfig value for this ClusterConfigInfo.
	 * 
	 * @return dasVmConfig
	 */
	public com.vmware.vim.ClusterDasVmConfigInfo[] getDasVmConfig() {
		return dasVmConfig;
	}

	/**
	 * Sets the dasVmConfig value for this ClusterConfigInfo.
	 * 
	 * @param dasVmConfig
	 */
	public void setDasVmConfig(
			com.vmware.vim.ClusterDasVmConfigInfo[] dasVmConfig) {
		this.dasVmConfig = dasVmConfig;
	}

	public com.vmware.vim.ClusterDasVmConfigInfo getDasVmConfig(int i) {
		return this.dasVmConfig[i];
	}

	public void setDasVmConfig(int i,
			com.vmware.vim.ClusterDasVmConfigInfo _value) {
		this.dasVmConfig[i] = _value;
	}

	/**
	 * Gets the drsConfig value for this ClusterConfigInfo.
	 * 
	 * @return drsConfig
	 */
	public com.vmware.vim.ClusterDrsConfigInfo getDrsConfig() {
		return drsConfig;
	}

	/**
	 * Sets the drsConfig value for this ClusterConfigInfo.
	 * 
	 * @param drsConfig
	 */
	public void setDrsConfig(com.vmware.vim.ClusterDrsConfigInfo drsConfig) {
		this.drsConfig = drsConfig;
	}

	/**
	 * Gets the drsVmConfig value for this ClusterConfigInfo.
	 * 
	 * @return drsVmConfig
	 */
	public com.vmware.vim.ClusterDrsVmConfigInfo[] getDrsVmConfig() {
		return drsVmConfig;
	}

	/**
	 * Sets the drsVmConfig value for this ClusterConfigInfo.
	 * 
	 * @param drsVmConfig
	 */
	public void setDrsVmConfig(
			com.vmware.vim.ClusterDrsVmConfigInfo[] drsVmConfig) {
		this.drsVmConfig = drsVmConfig;
	}

	public com.vmware.vim.ClusterDrsVmConfigInfo getDrsVmConfig(int i) {
		return this.drsVmConfig[i];
	}

	public void setDrsVmConfig(int i,
			com.vmware.vim.ClusterDrsVmConfigInfo _value) {
		this.drsVmConfig[i] = _value;
	}

	/**
	 * Gets the rule value for this ClusterConfigInfo.
	 * 
	 * @return rule
	 */
	public com.vmware.vim.ClusterRuleInfo[] getRule() {
		return rule;
	}

	/**
	 * Sets the rule value for this ClusterConfigInfo.
	 * 
	 * @param rule
	 */
	public void setRule(com.vmware.vim.ClusterRuleInfo[] rule) {
		this.rule = rule;
	}

	public com.vmware.vim.ClusterRuleInfo getRule(int i) {
		return this.rule[i];
	}

	public void setRule(int i, com.vmware.vim.ClusterRuleInfo _value) {
		this.rule[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClusterConfigInfo)) {
			return false;
		}
		ClusterConfigInfo other = (ClusterConfigInfo) obj;
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
				&& ((this.dasConfig == null && other.getDasConfig() == null) || (this.dasConfig != null && this.dasConfig
						.equals(other.getDasConfig())))
				&& ((this.dasVmConfig == null && other.getDasVmConfig() == null) || (this.dasVmConfig != null && java.util.Arrays
						.equals(this.dasVmConfig, other.getDasVmConfig())))
				&& ((this.drsConfig == null && other.getDrsConfig() == null) || (this.drsConfig != null && this.drsConfig
						.equals(other.getDrsConfig())))
				&& ((this.drsVmConfig == null && other.getDrsVmConfig() == null) || (this.drsVmConfig != null && java.util.Arrays
						.equals(this.drsVmConfig, other.getDrsVmConfig())))
				&& ((this.rule == null && other.getRule() == null) || (this.rule != null && java.util.Arrays
						.equals(this.rule, other.getRule())));
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
		if (getDasConfig() != null) {
			_hashCode += getDasConfig().hashCode();
		}
		if (getDasVmConfig() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDasVmConfig()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDasVmConfig(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDrsConfig() != null) {
			_hashCode += getDrsConfig().hashCode();
		}
		if (getDrsVmConfig() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDrsVmConfig()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDrsVmConfig(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getRule() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getRule()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getRule(), i);
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
			ClusterConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ClusterConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dasConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"dasConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ClusterDasConfigInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dasVmConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"dasVmConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ClusterDasVmConfigInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("drsConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"drsConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ClusterDrsConfigInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("drsVmConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"drsVmConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ClusterDrsVmConfigInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rule");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "rule"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ClusterRuleInfo"));
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
