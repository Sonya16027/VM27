/**
 * FindByIp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class FindByIp  implements java.io.Serializable {
    private com.vmware.vim.ManagedObjectReference _this;

    private com.vmware.vim.ManagedObjectReference datacenter;

    private java.lang.String ip;

    private boolean vmSearch;

    public FindByIp() {
    }

    public FindByIp(
           com.vmware.vim.ManagedObjectReference _this,
           com.vmware.vim.ManagedObjectReference datacenter,
           java.lang.String ip,
           boolean vmSearch) {
           this._this = _this;
           this.datacenter = datacenter;
           this.ip = ip;
           this.vmSearch = vmSearch;
    }


    /**
     * Gets the _this value for this FindByIp.
     * 
     * @return _this
     */
    public com.vmware.vim.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this FindByIp.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the datacenter value for this FindByIp.
     * 
     * @return datacenter
     */
    public com.vmware.vim.ManagedObjectReference getDatacenter() {
        return datacenter;
    }


    /**
     * Sets the datacenter value for this FindByIp.
     * 
     * @param datacenter
     */
    public void setDatacenter(com.vmware.vim.ManagedObjectReference datacenter) {
        this.datacenter = datacenter;
    }


    /**
     * Gets the ip value for this FindByIp.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this FindByIp.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the vmSearch value for this FindByIp.
     * 
     * @return vmSearch
     */
    public boolean isVmSearch() {
        return vmSearch;
    }


    /**
     * Sets the vmSearch value for this FindByIp.
     * 
     * @param vmSearch
     */
    public void setVmSearch(boolean vmSearch) {
        this.vmSearch = vmSearch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindByIp)) return false;
        FindByIp other = (FindByIp) obj;
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
            ((this.datacenter==null && other.getDatacenter()==null) || 
             (this.datacenter!=null &&
              this.datacenter.equals(other.getDatacenter()))) &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            this.vmSearch == other.isVmSearch();
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
        if (getDatacenter() != null) {
            _hashCode += getDatacenter().hashCode();
        }
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        _hashCode += (isVmSearch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindByIp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", ">FindByIp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datacenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "datacenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "vmSearch"));
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
