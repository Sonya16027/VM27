/**
 * ArrayOfHostPlugStoreTopologyTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostPlugStoreTopologyTarget implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostPlugStoreTopologyTarget[] hostPlugStoreTopologyTarget;

	public ArrayOfHostPlugStoreTopologyTarget() {
	}

	public ArrayOfHostPlugStoreTopologyTarget(
			com.vmware.vim25.HostPlugStoreTopologyTarget[] hostPlugStoreTopologyTarget) {
		this.hostPlugStoreTopologyTarget = hostPlugStoreTopologyTarget;
	}

	/**
	 * Gets the hostPlugStoreTopologyTarget value for this
	 * ArrayOfHostPlugStoreTopologyTarget.
	 * 
	 * @return hostPlugStoreTopologyTarget
	 */
	public com.vmware.vim25.HostPlugStoreTopologyTarget[] getHostPlugStoreTopologyTarget() {
		return hostPlugStoreTopologyTarget;
	}

	/**
	 * Sets the hostPlugStoreTopologyTarget value for this
	 * ArrayOfHostPlugStoreTopologyTarget.
	 * 
	 * @param hostPlugStoreTopologyTarget
	 */
	public void setHostPlugStoreTopologyTarget(
			com.vmware.vim25.HostPlugStoreTopologyTarget[] hostPlugStoreTopologyTarget) {
		this.hostPlugStoreTopologyTarget = hostPlugStoreTopologyTarget;
	}

	public com.vmware.vim25.HostPlugStoreTopologyTarget getHostPlugStoreTopologyTarget(
			int i) {
		return this.hostPlugStoreTopologyTarget[i];
	}

	public void setHostPlugStoreTopologyTarget(int i,
			com.vmware.vim25.HostPlugStoreTopologyTarget _value) {
		this.hostPlugStoreTopologyTarget[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostPlugStoreTopologyTarget)) {
			return false;
		}
		ArrayOfHostPlugStoreTopologyTarget other = (ArrayOfHostPlugStoreTopologyTarget) obj;
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
		_equals = true && ((this.hostPlugStoreTopologyTarget == null && other
				.getHostPlugStoreTopologyTarget() == null) || (this.hostPlugStoreTopologyTarget != null && java.util.Arrays
				.equals(this.hostPlugStoreTopologyTarget, other
						.getHostPlugStoreTopologyTarget())));
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
		int _hashCode = 1;
		if (getHostPlugStoreTopologyTarget() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostPlugStoreTopologyTarget()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostPlugStoreTopologyTarget(), i);
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
			ArrayOfHostPlugStoreTopologyTarget.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostPlugStoreTopologyTarget"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostPlugStoreTopologyTarget");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostPlugStoreTopologyTarget"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPlugStoreTopologyTarget"));
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
