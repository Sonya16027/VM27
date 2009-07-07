/**
 * TaskFilterSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class TaskFilterSpec  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.TaskFilterSpecByEntity entity;

    private com.vmware.vim.TaskFilterSpecByTime time;

    private com.vmware.vim.TaskFilterSpecByUsername userName;

    private com.vmware.vim.TaskInfoState[] state;

    private com.vmware.vim.ManagedObjectReference alarm;

    private com.vmware.vim.ManagedObjectReference scheduledTask;

    public TaskFilterSpec() {
    }

    public TaskFilterSpec(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           com.vmware.vim.TaskFilterSpecByEntity entity,
           com.vmware.vim.TaskFilterSpecByTime time,
           com.vmware.vim.TaskFilterSpecByUsername userName,
           com.vmware.vim.TaskInfoState[] state,
           com.vmware.vim.ManagedObjectReference alarm,
           com.vmware.vim.ManagedObjectReference scheduledTask) {
        super(
            dynamicType,
            dynamicProperty);
        this.entity = entity;
        this.time = time;
        this.userName = userName;
        this.state = state;
        this.alarm = alarm;
        this.scheduledTask = scheduledTask;
    }


    /**
     * Gets the entity value for this TaskFilterSpec.
     * 
     * @return entity
     */
    public com.vmware.vim.TaskFilterSpecByEntity getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this TaskFilterSpec.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.vim.TaskFilterSpecByEntity entity) {
        this.entity = entity;
    }


    /**
     * Gets the time value for this TaskFilterSpec.
     * 
     * @return time
     */
    public com.vmware.vim.TaskFilterSpecByTime getTime() {
        return time;
    }


    /**
     * Sets the time value for this TaskFilterSpec.
     * 
     * @param time
     */
    public void setTime(com.vmware.vim.TaskFilterSpecByTime time) {
        this.time = time;
    }


    /**
     * Gets the userName value for this TaskFilterSpec.
     * 
     * @return userName
     */
    public com.vmware.vim.TaskFilterSpecByUsername getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this TaskFilterSpec.
     * 
     * @param userName
     */
    public void setUserName(com.vmware.vim.TaskFilterSpecByUsername userName) {
        this.userName = userName;
    }


    /**
     * Gets the state value for this TaskFilterSpec.
     * 
     * @return state
     */
    public com.vmware.vim.TaskInfoState[] getState() {
        return state;
    }


    /**
     * Sets the state value for this TaskFilterSpec.
     * 
     * @param state
     */
    public void setState(com.vmware.vim.TaskInfoState[] state) {
        this.state = state;
    }

    public com.vmware.vim.TaskInfoState getState(int i) {
        return this.state[i];
    }

    public void setState(int i, com.vmware.vim.TaskInfoState _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the alarm value for this TaskFilterSpec.
     * 
     * @return alarm
     */
    public com.vmware.vim.ManagedObjectReference getAlarm() {
        return alarm;
    }


    /**
     * Sets the alarm value for this TaskFilterSpec.
     * 
     * @param alarm
     */
    public void setAlarm(com.vmware.vim.ManagedObjectReference alarm) {
        this.alarm = alarm;
    }


    /**
     * Gets the scheduledTask value for this TaskFilterSpec.
     * 
     * @return scheduledTask
     */
    public com.vmware.vim.ManagedObjectReference getScheduledTask() {
        return scheduledTask;
    }


    /**
     * Sets the scheduledTask value for this TaskFilterSpec.
     * 
     * @param scheduledTask
     */
    public void setScheduledTask(com.vmware.vim.ManagedObjectReference scheduledTask) {
        this.scheduledTask = scheduledTask;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskFilterSpec)) return false;
        TaskFilterSpec other = (TaskFilterSpec) obj;
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
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.alarm==null && other.getAlarm()==null) || 
             (this.alarm!=null &&
              this.alarm.equals(other.getAlarm()))) &&
            ((this.scheduledTask==null && other.getScheduledTask()==null) || 
             (this.scheduledTask!=null &&
              this.scheduledTask.equals(other.getScheduledTask())));
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
        if (getState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlarm() != null) {
            _hashCode += getAlarm().hashCode();
        }
        if (getScheduledTask() != null) {
            _hashCode += getScheduledTask().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskFilterSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "TaskFilterSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "TaskFilterSpecByEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "TaskFilterSpecByTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "TaskFilterSpecByUsername"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "TaskInfoState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
