/**
 * ArrayOfFileInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfFileInfo  implements java.io.Serializable {
    private com.vmware.vim25.FileInfo[] fileInfo;

    public ArrayOfFileInfo() {
    }

    public ArrayOfFileInfo(
           com.vmware.vim25.FileInfo[] fileInfo) {
           this.fileInfo = fileInfo;
    }


    /**
     * Gets the fileInfo value for this ArrayOfFileInfo.
     * 
     * @return fileInfo
     */
    public com.vmware.vim25.FileInfo[] getFileInfo() {
        return fileInfo;
    }


    /**
     * Sets the fileInfo value for this ArrayOfFileInfo.
     * 
     * @param fileInfo
     */
    public void setFileInfo(com.vmware.vim25.FileInfo[] fileInfo) {
        this.fileInfo = fileInfo;
    }

    public com.vmware.vim25.FileInfo getFileInfo(int i) {
        return this.fileInfo[i];
    }

    public void setFileInfo(int i, com.vmware.vim25.FileInfo _value) {
        this.fileInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfFileInfo)) return false;
        ArrayOfFileInfo other = (ArrayOfFileInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileInfo==null && other.getFileInfo()==null) || 
             (this.fileInfo!=null &&
              java.util.Arrays.equals(this.fileInfo, other.getFileInfo())));
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
        if (getFileInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileInfo(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfFileInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfFileInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "FileInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FileInfo"));
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
