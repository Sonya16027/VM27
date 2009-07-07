/**
 * TaskScheduler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class TaskScheduler  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.util.Calendar activeTime;

    private java.util.Calendar expireTime;

    public TaskScheduler() {
    }

    public TaskScheduler(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.util.Calendar activeTime,
           java.util.Calendar expireTime) {
        super(
            dynamicType,
            dynamicProperty);
        this.activeTime = activeTime;
        this.expireTime = expireTime;
    }


    /**
     * Gets the activeTime value for this TaskScheduler.
     * 
     * @return activeTime
     */
    public java.util.Calendar getActiveTime() {
        return activeTime;
    }


    /**
     * Sets the activeTime value for this TaskScheduler.
     * 
     * @param activeTime
     */
    public void setActiveTime(java.util.Calendar activeTime) {
        this.activeTime = activeTime;
    }


    /**
     * Gets the expireTime value for this TaskScheduler.
     * 
     * @return expireTime
     */
    public java.util.Calendar getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this TaskScheduler.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.util.Calendar expireTime) {
        this.expireTime = expireTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskScheduler)) return false;
        TaskScheduler other = (TaskScheduler) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.activeTime==null && other.getActiveTime()==null) || 
             (this.activeTime!=null &&
              this.activeTime.equals(other.getActiveTime()))) &&
            ((this.expireTime==null && other.getExpireTime()==null) || 
             (this.expireTime!=null &&
              this.expireTime.equals(other.getExpireTime())));
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
        if (getActiveTime() != null) {
            _hashCode += getActiveTime().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaskScheduler.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "TaskScheduler"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "activeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "expireTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
