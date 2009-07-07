/**
 * VirtualSerialPortPipeBackingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualSerialPortPipeBackingInfo  extends com.vmware.vim.VirtualDevicePipeBackingInfo  implements java.io.Serializable {
    private java.lang.String endpoint;

    private java.lang.Boolean noRxLoss;

    public VirtualSerialPortPipeBackingInfo() {
    }

    public VirtualSerialPortPipeBackingInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String pipeName,
           java.lang.String endpoint,
           java.lang.Boolean noRxLoss) {
        super(
            dynamicType,
            dynamicProperty,
            pipeName);
        this.endpoint = endpoint;
        this.noRxLoss = noRxLoss;
    }


    /**
     * Gets the endpoint value for this VirtualSerialPortPipeBackingInfo.
     * 
     * @return endpoint
     */
    public java.lang.String getEndpoint() {
        return endpoint;
    }


    /**
     * Sets the endpoint value for this VirtualSerialPortPipeBackingInfo.
     * 
     * @param endpoint
     */
    public void setEndpoint(java.lang.String endpoint) {
        this.endpoint = endpoint;
    }


    /**
     * Gets the noRxLoss value for this VirtualSerialPortPipeBackingInfo.
     * 
     * @return noRxLoss
     */
    public java.lang.Boolean getNoRxLoss() {
        return noRxLoss;
    }


    /**
     * Sets the noRxLoss value for this VirtualSerialPortPipeBackingInfo.
     * 
     * @param noRxLoss
     */
    public void setNoRxLoss(java.lang.Boolean noRxLoss) {
        this.noRxLoss = noRxLoss;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualSerialPortPipeBackingInfo)) return false;
        VirtualSerialPortPipeBackingInfo other = (VirtualSerialPortPipeBackingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.endpoint==null && other.getEndpoint()==null) || 
             (this.endpoint!=null &&
              this.endpoint.equals(other.getEndpoint()))) &&
            ((this.noRxLoss==null && other.getNoRxLoss()==null) || 
             (this.noRxLoss!=null &&
              this.noRxLoss.equals(other.getNoRxLoss())));
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
        if (getEndpoint() != null) {
            _hashCode += getEndpoint().hashCode();
        }
        if (getNoRxLoss() != null) {
            _hashCode += getNoRxLoss().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualSerialPortPipeBackingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualSerialPortPipeBackingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "endpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noRxLoss");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "noRxLoss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
