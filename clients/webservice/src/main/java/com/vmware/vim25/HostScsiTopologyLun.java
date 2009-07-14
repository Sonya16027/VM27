/**
 * HostScsiTopologyLun.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostScsiTopologyLun extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String key;

	private int lun;

	private java.lang.String scsiLun;

	public HostScsiTopologyLun() {
	}

	public HostScsiTopologyLun(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String key, int lun, java.lang.String scsiLun) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.lun = lun;
		this.scsiLun = scsiLun;
	}

	/**
	 * Gets the key value for this HostScsiTopologyLun.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this HostScsiTopologyLun.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the lun value for this HostScsiTopologyLun.
	 * 
	 * @return lun
	 */
	public int getLun() {
		return lun;
	}

	/**
	 * Sets the lun value for this HostScsiTopologyLun.
	 * 
	 * @param lun
	 */
	public void setLun(int lun) {
		this.lun = lun;
	}

	/**
	 * Gets the scsiLun value for this HostScsiTopologyLun.
	 * 
	 * @return scsiLun
	 */
	public java.lang.String getScsiLun() {
		return scsiLun;
	}

	/**
	 * Sets the scsiLun value for this HostScsiTopologyLun.
	 * 
	 * @param scsiLun
	 */
	public void setScsiLun(java.lang.String scsiLun) {
		this.scsiLun = scsiLun;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostScsiTopologyLun)) {
			return false;
		}
		HostScsiTopologyLun other = (HostScsiTopologyLun) obj;
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
				&& this.lun == other.getLun()
				&& ((this.scsiLun == null && other.getScsiLun() == null) || (this.scsiLun != null && this.scsiLun
						.equals(other.getScsiLun())));
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
		_hashCode += getLun();
		if (getScsiLun() != null) {
			_hashCode += getScsiLun().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostScsiTopologyLun.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostScsiTopologyLun"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lun");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lun"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("scsiLun");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"scsiLun"));
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
