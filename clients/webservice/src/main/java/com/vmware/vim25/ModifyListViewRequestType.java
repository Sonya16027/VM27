/**
 * ModifyListViewRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ModifyListViewRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.ManagedObjectReference[] add;

	private com.vmware.vim25.ManagedObjectReference[] remove;

	public ModifyListViewRequestType() {
	}

	public ModifyListViewRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference[] add,
			com.vmware.vim25.ManagedObjectReference[] remove) {
		this._this = _this;
		this.add = add;
		this.remove = remove;
	}

	/**
	 * Gets the _this value for this ModifyListViewRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this ModifyListViewRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the add value for this ModifyListViewRequestType.
	 * 
	 * @return add
	 */
	public com.vmware.vim25.ManagedObjectReference[] getAdd() {
		return add;
	}

	/**
	 * Sets the add value for this ModifyListViewRequestType.
	 * 
	 * @param add
	 */
	public void setAdd(com.vmware.vim25.ManagedObjectReference[] add) {
		this.add = add;
	}

	public com.vmware.vim25.ManagedObjectReference getAdd(int i) {
		return this.add[i];
	}

	public void setAdd(int i, com.vmware.vim25.ManagedObjectReference _value) {
		this.add[i] = _value;
	}

	/**
	 * Gets the remove value for this ModifyListViewRequestType.
	 * 
	 * @return remove
	 */
	public com.vmware.vim25.ManagedObjectReference[] getRemove() {
		return remove;
	}

	/**
	 * Sets the remove value for this ModifyListViewRequestType.
	 * 
	 * @param remove
	 */
	public void setRemove(com.vmware.vim25.ManagedObjectReference[] remove) {
		this.remove = remove;
	}

	public com.vmware.vim25.ManagedObjectReference getRemove(int i) {
		return this.remove[i];
	}

	public void setRemove(int i, com.vmware.vim25.ManagedObjectReference _value) {
		this.remove[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ModifyListViewRequestType)) {
			return false;
		}
		ModifyListViewRequestType other = (ModifyListViewRequestType) obj;
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
				&& ((this.add == null && other.getAdd() == null) || (this.add != null && java.util.Arrays
						.equals(this.add, other.getAdd())))
				&& ((this.remove == null && other.getRemove() == null) || (this.remove != null && java.util.Arrays
						.equals(this.remove, other.getRemove())));
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
		if (getAdd() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getAdd()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getAdd(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getRemove() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getRemove()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getRemove(),
						i);
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
			ModifyListViewRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ModifyListViewRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("add");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "add"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("remove");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"remove"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
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
