/**
 * Edge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class Edge  extends com.vmware.vim.sms.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.sms.EntityReference sourceEntity;

    private com.vmware.vim.sms.EntityReference destEntity;

    private com.vmware.vim.sms.EdgeStatus status;

    private boolean direct;

    public Edge() {
    }

    public Edge(
           java.lang.String dynamicType,
           com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
           com.vmware.vim.sms.EntityReference sourceEntity,
           com.vmware.vim.sms.EntityReference destEntity,
           com.vmware.vim.sms.EdgeStatus status,
           boolean direct) {
        super(
            dynamicType,
            dynamicProperty);
        this.sourceEntity = sourceEntity;
        this.destEntity = destEntity;
        this.status = status;
        this.direct = direct;
    }


    /**
     * Gets the sourceEntity value for this Edge.
     * 
     * @return sourceEntity
     */
    public com.vmware.vim.sms.EntityReference getSourceEntity() {
        return sourceEntity;
    }


    /**
     * Sets the sourceEntity value for this Edge.
     * 
     * @param sourceEntity
     */
    public void setSourceEntity(com.vmware.vim.sms.EntityReference sourceEntity) {
        this.sourceEntity = sourceEntity;
    }


    /**
     * Gets the destEntity value for this Edge.
     * 
     * @return destEntity
     */
    public com.vmware.vim.sms.EntityReference getDestEntity() {
        return destEntity;
    }


    /**
     * Sets the destEntity value for this Edge.
     * 
     * @param destEntity
     */
    public void setDestEntity(com.vmware.vim.sms.EntityReference destEntity) {
        this.destEntity = destEntity;
    }


    /**
     * Gets the status value for this Edge.
     * 
     * @return status
     */
    public com.vmware.vim.sms.EdgeStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Edge.
     * 
     * @param status
     */
    public void setStatus(com.vmware.vim.sms.EdgeStatus status) {
        this.status = status;
    }


    /**
     * Gets the direct value for this Edge.
     * 
     * @return direct
     */
    public boolean isDirect() {
        return direct;
    }


    /**
     * Sets the direct value for this Edge.
     * 
     * @param direct
     */
    public void setDirect(boolean direct) {
        this.direct = direct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Edge)) return false;
        Edge other = (Edge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sourceEntity==null && other.getSourceEntity()==null) || 
             (this.sourceEntity!=null &&
              this.sourceEntity.equals(other.getSourceEntity()))) &&
            ((this.destEntity==null && other.getDestEntity()==null) || 
             (this.destEntity!=null &&
              this.destEntity.equals(other.getDestEntity()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.direct == other.isDirect();
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
        if (getSourceEntity() != null) {
            _hashCode += getSourceEntity().hashCode();
        }
        if (getDestEntity() != null) {
            _hashCode += getDestEntity().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += (isDirect() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Edge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1", "Edge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "sourceEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "EntityReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "destEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "EntityReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "EdgeStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "direct"));
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
