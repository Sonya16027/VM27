/**
 * AddServiceConsoleVirtualNicRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class AddServiceConsoleVirtualNicRequestType implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String portgroup;

	private com.vmware.vim25.HostVirtualNicSpec nic;

	public AddServiceConsoleVirtualNicRequestType() {
	}

	public AddServiceConsoleVirtualNicRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String portgroup, com.vmware.vim25.HostVirtualNicSpec nic) {
		this._this = _this;
		this.portgroup = portgroup;
		this.nic = nic;
	}

	/**
	 * Gets the _this value for this AddServiceConsoleVirtualNicRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this AddServiceConsoleVirtualNicRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the portgroup value for this AddServiceConsoleVirtualNicRequestType.
	 * 
	 * @return portgroup
	 */
	public java.lang.String getPortgroup() {
		return portgroup;
	}

	/**
	 * Sets the portgroup value for this AddServiceConsoleVirtualNicRequestType.
	 * 
	 * @param portgroup
	 */
	public void setPortgroup(java.lang.String portgroup) {
		this.portgroup = portgroup;
	}

	/**
	 * Gets the nic value for this AddServiceConsoleVirtualNicRequestType.
	 * 
	 * @return nic
	 */
	public com.vmware.vim25.HostVirtualNicSpec getNic() {
		return nic;
	}

	/**
	 * Sets the nic value for this AddServiceConsoleVirtualNicRequestType.
	 * 
	 * @param nic
	 */
	public void setNic(com.vmware.vim25.HostVirtualNicSpec nic) {
		this.nic = nic;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AddServiceConsoleVirtualNicRequestType)) {
			return false;
		}
		AddServiceConsoleVirtualNicRequestType other = (AddServiceConsoleVirtualNicRequestType) obj;
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
				&& ((this.portgroup == null && other.getPortgroup() == null) || (this.portgroup != null && this.portgroup
						.equals(other.getPortgroup())))
				&& ((this.nic == null && other.getNic() == null) || (this.nic != null && this.nic
						.equals(other.getNic())));
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
		if (getPortgroup() != null) {
			_hashCode += getPortgroup().hashCode();
		}
		if (getNic() != null) {
			_hashCode += getNic().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AddServiceConsoleVirtualNicRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"AddServiceConsoleVirtualNicRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portgroup");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"portgroup"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nic");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nic"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostVirtualNicSpec"));
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
