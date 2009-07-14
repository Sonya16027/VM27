/**
 * IpRouteProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class IpRouteProfile extends com.vmware.vim25.ApplyProfile implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.StaticRouteProfile[] staticRoute;

	public IpRouteProfile() {
	}

	public IpRouteProfile(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			boolean enabled, com.vmware.vim25.ProfilePolicy[] policy,
			com.vmware.vim25.StaticRouteProfile[] staticRoute) {
		super(dynamicType, dynamicProperty, enabled, policy);
		this.staticRoute = staticRoute;
	}

	/**
	 * Gets the staticRoute value for this IpRouteProfile.
	 * 
	 * @return staticRoute
	 */
	public com.vmware.vim25.StaticRouteProfile[] getStaticRoute() {
		return staticRoute;
	}

	/**
	 * Sets the staticRoute value for this IpRouteProfile.
	 * 
	 * @param staticRoute
	 */
	public void setStaticRoute(com.vmware.vim25.StaticRouteProfile[] staticRoute) {
		this.staticRoute = staticRoute;
	}

	public com.vmware.vim25.StaticRouteProfile getStaticRoute(int i) {
		return this.staticRoute[i];
	}

	public void setStaticRoute(int i, com.vmware.vim25.StaticRouteProfile _value) {
		this.staticRoute[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof IpRouteProfile)) {
			return false;
		}
		IpRouteProfile other = (IpRouteProfile) obj;
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
				&& ((this.staticRoute == null && other.getStaticRoute() == null) || (this.staticRoute != null && java.util.Arrays
						.equals(this.staticRoute, other.getStaticRoute())));
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
		if (getStaticRoute() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getStaticRoute()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getStaticRoute(), i);
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
			IpRouteProfile.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"IpRouteProfile"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("staticRoute");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"staticRoute"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"StaticRouteProfile"));
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
