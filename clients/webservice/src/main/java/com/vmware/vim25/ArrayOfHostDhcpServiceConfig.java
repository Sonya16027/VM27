/**
 * ArrayOfHostDhcpServiceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostDhcpServiceConfig  implements java.io.Serializable {
    private com.vmware.vim25.HostDhcpServiceConfig[] hostDhcpServiceConfig;

    public ArrayOfHostDhcpServiceConfig() {
    }

    public ArrayOfHostDhcpServiceConfig(
           com.vmware.vim25.HostDhcpServiceConfig[] hostDhcpServiceConfig) {
           this.hostDhcpServiceConfig = hostDhcpServiceConfig;
    }


    /**
     * Gets the hostDhcpServiceConfig value for this ArrayOfHostDhcpServiceConfig.
     * 
     * @return hostDhcpServiceConfig
     */
    public com.vmware.vim25.HostDhcpServiceConfig[] getHostDhcpServiceConfig() {
        return hostDhcpServiceConfig;
    }


    /**
     * Sets the hostDhcpServiceConfig value for this ArrayOfHostDhcpServiceConfig.
     * 
     * @param hostDhcpServiceConfig
     */
    public void setHostDhcpServiceConfig(com.vmware.vim25.HostDhcpServiceConfig[] hostDhcpServiceConfig) {
        this.hostDhcpServiceConfig = hostDhcpServiceConfig;
    }

    public com.vmware.vim25.HostDhcpServiceConfig getHostDhcpServiceConfig(int i) {
        return this.hostDhcpServiceConfig[i];
    }

    public void setHostDhcpServiceConfig(int i, com.vmware.vim25.HostDhcpServiceConfig _value) {
        this.hostDhcpServiceConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostDhcpServiceConfig)) return false;
        ArrayOfHostDhcpServiceConfig other = (ArrayOfHostDhcpServiceConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostDhcpServiceConfig==null && other.getHostDhcpServiceConfig()==null) || 
             (this.hostDhcpServiceConfig!=null &&
              java.util.Arrays.equals(this.hostDhcpServiceConfig, other.getHostDhcpServiceConfig())));
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
        if (getHostDhcpServiceConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostDhcpServiceConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostDhcpServiceConfig(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostDhcpServiceConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostDhcpServiceConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostDhcpServiceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostDhcpServiceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostDhcpServiceConfig"));
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
