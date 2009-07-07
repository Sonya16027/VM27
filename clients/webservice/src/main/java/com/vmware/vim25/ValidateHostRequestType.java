/**
 * ValidateHostRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ValidateHostRequestType  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference _this;

    private java.lang.String ovfDescriptor;

    private com.vmware.vim25.ManagedObjectReference host;

    private com.vmware.vim25.OvfValidateHostParams vhp;

    public ValidateHostRequestType() {
    }

    public ValidateHostRequestType(
           com.vmware.vim25.ManagedObjectReference _this,
           java.lang.String ovfDescriptor,
           com.vmware.vim25.ManagedObjectReference host,
           com.vmware.vim25.OvfValidateHostParams vhp) {
           this._this = _this;
           this.ovfDescriptor = ovfDescriptor;
           this.host = host;
           this.vhp = vhp;
    }


    /**
     * Gets the _this value for this ValidateHostRequestType.
     * 
     * @return _this
     */
    public com.vmware.vim25.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this ValidateHostRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the ovfDescriptor value for this ValidateHostRequestType.
     * 
     * @return ovfDescriptor
     */
    public java.lang.String getOvfDescriptor() {
        return ovfDescriptor;
    }


    /**
     * Sets the ovfDescriptor value for this ValidateHostRequestType.
     * 
     * @param ovfDescriptor
     */
    public void setOvfDescriptor(java.lang.String ovfDescriptor) {
        this.ovfDescriptor = ovfDescriptor;
    }


    /**
     * Gets the host value for this ValidateHostRequestType.
     * 
     * @return host
     */
    public com.vmware.vim25.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this ValidateHostRequestType.
     * 
     * @param host
     */
    public void setHost(com.vmware.vim25.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the vhp value for this ValidateHostRequestType.
     * 
     * @return vhp
     */
    public com.vmware.vim25.OvfValidateHostParams getVhp() {
        return vhp;
    }


    /**
     * Sets the vhp value for this ValidateHostRequestType.
     * 
     * @param vhp
     */
    public void setVhp(com.vmware.vim25.OvfValidateHostParams vhp) {
        this.vhp = vhp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateHostRequestType)) return false;
        ValidateHostRequestType other = (ValidateHostRequestType) obj;
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
            ((this.ovfDescriptor==null && other.getOvfDescriptor()==null) || 
             (this.ovfDescriptor!=null &&
              this.ovfDescriptor.equals(other.getOvfDescriptor()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.vhp==null && other.getVhp()==null) || 
             (this.vhp!=null &&
              this.vhp.equals(other.getVhp())));
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
        if (getOvfDescriptor() != null) {
            _hashCode += getOvfDescriptor().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getVhp() != null) {
            _hashCode += getVhp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateHostRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ValidateHostRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovfDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ovfDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vhp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vhp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfValidateHostParams"));
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
