/**
 * ReadOnlyDisksWithLegacyDestination.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ReadOnlyDisksWithLegacyDestination  extends com.vmware.vim.MigrationFault  implements java.io.Serializable {
    private int roDiskCount;

    private boolean timeoutDanger;

    public ReadOnlyDisksWithLegacyDestination() {
    }

    public ReadOnlyDisksWithLegacyDestination(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           int roDiskCount,
           boolean timeoutDanger) {
        super(
            dynamicType,
            dynamicProperty);
        this.roDiskCount = roDiskCount;
        this.timeoutDanger = timeoutDanger;
    }


    /**
     * Gets the roDiskCount value for this ReadOnlyDisksWithLegacyDestination.
     * 
     * @return roDiskCount
     */
    public int getRoDiskCount() {
        return roDiskCount;
    }


    /**
     * Sets the roDiskCount value for this ReadOnlyDisksWithLegacyDestination.
     * 
     * @param roDiskCount
     */
    public void setRoDiskCount(int roDiskCount) {
        this.roDiskCount = roDiskCount;
    }


    /**
     * Gets the timeoutDanger value for this ReadOnlyDisksWithLegacyDestination.
     * 
     * @return timeoutDanger
     */
    public boolean isTimeoutDanger() {
        return timeoutDanger;
    }


    /**
     * Sets the timeoutDanger value for this ReadOnlyDisksWithLegacyDestination.
     * 
     * @param timeoutDanger
     */
    public void setTimeoutDanger(boolean timeoutDanger) {
        this.timeoutDanger = timeoutDanger;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReadOnlyDisksWithLegacyDestination)) return false;
        ReadOnlyDisksWithLegacyDestination other = (ReadOnlyDisksWithLegacyDestination) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.roDiskCount == other.getRoDiskCount() &&
            this.timeoutDanger == other.isTimeoutDanger();
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
        _hashCode += getRoDiskCount();
        _hashCode += (isTimeoutDanger() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReadOnlyDisksWithLegacyDestination.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ReadOnlyDisksWithLegacyDestination"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roDiskCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "roDiskCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeoutDanger");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "timeoutDanger"));
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
