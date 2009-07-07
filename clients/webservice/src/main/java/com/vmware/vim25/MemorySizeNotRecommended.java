/**
 * MemorySizeNotRecommended.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class MemorySizeNotRecommended  extends com.vmware.vim25.VirtualHardwareCompatibilityIssue  implements java.io.Serializable {
    private int memorySizeMB;

    private int minMemorySizeMB;

    private int maxMemorySizeMB;

    public MemorySizeNotRecommended() {
    }

    public MemorySizeNotRecommended(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.LocalizedMethodFault faultCause,
           com.vmware.vim25.LocalizableMessage[] faultMessage,
           int memorySizeMB,
           int minMemorySizeMB,
           int maxMemorySizeMB) {
        super(
            dynamicType,
            dynamicProperty,
            faultCause,
            faultMessage);
        this.memorySizeMB = memorySizeMB;
        this.minMemorySizeMB = minMemorySizeMB;
        this.maxMemorySizeMB = maxMemorySizeMB;
    }


    /**
     * Gets the memorySizeMB value for this MemorySizeNotRecommended.
     * 
     * @return memorySizeMB
     */
    public int getMemorySizeMB() {
        return memorySizeMB;
    }


    /**
     * Sets the memorySizeMB value for this MemorySizeNotRecommended.
     * 
     * @param memorySizeMB
     */
    public void setMemorySizeMB(int memorySizeMB) {
        this.memorySizeMB = memorySizeMB;
    }


    /**
     * Gets the minMemorySizeMB value for this MemorySizeNotRecommended.
     * 
     * @return minMemorySizeMB
     */
    public int getMinMemorySizeMB() {
        return minMemorySizeMB;
    }


    /**
     * Sets the minMemorySizeMB value for this MemorySizeNotRecommended.
     * 
     * @param minMemorySizeMB
     */
    public void setMinMemorySizeMB(int minMemorySizeMB) {
        this.minMemorySizeMB = minMemorySizeMB;
    }


    /**
     * Gets the maxMemorySizeMB value for this MemorySizeNotRecommended.
     * 
     * @return maxMemorySizeMB
     */
    public int getMaxMemorySizeMB() {
        return maxMemorySizeMB;
    }


    /**
     * Sets the maxMemorySizeMB value for this MemorySizeNotRecommended.
     * 
     * @param maxMemorySizeMB
     */
    public void setMaxMemorySizeMB(int maxMemorySizeMB) {
        this.maxMemorySizeMB = maxMemorySizeMB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MemorySizeNotRecommended)) return false;
        MemorySizeNotRecommended other = (MemorySizeNotRecommended) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.memorySizeMB == other.getMemorySizeMB() &&
            this.minMemorySizeMB == other.getMinMemorySizeMB() &&
            this.maxMemorySizeMB == other.getMaxMemorySizeMB();
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
        _hashCode += getMemorySizeMB();
        _hashCode += getMinMemorySizeMB();
        _hashCode += getMaxMemorySizeMB();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MemorySizeNotRecommended.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MemorySizeNotRecommended"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memorySizeMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memorySizeMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minMemorySizeMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "minMemorySizeMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMemorySizeMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxMemorySizeMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
