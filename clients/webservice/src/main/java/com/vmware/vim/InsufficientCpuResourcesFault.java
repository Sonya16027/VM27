/**
 * InsufficientCpuResourcesFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class InsufficientCpuResourcesFault  extends com.vmware.vim.InsufficientResourcesFault  implements java.io.Serializable {
    private long unreserved;

    private long requested;

    public InsufficientCpuResourcesFault() {
    }

    public InsufficientCpuResourcesFault(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           long unreserved,
           long requested) {
        super(
            dynamicType,
            dynamicProperty);
        this.unreserved = unreserved;
        this.requested = requested;
    }


    /**
     * Gets the unreserved value for this InsufficientCpuResourcesFault.
     * 
     * @return unreserved
     */
    public long getUnreserved() {
        return unreserved;
    }


    /**
     * Sets the unreserved value for this InsufficientCpuResourcesFault.
     * 
     * @param unreserved
     */
    public void setUnreserved(long unreserved) {
        this.unreserved = unreserved;
    }


    /**
     * Gets the requested value for this InsufficientCpuResourcesFault.
     * 
     * @return requested
     */
    public long getRequested() {
        return requested;
    }


    /**
     * Sets the requested value for this InsufficientCpuResourcesFault.
     * 
     * @param requested
     */
    public void setRequested(long requested) {
        this.requested = requested;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsufficientCpuResourcesFault)) return false;
        InsufficientCpuResourcesFault other = (InsufficientCpuResourcesFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.unreserved == other.getUnreserved() &&
            this.requested == other.getRequested();
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
        _hashCode += new Long(getUnreserved()).hashCode();
        _hashCode += new Long(getRequested()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsufficientCpuResourcesFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "InsufficientCpuResourcesFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unreserved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "unreserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requested");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "requested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
