/**
 * VirtualMachineConfigSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineConfigSpec  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.String changeVersion;

    private java.lang.String name;

    private java.lang.String version;

    private java.lang.String uuid;

    private java.lang.String locationId;

    private java.lang.String guestId;

    private java.lang.String annotation;

    private com.vmware.vim.VirtualMachineFileInfo files;

    private com.vmware.vim.ToolsConfigInfo tools;

    private com.vmware.vim.VirtualMachineFlagInfo flags;

    private com.vmware.vim.VirtualMachineConsolePreferences consolePreferences;

    private com.vmware.vim.VirtualMachineDefaultPowerOpInfo powerOpInfo;

    private java.lang.Integer numCPUs;

    private java.lang.Long memoryMB;

    private com.vmware.vim.VirtualDeviceConfigSpec[] deviceChange;

    private com.vmware.vim.ResourceAllocationInfo cpuAllocation;

    private com.vmware.vim.ResourceAllocationInfo memoryAllocation;

    private com.vmware.vim.VirtualMachineAffinityInfo cpuAffinity;

    private com.vmware.vim.VirtualMachineAffinityInfo memoryAffinity;

    private com.vmware.vim.VirtualMachineNetworkShaperInfo networkShaper;

    private com.vmware.vim.VirtualMachineCpuIdInfoSpec[] cpuFeatureMask;

    private com.vmware.vim.OptionValue[] extraConfig;

    public VirtualMachineConfigSpec() {
    }

    public VirtualMachineConfigSpec(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String changeVersion,
           java.lang.String name,
           java.lang.String version,
           java.lang.String uuid,
           java.lang.String locationId,
           java.lang.String guestId,
           java.lang.String annotation,
           com.vmware.vim.VirtualMachineFileInfo files,
           com.vmware.vim.ToolsConfigInfo tools,
           com.vmware.vim.VirtualMachineFlagInfo flags,
           com.vmware.vim.VirtualMachineConsolePreferences consolePreferences,
           com.vmware.vim.VirtualMachineDefaultPowerOpInfo powerOpInfo,
           java.lang.Integer numCPUs,
           java.lang.Long memoryMB,
           com.vmware.vim.VirtualDeviceConfigSpec[] deviceChange,
           com.vmware.vim.ResourceAllocationInfo cpuAllocation,
           com.vmware.vim.ResourceAllocationInfo memoryAllocation,
           com.vmware.vim.VirtualMachineAffinityInfo cpuAffinity,
           com.vmware.vim.VirtualMachineAffinityInfo memoryAffinity,
           com.vmware.vim.VirtualMachineNetworkShaperInfo networkShaper,
           com.vmware.vim.VirtualMachineCpuIdInfoSpec[] cpuFeatureMask,
           com.vmware.vim.OptionValue[] extraConfig) {
        super(
            dynamicType,
            dynamicProperty);
        this.changeVersion = changeVersion;
        this.name = name;
        this.version = version;
        this.uuid = uuid;
        this.locationId = locationId;
        this.guestId = guestId;
        this.annotation = annotation;
        this.files = files;
        this.tools = tools;
        this.flags = flags;
        this.consolePreferences = consolePreferences;
        this.powerOpInfo = powerOpInfo;
        this.numCPUs = numCPUs;
        this.memoryMB = memoryMB;
        this.deviceChange = deviceChange;
        this.cpuAllocation = cpuAllocation;
        this.memoryAllocation = memoryAllocation;
        this.cpuAffinity = cpuAffinity;
        this.memoryAffinity = memoryAffinity;
        this.networkShaper = networkShaper;
        this.cpuFeatureMask = cpuFeatureMask;
        this.extraConfig = extraConfig;
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
    public com.vmware.vim.VirtualMachineFileInfo getFiles() {
        return files;
    }


    /**
     * Sets the files value for this VirtualMachineConfigSpec.
     * 
     * @param files
     */
    public void setFiles(com.vmware.vim.VirtualMachineFileInfo files) {
        this.files = files;
    }


    /**
     * Gets the tools value for this VirtualMachineConfigSpec.
     * 
     * @return tools
     */
    public com.vmware.vim.ToolsConfigInfo getTools() {
        return tools;
    }


    /**
     * Sets the tools value for this VirtualMachineConfigSpec.
     * 
     * @param tools
     */
    public void setTools(com.vmware.vim.ToolsConfigInfo tools) {
        this.tools = tools;
    }


    /**
     * Gets the flags value for this VirtualMachineConfigSpec.
     * 
     * @return flags
     */
    public com.vmware.vim.VirtualMachineFlagInfo getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this VirtualMachineConfigSpec.
     * 
     * @param flags
     */
    public void setFlags(com.vmware.vim.VirtualMachineFlagInfo flags) {
        this.flags = flags;
    }


    /**
     * Gets the consolePreferences value for this VirtualMachineConfigSpec.
     * 
     * @return consolePreferences
     */
    public com.vmware.vim.VirtualMachineConsolePreferences getConsolePreferences() {
        return consolePreferences;
    }


    /**
     * Sets the consolePreferences value for this VirtualMachineConfigSpec.
     * 
     * @param consolePreferences
     */
    public void setConsolePreferences(com.vmware.vim.VirtualMachineConsolePreferences consolePreferences) {
        this.consolePreferences = consolePreferences;
    }


    /**
     * Gets the powerOpInfo value for this VirtualMachineConfigSpec.
     * 
     * @return powerOpInfo
     */
    public com.vmware.vim.VirtualMachineDefaultPowerOpInfo getPowerOpInfo() {
        return powerOpInfo;
    }


    /**
     * Sets the powerOpInfo value for this VirtualMachineConfigSpec.
     * 
     * @param powerOpInfo
     */
    public void setPowerOpInfo(com.vmware.vim.VirtualMachineDefaultPowerOpInfo powerOpInfo) {
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
     * Gets the deviceChange value for this VirtualMachineConfigSpec.
     * 
     * @return deviceChange
     */
    public com.vmware.vim.VirtualDeviceConfigSpec[] getDeviceChange() {
        return deviceChange;
    }


    /**
     * Sets the deviceChange value for this VirtualMachineConfigSpec.
     * 
     * @param deviceChange
     */
    public void setDeviceChange(com.vmware.vim.VirtualDeviceConfigSpec[] deviceChange) {
        this.deviceChange = deviceChange;
    }

    public com.vmware.vim.VirtualDeviceConfigSpec getDeviceChange(int i) {
        return this.deviceChange[i];
    }

    public void setDeviceChange(int i, com.vmware.vim.VirtualDeviceConfigSpec _value) {
        this.deviceChange[i] = _value;
    }


    /**
     * Gets the cpuAllocation value for this VirtualMachineConfigSpec.
     * 
     * @return cpuAllocation
     */
    public com.vmware.vim.ResourceAllocationInfo getCpuAllocation() {
        return cpuAllocation;
    }


    /**
     * Sets the cpuAllocation value for this VirtualMachineConfigSpec.
     * 
     * @param cpuAllocation
     */
    public void setCpuAllocation(com.vmware.vim.ResourceAllocationInfo cpuAllocation) {
        this.cpuAllocation = cpuAllocation;
    }


    /**
     * Gets the memoryAllocation value for this VirtualMachineConfigSpec.
     * 
     * @return memoryAllocation
     */
    public com.vmware.vim.ResourceAllocationInfo getMemoryAllocation() {
        return memoryAllocation;
    }


    /**
     * Sets the memoryAllocation value for this VirtualMachineConfigSpec.
     * 
     * @param memoryAllocation
     */
    public void setMemoryAllocation(com.vmware.vim.ResourceAllocationInfo memoryAllocation) {
        this.memoryAllocation = memoryAllocation;
    }


    /**
     * Gets the cpuAffinity value for this VirtualMachineConfigSpec.
     * 
     * @return cpuAffinity
     */
    public com.vmware.vim.VirtualMachineAffinityInfo getCpuAffinity() {
        return cpuAffinity;
    }


    /**
     * Sets the cpuAffinity value for this VirtualMachineConfigSpec.
     * 
     * @param cpuAffinity
     */
    public void setCpuAffinity(com.vmware.vim.VirtualMachineAffinityInfo cpuAffinity) {
        this.cpuAffinity = cpuAffinity;
    }


    /**
     * Gets the memoryAffinity value for this VirtualMachineConfigSpec.
     * 
     * @return memoryAffinity
     */
    public com.vmware.vim.VirtualMachineAffinityInfo getMemoryAffinity() {
        return memoryAffinity;
    }


    /**
     * Sets the memoryAffinity value for this VirtualMachineConfigSpec.
     * 
     * @param memoryAffinity
     */
    public void setMemoryAffinity(com.vmware.vim.VirtualMachineAffinityInfo memoryAffinity) {
        this.memoryAffinity = memoryAffinity;
    }


    /**
     * Gets the networkShaper value for this VirtualMachineConfigSpec.
     * 
     * @return networkShaper
     */
    public com.vmware.vim.VirtualMachineNetworkShaperInfo getNetworkShaper() {
        return networkShaper;
    }


    /**
     * Sets the networkShaper value for this VirtualMachineConfigSpec.
     * 
     * @param networkShaper
     */
    public void setNetworkShaper(com.vmware.vim.VirtualMachineNetworkShaperInfo networkShaper) {
        this.networkShaper = networkShaper;
    }


    /**
     * Gets the cpuFeatureMask value for this VirtualMachineConfigSpec.
     * 
     * @return cpuFeatureMask
     */
    public com.vmware.vim.VirtualMachineCpuIdInfoSpec[] getCpuFeatureMask() {
        return cpuFeatureMask;
    }


    /**
     * Sets the cpuFeatureMask value for this VirtualMachineConfigSpec.
     * 
     * @param cpuFeatureMask
     */
    public void setCpuFeatureMask(com.vmware.vim.VirtualMachineCpuIdInfoSpec[] cpuFeatureMask) {
        this.cpuFeatureMask = cpuFeatureMask;
    }

    public com.vmware.vim.VirtualMachineCpuIdInfoSpec getCpuFeatureMask(int i) {
        return this.cpuFeatureMask[i];
    }

    public void setCpuFeatureMask(int i, com.vmware.vim.VirtualMachineCpuIdInfoSpec _value) {
        this.cpuFeatureMask[i] = _value;
    }


    /**
     * Gets the extraConfig value for this VirtualMachineConfigSpec.
     * 
     * @return extraConfig
     */
    public com.vmware.vim.OptionValue[] getExtraConfig() {
        return extraConfig;
    }


    /**
     * Sets the extraConfig value for this VirtualMachineConfigSpec.
     * 
     * @param extraConfig
     */
    public void setExtraConfig(com.vmware.vim.OptionValue[] extraConfig) {
        this.extraConfig = extraConfig;
    }

    public com.vmware.vim.OptionValue getExtraConfig(int i) {
        return this.extraConfig[i];
    }

    public void setExtraConfig(int i, com.vmware.vim.OptionValue _value) {
        this.extraConfig[i] = _value;
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
            ((this.locationId==null && other.getLocationId()==null) || 
             (this.locationId!=null &&
              this.locationId.equals(other.getLocationId()))) &&
            ((this.guestId==null && other.getGuestId()==null) || 
             (this.guestId!=null &&
              this.guestId.equals(other.getGuestId()))) &&
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
              java.util.Arrays.equals(this.extraConfig, other.getExtraConfig())));
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
        if (getLocationId() != null) {
            _hashCode += getLocationId().hashCode();
        }
        if (getGuestId() != null) {
            _hashCode += getGuestId().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineConfigSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineConfigSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "changeVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "locationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "guestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "annotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("files");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "files"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineFileInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tools");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "tools"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ToolsConfigInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineFlagInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolePreferences");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "consolePreferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineConsolePreferences"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powerOpInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "powerOpInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineDefaultPowerOpInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCPUs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "numCPUs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "memoryMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "deviceChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualDeviceConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "cpuAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ResourceAllocationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "memoryAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ResourceAllocationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuAffinity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "cpuAffinity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineAffinityInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryAffinity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "memoryAffinity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineAffinityInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkShaper");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "networkShaper"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineNetworkShaperInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuFeatureMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "cpuFeatureMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineCpuIdInfoSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "extraConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "OptionValue"));
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
