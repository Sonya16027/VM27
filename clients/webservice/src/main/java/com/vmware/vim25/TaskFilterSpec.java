/**
 * TaskFilterSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class TaskFilterSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.TaskFilterSpecByEntity entity;

    private com.vmware.vim25.TaskFilterSpecByTime time;

    private com.vmware.vim25.TaskFilterSpecByUsername userName;

    private com.vmware.vim25.TaskInfoState[] state;

    private com.vmware.vim25.ManagedObjectReference alarm;

    private com.vmware.vim25.ManagedObjectReference scheduledTask;

    private int[] eventChainId;

    private java.lang.String[] tag;

    private java.lang.String[] parentTaskKey;

    private java.lang.String[] rootTaskKey;

    public TaskFilterSpec() {
    }

    public TaskFilterSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.TaskFilterSpecByEntity entity,
           com.vmware.vim25.TaskFilterSpecByTime time,
           com.vmware.vim25.TaskFilterSpecByUsername userName,
           com.vmware.vim25.TaskInfoState[] state,
           com.vmware.vim25.ManagedObjectReference alarm,
           com.vmware.vim25.ManagedObjectReference scheduledTask,
           int[] eventChainId,
           java.lang.String[] tag,
           java.lang.String[] parentTaskKey,
           java.lang.String[] rootTaskKey) {
        super(
            dynamicType,
            dynamicProperty);
        this.entity = entity;
        this.time = time;
        this.userName = userName;
        this.state = state;
        this.alarm = alarm;
        this.scheduledTask = scheduledTask;
        this.eventChainId = eventChainId;
        this.tag = tag;
        this.parentTaskKey = parentTaskKey;
        this.rootTaskKey = rootTaskKey;
    }


    /**
     * Gets the entity value for this TaskFilterSpec.
     * 
     * @return entity
     */
    public com.vmware.vim25.TaskFilterSpecByEntity getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this TaskFilterSpec.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.vim25.TaskFilterSpecByEntity entity) {
        this.entity = entity;
    }


    /**
     * Gets the time value for this TaskFilterSpec.
     * 
     * @return time
     */
    public com.vmware.vim25.TaskFilterSpecByTime getTime() {
        return time;
    }


    /**
     * Sets the time value for this TaskFilterSpec.
     * 
     * @param time
     */
    public void setTime(com.vmware.vim25.TaskFilterSpecByTime time) {
        this.time = time;
    }


    /**
     * Gets the userName value for this TaskFilterSpec.
     * 
     * @return userName
     */
    public com.vmware.vim25.TaskFilterSpecByUsername getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this TaskFilterSpec.
     * 
     * @param userName
     */
    public void setUserName(com.vmware.vim25.TaskFilterSpecByUsername userName) {
        this.userName = userName;
    }


    /**
     * Gets the state value for this TaskFilterSpec.
     * 
     * @return state
     */
    public com.vmware.vim25.TaskInfoState[] getState() {
        return state;
    }


    /**
     * Sets the state value for this TaskFilterSpec.
     * 
     * @param state
     */
    public void setState(com.vmware.vim25.TaskInfoState[] state) {
        this.state = state;
    }

    public com.vmware.vim25.TaskInfoState getState(int i) {
        return this.state[i];
    }

    public void setState(int i, com.vmware.vim25.TaskInfoState _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the alarm value for this TaskFilterSpec.
     * 
     * @return alarm
     */
    public com.vmware.vim25.ManagedObjectReference getAlarm() {
        return alarm;
    }


    /**
     * Sets the alarm value for this TaskFilterSpec.
     * 
     * @param alarm
     */
    public void setAlarm(com.vmware.vim25.ManagedObjectReference alarm) {
        this.alarm = alarm;
    }


    /**
     * Gets the scheduledTask value for this TaskFilterSpec.
     * 
     * @return scheduledTask
     */
    public com.vmware.vim25.ManagedObjectReference getScheduledTask() {
        return scheduledTask;
    }


    /**
     * Sets the scheduledTask value for this TaskFilterSpec.
     * 
     * @param scheduledTask
     */
    public void setScheduledTask(com.vmware.vim25.ManagedObjectReference scheduledTask) {
        this.scheduledTask = scheduledTask;
    }


    /**
     * Gets the eventChainId value for this TaskFilterSpec.
     * 
     * @return eventChainId
     */
    public int[] getEventChainId() {
        return eventChainId;
    }


    /**
     * Sets the eventChainId value for this TaskFilterSpec.
     * 
     * @param eventChainId
     */
    public void setEventChainId(int[] eventChainId) {
        this.eventChainId = eventChainId;
    }

    public int getEventChainId(int i) {
        return this.eventChainId[i];
    }

    public void setEventChainId(int i, int _value) {
        this.eventChainId[i] = _value;
    }


    /**
     * Gets the tag value for this TaskFilterSpec.
     * 
     * @return tag
     */
    public java.lang.String[] getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this TaskFilterSpec.
     * 
     * @param tag
     */
    public void setTag(java.lang.String[] tag) {
        this.tag = tag;
    }

    public java.lang.String getTag(int i) {
        return this.tag[i];
    }

    public void setTag(int i, java.lang.String _value) {
        this.tag[i] = _value;
    }


    /**
     * Gets the parentTaskKey value for this TaskFilterSpec.
     * 
     * @return parentTaskKey
     */
    public java.lang.String[] getParentTaskKey() {
        return parentTaskKey;
    }


    /**
     * Sets the parentTaskKey value for this TaskFilterSpec.
     * 
     * @param parentTaskKey
     */
    public void setParentTaskKey(java.lang.String[] parentTaskKey) {
        this.parentTaskKey = parentTaskKey;
    }

    public java.lang.String getParentTaskKey(int i) {
        return this.parentTaskKey[i];
    }

    public void setParentTaskKey(int i, java.lang.String _value) {
        this.parentTaskKey[i] = _value;
    }


    /**
     * Gets the rootTaskKey value for this TaskFilterSpec.
     * 
     * @return rootTaskKey
     */
    public java.lang.String[] getRootTaskKey() {
        return rootTaskKey;
    }


    /**
     * Sets the rootTaskKey value for this TaskFilterSpec.
     * 
     * @param rootTaskKey
     */
    public void setRootTaskKey(java.lang.String[] rootTaskKey) {
        this.rootTaskKey = rootTaskKey;
    }

    public java.lang.String getRootTaskKey(int i) {
        return this.rootTaskKey[i];
    }

    public void setRootTaskKey(int i, java.lang.String _value) {
        this.rootTaskKey[i] = _value;
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
              this.scheduledTask.equals(other.getScheduledTask()))) &&
            ((this.eventChainId==null && other.getEventChainId()==null) || 
             (this.eventChainId!=null &&
              java.util.Arrays.equals(this.eventChainId, other.getEventChainId()))) &&
            ((this.tag==null && other.getTag()==null) || 
             (this.tag!=null &&
              java.util.Arrays.equals(this.tag, other.getTag()))) &&
            ((this.parentTaskKey==null && other.getParentTaskKey()==null) || 
             (this.parentTaskKey!=null &&
              java.util.Arrays.equals(this.parentTaskKey, other.getParentTaskKey()))) &&
            ((this.rootTaskKey==null && other.getRootTaskKey()==null) || 
             (this.rootTaskKey!=null &&
              java.util.Arrays.equals(this.rootTaskKey, other.getRootTaskKey())));
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
        if (getEventChainId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEventChainId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEventChainId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParentTaskKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParentTaskKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParentTaskKey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRootTaskKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRootTaskKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRootTaskKey(), i);
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
        new org.apache.axis.description.TypeDesc(TaskFilterSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "TaskFilterSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "TaskFilterSpecByEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "TaskFilterSpecByTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "TaskFilterSpecByUsername"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "TaskInfoState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alarm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "alarm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scheduledTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventChainId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eventChainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentTaskKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parentTaskKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootTaskKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rootTaskKey"));
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
