/**
 * InstallHostPatchRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class InstallHostPatchRequestType  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference _this;

    private com.vmware.vim25.HostPatchManagerLocator repository;

    private java.lang.String updateID;

    private java.lang.Boolean force;

    public InstallHostPatchRequestType() {
    }

    public InstallHostPatchRequestType(
           com.vmware.vim25.ManagedObjectReference _this,
           com.vmware.vim25.HostPatchManagerLocator repository,
           java.lang.String updateID,
           java.lang.Boolean force) {
           this._this = _this;
           this.repository = repository;
           this.updateID = updateID;
           this.force = force;
    }


    /**
     * Gets the _this value for this InstallHostPatchRequestType.
     * 
     * @return _this
     */
    public com.vmware.vim25.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this InstallHostPatchRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the repository value for this InstallHostPatchRequestType.
     * 
     * @return repository
     */
    public com.vmware.vim25.HostPatchManagerLocator getRepository() {
        return repository;
    }


    /**
     * Sets the repository value for this InstallHostPatchRequestType.
     * 
     * @param repository
     */
    public void setRepository(com.vmware.vim25.HostPatchManagerLocator repository) {
        this.repository = repository;
    }


    /**
     * Gets the updateID value for this InstallHostPatchRequestType.
     * 
     * @return updateID
     */
    public java.lang.String getUpdateID() {
        return updateID;
    }


    /**
     * Sets the updateID value for this InstallHostPatchRequestType.
     * 
     * @param updateID
     */
    public void setUpdateID(java.lang.String updateID) {
        this.updateID = updateID;
    }


    /**
     * Gets the force value for this InstallHostPatchRequestType.
     * 
     * @return force
     */
    public java.lang.Boolean getForce() {
        return force;
    }


    /**
     * Sets the force value for this InstallHostPatchRequestType.
     * 
     * @param force
     */
    public void setForce(java.lang.Boolean force) {
        this.force = force;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstallHostPatchRequestType)) return false;
        InstallHostPatchRequestType other = (InstallHostPatchRequestType) obj;
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
            ((this.repository==null && other.getRepository()==null) || 
             (this.repository!=null &&
              this.repository.equals(other.getRepository()))) &&
            ((this.updateID==null && other.getUpdateID()==null) || 
             (this.updateID!=null &&
              this.updateID.equals(other.getUpdateID()))) &&
            ((this.force==null && other.getForce()==null) || 
             (this.force!=null &&
              this.force.equals(other.getForce())));
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
        if (getRepository() != null) {
            _hashCode += getRepository().hashCode();
        }
        if (getUpdateID() != null) {
            _hashCode += getUpdateID().hashCode();
        }
        if (getForce() != null) {
            _hashCode += getForce().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstallHostPatchRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "InstallHostPatchRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repository");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "repository"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPatchManagerLocator"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "updateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("force");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "force"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
