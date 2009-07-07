/**
 * ArrayOfVirtualMachineSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualMachineSummary  implements java.io.Serializable {
    private com.vmware.vim25.VirtualMachineSummary[] virtualMachineSummary;

    public ArrayOfVirtualMachineSummary() {
    }

    public ArrayOfVirtualMachineSummary(
           com.vmware.vim25.VirtualMachineSummary[] virtualMachineSummary) {
           this.virtualMachineSummary = virtualMachineSummary;
    }


    /**
     * Gets the virtualMachineSummary value for this ArrayOfVirtualMachineSummary.
     * 
     * @return virtualMachineSummary
     */
    public com.vmware.vim25.VirtualMachineSummary[] getVirtualMachineSummary() {
        return virtualMachineSummary;
    }


    /**
     * Sets the virtualMachineSummary value for this ArrayOfVirtualMachineSummary.
     * 
     * @param virtualMachineSummary
     */
    public void setVirtualMachineSummary(com.vmware.vim25.VirtualMachineSummary[] virtualMachineSummary) {
        this.virtualMachineSummary = virtualMachineSummary;
    }

    public com.vmware.vim25.VirtualMachineSummary getVirtualMachineSummary(int i) {
        return this.virtualMachineSummary[i];
    }

    public void setVirtualMachineSummary(int i, com.vmware.vim25.VirtualMachineSummary _value) {
        this.virtualMachineSummary[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualMachineSummary)) return false;
        ArrayOfVirtualMachineSummary other = (ArrayOfVirtualMachineSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualMachineSummary==null && other.getVirtualMachineSummary()==null) || 
             (this.virtualMachineSummary!=null &&
              java.util.Arrays.equals(this.virtualMachineSummary, other.getVirtualMachineSummary())));
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
        if (getVirtualMachineSummary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualMachineSummary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualMachineSummary(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualMachineSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualMachineSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMachineSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineSummary"));
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
