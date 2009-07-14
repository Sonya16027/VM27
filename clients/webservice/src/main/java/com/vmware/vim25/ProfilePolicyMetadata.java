/**
 * ProfilePolicyMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ProfilePolicyMetadata extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ExtendedElementDescription id;

	private com.vmware.vim25.ProfilePolicyOptionMetadata[] possibleOption;

	public ProfilePolicyMetadata() {
	}

	public ProfilePolicyMetadata(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ExtendedElementDescription id,
			com.vmware.vim25.ProfilePolicyOptionMetadata[] possibleOption) {
		super(dynamicType, dynamicProperty);
		this.id = id;
		this.possibleOption = possibleOption;
	}

	/**
	 * Gets the id value for this ProfilePolicyMetadata.
	 * 
	 * @return id
	 */
	public com.vmware.vim25.ExtendedElementDescription getId() {
		return id;
	}

	/**
	 * Sets the id value for this ProfilePolicyMetadata.
	 * 
	 * @param id
	 */
	public void setId(com.vmware.vim25.ExtendedElementDescription id) {
		this.id = id;
	}

	/**
	 * Gets the possibleOption value for this ProfilePolicyMetadata.
	 * 
	 * @return possibleOption
	 */
	public com.vmware.vim25.ProfilePolicyOptionMetadata[] getPossibleOption() {
		return possibleOption;
	}

	/**
	 * Sets the possibleOption value for this ProfilePolicyMetadata.
	 * 
	 * @param possibleOption
	 */
	public void setPossibleOption(
			com.vmware.vim25.ProfilePolicyOptionMetadata[] possibleOption) {
		this.possibleOption = possibleOption;
	}

	public com.vmware.vim25.ProfilePolicyOptionMetadata getPossibleOption(int i) {
		return this.possibleOption[i];
	}

	public void setPossibleOption(int i,
			com.vmware.vim25.ProfilePolicyOptionMetadata _value) {
		this.possibleOption[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ProfilePolicyMetadata)) {
			return false;
		}
		ProfilePolicyMetadata other = (ProfilePolicyMetadata) obj;
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
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id
						.equals(other.getId())))
				&& ((this.possibleOption == null && other.getPossibleOption() == null) || (this.possibleOption != null && java.util.Arrays
						.equals(this.possibleOption, other.getPossibleOption())));
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
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		if (getPossibleOption() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPossibleOption()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPossibleOption(), i);
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
			ProfilePolicyMetadata.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfilePolicyMetadata"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ExtendedElementDescription"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("possibleOption");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"possibleOption"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ProfilePolicyOptionMetadata"));
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
