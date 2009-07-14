/**
 * ClusterConfigInfoEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterConfigInfoEx extends
		com.vmware.vim25.ComputeResourceConfigInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ClusterDasConfigInfo dasConfig;

	private com.vmware.vim25.ClusterDasVmConfigInfo[] dasVmConfig;

	private com.vmware.vim25.ClusterDrsConfigInfo drsConfig;

	private com.vmware.vim25.ClusterDrsVmConfigInfo[] drsVmConfig;

	private com.vmware.vim25.ClusterRuleInfo[] rule;

	private com.vmware.vim25.ClusterDpmConfigInfo dpmConfigInfo;

	private com.vmware.vim25.ClusterDpmHostConfigInfo[] dpmHostConfig;

	public ClusterConfigInfoEx() {
	}

	public ClusterConfigInfoEx(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String vmSwapPlacement,
			com.vmware.vim25.ClusterDasConfigInfo dasConfig,
			com.vmware.vim25.ClusterDasVmConfigInfo[] dasVmConfig,
			com.vmware.vim25.ClusterDrsConfigInfo drsConfig,
			com.vmware.vim25.ClusterDrsVmConfigInfo[] drsVmConfig,
			com.vmware.vim25.ClusterRuleInfo[] rule,
			com.vmware.vim25.ClusterDpmConfigInfo dpmConfigInfo,
			com.vmware.vim25.ClusterDpmHostConfigInfo[] dpmHostConfig) {
		super(dynamicType, dynamicProperty, vmSwapPlacement);
		this.dasConfig = dasConfig;
		this.dasVmConfig = dasVmConfig;
		this.drsConfig = drsConfig;
		this.drsVmConfig = drsVmConfig;
		this.rule = rule;
		this.dpmConfigInfo = dpmConfigInfo;
		this.dpmHostConfig = dpmHostConfig;
	}

	/**
	 * Gets the dasConfig value for this ClusterConfigInfoEx.
	 * 
	 * @return dasConfig
	 */
	public com.vmware.vim25.ClusterDasConfigInfo getDasConfig() {
		return dasConfig;
	}

	/**
	 * Sets the dasConfig value for this ClusterConfigInfoEx.
	 * 
	 * @param dasConfig
	 */
	public void setDasConfig(com.vmware.vim25.ClusterDasConfigInfo dasConfig) {
		this.dasConfig = dasConfig;
	}

	/**
	 * Gets the dasVmConfig value for this ClusterConfigInfoEx.
	 * 
	 * @return dasVmConfig
	 */
	public com.vmware.vim25.ClusterDasVmConfigInfo[] getDasVmConfig() {
		return dasVmConfig;
	}

	/**
	 * Sets the dasVmConfig value for this ClusterConfigInfoEx.
	 * 
	 * @param dasVmConfig
	 */
	public void setDasVmConfig(
			com.vmware.vim25.ClusterDasVmConfigInfo[] dasVmConfig) {
		this.dasVmConfig = dasVmConfig;
	}

	public com.vmware.vim25.ClusterDasVmConfigInfo getDasVmConfig(int i) {
		return this.dasVmConfig[i];
	}

	public void setDasVmConfig(int i,
			com.vmware.vim25.ClusterDasVmConfigInfo _value) {
		this.dasVmConfig[i] = _value;
	}

	/**
	 * Gets the drsConfig value for this ClusterConfigInfoEx.
	 * 
	 * @return drsConfig
	 */
	public com.vmware.vim25.ClusterDrsConfigInfo getDrsConfig() {
		return drsConfig;
	}

	/**
	 * Sets the drsConfig value for this ClusterConfigInfoEx.
	 * 
	 * @param drsConfig
	 */
	public void setDrsConfig(com.vmware.vim25.ClusterDrsConfigInfo drsConfig) {
		this.drsConfig = drsConfig;
	}

	/**
	 * Gets the drsVmConfig value for this ClusterConfigInfoEx.
	 * 
	 * @return drsVmConfig
	 */
	public com.vmware.vim25.ClusterDrsVmConfigInfo[] getDrsVmConfig() {
		return drsVmConfig;
	}

	/**
	 * Sets the drsVmConfig value for this ClusterConfigInfoEx.
	 * 
	 * @param drsVmConfig
	 */
	public void setDrsVmConfig(
			com.vmware.vim25.ClusterDrsVmConfigInfo[] drsVmConfig) {
		this.drsVmConfig = drsVmConfig;
	}

	public com.vmware.vim25.ClusterDrsVmConfigInfo getDrsVmConfig(int i) {
		return this.drsVmConfig[i];
	}

	public void setDrsVmConfig(int i,
			com.vmware.vim25.ClusterDrsVmConfigInfo _value) {
		this.drsVmConfig[i] = _value;
	}

	/**
	 * Gets the rule value for this ClusterConfigInfoEx.
	 * 
	 * @return rule
	 */
	public com.vmware.vim25.ClusterRuleInfo[] getRule() {
		return rule;
	}

	/**
	 * Sets the rule value for this ClusterConfigInfoEx.
	 * 
	 * @param rule
	 */
	public void setRule(com.vmware.vim25.ClusterRuleInfo[] rule) {
		this.rule = rule;
	}

	public com.vmware.vim25.ClusterRuleInfo getRule(int i) {
		return this.rule[i];
	}

	public void setRule(int i, com.vmware.vim25.ClusterRuleInfo _value) {
		this.rule[i] = _value;
	}

	/**
	 * Gets the dpmConfigInfo value for this ClusterConfigInfoEx.
	 * 
	 * @return dpmConfigInfo
	 */
	public com.vmware.vim25.ClusterDpmConfigInfo getDpmConfigInfo() {
		return dpmConfigInfo;
	}

	/**
	 * Sets the dpmConfigInfo value for this ClusterConfigInfoEx.
	 * 
	 * @param dpmConfigInfo
	 */
	public void setDpmConfigInfo(
			com.vmware.vim25.ClusterDpmConfigInfo dpmConfigInfo) {
		this.dpmConfigInfo = dpmConfigInfo;
	}

	/**
	 * Gets the dpmHostConfig value for this ClusterConfigInfoEx.
	 * 
	 * @return dpmHostConfig
	 */
	public com.vmware.vim25.ClusterDpmHostConfigInfo[] getDpmHostConfig() {
		return dpmHostConfig;
	}

	/**
	 * Sets the dpmHostConfig value for this ClusterConfigInfoEx.
	 * 
	 * @param dpmHostConfig
	 */
	public void setDpmHostConfig(
			com.vmware.vim25.ClusterDpmHostConfigInfo[] dpmHostConfig) {
		this.dpmHostConfig = dpmHostConfig;
	}

	public com.vmware.vim25.ClusterDpmHostConfigInfo getDpmHostConfig(int i) {
		return this.dpmHostConfig[i];
	}

	public void setDpmHostConfig(int i,
			com.vmware.vim25.ClusterDpmHostConfigInfo _value) {
		this.dpmHostConfig[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClusterConfigInfoEx)) {
			return false;
		}
		ClusterConfigInfoEx other = (ClusterConfigInfoEx) obj;
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
						.equals(this.rule, other.getRule())))
				&& ((this.dpmConfigInfo == null && other.getDpmConfigInfo() == null) || (this.dpmConfigInfo != null && this.dpmConfigInfo
						.equals(other.getDpmConfigInfo())))
				&& ((this.dpmHostConfig == null && other.getDpmHostConfig() == null) || (this.dpmHostConfig != null && java.util.Arrays
						.equals(this.dpmHostConfig, other.getDpmHostConfig())));
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
		if (getDpmConfigInfo() != null) {
			_hashCode += getDpmConfigInfo().hashCode();
		}
		if (getDpmHostConfig() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDpmHostConfig()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDpmHostConfig(), i);
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
			ClusterConfigInfoEx.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterConfigInfoEx"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dasConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dasConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDasConfigInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dasVmConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dasVmConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDasVmConfigInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("drsConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"drsConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDrsConfigInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("drsVmConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"drsVmConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDrsVmConfigInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rule");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rule"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterRuleInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dpmConfigInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dpmConfigInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDpmConfigInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dpmHostConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dpmHostConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterDpmHostConfigInfo"));
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
