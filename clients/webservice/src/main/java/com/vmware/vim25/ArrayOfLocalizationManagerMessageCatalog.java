/**
 * ArrayOfLocalizationManagerMessageCatalog.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfLocalizationManagerMessageCatalog  implements java.io.Serializable {
    private com.vmware.vim25.LocalizationManagerMessageCatalog[] localizationManagerMessageCatalog;

    public ArrayOfLocalizationManagerMessageCatalog() {
    }

    public ArrayOfLocalizationManagerMessageCatalog(
           com.vmware.vim25.LocalizationManagerMessageCatalog[] localizationManagerMessageCatalog) {
           this.localizationManagerMessageCatalog = localizationManagerMessageCatalog;
    }


    /**
     * Gets the localizationManagerMessageCatalog value for this ArrayOfLocalizationManagerMessageCatalog.
     * 
     * @return localizationManagerMessageCatalog
     */
    public com.vmware.vim25.LocalizationManagerMessageCatalog[] getLocalizationManagerMessageCatalog() {
        return localizationManagerMessageCatalog;
    }


    /**
     * Sets the localizationManagerMessageCatalog value for this ArrayOfLocalizationManagerMessageCatalog.
     * 
     * @param localizationManagerMessageCatalog
     */
    public void setLocalizationManagerMessageCatalog(com.vmware.vim25.LocalizationManagerMessageCatalog[] localizationManagerMessageCatalog) {
        this.localizationManagerMessageCatalog = localizationManagerMessageCatalog;
    }

    public com.vmware.vim25.LocalizationManagerMessageCatalog getLocalizationManagerMessageCatalog(int i) {
        return this.localizationManagerMessageCatalog[i];
    }

    public void setLocalizationManagerMessageCatalog(int i, com.vmware.vim25.LocalizationManagerMessageCatalog _value) {
        this.localizationManagerMessageCatalog[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfLocalizationManagerMessageCatalog)) return false;
        ArrayOfLocalizationManagerMessageCatalog other = (ArrayOfLocalizationManagerMessageCatalog) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.localizationManagerMessageCatalog==null && other.getLocalizationManagerMessageCatalog()==null) || 
             (this.localizationManagerMessageCatalog!=null &&
              java.util.Arrays.equals(this.localizationManagerMessageCatalog, other.getLocalizationManagerMessageCatalog())));
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
        if (getLocalizationManagerMessageCatalog() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalizationManagerMessageCatalog());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalizationManagerMessageCatalog(), i);
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
        new org.apache.axis.description.TypeDesc(ArrayOfLocalizationManagerMessageCatalog.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ArrayOfLocalizationManagerMessageCatalog"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizationManagerMessageCatalog");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "LocalizationManagerMessageCatalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizationManagerMessageCatalog"));
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
