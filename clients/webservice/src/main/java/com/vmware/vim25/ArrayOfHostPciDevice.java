/**
 * ArrayOfHostPciDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostPciDevice  implements java.io.Serializable {
    private com.vmware.vim25.HostPciDevice[] hostPciDevice;

    public ArrayOfHostPciDevice() {
    }

    public ArrayOfHostPciDevice(
           com.vmware.vim25.HostPciDevice[] hostPciDevice) {
           this.hostPciDevice = hostPciDevice;
    }


    /**
     * Gets the hostPciDevice value for this ArrayOfHostPciDevice.
     * 
     * @return hostPciDevice
     */
    public com.vmware.vim25.HostPciDevice[] getHostPciDevice() {
        return hostPciDevice;
    }


    /**
     * Sets the hostPciDevice value for this ArrayOfHostPciDevice.
     * 
     * @param hostPciDevice
     */
    public void setHostPciDevice(com.vmware.vim25.HostPciDevice[] hostPciDevice) {
        this.hostPciDevice = hostPciDevice;
    }

    public com.vmware.vim25.HostPciDevice getHostPciDevice(int i) {
        return this.hostPciDevice[i];
    }

    public void setHostPciDevice(int i, com.vmware.vim25.HostPciDevice _value) {
        this.hostPciDevice[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostPciDevice)) return false;
        ArrayOfHostPciDevice other = (ArrayOfHostPciDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostPciDevice==null && other.getHostPciDevice()==null) || 
             (this.hostPciDevice!=null &&
              java.util.Arrays.equals(this.hostPciDevice, other.getHostPciDevice())));
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
        if (getHostPciDevice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostPciDevice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostPciDevice(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostPciDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostPciDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostPciDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostPciDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPciDevice"));
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
