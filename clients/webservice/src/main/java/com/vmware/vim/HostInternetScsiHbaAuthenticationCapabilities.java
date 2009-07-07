/**
 * HostInternetScsiHbaAuthenticationCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostInternetScsiHbaAuthenticationCapabilities  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private boolean chapAuthSettable;

    private boolean krb5AuthSettable;

    private boolean srpAuthSettable;

    private boolean spkmAuthSettable;

    public HostInternetScsiHbaAuthenticationCapabilities() {
    }

    public HostInternetScsiHbaAuthenticationCapabilities(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           boolean chapAuthSettable,
           boolean krb5AuthSettable,
           boolean srpAuthSettable,
           boolean spkmAuthSettable) {
        super(
            dynamicType,
            dynamicProperty);
        this.chapAuthSettable = chapAuthSettable;
        this.krb5AuthSettable = krb5AuthSettable;
        this.srpAuthSettable = srpAuthSettable;
        this.spkmAuthSettable = spkmAuthSettable;
    }


    /**
     * Gets the chapAuthSettable value for this HostInternetScsiHbaAuthenticationCapabilities.
     * 
     * @return chapAuthSettable
     */
    public boolean isChapAuthSettable() {
        return chapAuthSettable;
    }


    /**
     * Sets the chapAuthSettable value for this HostInternetScsiHbaAuthenticationCapabilities.
     * 
     * @param chapAuthSettable
     */
    public void setChapAuthSettable(boolean chapAuthSettable) {
        this.chapAuthSettable = chapAuthSettable;
    }


    /**
     * Gets the krb5AuthSettable value for this HostInternetScsiHbaAuthenticationCapabilities.
     * 
     * @return krb5AuthSettable
     */
    public boolean isKrb5AuthSettable() {
        return krb5AuthSettable;
    }


    /**
     * Sets the krb5AuthSettable value for this HostInternetScsiHbaAuthenticationCapabilities.
     * 
     * @param krb5AuthSettable
     */
    public void setKrb5AuthSettable(boolean krb5AuthSettable) {
        this.krb5AuthSettable = krb5AuthSettable;
    }


    /**
     * Gets the srpAuthSettable value for this HostInternetScsiHbaAuthenticationCapabilities.
     * 
     * @return srpAuthSettable
     */
    public boolean isSrpAuthSettable() {
        return srpAuthSettable;
    }


    /**
     * Sets the srpAuthSettable value for this HostInternetScsiHbaAuthenticationCapabilities.
     * 
     * @param srpAuthSettable
     */
    public void setSrpAuthSettable(boolean srpAuthSettable) {
        this.srpAuthSettable = srpAuthSettable;
    }


    /**
     * Gets the spkmAuthSettable value for this HostInternetScsiHbaAuthenticationCapabilities.
     * 
     * @return spkmAuthSettable
     */
    public boolean isSpkmAuthSettable() {
        return spkmAuthSettable;
    }


    /**
     * Sets the spkmAuthSettable value for this HostInternetScsiHbaAuthenticationCapabilities.
     * 
     * @param spkmAuthSettable
     */
    public void setSpkmAuthSettable(boolean spkmAuthSettable) {
        this.spkmAuthSettable = spkmAuthSettable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostInternetScsiHbaAuthenticationCapabilities)) return false;
        HostInternetScsiHbaAuthenticationCapabilities other = (HostInternetScsiHbaAuthenticationCapabilities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.chapAuthSettable == other.isChapAuthSettable() &&
            this.krb5AuthSettable == other.isKrb5AuthSettable() &&
            this.srpAuthSettable == other.isSrpAuthSettable() &&
            this.spkmAuthSettable == other.isSpkmAuthSettable();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += (isChapAuthSettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isKrb5AuthSettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSrpAuthSettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSpkmAuthSettable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaAuthenticationCapabilities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostInternetScsiHbaAuthenticationCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chapAuthSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "chapAuthSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("krb5AuthSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "krb5AuthSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srpAuthSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "srpAuthSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spkmAuthSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "spkmAuthSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
