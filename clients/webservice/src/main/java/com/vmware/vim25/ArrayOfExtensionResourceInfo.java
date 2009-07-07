/**
 * ArrayOfExtensionResourceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfExtensionResourceInfo  implements java.io.Serializable {
    private com.vmware.vim25.ExtensionResourceInfo[] extensionResourceInfo;

    public ArrayOfExtensionResourceInfo() {
    }

    public ArrayOfExtensionResourceInfo(
           com.vmware.vim25.ExtensionResourceInfo[] extensionResourceInfo) {
           this.extensionResourceInfo = extensionResourceInfo;
    }


    /**
     * Gets the extensionResourceInfo value for this ArrayOfExtensionResourceInfo.
     * 
     * @return extensionResourceInfo
     */
    public com.vmware.vim25.ExtensionResourceInfo[] getExtensionResourceInfo() {
        return extensionResourceInfo;
    }


    /**
     * Sets the extensionResourceInfo value for this ArrayOfExtensionResourceInfo.
     * 
     * @param extensionResourceInfo
     */
    public void setExtensionResourceInfo(com.vmware.vim25.ExtensionResourceInfo[] extensionResourceInfo) {
        this.extensionResourceInfo = extensionResourceInfo;
    }

    public com.vmware.vim25.ExtensionResourceInfo getExtensionResourceInfo(int i) {
        return this.extensionResourceInfo[i];
    }

    public void setExtensionResourceInfo(int i, com.vmware.vim25.ExtensionResourceInfo _value) {
        this.extensionResourceInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfExtensionResourceInfo)) return false;
        ArrayOfExtensionResourceInfo other = (ArrayOfExtensionResourceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extensionResourceInfo==null && other.getExtensionResourceInfo()==null) || 
             (this.extensionResourceInfo!=null &&
              java.util.Arrays.equals(this.extensionResourceInfo, other.getExtensionResourceInfo())));
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
        if (getExtensionResourceInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtensionResourceInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtensionResourceInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfExtensionResourceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfExtensionResourceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionResourceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ExtensionResourceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionResourceInfo"));
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
