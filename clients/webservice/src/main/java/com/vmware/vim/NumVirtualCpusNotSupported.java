/**
 * NumVirtualCpusNotSupported.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class NumVirtualCpusNotSupported extends
		com.vmware.vim.VirtualHardwareCompatibilityIssue implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int maxSupportedVcpusDest;

	private int numCpuVm;

	public NumVirtualCpusNotSupported() {
	}

	public NumVirtualCpusNotSupported(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			int maxSupportedVcpusDest, int numCpuVm) {
		super(dynamicType, dynamicProperty);
		this.maxSupportedVcpusDest = maxSupportedVcpusDest;
		this.numCpuVm = numCpuVm;
	}

	/**
	 * Gets the maxSupportedVcpusDest value for this NumVirtualCpusNotSupported.
	 * 
	 * @return maxSupportedVcpusDest
	 */
	public int getMaxSupportedVcpusDest() {
		return maxSupportedVcpusDest;
	}

	/**
	 * Sets the maxSupportedVcpusDest value for this NumVirtualCpusNotSupported.
	 * 
	 * @param maxSupportedVcpusDest
	 */
	public void setMaxSupportedVcpusDest(int maxSupportedVcpusDest) {
		this.maxSupportedVcpusDest = maxSupportedVcpusDest;
	}

	/**
	 * Gets the numCpuVm value for this NumVirtualCpusNotSupported.
	 * 
	 * @return numCpuVm
	 */
	public int getNumCpuVm() {
		return numCpuVm;
	}

	/**
	 * Sets the numCpuVm value for this NumVirtualCpusNotSupported.
	 * 
	 * @param numCpuVm
	 */
	public void setNumCpuVm(int numCpuVm) {
		this.numCpuVm = numCpuVm;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof NumVirtualCpusNotSupported)) {
			return false;
		}
		NumVirtualCpusNotSupported other = (NumVirtualCpusNotSupported) obj;
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
				&& this.maxSupportedVcpusDest == other
						.getMaxSupportedVcpusDest()
				&& this.numCpuVm == other.getNumCpuVm();
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
		_hashCode += getMaxSupportedVcpusDest();
		_hashCode += getNumCpuVm();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			NumVirtualCpusNotSupported.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"NumVirtualCpusNotSupported"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxSupportedVcpusDest");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"maxSupportedVcpusDest"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numCpuVm");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"numCpuVm"));
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

	/**
	 * Writes the exception data to the faultDetails
	 */
	@Override
	public void writeDetails(javax.xml.namespace.QName qname,
			org.apache.axis.encoding.SerializationContext context)
			throws java.io.IOException {
		context.serialize(qname, null, this);
	}
}
