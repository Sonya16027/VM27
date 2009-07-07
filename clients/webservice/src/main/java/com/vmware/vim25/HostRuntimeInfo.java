/**
 * HostRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostRuntimeInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.HostSystemConnectionState connectionState;

    private com.vmware.vim25.HostSystemPowerState powerState;

    private boolean inMaintenanceMode;

    private java.util.Calendar bootTime;

    private com.vmware.vim25.HealthSystemRuntime healthSystemRuntime;

    private com.vmware.vim25.HostTpmDigestInfo[] tpmPcrValues;

    public HostRuntimeInfo() {
    }

    public HostRuntimeInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.HostSystemConnectionState connectionState,
           com.vmware.vim25.HostSystemPowerState powerState,
           boolean inMaintenanceMode,
           java.util.Calendar bootTime,
           com.vmware.vim25.HealthSystemRuntime healthSystemRuntime,
           com.vmware.vim25.HostTpmDigestInfo[] tpmPcrValues) {
        super(
            dynamicType,
            dynamicProperty);
        this.connectionState = connectionState;
        this.powerState = powerState;
        this.inMaintenanceMode = inMaintenanceMode;
        this.bootTime = bootTime;
        this.healthSystemRuntime = healthSystemRuntime;
        this.tpmPcrValues = tpmPcrValues;
    }


    /**
     * Gets the connectionState value for this HostRuntimeInfo.
     * 
     * @return connectionState
     */
    public com.vmware.vim25.HostSystemConnectionState getConnectionState() {
        return connectionState;
    }


    /**
     * Sets the connectionState value for this HostRuntimeInfo.
     * 
     * @param connectionState
     */
    public void setConnectionState(com.vmware.vim25.HostSystemConnectionState connectionState) {
        this.connectionState = connectionState;
    }


    /**
     * Gets the powerState value for this HostRuntimeInfo.
     * 
     * @return powerState
     */
    public com.vmware.vim25.HostSystemPowerState getPowerState() {
        return powerState;
    }


    /**
     * Sets the powerState value for this HostRuntimeInfo.
     * 
     * @param powerState
     */
    public void setPowerState(com.vmware.vim25.HostSystemPowerState powerState) {
        this.powerState = powerState;
    }


    /**
     * Gets the inMaintenanceMode value for this HostRuntimeInfo.
     * 
     * @return inMaintenanceMode
     */
    public boolean isInMaintenanceMode() {
        return inMaintenanceMode;
    }


    /**
     * Sets the inMaintenanceMode value for this HostRuntimeInfo.
     * 
     * @param inMaintenanceMode
     */
    public void setInMaintenanceMode(boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
    }


    /**
     * Gets the bootTime value for this HostRuntimeInfo.
     * 
     * @return bootTime
     */
    public java.util.Calendar getBootTime() {
        return bootTime;
    }


    /**
     * Sets the bootTime value for this HostRuntimeInfo.
     * 
     * @param bootTime
     */
    public void setBootTime(java.util.Calendar bootTime) {
        this.bootTime = bootTime;
    }


    /**
     * Gets the healthSystemRuntime value for this HostRuntimeInfo.
     * 
     * @return healthSystemRuntime
     */
    public com.vmware.vim25.HealthSystemRuntime getHealthSystemRuntime() {
        return healthSystemRuntime;
    }


    /**
     * Sets the healthSystemRuntime value for this HostRuntimeInfo.
     * 
     * @param healthSystemRuntime
     */
    public void setHealthSystemRuntime(com.vmware.vim25.HealthSystemRuntime healthSystemRuntime) {
        this.healthSystemRuntime = healthSystemRuntime;
    }


    /**
     * Gets the tpmPcrValues value for this HostRuntimeInfo.
     * 
     * @return tpmPcrValues
     */
    public com.vmware.vim25.HostTpmDigestInfo[] getTpmPcrValues() {
        return tpmPcrValues;
    }


    /**
     * Sets the tpmPcrValues value for this HostRuntimeInfo.
     * 
     * @param tpmPcrValues
     */
    public void setTpmPcrValues(com.vmware.vim25.HostTpmDigestInfo[] tpmPcrValues) {
        this.tpmPcrValues = tpmPcrValues;
    }

    public com.vmware.vim25.HostTpmDigestInfo getTpmPcrValues(int i) {
        return this.tpmPcrValues[i];
    }

    public void setTpmPcrValues(int i, com.vmware.vim25.HostTpmDigestInfo _value) {
        this.tpmPcrValues[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostRuntimeInfo)) return false;
        HostRuntimeInfo other = (HostRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.connectionState==null && other.getConnectionState()==null) || 
             (this.connectionState!=null &&
              this.connectionState.equals(other.getConnectionState()))) &&
            ((this.powerState==null && other.getPowerState()==null) || 
             (this.powerState!=null &&
              this.powerState.equals(other.getPowerState()))) &&
            this.inMaintenanceMode == other.isInMaintenanceMode() &&
            ((this.bootTime==null && other.getBootTime()==null) || 
             (this.bootTime!=null &&
              this.bootTime.equals(other.getBootTime()))) &&
            ((this.healthSystemRuntime==null && other.getHealthSystemRuntime()==null) || 
             (this.healthSystemRuntime!=null &&
              this.healthSystemRuntime.equals(other.getHealthSystemRuntime()))) &&
            ((this.tpmPcrValues==null && other.getTpmPcrValues()==null) || 
             (this.tpmPcrValues!=null &&
              java.util.Arrays.equals(this.tpmPcrValues, other.getTpmPcrValues())));
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
        if (getConnectionState() != null) {
            _hashCode += getConnectionState().hashCode();
        }
        if (getPowerState() != null) {
            _hashCode += getPowerState().hashCode();
        }
        _hashCode += (isInMaintenanceMode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBootTime() != null) {
            _hashCode += getBootTime().hashCode();
        }
        if (getHealthSystemRuntime() != null) {
            _hashCode += getHealthSystemRuntime().hashCode();
        }
        if (getTpmPcrValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTpmPcrValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTpmPcrValues(), i);
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
        new org.apache.axis.description.TypeDesc(HostRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "connectionState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSystemConnectionState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "powerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostSystemPowerState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inMaintenanceMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "inMaintenanceMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bootTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthSystemRuntime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "healthSystemRuntime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HealthSystemRuntime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpmPcrValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "tpmPcrValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostTpmDigestInfo"));
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
