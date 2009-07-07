/**
 * EventAlarmExpression.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class EventAlarmExpression  extends com.vmware.vim25.AlarmExpression  implements java.io.Serializable {
    private com.vmware.vim25.EventAlarmExpressionComparison[] comparisons;

    private java.lang.String eventType;

    private java.lang.String eventTypeId;

    private java.lang.String objectType;

    private com.vmware.vim25.ManagedEntityStatus status;

    public EventAlarmExpression() {
    }

    public EventAlarmExpression(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.EventAlarmExpressionComparison[] comparisons,
           java.lang.String eventType,
           java.lang.String eventTypeId,
           java.lang.String objectType,
           com.vmware.vim25.ManagedEntityStatus status) {
        super(
            dynamicType,
            dynamicProperty);
        this.comparisons = comparisons;
        this.eventType = eventType;
        this.eventTypeId = eventTypeId;
        this.objectType = objectType;
        this.status = status;
    }


    /**
     * Gets the comparisons value for this EventAlarmExpression.
     * 
     * @return comparisons
     */
    public com.vmware.vim25.EventAlarmExpressionComparison[] getComparisons() {
        return comparisons;
    }


    /**
     * Sets the comparisons value for this EventAlarmExpression.
     * 
     * @param comparisons
     */
    public void setComparisons(com.vmware.vim25.EventAlarmExpressionComparison[] comparisons) {
        this.comparisons = comparisons;
    }

    public com.vmware.vim25.EventAlarmExpressionComparison getComparisons(int i) {
        return this.comparisons[i];
    }

    public void setComparisons(int i, com.vmware.vim25.EventAlarmExpressionComparison _value) {
        this.comparisons[i] = _value;
    }


    /**
     * Gets the eventType value for this EventAlarmExpression.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this EventAlarmExpression.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the eventTypeId value for this EventAlarmExpression.
     * 
     * @return eventTypeId
     */
    public java.lang.String getEventTypeId() {
        return eventTypeId;
    }


    /**
     * Sets the eventTypeId value for this EventAlarmExpression.
     * 
     * @param eventTypeId
     */
    public void setEventTypeId(java.lang.String eventTypeId) {
        this.eventTypeId = eventTypeId;
    }


    /**
     * Gets the objectType value for this EventAlarmExpression.
     * 
     * @return objectType
     */
    public java.lang.String getObjectType() {
        return objectType;
    }


    /**
     * Sets the objectType value for this EventAlarmExpression.
     * 
     * @param objectType
     */
    public void setObjectType(java.lang.String objectType) {
        this.objectType = objectType;
    }


    /**
     * Gets the status value for this EventAlarmExpression.
     * 
     * @return status
     */
    public com.vmware.vim25.ManagedEntityStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this EventAlarmExpression.
     * 
     * @param status
     */
    public void setStatus(com.vmware.vim25.ManagedEntityStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventAlarmExpression)) return false;
        EventAlarmExpression other = (EventAlarmExpression) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.comparisons==null && other.getComparisons()==null) || 
             (this.comparisons!=null &&
              java.util.Arrays.equals(this.comparisons, other.getComparisons()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.eventTypeId==null && other.getEventTypeId()==null) || 
             (this.eventTypeId!=null &&
              this.eventTypeId.equals(other.getEventTypeId()))) &&
            ((this.objectType==null && other.getObjectType()==null) || 
             (this.objectType!=null &&
              this.objectType.equals(other.getObjectType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getComparisons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComparisons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComparisons(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getEventTypeId() != null) {
            _hashCode += getEventTypeId().hashCode();
        }
        if (getObjectType() != null) {
            _hashCode += getObjectType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventAlarmExpression.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EventAlarmExpression"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comparisons");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "comparisons"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EventAlarmExpressionComparison"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eventTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "objectType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedEntityStatus"));
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
