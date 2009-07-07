/**
 * ArrayOfHostPciPassthruInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostPciPassthruInfo  implements java.io.Serializable {
    private com.vmware.vim25.HostPciPassthruInfo[] hostPciPassthruInfo;

    public ArrayOfHostPciPassthruInfo() {
    }

    public ArrayOfHostPciPassthruInfo(
           com.vmware.vim25.HostPciPassthruInfo[] hostPciPassthruInfo) {
           this.hostPciPassthruInfo = hostPciPassthruInfo;
    }


    /**
     * Gets the hostPciPassthruInfo value for this ArrayOfHostPciPassthruInfo.
     * 
     * @return hostPciPassthruInfo
     */
    public com.vmware.vim25.HostPciPassthruInfo[] getHostPciPassthruInfo() {
        return hostPciPassthruInfo;
    }


    /**
     * Sets the hostPciPassthruInfo value for this ArrayOfHostPciPassthruInfo.
     * 
     * @param hostPciPassthruInfo
     */
    public void setHostPciPassthruInfo(com.vmware.vim25.HostPciPassthruInfo[] hostPciPassthruInfo) {
        this.hostPciPassthruInfo = hostPciPassthruInfo;
    }

    public com.vmware.vim25.HostPciPassthruInfo getHostPciPassthruInfo(int i) {
        return this.hostPciPassthruInfo[i];
    }

    public void setHostPciPassthruInfo(int i, com.vmware.vim25.HostPciPassthruInfo _value) {
        this.hostPciPassthruInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostPciPassthruInfo)) return false;
        ArrayOfHostPciPassthruInfo other = (ArrayOfHostPciPassthruInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostPciPassthruInfo==null && other.getHostPciPassthruInfo()==null) || 
             (this.hostPciPassthruInfo!=null &&
              java.util.Arrays.equals(this.hostPciPassthruInfo, other.getHostPciPassthruInfo())));
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
        if (getHostPciPassthruInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostPciPassthruInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostPciPassthruInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostPciPassthruInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfHostPciPassthruInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostPciPassthruInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "HostPciPassthruInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPciPassthruInfo"));
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
