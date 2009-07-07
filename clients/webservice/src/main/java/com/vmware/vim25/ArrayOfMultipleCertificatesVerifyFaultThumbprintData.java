/**
 * ArrayOfMultipleCertificatesVerifyFaultThumbprintData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfMultipleCertificatesVerifyFaultThumbprintData  implements java.io.Serializable {
    private com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData[] multipleCertificatesVerifyFaultThumbprintData;

    public ArrayOfMultipleCertificatesVerifyFaultThumbprintData() {
    }

    public ArrayOfMultipleCertificatesVerifyFaultThumbprintData(
           com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData[] multipleCertificatesVerifyFaultThumbprintData) {
           this.multipleCertificatesVerifyFaultThumbprintData = multipleCertificatesVerifyFaultThumbprintData;
    }


    /**
     * Gets the multipleCertificatesVerifyFaultThumbprintData value for this ArrayOfMultipleCertificatesVerifyFaultThumbprintData.
     * 
     * @return multipleCertificatesVerifyFaultThumbprintData
     */
    public com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData[] getMultipleCertificatesVerifyFaultThumbprintData() {
        return multipleCertificatesVerifyFaultThumbprintData;
    }


    /**
     * Sets the multipleCertificatesVerifyFaultThumbprintData value for this ArrayOfMultipleCertificatesVerifyFaultThumbprintData.
     * 
     * @param multipleCertificatesVerifyFaultThumbprintData
     */
    public void setMultipleCertificatesVerifyFaultThumbprintData(com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData[] multipleCertificatesVerifyFaultThumbprintData) {
        this.multipleCertificatesVerifyFaultThumbprintData = multipleCertificatesVerifyFaultThumbprintData;
    }

    public com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData getMultipleCertificatesVerifyFaultThumbprintData(int i) {
        return this.multipleCertificatesVerifyFaultThumbprintData[i];
    }

    public void setMultipleCertificatesVerifyFaultThumbprintData(int i, com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData _value) {
        this.multipleCertificatesVerifyFaultThumbprintData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfMultipleCertificatesVerifyFaultThumbprintData)) return false;
        ArrayOfMultipleCertificatesVerifyFaultThumbprintData other = (ArrayOfMultipleCertificatesVerifyFaultThumbprintData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.multipleCertificatesVerifyFaultThumbprintData==null && other.getMultipleCertificatesVerifyFaultThumbprintData()==null) || 
             (this.multipleCertificatesVerifyFaultThumbprintData!=null &&
              java.util.Arrays.equals(this.multipleCertificatesVerifyFaultThumbprintData, other.getMultipleCertificatesVerifyFaultThumbprintData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMultipleCertificatesVerifyFaultThumbprintData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMultipleCertificatesVerifyFaultThumbprintData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMultipleCertificatesVerifyFaultThumbprintData(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfMultipleCertificatesVerifyFaultThumbprintData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfMultipleCertificatesVerifyFaultThumbprintData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multipleCertificatesVerifyFaultThumbprintData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "MultipleCertificatesVerifyFaultThumbprintData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MultipleCertificatesVerifyFaultThumbprintData"));
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
