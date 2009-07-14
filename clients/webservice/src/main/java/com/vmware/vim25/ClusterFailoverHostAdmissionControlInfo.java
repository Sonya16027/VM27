/**
 * ClusterFailoverHostAdmissionControlInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterFailoverHostAdmissionControlInfo extends
		com.vmware.vim25.ClusterDasAdmissionControlInfo implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus[] hostStatus;

	public ClusterFailoverHostAdmissionControlInfo() {
	}

	public ClusterFailoverHostAdmissionControlInfo(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus[] hostStatus) {
		super(dynamicType, dynamicProperty);
		this.hostStatus = hostStatus;
	}

	/**
	 * Gets the hostStatus value for this
	 * ClusterFailoverHostAdmissionControlInfo.
	 * 
	 * @return hostStatus
	 */
	public com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus[] getHostStatus() {
		return hostStatus;
	}

	/**
	 * Sets the hostStatus value for this
	 * ClusterFailoverHostAdmissionControlInfo.
	 * 
	 * @param hostStatus
	 */
	public void setHostStatus(
			com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus[] hostStatus) {
		this.hostStatus = hostStatus;
	}

	public com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus getHostStatus(
			int i) {
		return this.hostStatus[i];
	}

	public void setHostStatus(
			int i,
			com.vmware.vim25.ClusterFailoverHostAdmissionControlInfoHostStatus _value) {
		this.hostStatus[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClusterFailoverHostAdmissionControlInfo)) {
			return false;
		}
		ClusterFailoverHostAdmissionControlInfo other = (ClusterFailoverHostAdmissionControlInfo) obj;
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
				&& ((this.hostStatus == null && other.getHostStatus() == null) || (this.hostStatus != null && java.util.Arrays
						.equals(this.hostStatus, other.getHostStatus())));
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
		if (getHostStatus() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostStatus()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostStatus(), i);
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
			ClusterFailoverHostAdmissionControlInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterFailoverHostAdmissionControlInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostStatus");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hostStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterFailoverHostAdmissionControlInfoHostStatus"));
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
