/**
 * ArrayOfVirtualMachineDisplayTopology.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualMachineDisplayTopology  implements java.io.Serializable {
    private com.vmware.vim25.VirtualMachineDisplayTopology[] virtualMachineDisplayTopology;

    public ArrayOfVirtualMachineDisplayTopology() {
    }

    public ArrayOfVirtualMachineDisplayTopology(
           com.vmware.vim25.VirtualMachineDisplayTopology[] virtualMachineDisplayTopology) {
           this.virtualMachineDisplayTopology = virtualMachineDisplayTopology;
    }


    /**
     * Gets the virtualMachineDisplayTopology value for this ArrayOfVirtualMachineDisplayTopology.
     * 
     * @return virtualMachineDisplayTopology
     */
    public com.vmware.vim25.VirtualMachineDisplayTopology[] getVirtualMachineDisplayTopology() {
        return virtualMachineDisplayTopology;
    }


    /**
     * Sets the virtualMachineDisplayTopology value for this ArrayOfVirtualMachineDisplayTopology.
     * 
     * @param virtualMachineDisplayTopology
     */
    public void setVirtualMachineDisplayTopology(com.vmware.vim25.VirtualMachineDisplayTopology[] virtualMachineDisplayTopology) {
        this.virtualMachineDisplayTopology = virtualMachineDisplayTopology;
    }

    public com.vmware.vim25.VirtualMachineDisplayTopology getVirtualMachineDisplayTopology(int i) {
        return this.virtualMachineDisplayTopology[i];
    }

    public void setVirtualMachineDisplayTopology(int i, com.vmware.vim25.VirtualMachineDisplayTopology _value) {
        this.virtualMachineDisplayTopology[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineDisplayTopology)) return false;
        ArrayOfVirtualMachineDisplayTopology other = (ArrayOfVirtualMachineDisplayTopology) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineDisplayTopology==null && other.getVirtualMachineDisplayTopology()==null) || 
             (this.virtualMachineDisplayTopology!=null &&
              java.util.Arrays.equals(this.virtualMachineDisplayTopology, other.getVirtualMachineDisplayTopology())));
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
        if (getVirtualMachineDisplayTopology() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineDisplayTopology());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineDisplayTopology(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineDisplayTopology.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineDisplayTopology"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineDisplayTopology");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineDisplayTopology"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineDisplayTopology"));
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
