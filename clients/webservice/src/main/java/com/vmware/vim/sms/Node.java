/**
 * Node.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class Node  extends com.vmware.vim.sms.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.sms.EntityReference entity;

    private java.lang.String name;

    private com.vmware.vim.sms.NodeStatus status;

    private com.vmware.vim.sms.NodeProperty[] property;

    public Node() {
    }

    public Node(
           java.lang.String dynamicType,
           com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
           com.vmware.vim.sms.EntityReference entity,
           java.lang.String name,
           com.vmware.vim.sms.NodeStatus status,
           com.vmware.vim.sms.NodeProperty[] property) {
        super(
            dynamicType,
            dynamicProperty);
        this.entity = entity;
        this.name = name;
        this.status = status;
        this.property = property;
    }


    /**
     * Gets the entity value for this Node.
     * 
     * @return entity
     */
    public com.vmware.vim.sms.EntityReference getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this Node.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.vim.sms.EntityReference entity) {
        this.entity = entity;
    }


    /**
     * Gets the name value for this Node.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Node.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this Node.
     * 
     * @return status
     */
    public com.vmware.vim.sms.NodeStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Node.
     * 
     * @param status
     */
    public void setStatus(com.vmware.vim.sms.NodeStatus status) {
        this.status = status;
    }


    /**
     * Gets the property value for this Node.
     * 
     * @return property
     */
    public com.vmware.vim.sms.NodeProperty[] getProperty() {
        return property;
    }


    /**
     * Sets the property value for this Node.
     * 
     * @param property
     */
    public void setProperty(com.vmware.vim.sms.NodeProperty[] property) {
        this.property = property;
    }

    public com.vmware.vim.sms.NodeProperty getProperty(int i) {
        return this.property[i];
    }

    public void setProperty(int i, com.vmware.vim.sms.NodeProperty _value) {
        this.property[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Node)) return false;
        Node other = (Node) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.property==null && other.getProperty()==null) || 
             (this.property!=null &&
              java.util.Arrays.equals(this.property, other.getProperty())));
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
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProperty(), i);
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
        new org.apache.axis.description.TypeDesc(Node.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1", "Node"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "EntityReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "NodeStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "property"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "NodeProperty"));
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
