/**
 * VirtualMachineConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineConfigSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String changeVersion;

    private java.lang.String name;

    private java.lang.String version;

    private java.lang.String uuid;

    private java.lang.String instanceUuid;

    private long[] npivNodeWorldWideName;

    private long[] npivPortWorldWideName;

    private java.lang.String npivWorldWideNameType;

    private java.lang.Short npivDesiredNodeWwns;

    private java.lang.Short npivDesiredPortWwns;

    private java.lang.Boolean npivTemporaryDisabled;

    private java.lang.Boolean npivOnNonRdmDisks;

    private java.lang.String npivWorldWideNameOp;

    private java.lang.String locationId;

    private java.lang.String guestId;

    private java.lang.String alternateGuestName;

    private java.lang.String annotation;

    private com.vmware.vim25.VirtualMachineFileInfo files;

    private com.vmware.vim25.ToolsConfigInfo tools;

    private com.vmware.vim25.VirtualMachineFlagInfo flags;

    private com.vmware.vim25.VirtualMachineConsolePreferences consolePreferences;

    private com.vmware.vim25.VirtualMachineDefaultPowerOpInfo powerOpInfo;

    private java.lang.Integer numCPUs;

    private java.lang.Long memoryMB;

    private java.lang.Boolean memoryHotAddEnabled;

    private java.lang.Boolean cpuHotAddEnabled;

    private java.lang.Boolean cpuHotRemoveEnabled;

    private com.vmware.vim25.VirtualDeviceConfigSpec[] deviceChange;

    private com.vmware.vim25.ResourceAllocationInfo cpuAllocation;

    private com.vmware.vim25.ResourceAllocationInfo memoryAllocation;

    private com.vmware.vim25.VirtualMachineAffinityInfo cpuAffinity;

    private com.vmware.vim25.VirtualMachineAffinityInfo memoryAffinity;

    private com.vmware.vim25.VirtualMachineNetworkShaperInfo networkShaper;

    private com.vmware.vim25.VirtualMachineCpuIdInfoSpec[] cpuFeatureMask;

    private com.vmware.vim25.OptionValue[] extraConfig;

    private java.lang.String swapPlacement;

    private com.vmware.vim25.VirtualMachineBootOptions bootOptions;

    private com.vmware.vim25.VmConfigSpec vAppConfig;

    private com.vmware.vim25.FaultToleranceConfigInfo ftInfo;

    private java.lang.Boolean vAppConfigRemoved;

    private java.lang.Boolean vAssertsEnabled;

    private java.lang.Boolean changeTrackingEnabled;

    public VirtualMachineConfigSpec() {
    }

    public VirtualMachineConfigSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String changeVersion,
           java.lang.String name,
           java.lang.String version,
           java.lang.String uuid,
           java.lang.String instanceUuid,
           long[] npivNodeWorldWideName,
           long[] npivPortWorldWideName,
           java.lang.String npivWorldWideNameType,
           java.lang.Short npivDesiredNodeWwns,
           java.lang.Short npivDesiredPortWwns,
           java.lang.Boolean npivTemporaryDisabled,
           java.lang.Boolean npivOnNonRdmDisks,
           java.lang.String npivWorldWideNameOp,
           java.lang.String locationId,
           java.lang.String guestId,
           java.lang.String alternateGuestName,
           java.lang.String annotation,
           com.vmware.vim25.VirtualMachineFileInfo files,
           com.vmware.vim25.ToolsConfigInfo tools,
           com.vmware.vim25.VirtualMachineFlagInfo flags,
           com.vmware.vim25.VirtualMachineConsolePreferences consolePreferences,
           com.vmware.vim25.VirtualMachineDefaultPowerOpInfo powerOpInfo,
           java.lang.Integer numCPUs,
           java.lang.Long memoryMB,
           java.lang.Boolean memoryHotAddEnabled,
           java.lang.Boolean cpuHotAddEnabled,
           java.lang.Boolean cpuHotRemoveEnabled,
           com.vmware.vim25.VirtualDeviceConfigSpec[] deviceChange,
           com.vmware.vim25.ResourceAllocationInfo cpuAllocation,
           com.vmware.vim25.ResourceAllocationInfo memoryAllocation,
           com.vmware.vim25.VirtualMachineAffinityInfo cpuAffinity,
           com.vmware.vim25.VirtualMachineAffinityInfo memoryAffinity,
           com.vmware.vim25.VirtualMachineNetworkShaperInfo networkShaper,
           com.vmware.vim25.VirtualMachineCpuIdInfoSpec[] cpuFeatureMask,
           com.vmware.vim25.OptionValue[] extraConfig,
           java.lang.String swapPlacement,
           com.vmware.vim25.VirtualMachineBootOptions bootOptions,
           com.vmware.vim25.VmConfigSpec vAppConfig,
           com.vmware.vim25.FaultToleranceConfigInfo ftInfo,
           java.lang.Boolean vAppConfigRemoved,
           java.lang.Boolean vAssertsEnabled,
           java.lang.Boolean changeTrackingEnabled) {
        super(
            dynamicType,
            dynamicProperty);
        this.changeVersion = changeVersion;
        this.name = name;
        this.version = version;
        this.uuid = uuid;
        this.instanceUuid = instanceUuid;
        this.npivNodeWorldWideName = npivNodeWorldWideName;
        this.npivPortWorldWideName = npivPortWorldWideName;
        this.npivWorldWideNameType = npivWorldWideNameType;
        this.npivDesiredNodeWwns = npivDesiredNodeWwns;
        this.npivDesiredPortWwns = npivDesiredPortWwns;
        this.npivTemporaryDisabled = npivTemporaryDisabled;
        this.npivOnNonRdmDisks = npivOnNonRdmDisks;
        this.npivWorldWideNameOp = npivWorldWideNameOp;
        this.locationId = locationId;
        this.guestId = guestId;
        this.alternateGuestName = alternateGuestName;
        this.annotation = annotation;
        this.files = files;
        this.tools = tools;
        this.flags = flags;
        this.consolePreferences = consolePreferences;
        this.powerOpInfo = powerOpInfo;
        this.numCPUs = numCPUs;
        this.memoryMB = memoryMB;
        this.memoryHotAddEnabled = memoryHotAddEnabled;
        this.cpuHotAddEnabled = cpuHotAddEnabled;
        this.cpuHotRemoveEnabled = cpuHotRemoveEnabled;
        this.deviceChange = deviceChange;
        this.cpuAllocation = cpuAllocation;
        this.memoryAllocation = memoryAllocation;
        this.cpuAffinity = cpuAffinity;
        this.memoryAffinity = memoryAffinity;
        this.networkShaper = networkShaper;
        this.cpuFeatureMask = cpuFeatureMask;
        this.extraConfig = extraConfig;
        this.swapPlacement = swapPlacement;
        this.bootOptions = bootOptions;
        this.vAppConfig = vAppConfig;
        this.ftInfo = ftInfo;
        this.vAppConfigRemoved = vAppConfigRemoved;
        this.vAssertsEnabled = vAssertsEnabled;
        this.changeTrackingEnabled = changeTrackingEnabled;
    }


    /**
     * Gets the changeVersion value for this VirtualMachineConfigSpec.
     * 
     * @return changeVersion
     */
    public java.lang.String getChangeVersion() {
        return changeVersion;
    }


    /**
     * Sets the changeVersion value for this VirtualMachineConfigSpec.
     * 
     * @param changeVersion
     */
    public void setChangeVersion(java.lang.String changeVersion) {
        this.changeVersion = changeVersion;
    }


    /**
     * Gets the name value for this VirtualMachineConfigSpec.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VirtualMachineConfigSpec.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the version value for this VirtualMachineConfigSpec.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this VirtualMachineConfigSpec.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the uuid value for this VirtualMachineConfigSpec.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this VirtualMachineConfigSpec.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the instanceUuid value for this VirtualMachineConfigSpec.
     * 
     * @return instanceUuid
     */
    public java.lang.String getInstanceUuid() {
        return instanceUuid;
    }


    /**
     * Sets the instanceUuid value for this VirtualMachineConfigSpec.
     * 
     * @param instanceUuid
     */
    public void setInstanceUuid(java.lang.String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }


    /**
     * Gets the npivNodeWorldWideName value for this VirtualMachineConfigSpec.
     * 
     * @return npivNodeWorldWideName
     */
    public long[] getNpivNodeWorldWideName() {
        return npivNodeWorldWideName;
    }


    /**
     * Sets the npivNodeWorldWideName value for this VirtualMachineConfigSpec.
     * 
     * @param npivNodeWorldWideName
     */
    public void setNpivNodeWorldWideName(long[] npivNodeWorldWideName) {
        this.npivNodeWorldWideName = npivNodeWorldWideName;
    }

    public long getNpivNodeWorldWideName(int i) {
        return this.npivNodeWorldWideName[i];
    }

    public void setNpivNodeWorldWideName(int i, long _value) {
        this.npivNodeWorldWideName[i] = _value;
    }


    /**
     * Gets the npivPortWorldWideName value for this VirtualMachineConfigSpec.
     * 
     * @return npivPortWorldWideName
     */
    public long[] getNpivPortWorldWideName() {
        return npivPortWorldWideName;
    }


    /**
     * Sets the npivPortWorldWideName value for this VirtualMachineConfigSpec.
     * 
     * @param npivPortWorldWideName
     */
    public void setNpivPortWorldWideName(long[] npivPortWorldWideName) {
        this.npivPortWorldWideName = npivPortWorldWideName;
    }

    public long getNpivPortWorldWideName(int i) {
        return this.npivPortWorldWideName[i];
    }

    public void setNpivPortWorldWideName(int i, long _value) {
        this.npivPortWorldWideName[i] = _value;
    }


    /**
     * Gets the npivWorldWideNameType value for this VirtualMachineConfigSpec.
     * 
     * @return npivWorldWideNameType
     */
    public java.lang.String getNpivWorldWideNameType() {
        return npivWorldWideNameType;
    }


    /**
     * Sets the npivWorldWideNameType value for this VirtualMachineConfigSpec.
     * 
     * @param npivWorldWideNameType
     */
    public void setNpivWorldWideNameType(java.lang.String npivWorldWideNameType) {
        this.npivWorldWideNameType = npivWorldWideNameType;
    }


    /**
     * Gets the npivDesiredNodeWwns value for this VirtualMachineConfigSpec.
     * 
     * @return npivDesiredNodeWwns
     */
    public java.lang.Short getNpivDesiredNodeWwns() {
        return npivDesiredNodeWwns;
    }


    /**
     * Sets the npivDesiredNodeWwns value for this VirtualMachineConfigSpec.
     * 
     * @param npivDesiredNodeWwns
     */
    public void setNpivDesiredNodeWwns(java.lang.Short npivDesiredNodeWwns) {
        this.npivDesiredNodeWwns = npivDesiredNodeWwns;
    }


    /**
     * Gets the npivDesiredPortWwns value for this VirtualMachineConfigSpec.
     * 
     * @return npivDesiredPortWwns
     */
    public java.lang.Short getNpivDesiredPortWwns() {
        return npivDesiredPortWwns;
    }


    /**
     * Sets the npivDesiredPortWwns value for this VirtualMachineConfigSpec.
     * 
     * @param npivDesiredPortWwns
     */
    public void setNpivDesiredPortWwns(java.lang.Short npivDesiredPortWwns) {
        this.npivDesiredPortWwns = npivDesiredPortWwns;
    }


    /**
     * Gets the npivTemporaryDisabled value for this VirtualMachineConfigSpec.
     * 
     * @return npivTemporaryDisabled
     */
    public java.lang.Boolean getNpivTemporaryDisabled() {
        return npivTemporaryDisabled;
    }


    /**
     * Sets the npivTemporaryDisabled value for this VirtualMachineConfigSpec.
     * 
     * @param npivTemporaryDisabled
     */
    public void setNpivTemporaryDisabled(java.lang.Boolean npivTemporaryDisabled) {
        this.npivTemporaryDisabled = npivTemporaryDisabled;
    }


    /**
     * Gets the npivOnNonRdmDisks value for this VirtualMachineConfigSpec.
     * 
     * @return npivOnNonRdmDisks
     */
    public java.lang.Boolean getNpivOnNonRdmDisks() {
        return npivOnNonRdmDisks;
    }


    /**
     * Sets the npivOnNonRdmDisks value for this VirtualMachineConfigSpec.
     * 
     * @param npivOnNonRdmDisks
     */
    public void setNpivOnNonRdmDisks(java.lang.Boolean npivOnNonRdmDisks) {
        this.npivOnNonRdmDisks = npivOnNonRdmDisks;
    }


    /**
     * Gets the npivWorldWideNameOp value for this VirtualMachineConfigSpec.
     * 
     * @return npivWorldWideNameOp
     */
    public java.lang.String getNpivWorldWideNameOp() {
        return npivWorldWideNameOp;
    }


    /**
     * Sets the npivWorldWideNameOp value for this VirtualMachineConfigSpec.
     * 
     * @param npivWorldWideNameOp
     */
    public void setNpivWorldWideNameOp(java.lang.String npivWorldWideNameOp) {
        this.npivWorldWideNameOp = npivWorldWideNameOp;
    }


    /**
     * Gets the locationId value for this VirtualMachineConfigSpec.
     * 
     * @return locationId
     */
    public java.lang.String getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this VirtualMachineConfigSpec.
     * 
     * @param locationId
     */
    public void setLocationId(java.lang.String locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the guestId value for this VirtualMachineConfigSpec.
     * 
     * @return guestId
     */
    public java.lang.String getGuestId() {
        return guestId;
    }


    /**
     * Sets the guestId value for this VirtualMachineConfigSpec.
     * 
     * @param guestId
     */
    public void setGuestId(java.lang.String guestId) {
        this.guestId = guestId;
    }


    /**
     * Gets the alternateGuestName value for this VirtualMachineConfigSpec.
     * 
     * @return alternateGuestName
     */
    public java.lang.String getAlternateGuestName() {
        return alternateGuestName;
    }


    /**
     * Sets the alternateGuestName value for this VirtualMachineConfigSpec.
     * 
     * @param alternateGuestName
     */
    public void setAlternateGuestName(java.lang.String alternateGuestName) {
        this.alternateGuestName = alternateGuestName;
    }


    /**
     * Gets the annotation value for this VirtualMachineConfigSpec.
     * 
     * @return annotation
     */
    public java.lang.String getAnnotation() {
        return annotation;
    }


    /**
     * Sets the annotation value for this VirtualMachineConfigSpec.
     * 
     * @param annotation
     */
    public void setAnnotation(java.lang.String annotation) {
        this.annotation = annotation;
    }


    /**
     * Gets the files value for this VirtualMachineConfigSpec.
     * 
     * @return files
     */
    public com.vmware.vim25.VirtualMachineFileInfo getFiles() {
        return files;
    }


    /**
     * Sets the files value for this VirtualMachineConfigSpec.
     * 
     * @param files
     */
    public void setFiles(com.vmware.vim25.VirtualMachineFileInfo files) {
        this.files = files;
    }


    /**
     * Gets the tools value for this VirtualMachineConfigSpec.
     * 
     * @return tools
     */
    public com.vmware.vim25.ToolsConfigInfo getTools() {
        return tools;
    }


    /**
     * Sets the tools value for this VirtualMachineConfigSpec.
     * 
     * @param tools
     */
    public void setTools(com.vmware.vim25.ToolsConfigInfo tools) {
        this.tools = tools;
    }


    /**
     * Gets the flags value for this VirtualMachineConfigSpec.
     * 
     * @return flags
     */
    public com.vmware.vim25.VirtualMachineFlagInfo getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this VirtualMachineConfigSpec.
     * 
     * @param flags
     */
    public void setFlags(com.vmware.vim25.VirtualMachineFlagInfo flags) {
        this.flags = flags;
    }


    /**
     * Gets the consolePreferences value for this VirtualMachineConfigSpec.
     * 
     * @return consolePreferences
     */
    public com.vmware.vim25.VirtualMachineConsolePreferences getConsolePreferences() {
        return consolePreferences;
    }


    /**
     * Sets the consolePreferences value for this VirtualMachineConfigSpec.
     * 
     * @param consolePreferences
     */
    public void setConsolePreferences(com.vmware.vim25.VirtualMachineConsolePreferences consolePreferences) {
        this.consolePreferences = consolePreferences;
    }


    /**
     * Gets the powerOpInfo value for this VirtualMachineConfigSpec.
     * 
     * @return powerOpInfo
     */
    public com.vmware.vim25.VirtualMachineDefaultPowerOpInfo getPowerOpInfo() {
        return powerOpInfo;
    }


    /**
     * Sets the powerOpInfo value for this VirtualMachineConfigSpec.
     * 
     * @param powerOpInfo
     */
    public void setPowerOpInfo(com.vmware.vim25.VirtualMachineDefaultPowerOpInfo powerOpInfo) {
        this.powerOpInfo = powerOpInfo;
    }


    /**
     * Gets the numCPUs value for this VirtualMachineConfigSpec.
     * 
     * @return numCPUs
     */
    public java.lang.Integer getNumCPUs() {
        return numCPUs;
    }


    /**
     * Sets the numCPUs value for this VirtualMachineConfigSpec.
     * 
     * @param numCPUs
     */
    public void setNumCPUs(java.lang.Integer numCPUs) {
        this.numCPUs = numCPUs;
    }


    /**
     * Gets the memoryMB value for this VirtualMachineConfigSpec.
     * 
     * @return memoryMB
     */
    public java.lang.Long getMemoryMB() {
        return memoryMB;
    }


    /**
     * Sets the memoryMB value for this VirtualMachineConfigSpec.
     * 
     * @param memoryMB
     */
    public void setMemoryMB(java.lang.Long memoryMB) {
        this.memoryMB = memoryMB;
    }


    /**
     * Gets the memoryHotAddEnabled value for this VirtualMachineConfigSpec.
     * 
     * @return memoryHotAddEnabled
     */
    public java.lang.Boolean getMemoryHotAddEnabled() {
        return memoryHotAddEnabled;
    }


    /**
     * Sets the memoryHotAddEnabled value for this VirtualMachineConfigSpec.
     * 
     * @param memoryHotAddEnabled
     */
    public void setMemoryHotAddEnabled(java.lang.Boolean memoryHotAddEnabled) {
        this.memoryHotAddEnabled = memoryHotAddEnabled;
    }


    /**
     * Gets the cpuHotAddEnabled value for this VirtualMachineConfigSpec.
     * 
     * @return cpuHotAddEnabled
     */
    public java.lang.Boolean getCpuHotAddEnabled() {
        return cpuHotAddEnabled;
    }


    /**
     * Sets the cpuHotAddEnabled value for this VirtualMachineConfigSpec.
     * 
     * @param cpuHotAddEnabled
     */
    public void setCpuHotAddEnabled(java.lang.Boolean cpuHotAddEnabled) {
        this.cpuHotAddEnabled = cpuHotAddEnabled;
    }


    /**
     * Gets the cpuHotRemoveEnabled value for this VirtualMachineConfigSpec.
     * 
     * @return cpuHotRemoveEnabled
     */
    public java.lang.Boolean getCpuHotRemoveEnabled() {
        return cpuHotRemoveEnabled;
    }


    /**
     * Sets the cpuHotRemoveEnabled value for this VirtualMachineConfigSpec.
     * 
     * @param cpuHotRemoveEnabled
     */
    public void setCpuHotRemoveEnabled(java.lang.Boolean cpuHotRemoveEnabled) {
        this.cpuHotRemoveEnabled = cpuHotRemoveEnabled;
    }


    /**
     * Gets the deviceChange value for this VirtualMachineConfigSpec.
     * 
     * @return deviceChange
     */
    public com.vmware.vim25.VirtualDeviceConfigSpec[] getDeviceChange() {
        return deviceChange;
    }


    /**
     * Sets the deviceChange value for this VirtualMachineConfigSpec.
     * 
     * @param deviceChange
     */
    public void setDeviceChange(com.vmware.vim25.VirtualDeviceConfigSpec[] deviceChange) {
        this.deviceChange = deviceChange;
    }

    public com.vmware.vim25.VirtualDeviceConfigSpec getDeviceChange(int i) {
        return this.deviceChange[i];
    }

    public void setDeviceChange(int i, com.vmware.vim25.VirtualDeviceConfigSpec _value) {
        this.deviceChange[i] = _value;
    }


    /**
     * Gets the cpuAllocation value for this VirtualMachineConfigSpec.
     * 
     * @return cpuAllocation
     */
    public com.vmware.vim25.ResourceAllocationInfo getCpuAllocation() {
        return cpuAllocation;
    }


    /**
     * Sets the cpuAllocation value for this VirtualMachineConfigSpec.
     * 
     * @param cpuAllocation
     */
    public void setCpuAllocation(com.vmware.vim25.ResourceAllocationInfo cpuAllocation) {
        this.cpuAllocation = cpuAllocation;
    }


    /**
     * Gets the memoryAllocation value for this VirtualMachineConfigSpec.
     * 
     * @return memoryAllocation
     */
    public com.vmware.vim25.ResourceAllocationInfo getMemoryAllocation() {
        return memoryAllocation;
    }


    /**
     * Sets the memoryAllocation value for this VirtualMachineConfigSpec.
     * 
     * @param memoryAllocation
     */
    public void setMemoryAllocation(com.vmware.vim25.ResourceAllocationInfo memoryAllocation) {
        this.memoryAllocation = memoryAllocation;
    }


    /**
     * Gets the cpuAffinity value for this VirtualMachineConfigSpec.
     * 
     * @return cpuAffinity
     */
    public com.vmware.vim25.VirtualMachineAffinityInfo getCpuAffinity() {
        return cpuAffinity;
    }


    /**
     * Sets the cpuAffinity value for this VirtualMachineConfigSpec.
     * 
     * @param cpuAffinity
     */
    public void setCpuAffinity(com.vmware.vim25.VirtualMachineAffinityInfo cpuAffinity) {
        this.cpuAffinity = cpuAffinity;
    }


    /**
     * Gets the memoryAffinity value for this VirtualMachineConfigSpec.
     * 
     * @return memoryAffinity
     */
    public com.vmware.vim25.VirtualMachineAffinityInfo getMemoryAffinity() {
        return memoryAffinity;
    }


    /**
     * Sets the memoryAffinity value for this VirtualMachineConfigSpec.
     * 
     * @param memoryAffinity
     */
    public void setMemoryAffinity(com.vmware.vim25.VirtualMachineAffinityInfo memoryAffinity) {
        this.memoryAffinity = memoryAffinity;
    }


    /**
     * Gets the networkShaper value for this VirtualMachineConfigSpec.
     * 
     * @return networkShaper
     */
    public com.vmware.vim25.VirtualMachineNetworkShaperInfo getNetworkShaper() {
        return networkShaper;
    }


    /**
     * Sets the networkShaper value for this VirtualMachineConfigSpec.
     * 
     * @param networkShaper
     */
    public void setNetworkShaper(com.vmware.vim25.VirtualMachineNetworkShaperInfo networkShaper) {
        this.networkShaper = networkShaper;
    }


    /**
     * Gets the cpuFeatureMask value for this VirtualMachineConfigSpec.
     * 
     * @return cpuFeatureMask
     */
    public com.vmware.vim25.VirtualMachineCpuIdInfoSpec[] getCpuFeatureMask() {
        return cpuFeatureMask;
    }


    /**
     * Sets the cpuFeatureMask value for this VirtualMachineConfigSpec.
     * 
     * @param cpuFeatureMask
     */
    public void setCpuFeatureMask(com.vmware.vim25.VirtualMachineCpuIdInfoSpec[] cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public com.vmware.vim25.VirtualMachineCpuIdInfoSpec getCpuFeatureMask(int i) {
        return this.cpuFeatureMask[i];
    }

    public void setCpuFeatureMask(int i, com.vmware.vim25.VirtualMachineCpuIdInfoSpec _value) {
        this.cpuFeatureMask[i] = _value;
    }


    /**
     * Gets the extraConfig value for this VirtualMachineConfigSpec.
     * 
     * @return extraConfig
     */
    public com.vmware.vim25.OptionValue[] getExtraConfig() {
        return extraConfig;
    }


    /**
     * Sets the extraConfig value for this VirtualMachineConfigSpec.
     * 
     * @param extraConfig
     */
    public void setExtraConfig(com.vmware.vim25.OptionValue[] extraConfig) {
        this.extraConfig = extraConfig;
    }

    public com.vmware.vim25.OptionValue getExtraConfig(int i) {
        return this.extraConfig[i];
    }

    public void setExtraConfig(int i, com.vmware.vim25.OptionValue _value) {
        this.extraConfig[i] = _value;
    }


    /**
     * Gets the swapPlacement value for this VirtualMachineConfigSpec.
     * 
     * @return swapPlacement
     */
    public java.lang.String getSwapPlacement() {
        return swapPlacement;
    }


    /**
     * Sets the swapPlacement value for this VirtualMachineConfigSpec.
     * 
     * @param swapPlacement
     */
    public void setSwapPlacement(java.lang.String swapPlacement) {
        this.swapPlacement = swapPlacement;
    }


    /**
     * Gets the bootOptions value for this VirtualMachineConfigSpec.
     * 
     * @return bootOptions
     */
    public com.vmware.vim25.VirtualMachineBootOptions getBootOptions() {
        return bootOptions;
    }


    /**
     * Sets the bootOptions value for this VirtualMachineConfigSpec.
     * 
     * @param bootOptions
     */
    public void setBootOptions(com.vmware.vim25.VirtualMachineBootOptions bootOptions) {
        this.bootOptions = bootOptions;
    }


    /**
     * Gets the vAppConfig value for this VirtualMachineConfigSpec.
     * 
     * @return vAppConfig
     */
    public com.vmware.vim25.VmConfigSpec getVAppConfig() {
        return vAppConfig;
    }


    /**
     * Sets the vAppConfig value for this VirtualMachineConfigSpec.
     * 
     * @param vAppConfig
     */
    public void setVAppConfig(com.vmware.vim25.VmConfigSpec vAppConfig) {
        this.vAppConfig = vAppConfig;
    }


    /**
     * Gets the ftInfo value for this VirtualMachineConfigSpec.
     * 
     * @return ftInfo
     */
    public com.vmware.vim25.FaultToleranceConfigInfo getFtInfo() {
        return ftInfo;
    }


    /**
     * Sets the ftInfo value for this VirtualMachineConfigSpec.
     * 
     * @param ftInfo
     */
    public void setFtInfo(com.vmware.vim25.FaultToleranceConfigInfo ftInfo) {
        this.ftInfo = ftInfo;
    }


    /**
     * Gets the vAppConfigRemoved value for this VirtualMachineConfigSpec.
     * 
     * @return vAppConfigRemoved
     */
    public java.lang.Boolean getVAppConfigRemoved() {
        return vAppConfigRemoved;
    }


    /**
     * Sets the vAppConfigRemoved value for this VirtualMachineConfigSpec.
     * 
     * @param vAppConfigRemoved
     */
    public void setVAppConfigRemoved(java.lang.Boolean vAppConfigRemoved) {
        this.vAppConfigRemoved = vAppConfigRemoved;
    }


    /**
     * Gets the vAssertsEnabled value for this VirtualMachineConfigSpec.
     * 
     * @return vAssertsEnabled
     */
    public java.lang.Boolean getVAssertsEnabled() {
        return vAssertsEnabled;
    }


    /**
     * Sets the vAssertsEnabled value for this VirtualMachineConfigSpec.
     * 
     * @param vAssertsEnabled
     */
    public void setVAssertsEnabled(java.lang.Boolean vAssertsEnabled) {
        this.vAssertsEnabled = vAssertsEnabled;
    }


    /**
     * Gets the changeTrackingEnabled value for this VirtualMachineConfigSpec.
     * 
     * @return changeTrackingEnabled
     */
    public java.lang.Boolean getChangeTrackingEnabled() {
        return changeTrackingEnabled;
    }


    /**
     * Sets the changeTrackingEnabled value for this VirtualMachineConfigSpec.
     * 
     * @param changeTrackingEnabled
     */
    public void setChangeTrackingEnabled(java.lang.Boolean changeTrackingEnabled) {
        this.changeTrackingEnabled = changeTrackingEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineConfigSpec)) return false;
        VirtualMachineConfigSpec other = (VirtualMachineConfigSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.changeVersion==null && other.getChangeVersion()==null) || 
             (this.changeVersion!=null &&
              this.changeVersion.equals(other.getChangeVersion()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.instanceUuid==null && other.getInstanceUuid()==null) || 
             (this.instanceUuid!=null &&
              this.instanceUuid.equals(other.getInstanceUuid()))) &&
            ((this.npivNodeWorldWideName==null && other.getNpivNodeWorldWideName()==null) || 
             (this.npivNodeWorldWideName!=null &&
              java.util.Arrays.equals(this.npivNodeWorldWideName, other.getNpivNodeWorldWideName()))) &&
            ((this.npivPortWorldWideName==null && other.getNpivPortWorldWideName()==null) || 
             (this.npivPortWorldWideName!=null &&
              java.util.Arrays.equals(this.npivPortWorldWideName, other.getNpivPortWorldWideName()))) &&
            ((this.npivWorldWideNameType==null && other.getNpivWorldWideNameType()==null) || 
             (this.npivWorldWideNameType!=null &&
              this.npivWorldWideNameType.equals(other.getNpivWorldWideNameType()))) &&
            ((this.npivDesiredNodeWwns==null && other.getNpivDesiredNodeWwns()==null) || 
             (this.npivDesiredNodeWwns!=null &&
              this.npivDesiredNodeWwns.equals(other.getNpivDesiredNodeWwns()))) &&
            ((this.npivDesiredPortWwns==null && other.getNpivDesiredPortWwns()==null) || 
             (this.npivDesiredPortWwns!=null &&
              this.npivDesiredPortWwns.equals(other.getNpivDesiredPortWwns()))) &&
            ((this.npivTemporaryDisabled==null && other.getNpivTemporaryDisabled()==null) || 
             (this.npivTemporaryDisabled!=null &&
              this.npivTemporaryDisabled.equals(other.getNpivTemporaryDisabled()))) &&
            ((this.npivOnNonRdmDisks==null && other.getNpivOnNonRdmDisks()==null) || 
             (this.npivOnNonRdmDisks!=null &&
              this.npivOnNonRdmDisks.equals(other.getNpivOnNonRdmDisks()))) &&
            ((this.npivWorldWideNameOp==null && other.getNpivWorldWideNameOp()==null) || 
             (this.npivWorldWideNameOp!=null &&
              this.npivWorldWideNameOp.equals(other.getNpivWorldWideNameOp()))) &&
            ((this.locationId==null && other.getLocationId()==null) || 
             (this.locationId!=null &&
              this.locationId.equals(other.getLocationId()))) &&
            ((this.guestId==null && other.getGuestId()==null) || 
             (this.guestId!=null &&
              this.guestId.equals(other.getGuestId()))) &&
            ((this.alternateGuestName==null && other.getAlternateGuestName()==null) || 
             (this.alternateGuestName!=null &&
              this.alternateGuestName.equals(other.getAlternateGuestName()))) &&
            ((this.annotation==null && other.getAnnotation()==null) || 
             (this.annotation!=null &&
              this.annotation.equals(other.getAnnotation()))) &&
            ((this.files==null && other.getFiles()==null) || 
             (this.files!=null &&
              this.files.equals(other.getFiles()))) &&
            ((this.tools==null && other.getTools()==null) || 
             (this.tools!=null &&
              this.tools.equals(other.getTools()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.consolePreferences==null && other.getConsolePreferences()==null) || 
             (this.consolePreferences!=null &&
              this.consolePreferences.equals(other.getConsolePreferences()))) &&
            ((this.powerOpInfo==null && other.getPowerOpInfo()==null) || 
             (this.powerOpInfo!=null &&
              this.powerOpInfo.equals(other.getPowerOpInfo()))) &&
            ((this.numCPUs==null && other.getNumCPUs()==null) || 
             (this.numCPUs!=null &&
              this.numCPUs.equals(other.getNumCPUs()))) &&
            ((this.memoryMB==null && other.getMemoryMB()==null) || 
             (this.memoryMB!=null &&
              this.memoryMB.equals(other.getMemoryMB()))) &&
            ((this.memoryHotAddEnabled==null && other.getMemoryHotAddEnabled()==null) || 
             (this.memoryHotAddEnabled!=null &&
              this.memoryHotAddEnabled.equals(other.getMemoryHotAddEnabled()))) &&
            ((this.cpuHotAddEnabled==null && other.getCpuHotAddEnabled()==null) || 
             (this.cpuHotAddEnabled!=null &&
              this.cpuHotAddEnabled.equals(other.getCpuHotAddEnabled()))) &&
            ((this.cpuHotRemoveEnabled==null && other.getCpuHotRemoveEnabled()==null) || 
             (this.cpuHotRemoveEnabled!=null &&
              this.cpuHotRemoveEnabled.equals(other.getCpuHotRemoveEnabled()))) &&
            ((this.deviceChange==null && other.getDeviceChange()==null) || 
             (this.deviceChange!=null &&
              java.util.Arrays.equals(this.deviceChange, other.getDeviceChange()))) &&
            ((this.cpuAllocation==null && other.getCpuAllocation()==null) || 
             (this.cpuAllocation!=null &&
              this.cpuAllocation.equals(other.getCpuAllocation()))) &&
            ((this.memoryAllocation==null && other.getMemoryAllocation()==null) || 
             (this.memoryAllocation!=null &&
              this.memoryAllocation.equals(other.getMemoryAllocation()))) &&
            ((this.cpuAffinity==null && other.getCpuAffinity()==null) || 
             (this.cpuAffinity!=null &&
              this.cpuAffinity.equals(other.getCpuAffinity()))) &&
            ((this.memoryAffinity==null && other.getMemoryAffinity()==null) || 
             (this.memoryAffinity!=null &&
              this.memoryAffinity.equals(other.getMemoryAffinity()))) &&
            ((this.networkShaper==null && other.getNetworkShaper()==null) || 
             (this.networkShaper!=null &&
              this.networkShaper.equals(other.getNetworkShaper()))) &&
            ((this.cpuFeatureMask==null && other.getCpuFeatureMask()==null) || 
             (this.cpuFeatureMask!=null &&
              java.util.Arrays.equals(this.cpuFeatureMask, other.getCpuFeatureMask()))) &&
            ((this.extraConfig==null && other.getExtraConfig()==null) || 
             (this.extraConfig!=null &&
              java.util.Arrays.equals(this.extraConfig, other.getExtraConfig()))) &&
            ((this.swapPlacement==null && other.getSwapPlacement()==null) || 
             (this.swapPlacement!=null &&
              this.swapPlacement.equals(other.getSwapPlacement()))) &&
            ((this.bootOptions==null && other.getBootOptions()==null) || 
             (this.bootOptions!=null &&
              this.bootOptions.equals(other.getBootOptions()))) &&
            ((this.vAppConfig==null && other.getVAppConfig()==null) || 
             (this.vAppConfig!=null &&
              this.vAppConfig.equals(other.getVAppConfig()))) &&
            ((this.ftInfo==null && other.getFtInfo()==null) || 
             (this.ftInfo!=null &&
              this.ftInfo.equals(other.getFtInfo()))) &&
            ((this.vAppConfigRemoved==null && other.getVAppConfigRemoved()==null) || 
             (this.vAppConfigRemoved!=null &&
              this.vAppConfigRemoved.equals(other.getVAppConfigRemoved()))) &&
            ((this.vAssertsEnabled==null && other.getVAssertsEnabled()==null) || 
             (this.vAssertsEnabled!=null &&
              this.vAssertsEnabled.equals(other.getVAssertsEnabled()))) &&
            ((this.changeTrackingEnabled==null && other.getChangeTrackingEnabled()==null) || 
             (this.changeTrackingEnabled!=null &&
              this.changeTrackingEnabled.equals(other.getChangeTrackingEnabled())));
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
        if (getChangeVersion() != null) {
            _hashCode += getChangeVersion().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getInstanceUuid() != null) {
            _hashCode += getInstanceUuid().hashCode();
        }
        if (getNpivNodeWorldWideName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNpivNodeWorldWideName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNpivNodeWorldWideName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNpivPortWorldWideName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNpivPortWorldWideName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNpivPortWorldWideName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNpivWorldWideNameType() != null) {
            _hashCode += getNpivWorldWideNameType().hashCode();
        }
        if (getNpivDesiredNodeWwns() != null) {
            _hashCode += getNpivDesiredNodeWwns().hashCode();
        }
        if (getNpivDesiredPortWwns() != null) {
            _hashCode += getNpivDesiredPortWwns().hashCode();
        }
        if (getNpivTemporaryDisabled() != null) {
            _hashCode += getNpivTemporaryDisabled().hashCode();
        }
        if (getNpivOnNonRdmDisks() != null) {
            _hashCode += getNpivOnNonRdmDisks().hashCode();
        }
        if (getNpivWorldWideNameOp() != null) {
            _hashCode += getNpivWorldWideNameOp().hashCode();
        }
        if (getLocationId() != null) {
            _hashCode += getLocationId().hashCode();
        }
        if (getGuestId() != null) {
            _hashCode += getGuestId().hashCode();
        }
        if (getAlternateGuestName() != null) {
            _hashCode += getAlternateGuestName().hashCode();
        }
        if (getAnnotation() != null) {
            _hashCode += getAnnotation().hashCode();
        }
        if (getFiles() != null) {
            _hashCode += getFiles().hashCode();
        }
        if (getTools() != null) {
            _hashCode += getTools().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getConsolePreferences() != null) {
            _hashCode += getConsolePreferences().hashCode();
        }
        if (getPowerOpInfo() != null) {
            _hashCode += getPowerOpInfo().hashCode();
        }
        if (getNumCPUs() != null) {
            _hashCode += getNumCPUs().hashCode();
        }
        if (getMemoryMB() != null) {
            _hashCode += getMemoryMB().hashCode();
        }
        if (getMemoryHotAddEnabled() != null) {
            _hashCode += getMemoryHotAddEnabled().hashCode();
        }
        if (getCpuHotAddEnabled() != null) {
            _hashCode += getCpuHotAddEnabled().hashCode();
        }
        if (getCpuHotRemoveEnabled() != null) {
            _hashCode += getCpuHotRemoveEnabled().hashCode();
        }
        if (getDeviceChange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeviceChange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeviceChange(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCpuAllocation() != null) {
            _hashCode += getCpuAllocation().hashCode();
        }
        if (getMemoryAllocation() != null) {
            _hashCode += getMemoryAllocation().hashCode();
        }
        if (getCpuAffinity() != null) {
            _hashCode += getCpuAffinity().hashCode();
        }
        if (getMemoryAffinity() != null) {
            _hashCode += getMemoryAffinity().hashCode();
        }
        if (getNetworkShaper() != null) {
            _hashCode += getNetworkShaper().hashCode();
        }
        if (getCpuFeatureMask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCpuFeatureMask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCpuFeatureMask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtraConfig() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtraConfig());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtraConfig(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSwapPlacement() != null) {
            _hashCode += getSwapPlacement().hashCode();
        }
        if (getBootOptions() != null) {
            _hashCode += getBootOptions().hashCode();
        }
        if (getVAppConfig() != null) {
            _hashCode += getVAppConfig().hashCode();
        }
        if (getFtInfo() != null) {
            _hashCode += getFtInfo().hashCode();
        }
        if (getVAppConfigRemoved() != null) {
            _hashCode += getVAppConfigRemoved().hashCode();
        }
        if (getVAssertsEnabled() != null) {
            _hashCode += getVAssertsEnabled().hashCode();
        }
        if (getChangeTrackingEnabled() != null) {
            _hashCode += getChangeTrackingEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "changeVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "instanceUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npivNodeWorldWideName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "npivNodeWorldWideName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npivPortWorldWideName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "npivPortWorldWideName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npivWorldWideNameType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "npivWorldWideNameType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npivDesiredNodeWwns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "npivDesiredNodeWwns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npivDesiredPortWwns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "npivDesiredPortWwns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npivTemporaryDisabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "npivTemporaryDisabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npivOnNonRdmDisks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "npivOnNonRdmDisks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("npivWorldWideNameOp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "npivWorldWideNameOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "locationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "guestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateGuestName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "alternateGuestName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "annotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "files"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tools");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "tools"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ToolsConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFlagInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolePreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "consolePreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConsolePreferences"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerOpInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "powerOpInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineDefaultPowerOpInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCPUs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numCPUs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryHotAddEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryHotAddEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuHotAddEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuHotAddEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuHotRemoveEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuHotRemoveEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deviceChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDeviceConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourceAllocationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourceAllocationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuAffinity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuAffinity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineAffinityInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryAffinity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryAffinity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineAffinityInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkShaper");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "networkShaper"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineNetworkShaperInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuFeatureMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuFeatureMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineCpuIdInfoSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extraConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OptionValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swapPlacement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "swapPlacement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bootOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineBootOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAppConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vAppConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ftInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FaultToleranceConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAppConfigRemoved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vAppConfigRemoved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAssertsEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vAssertsEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeTrackingEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "changeTrackingEnabled"));
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
