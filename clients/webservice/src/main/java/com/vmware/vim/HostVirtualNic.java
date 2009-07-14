/**
 * HostVirtualNic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostVirtualNic extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String device;

	private java.lang.String key;

	private java.lang.String portgroup;

	private com.vmware.vim.HostVirtualNicSpec spec;

	private java.lang.String port;

	public HostVirtualNic() {
	}

	public HostVirtualNic(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String device, java.lang.String key,
			java.lang.String portgroup, com.vmware.vim.HostVirtualNicSpec spec,
			java.lang.String port) {
		super(dynamicType, dynamicProperty);
		this.device = device;
		this.key = key;
		this.portgroup = portgroup;
		this.spec = spec;
		this.port = port;
	}

	/**
	 * Gets the device value for this HostVirtualNic.
	 * 
	 * @return device
	 */
	public java.lang.String getDevice() {
		return device;
	}

	/**
	 * Sets the device value for this HostVirtualNic.
	 * 
	 * @param device
	 */
	public void setDevice(java.lang.String device) {
		this.device = device;
	}

	/**
	 * Gets the key value for this HostVirtualNic.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this HostVirtualNic.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the portgroup value for this HostVirtualNic.
	 * 
	 * @return portgroup
	 */
	public java.lang.String getPortgroup() {
		return portgroup;
	}

	/**
	 * Sets the portgroup value for this HostVirtualNic.
	 * 
	 * @param portgroup
	 */
	public void setPortgroup(java.lang.String portgroup) {
		this.portgroup = portgroup;
	}

	/**
	 * Gets the spec value for this HostVirtualNic.
	 * 
	 * @return spec
	 */
	public com.vmware.vim.HostVirtualNicSpec getSpec() {
		return spec;
	}

	/**
	 * Sets the spec value for this HostVirtualNic.
	 * 
	 * @param spec
	 */
	public void setSpec(com.vmware.vim.HostVirtualNicSpec spec) {
		this.spec = spec;
	}

	/**
	 * Gets the port value for this HostVirtualNic.
	 * 
	 * @return port
	 */
	public java.lang.String getPort() {
		return port;
	}

	/**
	 * Sets the port value for this HostVirtualNic.
	 * 
	 * @param port
	 */
	public void setPort(java.lang.String port) {
		this.port = port;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostVirtualNic)) {
			return false;
		}
		HostVirtualNic other = (HostVirtualNic) obj;
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
				&& ((this.device == null && other.getDevice() == null) || (this.device != null && this.device
						.equals(other.getDevice())))
				&& ((this.key == null && other.getKey() == null) || (this.key != null && this.key
						.equals(other.getKey())))
				&& ((this.portgroup == null && other.getPortgroup() == null) || (this.portgroup != null && this.portgroup
						.equals(other.getPortgroup())))
				&& ((this.spec == null && other.getSpec() == null) || (this.spec != null && this.spec
						.equals(other.getSpec())))
				&& ((this.port == null && other.getPort() == null) || (this.port != null && this.port
						.equals(other.getPort())));
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
		if (getDevice() != null) {
			_hashCode += getDevice().hashCode();
		}
		if (getKey() != null) {
			_hashCode += getKey().hashCode();
		}
		if (getPortgroup() != null) {
			_hashCode += getPortgroup().hashCode();
		}
		if (getSpec() != null) {
			_hashCode += getSpec().hashCode();
		}
		if (getPort() != null) {
			_hashCode += getPort().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostVirtualNic.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostVirtualNic"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("device");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "device"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portgroup");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"portgroup"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("spec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "spec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostVirtualNicSpec"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("port");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "port"));
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
