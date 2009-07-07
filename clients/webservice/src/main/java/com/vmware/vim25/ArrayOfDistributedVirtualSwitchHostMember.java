/**
 * ArrayOfDistributedVirtualSwitchHostMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfDistributedVirtualSwitchHostMember  implements java.io.Serializable {
    private com.vmware.vim25.DistributedVirtualSwitchHostMember[] distributedVirtualSwitchHostMember;

    public ArrayOfDistributedVirtualSwitchHostMember() {
    }

    public ArrayOfDistributedVirtualSwitchHostMember(
           com.vmware.vim25.DistributedVirtualSwitchHostMember[] distributedVirtualSwitchHostMember) {
           this.distributedVirtualSwitchHostMember = distributedVirtualSwitchHostMember;
    }


    /**
     * Gets the distributedVirtualSwitchHostMember value for this ArrayOfDistributedVirtualSwitchHostMember.
     * 
     * @return distributedVirtualSwitchHostMember
     */
    public com.vmware.vim25.DistributedVirtualSwitchHostMember[] getDistributedVirtualSwitchHostMember() {
        return distributedVirtualSwitchHostMember;
    }


    /**
     * Sets the distributedVirtualSwitchHostMember value for this ArrayOfDistributedVirtualSwitchHostMember.
     * 
     * @param distributedVirtualSwitchHostMember
     */
    public void setDistributedVirtualSwitchHostMember(com.vmware.vim25.DistributedVirtualSwitchHostMember[] distributedVirtualSwitchHostMember) {
        this.distributedVirtualSwitchHostMember = distributedVirtualSwitchHostMember;
    }

    public com.vmware.vim25.DistributedVirtualSwitchHostMember getDistributedVirtualSwitchHostMember(int i) {
        return this.distributedVirtualSwitchHostMember[i];
    }

    public void setDistributedVirtualSwitchHostMember(int i, com.vmware.vim25.DistributedVirtualSwitchHostMember _value) {
        this.distributedVirtualSwitchHostMember[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDistributedVirtualSwitchHostMember)) return false;
        ArrayOfDistributedVirtualSwitchHostMember other = (ArrayOfDistributedVirtualSwitchHostMember) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.distributedVirtualSwitchHostMember==null && other.getDistributedVirtualSwitchHostMember()==null) || 
             (this.distributedVirtualSwitchHostMember!=null &&
              java.util.Arrays.equals(this.distributedVirtualSwitchHostMember, other.getDistributedVirtualSwitchHostMember())));
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
        if (getDistributedVirtualSwitchHostMember() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributedVirtualSwitchHostMember());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributedVirtualSwitchHostMember(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDistributedVirtualSwitchHostMember.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDistributedVirtualSwitchHostMember"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualSwitchHostMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMember"));
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
