/**
 * HostVirtualNicManagerNicTypeSelection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostVirtualNicManagerNicTypeSelection extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.HostVirtualNicConnection vnic;

	private java.lang.String[] nicType;

	public HostVirtualNicManagerNicTypeSelection() {
	}

	public HostVirtualNicManagerNicTypeSelection(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.HostVirtualNicConnection vnic,
			java.lang.String[] nicType) {
		super(dynamicType, dynamicProperty);
		this.vnic = vnic;
		this.nicType = nicType;
	}

	/**
	 * Gets the vnic value for this HostVirtualNicManagerNicTypeSelection.
	 * 
	 * @return vnic
	 */
	public com.vmware.vim25.HostVirtualNicConnection getVnic() {
		return vnic;
	}

	/**
	 * Sets the vnic value for this HostVirtualNicManagerNicTypeSelection.
	 * 
	 * @param vnic
	 */
	public void setVnic(com.vmware.vim25.HostVirtualNicConnection vnic) {
		this.vnic = vnic;
	}

	/**
	 * Gets the nicType value for this HostVirtualNicManagerNicTypeSelection.
	 * 
	 * @return nicType
	 */
	public java.lang.String[] getNicType() {
		return nicType;
	}

	/**
	 * Sets the nicType value for this HostVirtualNicManagerNicTypeSelection.
	 * 
	 * @param nicType
	 */
	public void setNicType(java.lang.String[] nicType) {
		this.nicType = nicType;
	}

	public java.lang.String getNicType(int i) {
		return this.nicType[i];
	}

	public void setNicType(int i, java.lang.String _value) {
		this.nicType[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostVirtualNicManagerNicTypeSelection)) {
			return false;
		}
		HostVirtualNicManagerNicTypeSelection other = (HostVirtualNicManagerNicTypeSelection) obj;
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
				&& ((this.vnic == null && other.getVnic() == null) || (this.vnic != null && this.vnic
						.equals(other.getVnic())))
				&& ((this.nicType == null && other.getNicType() == null) || (this.nicType != null && java.util.Arrays
						.equals(this.nicType, other.getNicType())));
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
		if (getVnic() != null) {
			_hashCode += getVnic().hashCode();
		}
		if (getNicType() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getNicType()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getNicType(), i);
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
			HostVirtualNicManagerNicTypeSelection.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostVirtualNicManagerNicTypeSelection"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vnic");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vnic"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostVirtualNicConnection"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nicType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"nicType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
