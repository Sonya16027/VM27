/**
 * UnsupportedDbUrl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class UnsupportedDbUrl  extends com.vmware.vim.sms.DbConfigFailed  implements java.io.Serializable {
    private java.lang.String dbUrl;

    public UnsupportedDbUrl() {
    }

    public UnsupportedDbUrl(
           java.lang.String dynamicType,
           com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
           java.lang.String dbUrl) {
        super(
            dynamicType,
            dynamicProperty);
        this.dbUrl = dbUrl;
    }


    /**
     * Gets the dbUrl value for this UnsupportedDbUrl.
     * 
     * @return dbUrl
     */
    public java.lang.String getDbUrl() {
        return dbUrl;
    }


    /**
     * Sets the dbUrl value for this UnsupportedDbUrl.
     * 
     * @param dbUrl
     */
    public void setDbUrl(java.lang.String dbUrl) {
        this.dbUrl = dbUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UnsupportedDbUrl)) return false;
        UnsupportedDbUrl other = (UnsupportedDbUrl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dbUrl==null && other.getDbUrl()==null) || 
             (this.dbUrl!=null &&
              this.dbUrl.equals(other.getDbUrl())));
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
        if (getDbUrl() != null) {
            _hashCode += getDbUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnsupportedDbUrl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1", "UnsupportedDbUrl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "dbUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
