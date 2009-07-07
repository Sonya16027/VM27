/**
 * FaultToleranceCpuIncompatible.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class FaultToleranceCpuIncompatible  extends com.vmware.vim25.CpuIncompatible  implements java.io.Serializable {
    private boolean model;

    private boolean family;

    private boolean stepping;

    public FaultToleranceCpuIncompatible() {
    }

    public FaultToleranceCpuIncompatible(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.LocalizedMethodFault faultCause,
           com.vmware.vim25.LocalizableMessage[] faultMessage,
           int level,
           java.lang.String registerName,
           java.lang.String registerBits,
           java.lang.String desiredBits,
           com.vmware.vim25.ManagedObjectReference host,
           boolean model,
           boolean family,
           boolean stepping) {
        super(
            dynamicType,
            dynamicProperty,
            faultCause,
            faultMessage,
            level,
            registerName,
            registerBits,
            desiredBits,
            host);
        this.model = model;
        this.family = family;
        this.stepping = stepping;
    }


    /**
     * Gets the model value for this FaultToleranceCpuIncompatible.
     * 
     * @return model
     */
    public boolean isModel() {
        return model;
    }


    /**
     * Sets the model value for this FaultToleranceCpuIncompatible.
     * 
     * @param model
     */
    public void setModel(boolean model) {
        this.model = model;
    }


    /**
     * Gets the family value for this FaultToleranceCpuIncompatible.
     * 
     * @return family
     */
    public boolean isFamily() {
        return family;
    }


    /**
     * Sets the family value for this FaultToleranceCpuIncompatible.
     * 
     * @param family
     */
    public void setFamily(boolean family) {
        this.family = family;
    }


    /**
     * Gets the stepping value for this FaultToleranceCpuIncompatible.
     * 
     * @return stepping
     */
    public boolean isStepping() {
        return stepping;
    }


    /**
     * Sets the stepping value for this FaultToleranceCpuIncompatible.
     * 
     * @param stepping
     */
    public void setStepping(boolean stepping) {
        this.stepping = stepping;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FaultToleranceCpuIncompatible)) return false;
        FaultToleranceCpuIncompatible other = (FaultToleranceCpuIncompatible) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.model == other.isModel() &&
            this.family == other.isFamily() &&
            this.stepping == other.isStepping();
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
        _hashCode += (isModel() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFamily() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStepping() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FaultToleranceCpuIncompatible.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FaultToleranceCpuIncompatible"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("family");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "family"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stepping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "stepping"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
