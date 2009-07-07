/**
 * ArrayOfVirtualDeviceBackingOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVirtualDeviceBackingOption  implements java.io.Serializable {
    private com.vmware.vim25.VirtualDeviceBackingOption[] virtualDeviceBackingOption;

    public ArrayOfVirtualDeviceBackingOption() {
    }

    public ArrayOfVirtualDeviceBackingOption(
           com.vmware.vim25.VirtualDeviceBackingOption[] virtualDeviceBackingOption) {
           this.virtualDeviceBackingOption = virtualDeviceBackingOption;
    }


    /**
     * Gets the virtualDeviceBackingOption value for this ArrayOfVirtualDeviceBackingOption.
     * 
     * @return virtualDeviceBackingOption
     */
    public com.vmware.vim25.VirtualDeviceBackingOption[] getVirtualDeviceBackingOption() {
        return virtualDeviceBackingOption;
    }


    /**
     * Sets the virtualDeviceBackingOption value for this ArrayOfVirtualDeviceBackingOption.
     * 
     * @param virtualDeviceBackingOption
     */
    public void setVirtualDeviceBackingOption(com.vmware.vim25.VirtualDeviceBackingOption[] virtualDeviceBackingOption) {
        this.virtualDeviceBackingOption = virtualDeviceBackingOption;
    }

    public com.vmware.vim25.VirtualDeviceBackingOption getVirtualDeviceBackingOption(int i) {
        return this.virtualDeviceBackingOption[i];
    }

    public void setVirtualDeviceBackingOption(int i, com.vmware.vim25.VirtualDeviceBackingOption _value) {
        this.virtualDeviceBackingOption[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfVirtualDeviceBackingOption)) return false;
        ArrayOfVirtualDeviceBackingOption other = (ArrayOfVirtualDeviceBackingOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.virtualDeviceBackingOption==null && other.getVirtualDeviceBackingOption()==null) || 
             (this.virtualDeviceBackingOption!=null &&
              java.util.Arrays.equals(this.virtualDeviceBackingOption, other.getVirtualDeviceBackingOption())));
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
        if (getVirtualDeviceBackingOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVirtualDeviceBackingOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVirtualDeviceBackingOption(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfVirtualDeviceBackingOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfVirtualDeviceBackingOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualDeviceBackingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceBackingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceBackingOption"));
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
