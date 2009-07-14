/**
 * ArrayOfHostVirtualNicManagerNicTypeSelection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostVirtualNicManagerNicTypeSelection implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostVirtualNicManagerNicTypeSelection[] hostVirtualNicManagerNicTypeSelection;

	public ArrayOfHostVirtualNicManagerNicTypeSelection() {
	}

	public ArrayOfHostVirtualNicManagerNicTypeSelection(
			com.vmware.vim25.HostVirtualNicManagerNicTypeSelection[] hostVirtualNicManagerNicTypeSelection) {
		this.hostVirtualNicManagerNicTypeSelection = hostVirtualNicManagerNicTypeSelection;
	}

	/**
	 * Gets the hostVirtualNicManagerNicTypeSelection value for this
	 * ArrayOfHostVirtualNicManagerNicTypeSelection.
	 * 
	 * @return hostVirtualNicManagerNicTypeSelection
	 */
	public com.vmware.vim25.HostVirtualNicManagerNicTypeSelection[] getHostVirtualNicManagerNicTypeSelection() {
		return hostVirtualNicManagerNicTypeSelection;
	}

	/**
	 * Sets the hostVirtualNicManagerNicTypeSelection value for this
	 * ArrayOfHostVirtualNicManagerNicTypeSelection.
	 * 
	 * @param hostVirtualNicManagerNicTypeSelection
	 */
	public void setHostVirtualNicManagerNicTypeSelection(
			com.vmware.vim25.HostVirtualNicManagerNicTypeSelection[] hostVirtualNicManagerNicTypeSelection) {
		this.hostVirtualNicManagerNicTypeSelection = hostVirtualNicManagerNicTypeSelection;
	}

	public com.vmware.vim25.HostVirtualNicManagerNicTypeSelection getHostVirtualNicManagerNicTypeSelection(
			int i) {
		return this.hostVirtualNicManagerNicTypeSelection[i];
	}

	public void setHostVirtualNicManagerNicTypeSelection(int i,
			com.vmware.vim25.HostVirtualNicManagerNicTypeSelection _value) {
		this.hostVirtualNicManagerNicTypeSelection[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostVirtualNicManagerNicTypeSelection)) {
			return false;
		}
		ArrayOfHostVirtualNicManagerNicTypeSelection other = (ArrayOfHostVirtualNicManagerNicTypeSelection) obj;
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
		_equals = true && ((this.hostVirtualNicManagerNicTypeSelection == null && other
				.getHostVirtualNicManagerNicTypeSelection() == null) || (this.hostVirtualNicManagerNicTypeSelection != null && java.util.Arrays
				.equals(this.hostVirtualNicManagerNicTypeSelection, other
						.getHostVirtualNicManagerNicTypeSelection())));
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
		if (getHostVirtualNicManagerNicTypeSelection() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostVirtualNicManagerNicTypeSelection()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostVirtualNicManagerNicTypeSelection(), i);
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
			ArrayOfHostVirtualNicManagerNicTypeSelection.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostVirtualNicManagerNicTypeSelection"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostVirtualNicManagerNicTypeSelection");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostVirtualNicManagerNicTypeSelection"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostVirtualNicManagerNicTypeSelection"));
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
