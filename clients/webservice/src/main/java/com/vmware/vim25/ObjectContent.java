/**
 * ObjectContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ObjectContent  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference obj;

    private com.vmware.vim25.DynamicProperty[] propSet;

    private com.vmware.vim25.MissingProperty[] missingSet;

    public ObjectContent() {
    }

    public ObjectContent(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ManagedObjectReference obj,
           com.vmware.vim25.DynamicProperty[] propSet,
           com.vmware.vim25.MissingProperty[] missingSet) {
        super(
            dynamicType,
            dynamicProperty);
        this.obj = obj;
        this.propSet = propSet;
        this.missingSet = missingSet;
    }


    /**
     * Gets the obj value for this ObjectContent.
     * 
     * @return obj
     */
    public com.vmware.vim25.ManagedObjectReference getObj() {
        return obj;
    }


    /**
     * Sets the obj value for this ObjectContent.
     * 
     * @param obj
     */
    public void setObj(com.vmware.vim25.ManagedObjectReference obj) {
        this.obj = obj;
    }


    /**
     * Gets the propSet value for this ObjectContent.
     * 
     * @return propSet
     */
    public com.vmware.vim25.DynamicProperty[] getPropSet() {
        return propSet;
    }


    /**
     * Sets the propSet value for this ObjectContent.
     * 
     * @param propSet
     */
    public void setPropSet(com.vmware.vim25.DynamicProperty[] propSet) {
        this.propSet = propSet;
    }

    public com.vmware.vim25.DynamicProperty getPropSet(int i) {
        return this.propSet[i];
    }

    public void setPropSet(int i, com.vmware.vim25.DynamicProperty _value) {
        this.propSet[i] = _value;
    }


    /**
     * Gets the missingSet value for this ObjectContent.
     * 
     * @return missingSet
     */
    public com.vmware.vim25.MissingProperty[] getMissingSet() {
        return missingSet;
    }


    /**
     * Sets the missingSet value for this ObjectContent.
     * 
     * @param missingSet
     */
    public void setMissingSet(com.vmware.vim25.MissingProperty[] missingSet) {
        this.missingSet = missingSet;
    }

    public com.vmware.vim25.MissingProperty getMissingSet(int i) {
        return this.missingSet[i];
    }

    public void setMissingSet(int i, com.vmware.vim25.MissingProperty _value) {
        this.missingSet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectContent)) return false;
        ObjectContent other = (ObjectContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.obj==null && other.getObj()==null) || 
             (this.obj!=null &&
              this.obj.equals(other.getObj()))) &&
            ((this.propSet==null && other.getPropSet()==null) || 
             (this.propSet!=null &&
              java.util.Arrays.equals(this.propSet, other.getPropSet()))) &&
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
        if (getObj() != null) {
            _hashCode += getObj().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(ObjectContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ObjectContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obj");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "obj"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "propSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DynamicProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missingSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "missingSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MissingProperty"));
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
