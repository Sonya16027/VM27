/**
 * HostBootDeviceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostBootDeviceInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.HostBootDevice[] bootDevices;

	private java.lang.String currentBootDeviceKey;

	public HostBootDeviceInfo() {
	}

	public HostBootDeviceInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.HostBootDevice[] bootDevices,
			java.lang.String currentBootDeviceKey) {
		super(dynamicType, dynamicProperty);
		this.bootDevices = bootDevices;
		this.currentBootDeviceKey = currentBootDeviceKey;
	}

	/**
	 * Gets the bootDevices value for this HostBootDeviceInfo.
	 * 
	 * @return bootDevices
	 */
	public com.vmware.vim25.HostBootDevice[] getBootDevices() {
		return bootDevices;
	}

	/**
	 * Sets the bootDevices value for this HostBootDeviceInfo.
	 * 
	 * @param bootDevices
	 */
	public void setBootDevices(com.vmware.vim25.HostBootDevice[] bootDevices) {
		this.bootDevices = bootDevices;
	}

	public com.vmware.vim25.HostBootDevice getBootDevices(int i) {
		return this.bootDevices[i];
	}

	public void setBootDevices(int i, com.vmware.vim25.HostBootDevice _value) {
		this.bootDevices[i] = _value;
	}

	/**
	 * Gets the currentBootDeviceKey value for this HostBootDeviceInfo.
	 * 
	 * @return currentBootDeviceKey
	 */
	public java.lang.String getCurrentBootDeviceKey() {
		return currentBootDeviceKey;
	}

	/**
	 * Sets the currentBootDeviceKey value for this HostBootDeviceInfo.
	 * 
	 * @param currentBootDeviceKey
	 */
	public void setCurrentBootDeviceKey(java.lang.String currentBootDeviceKey) {
		this.currentBootDeviceKey = currentBootDeviceKey;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostBootDeviceInfo)) {
			return false;
		}
		HostBootDeviceInfo other = (HostBootDeviceInfo) obj;
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
				&& ((this.bootDevices == null && other.getBootDevices() == null) || (this.bootDevices != null && java.util.Arrays
						.equals(this.bootDevices, other.getBootDevices())))
				&& ((this.currentBootDeviceKey == null && other
						.getCurrentBootDeviceKey() == null) || (this.currentBootDeviceKey != null && this.currentBootDeviceKey
						.equals(other.getCurrentBootDeviceKey())));
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
		if (getBootDevices() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getBootDevices()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getBootDevices(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getCurrentBootDeviceKey() != null) {
			_hashCode += getCurrentBootDeviceKey().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostBootDeviceInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostBootDeviceInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("bootDevices");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"bootDevices"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostBootDevice"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("currentBootDeviceKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"currentBootDeviceKey"));
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
