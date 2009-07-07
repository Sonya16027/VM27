/**
 * ArrayOfHostVirtualNicConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostVirtualNicConfig  implements java.io.Serializable {
    private com.vmware.vim25.HostVirtualNicConfig[] hostVirtualNicConfig;

    public ArrayOfHostVirtualNicConfig() {
    }

    public ArrayOfHostVirtualNicConfig(
           com.vmware.vim25.HostVirtualNicConfig[] hostVirtualNicConfig) {
           this.hostVirtualNicConfig = hostVirtualNicConfig;
    }


    /**
     * Gets the hostVirtualNicConfig value for this ArrayOfHostVirtualNicConfig.
     * 
     * @return hostVirtualNicConfig
     */
    public com.vmware.vim25.HostVirtualNicConfig[] getHostVirtualNicConfig() {
        return hostVirtualNicConfig;
    }


    /**
     * Sets the hostVirtualNicConfig value for this ArrayOfHostVirtualNicConfig.
     * 
     * @param hostVirtualNicConfig
     */
    public void setHostVirtualNicConfig(com.vmware.vim25.HostVirtualNicConfig[] hostVirtualNicConfig) {
        this.hostVirtualNicConfig = hostVirtualNicConfig;
    }

    public com.vmware.vim25.HostVirtualNicConfig getHostVirtualNicConfig(int i) {
        return this.hostVirtualNicConfig[i];
    }

    public void setHostVirtualNicConfig(int i, com.vmware.vim25.HostVirtualNicConfig _value) {
        this.hostVirtualNicConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostVirtualNicConfig)) return false;
        ArrayOfHostVirtualNicConfig other = (ArrayOfHostVirtualNicConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostVirtualNicConfig==null && other.getHostVirtualNicConfig()==null) || 
             (this.hostVirtualNicConfig!=null &&
              java.util.Arrays.equals(this.hostVirtualNicConfig, other.getHostVirtualNicConfig())));
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
        if (getHostVirtualNicConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostVirtualNicConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostVirtualNicConfig(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostVirtualNicConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostVirtualNicConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostVirtualNicConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNicConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualNicConfig"));
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
