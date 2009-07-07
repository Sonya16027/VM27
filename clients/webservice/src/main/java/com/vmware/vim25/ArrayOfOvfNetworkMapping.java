/**
 * ArrayOfOvfNetworkMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfOvfNetworkMapping  implements java.io.Serializable {
    private com.vmware.vim25.OvfNetworkMapping[] ovfNetworkMapping;

    public ArrayOfOvfNetworkMapping() {
    }

    public ArrayOfOvfNetworkMapping(
           com.vmware.vim25.OvfNetworkMapping[] ovfNetworkMapping) {
           this.ovfNetworkMapping = ovfNetworkMapping;
    }


    /**
     * Gets the ovfNetworkMapping value for this ArrayOfOvfNetworkMapping.
     * 
     * @return ovfNetworkMapping
     */
    public com.vmware.vim25.OvfNetworkMapping[] getOvfNetworkMapping() {
        return ovfNetworkMapping;
    }


    /**
     * Sets the ovfNetworkMapping value for this ArrayOfOvfNetworkMapping.
     * 
     * @param ovfNetworkMapping
     */
    public void setOvfNetworkMapping(com.vmware.vim25.OvfNetworkMapping[] ovfNetworkMapping) {
        this.ovfNetworkMapping = ovfNetworkMapping;
    }

    public com.vmware.vim25.OvfNetworkMapping getOvfNetworkMapping(int i) {
        return this.ovfNetworkMapping[i];
    }

    public void setOvfNetworkMapping(int i, com.vmware.vim25.OvfNetworkMapping _value) {
        this.ovfNetworkMapping[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfOvfNetworkMapping)) return false;
        ArrayOfOvfNetworkMapping other = (ArrayOfOvfNetworkMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ovfNetworkMapping==null && other.getOvfNetworkMapping()==null) || 
             (this.ovfNetworkMapping!=null &&
              java.util.Arrays.equals(this.ovfNetworkMapping, other.getOvfNetworkMapping())));
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
        if (getOvfNetworkMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOvfNetworkMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOvfNetworkMapping(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfOvfNetworkMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfOvfNetworkMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovfNetworkMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "OvfNetworkMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfNetworkMapping"));
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
