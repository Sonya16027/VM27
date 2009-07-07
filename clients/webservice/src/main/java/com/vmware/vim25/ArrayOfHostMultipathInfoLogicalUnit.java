/**
 * ArrayOfHostMultipathInfoLogicalUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostMultipathInfoLogicalUnit  implements java.io.Serializable {
    private com.vmware.vim25.HostMultipathInfoLogicalUnit[] hostMultipathInfoLogicalUnit;

    public ArrayOfHostMultipathInfoLogicalUnit() {
    }

    public ArrayOfHostMultipathInfoLogicalUnit(
           com.vmware.vim25.HostMultipathInfoLogicalUnit[] hostMultipathInfoLogicalUnit) {
           this.hostMultipathInfoLogicalUnit = hostMultipathInfoLogicalUnit;
    }


    /**
     * Gets the hostMultipathInfoLogicalUnit value for this ArrayOfHostMultipathInfoLogicalUnit.
     * 
     * @return hostMultipathInfoLogicalUnit
     */
    public com.vmware.vim25.HostMultipathInfoLogicalUnit[] getHostMultipathInfoLogicalUnit() {
        return hostMultipathInfoLogicalUnit;
    }


    /**
     * Sets the hostMultipathInfoLogicalUnit value for this ArrayOfHostMultipathInfoLogicalUnit.
     * 
     * @param hostMultipathInfoLogicalUnit
     */
    public void setHostMultipathInfoLogicalUnit(com.vmware.vim25.HostMultipathInfoLogicalUnit[] hostMultipathInfoLogicalUnit) {
        this.hostMultipathInfoLogicalUnit = hostMultipathInfoLogicalUnit;
    }

    public com.vmware.vim25.HostMultipathInfoLogicalUnit getHostMultipathInfoLogicalUnit(int i) {
        return this.hostMultipathInfoLogicalUnit[i];
    }

    public void setHostMultipathInfoLogicalUnit(int i, com.vmware.vim25.HostMultipathInfoLogicalUnit _value) {
        this.hostMultipathInfoLogicalUnit[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostMultipathInfoLogicalUnit)) return false;
        ArrayOfHostMultipathInfoLogicalUnit other = (ArrayOfHostMultipathInfoLogicalUnit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostMultipathInfoLogicalUnit==null && other.getHostMultipathInfoLogicalUnit()==null) || 
             (this.hostMultipathInfoLogicalUnit!=null &&
              java.util.Arrays.equals(this.hostMultipathInfoLogicalUnit, other.getHostMultipathInfoLogicalUnit())));
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
        if (getHostMultipathInfoLogicalUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostMultipathInfoLogicalUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostMultipathInfoLogicalUnit(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostMultipathInfoLogicalUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostMultipathInfoLogicalUnit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostMultipathInfoLogicalUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostMultipathInfoLogicalUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMultipathInfoLogicalUnit"));
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
