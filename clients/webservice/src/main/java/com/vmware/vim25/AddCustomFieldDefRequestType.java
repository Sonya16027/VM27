/**
 * AddCustomFieldDefRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class AddCustomFieldDefRequestType  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference _this;

    private java.lang.String name;

    private java.lang.String moType;

    private com.vmware.vim25.PrivilegePolicyDef fieldDefPolicy;

    private com.vmware.vim25.PrivilegePolicyDef fieldPolicy;

    public AddCustomFieldDefRequestType() {
    }

    public AddCustomFieldDefRequestType(
           com.vmware.vim25.ManagedObjectReference _this,
           java.lang.String name,
           java.lang.String moType,
           com.vmware.vim25.PrivilegePolicyDef fieldDefPolicy,
           com.vmware.vim25.PrivilegePolicyDef fieldPolicy) {
           this._this = _this;
           this.name = name;
           this.moType = moType;
           this.fieldDefPolicy = fieldDefPolicy;
           this.fieldPolicy = fieldPolicy;
    }


    /**
     * Gets the _this value for this AddCustomFieldDefRequestType.
     * 
     * @return _this
     */
    public com.vmware.vim25.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this AddCustomFieldDefRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the name value for this AddCustomFieldDefRequestType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AddCustomFieldDefRequestType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the moType value for this AddCustomFieldDefRequestType.
     * 
     * @return moType
     */
    public java.lang.String getMoType() {
        return moType;
    }


    /**
     * Sets the moType value for this AddCustomFieldDefRequestType.
     * 
     * @param moType
     */
    public void setMoType(java.lang.String moType) {
        this.moType = moType;
    }


    /**
     * Gets the fieldDefPolicy value for this AddCustomFieldDefRequestType.
     * 
     * @return fieldDefPolicy
     */
    public com.vmware.vim25.PrivilegePolicyDef getFieldDefPolicy() {
        return fieldDefPolicy;
    }


    /**
     * Sets the fieldDefPolicy value for this AddCustomFieldDefRequestType.
     * 
     * @param fieldDefPolicy
     */
    public void setFieldDefPolicy(com.vmware.vim25.PrivilegePolicyDef fieldDefPolicy) {
        this.fieldDefPolicy = fieldDefPolicy;
    }


    /**
     * Gets the fieldPolicy value for this AddCustomFieldDefRequestType.
     * 
     * @return fieldPolicy
     */
    public com.vmware.vim25.PrivilegePolicyDef getFieldPolicy() {
        return fieldPolicy;
    }


    /**
     * Sets the fieldPolicy value for this AddCustomFieldDefRequestType.
     * 
     * @param fieldPolicy
     */
    public void setFieldPolicy(com.vmware.vim25.PrivilegePolicyDef fieldPolicy) {
        this.fieldPolicy = fieldPolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddCustomFieldDefRequestType)) return false;
        AddCustomFieldDefRequestType other = (AddCustomFieldDefRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._this==null && other.get_this()==null) || 
             (this._this!=null &&
              this._this.equals(other.get_this()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.moType==null && other.getMoType()==null) || 
             (this.moType!=null &&
              this.moType.equals(other.getMoType()))) &&
            ((this.fieldDefPolicy==null && other.getFieldDefPolicy()==null) || 
             (this.fieldDefPolicy!=null &&
              this.fieldDefPolicy.equals(other.getFieldDefPolicy()))) &&
            ((this.fieldPolicy==null && other.getFieldPolicy()==null) || 
             (this.fieldPolicy!=null &&
              this.fieldPolicy.equals(other.getFieldPolicy())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getMoType() != null) {
            _hashCode += getMoType().hashCode();
        }
        if (getFieldDefPolicy() != null) {
            _hashCode += getFieldDefPolicy().hashCode();
        }
        if (getFieldPolicy() != null) {
            _hashCode += getFieldPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddCustomFieldDefRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AddCustomFieldDefRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "moType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldDefPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fieldDefPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PrivilegePolicyDef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldPolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fieldPolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PrivilegePolicyDef"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
