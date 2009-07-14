/**
 * HostNasVolumeSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostNasVolumeSpec extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String remoteHost;

	private java.lang.String remotePath;

	private java.lang.String localPath;

	private java.lang.String accessMode;

	private java.lang.String type;

	private java.lang.String userName;

	private java.lang.String password;

	public HostNasVolumeSpec() {
	}

	public HostNasVolumeSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String remoteHost, java.lang.String remotePath,
			java.lang.String localPath, java.lang.String accessMode,
			java.lang.String type, java.lang.String userName,
			java.lang.String password) {
		super(dynamicType, dynamicProperty);
		this.remoteHost = remoteHost;
		this.remotePath = remotePath;
		this.localPath = localPath;
		this.accessMode = accessMode;
		this.type = type;
		this.userName = userName;
		this.password = password;
	}

	/**
	 * Gets the remoteHost value for this HostNasVolumeSpec.
	 * 
	 * @return remoteHost
	 */
	public java.lang.String getRemoteHost() {
		return remoteHost;
	}

	/**
	 * Sets the remoteHost value for this HostNasVolumeSpec.
	 * 
	 * @param remoteHost
	 */
	public void setRemoteHost(java.lang.String remoteHost) {
		this.remoteHost = remoteHost;
	}

	/**
	 * Gets the remotePath value for this HostNasVolumeSpec.
	 * 
	 * @return remotePath
	 */
	public java.lang.String getRemotePath() {
		return remotePath;
	}

	/**
	 * Sets the remotePath value for this HostNasVolumeSpec.
	 * 
	 * @param remotePath
	 */
	public void setRemotePath(java.lang.String remotePath) {
		this.remotePath = remotePath;
	}

	/**
	 * Gets the localPath value for this HostNasVolumeSpec.
	 * 
	 * @return localPath
	 */
	public java.lang.String getLocalPath() {
		return localPath;
	}

	/**
	 * Sets the localPath value for this HostNasVolumeSpec.
	 * 
	 * @param localPath
	 */
	public void setLocalPath(java.lang.String localPath) {
		this.localPath = localPath;
	}

	/**
	 * Gets the accessMode value for this HostNasVolumeSpec.
	 * 
	 * @return accessMode
	 */
	public java.lang.String getAccessMode() {
		return accessMode;
	}

	/**
	 * Sets the accessMode value for this HostNasVolumeSpec.
	 * 
	 * @param accessMode
	 */
	public void setAccessMode(java.lang.String accessMode) {
		this.accessMode = accessMode;
	}

	/**
	 * Gets the type value for this HostNasVolumeSpec.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this HostNasVolumeSpec.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the userName value for this HostNasVolumeSpec.
	 * 
	 * @return userName
	 */
	public java.lang.String getUserName() {
		return userName;
	}

	/**
	 * Sets the userName value for this HostNasVolumeSpec.
	 * 
	 * @param userName
	 */
	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the password value for this HostNasVolumeSpec.
	 * 
	 * @return password
	 */
	public java.lang.String getPassword() {
		return password;
	}

	/**
	 * Sets the password value for this HostNasVolumeSpec.
	 * 
	 * @param password
	 */
	public void setPassword(java.lang.String password) {
		this.password = password;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostNasVolumeSpec)) {
			return false;
		}
		HostNasVolumeSpec other = (HostNasVolumeSpec) obj;
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
						.equals(other.getRemotePath())))
				&& ((this.localPath == null && other.getLocalPath() == null) || (this.localPath != null && this.localPath
						.equals(other.getLocalPath())))
				&& ((this.accessMode == null && other.getAccessMode() == null) || (this.accessMode != null && this.accessMode
						.equals(other.getAccessMode())))
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& ((this.userName == null && other.getUserName() == null) || (this.userName != null && this.userName
						.equals(other.getUserName())))
				&& ((this.password == null && other.getPassword() == null) || (this.password != null && this.password
						.equals(other.getPassword())));
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
		if (getLocalPath() != null) {
			_hashCode += getLocalPath().hashCode();
		}
		if (getAccessMode() != null) {
			_hashCode += getAccessMode().hashCode();
		}
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getUserName() != null) {
			_hashCode += getUserName().hashCode();
		}
		if (getPassword() != null) {
			_hashCode += getPassword().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostNasVolumeSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostNasVolumeSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("remoteHost");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"remoteHost"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("remotePath");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"remotePath"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("localPath");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"localPath"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("accessMode");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"accessMode"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("userName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"userName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("password");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"password"));
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
