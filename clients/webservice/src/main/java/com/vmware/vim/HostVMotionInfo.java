/**
 * HostVMotionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostVMotionInfo extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.HostVMotionNetConfig netConfig;

	private com.vmware.vim.HostIpConfig ipConfig;

	public HostVMotionInfo() {
	}

	public HostVMotionInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.HostVMotionNetConfig netConfig,
			com.vmware.vim.HostIpConfig ipConfig) {
		super(dynamicType, dynamicProperty);
		this.netConfig = netConfig;
		this.ipConfig = ipConfig;
	}

	/**
	 * Gets the netConfig value for this HostVMotionInfo.
	 * 
	 * @return netConfig
	 */
	public com.vmware.vim.HostVMotionNetConfig getNetConfig() {
		return netConfig;
	}

	/**
	 * Sets the netConfig value for this HostVMotionInfo.
	 * 
	 * @param netConfig
	 */
	public void setNetConfig(com.vmware.vim.HostVMotionNetConfig netConfig) {
		this.netConfig = netConfig;
	}

	/**
	 * Gets the ipConfig value for this HostVMotionInfo.
	 * 
	 * @return ipConfig
	 */
	public com.vmware.vim.HostIpConfig getIpConfig() {
		return ipConfig;
	}

	/**
	 * Sets the ipConfig value for this HostVMotionInfo.
	 * 
	 * @param ipConfig
	 */
	public void setIpConfig(com.vmware.vim.HostIpConfig ipConfig) {
		this.ipConfig = ipConfig;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostVMotionInfo)) {
			return false;
		}
		HostVMotionInfo other = (HostVMotionInfo) obj;
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
				&& ((this.netConfig == null && other.getNetConfig() == null) || (this.netConfig != null && this.netConfig
						.equals(other.getNetConfig())))
				&& ((this.ipConfig == null && other.getIpConfig() == null) || (this.ipConfig != null && this.ipConfig
						.equals(other.getIpConfig())));
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
		if (getNetConfig() != null) {
			_hashCode += getNetConfig().hashCode();
		}
		if (getIpConfig() != null) {
			_hashCode += getIpConfig().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostVMotionInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostVMotionInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("netConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"netConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostVMotionNetConfig"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"ipConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostIpConfig"));
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
