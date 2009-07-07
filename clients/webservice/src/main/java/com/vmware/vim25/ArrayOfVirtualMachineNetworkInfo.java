/**
 * ArrayOfVirtualMachineNetworkInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualMachineNetworkInfo  implements java.io.Serializable {
    private com.vmware.vim25.VirtualMachineNetworkInfo[] virtualMachineNetworkInfo;

    public ArrayOfVirtualMachineNetworkInfo() {
    }

    public ArrayOfVirtualMachineNetworkInfo(
           com.vmware.vim25.VirtualMachineNetworkInfo[] virtualMachineNetworkInfo) {
           this.virtualMachineNetworkInfo = virtualMachineNetworkInfo;
    }


    /**
     * Gets the virtualMachineNetworkInfo value for this ArrayOfVirtualMachineNetworkInfo.
     * 
     * @return virtualMachineNetworkInfo
     */
    public com.vmware.vim25.VirtualMachineNetworkInfo[] getVirtualMachineNetworkInfo() {
        return virtualMachineNetworkInfo;
    }


    /**
     * Sets the virtualMachineNetworkInfo value for this ArrayOfVirtualMachineNetworkInfo.
     * 
     * @param virtualMachineNetworkInfo
     */
    public void setVirtualMachineNetworkInfo(com.vmware.vim25.VirtualMachineNetworkInfo[] virtualMachineNetworkInfo) {
        this.virtualMachineNetworkInfo = virtualMachineNetworkInfo;
    }

    public com.vmware.vim25.VirtualMachineNetworkInfo getVirtualMachineNetworkInfo(int i) {
        return this.virtualMachineNetworkInfo[i];
    }

    public void setVirtualMachineNetworkInfo(int i, com.vmware.vim25.VirtualMachineNetworkInfo _value) {
        this.virtualMachineNetworkInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineNetworkInfo)) return false;
        ArrayOfVirtualMachineNetworkInfo other = (ArrayOfVirtualMachineNetworkInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineNetworkInfo==null && other.getVirtualMachineNetworkInfo()==null) || 
             (this.virtualMachineNetworkInfo!=null &&
              java.util.Arrays.equals(this.virtualMachineNetworkInfo, other.getVirtualMachineNetworkInfo())));
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
        if (getVirtualMachineNetworkInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineNetworkInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineNetworkInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineNetworkInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineNetworkInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineNetworkInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineNetworkInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineNetworkInfo"));
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
