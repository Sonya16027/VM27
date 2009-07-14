/**
 * VirtualMachineConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineConfigInfo extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String changeVersion;

	private java.util.Calendar modified;

	private java.lang.String name;

	private java.lang.String guestFullName;

	private java.lang.String version;

	private java.lang.String uuid;

	private java.lang.String locationId;

	private boolean template;

	private java.lang.String guestId;

	private java.lang.String annotation;

	private com.vmware.vim.VirtualMachineFileInfo files;

	private com.vmware.vim.ToolsConfigInfo tools;

	private com.vmware.vim.VirtualMachineFlagInfo flags;

	private com.vmware.vim.VirtualMachineConsolePreferences consolePreferences;

	private com.vmware.vim.VirtualMachineDefaultPowerOpInfo defaultPowerOps;

	private com.vmware.vim.VirtualHardware hardware;

	private com.vmware.vim.ResourceAllocationInfo cpuAllocation;

	private com.vmware.vim.ResourceAllocationInfo memoryAllocation;

	private com.vmware.vim.VirtualMachineAffinityInfo cpuAffinity;

	private com.vmware.vim.VirtualMachineAffinityInfo memoryAffinity;

	private com.vmware.vim.VirtualMachineNetworkShaperInfo networkShaper;

	private com.vmware.vim.OptionValue[] extraConfig;

	private com.vmware.vim.HostCpuIdInfo[] cpuFeatureMask;

	private com.vmware.vim.VirtualMachineConfigInfoDatastoreUrlPair[] datastoreUrl;

	public VirtualMachineConfigInfo() {
	}

	public VirtualMachineConfigInfo(
			java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String changeVersion,
			java.util.Calendar modified,
			java.lang.String name,
			java.lang.String guestFullName,
			java.lang.String version,
			java.lang.String uuid,
			java.lang.String locationId,
			boolean template,
			java.lang.String guestId,
			java.lang.String annotation,
			com.vmware.vim.VirtualMachineFileInfo files,
			com.vmware.vim.ToolsConfigInfo tools,
			com.vmware.vim.VirtualMachineFlagInfo flags,
			com.vmware.vim.VirtualMachineConsolePreferences consolePreferences,
			com.vmware.vim.VirtualMachineDefaultPowerOpInfo defaultPowerOps,
			com.vmware.vim.VirtualHardware hardware,
			com.vmware.vim.ResourceAllocationInfo cpuAllocation,
			com.vmware.vim.ResourceAllocationInfo memoryAllocation,
			com.vmware.vim.VirtualMachineAffinityInfo cpuAffinity,
			com.vmware.vim.VirtualMachineAffinityInfo memoryAffinity,
			com.vmware.vim.VirtualMachineNetworkShaperInfo networkShaper,
			com.vmware.vim.OptionValue[] extraConfig,
			com.vmware.vim.HostCpuIdInfo[] cpuFeatureMask,
			com.vmware.vim.VirtualMachineConfigInfoDatastoreUrlPair[] datastoreUrl) {
		super(dynamicType, dynamicProperty);
		this.changeVersion = changeVersion;
		this.modified = modified;
		this.name = name;
		this.guestFullName = guestFullName;
		this.version = version;
		this.uuid = uuid;
		this.locationId = locationId;
		this.template = template;
		this.guestId = guestId;
		this.annotation = annotation;
		this.files = files;
		this.tools = tools;
		this.flags = flags;
		this.consolePreferences = consolePreferences;
		this.defaultPowerOps = defaultPowerOps;
		this.hardware = hardware;
		this.cpuAllocation = cpuAllocation;
		this.memoryAllocation = memoryAllocation;
		this.cpuAffinity = cpuAffinity;
		this.memoryAffinity = memoryAffinity;
		this.networkShaper = networkShaper;
		this.extraConfig = extraConfig;
		this.cpuFeatureMask = cpuFeatureMask;
		this.datastoreUrl = datastoreUrl;
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
	public com.vmware.vim.VirtualMachineFileInfo getFiles() {
		return files;
	}

	/**
	 * Sets the files value for this VirtualMachineConfigInfo.
	 * 
	 * @param files
	 */
	public void setFiles(com.vmware.vim.VirtualMachineFileInfo files) {
		this.files = files;
	}

	/**
	 * Gets the tools value for this VirtualMachineConfigInfo.
	 * 
	 * @return tools
	 */
	public com.vmware.vim.ToolsConfigInfo getTools() {
		return tools;
	}

	/**
	 * Sets the tools value for this VirtualMachineConfigInfo.
	 * 
	 * @param tools
	 */
	public void setTools(com.vmware.vim.ToolsConfigInfo tools) {
		this.tools = tools;
	}

	/**
	 * Gets the flags value for this VirtualMachineConfigInfo.
	 * 
	 * @return flags
	 */
	public com.vmware.vim.VirtualMachineFlagInfo getFlags() {
		return flags;
	}

	/**
	 * Sets the flags value for this VirtualMachineConfigInfo.
	 * 
	 * @param flags
	 */
	public void setFlags(com.vmware.vim.VirtualMachineFlagInfo flags) {
		this.flags = flags;
	}

	/**
	 * Gets the consolePreferences value for this VirtualMachineConfigInfo.
	 * 
	 * @return consolePreferences
	 */
	public com.vmware.vim.VirtualMachineConsolePreferences getConsolePreferences() {
		return consolePreferences;
	}

	/**
	 * Sets the consolePreferences value for this VirtualMachineConfigInfo.
	 * 
	 * @param consolePreferences
	 */
	public void setConsolePreferences(
			com.vmware.vim.VirtualMachineConsolePreferences consolePreferences) {
		this.consolePreferences = consolePreferences;
	}

	/**
	 * Gets the defaultPowerOps value for this VirtualMachineConfigInfo.
	 * 
	 * @return defaultPowerOps
	 */
	public com.vmware.vim.VirtualMachineDefaultPowerOpInfo getDefaultPowerOps() {
		return defaultPowerOps;
	}

	/**
	 * Sets the defaultPowerOps value for this VirtualMachineConfigInfo.
	 * 
	 * @param defaultPowerOps
	 */
	public void setDefaultPowerOps(
			com.vmware.vim.VirtualMachineDefaultPowerOpInfo defaultPowerOps) {
		this.defaultPowerOps = defaultPowerOps;
	}

	/**
	 * Gets the hardware value for this VirtualMachineConfigInfo.
	 * 
	 * @return hardware
	 */
	public com.vmware.vim.VirtualHardware getHardware() {
		return hardware;
	}

	/**
	 * Sets the hardware value for this VirtualMachineConfigInfo.
	 * 
	 * @param hardware
	 */
	public void setHardware(com.vmware.vim.VirtualHardware hardware) {
		this.hardware = hardware;
	}

	/**
	 * Gets the cpuAllocation value for this VirtualMachineConfigInfo.
	 * 
	 * @return cpuAllocation
	 */
	public com.vmware.vim.ResourceAllocationInfo getCpuAllocation() {
		return cpuAllocation;
	}

	/**
	 * Sets the cpuAllocation value for this VirtualMachineConfigInfo.
	 * 
	 * @param cpuAllocation
	 */
	public void setCpuAllocation(
			com.vmware.vim.ResourceAllocationInfo cpuAllocation) {
		this.cpuAllocation = cpuAllocation;
	}

	/**
	 * Gets the memoryAllocation value for this VirtualMachineConfigInfo.
	 * 
	 * @return memoryAllocation
	 */
	public com.vmware.vim.ResourceAllocationInfo getMemoryAllocation() {
		return memoryAllocation;
	}

	/**
	 * Sets the memoryAllocation value for this VirtualMachineConfigInfo.
	 * 
	 * @param memoryAllocation
	 */
	public void setMemoryAllocation(
			com.vmware.vim.ResourceAllocationInfo memoryAllocation) {
		this.memoryAllocation = memoryAllocation;
	}

	/**
	 * Gets the cpuAffinity value for this VirtualMachineConfigInfo.
	 * 
	 * @return cpuAffinity
	 */
	public com.vmware.vim.VirtualMachineAffinityInfo getCpuAffinity() {
		return cpuAffinity;
	}

	/**
	 * Sets the cpuAffinity value for this VirtualMachineConfigInfo.
	 * 
	 * @param cpuAffinity
	 */
	public void setCpuAffinity(
			com.vmware.vim.VirtualMachineAffinityInfo cpuAffinity) {
		this.cpuAffinity = cpuAffinity;
	}

	/**
	 * Gets the memoryAffinity value for this VirtualMachineConfigInfo.
	 * 
	 * @return memoryAffinity
	 */
	public com.vmware.vim.VirtualMachineAffinityInfo getMemoryAffinity() {
		return memoryAffinity;
	}

	/**
	 * Sets the memoryAffinity value for this VirtualMachineConfigInfo.
	 * 
	 * @param memoryAffinity
	 */
	public void setMemoryAffinity(
			com.vmware.vim.VirtualMachineAffinityInfo memoryAffinity) {
		this.memoryAffinity = memoryAffinity;
	}

	/**
	 * Gets the networkShaper value for this VirtualMachineConfigInfo.
	 * 
	 * @return networkShaper
	 */
	public com.vmware.vim.VirtualMachineNetworkShaperInfo getNetworkShaper() {
		return networkShaper;
	}

	/**
	 * Sets the networkShaper value for this VirtualMachineConfigInfo.
	 * 
	 * @param networkShaper
	 */
	public void setNetworkShaper(
			com.vmware.vim.VirtualMachineNetworkShaperInfo networkShaper) {
		this.networkShaper = networkShaper;
	}

	/**
	 * Gets the extraConfig value for this VirtualMachineConfigInfo.
	 * 
	 * @return extraConfig
	 */
	public com.vmware.vim.OptionValue[] getExtraConfig() {
		return extraConfig;
	}

	/**
	 * Sets the extraConfig value for this VirtualMachineConfigInfo.
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

	/**
	 * Gets the cpuFeatureMask value for this VirtualMachineConfigInfo.
	 * 
	 * @return cpuFeatureMask
	 */
	public com.vmware.vim.HostCpuIdInfo[] getCpuFeatureMask() {
		return cpuFeatureMask;
	}

	/**
	 * Sets the cpuFeatureMask value for this VirtualMachineConfigInfo.
	 * 
	 * @param cpuFeatureMask
	 */
	public void setCpuFeatureMask(com.vmware.vim.HostCpuIdInfo[] cpuFeatureMask) {
		this.cpuFeatureMask = cpuFeatureMask;
	}

	public com.vmware.vim.HostCpuIdInfo getCpuFeatureMask(int i) {
		return this.cpuFeatureMask[i];
	}

	public void setCpuFeatureMask(int i, com.vmware.vim.HostCpuIdInfo _value) {
		this.cpuFeatureMask[i] = _value;
	}

	/**
	 * Gets the datastoreUrl value for this VirtualMachineConfigInfo.
	 * 
	 * @return datastoreUrl
	 */
	public com.vmware.vim.VirtualMachineConfigInfoDatastoreUrlPair[] getDatastoreUrl() {
		return datastoreUrl;
	}

	/**
	 * Sets the datastoreUrl value for this VirtualMachineConfigInfo.
	 * 
	 * @param datastoreUrl
	 */
	public void setDatastoreUrl(
			com.vmware.vim.VirtualMachineConfigInfoDatastoreUrlPair[] datastoreUrl) {
		this.datastoreUrl = datastoreUrl;
	}

	public com.vmware.vim.VirtualMachineConfigInfoDatastoreUrlPair getDatastoreUrl(
			int i) {
		return this.datastoreUrl[i];
	}

	public void setDatastoreUrl(int i,
			com.vmware.vim.VirtualMachineConfigInfoDatastoreUrlPair _value) {
		this.datastoreUrl[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineConfigInfo)) {
			return false;
		}
		VirtualMachineConfigInfo other = (VirtualMachineConfigInfo) obj;
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = super.equals(obj)
				&& ((this.changeVersion == null && other.getChangeVersion() == null) || (this.changeVersion != null && this.changeVersion
						.equals(other.getChangeVersion())))
				&& ((this.modified == null && other.getModified() == null) || (this.modified != null && this.modified
						.equals(other.getModified())))
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.guestFullName == null && other.getGuestFullName() == null) || (this.guestFullName != null && this.guestFullName
						.equals(other.getGuestFullName())))
				&& ((this.version == null && other.getVersion() == null) || (this.version != null && this.version
						.equals(other.getVersion())))
				&& ((this.uuid == null && other.getUuid() == null) || (this.uuid != null && this.uuid
						.equals(other.getUuid())))
				&& ((this.locationId == null && other.getLocationId() == null) || (this.locationId != null && this.locationId
						.equals(other.getLocationId())))
				&& this.template == other.isTemplate()
				&& ((this.guestId == null && other.getGuestId() == null) || (this.guestId != null && this.guestId
						.equals(other.getGuestId())))
				&& ((this.annotation == null && other.getAnnotation() == null) || (this.annotation != null && this.annotation
						.equals(other.getAnnotation())))
				&& ((this.files == null && other.getFiles() == null) || (this.files != null && this.files
						.equals(other.getFiles())))
				&& ((this.tools == null && other.getTools() == null) || (this.tools != null && this.tools
						.equals(other.getTools())))
				&& ((this.flags == null && other.getFlags() == null) || (this.flags != null && this.flags
						.equals(other.getFlags())))
				&& ((this.consolePreferences == null && other
						.getConsolePreferences() == null) || (this.consolePreferences != null && this.consolePreferences
						.equals(other.getConsolePreferences())))
				&& ((this.defaultPowerOps == null && other.getDefaultPowerOps() == null) || (this.defaultPowerOps != null && this.defaultPowerOps
						.equals(other.getDefaultPowerOps())))
				&& ((this.hardware == null && other.getHardware() == null) || (this.hardware != null && this.hardware
						.equals(other.getHardware())))
				&& ((this.cpuAllocation == null && other.getCpuAllocation() == null) || (this.cpuAllocation != null && this.cpuAllocation
						.equals(other.getCpuAllocation())))
				&& ((this.memoryAllocation == null && other
						.getMemoryAllocation() == null) || (this.memoryAllocation != null && this.memoryAllocation
						.equals(other.getMemoryAllocation())))
				&& ((this.cpuAffinity == null && other.getCpuAffinity() == null) || (this.cpuAffinity != null && this.cpuAffinity
						.equals(other.getCpuAffinity())))
				&& ((this.memoryAffinity == null && other.getMemoryAffinity() == null) || (this.memoryAffinity != null && this.memoryAffinity
						.equals(other.getMemoryAffinity())))
				&& ((this.networkShaper == null && other.getNetworkShaper() == null) || (this.networkShaper != null && this.networkShaper
						.equals(other.getNetworkShaper())))
				&& ((this.extraConfig == null && other.getExtraConfig() == null) || (this.extraConfig != null && java.util.Arrays
						.equals(this.extraConfig, other.getExtraConfig())))
				&& ((this.cpuFeatureMask == null && other.getCpuFeatureMask() == null) || (this.cpuFeatureMask != null && java.util.Arrays
						.equals(this.cpuFeatureMask, other.getCpuFeatureMask())))
				&& ((this.datastoreUrl == null && other.getDatastoreUrl() == null) || (this.datastoreUrl != null && java.util.Arrays
						.equals(this.datastoreUrl, other.getDatastoreUrl())));
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
		if (getLocationId() != null) {
			_hashCode += getLocationId().hashCode();
		}
		_hashCode += (isTemplate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getExtraConfig()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getExtraConfig(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getCpuFeatureMask() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getCpuFeatureMask()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getCpuFeatureMask(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDatastoreUrl() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDatastoreUrl()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDatastoreUrl(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineConfigInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineConfigInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("changeVersion");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"changeVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("modified");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"modified"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guestFullName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"guestFullName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("version");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"version"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uuid");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "uuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("locationId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"locationId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("template");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"template"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("guestId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"guestId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("annotation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"annotation"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("files");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "files"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineFileInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("tools");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "tools"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ToolsConfigInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("flags");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "flags"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineFlagInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("consolePreferences");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"consolePreferences"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineConsolePreferences"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("defaultPowerOps");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"defaultPowerOps"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineDefaultPowerOpInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hardware");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"hardware"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualHardware"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpuAllocation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"cpuAllocation"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ResourceAllocationInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memoryAllocation");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"memoryAllocation"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ResourceAllocationInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpuAffinity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"cpuAffinity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineAffinityInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("memoryAffinity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"memoryAffinity"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineAffinityInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("networkShaper");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"networkShaper"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineNetworkShaperInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("extraConfig");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"extraConfig"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"OptionValue"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cpuFeatureMask");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"cpuFeatureMask"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostCpuIdInfo"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datastoreUrl");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"datastoreUrl"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualMachineConfigInfoDatastoreUrlPair"));
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
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

}
