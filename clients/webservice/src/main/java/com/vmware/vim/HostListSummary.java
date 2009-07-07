/**
 * HostListSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostListSummary  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.ManagedObjectReference host;

    private com.vmware.vim.HostHardwareSummary hardware;

    private com.vmware.vim.HostRuntimeInfo runtime;

    private com.vmware.vim.HostConfigSummary config;

    private com.vmware.vim.HostListSummaryQuickStats quickStats;

    private com.vmware.vim.ManagedEntityStatus overallStatus;

    private boolean rebootRequired;

    private com.vmware.vim.CustomFieldValue[] customValue;

    public HostListSummary() {
    }

    public HostListSummary(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           com.vmware.vim.ManagedObjectReference host,
           com.vmware.vim.HostHardwareSummary hardware,
           com.vmware.vim.HostRuntimeInfo runtime,
           com.vmware.vim.HostConfigSummary config,
           com.vmware.vim.HostListSummaryQuickStats quickStats,
           com.vmware.vim.ManagedEntityStatus overallStatus,
           boolean rebootRequired,
           com.vmware.vim.CustomFieldValue[] customValue) {
        super(
            dynamicType,
            dynamicProperty);
        this.host = host;
        this.hardware = hardware;
        this.runtime = runtime;
        this.config = config;
        this.quickStats = quickStats;
        this.overallStatus = overallStatus;
        this.rebootRequired = rebootRequired;
        this.customValue = customValue;
    }


    /**
     * Gets the host value for this HostListSummary.
     * 
     * @return host
     */
    public com.vmware.vim.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this HostListSummary.
     * 
     * @param host
     */
    public void setHost(com.vmware.vim.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the hardware value for this HostListSummary.
     * 
     * @return hardware
     */
    public com.vmware.vim.HostHardwareSummary getHardware() {
        return hardware;
    }


    /**
     * Sets the hardware value for this HostListSummary.
     * 
     * @param hardware
     */
    public void setHardware(com.vmware.vim.HostHardwareSummary hardware) {
        this.hardware = hardware;
    }


    /**
     * Gets the runtime value for this HostListSummary.
     * 
     * @return runtime
     */
    public com.vmware.vim.HostRuntimeInfo getRuntime() {
        return runtime;
    }


    /**
     * Sets the runtime value for this HostListSummary.
     * 
     * @param runtime
     */
    public void setRuntime(com.vmware.vim.HostRuntimeInfo runtime) {
        this.runtime = runtime;
    }


    /**
     * Gets the config value for this HostListSummary.
     * 
     * @return config
     */
    public com.vmware.vim.HostConfigSummary getConfig() {
        return config;
    }


    /**
     * Sets the config value for this HostListSummary.
     * 
     * @param config
     */
    public void setConfig(com.vmware.vim.HostConfigSummary config) {
        this.config = config;
    }


    /**
     * Gets the quickStats value for this HostListSummary.
     * 
     * @return quickStats
     */
    public com.vmware.vim.HostListSummaryQuickStats getQuickStats() {
        return quickStats;
    }


    /**
     * Sets the quickStats value for this HostListSummary.
     * 
     * @param quickStats
     */
    public void setQuickStats(com.vmware.vim.HostListSummaryQuickStats quickStats) {
        this.quickStats = quickStats;
    }


    /**
     * Gets the overallStatus value for this HostListSummary.
     * 
     * @return overallStatus
     */
    public com.vmware.vim.ManagedEntityStatus getOverallStatus() {
        return overallStatus;
    }


    /**
     * Sets the overallStatus value for this HostListSummary.
     * 
     * @param overallStatus
     */
    public void setOverallStatus(com.vmware.vim.ManagedEntityStatus overallStatus) {
        this.overallStatus = overallStatus;
    }


    /**
     * Gets the rebootRequired value for this HostListSummary.
     * 
     * @return rebootRequired
     */
    public boolean isRebootRequired() {
        return rebootRequired;
    }


    /**
     * Sets the rebootRequired value for this HostListSummary.
     * 
     * @param rebootRequired
     */
    public void setRebootRequired(boolean rebootRequired) {
        this.rebootRequired = rebootRequired;
    }


    /**
     * Gets the customValue value for this HostListSummary.
     * 
     * @return customValue
     */
    public com.vmware.vim.CustomFieldValue[] getCustomValue() {
        return customValue;
    }


    /**
     * Sets the customValue value for this HostListSummary.
     * 
     * @param customValue
     */
    public void setCustomValue(com.vmware.vim.CustomFieldValue[] customValue) {
        this.customValue = customValue;
    }

    public com.vmware.vim.CustomFieldValue getCustomValue(int i) {
        return this.customValue[i];
    }

    public void setCustomValue(int i, com.vmware.vim.CustomFieldValue _value) {
        this.customValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostListSummary)) return false;
        HostListSummary other = (HostListSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.hardware==null && other.getHardware()==null) || 
             (this.hardware!=null &&
              this.hardware.equals(other.getHardware()))) &&
            ((this.runtime==null && other.getRuntime()==null) || 
             (this.runtime!=null &&
              this.runtime.equals(other.getRuntime()))) &&
            ((this.config==null && other.getConfig()==null) || 
             (this.config!=null &&
              this.config.equals(other.getConfig()))) &&
            ((this.quickStats==null && other.getQuickStats()==null) || 
             (this.quickStats!=null &&
              this.quickStats.equals(other.getQuickStats()))) &&
            ((this.overallStatus==null && other.getOverallStatus()==null) || 
             (this.overallStatus!=null &&
              this.overallStatus.equals(other.getOverallStatus()))) &&
            this.rebootRequired == other.isRebootRequired() &&
            ((this.customValue==null && other.getCustomValue()==null) || 
             (this.customValue!=null &&
              java.util.Arrays.equals(this.customValue, other.getCustomValue())));
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
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getHardware() != null) {
            _hashCode += getHardware().hashCode();
        }
        if (getRuntime() != null) {
            _hashCode += getRuntime().hashCode();
        }
        if (getConfig() != null) {
            _hashCode += getConfig().hashCode();
        }
        if (getQuickStats() != null) {
            _hashCode += getQuickStats().hashCode();
        }
        if (getOverallStatus() != null) {
            _hashCode += getOverallStatus().hashCode();
        }
        _hashCode += (isRebootRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCustomValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomValue(), i);
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
        new org.apache.axis.description.TypeDesc(HostListSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostListSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardware");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "hardware"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostHardwareSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runtime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "runtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostRuntimeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("config");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "config"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostConfigSummary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quickStats");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "quickStats"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostListSummaryQuickStats"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "overallStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedEntityStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rebootRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "rebootRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "customValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "CustomFieldValue"));
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
