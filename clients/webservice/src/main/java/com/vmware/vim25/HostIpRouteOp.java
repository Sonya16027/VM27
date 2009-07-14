/**
 * HostIpRouteOp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostIpRouteOp extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String changeOperation;

	private com.vmware.vim25.HostIpRouteEntry route;

	public HostIpRouteOp() {
	}

	public HostIpRouteOp(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String changeOperation,
			com.vmware.vim25.HostIpRouteEntry route) {
		super(dynamicType, dynamicProperty);
		this.changeOperation = changeOperation;
		this.route = route;
	}

	/**
	 * Gets the changeOperation value for this HostIpRouteOp.
	 * 
	 * @return changeOperation
	 */
	public java.lang.String getChangeOperation() {
		return changeOperation;
	}

	/**
	 * Sets the changeOperation value for this HostIpRouteOp.
	 * 
	 * @param changeOperation
	 */
	public void setChangeOperation(java.lang.String changeOperation) {
		this.changeOperation = changeOperation;
	}

	/**
	 * Gets the route value for this HostIpRouteOp.
	 * 
	 * @return route
	 */
	public com.vmware.vim25.HostIpRouteEntry getRoute() {
		return route;
	}

	/**
	 * Sets the route value for this HostIpRouteOp.
	 * 
	 * @param route
	 */
	public void setRoute(com.vmware.vim25.HostIpRouteEntry route) {
		this.route = route;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostIpRouteOp)) {
			return false;
		}
		HostIpRouteOp other = (HostIpRouteOp) obj;
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
				&& ((this.changeOperation == null && other.getChangeOperation() == null) || (this.changeOperation != null && this.changeOperation
						.equals(other.getChangeOperation())))
				&& ((this.route == null && other.getRoute() == null) || (this.route != null && this.route
						.equals(other.getRoute())));
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
		if (getChangeOperation() != null) {
			_hashCode += getChangeOperation().hashCode();
		}
		if (getRoute() != null) {
			_hashCode += getRoute().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostIpRouteOp.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostIpRouteOp"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("changeOperation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"changeOperation"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("route");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "route"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostIpRouteEntry"));
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
