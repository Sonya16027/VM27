/**
 * HostNumaNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostNumaNode extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private byte typeId;

	private short[] cpuID;

	private long memoryRangeBegin;

	private long memoryRangeLength;

	public HostNumaNode() {
	}

	public HostNumaNode(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty, byte typeId,
			short[] cpuID, long memoryRangeBegin, long memoryRangeLength) {
		super(dynamicType, dynamicProperty);
		this.typeId = typeId;
		this.cpuID = cpuID;
		this.memoryRangeBegin = memoryRangeBegin;
		this.memoryRangeLength = memoryRangeLength;
	}

	/**
	 * Gets the typeId value for this HostNumaNode.
	 * 
	 * @return typeId
	 */
	public byte getTypeId() {
		return typeId;
	}

	/**
	 * Sets the typeId value for this HostNumaNode.
	 * 
	 * @param typeId
	 */
	public void setTypeId(byte typeId) {
		this.typeId = typeId;
	}

	/**
	 * Gets the cpuID value for this HostNumaNode.
	 * 
	 * @return cpuID
	 */
	public short[] getCpuID() {
		return cpuID;
	}

	/**
	 * Sets the cpuID value for this HostNumaNode.
	 * 
	 * @param cpuID
	 */
	public void setCpuID(short[] cpuID) {
		this.cpuID = cpuID;
	}

	public short getCpuID(int i) {
		return this.cpuID[i];
	}

	public void setCpuID(int i, short _value) {
		this.cpuID[i] = _value;
	}

	/**
	 * Gets the memoryRangeBegin value for this HostNumaNode.
	 * 
	 * @return memoryRangeBegin
	 */
	public long getMemoryRangeBegin() {
		return memoryRangeBegin;
	}

	/**
	 * Sets the memoryRangeBegin value for this HostNumaNode.
	 * 
	 * @param memoryRangeBegin
	 */
	public void setMemoryRangeBegin(long memoryRangeBegin) {
		this.memoryRangeBegin = memoryRangeBegin;
	}

	/**
	 * Gets the memoryRangeLength value for this HostNumaNode.
	 * 
	 * @return memoryRangeLength
	 */
	public long getMemoryRangeLength() {
		return memoryRangeLength;
	}

	/**
	 * Sets the memoryRangeLength value for this HostNumaNode.
	 * 
	 * @param memoryRangeLength
	 */
	public void setMemoryRangeLength(long memoryRangeLength) {
		this.memoryRangeLength = memoryRangeLength;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostNumaNode)) {
			return false;
		}
		HostNumaNode other = (HostNumaNode) obj;
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
				&& this.typeId == other.getTypeId()
				&& ((this.cpuID == null && other.getCpuID() == null) || (this.cpuID != null && java.util.Arrays
						.equals(this.cpuID, other.getCpuID())))
				&& this.memoryRangeBegin == other.getMemoryRangeBegin()
				&& this.memoryRangeLength == other.getMemoryRangeLength();
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
		_hashCode += getTypeId();
		if (getCpuID() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getCpuID()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getCpuID(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += new Long(getMemoryRangeBegin()).hashCode();
		_hashCode += new Long(getMemoryRangeLength()).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostNumaNode.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostNumaNode"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("typeId");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "typeId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "byte"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpuID");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "cpuID"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memoryRangeBegin");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"memoryRangeBegin"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memoryRangeLength");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"memoryRangeLength"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
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
