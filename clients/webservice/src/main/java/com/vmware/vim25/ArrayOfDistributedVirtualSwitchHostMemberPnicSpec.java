/**
 * ArrayOfDistributedVirtualSwitchHostMemberPnicSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfDistributedVirtualSwitchHostMemberPnicSpec  implements java.io.Serializable {
    private com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec[] distributedVirtualSwitchHostMemberPnicSpec;

    public ArrayOfDistributedVirtualSwitchHostMemberPnicSpec() {
    }

    public ArrayOfDistributedVirtualSwitchHostMemberPnicSpec(
           com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec[] distributedVirtualSwitchHostMemberPnicSpec) {
           this.distributedVirtualSwitchHostMemberPnicSpec = distributedVirtualSwitchHostMemberPnicSpec;
    }


    /**
     * Gets the distributedVirtualSwitchHostMemberPnicSpec value for this ArrayOfDistributedVirtualSwitchHostMemberPnicSpec.
     * 
     * @return distributedVirtualSwitchHostMemberPnicSpec
     */
    public com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec[] getDistributedVirtualSwitchHostMemberPnicSpec() {
        return distributedVirtualSwitchHostMemberPnicSpec;
    }


    /**
     * Sets the distributedVirtualSwitchHostMemberPnicSpec value for this ArrayOfDistributedVirtualSwitchHostMemberPnicSpec.
     * 
     * @param distributedVirtualSwitchHostMemberPnicSpec
     */
    public void setDistributedVirtualSwitchHostMemberPnicSpec(com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec[] distributedVirtualSwitchHostMemberPnicSpec) {
        this.distributedVirtualSwitchHostMemberPnicSpec = distributedVirtualSwitchHostMemberPnicSpec;
    }

    public com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec getDistributedVirtualSwitchHostMemberPnicSpec(int i) {
        return this.distributedVirtualSwitchHostMemberPnicSpec[i];
    }

    public void setDistributedVirtualSwitchHostMemberPnicSpec(int i, com.vmware.vim25.DistributedVirtualSwitchHostMemberPnicSpec _value) {
        this.distributedVirtualSwitchHostMemberPnicSpec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfDistributedVirtualSwitchHostMemberPnicSpec)) return false;
        ArrayOfDistributedVirtualSwitchHostMemberPnicSpec other = (ArrayOfDistributedVirtualSwitchHostMemberPnicSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.distributedVirtualSwitchHostMemberPnicSpec==null && other.getDistributedVirtualSwitchHostMemberPnicSpec()==null) || 
             (this.distributedVirtualSwitchHostMemberPnicSpec!=null &&
              java.util.Arrays.equals(this.distributedVirtualSwitchHostMemberPnicSpec, other.getDistributedVirtualSwitchHostMemberPnicSpec())));
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
        if (getDistributedVirtualSwitchHostMemberPnicSpec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributedVirtualSwitchHostMemberPnicSpec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributedVirtualSwitchHostMemberPnicSpec(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfDistributedVirtualSwitchHostMemberPnicSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfDistributedVirtualSwitchHostMemberPnicSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualSwitchHostMemberPnicSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMemberPnicSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchHostMemberPnicSpec"));
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
