/**
 * HostPosixAccountSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostPosixAccountSpec extends com.vmware.vim.HostAccountSpec
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Integer posixId;

	private java.lang.Boolean shellAccess;

	public HostPosixAccountSpec() {
	}

	public HostPosixAccountSpec(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String id, java.lang.String password,
			java.lang.String description, java.lang.Integer posixId,
			java.lang.Boolean shellAccess) {
		super(dynamicType, dynamicProperty, id, password, description);
		this.posixId = posixId;
		this.shellAccess = shellAccess;
	}

	/**
	 * Gets the posixId value for this HostPosixAccountSpec.
	 * 
	 * @return posixId
	 */
	public java.lang.Integer getPosixId() {
		return posixId;
	}

	/**
	 * Sets the posixId value for this HostPosixAccountSpec.
	 * 
	 * @param posixId
	 */
	public void setPosixId(java.lang.Integer posixId) {
		this.posixId = posixId;
	}

	/**
	 * Gets the shellAccess value for this HostPosixAccountSpec.
	 * 
	 * @return shellAccess
	 */
	public java.lang.Boolean getShellAccess() {
		return shellAccess;
	}

	/**
	 * Sets the shellAccess value for this HostPosixAccountSpec.
	 * 
	 * @param shellAccess
	 */
	public void setShellAccess(java.lang.Boolean shellAccess) {
		this.shellAccess = shellAccess;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostPosixAccountSpec)) {
			return false;
		}
		HostPosixAccountSpec other = (HostPosixAccountSpec) obj;
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
				&& ((this.posixId == null && other.getPosixId() == null) || (this.posixId != null && this.posixId
						.equals(other.getPosixId())))
				&& ((this.shellAccess == null && other.getShellAccess() == null) || (this.shellAccess != null && this.shellAccess
						.equals(other.getShellAccess())));
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
		if (getPosixId() != null) {
			_hashCode += getPosixId().hashCode();
		}
		if (getShellAccess() != null) {
			_hashCode += getShellAccess().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostPosixAccountSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostPosixAccountSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("posixId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"posixId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("shellAccess");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"shellAccess"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
