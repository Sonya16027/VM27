/**
 * ArrayOfVirtualMachineSerialInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfVirtualMachineSerialInfo  implements java.io.Serializable {
    private com.vmware.vim.VirtualMachineSerialInfo[] virtualMachineSerialInfo;

    public ArrayOfVirtualMachineSerialInfo() {
    }

    public ArrayOfVirtualMachineSerialInfo(
           com.vmware.vim.VirtualMachineSerialInfo[] virtualMachineSerialInfo) {
           this.virtualMachineSerialInfo = virtualMachineSerialInfo;
    }


    /**
     * Gets the virtualMachineSerialInfo value for this ArrayOfVirtualMachineSerialInfo.
     * 
     * @return virtualMachineSerialInfo
     */
    public com.vmware.vim.VirtualMachineSerialInfo[] getVirtualMachineSerialInfo() {
        return virtualMachineSerialInfo;
    }


    /**
     * Sets the virtualMachineSerialInfo value for this ArrayOfVirtualMachineSerialInfo.
     * 
     * @param virtualMachineSerialInfo
     */
    public void setVirtualMachineSerialInfo(com.vmware.vim.VirtualMachineSerialInfo[] virtualMachineSerialInfo) {
        this.virtualMachineSerialInfo = virtualMachineSerialInfo;
    }

    public com.vmware.vim.VirtualMachineSerialInfo getVirtualMachineSerialInfo(int i) {
        return this.virtualMachineSerialInfo[i];
    }

    public void setVirtualMachineSerialInfo(int i, com.vmware.vim.VirtualMachineSerialInfo _value) {
        this.virtualMachineSerialInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineSerialInfo)) return false;
        ArrayOfVirtualMachineSerialInfo other = (ArrayOfVirtualMachineSerialInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineSerialInfo==null && other.getVirtualMachineSerialInfo()==null) || 
             (this.virtualMachineSerialInfo!=null &&
              java.util.Arrays.equals(this.virtualMachineSerialInfo, other.getVirtualMachineSerialInfo())));
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
        if (getVirtualMachineSerialInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineSerialInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineSerialInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineSerialInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfVirtualMachineSerialInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineSerialInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineSerialInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineSerialInfo"));
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
