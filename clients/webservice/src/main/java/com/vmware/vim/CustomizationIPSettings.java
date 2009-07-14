/**
 * CustomizationIPSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class CustomizationIPSettings extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.CustomizationIpGenerator ip;

	private java.lang.String subnetMask;

	private java.lang.String[] gateway;

	private java.lang.String[] dnsServerList;

	private java.lang.String dnsDomain;

	private java.lang.String primaryWINS;

	private java.lang.String secondaryWINS;

	private com.vmware.vim.CustomizationNetBIOSMode netBIOS;

	public CustomizationIPSettings() {
	}

	public CustomizationIPSettings(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.CustomizationIpGenerator ip,
			java.lang.String subnetMask, java.lang.String[] gateway,
			java.lang.String[] dnsServerList, java.lang.String dnsDomain,
			java.lang.String primaryWINS, java.lang.String secondaryWINS,
			com.vmware.vim.CustomizationNetBIOSMode netBIOS) {
		super(dynamicType, dynamicProperty);
		this.ip = ip;
		this.subnetMask = subnetMask;
		this.gateway = gateway;
		this.dnsServerList = dnsServerList;
		this.dnsDomain = dnsDomain;
		this.primaryWINS = primaryWINS;
		this.secondaryWINS = secondaryWINS;
		this.netBIOS = netBIOS;
	}

	/**
	 * Gets the ip value for this CustomizationIPSettings.
	 * 
	 * @return ip
	 */
	public com.vmware.vim.CustomizationIpGenerator getIp() {
		return ip;
	}

	/**
	 * Sets the ip value for this CustomizationIPSettings.
	 * 
	 * @param ip
	 */
	public void setIp(com.vmware.vim.CustomizationIpGenerator ip) {
		this.ip = ip;
	}

	/**
	 * Gets the subnetMask value for this CustomizationIPSettings.
	 * 
	 * @return subnetMask
	 */
	public java.lang.String getSubnetMask() {
		return subnetMask;
	}

	/**
	 * Sets the subnetMask value for this CustomizationIPSettings.
	 * 
	 * @param subnetMask
	 */
	public void setSubnetMask(java.lang.String subnetMask) {
		this.subnetMask = subnetMask;
	}

	/**
	 * Gets the gateway value for this CustomizationIPSettings.
	 * 
	 * @return gateway
	 */
	public java.lang.String[] getGateway() {
		return gateway;
	}

	/**
	 * Sets the gateway value for this CustomizationIPSettings.
	 * 
	 * @param gateway
	 */
	public void setGateway(java.lang.String[] gateway) {
		this.gateway = gateway;
	}

	public java.lang.String getGateway(int i) {
		return this.gateway[i];
	}

	public void setGateway(int i, java.lang.String _value) {
		this.gateway[i] = _value;
	}

	/**
	 * Gets the dnsServerList value for this CustomizationIPSettings.
	 * 
	 * @return dnsServerList
	 */
	public java.lang.String[] getDnsServerList() {
		return dnsServerList;
	}

	/**
	 * Sets the dnsServerList value for this CustomizationIPSettings.
	 * 
	 * @param dnsServerList
	 */
	public void setDnsServerList(java.lang.String[] dnsServerList) {
		this.dnsServerList = dnsServerList;
	}

	public java.lang.String getDnsServerList(int i) {
		return this.dnsServerList[i];
	}

	public void setDnsServerList(int i, java.lang.String _value) {
		this.dnsServerList[i] = _value;
	}

	/**
	 * Gets the dnsDomain value for this CustomizationIPSettings.
	 * 
	 * @return dnsDomain
	 */
	public java.lang.String getDnsDomain() {
		return dnsDomain;
	}

	/**
	 * Sets the dnsDomain value for this CustomizationIPSettings.
	 * 
	 * @param dnsDomain
	 */
	public void setDnsDomain(java.lang.String dnsDomain) {
		this.dnsDomain = dnsDomain;
	}

	/**
	 * Gets the primaryWINS value for this CustomizationIPSettings.
	 * 
	 * @return primaryWINS
	 */
	public java.lang.String getPrimaryWINS() {
		return primaryWINS;
	}

	/**
	 * Sets the primaryWINS value for this CustomizationIPSettings.
	 * 
	 * @param primaryWINS
	 */
	public void setPrimaryWINS(java.lang.String primaryWINS) {
		this.primaryWINS = primaryWINS;
	}

	/**
	 * Gets the secondaryWINS value for this CustomizationIPSettings.
	 * 
	 * @return secondaryWINS
	 */
	public java.lang.String getSecondaryWINS() {
		return secondaryWINS;
	}

	/**
	 * Sets the secondaryWINS value for this CustomizationIPSettings.
	 * 
	 * @param secondaryWINS
	 */
	public void setSecondaryWINS(java.lang.String secondaryWINS) {
		this.secondaryWINS = secondaryWINS;
	}

	/**
	 * Gets the netBIOS value for this CustomizationIPSettings.
	 * 
	 * @return netBIOS
	 */
	public com.vmware.vim.CustomizationNetBIOSMode getNetBIOS() {
		return netBIOS;
	}

	/**
	 * Sets the netBIOS value for this CustomizationIPSettings.
	 * 
	 * @param netBIOS
	 */
	public void setNetBIOS(com.vmware.vim.CustomizationNetBIOSMode netBIOS) {
		this.netBIOS = netBIOS;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CustomizationIPSettings)) {
			return false;
		}
		CustomizationIPSettings other = (CustomizationIPSettings) obj;
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
				&& ((this.ip == null && other.getIp() == null) || (this.ip != null && this.ip
						.equals(other.getIp())))
				&& ((this.subnetMask == null && other.getSubnetMask() == null) || (this.subnetMask != null && this.subnetMask
						.equals(other.getSubnetMask())))
				&& ((this.gateway == null && other.getGateway() == null) || (this.gateway != null && java.util.Arrays
						.equals(this.gateway, other.getGateway())))
				&& ((this.dnsServerList == null && other.getDnsServerList() == null) || (this.dnsServerList != null && java.util.Arrays
						.equals(this.dnsServerList, other.getDnsServerList())))
				&& ((this.dnsDomain == null && other.getDnsDomain() == null) || (this.dnsDomain != null && this.dnsDomain
						.equals(other.getDnsDomain())))
				&& ((this.primaryWINS == null && other.getPrimaryWINS() == null) || (this.primaryWINS != null && this.primaryWINS
						.equals(other.getPrimaryWINS())))
				&& ((this.secondaryWINS == null && other.getSecondaryWINS() == null) || (this.secondaryWINS != null && this.secondaryWINS
						.equals(other.getSecondaryWINS())))
				&& ((this.netBIOS == null && other.getNetBIOS() == null) || (this.netBIOS != null && this.netBIOS
						.equals(other.getNetBIOS())));
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
		if (getIp() != null) {
			_hashCode += getIp().hashCode();
		}
		if (getSubnetMask() != null) {
			_hashCode += getSubnetMask().hashCode();
		}
		if (getGateway() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getGateway()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getGateway(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDnsServerList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDnsServerList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDnsServerList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDnsDomain() != null) {
			_hashCode += getDnsDomain().hashCode();
		}
		if (getPrimaryWINS() != null) {
			_hashCode += getPrimaryWINS().hashCode();
		}
		if (getSecondaryWINS() != null) {
			_hashCode += getSecondaryWINS().hashCode();
		}
		if (getNetBIOS() != null) {
			_hashCode += getNetBIOS().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CustomizationIPSettings.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"CustomizationIPSettings"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ip");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "ip"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"CustomizationIpGenerator"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("subnetMask");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"subnetMask"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("gateway");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"gateway"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dnsServerList");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"dnsServerList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dnsDomain");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"dnsDomain"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("primaryWINS");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"primaryWINS"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("secondaryWINS");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"secondaryWINS"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("netBIOS");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"netBIOS"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"CustomizationNetBIOSMode"));
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
