/**
 * QueryCompatibleHostForExistingDvsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class QueryCompatibleHostForExistingDvsRequestType  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference _this;

    private com.vmware.vim25.ManagedObjectReference container;

    private boolean recursive;

    private com.vmware.vim25.ManagedObjectReference dvs;

    public QueryCompatibleHostForExistingDvsRequestType() {
    }

    public QueryCompatibleHostForExistingDvsRequestType(
           com.vmware.vim25.ManagedObjectReference _this,
           com.vmware.vim25.ManagedObjectReference container,
           boolean recursive,
           com.vmware.vim25.ManagedObjectReference dvs) {
           this._this = _this;
           this.container = container;
           this.recursive = recursive;
           this.dvs = dvs;
    }


    /**
     * Gets the _this value for this QueryCompatibleHostForExistingDvsRequestType.
     * 
     * @return _this
     */
    public com.vmware.vim25.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this QueryCompatibleHostForExistingDvsRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the container value for this QueryCompatibleHostForExistingDvsRequestType.
     * 
     * @return container
     */
    public com.vmware.vim25.ManagedObjectReference getContainer() {
        return container;
    }


    /**
     * Sets the container value for this QueryCompatibleHostForExistingDvsRequestType.
     * 
     * @param container
     */
    public void setContainer(com.vmware.vim25.ManagedObjectReference container) {
        this.container = container;
    }


    /**
     * Gets the recursive value for this QueryCompatibleHostForExistingDvsRequestType.
     * 
     * @return recursive
     */
    public boolean isRecursive() {
        return recursive;
    }


    /**
     * Sets the recursive value for this QueryCompatibleHostForExistingDvsRequestType.
     * 
     * @param recursive
     */
    public void setRecursive(boolean recursive) {
        this.recursive = recursive;
    }


    /**
     * Gets the dvs value for this QueryCompatibleHostForExistingDvsRequestType.
     * 
     * @return dvs
     */
    public com.vmware.vim25.ManagedObjectReference getDvs() {
        return dvs;
    }


    /**
     * Sets the dvs value for this QueryCompatibleHostForExistingDvsRequestType.
     * 
     * @param dvs
     */
    public void setDvs(com.vmware.vim25.ManagedObjectReference dvs) {
        this.dvs = dvs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryCompatibleHostForExistingDvsRequestType)) return false;
        QueryCompatibleHostForExistingDvsRequestType other = (QueryCompatibleHostForExistingDvsRequestType) obj;
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
            ((this.container==null && other.getContainer()==null) || 
             (this.container!=null &&
              this.container.equals(other.getContainer()))) &&
            this.recursive == other.isRecursive() &&
            ((this.dvs==null && other.getDvs()==null) || 
             (this.dvs!=null &&
              this.dvs.equals(other.getDvs())));
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
        if (getContainer() != null) {
            _hashCode += getContainer().hashCode();
        }
        _hashCode += (isRecursive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDvs() != null) {
            _hashCode += getDvs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryCompatibleHostForExistingDvsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "QueryCompatibleHostForExistingDvsRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("container");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "container"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recursive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recursive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
