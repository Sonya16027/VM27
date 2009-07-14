/**
 * HostSnmpConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostSnmpConfigSpec extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Boolean enabled;

	private java.lang.Integer port;

	private java.lang.String[] readOnlyCommunities;

	private com.vmware.vim25.HostSnmpDestination[] trapTargets;

	public HostSnmpConfigSpec() {
	}

	public HostSnmpConfigSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.Boolean enabled, java.lang.Integer port,
			java.lang.String[] readOnlyCommunities,
			com.vmware.vim25.HostSnmpDestination[] trapTargets) {
		super(dynamicType, dynamicProperty);
		this.enabled = enabled;
		this.port = port;
		this.readOnlyCommunities = readOnlyCommunities;
		this.trapTargets = trapTargets;
	}

	/**
	 * Gets the enabled value for this HostSnmpConfigSpec.
	 * 
	 * @return enabled
	 */
	public java.lang.Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled value for this HostSnmpConfigSpec.
	 * 
	 * @param enabled
	 */
	public void setEnabled(java.lang.Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Gets the port value for this HostSnmpConfigSpec.
	 * 
	 * @return port
	 */
	public java.lang.Integer getPort() {
		return port;
	}

	/**
	 * Sets the port value for this HostSnmpConfigSpec.
	 * 
	 * @param port
	 */
	public void setPort(java.lang.Integer port) {
		this.port = port;
	}

	/**
	 * Gets the readOnlyCommunities value for this HostSnmpConfigSpec.
	 * 
	 * @return readOnlyCommunities
	 */
	public java.lang.String[] getReadOnlyCommunities() {
		return readOnlyCommunities;
	}

	/**
	 * Sets the readOnlyCommunities value for this HostSnmpConfigSpec.
	 * 
	 * @param readOnlyCommunities
	 */
	public void setReadOnlyCommunities(java.lang.String[] readOnlyCommunities) {
		this.readOnlyCommunities = readOnlyCommunities;
	}

	public java.lang.String getReadOnlyCommunities(int i) {
		return this.readOnlyCommunities[i];
	}

	public void setReadOnlyCommunities(int i, java.lang.String _value) {
		this.readOnlyCommunities[i] = _value;
	}

	/**
	 * Gets the trapTargets value for this HostSnmpConfigSpec.
	 * 
	 * @return trapTargets
	 */
	public com.vmware.vim25.HostSnmpDestination[] getTrapTargets() {
		return trapTargets;
	}

	/**
	 * Sets the trapTargets value for this HostSnmpConfigSpec.
	 * 
	 * @param trapTargets
	 */
	public void setTrapTargets(
			com.vmware.vim25.HostSnmpDestination[] trapTargets) {
		this.trapTargets = trapTargets;
	}

	public com.vmware.vim25.HostSnmpDestination getTrapTargets(int i) {
		return this.trapTargets[i];
	}

	public void setTrapTargets(int i,
			com.vmware.vim25.HostSnmpDestination _value) {
		this.trapTargets[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostSnmpConfigSpec)) {
			return false;
		}
		HostSnmpConfigSpec other = (HostSnmpConfigSpec) obj;
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
				&& ((this.enabled == null && other.getEnabled() == null) || (this.enabled != null && this.enabled
						.equals(other.getEnabled())))
				&& ((this.port == null && other.getPort() == null) || (this.port != null && this.port
						.equals(other.getPort())))
				&& ((this.readOnlyCommunities == null && other
						.getReadOnlyCommunities() == null) || (this.readOnlyCommunities != null && java.util.Arrays
						.equals(this.readOnlyCommunities, other
								.getReadOnlyCommunities())))
				&& ((this.trapTargets == null && other.getTrapTargets() == null) || (this.trapTargets != null && java.util.Arrays
						.equals(this.trapTargets, other.getTrapTargets())));
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
		if (getEnabled() != null) {
			_hashCode += getEnabled().hashCode();
		}
		if (getPort() != null) {
			_hashCode += getPort().hashCode();
		}
		if (getReadOnlyCommunities() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getReadOnlyCommunities()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getReadOnlyCommunities(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getTrapTargets() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getTrapTargets()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getTrapTargets(), i);
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
			HostSnmpConfigSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostSnmpConfigSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("enabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"enabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("port");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "port"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("readOnlyCommunities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"readOnlyCommunities"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("trapTargets");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"trapTargets"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostSnmpDestination"));
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
