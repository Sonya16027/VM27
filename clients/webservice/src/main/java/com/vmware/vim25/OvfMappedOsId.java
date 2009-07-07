/**
 * OvfMappedOsId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class OvfMappedOsId  extends com.vmware.vim25.OvfImport  implements java.io.Serializable {
    private int ovfId;

    private java.lang.String ovfDescription;

    private java.lang.String targetDescription;

    public OvfMappedOsId() {
    }

    public OvfMappedOsId(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.LocalizedMethodFault faultCause,
           com.vmware.vim25.LocalizableMessage[] faultMessage,
           int ovfId,
           java.lang.String ovfDescription,
           java.lang.String targetDescription) {
        super(
            dynamicType,
            dynamicProperty,
            faultCause,
            faultMessage);
        this.ovfId = ovfId;
        this.ovfDescription = ovfDescription;
        this.targetDescription = targetDescription;
    }


    /**
     * Gets the ovfId value for this OvfMappedOsId.
     * 
     * @return ovfId
     */
    public int getOvfId() {
        return ovfId;
    }


    /**
     * Sets the ovfId value for this OvfMappedOsId.
     * 
     * @param ovfId
     */
    public void setOvfId(int ovfId) {
        this.ovfId = ovfId;
    }


    /**
     * Gets the ovfDescription value for this OvfMappedOsId.
     * 
     * @return ovfDescription
     */
    public java.lang.String getOvfDescription() {
        return ovfDescription;
    }


    /**
     * Sets the ovfDescription value for this OvfMappedOsId.
     * 
     * @param ovfDescription
     */
    public void setOvfDescription(java.lang.String ovfDescription) {
        this.ovfDescription = ovfDescription;
    }


    /**
     * Gets the targetDescription value for this OvfMappedOsId.
     * 
     * @return targetDescription
     */
    public java.lang.String getTargetDescription() {
        return targetDescription;
    }


    /**
     * Sets the targetDescription value for this OvfMappedOsId.
     * 
     * @param targetDescription
     */
    public void setTargetDescription(java.lang.String targetDescription) {
        this.targetDescription = targetDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfMappedOsId)) return false;
        OvfMappedOsId other = (OvfMappedOsId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.ovfId == other.getOvfId() &&
            ((this.ovfDescription==null && other.getOvfDescription()==null) || 
             (this.ovfDescription!=null &&
              this.ovfDescription.equals(other.getOvfDescription()))) &&
            ((this.targetDescription==null && other.getTargetDescription()==null) || 
             (this.targetDescription!=null &&
              this.targetDescription.equals(other.getTargetDescription())));
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
        _hashCode += getOvfId();
        if (getOvfDescription() != null) {
            _hashCode += getOvfDescription().hashCode();
        }
        if (getTargetDescription() != null) {
            _hashCode += getTargetDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OvfMappedOsId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfMappedOsId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovfId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ovfId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ovfDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ovfDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "targetDescription"));
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
