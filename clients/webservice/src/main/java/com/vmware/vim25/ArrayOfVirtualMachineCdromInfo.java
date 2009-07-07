/**
 * ArrayOfVirtualMachineCdromInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualMachineCdromInfo  implements java.io.Serializable {
    private com.vmware.vim25.VirtualMachineCdromInfo[] virtualMachineCdromInfo;

    public ArrayOfVirtualMachineCdromInfo() {
    }

    public ArrayOfVirtualMachineCdromInfo(
           com.vmware.vim25.VirtualMachineCdromInfo[] virtualMachineCdromInfo) {
           this.virtualMachineCdromInfo = virtualMachineCdromInfo;
    }


    /**
     * Gets the virtualMachineCdromInfo value for this ArrayOfVirtualMachineCdromInfo.
     * 
     * @return virtualMachineCdromInfo
     */
    public com.vmware.vim25.VirtualMachineCdromInfo[] getVirtualMachineCdromInfo() {
        return virtualMachineCdromInfo;
    }


    /**
     * Sets the virtualMachineCdromInfo value for this ArrayOfVirtualMachineCdromInfo.
     * 
     * @param virtualMachineCdromInfo
     */
    public void setVirtualMachineCdromInfo(com.vmware.vim25.VirtualMachineCdromInfo[] virtualMachineCdromInfo) {
        this.virtualMachineCdromInfo = virtualMachineCdromInfo;
    }

    public com.vmware.vim25.VirtualMachineCdromInfo getVirtualMachineCdromInfo(int i) {
        return this.virtualMachineCdromInfo[i];
    }

    public void setVirtualMachineCdromInfo(int i, com.vmware.vim25.VirtualMachineCdromInfo _value) {
        this.virtualMachineCdromInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineCdromInfo)) return false;
        ArrayOfVirtualMachineCdromInfo other = (ArrayOfVirtualMachineCdromInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineCdromInfo==null && other.getVirtualMachineCdromInfo()==null) || 
             (this.virtualMachineCdromInfo!=null &&
              java.util.Arrays.equals(this.virtualMachineCdromInfo, other.getVirtualMachineCdromInfo())));
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
        if (getVirtualMachineCdromInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineCdromInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineCdromInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineCdromInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineCdromInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineCdromInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineCdromInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineCdromInfo"));
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
