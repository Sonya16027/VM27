/**
 * NetworkProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class NetworkProfile extends com.vmware.vim25.ApplyProfile implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.VirtualSwitchProfile[] vswitch;

	private com.vmware.vim25.VmPortGroupProfile[] vmPortGroup;

	private com.vmware.vim25.HostPortGroupProfile[] hostPortGroup;

	private com.vmware.vim25.ServiceConsolePortGroupProfile[] serviceConsolePortGroup;

	private com.vmware.vim25.NetworkProfileDnsConfigProfile dnsConfig;

	private com.vmware.vim25.IpRouteProfile ipRouteConfig;

	private com.vmware.vim25.IpRouteProfile consoleIpRouteConfig;

	private com.vmware.vim25.PhysicalNicProfile[] pnic;

	private com.vmware.vim25.DvsProfile[] dvswitch;

	private com.vmware.vim25.DvsServiceConsoleVNicProfile[] dvsServiceConsoleNic;

	private com.vmware.vim25.DvsHostVNicProfile[] dvsHostNic;

	public NetworkProfile() {
	}

	public NetworkProfile(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			boolean enabled,
			com.vmware.vim25.ProfilePolicy[] policy,
			com.vmware.vim25.VirtualSwitchProfile[] vswitch,
			com.vmware.vim25.VmPortGroupProfile[] vmPortGroup,
			com.vmware.vim25.HostPortGroupProfile[] hostPortGroup,
			com.vmware.vim25.ServiceConsolePortGroupProfile[] serviceConsolePortGroup,
			com.vmware.vim25.NetworkProfileDnsConfigProfile dnsConfig,
			com.vmware.vim25.IpRouteProfile ipRouteConfig,
			com.vmware.vim25.IpRouteProfile consoleIpRouteConfig,
			com.vmware.vim25.PhysicalNicProfile[] pnic,
			com.vmware.vim25.DvsProfile[] dvswitch,
			com.vmware.vim25.DvsServiceConsoleVNicProfile[] dvsServiceConsoleNic,
			com.vmware.vim25.DvsHostVNicProfile[] dvsHostNic) {
		super(dynamicType, dynamicProperty, enabled, policy);
		this.vswitch = vswitch;
		this.vmPortGroup = vmPortGroup;
		this.hostPortGroup = hostPortGroup;
		this.serviceConsolePortGroup = serviceConsolePortGroup;
		this.dnsConfig = dnsConfig;
		this.ipRouteConfig = ipRouteConfig;
		this.consoleIpRouteConfig = consoleIpRouteConfig;
		this.pnic = pnic;
		this.dvswitch = dvswitch;
		this.dvsServiceConsoleNic = dvsServiceConsoleNic;
		this.dvsHostNic = dvsHostNic;
	}

	/**
	 * Gets the vswitch value for this NetworkProfile.
	 * 
	 * @return vswitch
	 */
	public com.vmware.vim25.VirtualSwitchProfile[] getVswitch() {
		return vswitch;
	}

	/**
	 * Sets the vswitch value for this NetworkProfile.
	 * 
	 * @param vswitch
	 */
	public void setVswitch(com.vmware.vim25.VirtualSwitchProfile[] vswitch) {
		this.vswitch = vswitch;
	}

	public com.vmware.vim25.VirtualSwitchProfile getVswitch(int i) {
		return this.vswitch[i];
	}

	public void setVswitch(int i, com.vmware.vim25.VirtualSwitchProfile _value) {
		this.vswitch[i] = _value;
	}

	/**
	 * Gets the vmPortGroup value for this NetworkProfile.
	 * 
	 * @return vmPortGroup
	 */
	public com.vmware.vim25.VmPortGroupProfile[] getVmPortGroup() {
		return vmPortGroup;
	}

	/**
	 * Sets the vmPortGroup value for this NetworkProfile.
	 * 
	 * @param vmPortGroup
	 */
	public void setVmPortGroup(com.vmware.vim25.VmPortGroupProfile[] vmPortGroup) {
		this.vmPortGroup = vmPortGroup;
	}

	public com.vmware.vim25.VmPortGroupProfile getVmPortGroup(int i) {
		return this.vmPortGroup[i];
	}

	public void setVmPortGroup(int i, com.vmware.vim25.VmPortGroupProfile _value) {
		this.vmPortGroup[i] = _value;
	}

	/**
	 * Gets the hostPortGroup value for this NetworkProfile.
	 * 
	 * @return hostPortGroup
	 */
	public com.vmware.vim25.HostPortGroupProfile[] getHostPortGroup() {
		return hostPortGroup;
	}

	/**
	 * Sets the hostPortGroup value for this NetworkProfile.
	 * 
	 * @param hostPortGroup
	 */
	public void setHostPortGroup(
			com.vmware.vim25.HostPortGroupProfile[] hostPortGroup) {
		this.hostPortGroup = hostPortGroup;
	}

	public com.vmware.vim25.HostPortGroupProfile getHostPortGroup(int i) {
		return this.hostPortGroup[i];
	}

	public void setHostPortGroup(int i,
			com.vmware.vim25.HostPortGroupProfile _value) {
		this.hostPortGroup[i] = _value;
	}

	/**
	 * Gets the serviceConsolePortGroup value for this NetworkProfile.
	 * 
	 * @return serviceConsolePortGroup
	 */
	public com.vmware.vim25.ServiceConsolePortGroupProfile[] getServiceConsolePortGroup() {
		return serviceConsolePortGroup;
	}

	/**
	 * Sets the serviceConsolePortGroup value for this NetworkProfile.
	 * 
	 * @param serviceConsolePortGroup
	 */
	public void setServiceConsolePortGroup(
			com.vmware.vim25.ServiceConsolePortGroupProfile[] serviceConsolePortGroup) {
		this.serviceConsolePortGroup = serviceConsolePortGroup;
	}

	public com.vmware.vim25.ServiceConsolePortGroupProfile getServiceConsolePortGroup(
			int i) {
		return this.serviceConsolePortGroup[i];
	}

	public void setServiceConsolePortGroup(int i,
			com.vmware.vim25.ServiceConsolePortGroupProfile _value) {
		this.serviceConsolePortGroup[i] = _value;
	}

	/**
	 * Gets the dnsConfig value for this NetworkProfile.
	 * 
	 * @return dnsConfig
	 */
	public com.vmware.vim25.NetworkProfileDnsConfigProfile getDnsConfig() {
		return dnsConfig;
	}

	/**
	 * Sets the dnsConfig value for this NetworkProfile.
	 * 
	 * @param dnsConfig
	 */
	public void setDnsConfig(
			com.vmware.vim25.NetworkProfileDnsConfigProfile dnsConfig) {
		this.dnsConfig = dnsConfig;
	}

	/**
	 * Gets the ipRouteConfig value for this NetworkProfile.
	 * 
	 * @return ipRouteConfig
	 */
	public com.vmware.vim25.IpRouteProfile getIpRouteConfig() {
		return ipRouteConfig;
	}

	/**
	 * Sets the ipRouteConfig value for this NetworkProfile.
	 * 
	 * @param ipRouteConfig
	 */
	public void setIpRouteConfig(com.vmware.vim25.IpRouteProfile ipRouteConfig) {
		this.ipRouteConfig = ipRouteConfig;
	}

	/**
	 * Gets the consoleIpRouteConfig value for this NetworkProfile.
	 * 
	 * @return consoleIpRouteConfig
	 */
	public com.vmware.vim25.IpRouteProfile getConsoleIpRouteConfig() {
		return consoleIpRouteConfig;
	}

	/**
	 * Sets the consoleIpRouteConfig value for this NetworkProfile.
	 * 
	 * @param consoleIpRouteConfig
	 */
	public void setConsoleIpRouteConfig(
			com.vmware.vim25.IpRouteProfile consoleIpRouteConfig) {
		this.consoleIpRouteConfig = consoleIpRouteConfig;
	}

	/**
	 * Gets the pnic value for this NetworkProfile.
	 * 
	 * @return pnic
	 */
	public com.vmware.vim25.PhysicalNicProfile[] getPnic() {
		return pnic;
	}

	/**
	 * Sets the pnic value for this NetworkProfile.
	 * 
	 * @param pnic
	 */
	public void setPnic(com.vmware.vim25.PhysicalNicProfile[] pnic) {
		this.pnic = pnic;
	}

	public com.vmware.vim25.PhysicalNicProfile getPnic(int i) {
		return this.pnic[i];
	}

	public void setPnic(int i, com.vmware.vim25.PhysicalNicProfile _value) {
		this.pnic[i] = _value;
	}

	/**
	 * Gets the dvswitch value for this NetworkProfile.
	 * 
	 * @return dvswitch
	 */
	public com.vmware.vim25.DvsProfile[] getDvswitch() {
		return dvswitch;
	}

	/**
	 * Sets the dvswitch value for this NetworkProfile.
	 * 
	 * @param dvswitch
	 */
	public void setDvswitch(com.vmware.vim25.DvsProfile[] dvswitch) {
		this.dvswitch = dvswitch;
	}

	public com.vmware.vim25.DvsProfile getDvswitch(int i) {
		return this.dvswitch[i];
	}

	public void setDvswitch(int i, com.vmware.vim25.DvsProfile _value) {
		this.dvswitch[i] = _value;
	}

	/**
	 * Gets the dvsServiceConsoleNic value for this NetworkProfile.
	 * 
	 * @return dvsServiceConsoleNic
	 */
	public com.vmware.vim25.DvsServiceConsoleVNicProfile[] getDvsServiceConsoleNic() {
		return dvsServiceConsoleNic;
	}

	/**
	 * Sets the dvsServiceConsoleNic value for this NetworkProfile.
	 * 
	 * @param dvsServiceConsoleNic
	 */
	public void setDvsServiceConsoleNic(
			com.vmware.vim25.DvsServiceConsoleVNicProfile[] dvsServiceConsoleNic) {
		this.dvsServiceConsoleNic = dvsServiceConsoleNic;
	}

	public com.vmware.vim25.DvsServiceConsoleVNicProfile getDvsServiceConsoleNic(
			int i) {
		return this.dvsServiceConsoleNic[i];
	}

	public void setDvsServiceConsoleNic(int i,
			com.vmware.vim25.DvsServiceConsoleVNicProfile _value) {
		this.dvsServiceConsoleNic[i] = _value;
	}

	/**
	 * Gets the dvsHostNic value for this NetworkProfile.
	 * 
	 * @return dvsHostNic
	 */
	public com.vmware.vim25.DvsHostVNicProfile[] getDvsHostNic() {
		return dvsHostNic;
	}

	/**
	 * Sets the dvsHostNic value for this NetworkProfile.
	 * 
	 * @param dvsHostNic
	 */
	public void setDvsHostNic(com.vmware.vim25.DvsHostVNicProfile[] dvsHostNic) {
		this.dvsHostNic = dvsHostNic;
	}

	public com.vmware.vim25.DvsHostVNicProfile getDvsHostNic(int i) {
		return this.dvsHostNic[i];
	}

	public void setDvsHostNic(int i, com.vmware.vim25.DvsHostVNicProfile _value) {
		this.dvsHostNic[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof NetworkProfile)) {
			return false;
		}
		NetworkProfile other = (NetworkProfile) obj;
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
				&& ((this.vswitch == null && other.getVswitch() == null) || (this.vswitch != null && java.util.Arrays
						.equals(this.vswitch, other.getVswitch())))
				&& ((this.vmPortGroup == null && other.getVmPortGroup() == null) || (this.vmPortGroup != null && java.util.Arrays
						.equals(this.vmPortGroup, other.getVmPortGroup())))
				&& ((this.hostPortGroup == null && other.getHostPortGroup() == null) || (this.hostPortGroup != null && java.util.Arrays
						.equals(this.hostPortGroup, other.getHostPortGroup())))
				&& ((this.serviceConsolePortGroup == null && other
						.getServiceConsolePortGroup() == null) || (this.serviceConsolePortGroup != null && java.util.Arrays
						.equals(this.serviceConsolePortGroup, other
								.getServiceConsolePortGroup())))
				&& ((this.dnsConfig == null && other.getDnsConfig() == null) || (this.dnsConfig != null && this.dnsConfig
						.equals(other.getDnsConfig())))
				&& ((this.ipRouteConfig == null && other.getIpRouteConfig() == null) || (this.ipRouteConfig != null && this.ipRouteConfig
						.equals(other.getIpRouteConfig())))
				&& ((this.consoleIpRouteConfig == null && other
						.getConsoleIpRouteConfig() == null) || (this.consoleIpRouteConfig != null && this.consoleIpRouteConfig
						.equals(other.getConsoleIpRouteConfig())))
				&& ((this.pnic == null && other.getPnic() == null) || (this.pnic != null && java.util.Arrays
						.equals(this.pnic, other.getPnic())))
				&& ((this.dvswitch == null && other.getDvswitch() == null) || (this.dvswitch != null && java.util.Arrays
						.equals(this.dvswitch, other.getDvswitch())))
				&& ((this.dvsServiceConsoleNic == null && other
						.getDvsServiceConsoleNic() == null) || (this.dvsServiceConsoleNic != null && java.util.Arrays
						.equals(this.dvsServiceConsoleNic, other
								.getDvsServiceConsoleNic())))
				&& ((this.dvsHostNic == null && other.getDvsHostNic() == null) || (this.dvsHostNic != null && java.util.Arrays
						.equals(this.dvsHostNic, other.getDvsHostNic())));
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
		if (getVswitch() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getVswitch()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVswitch(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getVmPortGroup() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getVmPortGroup()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVmPortGroup(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getHostPortGroup() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostPortGroup()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostPortGroup(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getServiceConsolePortGroup() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getServiceConsolePortGroup()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getServiceConsolePortGroup(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDnsConfig() != null) {
			_hashCode += getDnsConfig().hashCode();
		}
		if (getIpRouteConfig() != null) {
			_hashCode += getIpRouteConfig().hashCode();
		}
		if (getConsoleIpRouteConfig() != null) {
			_hashCode += getConsoleIpRouteConfig().hashCode();
		}
		if (getPnic() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getPnic()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getPnic(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDvswitch() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDvswitch()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDvswitch(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDvsServiceConsoleNic() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDvsServiceConsoleNic()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDvsServiceConsoleNic(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDvsHostNic() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDvsHostNic()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDvsHostNic(), i);
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
			NetworkProfile.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"NetworkProfile"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vswitch");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vswitch"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualSwitchProfile"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmPortGroup");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vmPortGroup"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmPortGroupProfile"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostPortGroup");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hostPortGroup"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPortGroupProfile"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serviceConsolePortGroup");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"serviceConsolePortGroup"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ServiceConsolePortGroupProfile"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dnsConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dnsConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"NetworkProfileDnsConfigProfile"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipRouteConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipRouteConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IpRouteProfile"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("consoleIpRouteConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"consoleIpRouteConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IpRouteProfile"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pnic");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnic"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PhysicalNicProfile"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dvswitch");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dvswitch"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DvsProfile"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dvsServiceConsoleNic");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dvsServiceConsoleNic"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DvsServiceConsoleVNicProfile"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dvsHostNic");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dvsHostNic"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DvsHostVNicProfile"));
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
