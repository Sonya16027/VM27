/**
 * ClusterInitialPlacementAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterInitialPlacementAction extends
		com.vmware.vim25.ClusterAction implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference targetHost;

	private com.vmware.vim25.ManagedObjectReference pool;

	public ClusterInitialPlacementAction() {
	}

	public ClusterInitialPlacementAction(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String type,
			com.vmware.vim25.ManagedObjectReference target,
			com.vmware.vim25.ManagedObjectReference targetHost,
			com.vmware.vim25.ManagedObjectReference pool) {
		super(dynamicType, dynamicProperty, type, target);
		this.targetHost = targetHost;
		this.pool = pool;
	}

	/**
	 * Gets the targetHost value for this ClusterInitialPlacementAction.
	 * 
	 * @return targetHost
	 */
	public com.vmware.vim25.ManagedObjectReference getTargetHost() {
		return targetHost;
	}

	/**
	 * Sets the targetHost value for this ClusterInitialPlacementAction.
	 * 
	 * @param targetHost
	 */
	public void setTargetHost(com.vmware.vim25.ManagedObjectReference targetHost) {
		this.targetHost = targetHost;
	}

	/**
	 * Gets the pool value for this ClusterInitialPlacementAction.
	 * 
	 * @return pool
	 */
	public com.vmware.vim25.ManagedObjectReference getPool() {
		return pool;
	}

	/**
	 * Sets the pool value for this ClusterInitialPlacementAction.
	 * 
	 * @param pool
	 */
	public void setPool(com.vmware.vim25.ManagedObjectReference pool) {
		this.pool = pool;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClusterInitialPlacementAction)) {
			return false;
		}
		ClusterInitialPlacementAction other = (ClusterInitialPlacementAction) obj;
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
				&& ((this.targetHost == null && other.getTargetHost() == null) || (this.targetHost != null && this.targetHost
						.equals(other.getTargetHost())))
				&& ((this.pool == null && other.getPool() == null) || (this.pool != null && this.pool
						.equals(other.getPool())));
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
		if (getTargetHost() != null) {
			_hashCode += getTargetHost().hashCode();
		}
		if (getPool() != null) {
			_hashCode += getPool().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClusterInitialPlacementAction.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterInitialPlacementAction"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("targetHost");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"targetHost"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("pool");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pool"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
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
