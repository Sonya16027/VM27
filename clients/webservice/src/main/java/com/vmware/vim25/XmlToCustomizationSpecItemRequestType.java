/**
 * XmlToCustomizationSpecItemRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class XmlToCustomizationSpecItemRequestType  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference _this;

    private java.lang.String specItemXml;

    public XmlToCustomizationSpecItemRequestType() {
    }

    public XmlToCustomizationSpecItemRequestType(
           com.vmware.vim25.ManagedObjectReference _this,
           java.lang.String specItemXml) {
           this._this = _this;
           this.specItemXml = specItemXml;
    }


    /**
     * Gets the _this value for this XmlToCustomizationSpecItemRequestType.
     * 
     * @return _this
     */
    public com.vmware.vim25.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this XmlToCustomizationSpecItemRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the specItemXml value for this XmlToCustomizationSpecItemRequestType.
     * 
     * @return specItemXml
     */
    public java.lang.String getSpecItemXml() {
        return specItemXml;
    }


    /**
     * Sets the specItemXml value for this XmlToCustomizationSpecItemRequestType.
     * 
     * @param specItemXml
     */
    public void setSpecItemXml(java.lang.String specItemXml) {
        this.specItemXml = specItemXml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XmlToCustomizationSpecItemRequestType)) return false;
        XmlToCustomizationSpecItemRequestType other = (XmlToCustomizationSpecItemRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._this==null && other.get_this()==null) || 
             (this._this!=null &&
              this._this.equals(other.get_this()))) &&
            ((this.specItemXml==null && other.getSpecItemXml()==null) || 
             (this.specItemXml!=null &&
              this.specItemXml.equals(other.getSpecItemXml())));
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
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        if (getSpecItemXml() != null) {
            _hashCode += getSpecItemXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XmlToCustomizationSpecItemRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "XmlToCustomizationSpecItemRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specItemXml");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "specItemXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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