/**
 * ArrayOfHostNasVolumeConfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostNasVolumeConfig  implements java.io.Serializable {
    private com.vmware.vim25.HostNasVolumeConfig[] hostNasVolumeConfig;

    public ArrayOfHostNasVolumeConfig() {
    }

    public ArrayOfHostNasVolumeConfig(
           com.vmware.vim25.HostNasVolumeConfig[] hostNasVolumeConfig) {
           this.hostNasVolumeConfig = hostNasVolumeConfig;
    }


    /**
     * Gets the hostNasVolumeConfig value for this ArrayOfHostNasVolumeConfig.
     * 
     * @return hostNasVolumeConfig
     */
    public com.vmware.vim25.HostNasVolumeConfig[] getHostNasVolumeConfig() {
        return hostNasVolumeConfig;
    }


    /**
     * Sets the hostNasVolumeConfig value for this ArrayOfHostNasVolumeConfig.
     * 
     * @param hostNasVolumeConfig
     */
    public void setHostNasVolumeConfig(com.vmware.vim25.HostNasVolumeConfig[] hostNasVolumeConfig) {
        this.hostNasVolumeConfig = hostNasVolumeConfig;
    }

    public com.vmware.vim25.HostNasVolumeConfig getHostNasVolumeConfig(int i) {
        return this.hostNasVolumeConfig[i];
    }

    public void setHostNasVolumeConfig(int i, com.vmware.vim25.HostNasVolumeConfig _value) {
        this.hostNasVolumeConfig[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostNasVolumeConfig)) return false;
        ArrayOfHostNasVolumeConfig other = (ArrayOfHostNasVolumeConfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostNasVolumeConfig==null && other.getHostNasVolumeConfig()==null) || 
             (this.hostNasVolumeConfig!=null &&
              java.util.Arrays.equals(this.hostNasVolumeConfig, other.getHostNasVolumeConfig())));
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
        if (getHostNasVolumeConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostNasVolumeConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostNasVolumeConfig(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostNasVolumeConfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostNasVolumeConfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostNasVolumeConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostNasVolumeConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostNasVolumeConfig"));
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
