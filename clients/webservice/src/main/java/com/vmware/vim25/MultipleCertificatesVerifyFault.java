/**
 * MultipleCertificatesVerifyFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class MultipleCertificatesVerifyFault  extends com.vmware.vim25.HostConnectFault  implements java.io.Serializable {
    private com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData[] thumbprintData;

    public MultipleCertificatesVerifyFault() {
    }

    public MultipleCertificatesVerifyFault(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.LocalizedMethodFault faultCause,
           com.vmware.vim25.LocalizableMessage[] faultMessage,
           com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData[] thumbprintData) {
        super(
            dynamicType,
            dynamicProperty,
            faultCause,
            faultMessage);
        this.thumbprintData = thumbprintData;
    }


    /**
     * Gets the thumbprintData value for this MultipleCertificatesVerifyFault.
     * 
     * @return thumbprintData
     */
    public com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData[] getThumbprintData() {
        return thumbprintData;
    }


    /**
     * Sets the thumbprintData value for this MultipleCertificatesVerifyFault.
     * 
     * @param thumbprintData
     */
    public void setThumbprintData(com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData[] thumbprintData) {
        this.thumbprintData = thumbprintData;
    }

    public com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData getThumbprintData(int i) {
        return this.thumbprintData[i];
    }

    public void setThumbprintData(int i, com.vmware.vim25.MultipleCertificatesVerifyFaultThumbprintData _value) {
        this.thumbprintData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MultipleCertificatesVerifyFault)) return false;
        MultipleCertificatesVerifyFault other = (MultipleCertificatesVerifyFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.thumbprintData==null && other.getThumbprintData()==null) || 
             (this.thumbprintData!=null &&
              java.util.Arrays.equals(this.thumbprintData, other.getThumbprintData())));
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
        if (getThumbprintData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThumbprintData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThumbprintData(), i);
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
        new org.apache.axis.description.TypeDesc(MultipleCertificatesVerifyFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MultipleCertificatesVerifyFault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thumbprintData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "thumbprintData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "MultipleCertificatesVerifyFaultThumbprintData"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
