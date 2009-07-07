/**
 * ArrayOfVirtualMachineMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualMachineMessage  implements java.io.Serializable {
    private com.vmware.vim25.VirtualMachineMessage[] virtualMachineMessage;

    public ArrayOfVirtualMachineMessage() {
    }

    public ArrayOfVirtualMachineMessage(
           com.vmware.vim25.VirtualMachineMessage[] virtualMachineMessage) {
           this.virtualMachineMessage = virtualMachineMessage;
    }


    /**
     * Gets the virtualMachineMessage value for this ArrayOfVirtualMachineMessage.
     * 
     * @return virtualMachineMessage
     */
    public com.vmware.vim25.VirtualMachineMessage[] getVirtualMachineMessage() {
        return virtualMachineMessage;
    }


    /**
     * Sets the virtualMachineMessage value for this ArrayOfVirtualMachineMessage.
     * 
     * @param virtualMachineMessage
     */
    public void setVirtualMachineMessage(com.vmware.vim25.VirtualMachineMessage[] virtualMachineMessage) {
        this.virtualMachineMessage = virtualMachineMessage;
    }

    public com.vmware.vim25.VirtualMachineMessage getVirtualMachineMessage(int i) {
        return this.virtualMachineMessage[i];
    }

    public void setVirtualMachineMessage(int i, com.vmware.vim25.VirtualMachineMessage _value) {
        this.virtualMachineMessage[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineMessage)) return false;
        ArrayOfVirtualMachineMessage other = (ArrayOfVirtualMachineMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineMessage==null && other.getVirtualMachineMessage()==null) || 
             (this.virtualMachineMessage!=null &&
              java.util.Arrays.equals(this.virtualMachineMessage, other.getVirtualMachineMessage())));
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
        if (getVirtualMachineMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineMessage(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineMessage"));
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
