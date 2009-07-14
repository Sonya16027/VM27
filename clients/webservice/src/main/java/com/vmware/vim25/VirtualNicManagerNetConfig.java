/**
 * VirtualNicManagerNetConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualNicManagerNetConfig extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String nicType;

	private boolean multiSelectAllowed;

	private com.vmware.vim25.HostVirtualNic[] candidateVnic;

	private java.lang.String[] selectedVnic;

	public VirtualNicManagerNetConfig() {
	}

	public VirtualNicManagerNetConfig(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String nicType, boolean multiSelectAllowed,
			com.vmware.vim25.HostVirtualNic[] candidateVnic,
			java.lang.String[] selectedVnic) {
		super(dynamicType, dynamicProperty);
		this.nicType = nicType;
		this.multiSelectAllowed = multiSelectAllowed;
		this.candidateVnic = candidateVnic;
		this.selectedVnic = selectedVnic;
	}

	/**
	 * Gets the nicType value for this VirtualNicManagerNetConfig.
	 * 
	 * @return nicType
	 */
	public java.lang.String getNicType() {
		return nicType;
	}

	/**
	 * Sets the nicType value for this VirtualNicManagerNetConfig.
	 * 
	 * @param nicType
	 */
	public void setNicType(java.lang.String nicType) {
		this.nicType = nicType;
	}

	/**
	 * Gets the multiSelectAllowed value for this VirtualNicManagerNetConfig.
	 * 
	 * @return multiSelectAllowed
	 */
	public boolean isMultiSelectAllowed() {
		return multiSelectAllowed;
	}

	/**
	 * Sets the multiSelectAllowed value for this VirtualNicManagerNetConfig.
	 * 
	 * @param multiSelectAllowed
	 */
	public void setMultiSelectAllowed(boolean multiSelectAllowed) {
		this.multiSelectAllowed = multiSelectAllowed;
	}

	/**
	 * Gets the candidateVnic value for this VirtualNicManagerNetConfig.
	 * 
	 * @return candidateVnic
	 */
	public com.vmware.vim25.HostVirtualNic[] getCandidateVnic() {
		return candidateVnic;
	}

	/**
	 * Sets the candidateVnic value for this VirtualNicManagerNetConfig.
	 * 
	 * @param candidateVnic
	 */
	public void setCandidateVnic(com.vmware.vim25.HostVirtualNic[] candidateVnic) {
		this.candidateVnic = candidateVnic;
	}

	public com.vmware.vim25.HostVirtualNic getCandidateVnic(int i) {
		return this.candidateVnic[i];
	}

	public void setCandidateVnic(int i, com.vmware.vim25.HostVirtualNic _value) {
		this.candidateVnic[i] = _value;
	}

	/**
	 * Gets the selectedVnic value for this VirtualNicManagerNetConfig.
	 * 
	 * @return selectedVnic
	 */
	public java.lang.String[] getSelectedVnic() {
		return selectedVnic;
	}

	/**
	 * Sets the selectedVnic value for this VirtualNicManagerNetConfig.
	 * 
	 * @param selectedVnic
	 */
	public void setSelectedVnic(java.lang.String[] selectedVnic) {
		this.selectedVnic = selectedVnic;
	}

	public java.lang.String getSelectedVnic(int i) {
		return this.selectedVnic[i];
	}

	public void setSelectedVnic(int i, java.lang.String _value) {
		this.selectedVnic[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualNicManagerNetConfig)) {
			return false;
		}
		VirtualNicManagerNetConfig other = (VirtualNicManagerNetConfig) obj;
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
				&& ((this.nicType == null && other.getNicType() == null) || (this.nicType != null && this.nicType
						.equals(other.getNicType())))
				&& this.multiSelectAllowed == other.isMultiSelectAllowed()
				&& ((this.candidateVnic == null && other.getCandidateVnic() == null) || (this.candidateVnic != null && java.util.Arrays
						.equals(this.candidateVnic, other.getCandidateVnic())))
				&& ((this.selectedVnic == null && other.getSelectedVnic() == null) || (this.selectedVnic != null && java.util.Arrays
						.equals(this.selectedVnic, other.getSelectedVnic())));
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
		if (getNicType() != null) {
			_hashCode += getNicType().hashCode();
		}
		_hashCode += (isMultiSelectAllowed() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getCandidateVnic() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getCandidateVnic()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getCandidateVnic(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getSelectedVnic() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSelectedVnic()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSelectedVnic(), i);
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
			VirtualNicManagerNetConfig.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualNicManagerNetConfig"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nicType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"nicType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("multiSelectAllowed");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"multiSelectAllowed"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("candidateVnic");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"candidateVnic"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostVirtualNic"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("selectedVnic");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"selectedVnic"));
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
