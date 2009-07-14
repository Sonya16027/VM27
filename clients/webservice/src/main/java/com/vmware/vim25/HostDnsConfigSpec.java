/**
 * HostDnsConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDnsConfigSpec extends com.vmware.vim25.HostDnsConfig implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostVirtualNicConnection virtualNicConnection;

	public HostDnsConfigSpec() {
	}

	public HostDnsConfigSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, boolean dhcp,
			java.lang.String virtualNicDevice, java.lang.String hostName,
			java.lang.String domainName, java.lang.String[] address,
			java.lang.String[] searchDomain,
			com.vmware.vim25.HostVirtualNicConnection virtualNicConnection) {
		super(dynamicType, dynamicProperty, dhcp, virtualNicDevice, hostName,
				domainName, address, searchDomain);
		this.virtualNicConnection = virtualNicConnection;
	}

	/**
	 * Gets the virtualNicConnection value for this HostDnsConfigSpec.
	 * 
	 * @return virtualNicConnection
	 */
	public com.vmware.vim25.HostVirtualNicConnection getVirtualNicConnection() {
		return virtualNicConnection;
	}

	/**
	 * Sets the virtualNicConnection value for this HostDnsConfigSpec.
	 * 
	 * @param virtualNicConnection
	 */
	public void setVirtualNicConnection(
			com.vmware.vim25.HostVirtualNicConnection virtualNicConnection) {
		this.virtualNicConnection = virtualNicConnection;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostDnsConfigSpec)) {
			return false;
		}
		HostDnsConfigSpec other = (HostDnsConfigSpec) obj;
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
				&& ((this.virtualNicConnection == null && other
						.getVirtualNicConnection() == null) || (this.virtualNicConnection != null && this.virtualNicConnection
						.equals(other.getVirtualNicConnection())));
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
		if (getVirtualNicConnection() != null) {
			_hashCode += getVirtualNicConnection().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostDnsConfigSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDnsConfigSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("virtualNicConnection");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"virtualNicConnection"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostVirtualNicConnection"));
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
