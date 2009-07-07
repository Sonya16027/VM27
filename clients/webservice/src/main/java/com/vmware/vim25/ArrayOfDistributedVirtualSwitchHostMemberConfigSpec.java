/**
 * ArrayOfDistributedVirtualSwitchHostMemberConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfDistributedVirtualSwitchHostMemberConfigSpec  implements java.io.Serializable {
    private com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec[] distributedVirtualSwitchHostMemberConfigSpec;

    public ArrayOfDistributedVirtualSwitchHostMemberConfigSpec() {
    }

    public ArrayOfDistributedVirtualSwitchHostMemberConfigSpec(
           com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec[] distributedVirtualSwitchHostMemberConfigSpec) {
           this.distributedVirtualSwitchHostMemberConfigSpec = distributedVirtualSwitchHostMemberConfigSpec;
    }


    /**
     * Gets the distributedVirtualSwitchHostMemberConfigSpec value for this ArrayOfDistributedVirtualSwitchHostMemberConfigSpec.
     * 
     * @return distributedVirtualSwitchHostMemberConfigSpec
     */
    public com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec[] getDistributedVirtualSwitchHostMemberConfigSpec() {
        return distributedVirtualSwitchHostMemberConfigSpec;
    }


    /**
     * Sets the distributedVirtualSwitchHostMemberConfigSpec value for this ArrayOfDistributedVirtualSwitchHostMemberConfigSpec.
     * 
     * @param distributedVirtualSwitchHostMemberConfigSpec
     */
    public void setDistributedVirtualSwitchHostMemberConfigSpec(com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec[] distributedVirtualSwitchHostMemberConfigSpec) {
        this.distributedVirtualSwitchHostMemberConfigSpec = distributedVirtualSwitchHostMemberConfigSpec;
    }

    public com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec getDistributedVirtualSwitchHostMemberConfigSpec(int i) {
        return this.distributedVirtualSwitchHostMemberConfigSpec[i];
    }

    public void setDistributedVirtualSwitchHostMemberConfigSpec(int i, com.vmware.vim25.DistributedVirtualSwitchHostMemberConfigSpec _value) {
        this.distributedVirtualSwitchHostMemberConfigSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDistributedVirtualSwitchHostMemberConfigSpec)) return false;
        ArrayOfDistributedVirtualSwitchHostMemberConfigSpec other = (ArrayOfDistributedVirtualSwitchHostMemberConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.distributedVirtualSwitchHostMemberConfigSpec==null && other.getDistributedVirtualSwitchHostMemberConfigSpec()==null) || 
             (this.distributedVirtualSwitchHostMemberConfigSpec!=null &&
              java.util.Arrays.equals(this.distributedVirtualSwitchHostMemberConfigSpec, other.getDistributedVirtualSwitchHostMemberConfigSpec())));
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
        if (getDistributedVirtualSwitchHostMemberConfigSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributedVirtualSwitchHostMemberConfigSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributedVirtualSwitchHostMemberConfigSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDistributedVirtualSwitchHostMemberConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDistributedVirtualSwitchHostMemberConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualSwitchHostMemberConfigSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMemberConfigSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMemberConfigSpec"));
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
