/**
 * FileQueryFlags.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class FileQueryFlags  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private boolean fileType;

    private boolean fileSize;

    private boolean modification;

    public FileQueryFlags() {
    }

    public FileQueryFlags(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           boolean fileType,
           boolean fileSize,
           boolean modification) {
        super(
            dynamicType,
            dynamicProperty);
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.modification = modification;
    }


    /**
     * Gets the fileType value for this FileQueryFlags.
     * 
     * @return fileType
     */
    public boolean isFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this FileQueryFlags.
     * 
     * @param fileType
     */
    public void setFileType(boolean fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the fileSize value for this FileQueryFlags.
     * 
     * @return fileSize
     */
    public boolean isFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this FileQueryFlags.
     * 
     * @param fileSize
     */
    public void setFileSize(boolean fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the modification value for this FileQueryFlags.
     * 
     * @return modification
     */
    public boolean isModification() {
        return modification;
    }


    /**
     * Sets the modification value for this FileQueryFlags.
     * 
     * @param modification
     */
    public void setModification(boolean modification) {
        this.modification = modification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileQueryFlags)) return false;
        FileQueryFlags other = (FileQueryFlags) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.fileType == other.isFileType() &&
            this.fileSize == other.isFileSize() &&
            this.modification == other.isModification();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += (isFileType() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFileSize() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isModification() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileQueryFlags.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "FileQueryFlags"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "fileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "fileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modification");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "modification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
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
