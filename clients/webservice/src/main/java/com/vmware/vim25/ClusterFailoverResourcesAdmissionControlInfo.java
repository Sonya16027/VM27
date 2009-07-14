/**
 * ClusterFailoverResourcesAdmissionControlInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterFailoverResourcesAdmissionControlInfo extends
		com.vmware.vim25.ClusterDasAdmissionControlInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int currentCpuFailoverResourcesPercent;

	private int currentMemoryFailoverResourcesPercent;

	public ClusterFailoverResourcesAdmissionControlInfo() {
	}

	public ClusterFailoverResourcesAdmissionControlInfo(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			int currentCpuFailoverResourcesPercent,
			int currentMemoryFailoverResourcesPercent) {
		super(dynamicType, dynamicProperty);
		this.currentCpuFailoverResourcesPercent = currentCpuFailoverResourcesPercent;
		this.currentMemoryFailoverResourcesPercent = currentMemoryFailoverResourcesPercent;
	}

	/**
	 * Gets the currentCpuFailoverResourcesPercent value for this
	 * ClusterFailoverResourcesAdmissionControlInfo.
	 * 
	 * @return currentCpuFailoverResourcesPercent
	 */
	public int getCurrentCpuFailoverResourcesPercent() {
		return currentCpuFailoverResourcesPercent;
	}

	/**
	 * Sets the currentCpuFailoverResourcesPercent value for this
	 * ClusterFailoverResourcesAdmissionControlInfo.
	 * 
	 * @param currentCpuFailoverResourcesPercent
	 */
	public void setCurrentCpuFailoverResourcesPercent(
			int currentCpuFailoverResourcesPercent) {
		this.currentCpuFailoverResourcesPercent = currentCpuFailoverResourcesPercent;
	}

	/**
	 * Gets the currentMemoryFailoverResourcesPercent value for this
	 * ClusterFailoverResourcesAdmissionControlInfo.
	 * 
	 * @return currentMemoryFailoverResourcesPercent
	 */
	public int getCurrentMemoryFailoverResourcesPercent() {
		return currentMemoryFailoverResourcesPercent;
	}

	/**
	 * Sets the currentMemoryFailoverResourcesPercent value for this
	 * ClusterFailoverResourcesAdmissionControlInfo.
	 * 
	 * @param currentMemoryFailoverResourcesPercent
	 */
	public void setCurrentMemoryFailoverResourcesPercent(
			int currentMemoryFailoverResourcesPercent) {
		this.currentMemoryFailoverResourcesPercent = currentMemoryFailoverResourcesPercent;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClusterFailoverResourcesAdmissionControlInfo)) {
			return false;
		}
		ClusterFailoverResourcesAdmissionControlInfo other = (ClusterFailoverResourcesAdmissionControlInfo) obj;
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
				&& this.currentCpuFailoverResourcesPercent == other
						.getCurrentCpuFailoverResourcesPercent()
				&& this.currentMemoryFailoverResourcesPercent == other
						.getCurrentMemoryFailoverResourcesPercent();
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
		_hashCode += getCurrentCpuFailoverResourcesPercent();
		_hashCode += getCurrentMemoryFailoverResourcesPercent();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClusterFailoverResourcesAdmissionControlInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterFailoverResourcesAdmissionControlInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("currentCpuFailoverResourcesPercent");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"currentCpuFailoverResourcesPercent"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("currentMemoryFailoverResourcesPercent");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"currentMemoryFailoverResourcesPercent"));
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
