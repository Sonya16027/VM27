/**
 * UpdateVcDbConnectionInfoRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class UpdateVcDbConnectionInfoRequestType  implements java.io.Serializable {
    private com.vmware.vim.sms.ManagedObjectReference _this;

    private com.vmware.vim.sms.DbConnectionSpec dbConnectionSpec;

    public UpdateVcDbConnectionInfoRequestType() {
    }

    public UpdateVcDbConnectionInfoRequestType(
           com.vmware.vim.sms.ManagedObjectReference _this,
           com.vmware.vim.sms.DbConnectionSpec dbConnectionSpec) {
           this._this = _this;
           this.dbConnectionSpec = dbConnectionSpec;
    }


    /**
     * Gets the _this value for this UpdateVcDbConnectionInfoRequestType.
     * 
     * @return _this
     */
    public com.vmware.vim.sms.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this UpdateVcDbConnectionInfoRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim.sms.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the dbConnectionSpec value for this UpdateVcDbConnectionInfoRequestType.
     * 
     * @return dbConnectionSpec
     */
    public com.vmware.vim.sms.DbConnectionSpec getDbConnectionSpec() {
        return dbConnectionSpec;
    }


    /**
     * Sets the dbConnectionSpec value for this UpdateVcDbConnectionInfoRequestType.
     * 
     * @param dbConnectionSpec
     */
    public void setDbConnectionSpec(com.vmware.vim.sms.DbConnectionSpec dbConnectionSpec) {
        this.dbConnectionSpec = dbConnectionSpec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateVcDbConnectionInfoRequestType)) return false;
        UpdateVcDbConnectionInfoRequestType other = (UpdateVcDbConnectionInfoRequestType) obj;
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
            ((this.dbConnectionSpec==null && other.getDbConnectionSpec()==null) || 
             (this.dbConnectionSpec!=null &&
              this.dbConnectionSpec.equals(other.getDbConnectionSpec())));
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
        if (getDbConnectionSpec() != null) {
            _hashCode += getDbConnectionSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateVcDbConnectionInfoRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1", "UpdateVcDbConnectionInfoRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbConnectionSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "dbConnectionSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "DbConnectionSpec"));
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
