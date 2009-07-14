/**
 * VirtualDeviceConnectOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualDeviceConnectOption extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.BoolOption startConnected;

	private com.vmware.vim25.BoolOption allowGuestControl;

	public VirtualDeviceConnectOption() {
	}

	public VirtualDeviceConnectOption(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.BoolOption startConnected,
			com.vmware.vim25.BoolOption allowGuestControl) {
		super(dynamicType, dynamicProperty);
		this.startConnected = startConnected;
		this.allowGuestControl = allowGuestControl;
	}

	/**
	 * Gets the startConnected value for this VirtualDeviceConnectOption.
	 * 
	 * @return startConnected
	 */
	public com.vmware.vim25.BoolOption getStartConnected() {
		return startConnected;
	}

	/**
	 * Sets the startConnected value for this VirtualDeviceConnectOption.
	 * 
	 * @param startConnected
	 */
	public void setStartConnected(com.vmware.vim25.BoolOption startConnected) {
		this.startConnected = startConnected;
	}

	/**
	 * Gets the allowGuestControl value for this VirtualDeviceConnectOption.
	 * 
	 * @return allowGuestControl
	 */
	public com.vmware.vim25.BoolOption getAllowGuestControl() {
		return allowGuestControl;
	}

	/**
	 * Sets the allowGuestControl value for this VirtualDeviceConnectOption.
	 * 
	 * @param allowGuestControl
	 */
	public void setAllowGuestControl(
			com.vmware.vim25.BoolOption allowGuestControl) {
		this.allowGuestControl = allowGuestControl;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualDeviceConnectOption)) {
			return false;
		}
		VirtualDeviceConnectOption other = (VirtualDeviceConnectOption) obj;
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
				&& ((this.startConnected == null && other.getStartConnected() == null) || (this.startConnected != null && this.startConnected
						.equals(other.getStartConnected())))
				&& ((this.allowGuestControl == null && other
						.getAllowGuestControl() == null) || (this.allowGuestControl != null && this.allowGuestControl
						.equals(other.getAllowGuestControl())));
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
		if (getStartConnected() != null) {
			_hashCode += getStartConnected().hashCode();
		}
		if (getAllowGuestControl() != null) {
			_hashCode += getAllowGuestControl().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualDeviceConnectOption.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualDeviceConnectOption"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("startConnected");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"startConnected"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"BoolOption"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("allowGuestControl");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"allowGuestControl"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"BoolOption"));
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
