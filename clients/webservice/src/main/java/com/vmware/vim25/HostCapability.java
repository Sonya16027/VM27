/**
 * HostCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostCapability  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private boolean recursiveResourcePoolsSupported;

    private boolean cpuMemoryResourceConfigurationSupported;

    private boolean rebootSupported;

    private boolean shutdownSupported;

    private boolean vmotionSupported;

    private boolean standbySupported;

    private java.lang.Boolean ipmiSupported;

    private java.lang.Integer maxSupportedVMs;

    private java.lang.Integer maxRunningVMs;

    private java.lang.Integer maxSupportedVcpus;

    private boolean datastorePrincipalSupported;

    private boolean sanSupported;

    private boolean nfsSupported;

    private boolean iscsiSupported;

    private boolean vlanTaggingSupported;

    private boolean nicTeamingSupported;

    private boolean highGuestMemSupported;

    private boolean maintenanceModeSupported;

    private boolean suspendedRelocateSupported;

    private boolean restrictedSnapshotRelocateSupported;

    private boolean perVmSwapFiles;

    private boolean localSwapDatastoreSupported;

    private boolean unsharedSwapVMotionSupported;

    private boolean backgroundSnapshotsSupported;

    private boolean preAssignedPCIUnitNumbersSupported;

    private boolean screenshotSupported;

    private boolean scaledScreenshotSupported;

    private java.lang.Boolean storageVMotionSupported;

    private java.lang.Boolean vmotionWithStorageVMotionSupported;

    private java.lang.Boolean recordReplaySupported;

    private java.lang.Boolean ftSupported;

    private java.lang.String replayUnsupportedReason;

    private java.lang.Boolean loginBySSLThumbprintSupported;

    private java.lang.Boolean cloneFromSnapshotSupported;

    private java.lang.Boolean deltaDiskBackingsSupported;

    private java.lang.Boolean perVMNetworkTrafficShapingSupported;

    private java.lang.Boolean tpmSupported;

    private com.vmware.vim25.HostCpuIdInfo[] supportedCpuFeature;

    private java.lang.Boolean virtualExecUsageSupported;

    public HostCapability() {
    }

    public HostCapability(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean recursiveResourcePoolsSupported,
           boolean cpuMemoryResourceConfigurationSupported,
           boolean rebootSupported,
           boolean shutdownSupported,
           boolean vmotionSupported,
           boolean standbySupported,
           java.lang.Boolean ipmiSupported,
           java.lang.Integer maxSupportedVMs,
           java.lang.Integer maxRunningVMs,
           java.lang.Integer maxSupportedVcpus,
           boolean datastorePrincipalSupported,
           boolean sanSupported,
           boolean nfsSupported,
           boolean iscsiSupported,
           boolean vlanTaggingSupported,
           boolean nicTeamingSupported,
           boolean highGuestMemSupported,
           boolean maintenanceModeSupported,
           boolean suspendedRelocateSupported,
           boolean restrictedSnapshotRelocateSupported,
           boolean perVmSwapFiles,
           boolean localSwapDatastoreSupported,
           boolean unsharedSwapVMotionSupported,
           boolean backgroundSnapshotsSupported,
           boolean preAssignedPCIUnitNumbersSupported,
           boolean screenshotSupported,
           boolean scaledScreenshotSupported,
           java.lang.Boolean storageVMotionSupported,
           java.lang.Boolean vmotionWithStorageVMotionSupported,
           java.lang.Boolean recordReplaySupported,
           java.lang.Boolean ftSupported,
           java.lang.String replayUnsupportedReason,
           java.lang.Boolean loginBySSLThumbprintSupported,
           java.lang.Boolean cloneFromSnapshotSupported,
           java.lang.Boolean deltaDiskBackingsSupported,
           java.lang.Boolean perVMNetworkTrafficShapingSupported,
           java.lang.Boolean tpmSupported,
           com.vmware.vim25.HostCpuIdInfo[] supportedCpuFeature,
           java.lang.Boolean virtualExecUsageSupported) {
        super(
            dynamicType,
            dynamicProperty);
        this.recursiveResourcePoolsSupported = recursiveResourcePoolsSupported;
        this.cpuMemoryResourceConfigurationSupported = cpuMemoryResourceConfigurationSupported;
        this.rebootSupported = rebootSupported;
        this.shutdownSupported = shutdownSupported;
        this.vmotionSupported = vmotionSupported;
        this.standbySupported = standbySupported;
        this.ipmiSupported = ipmiSupported;
        this.maxSupportedVMs = maxSupportedVMs;
        this.maxRunningVMs = maxRunningVMs;
        this.maxSupportedVcpus = maxSupportedVcpus;
        this.datastorePrincipalSupported = datastorePrincipalSupported;
        this.sanSupported = sanSupported;
        this.nfsSupported = nfsSupported;
        this.iscsiSupported = iscsiSupported;
        this.vlanTaggingSupported = vlanTaggingSupported;
        this.nicTeamingSupported = nicTeamingSupported;
        this.highGuestMemSupported = highGuestMemSupported;
        this.maintenanceModeSupported = maintenanceModeSupported;
        this.suspendedRelocateSupported = suspendedRelocateSupported;
        this.restrictedSnapshotRelocateSupported = restrictedSnapshotRelocateSupported;
        this.perVmSwapFiles = perVmSwapFiles;
        this.localSwapDatastoreSupported = localSwapDatastoreSupported;
        this.unsharedSwapVMotionSupported = unsharedSwapVMotionSupported;
        this.backgroundSnapshotsSupported = backgroundSnapshotsSupported;
        this.preAssignedPCIUnitNumbersSupported = preAssignedPCIUnitNumbersSupported;
        this.screenshotSupported = screenshotSupported;
        this.scaledScreenshotSupported = scaledScreenshotSupported;
        this.storageVMotionSupported = storageVMotionSupported;
        this.vmotionWithStorageVMotionSupported = vmotionWithStorageVMotionSupported;
        this.recordReplaySupported = recordReplaySupported;
        this.ftSupported = ftSupported;
        this.replayUnsupportedReason = replayUnsupportedReason;
        this.loginBySSLThumbprintSupported = loginBySSLThumbprintSupported;
        this.cloneFromSnapshotSupported = cloneFromSnapshotSupported;
        this.deltaDiskBackingsSupported = deltaDiskBackingsSupported;
        this.perVMNetworkTrafficShapingSupported = perVMNetworkTrafficShapingSupported;
        this.tpmSupported = tpmSupported;
        this.supportedCpuFeature = supportedCpuFeature;
        this.virtualExecUsageSupported = virtualExecUsageSupported;
    }


    /**
     * Gets the recursiveResourcePoolsSupported value for this HostCapability.
     * 
     * @return recursiveResourcePoolsSupported
     */
    public boolean isRecursiveResourcePoolsSupported() {
        return recursiveResourcePoolsSupported;
    }


    /**
     * Sets the recursiveResourcePoolsSupported value for this HostCapability.
     * 
     * @param recursiveResourcePoolsSupported
     */
    public void setRecursiveResourcePoolsSupported(boolean recursiveResourcePoolsSupported) {
        this.recursiveResourcePoolsSupported = recursiveResourcePoolsSupported;
    }


    /**
     * Gets the cpuMemoryResourceConfigurationSupported value for this HostCapability.
     * 
     * @return cpuMemoryResourceConfigurationSupported
     */
    public boolean isCpuMemoryResourceConfigurationSupported() {
        return cpuMemoryResourceConfigurationSupported;
    }


    /**
     * Sets the cpuMemoryResourceConfigurationSupported value for this HostCapability.
     * 
     * @param cpuMemoryResourceConfigurationSupported
     */
    public void setCpuMemoryResourceConfigurationSupported(boolean cpuMemoryResourceConfigurationSupported) {
        this.cpuMemoryResourceConfigurationSupported = cpuMemoryResourceConfigurationSupported;
    }


    /**
     * Gets the rebootSupported value for this HostCapability.
     * 
     * @return rebootSupported
     */
    public boolean isRebootSupported() {
        return rebootSupported;
    }


    /**
     * Sets the rebootSupported value for this HostCapability.
     * 
     * @param rebootSupported
     */
    public void setRebootSupported(boolean rebootSupported) {
        this.rebootSupported = rebootSupported;
    }


    /**
     * Gets the shutdownSupported value for this HostCapability.
     * 
     * @return shutdownSupported
     */
    public boolean isShutdownSupported() {
        return shutdownSupported;
    }


    /**
     * Sets the shutdownSupported value for this HostCapability.
     * 
     * @param shutdownSupported
     */
    public void setShutdownSupported(boolean shutdownSupported) {
        this.shutdownSupported = shutdownSupported;
    }


    /**
     * Gets the vmotionSupported value for this HostCapability.
     * 
     * @return vmotionSupported
     */
    public boolean isVmotionSupported() {
        return vmotionSupported;
    }


    /**
     * Sets the vmotionSupported value for this HostCapability.
     * 
     * @param vmotionSupported
     */
    public void setVmotionSupported(boolean vmotionSupported) {
        this.vmotionSupported = vmotionSupported;
    }


    /**
     * Gets the standbySupported value for this HostCapability.
     * 
     * @return standbySupported
     */
    public boolean isStandbySupported() {
        return standbySupported;
    }


    /**
     * Sets the standbySupported value for this HostCapability.
     * 
     * @param standbySupported
     */
    public void setStandbySupported(boolean standbySupported) {
        this.standbySupported = standbySupported;
    }


    /**
     * Gets the ipmiSupported value for this HostCapability.
     * 
     * @return ipmiSupported
     */
    public java.lang.Boolean getIpmiSupported() {
        return ipmiSupported;
    }


    /**
     * Sets the ipmiSupported value for this HostCapability.
     * 
     * @param ipmiSupported
     */
    public void setIpmiSupported(java.lang.Boolean ipmiSupported) {
        this.ipmiSupported = ipmiSupported;
    }


    /**
     * Gets the maxSupportedVMs value for this HostCapability.
     * 
     * @return maxSupportedVMs
     */
    public java.lang.Integer getMaxSupportedVMs() {
        return maxSupportedVMs;
    }


    /**
     * Sets the maxSupportedVMs value for this HostCapability.
     * 
     * @param maxSupportedVMs
     */
    public void setMaxSupportedVMs(java.lang.Integer maxSupportedVMs) {
        this.maxSupportedVMs = maxSupportedVMs;
    }


    /**
     * Gets the maxRunningVMs value for this HostCapability.
     * 
     * @return maxRunningVMs
     */
    public java.lang.Integer getMaxRunningVMs() {
        return maxRunningVMs;
    }


    /**
     * Sets the maxRunningVMs value for this HostCapability.
     * 
     * @param maxRunningVMs
     */
    public void setMaxRunningVMs(java.lang.Integer maxRunningVMs) {
        this.maxRunningVMs = maxRunningVMs;
    }


    /**
     * Gets the maxSupportedVcpus value for this HostCapability.
     * 
     * @return maxSupportedVcpus
     */
    public java.lang.Integer getMaxSupportedVcpus() {
        return maxSupportedVcpus;
    }


    /**
     * Sets the maxSupportedVcpus value for this HostCapability.
     * 
     * @param maxSupportedVcpus
     */
    public void setMaxSupportedVcpus(java.lang.Integer maxSupportedVcpus) {
        this.maxSupportedVcpus = maxSupportedVcpus;
    }


    /**
     * Gets the datastorePrincipalSupported value for this HostCapability.
     * 
     * @return datastorePrincipalSupported
     */
    public boolean isDatastorePrincipalSupported() {
        return datastorePrincipalSupported;
    }


    /**
     * Sets the datastorePrincipalSupported value for this HostCapability.
     * 
     * @param datastorePrincipalSupported
     */
    public void setDatastorePrincipalSupported(boolean datastorePrincipalSupported) {
        this.datastorePrincipalSupported = datastorePrincipalSupported;
    }


    /**
     * Gets the sanSupported value for this HostCapability.
     * 
     * @return sanSupported
     */
    public boolean isSanSupported() {
        return sanSupported;
    }


    /**
     * Sets the sanSupported value for this HostCapability.
     * 
     * @param sanSupported
     */
    public void setSanSupported(boolean sanSupported) {
        this.sanSupported = sanSupported;
    }


    /**
     * Gets the nfsSupported value for this HostCapability.
     * 
     * @return nfsSupported
     */
    public boolean isNfsSupported() {
        return nfsSupported;
    }


    /**
     * Sets the nfsSupported value for this HostCapability.
     * 
     * @param nfsSupported
     */
    public void setNfsSupported(boolean nfsSupported) {
        this.nfsSupported = nfsSupported;
    }


    /**
     * Gets the iscsiSupported value for this HostCapability.
     * 
     * @return iscsiSupported
     */
    public boolean isIscsiSupported() {
        return iscsiSupported;
    }


    /**
     * Sets the iscsiSupported value for this HostCapability.
     * 
     * @param iscsiSupported
     */
    public void setIscsiSupported(boolean iscsiSupported) {
        this.iscsiSupported = iscsiSupported;
    }


    /**
     * Gets the vlanTaggingSupported value for this HostCapability.
     * 
     * @return vlanTaggingSupported
     */
    public boolean isVlanTaggingSupported() {
        return vlanTaggingSupported;
    }


    /**
     * Sets the vlanTaggingSupported value for this HostCapability.
     * 
     * @param vlanTaggingSupported
     */
    public void setVlanTaggingSupported(boolean vlanTaggingSupported) {
        this.vlanTaggingSupported = vlanTaggingSupported;
    }


    /**
     * Gets the nicTeamingSupported value for this HostCapability.
     * 
     * @return nicTeamingSupported
     */
    public boolean isNicTeamingSupported() {
        return nicTeamingSupported;
    }


    /**
     * Sets the nicTeamingSupported value for this HostCapability.
     * 
     * @param nicTeamingSupported
     */
    public void setNicTeamingSupported(boolean nicTeamingSupported) {
        this.nicTeamingSupported = nicTeamingSupported;
    }


    /**
     * Gets the highGuestMemSupported value for this HostCapability.
     * 
     * @return highGuestMemSupported
     */
    public boolean isHighGuestMemSupported() {
        return highGuestMemSupported;
    }


    /**
     * Sets the highGuestMemSupported value for this HostCapability.
     * 
     * @param highGuestMemSupported
     */
    public void setHighGuestMemSupported(boolean highGuestMemSupported) {
        this.highGuestMemSupported = highGuestMemSupported;
    }


    /**
     * Gets the maintenanceModeSupported value for this HostCapability.
     * 
     * @return maintenanceModeSupported
     */
    public boolean isMaintenanceModeSupported() {
        return maintenanceModeSupported;
    }


    /**
     * Sets the maintenanceModeSupported value for this HostCapability.
     * 
     * @param maintenanceModeSupported
     */
    public void setMaintenanceModeSupported(boolean maintenanceModeSupported) {
        this.maintenanceModeSupported = maintenanceModeSupported;
    }


    /**
     * Gets the suspendedRelocateSupported value for this HostCapability.
     * 
     * @return suspendedRelocateSupported
     */
    public boolean isSuspendedRelocateSupported() {
        return suspendedRelocateSupported;
    }


    /**
     * Sets the suspendedRelocateSupported value for this HostCapability.
     * 
     * @param suspendedRelocateSupported
     */
    public void setSuspendedRelocateSupported(boolean suspendedRelocateSupported) {
        this.suspendedRelocateSupported = suspendedRelocateSupported;
    }


    /**
     * Gets the restrictedSnapshotRelocateSupported value for this HostCapability.
     * 
     * @return restrictedSnapshotRelocateSupported
     */
    public boolean isRestrictedSnapshotRelocateSupported() {
        return restrictedSnapshotRelocateSupported;
    }


    /**
     * Sets the restrictedSnapshotRelocateSupported value for this HostCapability.
     * 
     * @param restrictedSnapshotRelocateSupported
     */
    public void setRestrictedSnapshotRelocateSupported(boolean restrictedSnapshotRelocateSupported) {
        this.restrictedSnapshotRelocateSupported = restrictedSnapshotRelocateSupported;
    }


    /**
     * Gets the perVmSwapFiles value for this HostCapability.
     * 
     * @return perVmSwapFiles
     */
    public boolean isPerVmSwapFiles() {
        return perVmSwapFiles;
    }


    /**
     * Sets the perVmSwapFiles value for this HostCapability.
     * 
     * @param perVmSwapFiles
     */
    public void setPerVmSwapFiles(boolean perVmSwapFiles) {
        this.perVmSwapFiles = perVmSwapFiles;
    }


    /**
     * Gets the localSwapDatastoreSupported value for this HostCapability.
     * 
     * @return localSwapDatastoreSupported
     */
    public boolean isLocalSwapDatastoreSupported() {
        return localSwapDatastoreSupported;
    }


    /**
     * Sets the localSwapDatastoreSupported value for this HostCapability.
     * 
     * @param localSwapDatastoreSupported
     */
    public void setLocalSwapDatastoreSupported(boolean localSwapDatastoreSupported) {
        this.localSwapDatastoreSupported = localSwapDatastoreSupported;
    }


    /**
     * Gets the unsharedSwapVMotionSupported value for this HostCapability.
     * 
     * @return unsharedSwapVMotionSupported
     */
    public boolean isUnsharedSwapVMotionSupported() {
        return unsharedSwapVMotionSupported;
    }


    /**
     * Sets the unsharedSwapVMotionSupported value for this HostCapability.
     * 
     * @param unsharedSwapVMotionSupported
     */
    public void setUnsharedSwapVMotionSupported(boolean unsharedSwapVMotionSupported) {
        this.unsharedSwapVMotionSupported = unsharedSwapVMotionSupported;
    }


    /**
     * Gets the backgroundSnapshotsSupported value for this HostCapability.
     * 
     * @return backgroundSnapshotsSupported
     */
    public boolean isBackgroundSnapshotsSupported() {
        return backgroundSnapshotsSupported;
    }


    /**
     * Sets the backgroundSnapshotsSupported value for this HostCapability.
     * 
     * @param backgroundSnapshotsSupported
     */
    public void setBackgroundSnapshotsSupported(boolean backgroundSnapshotsSupported) {
        this.backgroundSnapshotsSupported = backgroundSnapshotsSupported;
    }


    /**
     * Gets the preAssignedPCIUnitNumbersSupported value for this HostCapability.
     * 
     * @return preAssignedPCIUnitNumbersSupported
     */
    public boolean isPreAssignedPCIUnitNumbersSupported() {
        return preAssignedPCIUnitNumbersSupported;
    }


    /**
     * Sets the preAssignedPCIUnitNumbersSupported value for this HostCapability.
     * 
     * @param preAssignedPCIUnitNumbersSupported
     */
    public void setPreAssignedPCIUnitNumbersSupported(boolean preAssignedPCIUnitNumbersSupported) {
        this.preAssignedPCIUnitNumbersSupported = preAssignedPCIUnitNumbersSupported;
    }


    /**
     * Gets the screenshotSupported value for this HostCapability.
     * 
     * @return screenshotSupported
     */
    public boolean isScreenshotSupported() {
        return screenshotSupported;
    }


    /**
     * Sets the screenshotSupported value for this HostCapability.
     * 
     * @param screenshotSupported
     */
    public void setScreenshotSupported(boolean screenshotSupported) {
        this.screenshotSupported = screenshotSupported;
    }


    /**
     * Gets the scaledScreenshotSupported value for this HostCapability.
     * 
     * @return scaledScreenshotSupported
     */
    public boolean isScaledScreenshotSupported() {
        return scaledScreenshotSupported;
    }


    /**
     * Sets the scaledScreenshotSupported value for this HostCapability.
     * 
     * @param scaledScreenshotSupported
     */
    public void setScaledScreenshotSupported(boolean scaledScreenshotSupported) {
        this.scaledScreenshotSupported = scaledScreenshotSupported;
    }


    /**
     * Gets the storageVMotionSupported value for this HostCapability.
     * 
     * @return storageVMotionSupported
     */
    public java.lang.Boolean getStorageVMotionSupported() {
        return storageVMotionSupported;
    }


    /**
     * Sets the storageVMotionSupported value for this HostCapability.
     * 
     * @param storageVMotionSupported
     */
    public void setStorageVMotionSupported(java.lang.Boolean storageVMotionSupported) {
        this.storageVMotionSupported = storageVMotionSupported;
    }


    /**
     * Gets the vmotionWithStorageVMotionSupported value for this HostCapability.
     * 
     * @return vmotionWithStorageVMotionSupported
     */
    public java.lang.Boolean getVmotionWithStorageVMotionSupported() {
        return vmotionWithStorageVMotionSupported;
    }


    /**
     * Sets the vmotionWithStorageVMotionSupported value for this HostCapability.
     * 
     * @param vmotionWithStorageVMotionSupported
     */
    public void setVmotionWithStorageVMotionSupported(java.lang.Boolean vmotionWithStorageVMotionSupported) {
        this.vmotionWithStorageVMotionSupported = vmotionWithStorageVMotionSupported;
    }


    /**
     * Gets the recordReplaySupported value for this HostCapability.
     * 
     * @return recordReplaySupported
     */
    public java.lang.Boolean getRecordReplaySupported() {
        return recordReplaySupported;
    }


    /**
     * Sets the recordReplaySupported value for this HostCapability.
     * 
     * @param recordReplaySupported
     */
    public void setRecordReplaySupported(java.lang.Boolean recordReplaySupported) {
        this.recordReplaySupported = recordReplaySupported;
    }


    /**
     * Gets the ftSupported value for this HostCapability.
     * 
     * @return ftSupported
     */
    public java.lang.Boolean getFtSupported() {
        return ftSupported;
    }


    /**
     * Sets the ftSupported value for this HostCapability.
     * 
     * @param ftSupported
     */
    public void setFtSupported(java.lang.Boolean ftSupported) {
        this.ftSupported = ftSupported;
    }


    /**
     * Gets the replayUnsupportedReason value for this HostCapability.
     * 
     * @return replayUnsupportedReason
     */
    public java.lang.String getReplayUnsupportedReason() {
        return replayUnsupportedReason;
    }


    /**
     * Sets the replayUnsupportedReason value for this HostCapability.
     * 
     * @param replayUnsupportedReason
     */
    public void setReplayUnsupportedReason(java.lang.String replayUnsupportedReason) {
        this.replayUnsupportedReason = replayUnsupportedReason;
    }


    /**
     * Gets the loginBySSLThumbprintSupported value for this HostCapability.
     * 
     * @return loginBySSLThumbprintSupported
     */
    public java.lang.Boolean getLoginBySSLThumbprintSupported() {
        return loginBySSLThumbprintSupported;
    }


    /**
     * Sets the loginBySSLThumbprintSupported value for this HostCapability.
     * 
     * @param loginBySSLThumbprintSupported
     */
    public void setLoginBySSLThumbprintSupported(java.lang.Boolean loginBySSLThumbprintSupported) {
        this.loginBySSLThumbprintSupported = loginBySSLThumbprintSupported;
    }


    /**
     * Gets the cloneFromSnapshotSupported value for this HostCapability.
     * 
     * @return cloneFromSnapshotSupported
     */
    public java.lang.Boolean getCloneFromSnapshotSupported() {
        return cloneFromSnapshotSupported;
    }


    /**
     * Sets the cloneFromSnapshotSupported value for this HostCapability.
     * 
     * @param cloneFromSnapshotSupported
     */
    public void setCloneFromSnapshotSupported(java.lang.Boolean cloneFromSnapshotSupported) {
        this.cloneFromSnapshotSupported = cloneFromSnapshotSupported;
    }


    /**
     * Gets the deltaDiskBackingsSupported value for this HostCapability.
     * 
     * @return deltaDiskBackingsSupported
     */
    public java.lang.Boolean getDeltaDiskBackingsSupported() {
        return deltaDiskBackingsSupported;
    }


    /**
     * Sets the deltaDiskBackingsSupported value for this HostCapability.
     * 
     * @param deltaDiskBackingsSupported
     */
    public void setDeltaDiskBackingsSupported(java.lang.Boolean deltaDiskBackingsSupported) {
        this.deltaDiskBackingsSupported = deltaDiskBackingsSupported;
    }


    /**
     * Gets the perVMNetworkTrafficShapingSupported value for this HostCapability.
     * 
     * @return perVMNetworkTrafficShapingSupported
     */
    public java.lang.Boolean getPerVMNetworkTrafficShapingSupported() {
        return perVMNetworkTrafficShapingSupported;
    }


    /**
     * Sets the perVMNetworkTrafficShapingSupported value for this HostCapability.
     * 
     * @param perVMNetworkTrafficShapingSupported
     */
    public void setPerVMNetworkTrafficShapingSupported(java.lang.Boolean perVMNetworkTrafficShapingSupported) {
        this.perVMNetworkTrafficShapingSupported = perVMNetworkTrafficShapingSupported;
    }


    /**
     * Gets the tpmSupported value for this HostCapability.
     * 
     * @return tpmSupported
     */
    public java.lang.Boolean getTpmSupported() {
        return tpmSupported;
    }


    /**
     * Sets the tpmSupported value for this HostCapability.
     * 
     * @param tpmSupported
     */
    public void setTpmSupported(java.lang.Boolean tpmSupported) {
        this.tpmSupported = tpmSupported;
    }


    /**
     * Gets the supportedCpuFeature value for this HostCapability.
     * 
     * @return supportedCpuFeature
     */
    public com.vmware.vim25.HostCpuIdInfo[] getSupportedCpuFeature() {
        return supportedCpuFeature;
    }


    /**
     * Sets the supportedCpuFeature value for this HostCapability.
     * 
     * @param supportedCpuFeature
     */
    public void setSupportedCpuFeature(com.vmware.vim25.HostCpuIdInfo[] supportedCpuFeature) {
        this.supportedCpuFeature = supportedCpuFeature;
    }

    public com.vmware.vim25.HostCpuIdInfo getSupportedCpuFeature(int i) {
        return this.supportedCpuFeature[i];
    }

    public void setSupportedCpuFeature(int i, com.vmware.vim25.HostCpuIdInfo _value) {
        this.supportedCpuFeature[i] = _value;
    }


    /**
     * Gets the virtualExecUsageSupported value for this HostCapability.
     * 
     * @return virtualExecUsageSupported
     */
    public java.lang.Boolean getVirtualExecUsageSupported() {
        return virtualExecUsageSupported;
    }


    /**
     * Sets the virtualExecUsageSupported value for this HostCapability.
     * 
     * @param virtualExecUsageSupported
     */
    public void setVirtualExecUsageSupported(java.lang.Boolean virtualExecUsageSupported) {
        this.virtualExecUsageSupported = virtualExecUsageSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostCapability)) return false;
        HostCapability other = (HostCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.recursiveResourcePoolsSupported == other.isRecursiveResourcePoolsSupported() &&
            this.cpuMemoryResourceConfigurationSupported == other.isCpuMemoryResourceConfigurationSupported() &&
            this.rebootSupported == other.isRebootSupported() &&
            this.shutdownSupported == other.isShutdownSupported() &&
            this.vmotionSupported == other.isVmotionSupported() &&
            this.standbySupported == other.isStandbySupported() &&
            ((this.ipmiSupported==null && other.getIpmiSupported()==null) || 
             (this.ipmiSupported!=null &&
              this.ipmiSupported.equals(other.getIpmiSupported()))) &&
            ((this.maxSupportedVMs==null && other.getMaxSupportedVMs()==null) || 
             (this.maxSupportedVMs!=null &&
              this.maxSupportedVMs.equals(other.getMaxSupportedVMs()))) &&
            ((this.maxRunningVMs==null && other.getMaxRunningVMs()==null) || 
             (this.maxRunningVMs!=null &&
              this.maxRunningVMs.equals(other.getMaxRunningVMs()))) &&
            ((this.maxSupportedVcpus==null && other.getMaxSupportedVcpus()==null) || 
             (this.maxSupportedVcpus!=null &&
              this.maxSupportedVcpus.equals(other.getMaxSupportedVcpus()))) &&
            this.datastorePrincipalSupported == other.isDatastorePrincipalSupported() &&
            this.sanSupported == other.isSanSupported() &&
            this.nfsSupported == other.isNfsSupported() &&
            this.iscsiSupported == other.isIscsiSupported() &&
            this.vlanTaggingSupported == other.isVlanTaggingSupported() &&
            this.nicTeamingSupported == other.isNicTeamingSupported() &&
            this.highGuestMemSupported == other.isHighGuestMemSupported() &&
            this.maintenanceModeSupported == other.isMaintenanceModeSupported() &&
            this.suspendedRelocateSupported == other.isSuspendedRelocateSupported() &&
            this.restrictedSnapshotRelocateSupported == other.isRestrictedSnapshotRelocateSupported() &&
            this.perVmSwapFiles == other.isPerVmSwapFiles() &&
            this.localSwapDatastoreSupported == other.isLocalSwapDatastoreSupported() &&
            this.unsharedSwapVMotionSupported == other.isUnsharedSwapVMotionSupported() &&
            this.backgroundSnapshotsSupported == other.isBackgroundSnapshotsSupported() &&
            this.preAssignedPCIUnitNumbersSupported == other.isPreAssignedPCIUnitNumbersSupported() &&
            this.screenshotSupported == other.isScreenshotSupported() &&
            this.scaledScreenshotSupported == other.isScaledScreenshotSupported() &&
            ((this.storageVMotionSupported==null && other.getStorageVMotionSupported()==null) || 
             (this.storageVMotionSupported!=null &&
              this.storageVMotionSupported.equals(other.getStorageVMotionSupported()))) &&
            ((this.vmotionWithStorageVMotionSupported==null && other.getVmotionWithStorageVMotionSupported()==null) || 
             (this.vmotionWithStorageVMotionSupported!=null &&
              this.vmotionWithStorageVMotionSupported.equals(other.getVmotionWithStorageVMotionSupported()))) &&
            ((this.recordReplaySupported==null && other.getRecordReplaySupported()==null) || 
             (this.recordReplaySupported!=null &&
              this.recordReplaySupported.equals(other.getRecordReplaySupported()))) &&
            ((this.ftSupported==null && other.getFtSupported()==null) || 
             (this.ftSupported!=null &&
              this.ftSupported.equals(other.getFtSupported()))) &&
            ((this.replayUnsupportedReason==null && other.getReplayUnsupportedReason()==null) || 
             (this.replayUnsupportedReason!=null &&
              this.replayUnsupportedReason.equals(other.getReplayUnsupportedReason()))) &&
            ((this.loginBySSLThumbprintSupported==null && other.getLoginBySSLThumbprintSupported()==null) || 
             (this.loginBySSLThumbprintSupported!=null &&
              this.loginBySSLThumbprintSupported.equals(other.getLoginBySSLThumbprintSupported()))) &&
            ((this.cloneFromSnapshotSupported==null && other.getCloneFromSnapshotSupported()==null) || 
             (this.cloneFromSnapshotSupported!=null &&
              this.cloneFromSnapshotSupported.equals(other.getCloneFromSnapshotSupported()))) &&
            ((this.deltaDiskBackingsSupported==null && other.getDeltaDiskBackingsSupported()==null) || 
             (this.deltaDiskBackingsSupported!=null &&
              this.deltaDiskBackingsSupported.equals(other.getDeltaDiskBackingsSupported()))) &&
            ((this.perVMNetworkTrafficShapingSupported==null && other.getPerVMNetworkTrafficShapingSupported()==null) || 
             (this.perVMNetworkTrafficShapingSupported!=null &&
              this.perVMNetworkTrafficShapingSupported.equals(other.getPerVMNetworkTrafficShapingSupported()))) &&
            ((this.tpmSupported==null && other.getTpmSupported()==null) || 
             (this.tpmSupported!=null &&
              this.tpmSupported.equals(other.getTpmSupported()))) &&
            ((this.supportedCpuFeature==null && other.getSupportedCpuFeature()==null) || 
             (this.supportedCpuFeature!=null &&
              java.util.Arrays.equals(this.supportedCpuFeature, other.getSupportedCpuFeature()))) &&
            ((this.virtualExecUsageSupported==null && other.getVirtualExecUsageSupported()==null) || 
             (this.virtualExecUsageSupported!=null &&
              this.virtualExecUsageSupported.equals(other.getVirtualExecUsageSupported())));
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
        _hashCode += (isRecursiveResourcePoolsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCpuMemoryResourceConfigurationSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRebootSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShutdownSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVmotionSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isStandbySupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIpmiSupported() != null) {
            _hashCode += getIpmiSupported().hashCode();
        }
        if (getMaxSupportedVMs() != null) {
            _hashCode += getMaxSupportedVMs().hashCode();
        }
        if (getMaxRunningVMs() != null) {
            _hashCode += getMaxRunningVMs().hashCode();
        }
        if (getMaxSupportedVcpus() != null) {
            _hashCode += getMaxSupportedVcpus().hashCode();
        }
        _hashCode += (isDatastorePrincipalSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSanSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNfsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIscsiSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVlanTaggingSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNicTeamingSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHighGuestMemSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMaintenanceModeSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSuspendedRelocateSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRestrictedSnapshotRelocateSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPerVmSwapFiles() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLocalSwapDatastoreSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUnsharedSwapVMotionSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBackgroundSnapshotsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPreAssignedPCIUnitNumbersSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isScreenshotSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isScaledScreenshotSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStorageVMotionSupported() != null) {
            _hashCode += getStorageVMotionSupported().hashCode();
        }
        if (getVmotionWithStorageVMotionSupported() != null) {
            _hashCode += getVmotionWithStorageVMotionSupported().hashCode();
        }
        if (getRecordReplaySupported() != null) {
            _hashCode += getRecordReplaySupported().hashCode();
        }
        if (getFtSupported() != null) {
            _hashCode += getFtSupported().hashCode();
        }
        if (getReplayUnsupportedReason() != null) {
            _hashCode += getReplayUnsupportedReason().hashCode();
        }
        if (getLoginBySSLThumbprintSupported() != null) {
            _hashCode += getLoginBySSLThumbprintSupported().hashCode();
        }
        if (getCloneFromSnapshotSupported() != null) {
            _hashCode += getCloneFromSnapshotSupported().hashCode();
        }
        if (getDeltaDiskBackingsSupported() != null) {
            _hashCode += getDeltaDiskBackingsSupported().hashCode();
        }
        if (getPerVMNetworkTrafficShapingSupported() != null) {
            _hashCode += getPerVMNetworkTrafficShapingSupported().hashCode();
        }
        if (getTpmSupported() != null) {
            _hashCode += getTpmSupported().hashCode();
        }
        if (getSupportedCpuFeature() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedCpuFeature());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedCpuFeature(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVirtualExecUsageSupported() != null) {
            _hashCode += getVirtualExecUsageSupported().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recursiveResourcePoolsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "recursiveResourcePoolsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuMemoryResourceConfigurationSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuMemoryResourceConfigurationSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rebootSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rebootSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shutdownSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "shutdownSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmotionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmotionSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standbySupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "standbySupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipmiSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipmiSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSupportedVMs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxSupportedVMs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRunningVMs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxRunningVMs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSupportedVcpus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxSupportedVcpus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastorePrincipalSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastorePrincipalSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sanSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sanSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nfsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iscsiSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "iscsiSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanTaggingSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlanTaggingSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicTeamingSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "nicTeamingSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highGuestMemSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "highGuestMemSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceModeSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maintenanceModeSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendedRelocateSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "suspendedRelocateSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictedSnapshotRelocateSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "restrictedSnapshotRelocateSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perVmSwapFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "perVmSwapFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localSwapDatastoreSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "localSwapDatastoreSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unsharedSwapVMotionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "unsharedSwapVMotionSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backgroundSnapshotsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "backgroundSnapshotsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preAssignedPCIUnitNumbersSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "preAssignedPCIUnitNumbersSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screenshotSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "screenshotSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scaledScreenshotSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scaledScreenshotSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageVMotionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storageVMotionSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmotionWithStorageVMotionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmotionWithStorageVMotionSupported"));
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
        elemField.setFieldName("ftSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ftSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replayUnsupportedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "replayUnsupportedReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginBySSLThumbprintSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "loginBySSLThumbprintSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloneFromSnapshotSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cloneFromSnapshotSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deltaDiskBackingsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deltaDiskBackingsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perVMNetworkTrafficShapingSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "perVMNetworkTrafficShapingSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpmSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "tpmSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedCpuFeature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "supportedCpuFeature"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCpuIdInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualExecUsageSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualExecUsageSupported"));
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
