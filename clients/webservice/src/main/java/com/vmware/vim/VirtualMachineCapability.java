/**
 * VirtualMachineCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineCapability  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private boolean snapshotOperationsSupported;

    private boolean multipleSnapshotsSupported;

    private boolean snapshotConfigSupported;

    private boolean poweredOffSnapshotsSupported;

    private boolean memorySnapshotsSupported;

    private boolean revertToSnapshotSupported;

    private boolean quiescedSnapshotsSupported;

    private boolean consolePreferencesSupported;

    private boolean cpuFeatureMaskSupported;

    private boolean s1AcpiManagementSupported;

    private boolean settingScreenResolutionSupported;

    private boolean toolsAutoUpdateSupported;

    public VirtualMachineCapability() {
    }

    public VirtualMachineCapability(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           boolean snapshotOperationsSupported,
           boolean multipleSnapshotsSupported,
           boolean snapshotConfigSupported,
           boolean poweredOffSnapshotsSupported,
           boolean memorySnapshotsSupported,
           boolean revertToSnapshotSupported,
           boolean quiescedSnapshotsSupported,
           boolean consolePreferencesSupported,
           boolean cpuFeatureMaskSupported,
           boolean s1AcpiManagementSupported,
           boolean settingScreenResolutionSupported,
           boolean toolsAutoUpdateSupported) {
        super(
            dynamicType,
            dynamicProperty);
        this.snapshotOperationsSupported = snapshotOperationsSupported;
        this.multipleSnapshotsSupported = multipleSnapshotsSupported;
        this.snapshotConfigSupported = snapshotConfigSupported;
        this.poweredOffSnapshotsSupported = poweredOffSnapshotsSupported;
        this.memorySnapshotsSupported = memorySnapshotsSupported;
        this.revertToSnapshotSupported = revertToSnapshotSupported;
        this.quiescedSnapshotsSupported = quiescedSnapshotsSupported;
        this.consolePreferencesSupported = consolePreferencesSupported;
        this.cpuFeatureMaskSupported = cpuFeatureMaskSupported;
        this.s1AcpiManagementSupported = s1AcpiManagementSupported;
        this.settingScreenResolutionSupported = settingScreenResolutionSupported;
        this.toolsAutoUpdateSupported = toolsAutoUpdateSupported;
    }


    /**
     * Gets the snapshotOperationsSupported value for this VirtualMachineCapability.
     * 
     * @return snapshotOperationsSupported
     */
    public boolean isSnapshotOperationsSupported() {
        return snapshotOperationsSupported;
    }


    /**
     * Sets the snapshotOperationsSupported value for this VirtualMachineCapability.
     * 
     * @param snapshotOperationsSupported
     */
    public void setSnapshotOperationsSupported(boolean snapshotOperationsSupported) {
        this.snapshotOperationsSupported = snapshotOperationsSupported;
    }


    /**
     * Gets the multipleSnapshotsSupported value for this VirtualMachineCapability.
     * 
     * @return multipleSnapshotsSupported
     */
    public boolean isMultipleSnapshotsSupported() {
        return multipleSnapshotsSupported;
    }


    /**
     * Sets the multipleSnapshotsSupported value for this VirtualMachineCapability.
     * 
     * @param multipleSnapshotsSupported
     */
    public void setMultipleSnapshotsSupported(boolean multipleSnapshotsSupported) {
        this.multipleSnapshotsSupported = multipleSnapshotsSupported;
    }


    /**
     * Gets the snapshotConfigSupported value for this VirtualMachineCapability.
     * 
     * @return snapshotConfigSupported
     */
    public boolean isSnapshotConfigSupported() {
        return snapshotConfigSupported;
    }


    /**
     * Sets the snapshotConfigSupported value for this VirtualMachineCapability.
     * 
     * @param snapshotConfigSupported
     */
    public void setSnapshotConfigSupported(boolean snapshotConfigSupported) {
        this.snapshotConfigSupported = snapshotConfigSupported;
    }


    /**
     * Gets the poweredOffSnapshotsSupported value for this VirtualMachineCapability.
     * 
     * @return poweredOffSnapshotsSupported
     */
    public boolean isPoweredOffSnapshotsSupported() {
        return poweredOffSnapshotsSupported;
    }


    /**
     * Sets the poweredOffSnapshotsSupported value for this VirtualMachineCapability.
     * 
     * @param poweredOffSnapshotsSupported
     */
    public void setPoweredOffSnapshotsSupported(boolean poweredOffSnapshotsSupported) {
        this.poweredOffSnapshotsSupported = poweredOffSnapshotsSupported;
    }


    /**
     * Gets the memorySnapshotsSupported value for this VirtualMachineCapability.
     * 
     * @return memorySnapshotsSupported
     */
    public boolean isMemorySnapshotsSupported() {
        return memorySnapshotsSupported;
    }


    /**
     * Sets the memorySnapshotsSupported value for this VirtualMachineCapability.
     * 
     * @param memorySnapshotsSupported
     */
    public void setMemorySnapshotsSupported(boolean memorySnapshotsSupported) {
        this.memorySnapshotsSupported = memorySnapshotsSupported;
    }


    /**
     * Gets the revertToSnapshotSupported value for this VirtualMachineCapability.
     * 
     * @return revertToSnapshotSupported
     */
    public boolean isRevertToSnapshotSupported() {
        return revertToSnapshotSupported;
    }


    /**
     * Sets the revertToSnapshotSupported value for this VirtualMachineCapability.
     * 
     * @param revertToSnapshotSupported
     */
    public void setRevertToSnapshotSupported(boolean revertToSnapshotSupported) {
        this.revertToSnapshotSupported = revertToSnapshotSupported;
    }


    /**
     * Gets the quiescedSnapshotsSupported value for this VirtualMachineCapability.
     * 
     * @return quiescedSnapshotsSupported
     */
    public boolean isQuiescedSnapshotsSupported() {
        return quiescedSnapshotsSupported;
    }


    /**
     * Sets the quiescedSnapshotsSupported value for this VirtualMachineCapability.
     * 
     * @param quiescedSnapshotsSupported
     */
    public void setQuiescedSnapshotsSupported(boolean quiescedSnapshotsSupported) {
        this.quiescedSnapshotsSupported = quiescedSnapshotsSupported;
    }


    /**
     * Gets the consolePreferencesSupported value for this VirtualMachineCapability.
     * 
     * @return consolePreferencesSupported
     */
    public boolean isConsolePreferencesSupported() {
        return consolePreferencesSupported;
    }


    /**
     * Sets the consolePreferencesSupported value for this VirtualMachineCapability.
     * 
     * @param consolePreferencesSupported
     */
    public void setConsolePreferencesSupported(boolean consolePreferencesSupported) {
        this.consolePreferencesSupported = consolePreferencesSupported;
    }


    /**
     * Gets the cpuFeatureMaskSupported value for this VirtualMachineCapability.
     * 
     * @return cpuFeatureMaskSupported
     */
    public boolean isCpuFeatureMaskSupported() {
        return cpuFeatureMaskSupported;
    }


    /**
     * Sets the cpuFeatureMaskSupported value for this VirtualMachineCapability.
     * 
     * @param cpuFeatureMaskSupported
     */
    public void setCpuFeatureMaskSupported(boolean cpuFeatureMaskSupported) {
        this.cpuFeatureMaskSupported = cpuFeatureMaskSupported;
    }


    /**
     * Gets the s1AcpiManagementSupported value for this VirtualMachineCapability.
     * 
     * @return s1AcpiManagementSupported
     */
    public boolean isS1AcpiManagementSupported() {
        return s1AcpiManagementSupported;
    }


    /**
     * Sets the s1AcpiManagementSupported value for this VirtualMachineCapability.
     * 
     * @param s1AcpiManagementSupported
     */
    public void setS1AcpiManagementSupported(boolean s1AcpiManagementSupported) {
        this.s1AcpiManagementSupported = s1AcpiManagementSupported;
    }


    /**
     * Gets the settingScreenResolutionSupported value for this VirtualMachineCapability.
     * 
     * @return settingScreenResolutionSupported
     */
    public boolean isSettingScreenResolutionSupported() {
        return settingScreenResolutionSupported;
    }


    /**
     * Sets the settingScreenResolutionSupported value for this VirtualMachineCapability.
     * 
     * @param settingScreenResolutionSupported
     */
    public void setSettingScreenResolutionSupported(boolean settingScreenResolutionSupported) {
        this.settingScreenResolutionSupported = settingScreenResolutionSupported;
    }


    /**
     * Gets the toolsAutoUpdateSupported value for this VirtualMachineCapability.
     * 
     * @return toolsAutoUpdateSupported
     */
    public boolean isToolsAutoUpdateSupported() {
        return toolsAutoUpdateSupported;
    }


    /**
     * Sets the toolsAutoUpdateSupported value for this VirtualMachineCapability.
     * 
     * @param toolsAutoUpdateSupported
     */
    public void setToolsAutoUpdateSupported(boolean toolsAutoUpdateSupported) {
        this.toolsAutoUpdateSupported = toolsAutoUpdateSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineCapability)) return false;
        VirtualMachineCapability other = (VirtualMachineCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.snapshotOperationsSupported == other.isSnapshotOperationsSupported() &&
            this.multipleSnapshotsSupported == other.isMultipleSnapshotsSupported() &&
            this.snapshotConfigSupported == other.isSnapshotConfigSupported() &&
            this.poweredOffSnapshotsSupported == other.isPoweredOffSnapshotsSupported() &&
            this.memorySnapshotsSupported == other.isMemorySnapshotsSupported() &&
            this.revertToSnapshotSupported == other.isRevertToSnapshotSupported() &&
            this.quiescedSnapshotsSupported == other.isQuiescedSnapshotsSupported() &&
            this.consolePreferencesSupported == other.isConsolePreferencesSupported() &&
            this.cpuFeatureMaskSupported == other.isCpuFeatureMaskSupported() &&
            this.s1AcpiManagementSupported == other.isS1AcpiManagementSupported() &&
            this.settingScreenResolutionSupported == other.isSettingScreenResolutionSupported() &&
            this.toolsAutoUpdateSupported == other.isToolsAutoUpdateSupported();
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
        _hashCode += (isSnapshotOperationsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMultipleSnapshotsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSnapshotConfigSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPoweredOffSnapshotsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMemorySnapshotsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRevertToSnapshotSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isQuiescedSnapshotsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isConsolePreferencesSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCpuFeatureMaskSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isS1AcpiManagementSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSettingScreenResolutionSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isToolsAutoUpdateSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotOperationsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "snapshotOperationsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multipleSnapshotsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "multipleSnapshotsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotConfigSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "snapshotConfigSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poweredOffSnapshotsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "poweredOffSnapshotsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memorySnapshotsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "memorySnapshotsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revertToSnapshotSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "revertToSnapshotSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quiescedSnapshotsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "quiescedSnapshotsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolePreferencesSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "consolePreferencesSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuFeatureMaskSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "cpuFeatureMaskSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("s1AcpiManagementSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "s1AcpiManagementSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settingScreenResolutionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "settingScreenResolutionSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toolsAutoUpdateSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "toolsAutoUpdateSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
