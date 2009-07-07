/**
 * EventFilterSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class EventFilterSpec  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.EventFilterSpecByEntity entity;

    private com.vmware.vim.EventFilterSpecByTime time;

    private com.vmware.vim.EventFilterSpecByUsername userName;

    private java.lang.Integer eventChainId;

    private com.vmware.vim.ManagedObjectReference alarm;

    private com.vmware.vim.ManagedObjectReference scheduledTask;

    private java.lang.Boolean disableFullMessage;

    private java.lang.String[] category;

    private java.lang.String[] type;

    public EventFilterSpec() {
    }

    public EventFilterSpec(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           com.vmware.vim.EventFilterSpecByEntity entity,
           com.vmware.vim.EventFilterSpecByTime time,
           com.vmware.vim.EventFilterSpecByUsername userName,
           java.lang.Integer eventChainId,
           com.vmware.vim.ManagedObjectReference alarm,
           com.vmware.vim.ManagedObjectReference scheduledTask,
           java.lang.Boolean disableFullMessage,
           java.lang.String[] category,
           java.lang.String[] type) {
        super(
            dynamicType,
            dynamicProperty);
        this.entity = entity;
        this.time = time;
        this.userName = userName;
        this.eventChainId = eventChainId;
        this.alarm = alarm;
        this.scheduledTask = scheduledTask;
        this.disableFullMessage = disableFullMessage;
        this.category = category;
        this.type = type;
    }


    /**
     * Gets the entity value for this EventFilterSpec.
     * 
     * @return entity
     */
    public com.vmware.vim.EventFilterSpecByEntity getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this EventFilterSpec.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.vim.EventFilterSpecByEntity entity) {
        this.entity = entity;
    }


    /**
     * Gets the time value for this EventFilterSpec.
     * 
     * @return time
     */
    public com.vmware.vim.EventFilterSpecByTime getTime() {
        return time;
    }


    /**
     * Sets the time value for this EventFilterSpec.
     * 
     * @param time
     */
    public void setTime(com.vmware.vim.EventFilterSpecByTime time) {
        this.time = time;
    }


    /**
     * Gets the userName value for this EventFilterSpec.
     * 
     * @return userName
     */
    public com.vmware.vim.EventFilterSpecByUsername getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this EventFilterSpec.
     * 
     * @param userName
     */
    public void setUserName(com.vmware.vim.EventFilterSpecByUsername userName) {
        this.userName = userName;
    }


    /**
     * Gets the eventChainId value for this EventFilterSpec.
     * 
     * @return eventChainId
     */
    public java.lang.Integer getEventChainId() {
        return eventChainId;
    }


    /**
     * Sets the eventChainId value for this EventFilterSpec.
     * 
     * @param eventChainId
     */
    public void setEventChainId(java.lang.Integer eventChainId) {
        this.eventChainId = eventChainId;
    }


    /**
     * Gets the alarm value for this EventFilterSpec.
     * 
     * @return alarm
     */
    public com.vmware.vim.ManagedObjectReference getAlarm() {
        return alarm;
    }


    /**
     * Sets the alarm value for this EventFilterSpec.
     * 
     * @param alarm
     */
    public void setAlarm(com.vmware.vim.ManagedObjectReference alarm) {
        this.alarm = alarm;
    }


    /**
     * Gets the scheduledTask value for this EventFilterSpec.
     * 
     * @return scheduledTask
     */
    public com.vmware.vim.ManagedObjectReference getScheduledTask() {
        return scheduledTask;
    }


    /**
     * Sets the scheduledTask value for this EventFilterSpec.
     * 
     * @param scheduledTask
     */
    public void setScheduledTask(com.vmware.vim.ManagedObjectReference scheduledTask) {
        this.scheduledTask = scheduledTask;
    }


    /**
     * Gets the disableFullMessage value for this EventFilterSpec.
     * 
     * @return disableFullMessage
     */
    public java.lang.Boolean getDisableFullMessage() {
        return disableFullMessage;
    }


    /**
     * Sets the disableFullMessage value for this EventFilterSpec.
     * 
     * @param disableFullMessage
     */
    public void setDisableFullMessage(java.lang.Boolean disableFullMessage) {
        this.disableFullMessage = disableFullMessage;
    }


    /**
     * Gets the category value for this EventFilterSpec.
     * 
     * @return category
     */
    public java.lang.String[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this EventFilterSpec.
     * 
     * @param category
     */
    public void setCategory(java.lang.String[] category) {
        this.category = category;
    }

    public java.lang.String getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, java.lang.String _value) {
        this.category[i] = _value;
    }


    /**
     * Gets the type value for this EventFilterSpec.
     * 
     * @return type
     */
    public java.lang.String[] getType() {
        return type;
    }


    /**
     * Sets the type value for this EventFilterSpec.
     * 
     * @param type
     */
    public void setType(java.lang.String[] type) {
        this.type = type;
    }

    public java.lang.String getType(int i) {
        return this.type[i];
    }

    public void setType(int i, java.lang.String _value) {
        this.type[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventFilterSpec)) return false;
        EventFilterSpec other = (EventFilterSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.eventChainId==null && other.getEventChainId()==null) || 
             (this.eventChainId!=null &&
              this.eventChainId.equals(other.getEventChainId()))) &&
            ((this.alarm==null && other.getAlarm()==null) || 
             (this.alarm!=null &&
              this.alarm.equals(other.getAlarm()))) &&
            ((this.scheduledTask==null && other.getScheduledTask()==null) || 
             (this.scheduledTask!=null &&
              this.scheduledTask.equals(other.getScheduledTask()))) &&
            ((this.disableFullMessage==null && other.getDisableFullMessage()==null) || 
             (this.disableFullMessage!=null &&
              this.disableFullMessage.equals(other.getDisableFullMessage()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType())));
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
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getEventChainId() != null) {
            _hashCode += getEventChainId().hashCode();
        }
        if (getAlarm() != null) {
            _hashCode += getAlarm().hashCode();
        }
        if (getScheduledTask() != null) {
            _hashCode += getScheduledTask().hashCode();
        }
        if (getDisableFullMessage() != null) {
            _hashCode += getDisableFullMessage().hashCode();
        }
        if (getCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
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
        new org.apache.axis.description.TypeDesc(EventFilterSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "EventFilterSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "EventFilterSpecByEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "EventFilterSpecByTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "EventFilterSpecByUsername"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventChainId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "eventChainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "alarm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "scheduledTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableFullMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "disableFullMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
