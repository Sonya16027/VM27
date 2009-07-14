/**
 * StageHostPatchRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class StageHostPatchRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String[] metaUrls;

	private java.lang.String[] bundleUrls;

	private java.lang.String[] vibUrls;

	private com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec spec;

	public StageHostPatchRequestType() {
	}

	public StageHostPatchRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String[] metaUrls, java.lang.String[] bundleUrls,
			java.lang.String[] vibUrls,
			com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec spec) {
		this._this = _this;
		this.metaUrls = metaUrls;
		this.bundleUrls = bundleUrls;
		this.vibUrls = vibUrls;
		this.spec = spec;
	}

	/**
	 * Gets the _this value for this StageHostPatchRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this StageHostPatchRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the metaUrls value for this StageHostPatchRequestType.
	 * 
	 * @return metaUrls
	 */
	public java.lang.String[] getMetaUrls() {
		return metaUrls;
	}

	/**
	 * Sets the metaUrls value for this StageHostPatchRequestType.
	 * 
	 * @param metaUrls
	 */
	public void setMetaUrls(java.lang.String[] metaUrls) {
		this.metaUrls = metaUrls;
	}

	public java.lang.String getMetaUrls(int i) {
		return this.metaUrls[i];
	}

	public void setMetaUrls(int i, java.lang.String _value) {
		this.metaUrls[i] = _value;
	}

	/**
	 * Gets the bundleUrls value for this StageHostPatchRequestType.
	 * 
	 * @return bundleUrls
	 */
	public java.lang.String[] getBundleUrls() {
		return bundleUrls;
	}

	/**
	 * Sets the bundleUrls value for this StageHostPatchRequestType.
	 * 
	 * @param bundleUrls
	 */
	public void setBundleUrls(java.lang.String[] bundleUrls) {
		this.bundleUrls = bundleUrls;
	}

	public java.lang.String getBundleUrls(int i) {
		return this.bundleUrls[i];
	}

	public void setBundleUrls(int i, java.lang.String _value) {
		this.bundleUrls[i] = _value;
	}

	/**
	 * Gets the vibUrls value for this StageHostPatchRequestType.
	 * 
	 * @return vibUrls
	 */
	public java.lang.String[] getVibUrls() {
		return vibUrls;
	}

	/**
	 * Sets the vibUrls value for this StageHostPatchRequestType.
	 * 
	 * @param vibUrls
	 */
	public void setVibUrls(java.lang.String[] vibUrls) {
		this.vibUrls = vibUrls;
	}

	public java.lang.String getVibUrls(int i) {
		return this.vibUrls[i];
	}

	public void setVibUrls(int i, java.lang.String _value) {
		this.vibUrls[i] = _value;
	}

	/**
	 * Gets the spec value for this StageHostPatchRequestType.
	 * 
	 * @return spec
	 */
	public com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec getSpec() {
		return spec;
	}

	/**
	 * Sets the spec value for this StageHostPatchRequestType.
	 * 
	 * @param spec
	 */
	public void setSpec(
			com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec spec) {
		this.spec = spec;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof StageHostPatchRequestType)) {
			return false;
		}
		StageHostPatchRequestType other = (StageHostPatchRequestType) obj;
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
				&& ((this.metaUrls == null && other.getMetaUrls() == null) || (this.metaUrls != null && java.util.Arrays
						.equals(this.metaUrls, other.getMetaUrls())))
				&& ((this.bundleUrls == null && other.getBundleUrls() == null) || (this.bundleUrls != null && java.util.Arrays
						.equals(this.bundleUrls, other.getBundleUrls())))
				&& ((this.vibUrls == null && other.getVibUrls() == null) || (this.vibUrls != null && java.util.Arrays
						.equals(this.vibUrls, other.getVibUrls())))
				&& ((this.spec == null && other.getSpec() == null) || (this.spec != null && this.spec
						.equals(other.getSpec())));
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
		if (getMetaUrls() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getMetaUrls()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getMetaUrls(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getBundleUrls() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getBundleUrls()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getBundleUrls(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getVibUrls() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getVibUrls()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVibUrls(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getSpec() != null) {
			_hashCode += getSpec().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			StageHostPatchRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"StageHostPatchRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("metaUrls");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"metaUrls"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("bundleUrls");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"bundleUrls"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vibUrls");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vibUrls"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("spec");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPatchManagerPatchManagerOperationSpec"));
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
