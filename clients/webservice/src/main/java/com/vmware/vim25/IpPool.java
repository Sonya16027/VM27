/**
 * IpPool.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class IpPool extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Integer id;

	private java.lang.String name;

	private com.vmware.vim25.IpPoolIpPoolConfigInfo ipv4Config;

	private com.vmware.vim25.IpPoolIpPoolConfigInfo ipv6Config;

	private java.lang.String dnsDomain;

	private java.lang.String dnsSearchPath;

	private java.lang.String hostPrefix;

	private java.lang.String httpProxy;

	private com.vmware.vim25.IpPoolAssociation[] networkAssociation;

	public IpPool() {
	}

	public IpPool(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.Integer id, java.lang.String name,
			com.vmware.vim25.IpPoolIpPoolConfigInfo ipv4Config,
			com.vmware.vim25.IpPoolIpPoolConfigInfo ipv6Config,
			java.lang.String dnsDomain, java.lang.String dnsSearchPath,
			java.lang.String hostPrefix, java.lang.String httpProxy,
			com.vmware.vim25.IpPoolAssociation[] networkAssociation) {
		super(dynamicType, dynamicProperty);
		this.id = id;
		this.name = name;
		this.ipv4Config = ipv4Config;
		this.ipv6Config = ipv6Config;
		this.dnsDomain = dnsDomain;
		this.dnsSearchPath = dnsSearchPath;
		this.hostPrefix = hostPrefix;
		this.httpProxy = httpProxy;
		this.networkAssociation = networkAssociation;
	}

	/**
	 * Gets the id value for this IpPool.
	 * 
	 * @return id
	 */
	public java.lang.Integer getId() {
		return id;
	}

	/**
	 * Sets the id value for this IpPool.
	 * 
	 * @param id
	 */
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	/**
	 * Gets the name value for this IpPool.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this IpPool.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the ipv4Config value for this IpPool.
	 * 
	 * @return ipv4Config
	 */
	public com.vmware.vim25.IpPoolIpPoolConfigInfo getIpv4Config() {
		return ipv4Config;
	}

	/**
	 * Sets the ipv4Config value for this IpPool.
	 * 
	 * @param ipv4Config
	 */
	public void setIpv4Config(com.vmware.vim25.IpPoolIpPoolConfigInfo ipv4Config) {
		this.ipv4Config = ipv4Config;
	}

	/**
	 * Gets the ipv6Config value for this IpPool.
	 * 
	 * @return ipv6Config
	 */
	public com.vmware.vim25.IpPoolIpPoolConfigInfo getIpv6Config() {
		return ipv6Config;
	}

	/**
	 * Sets the ipv6Config value for this IpPool.
	 * 
	 * @param ipv6Config
	 */
	public void setIpv6Config(com.vmware.vim25.IpPoolIpPoolConfigInfo ipv6Config) {
		this.ipv6Config = ipv6Config;
	}

	/**
	 * Gets the dnsDomain value for this IpPool.
	 * 
	 * @return dnsDomain
	 */
	public java.lang.String getDnsDomain() {
		return dnsDomain;
	}

	/**
	 * Sets the dnsDomain value for this IpPool.
	 * 
	 * @param dnsDomain
	 */
	public void setDnsDomain(java.lang.String dnsDomain) {
		this.dnsDomain = dnsDomain;
	}

	/**
	 * Gets the dnsSearchPath value for this IpPool.
	 * 
	 * @return dnsSearchPath
	 */
	public java.lang.String getDnsSearchPath() {
		return dnsSearchPath;
	}

	/**
	 * Sets the dnsSearchPath value for this IpPool.
	 * 
	 * @param dnsSearchPath
	 */
	public void setDnsSearchPath(java.lang.String dnsSearchPath) {
		this.dnsSearchPath = dnsSearchPath;
	}

	/**
	 * Gets the hostPrefix value for this IpPool.
	 * 
	 * @return hostPrefix
	 */
	public java.lang.String getHostPrefix() {
		return hostPrefix;
	}

	/**
	 * Sets the hostPrefix value for this IpPool.
	 * 
	 * @param hostPrefix
	 */
	public void setHostPrefix(java.lang.String hostPrefix) {
		this.hostPrefix = hostPrefix;
	}

	/**
	 * Gets the httpProxy value for this IpPool.
	 * 
	 * @return httpProxy
	 */
	public java.lang.String getHttpProxy() {
		return httpProxy;
	}

	/**
	 * Sets the httpProxy value for this IpPool.
	 * 
	 * @param httpProxy
	 */
	public void setHttpProxy(java.lang.String httpProxy) {
		this.httpProxy = httpProxy;
	}

	/**
	 * Gets the networkAssociation value for this IpPool.
	 * 
	 * @return networkAssociation
	 */
	public com.vmware.vim25.IpPoolAssociation[] getNetworkAssociation() {
		return networkAssociation;
	}

	/**
	 * Sets the networkAssociation value for this IpPool.
	 * 
	 * @param networkAssociation
	 */
	public void setNetworkAssociation(
			com.vmware.vim25.IpPoolAssociation[] networkAssociation) {
		this.networkAssociation = networkAssociation;
	}

	public com.vmware.vim25.IpPoolAssociation getNetworkAssociation(int i) {
		return this.networkAssociation[i];
	}

	public void setNetworkAssociation(int i,
			com.vmware.vim25.IpPoolAssociation _value) {
		this.networkAssociation[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IpPool)) {
			return false;
		}
		IpPool other = (IpPool) obj;
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
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id
						.equals(other.getId())))
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.ipv4Config == null && other.getIpv4Config() == null) || (this.ipv4Config != null && this.ipv4Config
						.equals(other.getIpv4Config())))
				&& ((this.ipv6Config == null && other.getIpv6Config() == null) || (this.ipv6Config != null && this.ipv6Config
						.equals(other.getIpv6Config())))
				&& ((this.dnsDomain == null && other.getDnsDomain() == null) || (this.dnsDomain != null && this.dnsDomain
						.equals(other.getDnsDomain())))
				&& ((this.dnsSearchPath == null && other.getDnsSearchPath() == null) || (this.dnsSearchPath != null && this.dnsSearchPath
						.equals(other.getDnsSearchPath())))
				&& ((this.hostPrefix == null && other.getHostPrefix() == null) || (this.hostPrefix != null && this.hostPrefix
						.equals(other.getHostPrefix())))
				&& ((this.httpProxy == null && other.getHttpProxy() == null) || (this.httpProxy != null && this.httpProxy
						.equals(other.getHttpProxy())))
				&& ((this.networkAssociation == null && other
						.getNetworkAssociation() == null) || (this.networkAssociation != null && java.util.Arrays
						.equals(this.networkAssociation, other
								.getNetworkAssociation())));
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
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getIpv4Config() != null) {
			_hashCode += getIpv4Config().hashCode();
		}
		if (getIpv6Config() != null) {
			_hashCode += getIpv6Config().hashCode();
		}
		if (getDnsDomain() != null) {
			_hashCode += getDnsDomain().hashCode();
		}
		if (getDnsSearchPath() != null) {
			_hashCode += getDnsSearchPath().hashCode();
		}
		if (getHostPrefix() != null) {
			_hashCode += getHostPrefix().hashCode();
		}
		if (getHttpProxy() != null) {
			_hashCode += getHttpProxy().hashCode();
		}
		if (getNetworkAssociation() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getNetworkAssociation()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getNetworkAssociation(), i);
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
			IpPool.class, true);

	static {
		typeDesc
				.setXmlType(new javax.xml.namespace.QName("urn:vim25", "IpPool"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipv4Config");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipv4Config"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IpPoolIpPoolConfigInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipv6Config");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipv6Config"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IpPoolIpPoolConfigInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dnsDomain");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dnsDomain"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dnsSearchPath");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dnsSearchPath"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostPrefix");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hostPrefix"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("httpProxy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"httpProxy"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("networkAssociation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"networkAssociation"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IpPoolAssociation"));
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
