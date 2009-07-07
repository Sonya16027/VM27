/**
 * ArrayOfVirtualMachineLegacyNetworkSwitchInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualMachineLegacyNetworkSwitchInfo  implements java.io.Serializable {
    private com.vmware.vim25.VirtualMachineLegacyNetworkSwitchInfo[] virtualMachineLegacyNetworkSwitchInfo;

    public ArrayOfVirtualMachineLegacyNetworkSwitchInfo() {
    }

    public ArrayOfVirtualMachineLegacyNetworkSwitchInfo(
           com.vmware.vim25.VirtualMachineLegacyNetworkSwitchInfo[] virtualMachineLegacyNetworkSwitchInfo) {
           this.virtualMachineLegacyNetworkSwitchInfo = virtualMachineLegacyNetworkSwitchInfo;
    }


    /**
     * Gets the virtualMachineLegacyNetworkSwitchInfo value for this ArrayOfVirtualMachineLegacyNetworkSwitchInfo.
     * 
     * @return virtualMachineLegacyNetworkSwitchInfo
     */
    public com.vmware.vim25.VirtualMachineLegacyNetworkSwitchInfo[] getVirtualMachineLegacyNetworkSwitchInfo() {
        return virtualMachineLegacyNetworkSwitchInfo;
    }


    /**
     * Sets the virtualMachineLegacyNetworkSwitchInfo value for this ArrayOfVirtualMachineLegacyNetworkSwitchInfo.
     * 
     * @param virtualMachineLegacyNetworkSwitchInfo
     */
    public void setVirtualMachineLegacyNetworkSwitchInfo(com.vmware.vim25.VirtualMachineLegacyNetworkSwitchInfo[] virtualMachineLegacyNetworkSwitchInfo) {
        this.virtualMachineLegacyNetworkSwitchInfo = virtualMachineLegacyNetworkSwitchInfo;
    }

    public com.vmware.vim25.VirtualMachineLegacyNetworkSwitchInfo getVirtualMachineLegacyNetworkSwitchInfo(int i) {
        return this.virtualMachineLegacyNetworkSwitchInfo[i];
    }

    public void setVirtualMachineLegacyNetworkSwitchInfo(int i, com.vmware.vim25.VirtualMachineLegacyNetworkSwitchInfo _value) {
        this.virtualMachineLegacyNetworkSwitchInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineLegacyNetworkSwitchInfo)) return false;
        ArrayOfVirtualMachineLegacyNetworkSwitchInfo other = (ArrayOfVirtualMachineLegacyNetworkSwitchInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineLegacyNetworkSwitchInfo==null && other.getVirtualMachineLegacyNetworkSwitchInfo()==null) || 
             (this.virtualMachineLegacyNetworkSwitchInfo!=null &&
              java.util.Arrays.equals(this.virtualMachineLegacyNetworkSwitchInfo, other.getVirtualMachineLegacyNetworkSwitchInfo())));
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
        if (getVirtualMachineLegacyNetworkSwitchInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineLegacyNetworkSwitchInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineLegacyNetworkSwitchInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineLegacyNetworkSwitchInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineLegacyNetworkSwitchInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineLegacyNetworkSwitchInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineLegacyNetworkSwitchInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineLegacyNetworkSwitchInfo"));
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
