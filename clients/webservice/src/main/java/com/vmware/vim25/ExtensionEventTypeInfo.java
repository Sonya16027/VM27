/**
 * ExtensionEventTypeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ExtensionEventTypeInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String eventID;

    private java.lang.String eventTypeSchema;

    public ExtensionEventTypeInfo() {
    }

    public ExtensionEventTypeInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String eventID,
           java.lang.String eventTypeSchema) {
        super(
            dynamicType,
            dynamicProperty);
        this.eventID = eventID;
        this.eventTypeSchema = eventTypeSchema;
    }


    /**
     * Gets the eventID value for this ExtensionEventTypeInfo.
     * 
     * @return eventID
     */
    public java.lang.String getEventID() {
        return eventID;
    }


    /**
     * Sets the eventID value for this ExtensionEventTypeInfo.
     * 
     * @param eventID
     */
    public void setEventID(java.lang.String eventID) {
        this.eventID = eventID;
    }


    /**
     * Gets the eventTypeSchema value for this ExtensionEventTypeInfo.
     * 
     * @return eventTypeSchema
     */
    public java.lang.String getEventTypeSchema() {
        return eventTypeSchema;
    }


    /**
     * Sets the eventTypeSchema value for this ExtensionEventTypeInfo.
     * 
     * @param eventTypeSchema
     */
    public void setEventTypeSchema(java.lang.String eventTypeSchema) {
        this.eventTypeSchema = eventTypeSchema;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExtensionEventTypeInfo)) return false;
        ExtensionEventTypeInfo other = (ExtensionEventTypeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eventID==null && other.getEventID()==null) || 
             (this.eventID!=null &&
              this.eventID.equals(other.getEventID()))) &&
            ((this.eventTypeSchema==null && other.getEventTypeSchema()==null) || 
             (this.eventTypeSchema!=null &&
              this.eventTypeSchema.equals(other.getEventTypeSchema())));
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
        if (getEventID() != null) {
            _hashCode += getEventID().hashCode();
        }
        if (getEventTypeSchema() != null) {
            _hashCode += getEventTypeSchema().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExtensionEventTypeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ExtensionEventTypeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eventID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eventTypeSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
