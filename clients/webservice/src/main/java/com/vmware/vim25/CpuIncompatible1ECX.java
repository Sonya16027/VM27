/**
 * CpuIncompatible1ECX.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CpuIncompatible1ECX  extends com.vmware.vim25.CpuIncompatible  implements java.io.Serializable {
    private boolean sse3;

    private boolean ssse3;

    private boolean sse41;

    private boolean sse42;

    private boolean other;

    private boolean otherOnly;

    public CpuIncompatible1ECX() {
    }

    public CpuIncompatible1ECX(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.LocalizedMethodFault faultCause,
           com.vmware.vim25.LocalizableMessage[] faultMessage,
           int level,
           java.lang.String registerName,
           java.lang.String registerBits,
           java.lang.String desiredBits,
           com.vmware.vim25.ManagedObjectReference host,
           boolean sse3,
           boolean ssse3,
           boolean sse41,
           boolean sse42,
           boolean other,
           boolean otherOnly) {
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
        this.sse3 = sse3;
        this.ssse3 = ssse3;
        this.sse41 = sse41;
        this.sse42 = sse42;
        this.other = other;
        this.otherOnly = otherOnly;
    }


    /**
     * Gets the sse3 value for this CpuIncompatible1ECX.
     * 
     * @return sse3
     */
    public boolean isSse3() {
        return sse3;
    }


    /**
     * Sets the sse3 value for this CpuIncompatible1ECX.
     * 
     * @param sse3
     */
    public void setSse3(boolean sse3) {
        this.sse3 = sse3;
    }


    /**
     * Gets the ssse3 value for this CpuIncompatible1ECX.
     * 
     * @return ssse3
     */
    public boolean isSsse3() {
        return ssse3;
    }


    /**
     * Sets the ssse3 value for this CpuIncompatible1ECX.
     * 
     * @param ssse3
     */
    public void setSsse3(boolean ssse3) {
        this.ssse3 = ssse3;
    }


    /**
     * Gets the sse41 value for this CpuIncompatible1ECX.
     * 
     * @return sse41
     */
    public boolean isSse41() {
        return sse41;
    }


    /**
     * Sets the sse41 value for this CpuIncompatible1ECX.
     * 
     * @param sse41
     */
    public void setSse41(boolean sse41) {
        this.sse41 = sse41;
    }


    /**
     * Gets the sse42 value for this CpuIncompatible1ECX.
     * 
     * @return sse42
     */
    public boolean isSse42() {
        return sse42;
    }


    /**
     * Sets the sse42 value for this CpuIncompatible1ECX.
     * 
     * @param sse42
     */
    public void setSse42(boolean sse42) {
        this.sse42 = sse42;
    }


    /**
     * Gets the other value for this CpuIncompatible1ECX.
     * 
     * @return other
     */
    public boolean isOther() {
        return other;
    }


    /**
     * Sets the other value for this CpuIncompatible1ECX.
     * 
     * @param other
     */
    public void setOther(boolean other) {
        this.other = other;
    }


    /**
     * Gets the otherOnly value for this CpuIncompatible1ECX.
     * 
     * @return otherOnly
     */
    public boolean isOtherOnly() {
        return otherOnly;
    }


    /**
     * Sets the otherOnly value for this CpuIncompatible1ECX.
     * 
     * @param otherOnly
     */
    public void setOtherOnly(boolean otherOnly) {
        this.otherOnly = otherOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpuIncompatible1ECX)) return false;
        CpuIncompatible1ECX other = (CpuIncompatible1ECX) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.sse3 == other.isSse3() &&
            this.ssse3 == other.isSsse3() &&
            this.sse41 == other.isSse41() &&
            this.sse42 == other.isSse42() &&
            this.other == other.isOther() &&
            this.otherOnly == other.isOtherOnly();
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
        _hashCode += (isSse3() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSsse3() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSse41() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSse42() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOther() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOtherOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpuIncompatible1ECX.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CpuIncompatible1ECX"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sse3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sse3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssse3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ssse3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sse41");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sse41"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sse42");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sse42"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "other"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "otherOnly"));
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
