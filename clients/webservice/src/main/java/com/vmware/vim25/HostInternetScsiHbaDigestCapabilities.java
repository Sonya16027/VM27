/**
 * HostInternetScsiHbaDigestCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostInternetScsiHbaDigestCapabilities  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean headerDigestSettable;

    private java.lang.Boolean dataDigestSettable;

    private java.lang.Boolean targetHeaderDigestSettable;

    private java.lang.Boolean targetDataDigestSettable;

    public HostInternetScsiHbaDigestCapabilities() {
    }

    public HostInternetScsiHbaDigestCapabilities(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.Boolean headerDigestSettable,
           java.lang.Boolean dataDigestSettable,
           java.lang.Boolean targetHeaderDigestSettable,
           java.lang.Boolean targetDataDigestSettable) {
        super(
            dynamicType,
            dynamicProperty);
        this.headerDigestSettable = headerDigestSettable;
        this.dataDigestSettable = dataDigestSettable;
        this.targetHeaderDigestSettable = targetHeaderDigestSettable;
        this.targetDataDigestSettable = targetDataDigestSettable;
    }


    /**
     * Gets the headerDigestSettable value for this HostInternetScsiHbaDigestCapabilities.
     * 
     * @return headerDigestSettable
     */
    public java.lang.Boolean getHeaderDigestSettable() {
        return headerDigestSettable;
    }


    /**
     * Sets the headerDigestSettable value for this HostInternetScsiHbaDigestCapabilities.
     * 
     * @param headerDigestSettable
     */
    public void setHeaderDigestSettable(java.lang.Boolean headerDigestSettable) {
        this.headerDigestSettable = headerDigestSettable;
    }


    /**
     * Gets the dataDigestSettable value for this HostInternetScsiHbaDigestCapabilities.
     * 
     * @return dataDigestSettable
     */
    public java.lang.Boolean getDataDigestSettable() {
        return dataDigestSettable;
    }


    /**
     * Sets the dataDigestSettable value for this HostInternetScsiHbaDigestCapabilities.
     * 
     * @param dataDigestSettable
     */
    public void setDataDigestSettable(java.lang.Boolean dataDigestSettable) {
        this.dataDigestSettable = dataDigestSettable;
    }


    /**
     * Gets the targetHeaderDigestSettable value for this HostInternetScsiHbaDigestCapabilities.
     * 
     * @return targetHeaderDigestSettable
     */
    public java.lang.Boolean getTargetHeaderDigestSettable() {
        return targetHeaderDigestSettable;
    }


    /**
     * Sets the targetHeaderDigestSettable value for this HostInternetScsiHbaDigestCapabilities.
     * 
     * @param targetHeaderDigestSettable
     */
    public void setTargetHeaderDigestSettable(java.lang.Boolean targetHeaderDigestSettable) {
        this.targetHeaderDigestSettable = targetHeaderDigestSettable;
    }


    /**
     * Gets the targetDataDigestSettable value for this HostInternetScsiHbaDigestCapabilities.
     * 
     * @return targetDataDigestSettable
     */
    public java.lang.Boolean getTargetDataDigestSettable() {
        return targetDataDigestSettable;
    }


    /**
     * Sets the targetDataDigestSettable value for this HostInternetScsiHbaDigestCapabilities.
     * 
     * @param targetDataDigestSettable
     */
    public void setTargetDataDigestSettable(java.lang.Boolean targetDataDigestSettable) {
        this.targetDataDigestSettable = targetDataDigestSettable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostInternetScsiHbaDigestCapabilities)) return false;
        HostInternetScsiHbaDigestCapabilities other = (HostInternetScsiHbaDigestCapabilities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.headerDigestSettable==null && other.getHeaderDigestSettable()==null) || 
             (this.headerDigestSettable!=null &&
              this.headerDigestSettable.equals(other.getHeaderDigestSettable()))) &&
            ((this.dataDigestSettable==null && other.getDataDigestSettable()==null) || 
             (this.dataDigestSettable!=null &&
              this.dataDigestSettable.equals(other.getDataDigestSettable()))) &&
            ((this.targetHeaderDigestSettable==null && other.getTargetHeaderDigestSettable()==null) || 
             (this.targetHeaderDigestSettable!=null &&
              this.targetHeaderDigestSettable.equals(other.getTargetHeaderDigestSettable()))) &&
            ((this.targetDataDigestSettable==null && other.getTargetDataDigestSettable()==null) || 
             (this.targetDataDigestSettable!=null &&
              this.targetDataDigestSettable.equals(other.getTargetDataDigestSettable())));
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
        if (getHeaderDigestSettable() != null) {
            _hashCode += getHeaderDigestSettable().hashCode();
        }
        if (getDataDigestSettable() != null) {
            _hashCode += getDataDigestSettable().hashCode();
        }
        if (getTargetHeaderDigestSettable() != null) {
            _hashCode += getTargetHeaderDigestSettable().hashCode();
        }
        if (getTargetDataDigestSettable() != null) {
            _hashCode += getTargetDataDigestSettable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostInternetScsiHbaDigestCapabilities.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostInternetScsiHbaDigestCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerDigestSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "headerDigestSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDigestSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dataDigestSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetHeaderDigestSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "targetHeaderDigestSettable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetDataDigestSettable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "targetDataDigestSettable"));
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
