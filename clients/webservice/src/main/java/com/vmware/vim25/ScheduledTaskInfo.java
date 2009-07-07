/**
 * ScheduledTaskInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ScheduledTaskInfo  extends com.vmware.vim25.ScheduledTaskSpec  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference scheduledTask;

    private com.vmware.vim25.ManagedObjectReference entity;

    private java.util.Calendar lastModifiedTime;

    private java.lang.String lastModifiedUser;

    private java.util.Calendar nextRunTime;

    private java.util.Calendar prevRunTime;

    private com.vmware.vim25.TaskInfoState state;

    private com.vmware.vim25.LocalizedMethodFault error;

    private java.lang.Object result;

    private java.lang.Integer progress;

    private com.vmware.vim25.ManagedObjectReference activeTask;

    private com.vmware.vim25.ManagedObjectReference taskObject;

    public ScheduledTaskInfo() {
    }

    public ScheduledTaskInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String name,
           java.lang.String description,
           boolean enabled,
           com.vmware.vim25.TaskScheduler scheduler,
           com.vmware.vim25.Action action,
           java.lang.String notification,
           com.vmware.vim25.ManagedObjectReference scheduledTask,
           com.vmware.vim25.ManagedObjectReference entity,
           java.util.Calendar lastModifiedTime,
           java.lang.String lastModifiedUser,
           java.util.Calendar nextRunTime,
           java.util.Calendar prevRunTime,
           com.vmware.vim25.TaskInfoState state,
           com.vmware.vim25.LocalizedMethodFault error,
           java.lang.Object result,
           java.lang.Integer progress,
           com.vmware.vim25.ManagedObjectReference activeTask,
           com.vmware.vim25.ManagedObjectReference taskObject) {
        super(
            dynamicType,
            dynamicProperty,
            name,
            description,
            enabled,
            scheduler,
            action,
            notification);
        this.scheduledTask = scheduledTask;
        this.entity = entity;
        this.lastModifiedTime = lastModifiedTime;
        this.lastModifiedUser = lastModifiedUser;
        this.nextRunTime = nextRunTime;
        this.prevRunTime = prevRunTime;
        this.state = state;
        this.error = error;
        this.result = result;
        this.progress = progress;
        this.activeTask = activeTask;
        this.taskObject = taskObject;
    }


    /**
     * Gets the scheduledTask value for this ScheduledTaskInfo.
     * 
     * @return scheduledTask
     */
    public com.vmware.vim25.ManagedObjectReference getScheduledTask() {
        return scheduledTask;
    }


    /**
     * Sets the scheduledTask value for this ScheduledTaskInfo.
     * 
     * @param scheduledTask
     */
    public void setScheduledTask(com.vmware.vim25.ManagedObjectReference scheduledTask) {
        this.scheduledTask = scheduledTask;
    }


    /**
     * Gets the entity value for this ScheduledTaskInfo.
     * 
     * @return entity
     */
    public com.vmware.vim25.ManagedObjectReference getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this ScheduledTaskInfo.
     * 
     * @param entity
     */
    public void setEntity(com.vmware.vim25.ManagedObjectReference entity) {
        this.entity = entity;
    }


    /**
     * Gets the lastModifiedTime value for this ScheduledTaskInfo.
     * 
     * @return lastModifiedTime
     */
    public java.util.Calendar getLastModifiedTime() {
        return lastModifiedTime;
    }


    /**
     * Sets the lastModifiedTime value for this ScheduledTaskInfo.
     * 
     * @param lastModifiedTime
     */
    public void setLastModifiedTime(java.util.Calendar lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }


    /**
     * Gets the lastModifiedUser value for this ScheduledTaskInfo.
     * 
     * @return lastModifiedUser
     */
    public java.lang.String getLastModifiedUser() {
        return lastModifiedUser;
    }


    /**
     * Sets the lastModifiedUser value for this ScheduledTaskInfo.
     * 
     * @param lastModifiedUser
     */
    public void setLastModifiedUser(java.lang.String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }


    /**
     * Gets the nextRunTime value for this ScheduledTaskInfo.
     * 
     * @return nextRunTime
     */
    public java.util.Calendar getNextRunTime() {
        return nextRunTime;
    }


    /**
     * Sets the nextRunTime value for this ScheduledTaskInfo.
     * 
     * @param nextRunTime
     */
    public void setNextRunTime(java.util.Calendar nextRunTime) {
        this.nextRunTime = nextRunTime;
    }


    /**
     * Gets the prevRunTime value for this ScheduledTaskInfo.
     * 
     * @return prevRunTime
     */
    public java.util.Calendar getPrevRunTime() {
        return prevRunTime;
    }


    /**
     * Sets the prevRunTime value for this ScheduledTaskInfo.
     * 
     * @param prevRunTime
     */
    public void setPrevRunTime(java.util.Calendar prevRunTime) {
        this.prevRunTime = prevRunTime;
    }


    /**
     * Gets the state value for this ScheduledTaskInfo.
     * 
     * @return state
     */
    public com.vmware.vim25.TaskInfoState getState() {
        return state;
    }


    /**
     * Sets the state value for this ScheduledTaskInfo.
     * 
     * @param state
     */
    public void setState(com.vmware.vim25.TaskInfoState state) {
        this.state = state;
    }


    /**
     * Gets the error value for this ScheduledTaskInfo.
     * 
     * @return error
     */
    public com.vmware.vim25.LocalizedMethodFault getError() {
        return error;
    }


    /**
     * Sets the error value for this ScheduledTaskInfo.
     * 
     * @param error
     */
    public void setError(com.vmware.vim25.LocalizedMethodFault error) {
        this.error = error;
    }


    /**
     * Gets the result value for this ScheduledTaskInfo.
     * 
     * @return result
     */
    public java.lang.Object getResult() {
        return result;
    }


    /**
     * Sets the result value for this ScheduledTaskInfo.
     * 
     * @param result
     */
    public void setResult(java.lang.Object result) {
        this.result = result;
    }


    /**
     * Gets the progress value for this ScheduledTaskInfo.
     * 
     * @return progress
     */
    public java.lang.Integer getProgress() {
        return progress;
    }


    /**
     * Sets the progress value for this ScheduledTaskInfo.
     * 
     * @param progress
     */
    public void setProgress(java.lang.Integer progress) {
        this.progress = progress;
    }


    /**
     * Gets the activeTask value for this ScheduledTaskInfo.
     * 
     * @return activeTask
     */
    public com.vmware.vim25.ManagedObjectReference getActiveTask() {
        return activeTask;
    }


    /**
     * Sets the activeTask value for this ScheduledTaskInfo.
     * 
     * @param activeTask
     */
    public void setActiveTask(com.vmware.vim25.ManagedObjectReference activeTask) {
        this.activeTask = activeTask;
    }


    /**
     * Gets the taskObject value for this ScheduledTaskInfo.
     * 
     * @return taskObject
     */
    public com.vmware.vim25.ManagedObjectReference getTaskObject() {
        return taskObject;
    }


    /**
     * Sets the taskObject value for this ScheduledTaskInfo.
     * 
     * @param taskObject
     */
    public void setTaskObject(com.vmware.vim25.ManagedObjectReference taskObject) {
        this.taskObject = taskObject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduledTaskInfo)) return false;
        ScheduledTaskInfo other = (ScheduledTaskInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.scheduledTask==null && other.getScheduledTask()==null) || 
             (this.scheduledTask!=null &&
              this.scheduledTask.equals(other.getScheduledTask()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.lastModifiedTime==null && other.getLastModifiedTime()==null) || 
             (this.lastModifiedTime!=null &&
              this.lastModifiedTime.equals(other.getLastModifiedTime()))) &&
            ((this.lastModifiedUser==null && other.getLastModifiedUser()==null) || 
             (this.lastModifiedUser!=null &&
              this.lastModifiedUser.equals(other.getLastModifiedUser()))) &&
            ((this.nextRunTime==null && other.getNextRunTime()==null) || 
             (this.nextRunTime!=null &&
              this.nextRunTime.equals(other.getNextRunTime()))) &&
            ((this.prevRunTime==null && other.getPrevRunTime()==null) || 
             (this.prevRunTime!=null &&
              this.prevRunTime.equals(other.getPrevRunTime()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.progress==null && other.getProgress()==null) || 
             (this.progress!=null &&
              this.progress.equals(other.getProgress()))) &&
            ((this.activeTask==null && other.getActiveTask()==null) || 
             (this.activeTask!=null &&
              this.activeTask.equals(other.getActiveTask()))) &&
            ((this.taskObject==null && other.getTaskObject()==null) || 
             (this.taskObject!=null &&
              this.taskObject.equals(other.getTaskObject())));
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
        if (getScheduledTask() != null) {
            _hashCode += getScheduledTask().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getLastModifiedTime() != null) {
            _hashCode += getLastModifiedTime().hashCode();
        }
        if (getLastModifiedUser() != null) {
            _hashCode += getLastModifiedUser().hashCode();
        }
        if (getNextRunTime() != null) {
            _hashCode += getNextRunTime().hashCode();
        }
        if (getPrevRunTime() != null) {
            _hashCode += getPrevRunTime().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getProgress() != null) {
            _hashCode += getProgress().hashCode();
        }
        if (getActiveTask() != null) {
            _hashCode += getActiveTask().hashCode();
        }
        if (getTaskObject() != null) {
            _hashCode += getTaskObject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduledTaskInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ScheduledTaskInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scheduledTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lastModifiedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lastModifiedUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextRunTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nextRunTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevRunTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "prevRunTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "TaskInfoState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "progress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "activeTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskObject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "taskObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
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
