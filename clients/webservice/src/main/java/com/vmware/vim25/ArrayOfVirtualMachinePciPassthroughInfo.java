/**
 * ArrayOfVirtualMachinePciPassthroughInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualMachinePciPassthroughInfo  implements java.io.Serializable {
    private com.vmware.vim25.VirtualMachinePciPassthroughInfo[] virtualMachinePciPassthroughInfo;

    public ArrayOfVirtualMachinePciPassthroughInfo() {
    }

    public ArrayOfVirtualMachinePciPassthroughInfo(
           com.vmware.vim25.VirtualMachinePciPassthroughInfo[] virtualMachinePciPassthroughInfo) {
           this.virtualMachinePciPassthroughInfo = virtualMachinePciPassthroughInfo;
    }


    /**
     * Gets the virtualMachinePciPassthroughInfo value for this ArrayOfVirtualMachinePciPassthroughInfo.
     * 
     * @return virtualMachinePciPassthroughInfo
     */
    public com.vmware.vim25.VirtualMachinePciPassthroughInfo[] getVirtualMachinePciPassthroughInfo() {
        return virtualMachinePciPassthroughInfo;
    }


    /**
     * Sets the virtualMachinePciPassthroughInfo value for this ArrayOfVirtualMachinePciPassthroughInfo.
     * 
     * @param virtualMachinePciPassthroughInfo
     */
    public void setVirtualMachinePciPassthroughInfo(com.vmware.vim25.VirtualMachinePciPassthroughInfo[] virtualMachinePciPassthroughInfo) {
        this.virtualMachinePciPassthroughInfo = virtualMachinePciPassthroughInfo;
    }

    public com.vmware.vim25.VirtualMachinePciPassthroughInfo getVirtualMachinePciPassthroughInfo(int i) {
        return this.virtualMachinePciPassthroughInfo[i];
    }

    public void setVirtualMachinePciPassthroughInfo(int i, com.vmware.vim25.VirtualMachinePciPassthroughInfo _value) {
        this.virtualMachinePciPassthroughInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachinePciPassthroughInfo)) return false;
        ArrayOfVirtualMachinePciPassthroughInfo other = (ArrayOfVirtualMachinePciPassthroughInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachinePciPassthroughInfo==null && other.getVirtualMachinePciPassthroughInfo()==null) || 
             (this.virtualMachinePciPassthroughInfo!=null &&
              java.util.Arrays.equals(this.virtualMachinePciPassthroughInfo, other.getVirtualMachinePciPassthroughInfo())));
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
        if (getVirtualMachinePciPassthroughInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachinePciPassthroughInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachinePciPassthroughInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachinePciPassthroughInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachinePciPassthroughInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachinePciPassthroughInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachinePciPassthroughInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachinePciPassthroughInfo"));
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
