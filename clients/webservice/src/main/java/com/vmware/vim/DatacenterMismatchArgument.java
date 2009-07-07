/**
 * DatacenterMismatchArgument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class DatacenterMismatchArgument  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.ManagedObjectReference entity;

    private com.vmware.vim.ManagedObjectReference inputDatacenter;

    public DatacenterMismatchArgument() {
    }

    public DatacenterMismatchArgument(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           com.vmware.vim.ManagedObjectReference entity,
           com.vmware.vim.ManagedObjectReference inputDatacenter) {
        super(
            dynamicType,
            dynamicProperty);
        this.entity = entity;
        this.inputDatacenter = inputDatacenter;
    }


    /**
     * Gets the entity value for this DatacenterMismatchArgument.
     * 
     * @return entity
     */
    public com.vmware.vim.ManagedObjectReference getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this DatacenterMismatchArgument.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.vim.ManagedObjectReference entity) {
        this.entity = entity;
    }


    /**
     * Gets the inputDatacenter value for this DatacenterMismatchArgument.
     * 
     * @return inputDatacenter
     */
    public com.vmware.vim.ManagedObjectReference getInputDatacenter() {
        return inputDatacenter;
    }


    /**
     * Sets the inputDatacenter value for this DatacenterMismatchArgument.
     * 
     * @param inputDatacenter
     */
    public void setInputDatacenter(com.vmware.vim.ManagedObjectReference inputDatacenter) {
        this.inputDatacenter = inputDatacenter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatacenterMismatchArgument)) return false;
        DatacenterMismatchArgument other = (DatacenterMismatchArgument) obj;
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
            ((this.inputDatacenter==null && other.getInputDatacenter()==null) || 
             (this.inputDatacenter!=null &&
              this.inputDatacenter.equals(other.getInputDatacenter())));
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
        if (getInputDatacenter() != null) {
            _hashCode += getInputDatacenter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatacenterMismatchArgument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "DatacenterMismatchArgument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputDatacenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "inputDatacenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
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
