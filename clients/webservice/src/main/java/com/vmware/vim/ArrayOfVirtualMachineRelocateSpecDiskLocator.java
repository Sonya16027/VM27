/**
 * ArrayOfVirtualMachineRelocateSpecDiskLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfVirtualMachineRelocateSpecDiskLocator  implements java.io.Serializable {
    private com.vmware.vim.VirtualMachineRelocateSpecDiskLocator[] virtualMachineRelocateSpecDiskLocator;

    public ArrayOfVirtualMachineRelocateSpecDiskLocator() {
    }

    public ArrayOfVirtualMachineRelocateSpecDiskLocator(
           com.vmware.vim.VirtualMachineRelocateSpecDiskLocator[] virtualMachineRelocateSpecDiskLocator) {
           this.virtualMachineRelocateSpecDiskLocator = virtualMachineRelocateSpecDiskLocator;
    }


    /**
     * Gets the virtualMachineRelocateSpecDiskLocator value for this ArrayOfVirtualMachineRelocateSpecDiskLocator.
     * 
     * @return virtualMachineRelocateSpecDiskLocator
     */
    public com.vmware.vim.VirtualMachineRelocateSpecDiskLocator[] getVirtualMachineRelocateSpecDiskLocator() {
        return virtualMachineRelocateSpecDiskLocator;
    }


    /**
     * Sets the virtualMachineRelocateSpecDiskLocator value for this ArrayOfVirtualMachineRelocateSpecDiskLocator.
     * 
     * @param virtualMachineRelocateSpecDiskLocator
     */
    public void setVirtualMachineRelocateSpecDiskLocator(com.vmware.vim.VirtualMachineRelocateSpecDiskLocator[] virtualMachineRelocateSpecDiskLocator) {
        this.virtualMachineRelocateSpecDiskLocator = virtualMachineRelocateSpecDiskLocator;
    }

    public com.vmware.vim.VirtualMachineRelocateSpecDiskLocator getVirtualMachineRelocateSpecDiskLocator(int i) {
        return this.virtualMachineRelocateSpecDiskLocator[i];
    }

    public void setVirtualMachineRelocateSpecDiskLocator(int i, com.vmware.vim.VirtualMachineRelocateSpecDiskLocator _value) {
        this.virtualMachineRelocateSpecDiskLocator[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineRelocateSpecDiskLocator)) return false;
        ArrayOfVirtualMachineRelocateSpecDiskLocator other = (ArrayOfVirtualMachineRelocateSpecDiskLocator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineRelocateSpecDiskLocator==null && other.getVirtualMachineRelocateSpecDiskLocator()==null) || 
             (this.virtualMachineRelocateSpecDiskLocator!=null &&
              java.util.Arrays.equals(this.virtualMachineRelocateSpecDiskLocator, other.getVirtualMachineRelocateSpecDiskLocator())));
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
        if (getVirtualMachineRelocateSpecDiskLocator() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineRelocateSpecDiskLocator());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineRelocateSpecDiskLocator(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineRelocateSpecDiskLocator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfVirtualMachineRelocateSpecDiskLocator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineRelocateSpecDiskLocator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineRelocateSpecDiskLocator"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineRelocateSpecDiskLocator"));
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
