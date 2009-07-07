/**
 * VirtualMachineCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineCapability  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private boolean snapshotOperationsSupported;

    private boolean multipleSnapshotsSupported;

    private boolean snapshotConfigSupported;

    private boolean poweredOffSnapshotsSupported;

    private boolean memorySnapshotsSupported;

    private boolean revertToSnapshotSupported;

    private boolean quiescedSnapshotsSupported;

    private boolean disableSnapshotsSupported;

    private boolean lockSnapshotsSupported;

    private boolean consolePreferencesSupported;

    private boolean cpuFeatureMaskSupported;

    private boolean s1AcpiManagementSupported;

    private boolean settingScreenResolutionSupported;

    private boolean toolsAutoUpdateSupported;

    private boolean vmNpivWwnSupported;

    private boolean npivWwnOnNonRdmVmSupported;

    private java.lang.Boolean vmNpivWwnDisableSupported;

    private java.lang.Boolean vmNpivWwnUpdateSupported;

    private boolean swapPlacementSupported;

    private boolean toolsSyncTimeSupported;

    private boolean virtualMmuUsageSupported;

    private boolean diskSharesSupported;

    private boolean bootOptionsSupported;

    private boolean settingVideoRamSizeSupported;

    private java.lang.Boolean settingDisplayTopologySupported;

    private java.lang.Boolean recordReplaySupported;

    private java.lang.Boolean changeTrackingSupported;

    public VirtualMachineCapability() {
    }

    public VirtualMachineCapability(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean snapshotOperationsSupported,
           boolean multipleSnapshotsSupported,
           boolean snapshotConfigSupported,
           boolean poweredOffSnapshotsSupported,
           boolean memorySnapshotsSupported,
           boolean revertToSnapshotSupported,
           boolean quiescedSnapshotsSupported,
           boolean disableSnapshotsSupported,
           boolean lockSnapshotsSupported,
           boolean consolePreferencesSupported,
           boolean cpuFeatureMaskSupported,
           boolean s1AcpiManagementSupported,
           boolean settingScreenResolutionSupported,
           boolean toolsAutoUpdateSupported,
           boolean vmNpivWwnSupported,
           boolean npivWwnOnNonRdmVmSupported,
           java.lang.Boolean vmNpivWwnDisableSupported,
           java.lang.Boolean vmNpivWwnUpdateSupported,
           boolean swapPlacementSupported,
           boolean toolsSyncTimeSupported,
           boolean virtualMmuUsageSupported,
           boolean diskSharesSupported,
           boolean bootOptionsSupported,
           boolean settingVideoRamSizeSupported,
           java.lang.Boolean settingDisplayTopologySupported,
           java.lang.Boolean recordReplaySupported,
           java.lang.Boolean changeTrackingSupported) {
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
        this.disableSnapshotsSupported = disableSnapshotsSupported;
        this.lockSnapshotsSupported = lockSnapshotsSupported;
        this.consolePreferencesSupported = consolePreferencesSupported;
        this.cpuFeatureMaskSupported = cpuFeatureMaskSupported;
        this.s1AcpiManagementSupported = s1AcpiManagementSupported;
        this.settingScreenResolutionSupported = settingScreenResolutionSupported;
        this.toolsAutoUpdateSupported = toolsAutoUpdateSupported;
        this.vmNpivWwnSupported = vmNpivWwnSupported;
        this.npivWwnOnNonRdmVmSupported = npivWwnOnNonRdmVmSupported;
        this.vmNpivWwnDisableSupported = vmNpivWwnDisableSupported;
        this.vmNpivWwnUpdateSupported = vmNpivWwnUpdateSupported;
        this.swapPlacementSupported = swapPlacementSupported;
        this.toolsSyncTimeSupported = toolsSyncTimeSupported;
        this.virtualMmuUsageSupported = virtualMmuUsageSupported;
        this.diskSharesSupported = diskSharesSupported;
        this.bootOptionsSupported = bootOptionsSupported;
        this.settingVideoRamSizeSupported = settingVideoRamSizeSupported;
        this.settingDisplayTopologySupported = settingDisplayTopologySupported;
        this.recordReplaySupported = recordReplaySupported;
        this.changeTrackingSupported = changeTrackingSupported;
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
     * Gets the disableSnapshotsSupported value for this VirtualMachineCapability.
     * 
     * @return disableSnapshotsSupported
     */
    public boolean isDisableSnapshotsSupported() {
        return disableSnapshotsSupported;
    }


    /**
     * Sets the disableSnapshotsSupported value for this VirtualMachineCapability.
     * 
     * @param disableSnapshotsSupported
     */
    public void setDisableSnapshotsSupported(boolean disableSnapshotsSupported) {
        this.disableSnapshotsSupported = disableSnapshotsSupported;
    }


    /**
     * Gets the lockSnapshotsSupported value for this VirtualMachineCapability.
     * 
     * @return lockSnapshotsSupported
     */
    public boolean isLockSnapshotsSupported() {
        return lockSnapshotsSupported;
    }


    /**
     * Sets the lockSnapshotsSupported value for this VirtualMachineCapability.
     * 
     * @param lockSnapshotsSupported
     */
    public void setLockSnapshotsSupported(boolean lockSnapshotsSupported) {
        this.lockSnapshotsSupported = lockSnapshotsSupported;
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


    /**
     * Gets the vmNpivWwnSupported value for this VirtualMachineCapability.
     * 
     * @return vmNpivWwnSupported
     */
    public boolean isVmNpivWwnSupported() {
        return vmNpivWwnSupported;
    }


    /**
     * Sets the vmNpivWwnSupported value for this VirtualMachineCapability.
     * 
     * @param vmNpivWwnSupported
     */
    public void setVmNpivWwnSupported(boolean vmNpivWwnSupported) {
        this.vmNpivWwnSupported = vmNpivWwnSupported;
    }


    /**
     * Gets the npivWwnOnNonRdmVmSupported value for this VirtualMachineCapability.
     * 
     * @return npivWwnOnNonRdmVmSupported
     */
    public boolean isNpivWwnOnNonRdmVmSupported() {
        return npivWwnOnNonRdmVmSupported;
    }


    /**
     * Sets the npivWwnOnNonRdmVmSupported value for this VirtualMachineCapability.
     * 
     * @param npivWwnOnNonRdmVmSupported
     */
    public void setNpivWwnOnNonRdmVmSupported(boolean npivWwnOnNonRdmVmSupported) {
        this.npivWwnOnNonRdmVmSupported = npivWwnOnNonRdmVmSupported;
    }


    /**
     * Gets the vmNpivWwnDisableSupported value for this VirtualMachineCapability.
     * 
     * @return vmNpivWwnDisableSupported
     */
    public java.lang.Boolean getVmNpivWwnDisableSupported() {
        return vmNpivWwnDisableSupported;
    }


    /**
     * Sets the vmNpivWwnDisableSupported value for this VirtualMachineCapability.
     * 
     * @param vmNpivWwnDisableSupported
     */
    public void setVmNpivWwnDisableSupported(java.lang.Boolean vmNpivWwnDisableSupported) {
        this.vmNpivWwnDisableSupported = vmNpivWwnDisableSupported;
    }


    /**
     * Gets the vmNpivWwnUpdateSupported value for this VirtualMachineCapability.
     * 
     * @return vmNpivWwnUpdateSupported
     */
    public java.lang.Boolean getVmNpivWwnUpdateSupported() {
        return vmNpivWwnUpdateSupported;
    }


    /**
     * Sets the vmNpivWwnUpdateSupported value for this VirtualMachineCapability.
     * 
     * @param vmNpivWwnUpdateSupported
     */
    public void setVmNpivWwnUpdateSupported(java.lang.Boolean vmNpivWwnUpdateSupported) {
        this.vmNpivWwnUpdateSupported = vmNpivWwnUpdateSupported;
    }


    /**
     * Gets the swapPlacementSupported value for this VirtualMachineCapability.
     * 
     * @return swapPlacementSupported
     */
    public boolean isSwapPlacementSupported() {
        return swapPlacementSupported;
    }


    /**
     * Sets the swapPlacementSupported value for this VirtualMachineCapability.
     * 
     * @param swapPlacementSupported
     */
    public void setSwapPlacementSupported(boolean swapPlacementSupported) {
        this.swapPlacementSupported = swapPlacementSupported;
    }


    /**
     * Gets the toolsSyncTimeSupported value for this VirtualMachineCapability.
     * 
     * @return toolsSyncTimeSupported
     */
    public boolean isToolsSyncTimeSupported() {
        return toolsSyncTimeSupported;
    }


    /**
     * Sets the toolsSyncTimeSupported value for this VirtualMachineCapability.
     * 
     * @param toolsSyncTimeSupported
     */
    public void setToolsSyncTimeSupported(boolean toolsSyncTimeSupported) {
        this.toolsSyncTimeSupported = toolsSyncTimeSupported;
    }


    /**
     * Gets the virtualMmuUsageSupported value for this VirtualMachineCapability.
     * 
     * @return virtualMmuUsageSupported
     */
    public boolean isVirtualMmuUsageSupported() {
        return virtualMmuUsageSupported;
    }


    /**
     * Sets the virtualMmuUsageSupported value for this VirtualMachineCapability.
     * 
     * @param virtualMmuUsageSupported
     */
    public void setVirtualMmuUsageSupported(boolean virtualMmuUsageSupported) {
        this.virtualMmuUsageSupported = virtualMmuUsageSupported;
    }


    /**
     * Gets the diskSharesSupported value for this VirtualMachineCapability.
     * 
     * @return diskSharesSupported
     */
    public boolean isDiskSharesSupported() {
        return diskSharesSupported;
    }


    /**
     * Sets the diskSharesSupported value for this VirtualMachineCapability.
     * 
     * @param diskSharesSupported
     */
    public void setDiskSharesSupported(boolean diskSharesSupported) {
        this.diskSharesSupported = diskSharesSupported;
    }


    /**
     * Gets the bootOptionsSupported value for this VirtualMachineCapability.
     * 
     * @return bootOptionsSupported
     */
    public boolean isBootOptionsSupported() {
        return bootOptionsSupported;
    }


    /**
     * Sets the bootOptionsSupported value for this VirtualMachineCapability.
     * 
     * @param bootOptionsSupported
     */
    public void setBootOptionsSupported(boolean bootOptionsSupported) {
        this.bootOptionsSupported = bootOptionsSupported;
    }


    /**
     * Gets the settingVideoRamSizeSupported value for this VirtualMachineCapability.
     * 
     * @return settingVideoRamSizeSupported
     */
    public boolean isSettingVideoRamSizeSupported() {
        return settingVideoRamSizeSupported;
    }


    /**
     * Sets the settingVideoRamSizeSupported value for this VirtualMachineCapability.
     * 
     * @param settingVideoRamSizeSupported
     */
    public void setSettingVideoRamSizeSupported(boolean settingVideoRamSizeSupported) {
        this.settingVideoRamSizeSupported = settingVideoRamSizeSupported;
    }


    /**
     * Gets the settingDisplayTopologySupported value for this VirtualMachineCapability.
     * 
     * @return settingDisplayTopologySupported
     */
    public java.lang.Boolean getSettingDisplayTopologySupported() {
        return settingDisplayTopologySupported;
    }


    /**
     * Sets the settingDisplayTopologySupported value for this VirtualMachineCapability.
     * 
     * @param settingDisplayTopologySupported
     */
    public void setSettingDisplayTopologySupported(java.lang.Boolean settingDisplayTopologySupported) {
        this.settingDisplayTopologySupported = settingDisplayTopologySupported;
    }


    /**
     * Gets the recordReplaySupported value for this VirtualMachineCapability.
     * 
     * @return recordReplaySupported
     */
    public java.lang.Boolean getRecordReplaySupported() {
        return recordReplaySupported;
    }


    /**
     * Sets the recordReplaySupported value for this VirtualMachineCapability.
     * 
     * @param recordReplaySupported
     */
    public void setRecordReplaySupported(java.lang.Boolean recordReplaySupported) {
        this.recordReplaySupported = recordReplaySupported;
    }


    /**
     * Gets the changeTrackingSupported value for this VirtualMachineCapability.
     * 
     * @return changeTrackingSupported
     */
    public java.lang.Boolean getChangeTrackingSupported() {
        return changeTrackingSupported;
    }


    /**
     * Sets the changeTrackingSupported value for this VirtualMachineCapability.
     * 
     * @param changeTrackingSupported
     */
    public void setChangeTrackingSupported(java.lang.Boolean changeTrackingSupported) {
        this.changeTrackingSupported = changeTrackingSupported;
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
            this.disableSnapshotsSupported == other.isDisableSnapshotsSupported() &&
            this.lockSnapshotsSupported == other.isLockSnapshotsSupported() &&
            this.consolePreferencesSupported == other.isConsolePreferencesSupported() &&
            this.cpuFeatureMaskSupported == other.isCpuFeatureMaskSupported() &&
            this.s1AcpiManagementSupported == other.isS1AcpiManagementSupported() &&
            this.settingScreenResolutionSupported == other.isSettingScreenResolutionSupported() &&
            this.toolsAutoUpdateSupported == other.isToolsAutoUpdateSupported() &&
            this.vmNpivWwnSupported == other.isVmNpivWwnSupported() &&
            this.npivWwnOnNonRdmVmSupported == other.isNpivWwnOnNonRdmVmSupported() &&
            ((this.vmNpivWwnDisableSupported==null && other.getVmNpivWwnDisableSupported()==null) || 
             (this.vmNpivWwnDisableSupported!=null &&
              this.vmNpivWwnDisableSupported.equals(other.getVmNpivWwnDisableSupported()))) &&
            ((this.vmNpivWwnUpdateSupported==null && other.getVmNpivWwnUpdateSupported()==null) || 
             (this.vmNpivWwnUpdateSupported!=null &&
              this.vmNpivWwnUpdateSupported.equals(other.getVmNpivWwnUpdateSupported()))) &&
            this.swapPlacementSupported == other.isSwapPlacementSupported() &&
            this.toolsSyncTimeSupported == other.isToolsSyncTimeSupported() &&
            this.virtualMmuUsageSupported == other.isVirtualMmuUsageSupported() &&
            this.diskSharesSupported == other.isDiskSharesSupported() &&
            this.bootOptionsSupported == other.isBootOptionsSupported() &&
            this.settingVideoRamSizeSupported == other.isSettingVideoRamSizeSupported() &&
            ((this.settingDisplayTopologySupported==null && other.getSettingDisplayTopologySupported()==null) || 
             (this.settingDisplayTopologySupported!=null &&
              this.settingDisplayTopologySupported.equals(other.getSettingDisplayTopologySupported()))) &&
            ((this.recordReplaySupported==null && other.getRecordReplaySupported()==null) || 
             (this.recordReplaySupported!=null &&
              this.recordReplaySupported.equals(other.getRecordReplaySupported()))) &&
            ((this.changeTrackingSupported==null && other.getChangeTrackingSupported()==null) || 
             (this.changeTrackingSupported!=null &&
              this.changeTrackingSupported.equals(other.getChangeTrackingSupported())));
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
        _hashCode += (isDisableSnapshotsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLockSnapshotsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isConsolePreferencesSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCpuFeatureMaskSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isS1AcpiManagementSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSettingScreenResolutionSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isToolsAutoUpdateSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVmNpivWwnSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNpivWwnOnNonRdmVmSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVmNpivWwnDisableSupported() != null) {
            _hashCode += getVmNpivWwnDisableSupported().hashCode();
        }
        if (getVmNpivWwnUpdateSupported() != null) {
            _hashCode += getVmNpivWwnUpdateSupported().hashCode();
        }
        _hashCode += (isSwapPlacementSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isToolsSyncTimeSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVirtualMmuUsageSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDiskSharesSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBootOptionsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSettingVideoRamSizeSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSettingDisplayTopologySupported() != null) {
            _hashCode += getSettingDisplayTopologySupported().hashCode();
        }
        if (getRecordReplaySupported() != null) {
            _hashCode += getRecordReplaySupported().hashCode();
        }
        if (getChangeTrackingSupported() != null) {
            _hashCode += getChangeTrackingSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotOperationsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "snapshotOperationsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multipleSnapshotsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "multipleSnapshotsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotConfigSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "snapshotConfigSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poweredOffSnapshotsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "poweredOffSnapshotsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memorySnapshotsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memorySnapshotsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revertToSnapshotSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "revertToSnapshotSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quiescedSnapshotsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "quiescedSnapshotsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableSnapshotsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disableSnapshotsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockSnapshotsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lockSnapshotsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolePreferencesSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "consolePreferencesSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuFeatureMaskSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuFeatureMaskSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("s1AcpiManagementSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "s1AcpiManagementSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settingScreenResolutionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "settingScreenResolutionSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toolsAutoUpdateSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "toolsAutoUpdateSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmNpivWwnSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmNpivWwnSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npivWwnOnNonRdmVmSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "npivWwnOnNonRdmVmSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmNpivWwnDisableSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmNpivWwnDisableSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmNpivWwnUpdateSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmNpivWwnUpdateSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swapPlacementSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "swapPlacementSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toolsSyncTimeSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "toolsSyncTimeSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualMmuUsageSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualMmuUsageSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskSharesSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskSharesSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootOptionsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bootOptionsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settingVideoRamSizeSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "settingVideoRamSizeSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settingDisplayTopologySupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "settingDisplayTopologySupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordReplaySupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recordReplaySupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeTrackingSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "changeTrackingSupported"));
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
