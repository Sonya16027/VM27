/**
 * DVSCreateSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVSCreateSpec extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.DVSConfigSpec configSpec;

	private com.vmware.vim25.DistributedVirtualSwitchProductSpec productInfo;

	private com.vmware.vim25.DVSCapability capability;

	public DVSCreateSpec() {
	}

	public DVSCreateSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.DVSConfigSpec configSpec,
			com.vmware.vim25.DistributedVirtualSwitchProductSpec productInfo,
			com.vmware.vim25.DVSCapability capability) {
		super(dynamicType, dynamicProperty);
		this.configSpec = configSpec;
		this.productInfo = productInfo;
		this.capability = capability;
	}

	/**
	 * Gets the configSpec value for this DVSCreateSpec.
	 * 
	 * @return configSpec
	 */
	public com.vmware.vim25.DVSConfigSpec getConfigSpec() {
		return configSpec;
	}

	/**
	 * Sets the configSpec value for this DVSCreateSpec.
	 * 
	 * @param configSpec
	 */
	public void setConfigSpec(com.vmware.vim25.DVSConfigSpec configSpec) {
		this.configSpec = configSpec;
	}

	/**
	 * Gets the productInfo value for this DVSCreateSpec.
	 * 
	 * @return productInfo
	 */
	public com.vmware.vim25.DistributedVirtualSwitchProductSpec getProductInfo() {
		return productInfo;
	}

	/**
	 * Sets the productInfo value for this DVSCreateSpec.
	 * 
	 * @param productInfo
	 */
	public void setProductInfo(
			com.vmware.vim25.DistributedVirtualSwitchProductSpec productInfo) {
		this.productInfo = productInfo;
	}

	/**
	 * Gets the capability value for this DVSCreateSpec.
	 * 
	 * @return capability
	 */
	public com.vmware.vim25.DVSCapability getCapability() {
		return capability;
	}

	/**
	 * Sets the capability value for this DVSCreateSpec.
	 * 
	 * @param capability
	 */
	public void setCapability(com.vmware.vim25.DVSCapability capability) {
		this.capability = capability;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DVSCreateSpec)) {
			return false;
		}
		DVSCreateSpec other = (DVSCreateSpec) obj;
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
				&& ((this.configSpec == null && other.getConfigSpec() == null) || (this.configSpec != null && this.configSpec
						.equals(other.getConfigSpec())))
				&& ((this.productInfo == null && other.getProductInfo() == null) || (this.productInfo != null && this.productInfo
						.equals(other.getProductInfo())))
				&& ((this.capability == null && other.getCapability() == null) || (this.capability != null && this.capability
						.equals(other.getCapability())));
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
		if (getConfigSpec() != null) {
			_hashCode += getConfigSpec().hashCode();
		}
		if (getProductInfo() != null) {
			_hashCode += getProductInfo().hashCode();
		}
		if (getCapability() != null) {
			_hashCode += getCapability().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DVSCreateSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVSCreateSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("configSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"configSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVSConfigSpec"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productInfo");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"productInfo"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchProductSpec"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("capability");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"capability"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVSCapability"));
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
