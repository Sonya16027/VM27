/**
 * ArrayOfExtensionTaskTypeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfExtensionTaskTypeInfo  implements java.io.Serializable {
    private com.vmware.vim25.ExtensionTaskTypeInfo[] extensionTaskTypeInfo;

    public ArrayOfExtensionTaskTypeInfo() {
    }

    public ArrayOfExtensionTaskTypeInfo(
           com.vmware.vim25.ExtensionTaskTypeInfo[] extensionTaskTypeInfo) {
           this.extensionTaskTypeInfo = extensionTaskTypeInfo;
    }


    /**
     * Gets the extensionTaskTypeInfo value for this ArrayOfExtensionTaskTypeInfo.
     * 
     * @return extensionTaskTypeInfo
     */
    public com.vmware.vim25.ExtensionTaskTypeInfo[] getExtensionTaskTypeInfo() {
        return extensionTaskTypeInfo;
    }


    /**
     * Sets the extensionTaskTypeInfo value for this ArrayOfExtensionTaskTypeInfo.
     * 
     * @param extensionTaskTypeInfo
     */
    public void setExtensionTaskTypeInfo(com.vmware.vim25.ExtensionTaskTypeInfo[] extensionTaskTypeInfo) {
        this.extensionTaskTypeInfo = extensionTaskTypeInfo;
    }

    public com.vmware.vim25.ExtensionTaskTypeInfo getExtensionTaskTypeInfo(int i) {
        return this.extensionTaskTypeInfo[i];
    }

    public void setExtensionTaskTypeInfo(int i, com.vmware.vim25.ExtensionTaskTypeInfo _value) {
        this.extensionTaskTypeInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfExtensionTaskTypeInfo)) return false;
        ArrayOfExtensionTaskTypeInfo other = (ArrayOfExtensionTaskTypeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extensionTaskTypeInfo==null && other.getExtensionTaskTypeInfo()==null) || 
             (this.extensionTaskTypeInfo!=null &&
              java.util.Arrays.equals(this.extensionTaskTypeInfo, other.getExtensionTaskTypeInfo())));
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
        if (getExtensionTaskTypeInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtensionTaskTypeInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtensionTaskTypeInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfExtensionTaskTypeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfExtensionTaskTypeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionTaskTypeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ExtensionTaskTypeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionTaskTypeInfo"));
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
