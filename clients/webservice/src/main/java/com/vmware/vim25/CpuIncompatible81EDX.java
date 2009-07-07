/**
 * CpuIncompatible81EDX.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class CpuIncompatible81EDX  extends com.vmware.vim25.CpuIncompatible  implements java.io.Serializable {
    private boolean nx;

    private boolean ffxsr;

    private boolean rdtscp;

    private boolean lm;

    private boolean other;

    private boolean otherOnly;

    public CpuIncompatible81EDX() {
    }

    public CpuIncompatible81EDX(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.LocalizedMethodFault faultCause,
           com.vmware.vim25.LocalizableMessage[] faultMessage,
           int level,
           java.lang.String registerName,
           java.lang.String registerBits,
           java.lang.String desiredBits,
           com.vmware.vim25.ManagedObjectReference host,
           boolean nx,
           boolean ffxsr,
           boolean rdtscp,
           boolean lm,
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
        this.nx = nx;
        this.ffxsr = ffxsr;
        this.rdtscp = rdtscp;
        this.lm = lm;
        this.other = other;
        this.otherOnly = otherOnly;
    }


    /**
     * Gets the nx value for this CpuIncompatible81EDX.
     * 
     * @return nx
     */
    public boolean isNx() {
        return nx;
    }


    /**
     * Sets the nx value for this CpuIncompatible81EDX.
     * 
     * @param nx
     */
    public void setNx(boolean nx) {
        this.nx = nx;
    }


    /**
     * Gets the ffxsr value for this CpuIncompatible81EDX.
     * 
     * @return ffxsr
     */
    public boolean isFfxsr() {
        return ffxsr;
    }


    /**
     * Sets the ffxsr value for this CpuIncompatible81EDX.
     * 
     * @param ffxsr
     */
    public void setFfxsr(boolean ffxsr) {
        this.ffxsr = ffxsr;
    }


    /**
     * Gets the rdtscp value for this CpuIncompatible81EDX.
     * 
     * @return rdtscp
     */
    public boolean isRdtscp() {
        return rdtscp;
    }


    /**
     * Sets the rdtscp value for this CpuIncompatible81EDX.
     * 
     * @param rdtscp
     */
    public void setRdtscp(boolean rdtscp) {
        this.rdtscp = rdtscp;
    }


    /**
     * Gets the lm value for this CpuIncompatible81EDX.
     * 
     * @return lm
     */
    public boolean isLm() {
        return lm;
    }


    /**
     * Sets the lm value for this CpuIncompatible81EDX.
     * 
     * @param lm
     */
    public void setLm(boolean lm) {
        this.lm = lm;
    }


    /**
     * Gets the other value for this CpuIncompatible81EDX.
     * 
     * @return other
     */
    public boolean isOther() {
        return other;
    }


    /**
     * Sets the other value for this CpuIncompatible81EDX.
     * 
     * @param other
     */
    public void setOther(boolean other) {
        this.other = other;
    }


    /**
     * Gets the otherOnly value for this CpuIncompatible81EDX.
     * 
     * @return otherOnly
     */
    public boolean isOtherOnly() {
        return otherOnly;
    }


    /**
     * Sets the otherOnly value for this CpuIncompatible81EDX.
     * 
     * @param otherOnly
     */
    public void setOtherOnly(boolean otherOnly) {
        this.otherOnly = otherOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CpuIncompatible81EDX)) return false;
        CpuIncompatible81EDX other = (CpuIncompatible81EDX) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.nx == other.isNx() &&
            this.ffxsr == other.isFfxsr() &&
            this.rdtscp == other.isRdtscp() &&
            this.lm == other.isLm() &&
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
        _hashCode += (isNx() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFfxsr() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRdtscp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLm() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOther() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOtherOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CpuIncompatible81EDX.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "CpuIncompatible81EDX"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ffxsr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ffxsr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rdtscp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rdtscp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lm"));
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
