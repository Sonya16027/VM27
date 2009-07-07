/**
 * PropertyFilterSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class PropertyFilterSpec  extends com.vmware.vim.sms.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.sms.PropertySpec[] propSet;

    private com.vmware.vim.sms.ObjectSpec[] objectSet;

    public PropertyFilterSpec() {
    }

    public PropertyFilterSpec(
           java.lang.String dynamicType,
           com.vmware.vim.sms.DynamicProperty[] dynamicProperty,
           com.vmware.vim.sms.PropertySpec[] propSet,
           com.vmware.vim.sms.ObjectSpec[] objectSet) {
        super(
            dynamicType,
            dynamicProperty);
        this.propSet = propSet;
        this.objectSet = objectSet;
    }


    /**
     * Gets the propSet value for this PropertyFilterSpec.
     * 
     * @return propSet
     */
    public com.vmware.vim.sms.PropertySpec[] getPropSet() {
        return propSet;
    }


    /**
     * Sets the propSet value for this PropertyFilterSpec.
     * 
     * @param propSet
     */
    public void setPropSet(com.vmware.vim.sms.PropertySpec[] propSet) {
        this.propSet = propSet;
    }

    public com.vmware.vim.sms.PropertySpec getPropSet(int i) {
        return this.propSet[i];
    }

    public void setPropSet(int i, com.vmware.vim.sms.PropertySpec _value) {
        this.propSet[i] = _value;
    }


    /**
     * Gets the objectSet value for this PropertyFilterSpec.
     * 
     * @return objectSet
     */
    public com.vmware.vim.sms.ObjectSpec[] getObjectSet() {
        return objectSet;
    }


    /**
     * Sets the objectSet value for this PropertyFilterSpec.
     * 
     * @param objectSet
     */
    public void setObjectSet(com.vmware.vim.sms.ObjectSpec[] objectSet) {
        this.objectSet = objectSet;
    }

    public com.vmware.vim.sms.ObjectSpec getObjectSet(int i) {
        return this.objectSet[i];
    }

    public void setObjectSet(int i, com.vmware.vim.sms.ObjectSpec _value) {
        this.objectSet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyFilterSpec)) return false;
        PropertyFilterSpec other = (PropertyFilterSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.propSet==null && other.getPropSet()==null) || 
             (this.propSet!=null &&
              java.util.Arrays.equals(this.propSet, other.getPropSet()))) &&
            ((this.objectSet==null && other.getObjectSet()==null) || 
             (this.objectSet!=null &&
              java.util.Arrays.equals(this.objectSet, other.getObjectSet())));
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
        if (getPropSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getObjectSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjectSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjectSet(), i);
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
        new org.apache.axis.description.TypeDesc(PropertyFilterSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1", "PropertyFilterSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "propSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "PropertySpec"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sm1", "objectSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sm1", "ObjectSpec"));
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
