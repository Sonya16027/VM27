/**
 * QueryPartitionCreateOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class QueryPartitionCreateOptions  implements java.io.Serializable {
    private com.vmware.vim.ManagedObjectReference _this;

    private java.lang.String storageType;

    private java.lang.String diagnosticType;

    public QueryPartitionCreateOptions() {
    }

    public QueryPartitionCreateOptions(
           com.vmware.vim.ManagedObjectReference _this,
           java.lang.String storageType,
           java.lang.String diagnosticType) {
           this._this = _this;
           this.storageType = storageType;
           this.diagnosticType = diagnosticType;
    }


    /**
     * Gets the _this value for this QueryPartitionCreateOptions.
     * 
     * @return _this
     */
    public com.vmware.vim.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this QueryPartitionCreateOptions.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the storageType value for this QueryPartitionCreateOptions.
     * 
     * @return storageType
     */
    public java.lang.String getStorageType() {
        return storageType;
    }


    /**
     * Sets the storageType value for this QueryPartitionCreateOptions.
     * 
     * @param storageType
     */
    public void setStorageType(java.lang.String storageType) {
        this.storageType = storageType;
    }


    /**
     * Gets the diagnosticType value for this QueryPartitionCreateOptions.
     * 
     * @return diagnosticType
     */
    public java.lang.String getDiagnosticType() {
        return diagnosticType;
    }


    /**
     * Sets the diagnosticType value for this QueryPartitionCreateOptions.
     * 
     * @param diagnosticType
     */
    public void setDiagnosticType(java.lang.String diagnosticType) {
        this.diagnosticType = diagnosticType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPartitionCreateOptions)) return false;
        QueryPartitionCreateOptions other = (QueryPartitionCreateOptions) obj;
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
            ((this.storageType==null && other.getStorageType()==null) || 
             (this.storageType!=null &&
              this.storageType.equals(other.getStorageType()))) &&
            ((this.diagnosticType==null && other.getDiagnosticType()==null) || 
             (this.diagnosticType!=null &&
              this.diagnosticType.equals(other.getDiagnosticType())));
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
        if (getStorageType() != null) {
            _hashCode += getStorageType().hashCode();
        }
        if (getDiagnosticType() != null) {
            _hashCode += getDiagnosticType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPartitionCreateOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", ">QueryPartitionCreateOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "storageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnosticType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "diagnosticType"));
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
