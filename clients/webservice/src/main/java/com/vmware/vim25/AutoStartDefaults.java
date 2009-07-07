/**
 * AutoStartDefaults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class AutoStartDefaults  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean enabled;

    private java.lang.Integer startDelay;

    private java.lang.Integer stopDelay;

    private java.lang.Boolean waitForHeartbeat;

    private java.lang.String stopAction;

    public AutoStartDefaults() {
    }

    public AutoStartDefaults(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.Boolean enabled,
           java.lang.Integer startDelay,
           java.lang.Integer stopDelay,
           java.lang.Boolean waitForHeartbeat,
           java.lang.String stopAction) {
        super(
            dynamicType,
            dynamicProperty);
        this.enabled = enabled;
        this.startDelay = startDelay;
        this.stopDelay = stopDelay;
        this.waitForHeartbeat = waitForHeartbeat;
        this.stopAction = stopAction;
    }


    /**
     * Gets the enabled value for this AutoStartDefaults.
     * 
     * @return enabled
     */
    public java.lang.Boolean getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this AutoStartDefaults.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the startDelay value for this AutoStartDefaults.
     * 
     * @return startDelay
     */
    public java.lang.Integer getStartDelay() {
        return startDelay;
    }


    /**
     * Sets the startDelay value for this AutoStartDefaults.
     * 
     * @param startDelay
     */
    public void setStartDelay(java.lang.Integer startDelay) {
        this.startDelay = startDelay;
    }


    /**
     * Gets the stopDelay value for this AutoStartDefaults.
     * 
     * @return stopDelay
     */
    public java.lang.Integer getStopDelay() {
        return stopDelay;
    }


    /**
     * Sets the stopDelay value for this AutoStartDefaults.
     * 
     * @param stopDelay
     */
    public void setStopDelay(java.lang.Integer stopDelay) {
        this.stopDelay = stopDelay;
    }


    /**
     * Gets the waitForHeartbeat value for this AutoStartDefaults.
     * 
     * @return waitForHeartbeat
     */
    public java.lang.Boolean getWaitForHeartbeat() {
        return waitForHeartbeat;
    }


    /**
     * Sets the waitForHeartbeat value for this AutoStartDefaults.
     * 
     * @param waitForHeartbeat
     */
    public void setWaitForHeartbeat(java.lang.Boolean waitForHeartbeat) {
        this.waitForHeartbeat = waitForHeartbeat;
    }


    /**
     * Gets the stopAction value for this AutoStartDefaults.
     * 
     * @return stopAction
     */
    public java.lang.String getStopAction() {
        return stopAction;
    }


    /**
     * Sets the stopAction value for this AutoStartDefaults.
     * 
     * @param stopAction
     */
    public void setStopAction(java.lang.String stopAction) {
        this.stopAction = stopAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoStartDefaults)) return false;
        AutoStartDefaults other = (AutoStartDefaults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.startDelay==null && other.getStartDelay()==null) || 
             (this.startDelay!=null &&
              this.startDelay.equals(other.getStartDelay()))) &&
            ((this.stopDelay==null && other.getStopDelay()==null) || 
             (this.stopDelay!=null &&
              this.stopDelay.equals(other.getStopDelay()))) &&
            ((this.waitForHeartbeat==null && other.getWaitForHeartbeat()==null) || 
             (this.waitForHeartbeat!=null &&
              this.waitForHeartbeat.equals(other.getWaitForHeartbeat()))) &&
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
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getStartDelay() != null) {
            _hashCode += getStartDelay().hashCode();
        }
        if (getStopDelay() != null) {
            _hashCode += getStopDelay().hashCode();
        }
        if (getWaitForHeartbeat() != null) {
            _hashCode += getWaitForHeartbeat().hashCode();
        }
        if (getStopAction() != null) {
            _hashCode += getStopAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoStartDefaults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "AutoStartDefaults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "startDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopDelay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "stopDelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waitForHeartbeat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "waitForHeartbeat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "stopAction"));
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
