/**
 * VirtualMachineFlagInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineFlagInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean disableAcceleration;

    private java.lang.Boolean enableLogging;

    private java.lang.Boolean useToe;

    private java.lang.Boolean runWithDebugInfo;

    private java.lang.String monitorType;

    private java.lang.String htSharing;

    private java.lang.Boolean snapshotDisabled;

    private java.lang.Boolean snapshotLocked;

    private java.lang.Boolean diskUuidEnabled;

    private java.lang.String virtualMmuUsage;

    private java.lang.String virtualExecUsage;

    private java.lang.String snapshotPowerOffBehavior;

    private java.lang.Boolean recordReplayEnabled;

    public VirtualMachineFlagInfo() {
    }

    public VirtualMachineFlagInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.Boolean disableAcceleration,
           java.lang.Boolean enableLogging,
           java.lang.Boolean useToe,
           java.lang.Boolean runWithDebugInfo,
           java.lang.String monitorType,
           java.lang.String htSharing,
           java.lang.Boolean snapshotDisabled,
           java.lang.Boolean snapshotLocked,
           java.lang.Boolean diskUuidEnabled,
           java.lang.String virtualMmuUsage,
           java.lang.String virtualExecUsage,
           java.lang.String snapshotPowerOffBehavior,
           java.lang.Boolean recordReplayEnabled) {
        super(
            dynamicType,
            dynamicProperty);
        this.disableAcceleration = disableAcceleration;
        this.enableLogging = enableLogging;
        this.useToe = useToe;
        this.runWithDebugInfo = runWithDebugInfo;
        this.monitorType = monitorType;
        this.htSharing = htSharing;
        this.snapshotDisabled = snapshotDisabled;
        this.snapshotLocked = snapshotLocked;
        this.diskUuidEnabled = diskUuidEnabled;
        this.virtualMmuUsage = virtualMmuUsage;
        this.virtualExecUsage = virtualExecUsage;
        this.snapshotPowerOffBehavior = snapshotPowerOffBehavior;
        this.recordReplayEnabled = recordReplayEnabled;
    }


    /**
     * Gets the disableAcceleration value for this VirtualMachineFlagInfo.
     * 
     * @return disableAcceleration
     */
    public java.lang.Boolean getDisableAcceleration() {
        return disableAcceleration;
    }


    /**
     * Sets the disableAcceleration value for this VirtualMachineFlagInfo.
     * 
     * @param disableAcceleration
     */
    public void setDisableAcceleration(java.lang.Boolean disableAcceleration) {
        this.disableAcceleration = disableAcceleration;
    }


    /**
     * Gets the enableLogging value for this VirtualMachineFlagInfo.
     * 
     * @return enableLogging
     */
    public java.lang.Boolean getEnableLogging() {
        return enableLogging;
    }


    /**
     * Sets the enableLogging value for this VirtualMachineFlagInfo.
     * 
     * @param enableLogging
     */
    public void setEnableLogging(java.lang.Boolean enableLogging) {
        this.enableLogging = enableLogging;
    }


    /**
     * Gets the useToe value for this VirtualMachineFlagInfo.
     * 
     * @return useToe
     */
    public java.lang.Boolean getUseToe() {
        return useToe;
    }


    /**
     * Sets the useToe value for this VirtualMachineFlagInfo.
     * 
     * @param useToe
     */
    public void setUseToe(java.lang.Boolean useToe) {
        this.useToe = useToe;
    }


    /**
     * Gets the runWithDebugInfo value for this VirtualMachineFlagInfo.
     * 
     * @return runWithDebugInfo
     */
    public java.lang.Boolean getRunWithDebugInfo() {
        return runWithDebugInfo;
    }


    /**
     * Sets the runWithDebugInfo value for this VirtualMachineFlagInfo.
     * 
     * @param runWithDebugInfo
     */
    public void setRunWithDebugInfo(java.lang.Boolean runWithDebugInfo) {
        this.runWithDebugInfo = runWithDebugInfo;
    }


    /**
     * Gets the monitorType value for this VirtualMachineFlagInfo.
     * 
     * @return monitorType
     */
    public java.lang.String getMonitorType() {
        return monitorType;
    }


    /**
     * Sets the monitorType value for this VirtualMachineFlagInfo.
     * 
     * @param monitorType
     */
    public void setMonitorType(java.lang.String monitorType) {
        this.monitorType = monitorType;
    }


    /**
     * Gets the htSharing value for this VirtualMachineFlagInfo.
     * 
     * @return htSharing
     */
    public java.lang.String getHtSharing() {
        return htSharing;
    }


    /**
     * Sets the htSharing value for this VirtualMachineFlagInfo.
     * 
     * @param htSharing
     */
    public void setHtSharing(java.lang.String htSharing) {
        this.htSharing = htSharing;
    }


    /**
     * Gets the snapshotDisabled value for this VirtualMachineFlagInfo.
     * 
     * @return snapshotDisabled
     */
    public java.lang.Boolean getSnapshotDisabled() {
        return snapshotDisabled;
    }


    /**
     * Sets the snapshotDisabled value for this VirtualMachineFlagInfo.
     * 
     * @param snapshotDisabled
     */
    public void setSnapshotDisabled(java.lang.Boolean snapshotDisabled) {
        this.snapshotDisabled = snapshotDisabled;
    }


    /**
     * Gets the snapshotLocked value for this VirtualMachineFlagInfo.
     * 
     * @return snapshotLocked
     */
    public java.lang.Boolean getSnapshotLocked() {
        return snapshotLocked;
    }


    /**
     * Sets the snapshotLocked value for this VirtualMachineFlagInfo.
     * 
     * @param snapshotLocked
     */
    public void setSnapshotLocked(java.lang.Boolean snapshotLocked) {
        this.snapshotLocked = snapshotLocked;
    }


    /**
     * Gets the diskUuidEnabled value for this VirtualMachineFlagInfo.
     * 
     * @return diskUuidEnabled
     */
    public java.lang.Boolean getDiskUuidEnabled() {
        return diskUuidEnabled;
    }


    /**
     * Sets the diskUuidEnabled value for this VirtualMachineFlagInfo.
     * 
     * @param diskUuidEnabled
     */
    public void setDiskUuidEnabled(java.lang.Boolean diskUuidEnabled) {
        this.diskUuidEnabled = diskUuidEnabled;
    }


    /**
     * Gets the virtualMmuUsage value for this VirtualMachineFlagInfo.
     * 
     * @return virtualMmuUsage
     */
    public java.lang.String getVirtualMmuUsage() {
        return virtualMmuUsage;
    }


    /**
     * Sets the virtualMmuUsage value for this VirtualMachineFlagInfo.
     * 
     * @param virtualMmuUsage
     */
    public void setVirtualMmuUsage(java.lang.String virtualMmuUsage) {
        this.virtualMmuUsage = virtualMmuUsage;
    }


    /**
     * Gets the virtualExecUsage value for this VirtualMachineFlagInfo.
     * 
     * @return virtualExecUsage
     */
    public java.lang.String getVirtualExecUsage() {
        return virtualExecUsage;
    }


    /**
     * Sets the virtualExecUsage value for this VirtualMachineFlagInfo.
     * 
     * @param virtualExecUsage
     */
    public void setVirtualExecUsage(java.lang.String virtualExecUsage) {
        this.virtualExecUsage = virtualExecUsage;
    }


    /**
     * Gets the snapshotPowerOffBehavior value for this VirtualMachineFlagInfo.
     * 
     * @return snapshotPowerOffBehavior
     */
    public java.lang.String getSnapshotPowerOffBehavior() {
        return snapshotPowerOffBehavior;
    }


    /**
     * Sets the snapshotPowerOffBehavior value for this VirtualMachineFlagInfo.
     * 
     * @param snapshotPowerOffBehavior
     */
    public void setSnapshotPowerOffBehavior(java.lang.String snapshotPowerOffBehavior) {
        this.snapshotPowerOffBehavior = snapshotPowerOffBehavior;
    }


    /**
     * Gets the recordReplayEnabled value for this VirtualMachineFlagInfo.
     * 
     * @return recordReplayEnabled
     */
    public java.lang.Boolean getRecordReplayEnabled() {
        return recordReplayEnabled;
    }


    /**
     * Sets the recordReplayEnabled value for this VirtualMachineFlagInfo.
     * 
     * @param recordReplayEnabled
     */
    public void setRecordReplayEnabled(java.lang.Boolean recordReplayEnabled) {
        this.recordReplayEnabled = recordReplayEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineFlagInfo)) return false;
        VirtualMachineFlagInfo other = (VirtualMachineFlagInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.disableAcceleration==null && other.getDisableAcceleration()==null) || 
             (this.disableAcceleration!=null &&
              this.disableAcceleration.equals(other.getDisableAcceleration()))) &&
            ((this.enableLogging==null && other.getEnableLogging()==null) || 
             (this.enableLogging!=null &&
              this.enableLogging.equals(other.getEnableLogging()))) &&
            ((this.useToe==null && other.getUseToe()==null) || 
             (this.useToe!=null &&
              this.useToe.equals(other.getUseToe()))) &&
            ((this.runWithDebugInfo==null && other.getRunWithDebugInfo()==null) || 
             (this.runWithDebugInfo!=null &&
              this.runWithDebugInfo.equals(other.getRunWithDebugInfo()))) &&
            ((this.monitorType==null && other.getMonitorType()==null) || 
             (this.monitorType!=null &&
              this.monitorType.equals(other.getMonitorType()))) &&
            ((this.htSharing==null && other.getHtSharing()==null) || 
             (this.htSharing!=null &&
              this.htSharing.equals(other.getHtSharing()))) &&
            ((this.snapshotDisabled==null && other.getSnapshotDisabled()==null) || 
             (this.snapshotDisabled!=null &&
              this.snapshotDisabled.equals(other.getSnapshotDisabled()))) &&
            ((this.snapshotLocked==null && other.getSnapshotLocked()==null) || 
             (this.snapshotLocked!=null &&
              this.snapshotLocked.equals(other.getSnapshotLocked()))) &&
            ((this.diskUuidEnabled==null && other.getDiskUuidEnabled()==null) || 
             (this.diskUuidEnabled!=null &&
              this.diskUuidEnabled.equals(other.getDiskUuidEnabled()))) &&
            ((this.virtualMmuUsage==null && other.getVirtualMmuUsage()==null) || 
             (this.virtualMmuUsage!=null &&
              this.virtualMmuUsage.equals(other.getVirtualMmuUsage()))) &&
            ((this.virtualExecUsage==null && other.getVirtualExecUsage()==null) || 
             (this.virtualExecUsage!=null &&
              this.virtualExecUsage.equals(other.getVirtualExecUsage()))) &&
            ((this.snapshotPowerOffBehavior==null && other.getSnapshotPowerOffBehavior()==null) || 
             (this.snapshotPowerOffBehavior!=null &&
              this.snapshotPowerOffBehavior.equals(other.getSnapshotPowerOffBehavior()))) &&
            ((this.recordReplayEnabled==null && other.getRecordReplayEnabled()==null) || 
             (this.recordReplayEnabled!=null &&
              this.recordReplayEnabled.equals(other.getRecordReplayEnabled())));
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
        if (getDisableAcceleration() != null) {
            _hashCode += getDisableAcceleration().hashCode();
        }
        if (getEnableLogging() != null) {
            _hashCode += getEnableLogging().hashCode();
        }
        if (getUseToe() != null) {
            _hashCode += getUseToe().hashCode();
        }
        if (getRunWithDebugInfo() != null) {
            _hashCode += getRunWithDebugInfo().hashCode();
        }
        if (getMonitorType() != null) {
            _hashCode += getMonitorType().hashCode();
        }
        if (getHtSharing() != null) {
            _hashCode += getHtSharing().hashCode();
        }
        if (getSnapshotDisabled() != null) {
            _hashCode += getSnapshotDisabled().hashCode();
        }
        if (getSnapshotLocked() != null) {
            _hashCode += getSnapshotLocked().hashCode();
        }
        if (getDiskUuidEnabled() != null) {
            _hashCode += getDiskUuidEnabled().hashCode();
        }
        if (getVirtualMmuUsage() != null) {
            _hashCode += getVirtualMmuUsage().hashCode();
        }
        if (getVirtualExecUsage() != null) {
            _hashCode += getVirtualExecUsage().hashCode();
        }
        if (getSnapshotPowerOffBehavior() != null) {
            _hashCode += getSnapshotPowerOffBehavior().hashCode();
        }
        if (getRecordReplayEnabled() != null) {
            _hashCode += getRecordReplayEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineFlagInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFlagInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableAcceleration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disableAcceleration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableLogging");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "enableLogging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useToe");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "useToe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runWithDebugInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "runWithDebugInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitorType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "monitorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htSharing");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "htSharing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "snapshotDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "snapshotLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskUuidEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskUuidEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMmuUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualMmuUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualExecUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualExecUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotPowerOffBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "snapshotPowerOffBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordReplayEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recordReplayEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
