/**
 * HostCpuInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostCpuInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private short numCpuPackages;

	private short numCpuCores;

	private short numCpuThreads;

	private long hz;

	public HostCpuInfo() {
	}

	public HostCpuInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			short numCpuPackages, short numCpuCores, short numCpuThreads,
			long hz) {
		super(dynamicType, dynamicProperty);
		this.numCpuPackages = numCpuPackages;
		this.numCpuCores = numCpuCores;
		this.numCpuThreads = numCpuThreads;
		this.hz = hz;
	}

	/**
	 * Gets the numCpuPackages value for this HostCpuInfo.
	 * 
	 * @return numCpuPackages
	 */
	public short getNumCpuPackages() {
		return numCpuPackages;
	}

	/**
	 * Sets the numCpuPackages value for this HostCpuInfo.
	 * 
	 * @param numCpuPackages
	 */
	public void setNumCpuPackages(short numCpuPackages) {
		this.numCpuPackages = numCpuPackages;
	}

	/**
	 * Gets the numCpuCores value for this HostCpuInfo.
	 * 
	 * @return numCpuCores
	 */
	public short getNumCpuCores() {
		return numCpuCores;
	}

	/**
	 * Sets the numCpuCores value for this HostCpuInfo.
	 * 
	 * @param numCpuCores
	 */
	public void setNumCpuCores(short numCpuCores) {
		this.numCpuCores = numCpuCores;
	}

	/**
	 * Gets the numCpuThreads value for this HostCpuInfo.
	 * 
	 * @return numCpuThreads
	 */
	public short getNumCpuThreads() {
		return numCpuThreads;
	}

	/**
	 * Sets the numCpuThreads value for this HostCpuInfo.
	 * 
	 * @param numCpuThreads
	 */
	public void setNumCpuThreads(short numCpuThreads) {
		this.numCpuThreads = numCpuThreads;
	}

	/**
	 * Gets the hz value for this HostCpuInfo.
	 * 
	 * @return hz
	 */
	public long getHz() {
		return hz;
	}

	/**
	 * Sets the hz value for this HostCpuInfo.
	 * 
	 * @param hz
	 */
	public void setHz(long hz) {
		this.hz = hz;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostCpuInfo)) {
			return false;
		}
		HostCpuInfo other = (HostCpuInfo) obj;
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
				&& this.numCpuPackages == other.getNumCpuPackages()
				&& this.numCpuCores == other.getNumCpuCores()
				&& this.numCpuThreads == other.getNumCpuThreads()
				&& this.hz == other.getHz();
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
		_hashCode += getNumCpuPackages();
		_hashCode += getNumCpuCores();
		_hashCode += getNumCpuThreads();
		_hashCode += new Long(getHz()).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostCpuInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostCpuInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCpuPackages");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numCpuPackages"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCpuCores");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numCpuCores"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCpuThreads");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"numCpuThreads"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "short"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hz");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hz"));
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
