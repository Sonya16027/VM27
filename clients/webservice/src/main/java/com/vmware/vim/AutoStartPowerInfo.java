/**
 * AutoStartPowerInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class AutoStartPowerInfo  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.ManagedObjectReference key;

    private int startOrder;

    private int startDelay;

    private com.vmware.vim.AutoStartWaitHeartbeatSetting waitForHeartbeat;

    private java.lang.String startAction;

    private int stopDelay;

    private java.lang.String stopAction;

    public AutoStartPowerInfo() {
    }

    public AutoStartPowerInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           com.vmware.vim.ManagedObjectReference key,
           int startOrder,
           int startDelay,
           com.vmware.vim.AutoStartWaitHeartbeatSetting waitForHeartbeat,
           java.lang.String startAction,
           int stopDelay,
           java.lang.String stopAction) {
        super(
            dynamicType,
            dynamicProperty);
        this.key = key;
        this.startOrder = startOrder;
        this.startDelay = startDelay;
        this.waitForHeartbeat = waitForHeartbeat;
        this.startAction = startAction;
        this.stopDelay = stopDelay;
        this.stopAction = stopAction;
    }


    /**
     * Gets the key value for this AutoStartPowerInfo.
     * 
     * @return key
     */
    public com.vmware.vim.ManagedObjectReference getKey() {
        return key;
    }


    /**
     * Sets the key value for this AutoStartPowerInfo.
     * 
     * @param key
     */
    public void setKey(com.vmware.vim.ManagedObjectReference key) {
        this.key = key;
    }


    /**
     * Gets the startOrder value for this AutoStartPowerInfo.
     * 
     * @return startOrder
     */
    public int getStartOrder() {
        return startOrder;
    }


    /**
     * Sets the startOrder value for this AutoStartPowerInfo.
     * 
     * @param startOrder
     */
    public void setStartOrder(int startOrder) {
        this.startOrder = startOrder;
    }


    /**
     * Gets the startDelay value for this AutoStartPowerInfo.
     * 
     * @return startDelay
     */
    public int getStartDelay() {
        return startDelay;
    }


    /**
     * Sets the startDelay value for this AutoStartPowerInfo.
     * 
     * @param startDelay
     */
    public void setStartDelay(int startDelay) {
        this.startDelay = startDelay;
    }


    /**
     * Gets the waitForHeartbeat value for this AutoStartPowerInfo.
     * 
     * @return waitForHeartbeat
     */
    public com.vmware.vim.AutoStartWaitHeartbeatSetting getWaitForHeartbeat() {
        return waitForHeartbeat;
    }


    /**
     * Sets the waitForHeartbeat value for this AutoStartPowerInfo.
     * 
     * @param waitForHeartbeat
     */
    public void setWaitForHeartbeat(com.vmware.vim.AutoStartWaitHeartbeatSetting waitForHeartbeat) {
        this.waitForHeartbeat = waitForHeartbeat;
    }


    /**
     * Gets the startAction value for this AutoStartPowerInfo.
     * 
     * @return startAction
     */
    public java.lang.String getStartAction() {
        return startAction;
    }


    /**
     * Sets the startAction value for this AutoStartPowerInfo.
     * 
     * @param startAction
     */
    public void setStartAction(java.lang.String startAction) {
        this.startAction = startAction;
    }


    /**
     * Gets the stopDelay value for this AutoStartPowerInfo.
     * 
     * @return stopDelay
     */
    public int getStopDelay() {
        return stopDelay;
    }


    /**
     * Sets the stopDelay value for this AutoStartPowerInfo.
     * 
     * @param stopDelay
     */
    public void setStopDelay(int stopDelay) {
        this.stopDelay = stopDelay;
    }


    /**
     * Gets the stopAction value for this AutoStartPowerInfo.
     * 
     * @return stopAction
     */
    public java.lang.String getStopAction() {
        return stopAction;
    }


    /**
     * Sets the stopAction value for this AutoStartPowerInfo.
     * 
     * @param stopAction
     */
    public void setStopAction(java.lang.String stopAction) {
        this.stopAction = stopAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoStartPowerInfo)) return false;
        AutoStartPowerInfo other = (AutoStartPowerInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            this.startOrder == other.getStartOrder() &&
            this.startDelay == other.getStartDelay() &&
            ((this.waitForHeartbeat==null && other.getWaitForHeartbeat()==null) || 
             (this.waitForHeartbeat!=null &&
              this.waitForHeartbeat.equals(other.getWaitForHeartbeat()))) &&
            ((this.startAction==null && other.getStartAction()==null) || 
             (this.startAction!=null &&
              this.startAction.equals(other.getStartAction()))) &&
            this.stopDelay == other.getStopDelay() &&
            ((this.stopAction==null && other.getStopAction()==null) || 
             (this.stopAction!=null &&
              this.stopAction.equals(other.getStopAction())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        _hashCode += getStartOrder();
        _hashCode += getStartDelay();
        if (getWaitForHeartbeat() != null) {
            _hashCode += getWaitForHeartbeat().hashCode();
        }
        if (getStartAction() != null) {
            _hashCode += getStartAction().hashCode();
        }
        _hashCode += getStopDelay();
        if (getStopAction() != null) {
            _hashCode += getStopAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoStartPowerInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "AutoStartPowerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "startOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "startDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waitForHeartbeat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "waitForHeartbeat"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "AutoStartWaitHeartbeatSetting"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "startAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "stopDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "stopAction"));
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
