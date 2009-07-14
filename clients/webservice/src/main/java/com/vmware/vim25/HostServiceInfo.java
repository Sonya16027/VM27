/**
 * HostServiceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostServiceInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostService[] service;

	public HostServiceInfo() {
	}

	public HostServiceInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.HostService[] service) {
		super(dynamicType, dynamicProperty);
		this.service = service;
	}

	/**
	 * Gets the service value for this HostServiceInfo.
	 * 
	 * @return service
	 */
	public com.vmware.vim25.HostService[] getService() {
		return service;
	}

	/**
	 * Sets the service value for this HostServiceInfo.
	 * 
	 * @param service
	 */
	public void setService(com.vmware.vim25.HostService[] service) {
		this.service = service;
	}

	public com.vmware.vim25.HostService getService(int i) {
		return this.service[i];
	}

	public void setService(int i, com.vmware.vim25.HostService _value) {
		this.service[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostServiceInfo)) {
			return false;
		}
		HostServiceInfo other = (HostServiceInfo) obj;
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
				&& ((this.service == null && other.getService() == null) || (this.service != null && java.util.Arrays
						.equals(this.service, other.getService())));
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
		if (getService() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getService()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getService(), i);
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
			HostServiceInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostServiceInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("service");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"service"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostService"));
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
