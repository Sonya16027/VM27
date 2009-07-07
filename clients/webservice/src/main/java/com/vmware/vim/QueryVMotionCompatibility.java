/**
 * QueryVMotionCompatibility.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class QueryVMotionCompatibility  implements java.io.Serializable {
    private com.vmware.vim.ManagedObjectReference _this;

    private com.vmware.vim.ManagedObjectReference vm;

    private com.vmware.vim.ManagedObjectReference[] host;

    private java.lang.String[] compatibility;

    public QueryVMotionCompatibility() {
    }

    public QueryVMotionCompatibility(
           com.vmware.vim.ManagedObjectReference _this,
           com.vmware.vim.ManagedObjectReference vm,
           com.vmware.vim.ManagedObjectReference[] host,
           java.lang.String[] compatibility) {
           this._this = _this;
           this.vm = vm;
           this.host = host;
           this.compatibility = compatibility;
    }


    /**
     * Gets the _this value for this QueryVMotionCompatibility.
     * 
     * @return _this
     */
    public com.vmware.vim.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this QueryVMotionCompatibility.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the vm value for this QueryVMotionCompatibility.
     * 
     * @return vm
     */
    public com.vmware.vim.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this QueryVMotionCompatibility.
     * 
     * @param vm
     */
    public void setVm(com.vmware.vim.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the host value for this QueryVMotionCompatibility.
     * 
     * @return host
     */
    public com.vmware.vim.ManagedObjectReference[] getHost() {
        return host;
    }


    /**
     * Sets the host value for this QueryVMotionCompatibility.
     * 
     * @param host
     */
    public void setHost(com.vmware.vim.ManagedObjectReference[] host) {
        this.host = host;
    }

    public com.vmware.vim.ManagedObjectReference getHost(int i) {
        return this.host[i];
    }

    public void setHost(int i, com.vmware.vim.ManagedObjectReference _value) {
        this.host[i] = _value;
    }


    /**
     * Gets the compatibility value for this QueryVMotionCompatibility.
     * 
     * @return compatibility
     */
    public java.lang.String[] getCompatibility() {
        return compatibility;
    }


    /**
     * Sets the compatibility value for this QueryVMotionCompatibility.
     * 
     * @param compatibility
     */
    public void setCompatibility(java.lang.String[] compatibility) {
        this.compatibility = compatibility;
    }

    public java.lang.String getCompatibility(int i) {
        return this.compatibility[i];
    }

    public void setCompatibility(int i, java.lang.String _value) {
        this.compatibility[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryVMotionCompatibility)) return false;
        QueryVMotionCompatibility other = (QueryVMotionCompatibility) obj;
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
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              java.util.Arrays.equals(this.host, other.getHost()))) &&
            ((this.compatibility==null && other.getCompatibility()==null) || 
             (this.compatibility!=null &&
              java.util.Arrays.equals(this.compatibility, other.getCompatibility())));
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
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        if (getHost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompatibility() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompatibility());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompatibility(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryVMotionCompatibility.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", ">QueryVMotionCompatibility"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compatibility");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "compatibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
