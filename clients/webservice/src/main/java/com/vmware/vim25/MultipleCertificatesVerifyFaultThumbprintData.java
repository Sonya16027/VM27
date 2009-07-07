/**
 * MultipleCertificatesVerifyFaultThumbprintData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class MultipleCertificatesVerifyFaultThumbprintData  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private int port;

    private java.lang.String thumbprint;

    public MultipleCertificatesVerifyFaultThumbprintData() {
    }

    public MultipleCertificatesVerifyFaultThumbprintData(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int port,
           java.lang.String thumbprint) {
        super(
            dynamicType,
            dynamicProperty);
        this.port = port;
        this.thumbprint = thumbprint;
    }


    /**
     * Gets the port value for this MultipleCertificatesVerifyFaultThumbprintData.
     * 
     * @return port
     */
    public int getPort() {
        return port;
    }


    /**
     * Sets the port value for this MultipleCertificatesVerifyFaultThumbprintData.
     * 
     * @param port
     */
    public void setPort(int port) {
        this.port = port;
    }


    /**
     * Gets the thumbprint value for this MultipleCertificatesVerifyFaultThumbprintData.
     * 
     * @return thumbprint
     */
    public java.lang.String getThumbprint() {
        return thumbprint;
    }


    /**
     * Sets the thumbprint value for this MultipleCertificatesVerifyFaultThumbprintData.
     * 
     * @param thumbprint
     */
    public void setThumbprint(java.lang.String thumbprint) {
        this.thumbprint = thumbprint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MultipleCertificatesVerifyFaultThumbprintData)) return false;
        MultipleCertificatesVerifyFaultThumbprintData other = (MultipleCertificatesVerifyFaultThumbprintData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.port == other.getPort() &&
            ((this.thumbprint==null && other.getThumbprint()==null) || 
             (this.thumbprint!=null &&
              this.thumbprint.equals(other.getThumbprint())));
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
        _hashCode += getPort();
        if (getThumbprint() != null) {
            _hashCode += getThumbprint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MultipleCertificatesVerifyFaultThumbprintData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MultipleCertificatesVerifyFaultThumbprintData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thumbprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "thumbprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

}
