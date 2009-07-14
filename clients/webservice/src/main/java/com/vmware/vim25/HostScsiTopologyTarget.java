/**
 * HostScsiTopologyTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostScsiTopologyTarget extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String key;

	private int target;

	private com.vmware.vim25.HostScsiTopologyLun[] lun;

	private com.vmware.vim25.HostTargetTransport transport;

	public HostScsiTopologyTarget() {
	}

	public HostScsiTopologyTarget(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String key, int target,
			com.vmware.vim25.HostScsiTopologyLun[] lun,
			com.vmware.vim25.HostTargetTransport transport) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.target = target;
		this.lun = lun;
		this.transport = transport;
	}

	/**
	 * Gets the key value for this HostScsiTopologyTarget.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this HostScsiTopologyTarget.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the target value for this HostScsiTopologyTarget.
	 * 
	 * @return target
	 */
	public int getTarget() {
		return target;
	}

	/**
	 * Sets the target value for this HostScsiTopologyTarget.
	 * 
	 * @param target
	 */
	public void setTarget(int target) {
		this.target = target;
	}

	/**
	 * Gets the lun value for this HostScsiTopologyTarget.
	 * 
	 * @return lun
	 */
	public com.vmware.vim25.HostScsiTopologyLun[] getLun() {
		return lun;
	}

	/**
	 * Sets the lun value for this HostScsiTopologyTarget.
	 * 
	 * @param lun
	 */
	public void setLun(com.vmware.vim25.HostScsiTopologyLun[] lun) {
		this.lun = lun;
	}

	public com.vmware.vim25.HostScsiTopologyLun getLun(int i) {
		return this.lun[i];
	}

	public void setLun(int i, com.vmware.vim25.HostScsiTopologyLun _value) {
		this.lun[i] = _value;
	}

	/**
	 * Gets the transport value for this HostScsiTopologyTarget.
	 * 
	 * @return transport
	 */
	public com.vmware.vim25.HostTargetTransport getTransport() {
		return transport;
	}

	/**
	 * Sets the transport value for this HostScsiTopologyTarget.
	 * 
	 * @param transport
	 */
	public void setTransport(com.vmware.vim25.HostTargetTransport transport) {
		this.transport = transport;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostScsiTopologyTarget)) {
			return false;
		}
		HostScsiTopologyTarget other = (HostScsiTopologyTarget) obj;
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
				&& ((this.key == null && other.getKey() == null) || (this.key != null && this.key
						.equals(other.getKey())))
				&& this.target == other.getTarget()
				&& ((this.lun == null && other.getLun() == null) || (this.lun != null && java.util.Arrays
						.equals(this.lun, other.getLun())))
				&& ((this.transport == null && other.getTransport() == null) || (this.transport != null && this.transport
						.equals(other.getTransport())));
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
		if (getKey() != null) {
			_hashCode += getKey().hashCode();
		}
		_hashCode += getTarget();
		if (getLun() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getLun()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getLun(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getTransport() != null) {
			_hashCode += getTransport().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostScsiTopologyTarget.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostScsiTopologyTarget"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("target");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"target"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lun");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lun"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostScsiTopologyLun"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("transport");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"transport"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostTargetTransport"));
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
