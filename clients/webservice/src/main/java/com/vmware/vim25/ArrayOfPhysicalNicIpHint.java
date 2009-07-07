/**
 * ArrayOfPhysicalNicIpHint.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfPhysicalNicIpHint  implements java.io.Serializable {
    private com.vmware.vim25.PhysicalNicIpHint[] physicalNicIpHint;

    public ArrayOfPhysicalNicIpHint() {
    }

    public ArrayOfPhysicalNicIpHint(
           com.vmware.vim25.PhysicalNicIpHint[] physicalNicIpHint) {
           this.physicalNicIpHint = physicalNicIpHint;
    }


    /**
     * Gets the physicalNicIpHint value for this ArrayOfPhysicalNicIpHint.
     * 
     * @return physicalNicIpHint
     */
    public com.vmware.vim25.PhysicalNicIpHint[] getPhysicalNicIpHint() {
        return physicalNicIpHint;
    }


    /**
     * Sets the physicalNicIpHint value for this ArrayOfPhysicalNicIpHint.
     * 
     * @param physicalNicIpHint
     */
    public void setPhysicalNicIpHint(com.vmware.vim25.PhysicalNicIpHint[] physicalNicIpHint) {
        this.physicalNicIpHint = physicalNicIpHint;
    }

    public com.vmware.vim25.PhysicalNicIpHint getPhysicalNicIpHint(int i) {
        return this.physicalNicIpHint[i];
    }

    public void setPhysicalNicIpHint(int i, com.vmware.vim25.PhysicalNicIpHint _value) {
        this.physicalNicIpHint[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfPhysicalNicIpHint)) return false;
        ArrayOfPhysicalNicIpHint other = (ArrayOfPhysicalNicIpHint) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.physicalNicIpHint==null && other.getPhysicalNicIpHint()==null) || 
             (this.physicalNicIpHint!=null &&
              java.util.Arrays.equals(this.physicalNicIpHint, other.getPhysicalNicIpHint())));
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
        if (getPhysicalNicIpHint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhysicalNicIpHint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhysicalNicIpHint(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfPhysicalNicIpHint.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfPhysicalNicIpHint"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalNicIpHint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "PhysicalNicIpHint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PhysicalNicIpHint"));
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
