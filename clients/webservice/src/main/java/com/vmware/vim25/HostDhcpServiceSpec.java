/**
 * HostDhcpServiceSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDhcpServiceSpec extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String virtualSwitch;

	private int defaultLeaseDuration;

	private java.lang.String leaseBeginIp;

	private java.lang.String leaseEndIp;

	private int maxLeaseDuration;

	private boolean unlimitedLease;

	private java.lang.String ipSubnetAddr;

	private java.lang.String ipSubnetMask;

	public HostDhcpServiceSpec() {
	}

	public HostDhcpServiceSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String virtualSwitch, int defaultLeaseDuration,
			java.lang.String leaseBeginIp, java.lang.String leaseEndIp,
			int maxLeaseDuration, boolean unlimitedLease,
			java.lang.String ipSubnetAddr, java.lang.String ipSubnetMask) {
		super(dynamicType, dynamicProperty);
		this.virtualSwitch = virtualSwitch;
		this.defaultLeaseDuration = defaultLeaseDuration;
		this.leaseBeginIp = leaseBeginIp;
		this.leaseEndIp = leaseEndIp;
		this.maxLeaseDuration = maxLeaseDuration;
		this.unlimitedLease = unlimitedLease;
		this.ipSubnetAddr = ipSubnetAddr;
		this.ipSubnetMask = ipSubnetMask;
	}

	/**
	 * Gets the virtualSwitch value for this HostDhcpServiceSpec.
	 * 
	 * @return virtualSwitch
	 */
	public java.lang.String getVirtualSwitch() {
		return virtualSwitch;
	}

	/**
	 * Sets the virtualSwitch value for this HostDhcpServiceSpec.
	 * 
	 * @param virtualSwitch
	 */
	public void setVirtualSwitch(java.lang.String virtualSwitch) {
		this.virtualSwitch = virtualSwitch;
	}

	/**
	 * Gets the defaultLeaseDuration value for this HostDhcpServiceSpec.
	 * 
	 * @return defaultLeaseDuration
	 */
	public int getDefaultLeaseDuration() {
		return defaultLeaseDuration;
	}

	/**
	 * Sets the defaultLeaseDuration value for this HostDhcpServiceSpec.
	 * 
	 * @param defaultLeaseDuration
	 */
	public void setDefaultLeaseDuration(int defaultLeaseDuration) {
		this.defaultLeaseDuration = defaultLeaseDuration;
	}

	/**
	 * Gets the leaseBeginIp value for this HostDhcpServiceSpec.
	 * 
	 * @return leaseBeginIp
	 */
	public java.lang.String getLeaseBeginIp() {
		return leaseBeginIp;
	}

	/**
	 * Sets the leaseBeginIp value for this HostDhcpServiceSpec.
	 * 
	 * @param leaseBeginIp
	 */
	public void setLeaseBeginIp(java.lang.String leaseBeginIp) {
		this.leaseBeginIp = leaseBeginIp;
	}

	/**
	 * Gets the leaseEndIp value for this HostDhcpServiceSpec.
	 * 
	 * @return leaseEndIp
	 */
	public java.lang.String getLeaseEndIp() {
		return leaseEndIp;
	}

	/**
	 * Sets the leaseEndIp value for this HostDhcpServiceSpec.
	 * 
	 * @param leaseEndIp
	 */
	public void setLeaseEndIp(java.lang.String leaseEndIp) {
		this.leaseEndIp = leaseEndIp;
	}

	/**
	 * Gets the maxLeaseDuration value for this HostDhcpServiceSpec.
	 * 
	 * @return maxLeaseDuration
	 */
	public int getMaxLeaseDuration() {
		return maxLeaseDuration;
	}

	/**
	 * Sets the maxLeaseDuration value for this HostDhcpServiceSpec.
	 * 
	 * @param maxLeaseDuration
	 */
	public void setMaxLeaseDuration(int maxLeaseDuration) {
		this.maxLeaseDuration = maxLeaseDuration;
	}

	/**
	 * Gets the unlimitedLease value for this HostDhcpServiceSpec.
	 * 
	 * @return unlimitedLease
	 */
	public boolean isUnlimitedLease() {
		return unlimitedLease;
	}

	/**
	 * Sets the unlimitedLease value for this HostDhcpServiceSpec.
	 * 
	 * @param unlimitedLease
	 */
	public void setUnlimitedLease(boolean unlimitedLease) {
		this.unlimitedLease = unlimitedLease;
	}

	/**
	 * Gets the ipSubnetAddr value for this HostDhcpServiceSpec.
	 * 
	 * @return ipSubnetAddr
	 */
	public java.lang.String getIpSubnetAddr() {
		return ipSubnetAddr;
	}

	/**
	 * Sets the ipSubnetAddr value for this HostDhcpServiceSpec.
	 * 
	 * @param ipSubnetAddr
	 */
	public void setIpSubnetAddr(java.lang.String ipSubnetAddr) {
		this.ipSubnetAddr = ipSubnetAddr;
	}

	/**
	 * Gets the ipSubnetMask value for this HostDhcpServiceSpec.
	 * 
	 * @return ipSubnetMask
	 */
	public java.lang.String getIpSubnetMask() {
		return ipSubnetMask;
	}

	/**
	 * Sets the ipSubnetMask value for this HostDhcpServiceSpec.
	 * 
	 * @param ipSubnetMask
	 */
	public void setIpSubnetMask(java.lang.String ipSubnetMask) {
		this.ipSubnetMask = ipSubnetMask;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostDhcpServiceSpec)) {
			return false;
		}
		HostDhcpServiceSpec other = (HostDhcpServiceSpec) obj;
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
				&& ((this.virtualSwitch == null && other.getVirtualSwitch() == null) || (this.virtualSwitch != null && this.virtualSwitch
						.equals(other.getVirtualSwitch())))
				&& this.defaultLeaseDuration == other.getDefaultLeaseDuration()
				&& ((this.leaseBeginIp == null && other.getLeaseBeginIp() == null) || (this.leaseBeginIp != null && this.leaseBeginIp
						.equals(other.getLeaseBeginIp())))
				&& ((this.leaseEndIp == null && other.getLeaseEndIp() == null) || (this.leaseEndIp != null && this.leaseEndIp
						.equals(other.getLeaseEndIp())))
				&& this.maxLeaseDuration == other.getMaxLeaseDuration()
				&& this.unlimitedLease == other.isUnlimitedLease()
				&& ((this.ipSubnetAddr == null && other.getIpSubnetAddr() == null) || (this.ipSubnetAddr != null && this.ipSubnetAddr
						.equals(other.getIpSubnetAddr())))
				&& ((this.ipSubnetMask == null && other.getIpSubnetMask() == null) || (this.ipSubnetMask != null && this.ipSubnetMask
						.equals(other.getIpSubnetMask())));
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
		if (getVirtualSwitch() != null) {
			_hashCode += getVirtualSwitch().hashCode();
		}
		_hashCode += getDefaultLeaseDuration();
		if (getLeaseBeginIp() != null) {
			_hashCode += getLeaseBeginIp().hashCode();
		}
		if (getLeaseEndIp() != null) {
			_hashCode += getLeaseEndIp().hashCode();
		}
		_hashCode += getMaxLeaseDuration();
		_hashCode += (isUnlimitedLease() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getIpSubnetAddr() != null) {
			_hashCode += getIpSubnetAddr().hashCode();
		}
		if (getIpSubnetMask() != null) {
			_hashCode += getIpSubnetMask().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostDhcpServiceSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDhcpServiceSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualSwitch");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"virtualSwitch"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultLeaseDuration");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"defaultLeaseDuration"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leaseBeginIp");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"leaseBeginIp"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leaseEndIp");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"leaseEndIp"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxLeaseDuration");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"maxLeaseDuration"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("unlimitedLease");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"unlimitedLease"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipSubnetAddr");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipSubnetAddr"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipSubnetMask");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipSubnetMask"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
