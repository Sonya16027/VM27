/**
 * ImportSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ImportSpec extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.VAppEntityConfigInfo entityConfig;

	public ImportSpec() {
	}

	public ImportSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.VAppEntityConfigInfo entityConfig) {
		super(dynamicType, dynamicProperty);
		this.entityConfig = entityConfig;
	}

	/**
	 * Gets the entityConfig value for this ImportSpec.
	 * 
	 * @return entityConfig
	 */
	public com.vmware.vim25.VAppEntityConfigInfo getEntityConfig() {
		return entityConfig;
	}

	/**
	 * Sets the entityConfig value for this ImportSpec.
	 * 
	 * @param entityConfig
	 */
	public void setEntityConfig(
			com.vmware.vim25.VAppEntityConfigInfo entityConfig) {
		this.entityConfig = entityConfig;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ImportSpec)) {
			return false;
		}
		ImportSpec other = (ImportSpec) obj;
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
				&& ((this.entityConfig == null && other.getEntityConfig() == null) || (this.entityConfig != null && this.entityConfig
						.equals(other.getEntityConfig())));
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
		if (getEntityConfig() != null) {
			_hashCode += getEntityConfig().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ImportSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ImportSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entityConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"entityConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VAppEntityConfigInfo"));
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
