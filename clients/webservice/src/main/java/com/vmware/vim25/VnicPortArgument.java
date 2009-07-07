/**
 * VnicPortArgument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VnicPortArgument  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String vnic;

    private com.vmware.vim25.DistributedVirtualSwitchPortConnection port;

    public VnicPortArgument() {
    }

    public VnicPortArgument(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String vnic,
           com.vmware.vim25.DistributedVirtualSwitchPortConnection port) {
        super(
            dynamicType,
            dynamicProperty);
        this.vnic = vnic;
        this.port = port;
    }


    /**
     * Gets the vnic value for this VnicPortArgument.
     * 
     * @return vnic
     */
    public java.lang.String getVnic() {
        return vnic;
    }


    /**
     * Sets the vnic value for this VnicPortArgument.
     * 
     * @param vnic
     */
    public void setVnic(java.lang.String vnic) {
        this.vnic = vnic;
    }


    /**
     * Gets the port value for this VnicPortArgument.
     * 
     * @return port
     */
    public com.vmware.vim25.DistributedVirtualSwitchPortConnection getPort() {
        return port;
    }


    /**
     * Sets the port value for this VnicPortArgument.
     * 
     * @param port
     */
    public void setPort(com.vmware.vim25.DistributedVirtualSwitchPortConnection port) {
        this.port = port;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VnicPortArgument)) return false;
        VnicPortArgument other = (VnicPortArgument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vnic==null && other.getVnic()==null) || 
             (this.vnic!=null &&
              this.vnic.equals(other.getVnic()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort())));
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
        if (getVnic() != null) {
            _hashCode += getVnic().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VnicPortArgument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VnicPortArgument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchPortConnection"));
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
