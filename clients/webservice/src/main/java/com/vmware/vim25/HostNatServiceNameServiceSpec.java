/**
 * HostNatServiceNameServiceSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostNatServiceNameServiceSpec extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean dnsAutoDetect;

	private java.lang.String dnsPolicy;

	private int dnsRetries;

	private int dnsTimeout;

	private java.lang.String[] dnsNameServer;

	private int nbdsTimeout;

	private int nbnsRetries;

	private int nbnsTimeout;

	public HostNatServiceNameServiceSpec() {
	}

	public HostNatServiceNameServiceSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			boolean dnsAutoDetect, java.lang.String dnsPolicy, int dnsRetries,
			int dnsTimeout, java.lang.String[] dnsNameServer, int nbdsTimeout,
			int nbnsRetries, int nbnsTimeout) {
		super(dynamicType, dynamicProperty);
		this.dnsAutoDetect = dnsAutoDetect;
		this.dnsPolicy = dnsPolicy;
		this.dnsRetries = dnsRetries;
		this.dnsTimeout = dnsTimeout;
		this.dnsNameServer = dnsNameServer;
		this.nbdsTimeout = nbdsTimeout;
		this.nbnsRetries = nbnsRetries;
		this.nbnsTimeout = nbnsTimeout;
	}

	/**
	 * Gets the dnsAutoDetect value for this HostNatServiceNameServiceSpec.
	 * 
	 * @return dnsAutoDetect
	 */
	public boolean isDnsAutoDetect() {
		return dnsAutoDetect;
	}

	/**
	 * Sets the dnsAutoDetect value for this HostNatServiceNameServiceSpec.
	 * 
	 * @param dnsAutoDetect
	 */
	public void setDnsAutoDetect(boolean dnsAutoDetect) {
		this.dnsAutoDetect = dnsAutoDetect;
	}

	/**
	 * Gets the dnsPolicy value for this HostNatServiceNameServiceSpec.
	 * 
	 * @return dnsPolicy
	 */
	public java.lang.String getDnsPolicy() {
		return dnsPolicy;
	}

	/**
	 * Sets the dnsPolicy value for this HostNatServiceNameServiceSpec.
	 * 
	 * @param dnsPolicy
	 */
	public void setDnsPolicy(java.lang.String dnsPolicy) {
		this.dnsPolicy = dnsPolicy;
	}

	/**
	 * Gets the dnsRetries value for this HostNatServiceNameServiceSpec.
	 * 
	 * @return dnsRetries
	 */
	public int getDnsRetries() {
		return dnsRetries;
	}

	/**
	 * Sets the dnsRetries value for this HostNatServiceNameServiceSpec.
	 * 
	 * @param dnsRetries
	 */
	public void setDnsRetries(int dnsRetries) {
		this.dnsRetries = dnsRetries;
	}

	/**
	 * Gets the dnsTimeout value for this HostNatServiceNameServiceSpec.
	 * 
	 * @return dnsTimeout
	 */
	public int getDnsTimeout() {
		return dnsTimeout;
	}

	/**
	 * Sets the dnsTimeout value for this HostNatServiceNameServiceSpec.
	 * 
	 * @param dnsTimeout
	 */
	public void setDnsTimeout(int dnsTimeout) {
		this.dnsTimeout = dnsTimeout;
	}

	/**
	 * Gets the dnsNameServer value for this HostNatServiceNameServiceSpec.
	 * 
	 * @return dnsNameServer
	 */
	public java.lang.String[] getDnsNameServer() {
		return dnsNameServer;
	}

	/**
	 * Sets the dnsNameServer value for this HostNatServiceNameServiceSpec.
	 * 
	 * @param dnsNameServer
	 */
	public void setDnsNameServer(java.lang.String[] dnsNameServer) {
		this.dnsNameServer = dnsNameServer;
	}

	public java.lang.String getDnsNameServer(int i) {
		return this.dnsNameServer[i];
	}

	public void setDnsNameServer(int i, java.lang.String _value) {
		this.dnsNameServer[i] = _value;
	}

	/**
	 * Gets the nbdsTimeout value for this HostNatServiceNameServiceSpec.
	 * 
	 * @return nbdsTimeout
	 */
	public int getNbdsTimeout() {
		return nbdsTimeout;
	}

	/**
	 * Sets the nbdsTimeout value for this HostNatServiceNameServiceSpec.
	 * 
	 * @param nbdsTimeout
	 */
	public void setNbdsTimeout(int nbdsTimeout) {
		this.nbdsTimeout = nbdsTimeout;
	}

	/**
	 * Gets the nbnsRetries value for this HostNatServiceNameServiceSpec.
	 * 
	 * @return nbnsRetries
	 */
	public int getNbnsRetries() {
		return nbnsRetries;
	}

	/**
	 * Sets the nbnsRetries value for this HostNatServiceNameServiceSpec.
	 * 
	 * @param nbnsRetries
	 */
	public void setNbnsRetries(int nbnsRetries) {
		this.nbnsRetries = nbnsRetries;
	}

	/**
	 * Gets the nbnsTimeout value for this HostNatServiceNameServiceSpec.
	 * 
	 * @return nbnsTimeout
	 */
	public int getNbnsTimeout() {
		return nbnsTimeout;
	}

	/**
	 * Sets the nbnsTimeout value for this HostNatServiceNameServiceSpec.
	 * 
	 * @param nbnsTimeout
	 */
	public void setNbnsTimeout(int nbnsTimeout) {
		this.nbnsTimeout = nbnsTimeout;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostNatServiceNameServiceSpec)) {
			return false;
		}
		HostNatServiceNameServiceSpec other = (HostNatServiceNameServiceSpec) obj;
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
				&& this.dnsAutoDetect == other.isDnsAutoDetect()
				&& ((this.dnsPolicy == null && other.getDnsPolicy() == null) || (this.dnsPolicy != null && this.dnsPolicy
						.equals(other.getDnsPolicy())))
				&& this.dnsRetries == other.getDnsRetries()
				&& this.dnsTimeout == other.getDnsTimeout()
				&& ((this.dnsNameServer == null && other.getDnsNameServer() == null) || (this.dnsNameServer != null && java.util.Arrays
						.equals(this.dnsNameServer, other.getDnsNameServer())))
				&& this.nbdsTimeout == other.getNbdsTimeout()
				&& this.nbnsRetries == other.getNbnsRetries()
				&& this.nbnsTimeout == other.getNbnsTimeout();
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
		_hashCode += (isDnsAutoDetect() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getDnsPolicy() != null) {
			_hashCode += getDnsPolicy().hashCode();
		}
		_hashCode += getDnsRetries();
		_hashCode += getDnsTimeout();
		if (getDnsNameServer() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDnsNameServer()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDnsNameServer(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += getNbdsTimeout();
		_hashCode += getNbnsRetries();
		_hashCode += getNbnsTimeout();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostNatServiceNameServiceSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostNatServiceNameServiceSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dnsAutoDetect");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dnsAutoDetect"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dnsPolicy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dnsPolicy"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dnsRetries");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dnsRetries"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dnsTimeout");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dnsTimeout"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dnsNameServer");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dnsNameServer"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nbdsTimeout");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"nbdsTimeout"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nbnsRetries");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"nbnsRetries"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nbnsTimeout");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"nbnsTimeout"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
