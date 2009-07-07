/**
 * HostInternetScsiHbaDigestProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostInternetScsiHbaDigestProperties  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String headerDigestType;

    private java.lang.Boolean headerDigestInherited;

    private java.lang.String dataDigestType;

    private java.lang.Boolean dataDigestInherited;

    public HostInternetScsiHbaDigestProperties() {
    }

    public HostInternetScsiHbaDigestProperties(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String headerDigestType,
           java.lang.Boolean headerDigestInherited,
           java.lang.String dataDigestType,
           java.lang.Boolean dataDigestInherited) {
        super(
            dynamicType,
            dynamicProperty);
        this.headerDigestType = headerDigestType;
        this.headerDigestInherited = headerDigestInherited;
        this.dataDigestType = dataDigestType;
        this.dataDigestInherited = dataDigestInherited;
    }


    /**
     * Gets the headerDigestType value for this HostInternetScsiHbaDigestProperties.
     * 
     * @return headerDigestType
     */
    public java.lang.String getHeaderDigestType() {
        return headerDigestType;
    }


    /**
     * Sets the headerDigestType value for this HostInternetScsiHbaDigestProperties.
     * 
     * @param headerDigestType
     */
    public void setHeaderDigestType(java.lang.String headerDigestType) {
        this.headerDigestType = headerDigestType;
    }


    /**
     * Gets the headerDigestInherited value for this HostInternetScsiHbaDigestProperties.
     * 
     * @return headerDigestInherited
     */
    public java.lang.Boolean getHeaderDigestInherited() {
        return headerDigestInherited;
    }


    /**
     * Sets the headerDigestInherited value for this HostInternetScsiHbaDigestProperties.
     * 
     * @param headerDigestInherited
     */
    public void setHeaderDigestInherited(java.lang.Boolean headerDigestInherited) {
        this.headerDigestInherited = headerDigestInherited;
    }


    /**
     * Gets the dataDigestType value for this HostInternetScsiHbaDigestProperties.
     * 
     * @return dataDigestType
     */
    public java.lang.String getDataDigestType() {
        return dataDigestType;
    }


    /**
     * Sets the dataDigestType value for this HostInternetScsiHbaDigestProperties.
     * 
     * @param dataDigestType
     */
    public void setDataDigestType(java.lang.String dataDigestType) {
        this.dataDigestType = dataDigestType;
    }


    /**
     * Gets the dataDigestInherited value for this HostInternetScsiHbaDigestProperties.
     * 
     * @return dataDigestInherited
     */
    public java.lang.Boolean getDataDigestInherited() {
        return dataDigestInherited;
    }


    /**
     * Sets the dataDigestInherited value for this HostInternetScsiHbaDigestProperties.
     * 
     * @param dataDigestInherited
     */
    public void setDataDigestInherited(java.lang.Boolean dataDigestInherited) {
        this.dataDigestInherited = dataDigestInherited;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostInternetScsiHbaDigestProperties)) return false;
        HostInternetScsiHbaDigestProperties other = (HostInternetScsiHbaDigestProperties) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.headerDigestType==null && other.getHeaderDigestType()==null) || 
             (this.headerDigestType!=null &&
              this.headerDigestType.equals(other.getHeaderDigestType()))) &&
            ((this.headerDigestInherited==null && other.getHeaderDigestInherited()==null) || 
             (this.headerDigestInherited!=null &&
              this.headerDigestInherited.equals(other.getHeaderDigestInherited()))) &&
            ((this.dataDigestType==null && other.getDataDigestType()==null) || 
             (this.dataDigestType!=null &&
              this.dataDigestType.equals(other.getDataDigestType()))) &&
            ((this.dataDigestInherited==null && other.getDataDigestInherited()==null) || 
             (this.dataDigestInherited!=null &&
              this.dataDigestInherited.equals(other.getDataDigestInherited())));
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
        if (getHeaderDigestType() != null) {
            _hashCode += getHeaderDigestType().hashCode();
        }
        if (getHeaderDigestInherited() != null) {
            _hashCode += getHeaderDigestInherited().hashCode();
        }
        if (getDataDigestType() != null) {
            _hashCode += getDataDigestType().hashCode();
        }
        if (getDataDigestInherited() != null) {
            _hashCode += getDataDigestInherited().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaDigestProperties.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaDigestProperties"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerDigestType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "headerDigestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerDigestInherited");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "headerDigestInherited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDigestType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dataDigestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDigestInherited");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dataDigestInherited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
