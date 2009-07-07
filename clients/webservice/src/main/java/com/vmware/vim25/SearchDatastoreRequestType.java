/**
 * SearchDatastoreRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class SearchDatastoreRequestType  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference _this;

    private java.lang.String datastorePath;

    private com.vmware.vim25.HostDatastoreBrowserSearchSpec searchSpec;

    public SearchDatastoreRequestType() {
    }

    public SearchDatastoreRequestType(
           com.vmware.vim25.ManagedObjectReference _this,
           java.lang.String datastorePath,
           com.vmware.vim25.HostDatastoreBrowserSearchSpec searchSpec) {
           this._this = _this;
           this.datastorePath = datastorePath;
           this.searchSpec = searchSpec;
    }


    /**
     * Gets the _this value for this SearchDatastoreRequestType.
     * 
     * @return _this
     */
    public com.vmware.vim25.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this SearchDatastoreRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the datastorePath value for this SearchDatastoreRequestType.
     * 
     * @return datastorePath
     */
    public java.lang.String getDatastorePath() {
        return datastorePath;
    }


    /**
     * Sets the datastorePath value for this SearchDatastoreRequestType.
     * 
     * @param datastorePath
     */
    public void setDatastorePath(java.lang.String datastorePath) {
        this.datastorePath = datastorePath;
    }


    /**
     * Gets the searchSpec value for this SearchDatastoreRequestType.
     * 
     * @return searchSpec
     */
    public com.vmware.vim25.HostDatastoreBrowserSearchSpec getSearchSpec() {
        return searchSpec;
    }


    /**
     * Sets the searchSpec value for this SearchDatastoreRequestType.
     * 
     * @param searchSpec
     */
    public void setSearchSpec(com.vmware.vim25.HostDatastoreBrowserSearchSpec searchSpec) {
        this.searchSpec = searchSpec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchDatastoreRequestType)) return false;
        SearchDatastoreRequestType other = (SearchDatastoreRequestType) obj;
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
            ((this.datastorePath==null && other.getDatastorePath()==null) || 
             (this.datastorePath!=null &&
              this.datastorePath.equals(other.getDatastorePath()))) &&
            ((this.searchSpec==null && other.getSearchSpec()==null) || 
             (this.searchSpec!=null &&
              this.searchSpec.equals(other.getSearchSpec())));
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
        if (getDatastorePath() != null) {
            _hashCode += getDatastorePath().hashCode();
        }
        if (getSearchSpec() != null) {
            _hashCode += getSearchSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchDatastoreRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SearchDatastoreRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastorePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastorePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "searchSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDatastoreBrowserSearchSpec"));
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
