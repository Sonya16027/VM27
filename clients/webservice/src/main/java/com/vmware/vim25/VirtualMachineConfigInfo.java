/**
 * VirtualMachineConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineConfigInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String changeVersion;

    private java.util.Calendar modified;

    private java.lang.String name;

    private java.lang.String guestFullName;

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

    private java.lang.String locationId;

    private boolean template;

    private java.lang.String guestId;

    private java.lang.String alternateGuestName;

    private java.lang.String annotation;

    private com.vmware.vim25.VirtualMachineFileInfo files;

    private com.vmware.vim25.ToolsConfigInfo tools;

    private com.vmware.vim25.VirtualMachineFlagInfo flags;

    private com.vmware.vim25.VirtualMachineConsolePreferences consolePreferences;

    private com.vmware.vim25.VirtualMachineDefaultPowerOpInfo defaultPowerOps;

    private com.vmware.vim25.VirtualHardware hardware;

    private com.vmware.vim25.ResourceAllocationInfo cpuAllocation;

    private com.vmware.vim25.ResourceAllocationInfo memoryAllocation;

    private java.lang.Boolean memoryHotAddEnabled;

    private java.lang.Boolean cpuHotAddEnabled;

    private java.lang.Boolean cpuHotRemoveEnabled;

    private java.lang.Long hotPlugMemoryLimit;

    private java.lang.Long hotPlugMemoryIncrementSize;

    private com.vmware.vim25.VirtualMachineAffinityInfo cpuAffinity;

    private com.vmware.vim25.VirtualMachineAffinityInfo memoryAffinity;

    private com.vmware.vim25.VirtualMachineNetworkShaperInfo networkShaper;

    private com.vmware.vim25.OptionValue[] extraConfig;

    private com.vmware.vim25.HostCpuIdInfo[] cpuFeatureMask;

    private com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair[] datastoreUrl;

    private java.lang.String swapPlacement;

    private com.vmware.vim25.VirtualMachineBootOptions bootOptions;

    private com.vmware.vim25.FaultToleranceConfigInfo ftInfo;

    private com.vmware.vim25.VmConfigInfo vAppConfig;

    private java.lang.Boolean vAssertsEnabled;

    private java.lang.Boolean changeTrackingEnabled;

    public VirtualMachineConfigInfo() {
    }

    public VirtualMachineConfigInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String changeVersion,
           java.util.Calendar modified,
           java.lang.String name,
           java.lang.String guestFullName,
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
           java.lang.String locationId,
           boolean template,
           java.lang.String guestId,
           java.lang.String alternateGuestName,
           java.lang.String annotation,
           com.vmware.vim25.VirtualMachineFileInfo files,
           com.vmware.vim25.ToolsConfigInfo tools,
           com.vmware.vim25.VirtualMachineFlagInfo flags,
           com.vmware.vim25.VirtualMachineConsolePreferences consolePreferences,
           com.vmware.vim25.VirtualMachineDefaultPowerOpInfo defaultPowerOps,
           com.vmware.vim25.VirtualHardware hardware,
           com.vmware.vim25.ResourceAllocationInfo cpuAllocation,
           com.vmware.vim25.ResourceAllocationInfo memoryAllocation,
           java.lang.Boolean memoryHotAddEnabled,
           java.lang.Boolean cpuHotAddEnabled,
           java.lang.Boolean cpuHotRemoveEnabled,
           java.lang.Long hotPlugMemoryLimit,
           java.lang.Long hotPlugMemoryIncrementSize,
           com.vmware.vim25.VirtualMachineAffinityInfo cpuAffinity,
           com.vmware.vim25.VirtualMachineAffinityInfo memoryAffinity,
           com.vmware.vim25.VirtualMachineNetworkShaperInfo networkShaper,
           com.vmware.vim25.OptionValue[] extraConfig,
           com.vmware.vim25.HostCpuIdInfo[] cpuFeatureMask,
           com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair[] datastoreUrl,
           java.lang.String swapPlacement,
           com.vmware.vim25.VirtualMachineBootOptions bootOptions,
           com.vmware.vim25.FaultToleranceConfigInfo ftInfo,
           com.vmware.vim25.VmConfigInfo vAppConfig,
           java.lang.Boolean vAssertsEnabled,
           java.lang.Boolean changeTrackingEnabled) {
        super(
            dynamicType,
            dynamicProperty);
        this.changeVersion = changeVersion;
        this.modified = modified;
        this.name = name;
        this.guestFullName = guestFullName;
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
        this.locationId = locationId;
        this.template = template;
        this.guestId = guestId;
        this.alternateGuestName = alternateGuestName;
        this.annotation = annotation;
        this.files = files;
        this.tools = tools;
        this.flags = flags;
        this.consolePreferences = consolePreferences;
        this.defaultPowerOps = defaultPowerOps;
        this.hardware = hardware;
        this.cpuAllocation = cpuAllocation;
        this.memoryAllocation = memoryAllocation;
        this.memoryHotAddEnabled = memoryHotAddEnabled;
        this.cpuHotAddEnabled = cpuHotAddEnabled;
        this.cpuHotRemoveEnabled = cpuHotRemoveEnabled;
        this.hotPlugMemoryLimit = hotPlugMemoryLimit;
        this.hotPlugMemoryIncrementSize = hotPlugMemoryIncrementSize;
        this.cpuAffinity = cpuAffinity;
        this.memoryAffinity = memoryAffinity;
        this.networkShaper = networkShaper;
        this.extraConfig = extraConfig;
        this.cpuFeatureMask = cpuFeatureMask;
        this.datastoreUrl = datastoreUrl;
        this.swapPlacement = swapPlacement;
        this.bootOptions = bootOptions;
        this.ftInfo = ftInfo;
        this.vAppConfig = vAppConfig;
        this.vAssertsEnabled = vAssertsEnabled;
        this.changeTrackingEnabled = changeTrackingEnabled;
    }


    /**
     * Gets the changeVersion value for this VirtualMachineConfigInfo.
     * 
     * @return changeVersion
     */
    public java.lang.String getChangeVersion() {
        return changeVersion;
    }


    /**
     * Sets the changeVersion value for this VirtualMachineConfigInfo.
     * 
     * @param changeVersion
     */
    public void setChangeVersion(java.lang.String changeVersion) {
        this.changeVersion = changeVersion;
    }


    /**
     * Gets the modified value for this VirtualMachineConfigInfo.
     * 
     * @return modified
     */
    public java.util.Calendar getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this VirtualMachineConfigInfo.
     * 
     * @param modified
     */
    public void setModified(java.util.Calendar modified) {
        this.modified = modified;
    }


    /**
     * Gets the name value for this VirtualMachineConfigInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VirtualMachineConfigInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the guestFullName value for this VirtualMachineConfigInfo.
     * 
     * @return guestFullName
     */
    public java.lang.String getGuestFullName() {
        return guestFullName;
    }


    /**
     * Sets the guestFullName value for this VirtualMachineConfigInfo.
     * 
     * @param guestFullName
     */
    public void setGuestFullName(java.lang.String guestFullName) {
        this.guestFullName = guestFullName;
    }


    /**
     * Gets the version value for this VirtualMachineConfigInfo.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this VirtualMachineConfigInfo.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the uuid value for this VirtualMachineConfigInfo.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this VirtualMachineConfigInfo.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the instanceUuid value for this VirtualMachineConfigInfo.
     * 
     * @return instanceUuid
     */
    public java.lang.String getInstanceUuid() {
        return instanceUuid;
    }


    /**
     * Sets the instanceUuid value for this VirtualMachineConfigInfo.
     * 
     * @param instanceUuid
     */
    public void setInstanceUuid(java.lang.String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }


    /**
     * Gets the npivNodeWorldWideName value for this VirtualMachineConfigInfo.
     * 
     * @return npivNodeWorldWideName
     */
    public long[] getNpivNodeWorldWideName() {
        return npivNodeWorldWideName;
    }


    /**
     * Sets the npivNodeWorldWideName value for this VirtualMachineConfigInfo.
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
     * Gets the npivPortWorldWideName value for this VirtualMachineConfigInfo.
     * 
     * @return npivPortWorldWideName
     */
    public long[] getNpivPortWorldWideName() {
        return npivPortWorldWideName;
    }


    /**
     * Sets the npivPortWorldWideName value for this VirtualMachineConfigInfo.
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
     * Gets the npivWorldWideNameType value for this VirtualMachineConfigInfo.
     * 
     * @return npivWorldWideNameType
     */
    public java.lang.String getNpivWorldWideNameType() {
        return npivWorldWideNameType;
    }


    /**
     * Sets the npivWorldWideNameType value for this VirtualMachineConfigInfo.
     * 
     * @param npivWorldWideNameType
     */
    public void setNpivWorldWideNameType(java.lang.String npivWorldWideNameType) {
        this.npivWorldWideNameType = npivWorldWideNameType;
    }


    /**
     * Gets the npivDesiredNodeWwns value for this VirtualMachineConfigInfo.
     * 
     * @return npivDesiredNodeWwns
     */
    public java.lang.Short getNpivDesiredNodeWwns() {
        return npivDesiredNodeWwns;
    }


    /**
     * Sets the npivDesiredNodeWwns value for this VirtualMachineConfigInfo.
     * 
     * @param npivDesiredNodeWwns
     */
    public void setNpivDesiredNodeWwns(java.lang.Short npivDesiredNodeWwns) {
        this.npivDesiredNodeWwns = npivDesiredNodeWwns;
    }


    /**
     * Gets the npivDesiredPortWwns value for this VirtualMachineConfigInfo.
     * 
     * @return npivDesiredPortWwns
     */
    public java.lang.Short getNpivDesiredPortWwns() {
        return npivDesiredPortWwns;
    }


    /**
     * Sets the npivDesiredPortWwns value for this VirtualMachineConfigInfo.
     * 
     * @param npivDesiredPortWwns
     */
    public void setNpivDesiredPortWwns(java.lang.Short npivDesiredPortWwns) {
        this.npivDesiredPortWwns = npivDesiredPortWwns;
    }


    /**
     * Gets the npivTemporaryDisabled value for this VirtualMachineConfigInfo.
     * 
     * @return npivTemporaryDisabled
     */
    public java.lang.Boolean getNpivTemporaryDisabled() {
        return npivTemporaryDisabled;
    }


    /**
     * Sets the npivTemporaryDisabled value for this VirtualMachineConfigInfo.
     * 
     * @param npivTemporaryDisabled
     */
    public void setNpivTemporaryDisabled(java.lang.Boolean npivTemporaryDisabled) {
        this.npivTemporaryDisabled = npivTemporaryDisabled;
    }


    /**
     * Gets the npivOnNonRdmDisks value for this VirtualMachineConfigInfo.
     * 
     * @return npivOnNonRdmDisks
     */
    public java.lang.Boolean getNpivOnNonRdmDisks() {
        return npivOnNonRdmDisks;
    }


    /**
     * Sets the npivOnNonRdmDisks value for this VirtualMachineConfigInfo.
     * 
     * @param npivOnNonRdmDisks
     */
    public void setNpivOnNonRdmDisks(java.lang.Boolean npivOnNonRdmDisks) {
        this.npivOnNonRdmDisks = npivOnNonRdmDisks;
    }


    /**
     * Gets the locationId value for this VirtualMachineConfigInfo.
     * 
     * @return locationId
     */
    public java.lang.String getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this VirtualMachineConfigInfo.
     * 
     * @param locationId
     */
    public void setLocationId(java.lang.String locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the template value for this VirtualMachineConfigInfo.
     * 
     * @return template
     */
    public boolean isTemplate() {
        return template;
    }


    /**
     * Sets the template value for this VirtualMachineConfigInfo.
     * 
     * @param template
     */
    public void setTemplate(boolean template) {
        this.template = template;
    }


    /**
     * Gets the guestId value for this VirtualMachineConfigInfo.
     * 
     * @return guestId
     */
    public java.lang.String getGuestId() {
        return guestId;
    }


    /**
     * Sets the guestId value for this VirtualMachineConfigInfo.
     * 
     * @param guestId
     */
    public void setGuestId(java.lang.String guestId) {
        this.guestId = guestId;
    }


    /**
     * Gets the alternateGuestName value for this VirtualMachineConfigInfo.
     * 
     * @return alternateGuestName
     */
    public java.lang.String getAlternateGuestName() {
        return alternateGuestName;
    }


    /**
     * Sets the alternateGuestName value for this VirtualMachineConfigInfo.
     * 
     * @param alternateGuestName
     */
    public void setAlternateGuestName(java.lang.String alternateGuestName) {
        this.alternateGuestName = alternateGuestName;
    }


    /**
     * Gets the annotation value for this VirtualMachineConfigInfo.
     * 
     * @return annotation
     */
    public java.lang.String getAnnotation() {
        return annotation;
    }


    /**
     * Sets the annotation value for this VirtualMachineConfigInfo.
     * 
     * @param annotation
     */
    public void setAnnotation(java.lang.String annotation) {
        this.annotation = annotation;
    }


    /**
     * Gets the files value for this VirtualMachineConfigInfo.
     * 
     * @return files
     */
    public com.vmware.vim25.VirtualMachineFileInfo getFiles() {
        return files;
    }


    /**
     * Sets the files value for this VirtualMachineConfigInfo.
     * 
     * @param files
     */
    public void setFiles(com.vmware.vim25.VirtualMachineFileInfo files) {
        this.files = files;
    }


    /**
     * Gets the tools value for this VirtualMachineConfigInfo.
     * 
     * @return tools
     */
    public com.vmware.vim25.ToolsConfigInfo getTools() {
        return tools;
    }


    /**
     * Sets the tools value for this VirtualMachineConfigInfo.
     * 
     * @param tools
     */
    public void setTools(com.vmware.vim25.ToolsConfigInfo tools) {
        this.tools = tools;
    }


    /**
     * Gets the flags value for this VirtualMachineConfigInfo.
     * 
     * @return flags
     */
    public com.vmware.vim25.VirtualMachineFlagInfo getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this VirtualMachineConfigInfo.
     * 
     * @param flags
     */
    public void setFlags(com.vmware.vim25.VirtualMachineFlagInfo flags) {
        this.flags = flags;
    }


    /**
     * Gets the consolePreferences value for this VirtualMachineConfigInfo.
     * 
     * @return consolePreferences
     */
    public com.vmware.vim25.VirtualMachineConsolePreferences getConsolePreferences() {
        return consolePreferences;
    }


    /**
     * Sets the consolePreferences value for this VirtualMachineConfigInfo.
     * 
     * @param consolePreferences
     */
    public void setConsolePreferences(com.vmware.vim25.VirtualMachineConsolePreferences consolePreferences) {
        this.consolePreferences = consolePreferences;
    }


    /**
     * Gets the defaultPowerOps value for this VirtualMachineConfigInfo.
     * 
     * @return defaultPowerOps
     */
    public com.vmware.vim25.VirtualMachineDefaultPowerOpInfo getDefaultPowerOps() {
        return defaultPowerOps;
    }


    /**
     * Sets the defaultPowerOps value for this VirtualMachineConfigInfo.
     * 
     * @param defaultPowerOps
     */
    public void setDefaultPowerOps(com.vmware.vim25.VirtualMachineDefaultPowerOpInfo defaultPowerOps) {
        this.defaultPowerOps = defaultPowerOps;
    }


    /**
     * Gets the hardware value for this VirtualMachineConfigInfo.
     * 
     * @return hardware
     */
    public com.vmware.vim25.VirtualHardware getHardware() {
        return hardware;
    }


    /**
     * Sets the hardware value for this VirtualMachineConfigInfo.
     * 
     * @param hardware
     */
    public void setHardware(com.vmware.vim25.VirtualHardware hardware) {
        this.hardware = hardware;
    }


    /**
     * Gets the cpuAllocation value for this VirtualMachineConfigInfo.
     * 
     * @return cpuAllocation
     */
    public com.vmware.vim25.ResourceAllocationInfo getCpuAllocation() {
        return cpuAllocation;
    }


    /**
     * Sets the cpuAllocation value for this VirtualMachineConfigInfo.
     * 
     * @param cpuAllocation
     */
    public void setCpuAllocation(com.vmware.vim25.ResourceAllocationInfo cpuAllocation) {
        this.cpuAllocation = cpuAllocation;
    }


    /**
     * Gets the memoryAllocation value for this VirtualMachineConfigInfo.
     * 
     * @return memoryAllocation
     */
    public com.vmware.vim25.ResourceAllocationInfo getMemoryAllocation() {
        return memoryAllocation;
    }


    /**
     * Sets the memoryAllocation value for this VirtualMachineConfigInfo.
     * 
     * @param memoryAllocation
     */
    public void setMemoryAllocation(com.vmware.vim25.ResourceAllocationInfo memoryAllocation) {
        this.memoryAllocation = memoryAllocation;
    }


    /**
     * Gets the memoryHotAddEnabled value for this VirtualMachineConfigInfo.
     * 
     * @return memoryHotAddEnabled
     */
    public java.lang.Boolean getMemoryHotAddEnabled() {
        return memoryHotAddEnabled;
    }


    /**
     * Sets the memoryHotAddEnabled value for this VirtualMachineConfigInfo.
     * 
     * @param memoryHotAddEnabled
     */
    public void setMemoryHotAddEnabled(java.lang.Boolean memoryHotAddEnabled) {
        this.memoryHotAddEnabled = memoryHotAddEnabled;
    }


    /**
     * Gets the cpuHotAddEnabled value for this VirtualMachineConfigInfo.
     * 
     * @return cpuHotAddEnabled
     */
    public java.lang.Boolean getCpuHotAddEnabled() {
        return cpuHotAddEnabled;
    }


    /**
     * Sets the cpuHotAddEnabled value for this VirtualMachineConfigInfo.
     * 
     * @param cpuHotAddEnabled
     */
    public void setCpuHotAddEnabled(java.lang.Boolean cpuHotAddEnabled) {
        this.cpuHotAddEnabled = cpuHotAddEnabled;
    }


    /**
     * Gets the cpuHotRemoveEnabled value for this VirtualMachineConfigInfo.
     * 
     * @return cpuHotRemoveEnabled
     */
    public java.lang.Boolean getCpuHotRemoveEnabled() {
        return cpuHotRemoveEnabled;
    }


    /**
     * Sets the cpuHotRemoveEnabled value for this VirtualMachineConfigInfo.
     * 
     * @param cpuHotRemoveEnabled
     */
    public void setCpuHotRemoveEnabled(java.lang.Boolean cpuHotRemoveEnabled) {
        this.cpuHotRemoveEnabled = cpuHotRemoveEnabled;
    }


    /**
     * Gets the hotPlugMemoryLimit value for this VirtualMachineConfigInfo.
     * 
     * @return hotPlugMemoryLimit
     */
    public java.lang.Long getHotPlugMemoryLimit() {
        return hotPlugMemoryLimit;
    }


    /**
     * Sets the hotPlugMemoryLimit value for this VirtualMachineConfigInfo.
     * 
     * @param hotPlugMemoryLimit
     */
    public void setHotPlugMemoryLimit(java.lang.Long hotPlugMemoryLimit) {
        this.hotPlugMemoryLimit = hotPlugMemoryLimit;
    }


    /**
     * Gets the hotPlugMemoryIncrementSize value for this VirtualMachineConfigInfo.
     * 
     * @return hotPlugMemoryIncrementSize
     */
    public java.lang.Long getHotPlugMemoryIncrementSize() {
        return hotPlugMemoryIncrementSize;
    }


    /**
     * Sets the hotPlugMemoryIncrementSize value for this VirtualMachineConfigInfo.
     * 
     * @param hotPlugMemoryIncrementSize
     */
    public void setHotPlugMemoryIncrementSize(java.lang.Long hotPlugMemoryIncrementSize) {
        this.hotPlugMemoryIncrementSize = hotPlugMemoryIncrementSize;
    }


    /**
     * Gets the cpuAffinity value for this VirtualMachineConfigInfo.
     * 
     * @return cpuAffinity
     */
    public com.vmware.vim25.VirtualMachineAffinityInfo getCpuAffinity() {
        return cpuAffinity;
    }


    /**
     * Sets the cpuAffinity value for this VirtualMachineConfigInfo.
     * 
     * @param cpuAffinity
     */
    public void setCpuAffinity(com.vmware.vim25.VirtualMachineAffinityInfo cpuAffinity) {
        this.cpuAffinity = cpuAffinity;
    }


    /**
     * Gets the memoryAffinity value for this VirtualMachineConfigInfo.
     * 
     * @return memoryAffinity
     */
    public com.vmware.vim25.VirtualMachineAffinityInfo getMemoryAffinity() {
        return memoryAffinity;
    }


    /**
     * Sets the memoryAffinity value for this VirtualMachineConfigInfo.
     * 
     * @param memoryAffinity
     */
    public void setMemoryAffinity(com.vmware.vim25.VirtualMachineAffinityInfo memoryAffinity) {
        this.memoryAffinity = memoryAffinity;
    }


    /**
     * Gets the networkShaper value for this VirtualMachineConfigInfo.
     * 
     * @return networkShaper
     */
    public com.vmware.vim25.VirtualMachineNetworkShaperInfo getNetworkShaper() {
        return networkShaper;
    }


    /**
     * Sets the networkShaper value for this VirtualMachineConfigInfo.
     * 
     * @param networkShaper
     */
    public void setNetworkShaper(com.vmware.vim25.VirtualMachineNetworkShaperInfo networkShaper) {
        this.networkShaper = networkShaper;
    }


    /**
     * Gets the extraConfig value for this VirtualMachineConfigInfo.
     * 
     * @return extraConfig
     */
    public com.vmware.vim25.OptionValue[] getExtraConfig() {
        return extraConfig;
    }


    /**
     * Sets the extraConfig value for this VirtualMachineConfigInfo.
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
     * Gets the cpuFeatureMask value for this VirtualMachineConfigInfo.
     * 
     * @return cpuFeatureMask
     */
    public com.vmware.vim25.HostCpuIdInfo[] getCpuFeatureMask() {
        return cpuFeatureMask;
    }


    /**
     * Sets the cpuFeatureMask value for this VirtualMachineConfigInfo.
     * 
     * @param cpuFeatureMask
     */
    public void setCpuFeatureMask(com.vmware.vim25.HostCpuIdInfo[] cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public com.vmware.vim25.HostCpuIdInfo getCpuFeatureMask(int i) {
        return this.cpuFeatureMask[i];
    }

    public void setCpuFeatureMask(int i, com.vmware.vim25.HostCpuIdInfo _value) {
        this.cpuFeatureMask[i] = _value;
    }


    /**
     * Gets the datastoreUrl value for this VirtualMachineConfigInfo.
     * 
     * @return datastoreUrl
     */
    public com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair[] getDatastoreUrl() {
        return datastoreUrl;
    }


    /**
     * Sets the datastoreUrl value for this VirtualMachineConfigInfo.
     * 
     * @param datastoreUrl
     */
    public void setDatastoreUrl(com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair[] datastoreUrl) {
        this.datastoreUrl = datastoreUrl;
    }

    public com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair getDatastoreUrl(int i) {
        return this.datastoreUrl[i];
    }

    public void setDatastoreUrl(int i, com.vmware.vim25.VirtualMachineConfigInfoDatastoreUrlPair _value) {
        this.datastoreUrl[i] = _value;
    }


    /**
     * Gets the swapPlacement value for this VirtualMachineConfigInfo.
     * 
     * @return swapPlacement
     */
    public java.lang.String getSwapPlacement() {
        return swapPlacement;
    }


    /**
     * Sets the swapPlacement value for this VirtualMachineConfigInfo.
     * 
     * @param swapPlacement
     */
    public void setSwapPlacement(java.lang.String swapPlacement) {
        this.swapPlacement = swapPlacement;
    }


    /**
     * Gets the bootOptions value for this VirtualMachineConfigInfo.
     * 
     * @return bootOptions
     */
    public com.vmware.vim25.VirtualMachineBootOptions getBootOptions() {
        return bootOptions;
    }


    /**
     * Sets the bootOptions value for this VirtualMachineConfigInfo.
     * 
     * @param bootOptions
     */
    public void setBootOptions(com.vmware.vim25.VirtualMachineBootOptions bootOptions) {
        this.bootOptions = bootOptions;
    }


    /**
     * Gets the ftInfo value for this VirtualMachineConfigInfo.
     * 
     * @return ftInfo
     */
    public com.vmware.vim25.FaultToleranceConfigInfo getFtInfo() {
        return ftInfo;
    }


    /**
     * Sets the ftInfo value for this VirtualMachineConfigInfo.
     * 
     * @param ftInfo
     */
    public void setFtInfo(com.vmware.vim25.FaultToleranceConfigInfo ftInfo) {
        this.ftInfo = ftInfo;
    }


    /**
     * Gets the vAppConfig value for this VirtualMachineConfigInfo.
     * 
     * @return vAppConfig
     */
    public com.vmware.vim25.VmConfigInfo getVAppConfig() {
        return vAppConfig;
    }


    /**
     * Sets the vAppConfig value for this VirtualMachineConfigInfo.
     * 
     * @param vAppConfig
     */
    public void setVAppConfig(com.vmware.vim25.VmConfigInfo vAppConfig) {
        this.vAppConfig = vAppConfig;
    }


    /**
     * Gets the vAssertsEnabled value for this VirtualMachineConfigInfo.
     * 
     * @return vAssertsEnabled
     */
    public java.lang.Boolean getVAssertsEnabled() {
        return vAssertsEnabled;
    }


    /**
     * Sets the vAssertsEnabled value for this VirtualMachineConfigInfo.
     * 
     * @param vAssertsEnabled
     */
    public void setVAssertsEnabled(java.lang.Boolean vAssertsEnabled) {
        this.vAssertsEnabled = vAssertsEnabled;
    }


    /**
     * Gets the changeTrackingEnabled value for this VirtualMachineConfigInfo.
     * 
     * @return changeTrackingEnabled
     */
    public java.lang.Boolean getChangeTrackingEnabled() {
        return changeTrackingEnabled;
    }


    /**
     * Sets the changeTrackingEnabled value for this VirtualMachineConfigInfo.
     * 
     * @param changeTrackingEnabled
     */
    public void setChangeTrackingEnabled(java.lang.Boolean changeTrackingEnabled) {
        this.changeTrackingEnabled = changeTrackingEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineConfigInfo)) return false;
        VirtualMachineConfigInfo other = (VirtualMachineConfigInfo) obj;
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
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              this.modified.equals(other.getModified()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.guestFullName==null && other.getGuestFullName()==null) || 
             (this.guestFullName!=null &&
              this.guestFullName.equals(other.getGuestFullName()))) &&
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
            ((this.locationId==null && other.getLocationId()==null) || 
             (this.locationId!=null &&
              this.locationId.equals(other.getLocationId()))) &&
            this.template == other.isTemplate() &&
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
            ((this.defaultPowerOps==null && other.getDefaultPowerOps()==null) || 
             (this.defaultPowerOps!=null &&
              this.defaultPowerOps.equals(other.getDefaultPowerOps()))) &&
            ((this.hardware==null && other.getHardware()==null) || 
             (this.hardware!=null &&
              this.hardware.equals(other.getHardware()))) &&
            ((this.cpuAllocation==null && other.getCpuAllocation()==null) || 
             (this.cpuAllocation!=null &&
              this.cpuAllocation.equals(other.getCpuAllocation()))) &&
            ((this.memoryAllocation==null && other.getMemoryAllocation()==null) || 
             (this.memoryAllocation!=null &&
              this.memoryAllocation.equals(other.getMemoryAllocation()))) &&
            ((this.memoryHotAddEnabled==null && other.getMemoryHotAddEnabled()==null) || 
             (this.memoryHotAddEnabled!=null &&
              this.memoryHotAddEnabled.equals(other.getMemoryHotAddEnabled()))) &&
            ((this.cpuHotAddEnabled==null && other.getCpuHotAddEnabled()==null) || 
             (this.cpuHotAddEnabled!=null &&
              this.cpuHotAddEnabled.equals(other.getCpuHotAddEnabled()))) &&
            ((this.cpuHotRemoveEnabled==null && other.getCpuHotRemoveEnabled()==null) || 
             (this.cpuHotRemoveEnabled!=null &&
              this.cpuHotRemoveEnabled.equals(other.getCpuHotRemoveEnabled()))) &&
            ((this.hotPlugMemoryLimit==null && other.getHotPlugMemoryLimit()==null) || 
             (this.hotPlugMemoryLimit!=null &&
              this.hotPlugMemoryLimit.equals(other.getHotPlugMemoryLimit()))) &&
            ((this.hotPlugMemoryIncrementSize==null && other.getHotPlugMemoryIncrementSize()==null) || 
             (this.hotPlugMemoryIncrementSize!=null &&
              this.hotPlugMemoryIncrementSize.equals(other.getHotPlugMemoryIncrementSize()))) &&
            ((this.cpuAffinity==null && other.getCpuAffinity()==null) || 
             (this.cpuAffinity!=null &&
              this.cpuAffinity.equals(other.getCpuAffinity()))) &&
            ((this.memoryAffinity==null && other.getMemoryAffinity()==null) || 
             (this.memoryAffinity!=null &&
              this.memoryAffinity.equals(other.getMemoryAffinity()))) &&
            ((this.networkShaper==null && other.getNetworkShaper()==null) || 
             (this.networkShaper!=null &&
              this.networkShaper.equals(other.getNetworkShaper()))) &&
            ((this.extraConfig==null && other.getExtraConfig()==null) || 
             (this.extraConfig!=null &&
              java.util.Arrays.equals(this.extraConfig, other.getExtraConfig()))) &&
            ((this.cpuFeatureMask==null && other.getCpuFeatureMask()==null) || 
             (this.cpuFeatureMask!=null &&
              java.util.Arrays.equals(this.cpuFeatureMask, other.getCpuFeatureMask()))) &&
            ((this.datastoreUrl==null && other.getDatastoreUrl()==null) || 
             (this.datastoreUrl!=null &&
              java.util.Arrays.equals(this.datastoreUrl, other.getDatastoreUrl()))) &&
            ((this.swapPlacement==null && other.getSwapPlacement()==null) || 
             (this.swapPlacement!=null &&
              this.swapPlacement.equals(other.getSwapPlacement()))) &&
            ((this.bootOptions==null && other.getBootOptions()==null) || 
             (this.bootOptions!=null &&
              this.bootOptions.equals(other.getBootOptions()))) &&
            ((this.ftInfo==null && other.getFtInfo()==null) || 
             (this.ftInfo!=null &&
              this.ftInfo.equals(other.getFtInfo()))) &&
            ((this.vAppConfig==null && other.getVAppConfig()==null) || 
             (this.vAppConfig!=null &&
              this.vAppConfig.equals(other.getVAppConfig()))) &&
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
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getGuestFullName() != null) {
            _hashCode += getGuestFullName().hashCode();
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
        if (getLocationId() != null) {
            _hashCode += getLocationId().hashCode();
        }
        _hashCode += (isTemplate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getDefaultPowerOps() != null) {
            _hashCode += getDefaultPowerOps().hashCode();
        }
        if (getHardware() != null) {
            _hashCode += getHardware().hashCode();
        }
        if (getCpuAllocation() != null) {
            _hashCode += getCpuAllocation().hashCode();
        }
        if (getMemoryAllocation() != null) {
            _hashCode += getMemoryAllocation().hashCode();
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
        if (getHotPlugMemoryLimit() != null) {
            _hashCode += getHotPlugMemoryLimit().hashCode();
        }
        if (getHotPlugMemoryIncrementSize() != null) {
            _hashCode += getHotPlugMemoryIncrementSize().hashCode();
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
        if (getDatastoreUrl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatastoreUrl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatastoreUrl(), i);
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
        if (getFtInfo() != null) {
            _hashCode += getFtInfo().hashCode();
        }
        if (getVAppConfig() != null) {
            _hashCode += getVAppConfig().hashCode();
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
        new org.apache.axis.description.TypeDesc(VirtualMachineConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "changeVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "guestFullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "locationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "template"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "guestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateGuestName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "alternateGuestName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("defaultPowerOps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultPowerOps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineDefaultPowerOpInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardware");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hardware"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualHardware"));
        elemField.setNillable(false);
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
        elemField.setFieldName("hotPlugMemoryLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hotPlugMemoryLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotPlugMemoryIncrementSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hotPlugMemoryIncrementSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("extraConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extraConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OptionValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuFeatureMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuFeatureMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostCpuIdInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastoreUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastoreUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConfigInfoDatastoreUrlPair"));
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
        elemField.setFieldName("ftInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ftInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FaultToleranceConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VAppConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vAppConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmConfigInfo"));
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
