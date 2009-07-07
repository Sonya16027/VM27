/**
 * ObjectUpdate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class ObjectUpdate  extends com.vmware.vim.sms.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.sms.ObjectUpdateKind kind;

    private com.vmware.vim.sms.ManagedObjectReference obj;

    private com.vmware.vim.sms.PropertyChange[] changeSet;

    private com.vmware.vim.sms.MissingProperty[] missingSet;

    public ObjectUpdate() {
    }

    public ObjectUpdate(
           java.lang.String dynamicType,
           com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
           com.vmware.vim.sms.ObjectUpdateKind kind,
           com.vmware.vim.sms.ManagedObjectReference obj,
           com.vmware.vim.sms.PropertyChange[] changeSet,
           com.vmware.vim.sms.MissingProperty[] missingSet) {
        super(
            dynamicType,
            dynamicProperty);
        this.kind = kind;
        this.obj = obj;
        this.changeSet = changeSet;
        this.missingSet = missingSet;
    }


    /**
     * Gets the kind value for this ObjectUpdate.
     * 
     * @return kind
     */
    public com.vmware.vim.sms.ObjectUpdateKind getKind() {
        return kind;
    }


    /**
     * Sets the kind value for this ObjectUpdate.
     * 
     * @param kind
     */
    public void setKind(com.vmware.vim.sms.ObjectUpdateKind kind) {
        this.kind = kind;
    }


    /**
     * Gets the obj value for this ObjectUpdate.
     * 
     * @return obj
     */
    public com.vmware.vim.sms.ManagedObjectReference getObj() {
        return obj;
    }


    /**
     * Sets the obj value for this ObjectUpdate.
     * 
     * @param obj
     */
    public void setObj(com.vmware.vim.sms.ManagedObjectReference obj) {
        this.obj = obj;
    }


    /**
     * Gets the changeSet value for this ObjectUpdate.
     * 
     * @return changeSet
     */
    public com.vmware.vim.sms.PropertyChange[] getChangeSet() {
        return changeSet;
    }


    /**
     * Sets the changeSet value for this ObjectUpdate.
     * 
     * @param changeSet
     */
    public void setChangeSet(com.vmware.vim.sms.PropertyChange[] changeSet) {
        this.changeSet = changeSet;
    }

    public com.vmware.vim.sms.PropertyChange getChangeSet(int i) {
        return this.changeSet[i];
    }

    public void setChangeSet(int i, com.vmware.vim.sms.PropertyChange _value) {
        this.changeSet[i] = _value;
    }


    /**
     * Gets the missingSet value for this ObjectUpdate.
     * 
     * @return missingSet
     */
    public com.vmware.vim.sms.MissingProperty[] getMissingSet() {
        return missingSet;
    }


    /**
     * Sets the missingSet value for this ObjectUpdate.
     * 
     * @param missingSet
     */
    public void setMissingSet(com.vmware.vim.sms.MissingProperty[] missingSet) {
        this.missingSet = missingSet;
    }

    public com.vmware.vim.sms.MissingProperty getMissingSet(int i) {
        return this.missingSet[i];
    }

    public void setMissingSet(int i, com.vmware.vim.sms.MissingProperty _value) {
        this.missingSet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectUpdate)) return false;
        ObjectUpdate other = (ObjectUpdate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.kind==null && other.getKind()==null) || 
             (this.kind!=null &&
              this.kind.equals(other.getKind()))) &&
            ((this.obj==null && other.getObj()==null) || 
             (this.obj!=null &&
              this.obj.equals(other.getObj()))) &&
            ((this.changeSet==null && other.getChangeSet()==null) || 
             (this.changeSet!=null &&
              java.util.Arrays.equals(this.changeSet, other.getChangeSet()))) &&
            ((this.missingSet==null && other.getMissingSet()==null) || 
             (this.missingSet!=null &&
              java.util.Arrays.equals(this.missingSet, other.getMissingSet())));
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
        if (getKind() != null) {
            _hashCode += getKind().hashCode();
        }
        if (getObj() != null) {
            _hashCode += getObj().hashCode();
        }
        if (getChangeSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangeSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangeSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMissingSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMissingSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMissingSet(), i);
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
        new org.apache.axis.description.TypeDesc(ObjectUpdate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1", "ObjectUpdate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kind");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "kind"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "ObjectUpdateKind"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obj");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "obj"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "changeSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "PropertyChange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missingSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "missingSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "MissingProperty"));
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
