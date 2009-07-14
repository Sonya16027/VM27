/**
 * PhysicalNicCdpInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PhysicalNicCdpInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Integer cdpVersion;

	private java.lang.Integer timeout;

	private java.lang.Integer ttl;

	private java.lang.Integer samples;

	private java.lang.String devId;

	private java.lang.String address;

	private java.lang.String portId;

	private com.vmware.vim25.PhysicalNicCdpDeviceCapability deviceCapability;

	private java.lang.String softwareVersion;

	private java.lang.String hardwarePlatform;

	private java.lang.String ipPrefix;

	private java.lang.Integer ipPrefixLen;

	private java.lang.Integer vlan;

	private java.lang.Boolean fullDuplex;

	private java.lang.Integer mtu;

	private java.lang.String systemName;

	private java.lang.String systemOID;

	private java.lang.String mgmtAddr;

	private java.lang.String location;

	public PhysicalNicCdpInfo() {
	}

	public PhysicalNicCdpInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.Integer cdpVersion, java.lang.Integer timeout,
			java.lang.Integer ttl, java.lang.Integer samples,
			java.lang.String devId, java.lang.String address,
			java.lang.String portId,
			com.vmware.vim25.PhysicalNicCdpDeviceCapability deviceCapability,
			java.lang.String softwareVersion,
			java.lang.String hardwarePlatform, java.lang.String ipPrefix,
			java.lang.Integer ipPrefixLen, java.lang.Integer vlan,
			java.lang.Boolean fullDuplex, java.lang.Integer mtu,
			java.lang.String systemName, java.lang.String systemOID,
			java.lang.String mgmtAddr, java.lang.String location) {
		super(dynamicType, dynamicProperty);
		this.cdpVersion = cdpVersion;
		this.timeout = timeout;
		this.ttl = ttl;
		this.samples = samples;
		this.devId = devId;
		this.address = address;
		this.portId = portId;
		this.deviceCapability = deviceCapability;
		this.softwareVersion = softwareVersion;
		this.hardwarePlatform = hardwarePlatform;
		this.ipPrefix = ipPrefix;
		this.ipPrefixLen = ipPrefixLen;
		this.vlan = vlan;
		this.fullDuplex = fullDuplex;
		this.mtu = mtu;
		this.systemName = systemName;
		this.systemOID = systemOID;
		this.mgmtAddr = mgmtAddr;
		this.location = location;
	}

	/**
	 * Gets the cdpVersion value for this PhysicalNicCdpInfo.
	 * 
	 * @return cdpVersion
	 */
	public java.lang.Integer getCdpVersion() {
		return cdpVersion;
	}

	/**
	 * Sets the cdpVersion value for this PhysicalNicCdpInfo.
	 * 
	 * @param cdpVersion
	 */
	public void setCdpVersion(java.lang.Integer cdpVersion) {
		this.cdpVersion = cdpVersion;
	}

	/**
	 * Gets the timeout value for this PhysicalNicCdpInfo.
	 * 
	 * @return timeout
	 */
	public java.lang.Integer getTimeout() {
		return timeout;
	}

	/**
	 * Sets the timeout value for this PhysicalNicCdpInfo.
	 * 
	 * @param timeout
	 */
	public void setTimeout(java.lang.Integer timeout) {
		this.timeout = timeout;
	}

	/**
	 * Gets the ttl value for this PhysicalNicCdpInfo.
	 * 
	 * @return ttl
	 */
	public java.lang.Integer getTtl() {
		return ttl;
	}

	/**
	 * Sets the ttl value for this PhysicalNicCdpInfo.
	 * 
	 * @param ttl
	 */
	public void setTtl(java.lang.Integer ttl) {
		this.ttl = ttl;
	}

	/**
	 * Gets the samples value for this PhysicalNicCdpInfo.
	 * 
	 * @return samples
	 */
	public java.lang.Integer getSamples() {
		return samples;
	}

	/**
	 * Sets the samples value for this PhysicalNicCdpInfo.
	 * 
	 * @param samples
	 */
	public void setSamples(java.lang.Integer samples) {
		this.samples = samples;
	}

	/**
	 * Gets the devId value for this PhysicalNicCdpInfo.
	 * 
	 * @return devId
	 */
	public java.lang.String getDevId() {
		return devId;
	}

	/**
	 * Sets the devId value for this PhysicalNicCdpInfo.
	 * 
	 * @param devId
	 */
	public void setDevId(java.lang.String devId) {
		this.devId = devId;
	}

	/**
	 * Gets the address value for this PhysicalNicCdpInfo.
	 * 
	 * @return address
	 */
	public java.lang.String getAddress() {
		return address;
	}

	/**
	 * Sets the address value for this PhysicalNicCdpInfo.
	 * 
	 * @param address
	 */
	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	/**
	 * Gets the portId value for this PhysicalNicCdpInfo.
	 * 
	 * @return portId
	 */
	public java.lang.String getPortId() {
		return portId;
	}

	/**
	 * Sets the portId value for this PhysicalNicCdpInfo.
	 * 
	 * @param portId
	 */
	public void setPortId(java.lang.String portId) {
		this.portId = portId;
	}

	/**
	 * Gets the deviceCapability value for this PhysicalNicCdpInfo.
	 * 
	 * @return deviceCapability
	 */
	public com.vmware.vim25.PhysicalNicCdpDeviceCapability getDeviceCapability() {
		return deviceCapability;
	}

	/**
	 * Sets the deviceCapability value for this PhysicalNicCdpInfo.
	 * 
	 * @param deviceCapability
	 */
	public void setDeviceCapability(
			com.vmware.vim25.PhysicalNicCdpDeviceCapability deviceCapability) {
		this.deviceCapability = deviceCapability;
	}

	/**
	 * Gets the softwareVersion value for this PhysicalNicCdpInfo.
	 * 
	 * @return softwareVersion
	 */
	public java.lang.String getSoftwareVersion() {
		return softwareVersion;
	}

	/**
	 * Sets the softwareVersion value for this PhysicalNicCdpInfo.
	 * 
	 * @param softwareVersion
	 */
	public void setSoftwareVersion(java.lang.String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	/**
	 * Gets the hardwarePlatform value for this PhysicalNicCdpInfo.
	 * 
	 * @return hardwarePlatform
	 */
	public java.lang.String getHardwarePlatform() {
		return hardwarePlatform;
	}

	/**
	 * Sets the hardwarePlatform value for this PhysicalNicCdpInfo.
	 * 
	 * @param hardwarePlatform
	 */
	public void setHardwarePlatform(java.lang.String hardwarePlatform) {
		this.hardwarePlatform = hardwarePlatform;
	}

	/**
	 * Gets the ipPrefix value for this PhysicalNicCdpInfo.
	 * 
	 * @return ipPrefix
	 */
	public java.lang.String getIpPrefix() {
		return ipPrefix;
	}

	/**
	 * Sets the ipPrefix value for this PhysicalNicCdpInfo.
	 * 
	 * @param ipPrefix
	 */
	public void setIpPrefix(java.lang.String ipPrefix) {
		this.ipPrefix = ipPrefix;
	}

	/**
	 * Gets the ipPrefixLen value for this PhysicalNicCdpInfo.
	 * 
	 * @return ipPrefixLen
	 */
	public java.lang.Integer getIpPrefixLen() {
		return ipPrefixLen;
	}

	/**
	 * Sets the ipPrefixLen value for this PhysicalNicCdpInfo.
	 * 
	 * @param ipPrefixLen
	 */
	public void setIpPrefixLen(java.lang.Integer ipPrefixLen) {
		this.ipPrefixLen = ipPrefixLen;
	}

	/**
	 * Gets the vlan value for this PhysicalNicCdpInfo.
	 * 
	 * @return vlan
	 */
	public java.lang.Integer getVlan() {
		return vlan;
	}

	/**
	 * Sets the vlan value for this PhysicalNicCdpInfo.
	 * 
	 * @param vlan
	 */
	public void setVlan(java.lang.Integer vlan) {
		this.vlan = vlan;
	}

	/**
	 * Gets the fullDuplex value for this PhysicalNicCdpInfo.
	 * 
	 * @return fullDuplex
	 */
	public java.lang.Boolean getFullDuplex() {
		return fullDuplex;
	}

	/**
	 * Sets the fullDuplex value for this PhysicalNicCdpInfo.
	 * 
	 * @param fullDuplex
	 */
	public void setFullDuplex(java.lang.Boolean fullDuplex) {
		this.fullDuplex = fullDuplex;
	}

	/**
	 * Gets the mtu value for this PhysicalNicCdpInfo.
	 * 
	 * @return mtu
	 */
	public java.lang.Integer getMtu() {
		return mtu;
	}

	/**
	 * Sets the mtu value for this PhysicalNicCdpInfo.
	 * 
	 * @param mtu
	 */
	public void setMtu(java.lang.Integer mtu) {
		this.mtu = mtu;
	}

	/**
	 * Gets the systemName value for this PhysicalNicCdpInfo.
	 * 
	 * @return systemName
	 */
	public java.lang.String getSystemName() {
		return systemName;
	}

	/**
	 * Sets the systemName value for this PhysicalNicCdpInfo.
	 * 
	 * @param systemName
	 */
	public void setSystemName(java.lang.String systemName) {
		this.systemName = systemName;
	}

	/**
	 * Gets the systemOID value for this PhysicalNicCdpInfo.
	 * 
	 * @return systemOID
	 */
	public java.lang.String getSystemOID() {
		return systemOID;
	}

	/**
	 * Sets the systemOID value for this PhysicalNicCdpInfo.
	 * 
	 * @param systemOID
	 */
	public void setSystemOID(java.lang.String systemOID) {
		this.systemOID = systemOID;
	}

	/**
	 * Gets the mgmtAddr value for this PhysicalNicCdpInfo.
	 * 
	 * @return mgmtAddr
	 */
	public java.lang.String getMgmtAddr() {
		return mgmtAddr;
	}

	/**
	 * Sets the mgmtAddr value for this PhysicalNicCdpInfo.
	 * 
	 * @param mgmtAddr
	 */
	public void setMgmtAddr(java.lang.String mgmtAddr) {
		this.mgmtAddr = mgmtAddr;
	}

	/**
	 * Gets the location value for this PhysicalNicCdpInfo.
	 * 
	 * @return location
	 */
	public java.lang.String getLocation() {
		return location;
	}

	/**
	 * Sets the location value for this PhysicalNicCdpInfo.
	 * 
	 * @param location
	 */
	public void setLocation(java.lang.String location) {
		this.location = location;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PhysicalNicCdpInfo)) {
			return false;
		}
		PhysicalNicCdpInfo other = (PhysicalNicCdpInfo) obj;
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
				&& ((this.cdpVersion == null && other.getCdpVersion() == null) || (this.cdpVersion != null && this.cdpVersion
						.equals(other.getCdpVersion())))
				&& ((this.timeout == null && other.getTimeout() == null) || (this.timeout != null && this.timeout
						.equals(other.getTimeout())))
				&& ((this.ttl == null && other.getTtl() == null) || (this.ttl != null && this.ttl
						.equals(other.getTtl())))
				&& ((this.samples == null && other.getSamples() == null) || (this.samples != null && this.samples
						.equals(other.getSamples())))
				&& ((this.devId == null && other.getDevId() == null) || (this.devId != null && this.devId
						.equals(other.getDevId())))
				&& ((this.address == null && other.getAddress() == null) || (this.address != null && this.address
						.equals(other.getAddress())))
				&& ((this.portId == null && other.getPortId() == null) || (this.portId != null && this.portId
						.equals(other.getPortId())))
				&& ((this.deviceCapability == null && other
						.getDeviceCapability() == null) || (this.deviceCapability != null && this.deviceCapability
						.equals(other.getDeviceCapability())))
				&& ((this.softwareVersion == null && other.getSoftwareVersion() == null) || (this.softwareVersion != null && this.softwareVersion
						.equals(other.getSoftwareVersion())))
				&& ((this.hardwarePlatform == null && other
						.getHardwarePlatform() == null) || (this.hardwarePlatform != null && this.hardwarePlatform
						.equals(other.getHardwarePlatform())))
				&& ((this.ipPrefix == null && other.getIpPrefix() == null) || (this.ipPrefix != null && this.ipPrefix
						.equals(other.getIpPrefix())))
				&& ((this.ipPrefixLen == null && other.getIpPrefixLen() == null) || (this.ipPrefixLen != null && this.ipPrefixLen
						.equals(other.getIpPrefixLen())))
				&& ((this.vlan == null && other.getVlan() == null) || (this.vlan != null && this.vlan
						.equals(other.getVlan())))
				&& ((this.fullDuplex == null && other.getFullDuplex() == null) || (this.fullDuplex != null && this.fullDuplex
						.equals(other.getFullDuplex())))
				&& ((this.mtu == null && other.getMtu() == null) || (this.mtu != null && this.mtu
						.equals(other.getMtu())))
				&& ((this.systemName == null && other.getSystemName() == null) || (this.systemName != null && this.systemName
						.equals(other.getSystemName())))
				&& ((this.systemOID == null && other.getSystemOID() == null) || (this.systemOID != null && this.systemOID
						.equals(other.getSystemOID())))
				&& ((this.mgmtAddr == null && other.getMgmtAddr() == null) || (this.mgmtAddr != null && this.mgmtAddr
						.equals(other.getMgmtAddr())))
				&& ((this.location == null && other.getLocation() == null) || (this.location != null && this.location
						.equals(other.getLocation())));
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
		if (getCdpVersion() != null) {
			_hashCode += getCdpVersion().hashCode();
		}
		if (getTimeout() != null) {
			_hashCode += getTimeout().hashCode();
		}
		if (getTtl() != null) {
			_hashCode += getTtl().hashCode();
		}
		if (getSamples() != null) {
			_hashCode += getSamples().hashCode();
		}
		if (getDevId() != null) {
			_hashCode += getDevId().hashCode();
		}
		if (getAddress() != null) {
			_hashCode += getAddress().hashCode();
		}
		if (getPortId() != null) {
			_hashCode += getPortId().hashCode();
		}
		if (getDeviceCapability() != null) {
			_hashCode += getDeviceCapability().hashCode();
		}
		if (getSoftwareVersion() != null) {
			_hashCode += getSoftwareVersion().hashCode();
		}
		if (getHardwarePlatform() != null) {
			_hashCode += getHardwarePlatform().hashCode();
		}
		if (getIpPrefix() != null) {
			_hashCode += getIpPrefix().hashCode();
		}
		if (getIpPrefixLen() != null) {
			_hashCode += getIpPrefixLen().hashCode();
		}
		if (getVlan() != null) {
			_hashCode += getVlan().hashCode();
		}
		if (getFullDuplex() != null) {
			_hashCode += getFullDuplex().hashCode();
		}
		if (getMtu() != null) {
			_hashCode += getMtu().hashCode();
		}
		if (getSystemName() != null) {
			_hashCode += getSystemName().hashCode();
		}
		if (getSystemOID() != null) {
			_hashCode += getSystemOID().hashCode();
		}
		if (getMgmtAddr() != null) {
			_hashCode += getMgmtAddr().hashCode();
		}
		if (getLocation() != null) {
			_hashCode += getLocation().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			PhysicalNicCdpInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PhysicalNicCdpInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cdpVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"cdpVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("timeout");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"timeout"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ttl");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ttl"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("samples");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"samples"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("devId");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "devId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("address");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"address"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"portId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("deviceCapability");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"deviceCapability"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PhysicalNicCdpDeviceCapability"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("softwareVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"softwareVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hardwarePlatform");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hardwarePlatform"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipPrefix");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipPrefix"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipPrefixLen");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipPrefixLen"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vlan");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlan"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fullDuplex");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"fullDuplex"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mtu");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mtu"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("systemName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"systemName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("systemOID");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"systemOID"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mgmtAddr");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"mgmtAddr"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("location");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"location"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
