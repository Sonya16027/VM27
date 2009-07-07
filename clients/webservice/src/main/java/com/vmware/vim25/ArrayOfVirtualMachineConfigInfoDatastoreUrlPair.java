/**
 * ArrayOfVirtualMachineConfigInfoDatastoreUrlPair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualMachineConfigInfoDatastoreUrlPair  implements java.io.Serializable {
    private com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair[] virtualMachineConfigInfoDatastoreUrlPair;

    public ArrayOfVirtualMachineConfigInfoDatastoreUrlPair() {
    }

    public ArrayOfVirtualMachineConfigInfoDatastoreUrlPair(
           com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair[] virtualMachineConfigInfoDatastoreUrlPair) {
           this.virtualMachineConfigInfoDatastoreUrlPair = virtualMachineConfigInfoDatastoreUrlPair;
    }


    /**
     * Gets the virtualMachineConfigInfoDatastoreUrlPair value for this ArrayOfVirtualMachineConfigInfoDatastoreUrlPair.
     * 
     * @return virtualMachineConfigInfoDatastoreUrlPair
     */
    public com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair[] getVirtualMachineConfigInfoDatastoreUrlPair() {
        return virtualMachineConfigInfoDatastoreUrlPair;
    }


    /**
     * Sets the virtualMachineConfigInfoDatastoreUrlPair value for this ArrayOfVirtualMachineConfigInfoDatastoreUrlPair.
     * 
     * @param virtualMachineConfigInfoDatastoreUrlPair
     */
    public void setVirtualMachineConfigInfoDatastoreUrlPair(com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair[] virtualMachineConfigInfoDatastoreUrlPair) {
        this.virtualMachineConfigInfoDatastoreUrlPair = virtualMachineConfigInfoDatastoreUrlPair;
    }

    public com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair getVirtualMachineConfigInfoDatastoreUrlPair(int i) {
        return this.virtualMachineConfigInfoDatastoreUrlPair[i];
    }

    public void setVirtualMachineConfigInfoDatastoreUrlPair(int i, com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair _value) {
        this.virtualMachineConfigInfoDatastoreUrlPair[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineConfigInfoDatastoreUrlPair)) return false;
        ArrayOfVirtualMachineConfigInfoDatastoreUrlPair other = (ArrayOfVirtualMachineConfigInfoDatastoreUrlPair) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineConfigInfoDatastoreUrlPair==null && other.getVirtualMachineConfigInfoDatastoreUrlPair()==null) || 
             (this.virtualMachineConfigInfoDatastoreUrlPair!=null &&
              java.util.Arrays.equals(this.virtualMachineConfigInfoDatastoreUrlPair, other.getVirtualMachineConfigInfoDatastoreUrlPair())));
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
        if (getVirtualMachineConfigInfoDatastoreUrlPair() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineConfigInfoDatastoreUrlPair());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineConfigInfoDatastoreUrlPair(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineConfigInfoDatastoreUrlPair.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineConfigInfoDatastoreUrlPair"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineConfigInfoDatastoreUrlPair");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConfigInfoDatastoreUrlPair"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConfigInfoDatastoreUrlPair"));
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
