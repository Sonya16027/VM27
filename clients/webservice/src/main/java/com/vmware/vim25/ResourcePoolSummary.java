/**
 * ResourcePoolSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ResourcePoolSummary extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String name;

	private com.vmware.vim25.ResourceConfigSpec config;

	private com.vmware.vim25.ResourcePoolRuntimeInfo runtime;

	private com.vmware.vim25.ResourcePoolQuickStats quickStats;

	private java.lang.Integer configuredMemoryMB;

	public ResourcePoolSummary() {
	}

	public ResourcePoolSummary(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String name, com.vmware.vim25.ResourceConfigSpec config,
			com.vmware.vim25.ResourcePoolRuntimeInfo runtime,
			com.vmware.vim25.ResourcePoolQuickStats quickStats,
			java.lang.Integer configuredMemoryMB) {
		super(dynamicType, dynamicProperty);
		this.name = name;
		this.config = config;
		this.runtime = runtime;
		this.quickStats = quickStats;
		this.configuredMemoryMB = configuredMemoryMB;
	}

	/**
	 * Gets the name value for this ResourcePoolSummary.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this ResourcePoolSummary.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the config value for this ResourcePoolSummary.
	 * 
	 * @return config
	 */
	public com.vmware.vim25.ResourceConfigSpec getConfig() {
		return config;
	}

	/**
	 * Sets the config value for this ResourcePoolSummary.
	 * 
	 * @param config
	 */
	public void setConfig(com.vmware.vim25.ResourceConfigSpec config) {
		this.config = config;
	}

	/**
	 * Gets the runtime value for this ResourcePoolSummary.
	 * 
	 * @return runtime
	 */
	public com.vmware.vim25.ResourcePoolRuntimeInfo getRuntime() {
		return runtime;
	}

	/**
	 * Sets the runtime value for this ResourcePoolSummary.
	 * 
	 * @param runtime
	 */
	public void setRuntime(com.vmware.vim25.ResourcePoolRuntimeInfo runtime) {
		this.runtime = runtime;
	}

	/**
	 * Gets the quickStats value for this ResourcePoolSummary.
	 * 
	 * @return quickStats
	 */
	public com.vmware.vim25.ResourcePoolQuickStats getQuickStats() {
		return quickStats;
	}

	/**
	 * Sets the quickStats value for this ResourcePoolSummary.
	 * 
	 * @param quickStats
	 */
	public void setQuickStats(com.vmware.vim25.ResourcePoolQuickStats quickStats) {
		this.quickStats = quickStats;
	}

	/**
	 * Gets the configuredMemoryMB value for this ResourcePoolSummary.
	 * 
	 * @return configuredMemoryMB
	 */
	public java.lang.Integer getConfiguredMemoryMB() {
		return configuredMemoryMB;
	}

	/**
	 * Sets the configuredMemoryMB value for this ResourcePoolSummary.
	 * 
	 * @param configuredMemoryMB
	 */
	public void setConfiguredMemoryMB(java.lang.Integer configuredMemoryMB) {
		this.configuredMemoryMB = configuredMemoryMB;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResourcePoolSummary)) {
			return false;
		}
		ResourcePoolSummary other = (ResourcePoolSummary) obj;
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
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.config == null && other.getConfig() == null) || (this.config != null && this.config
						.equals(other.getConfig())))
				&& ((this.runtime == null && other.getRuntime() == null) || (this.runtime != null && this.runtime
						.equals(other.getRuntime())))
				&& ((this.quickStats == null && other.getQuickStats() == null) || (this.quickStats != null && this.quickStats
						.equals(other.getQuickStats())))
				&& ((this.configuredMemoryMB == null && other
						.getConfiguredMemoryMB() == null) || (this.configuredMemoryMB != null && this.configuredMemoryMB
						.equals(other.getConfiguredMemoryMB())));
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
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getConfig() != null) {
			_hashCode += getConfig().hashCode();
		}
		if (getRuntime() != null) {
			_hashCode += getRuntime().hashCode();
		}
		if (getQuickStats() != null) {
			_hashCode += getQuickStats().hashCode();
		}
		if (getConfiguredMemoryMB() != null) {
			_hashCode += getConfiguredMemoryMB().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ResourcePoolSummary.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ResourcePoolSummary"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("config");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"config"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ResourceConfigSpec"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("runtime");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"runtime"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ResourcePoolRuntimeInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("quickStats");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"quickStats"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ResourcePoolQuickStats"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("configuredMemoryMB");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"configuredMemoryMB"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
