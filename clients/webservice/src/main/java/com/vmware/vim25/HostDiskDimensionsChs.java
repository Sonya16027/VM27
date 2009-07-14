/**
 * HostDiskDimensionsChs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostDiskDimensionsChs extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long cylinder;

	private int head;

	private int sector;

	public HostDiskDimensionsChs() {
	}

	public HostDiskDimensionsChs(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, long cylinder,
			int head, int sector) {
		super(dynamicType, dynamicProperty);
		this.cylinder = cylinder;
		this.head = head;
		this.sector = sector;
	}

	/**
	 * Gets the cylinder value for this HostDiskDimensionsChs.
	 * 
	 * @return cylinder
	 */
	public long getCylinder() {
		return cylinder;
	}

	/**
	 * Sets the cylinder value for this HostDiskDimensionsChs.
	 * 
	 * @param cylinder
	 */
	public void setCylinder(long cylinder) {
		this.cylinder = cylinder;
	}

	/**
	 * Gets the head value for this HostDiskDimensionsChs.
	 * 
	 * @return head
	 */
	public int getHead() {
		return head;
	}

	/**
	 * Sets the head value for this HostDiskDimensionsChs.
	 * 
	 * @param head
	 */
	public void setHead(int head) {
		this.head = head;
	}

	/**
	 * Gets the sector value for this HostDiskDimensionsChs.
	 * 
	 * @return sector
	 */
	public int getSector() {
		return sector;
	}

	/**
	 * Sets the sector value for this HostDiskDimensionsChs.
	 * 
	 * @param sector
	 */
	public void setSector(int sector) {
		this.sector = sector;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostDiskDimensionsChs)) {
			return false;
		}
		HostDiskDimensionsChs other = (HostDiskDimensionsChs) obj;
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
		_equals = super.equals(obj) && this.cylinder == other.getCylinder()
				&& this.head == other.getHead()
				&& this.sector == other.getSector();
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
		_hashCode += new Long(getCylinder()).hashCode();
		_hashCode += getHead();
		_hashCode += getSector();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostDiskDimensionsChs.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostDiskDimensionsChs"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cylinder");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"cylinder"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("head");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "head"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sector");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sector"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
