/**
 * ArrayOfHostServiceConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostServiceConfig  implements java.io.Serializable {
    private com.vmware.vim25.HostServiceConfig[] hostServiceConfig;

    public ArrayOfHostServiceConfig() {
    }

    public ArrayOfHostServiceConfig(
           com.vmware.vim25.HostServiceConfig[] hostServiceConfig) {
           this.hostServiceConfig = hostServiceConfig;
    }


    /**
     * Gets the hostServiceConfig value for this ArrayOfHostServiceConfig.
     * 
     * @return hostServiceConfig
     */
    public com.vmware.vim25.HostServiceConfig[] getHostServiceConfig() {
        return hostServiceConfig;
    }


    /**
     * Sets the hostServiceConfig value for this ArrayOfHostServiceConfig.
     * 
     * @param hostServiceConfig
     */
    public void setHostServiceConfig(com.vmware.vim25.HostServiceConfig[] hostServiceConfig) {
        this.hostServiceConfig = hostServiceConfig;
    }

    public com.vmware.vim25.HostServiceConfig getHostServiceConfig(int i) {
        return this.hostServiceConfig[i];
    }

    public void setHostServiceConfig(int i, com.vmware.vim25.HostServiceConfig _value) {
        this.hostServiceConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostServiceConfig)) return false;
        ArrayOfHostServiceConfig other = (ArrayOfHostServiceConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostServiceConfig==null && other.getHostServiceConfig()==null) || 
             (this.hostServiceConfig!=null &&
              java.util.Arrays.equals(this.hostServiceConfig, other.getHostServiceConfig())));
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
        if (getHostServiceConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostServiceConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostServiceConfig(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostServiceConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostServiceConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostServiceConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostServiceConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostServiceConfig"));
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
