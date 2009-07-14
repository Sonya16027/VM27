/**
 * PhysicalNicCdpDeviceCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PhysicalNicCdpDeviceCapability extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean router;

	private boolean transparentBridge;

	private boolean sourceRouteBridge;

	private boolean networkSwitch;

	private boolean host;

	private boolean igmpEnabled;

	private boolean repeater;

	public PhysicalNicCdpDeviceCapability() {
	}

	public PhysicalNicCdpDeviceCapability(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, boolean router,
			boolean transparentBridge, boolean sourceRouteBridge,
			boolean networkSwitch, boolean host, boolean igmpEnabled,
			boolean repeater) {
		super(dynamicType, dynamicProperty);
		this.router = router;
		this.transparentBridge = transparentBridge;
		this.sourceRouteBridge = sourceRouteBridge;
		this.networkSwitch = networkSwitch;
		this.host = host;
		this.igmpEnabled = igmpEnabled;
		this.repeater = repeater;
	}

	/**
	 * Gets the router value for this PhysicalNicCdpDeviceCapability.
	 * 
	 * @return router
	 */
	public boolean isRouter() {
		return router;
	}

	/**
	 * Sets the router value for this PhysicalNicCdpDeviceCapability.
	 * 
	 * @param router
	 */
	public void setRouter(boolean router) {
		this.router = router;
	}

	/**
	 * Gets the transparentBridge value for this PhysicalNicCdpDeviceCapability.
	 * 
	 * @return transparentBridge
	 */
	public boolean isTransparentBridge() {
		return transparentBridge;
	}

	/**
	 * Sets the transparentBridge value for this PhysicalNicCdpDeviceCapability.
	 * 
	 * @param transparentBridge
	 */
	public void setTransparentBridge(boolean transparentBridge) {
		this.transparentBridge = transparentBridge;
	}

	/**
	 * Gets the sourceRouteBridge value for this PhysicalNicCdpDeviceCapability.
	 * 
	 * @return sourceRouteBridge
	 */
	public boolean isSourceRouteBridge() {
		return sourceRouteBridge;
	}

	/**
	 * Sets the sourceRouteBridge value for this PhysicalNicCdpDeviceCapability.
	 * 
	 * @param sourceRouteBridge
	 */
	public void setSourceRouteBridge(boolean sourceRouteBridge) {
		this.sourceRouteBridge = sourceRouteBridge;
	}

	/**
	 * Gets the networkSwitch value for this PhysicalNicCdpDeviceCapability.
	 * 
	 * @return networkSwitch
	 */
	public boolean isNetworkSwitch() {
		return networkSwitch;
	}

	/**
	 * Sets the networkSwitch value for this PhysicalNicCdpDeviceCapability.
	 * 
	 * @param networkSwitch
	 */
	public void setNetworkSwitch(boolean networkSwitch) {
		this.networkSwitch = networkSwitch;
	}

	/**
	 * Gets the host value for this PhysicalNicCdpDeviceCapability.
	 * 
	 * @return host
	 */
	public boolean isHost() {
		return host;
	}

	/**
	 * Sets the host value for this PhysicalNicCdpDeviceCapability.
	 * 
	 * @param host
	 */
	public void setHost(boolean host) {
		this.host = host;
	}

	/**
	 * Gets the igmpEnabled value for this PhysicalNicCdpDeviceCapability.
	 * 
	 * @return igmpEnabled
	 */
	public boolean isIgmpEnabled() {
		return igmpEnabled;
	}

	/**
	 * Sets the igmpEnabled value for this PhysicalNicCdpDeviceCapability.
	 * 
	 * @param igmpEnabled
	 */
	public void setIgmpEnabled(boolean igmpEnabled) {
		this.igmpEnabled = igmpEnabled;
	}

	/**
	 * Gets the repeater value for this PhysicalNicCdpDeviceCapability.
	 * 
	 * @return repeater
	 */
	public boolean isRepeater() {
		return repeater;
	}

	/**
	 * Sets the repeater value for this PhysicalNicCdpDeviceCapability.
	 * 
	 * @param repeater
	 */
	public void setRepeater(boolean repeater) {
		this.repeater = repeater;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof PhysicalNicCdpDeviceCapability)) {
			return false;
		}
		PhysicalNicCdpDeviceCapability other = (PhysicalNicCdpDeviceCapability) obj;
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
		_equals = super.equals(obj) && this.router == other.isRouter()
				&& this.transparentBridge == other.isTransparentBridge()
				&& this.sourceRouteBridge == other.isSourceRouteBridge()
				&& this.networkSwitch == other.isNetworkSwitch()
				&& this.host == other.isHost()
				&& this.igmpEnabled == other.isIgmpEnabled()
				&& this.repeater == other.isRepeater();
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
		_hashCode += (isRouter() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isTransparentBridge() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isSourceRouteBridge() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isNetworkSwitch() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isHost() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isIgmpEnabled() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isRepeater() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			PhysicalNicCdpDeviceCapability.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"PhysicalNicCdpDeviceCapability"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("router");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"router"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("transparentBridge");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"transparentBridge"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sourceRouteBridge");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sourceRouteBridge"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("networkSwitch");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"networkSwitch"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("igmpEnabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"igmpEnabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("repeater");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"repeater"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
