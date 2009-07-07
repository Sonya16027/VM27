/**
 * NotEnoughCpus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class NotEnoughCpus  extends com.vmware.vim.VirtualHardwareCompatibilityIssue  implements java.io.Serializable {
    private int numCpuDest;

    private int numCpuVm;

    public NotEnoughCpus() {
    }

    public NotEnoughCpus(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           int numCpuDest,
           int numCpuVm) {
        super(
            dynamicType,
            dynamicProperty);
        this.numCpuDest = numCpuDest;
        this.numCpuVm = numCpuVm;
    }


    /**
     * Gets the numCpuDest value for this NotEnoughCpus.
     * 
     * @return numCpuDest
     */
    public int getNumCpuDest() {
        return numCpuDest;
    }


    /**
     * Sets the numCpuDest value for this NotEnoughCpus.
     * 
     * @param numCpuDest
     */
    public void setNumCpuDest(int numCpuDest) {
        this.numCpuDest = numCpuDest;
    }


    /**
     * Gets the numCpuVm value for this NotEnoughCpus.
     * 
     * @return numCpuVm
     */
    public int getNumCpuVm() {
        return numCpuVm;
    }


    /**
     * Sets the numCpuVm value for this NotEnoughCpus.
     * 
     * @param numCpuVm
     */
    public void setNumCpuVm(int numCpuVm) {
        this.numCpuVm = numCpuVm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotEnoughCpus)) return false;
        NotEnoughCpus other = (NotEnoughCpus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.numCpuDest == other.getNumCpuDest() &&
            this.numCpuVm == other.getNumCpuVm();
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
        _hashCode += getNumCpuDest();
        _hashCode += getNumCpuVm();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotEnoughCpus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "NotEnoughCpus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCpuDest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "numCpuDest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCpuVm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "numCpuVm"));
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
