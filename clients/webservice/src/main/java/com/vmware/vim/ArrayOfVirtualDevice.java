/**
 * ArrayOfVirtualDevice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfVirtualDevice  implements java.io.Serializable {
    private com.vmware.vim.VirtualDevice[] virtualDevice;

    public ArrayOfVirtualDevice() {
    }

    public ArrayOfVirtualDevice(
           com.vmware.vim.VirtualDevice[] virtualDevice) {
           this.virtualDevice = virtualDevice;
    }


    /**
     * Gets the virtualDevice value for this ArrayOfVirtualDevice.
     * 
     * @return virtualDevice
     */
    public com.vmware.vim.VirtualDevice[] getVirtualDevice() {
        return virtualDevice;
    }


    /**
     * Sets the virtualDevice value for this ArrayOfVirtualDevice.
     * 
     * @param virtualDevice
     */
    public void setVirtualDevice(com.vmware.vim.VirtualDevice[] virtualDevice) {
        this.virtualDevice = virtualDevice;
    }

    public com.vmware.vim.VirtualDevice getVirtualDevice(int i) {
        return this.virtualDevice[i];
    }

    public void setVirtualDevice(int i, com.vmware.vim.VirtualDevice _value) {
        this.virtualDevice[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualDevice)) return false;
        ArrayOfVirtualDevice other = (ArrayOfVirtualDevice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualDevice==null && other.getVirtualDevice()==null) || 
             (this.virtualDevice!=null &&
              java.util.Arrays.equals(this.virtualDevice, other.getVirtualDevice())));
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
        if (getVirtualDevice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualDevice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualDevice(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualDevice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfVirtualDevice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "VirtualDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualDevice"));
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
