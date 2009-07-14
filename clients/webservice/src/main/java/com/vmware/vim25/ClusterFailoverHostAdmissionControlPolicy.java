/**
 * ClusterFailoverHostAdmissionControlPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterFailoverHostAdmissionControlPolicy extends
		com.vmware.vim25.ClusterDasAdmissionControlPolicy implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.ManagedObjectReference[] failoverHosts;

	public ClusterFailoverHostAdmissionControlPolicy() {
	}

	public ClusterFailoverHostAdmissionControlPolicy(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ManagedObjectReference[] failoverHosts) {
		super(dynamicType, dynamicProperty);
		this.failoverHosts = failoverHosts;
	}

	/**
	 * Gets the failoverHosts value for this
	 * ClusterFailoverHostAdmissionControlPolicy.
	 * 
	 * @return failoverHosts
	 */
	public com.vmware.vim25.ManagedObjectReference[] getFailoverHosts() {
		return failoverHosts;
	}

	/**
	 * Sets the failoverHosts value for this
	 * ClusterFailoverHostAdmissionControlPolicy.
	 * 
	 * @param failoverHosts
	 */
	public void setFailoverHosts(
			com.vmware.vim25.ManagedObjectReference[] failoverHosts) {
		this.failoverHosts = failoverHosts;
	}

	public com.vmware.vim25.ManagedObjectReference getFailoverHosts(int i) {
		return this.failoverHosts[i];
	}

	public void setFailoverHosts(int i,
			com.vmware.vim25.ManagedObjectReference _value) {
		this.failoverHosts[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClusterFailoverHostAdmissionControlPolicy)) {
			return false;
		}
		ClusterFailoverHostAdmissionControlPolicy other = (ClusterFailoverHostAdmissionControlPolicy) obj;
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
				&& ((this.failoverHosts == null && other.getFailoverHosts() == null) || (this.failoverHosts != null && java.util.Arrays
						.equals(this.failoverHosts, other.getFailoverHosts())));
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
		if (getFailoverHosts() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getFailoverHosts()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getFailoverHosts(), i);
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
			ClusterFailoverHostAdmissionControlPolicy.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterFailoverHostAdmissionControlPolicy"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("failoverHosts");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"failoverHosts"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
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
