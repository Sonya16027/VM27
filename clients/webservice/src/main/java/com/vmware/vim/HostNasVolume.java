/**
 * HostNasVolume.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostNasVolume extends com.vmware.vim.HostFileSystemVolume
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String remoteHost;

	private java.lang.String remotePath;

	public HostNasVolume() {
	}

	public HostNasVolume(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String type, java.lang.String name, long capacity,
			java.lang.String remoteHost, java.lang.String remotePath) {
		super(dynamicType, dynamicProperty, type, name, capacity);
		this.remoteHost = remoteHost;
		this.remotePath = remotePath;
	}

	/**
	 * Gets the remoteHost value for this HostNasVolume.
	 * 
	 * @return remoteHost
	 */
	public java.lang.String getRemoteHost() {
		return remoteHost;
	}

	/**
	 * Sets the remoteHost value for this HostNasVolume.
	 * 
	 * @param remoteHost
	 */
	public void setRemoteHost(java.lang.String remoteHost) {
		this.remoteHost = remoteHost;
	}

	/**
	 * Gets the remotePath value for this HostNasVolume.
	 * 
	 * @return remotePath
	 */
	public java.lang.String getRemotePath() {
		return remotePath;
	}

	/**
	 * Sets the remotePath value for this HostNasVolume.
	 * 
	 * @param remotePath
	 */
	public void setRemotePath(java.lang.String remotePath) {
		this.remotePath = remotePath;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostNasVolume)) {
			return false;
		}
		HostNasVolume other = (HostNasVolume) obj;
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
				&& ((this.remoteHost == null && other.getRemoteHost() == null) || (this.remoteHost != null && this.remoteHost
						.equals(other.getRemoteHost())))
				&& ((this.remotePath == null && other.getRemotePath() == null) || (this.remotePath != null && this.remotePath
						.equals(other.getRemotePath())));
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
		if (getRemoteHost() != null) {
			_hashCode += getRemoteHost().hashCode();
		}
		if (getRemotePath() != null) {
			_hashCode += getRemotePath().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostNasVolume.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostNasVolume"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("remoteHost");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"remoteHost"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("remotePath");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"remotePath"));
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
