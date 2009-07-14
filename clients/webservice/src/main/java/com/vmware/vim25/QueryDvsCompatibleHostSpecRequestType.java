/**
 * QueryDvsCompatibleHostSpecRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class QueryDvsCompatibleHostSpecRequestType implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.DistributedVirtualSwitchProductSpec switchProductSpec;

	public QueryDvsCompatibleHostSpecRequestType() {
	}

	public QueryDvsCompatibleHostSpecRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.DistributedVirtualSwitchProductSpec switchProductSpec) {
		this._this = _this;
		this.switchProductSpec = switchProductSpec;
	}

	/**
	 * Gets the _this value for this QueryDvsCompatibleHostSpecRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this QueryDvsCompatibleHostSpecRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the switchProductSpec value for this
	 * QueryDvsCompatibleHostSpecRequestType.
	 * 
	 * @return switchProductSpec
	 */
	public com.vmware.vim25.DistributedVirtualSwitchProductSpec getSwitchProductSpec() {
		return switchProductSpec;
	}

	/**
	 * Sets the switchProductSpec value for this
	 * QueryDvsCompatibleHostSpecRequestType.
	 * 
	 * @param switchProductSpec
	 */
	public void setSwitchProductSpec(
			com.vmware.vim25.DistributedVirtualSwitchProductSpec switchProductSpec) {
		this.switchProductSpec = switchProductSpec;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof QueryDvsCompatibleHostSpecRequestType)) {
			return false;
		}
		QueryDvsCompatibleHostSpecRequestType other = (QueryDvsCompatibleHostSpecRequestType) obj;
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
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.switchProductSpec == null && other
						.getSwitchProductSpec() == null) || (this.switchProductSpec != null && this.switchProductSpec
						.equals(other.getSwitchProductSpec())));
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
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getSwitchProductSpec() != null) {
			_hashCode += getSwitchProductSpec().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			QueryDvsCompatibleHostSpecRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"QueryDvsCompatibleHostSpecRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("switchProductSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"switchProductSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchProductSpec"));
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
