/**
 * ArrayOfHostSystemResourceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostSystemResourceInfo  implements java.io.Serializable {
    private com.vmware.vim.HostSystemResourceInfo[] hostSystemResourceInfo;

    public ArrayOfHostSystemResourceInfo() {
    }

    public ArrayOfHostSystemResourceInfo(
           com.vmware.vim.HostSystemResourceInfo[] hostSystemResourceInfo) {
           this.hostSystemResourceInfo = hostSystemResourceInfo;
    }


    /**
     * Gets the hostSystemResourceInfo value for this ArrayOfHostSystemResourceInfo.
     * 
     * @return hostSystemResourceInfo
     */
    public com.vmware.vim.HostSystemResourceInfo[] getHostSystemResourceInfo() {
        return hostSystemResourceInfo;
    }


    /**
     * Sets the hostSystemResourceInfo value for this ArrayOfHostSystemResourceInfo.
     * 
     * @param hostSystemResourceInfo
     */
    public void setHostSystemResourceInfo(com.vmware.vim.HostSystemResourceInfo[] hostSystemResourceInfo) {
        this.hostSystemResourceInfo = hostSystemResourceInfo;
    }

    public com.vmware.vim.HostSystemResourceInfo getHostSystemResourceInfo(int i) {
        return this.hostSystemResourceInfo[i];
    }

    public void setHostSystemResourceInfo(int i, com.vmware.vim.HostSystemResourceInfo _value) {
        this.hostSystemResourceInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfHostSystemResourceInfo)) return false;
        ArrayOfHostSystemResourceInfo other = (ArrayOfHostSystemResourceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostSystemResourceInfo==null && other.getHostSystemResourceInfo()==null) || 
             (this.hostSystemResourceInfo!=null &&
              java.util.Arrays.equals(this.hostSystemResourceInfo, other.getHostSystemResourceInfo())));
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
        if (getHostSystemResourceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostSystemResourceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostSystemResourceInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfHostSystemResourceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ArrayOfHostSystemResourceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostSystemResourceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "HostSystemResourceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostSystemResourceInfo"));
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
