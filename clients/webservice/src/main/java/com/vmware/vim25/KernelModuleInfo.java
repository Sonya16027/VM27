/**
 * KernelModuleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class KernelModuleInfo extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private java.lang.String name;

	private java.lang.String version;

	private java.lang.String filename;

	private java.lang.String optionString;

	private boolean loaded;

	private boolean enabled;

	private int useCount;

	private com.vmware.vim25.KernelModuleSectionInfo readOnlySection;

	private com.vmware.vim25.KernelModuleSectionInfo writableSection;

	private com.vmware.vim25.KernelModuleSectionInfo textSection;

	private com.vmware.vim25.KernelModuleSectionInfo dataSection;

	private com.vmware.vim25.KernelModuleSectionInfo bssSection;

	public KernelModuleInfo() {
	}

	public KernelModuleInfo(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int id,
			java.lang.String name, java.lang.String version,
			java.lang.String filename, java.lang.String optionString,
			boolean loaded, boolean enabled, int useCount,
			com.vmware.vim25.KernelModuleSectionInfo readOnlySection,
			com.vmware.vim25.KernelModuleSectionInfo writableSection,
			com.vmware.vim25.KernelModuleSectionInfo textSection,
			com.vmware.vim25.KernelModuleSectionInfo dataSection,
			com.vmware.vim25.KernelModuleSectionInfo bssSection) {
		super(dynamicType, dynamicProperty);
		this.id = id;
		this.name = name;
		this.version = version;
		this.filename = filename;
		this.optionString = optionString;
		this.loaded = loaded;
		this.enabled = enabled;
		this.useCount = useCount;
		this.readOnlySection = readOnlySection;
		this.writableSection = writableSection;
		this.textSection = textSection;
		this.dataSection = dataSection;
		this.bssSection = bssSection;
	}

	/**
	 * Gets the id value for this KernelModuleInfo.
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id value for this KernelModuleInfo.
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the name value for this KernelModuleInfo.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this KernelModuleInfo.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the version value for this KernelModuleInfo.
	 * 
	 * @return version
	 */
	public java.lang.String getVersion() {
		return version;
	}

	/**
	 * Sets the version value for this KernelModuleInfo.
	 * 
	 * @param version
	 */
	public void setVersion(java.lang.String version) {
		this.version = version;
	}

	/**
	 * Gets the filename value for this KernelModuleInfo.
	 * 
	 * @return filename
	 */
	public java.lang.String getFilename() {
		return filename;
	}

	/**
	 * Sets the filename value for this KernelModuleInfo.
	 * 
	 * @param filename
	 */
	public void setFilename(java.lang.String filename) {
		this.filename = filename;
	}

	/**
	 * Gets the optionString value for this KernelModuleInfo.
	 * 
	 * @return optionString
	 */
	public java.lang.String getOptionString() {
		return optionString;
	}

	/**
	 * Sets the optionString value for this KernelModuleInfo.
	 * 
	 * @param optionString
	 */
	public void setOptionString(java.lang.String optionString) {
		this.optionString = optionString;
	}

	/**
	 * Gets the loaded value for this KernelModuleInfo.
	 * 
	 * @return loaded
	 */
	public boolean isLoaded() {
		return loaded;
	}

	/**
	 * Sets the loaded value for this KernelModuleInfo.
	 * 
	 * @param loaded
	 */
	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}

	/**
	 * Gets the enabled value for this KernelModuleInfo.
	 * 
	 * @return enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled value for this KernelModuleInfo.
	 * 
	 * @param enabled
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Gets the useCount value for this KernelModuleInfo.
	 * 
	 * @return useCount
	 */
	public int getUseCount() {
		return useCount;
	}

	/**
	 * Sets the useCount value for this KernelModuleInfo.
	 * 
	 * @param useCount
	 */
	public void setUseCount(int useCount) {
		this.useCount = useCount;
	}

	/**
	 * Gets the readOnlySection value for this KernelModuleInfo.
	 * 
	 * @return readOnlySection
	 */
	public com.vmware.vim25.KernelModuleSectionInfo getReadOnlySection() {
		return readOnlySection;
	}

	/**
	 * Sets the readOnlySection value for this KernelModuleInfo.
	 * 
	 * @param readOnlySection
	 */
	public void setReadOnlySection(
			com.vmware.vim25.KernelModuleSectionInfo readOnlySection) {
		this.readOnlySection = readOnlySection;
	}

	/**
	 * Gets the writableSection value for this KernelModuleInfo.
	 * 
	 * @return writableSection
	 */
	public com.vmware.vim25.KernelModuleSectionInfo getWritableSection() {
		return writableSection;
	}

	/**
	 * Sets the writableSection value for this KernelModuleInfo.
	 * 
	 * @param writableSection
	 */
	public void setWritableSection(
			com.vmware.vim25.KernelModuleSectionInfo writableSection) {
		this.writableSection = writableSection;
	}

	/**
	 * Gets the textSection value for this KernelModuleInfo.
	 * 
	 * @return textSection
	 */
	public com.vmware.vim25.KernelModuleSectionInfo getTextSection() {
		return textSection;
	}

	/**
	 * Sets the textSection value for this KernelModuleInfo.
	 * 
	 * @param textSection
	 */
	public void setTextSection(
			com.vmware.vim25.KernelModuleSectionInfo textSection) {
		this.textSection = textSection;
	}

	/**
	 * Gets the dataSection value for this KernelModuleInfo.
	 * 
	 * @return dataSection
	 */
	public com.vmware.vim25.KernelModuleSectionInfo getDataSection() {
		return dataSection;
	}

	/**
	 * Sets the dataSection value for this KernelModuleInfo.
	 * 
	 * @param dataSection
	 */
	public void setDataSection(
			com.vmware.vim25.KernelModuleSectionInfo dataSection) {
		this.dataSection = dataSection;
	}

	/**
	 * Gets the bssSection value for this KernelModuleInfo.
	 * 
	 * @return bssSection
	 */
	public com.vmware.vim25.KernelModuleSectionInfo getBssSection() {
		return bssSection;
	}

	/**
	 * Sets the bssSection value for this KernelModuleInfo.
	 * 
	 * @param bssSection
	 */
	public void setBssSection(
			com.vmware.vim25.KernelModuleSectionInfo bssSection) {
		this.bssSection = bssSection;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof KernelModuleInfo)) {
			return false;
		}
		KernelModuleInfo other = (KernelModuleInfo) obj;
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
				&& this.id == other.getId()
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.version == null && other.getVersion() == null) || (this.version != null && this.version
						.equals(other.getVersion())))
				&& ((this.filename == null && other.getFilename() == null) || (this.filename != null && this.filename
						.equals(other.getFilename())))
				&& ((this.optionString == null && other.getOptionString() == null) || (this.optionString != null && this.optionString
						.equals(other.getOptionString())))
				&& this.loaded == other.isLoaded()
				&& this.enabled == other.isEnabled()
				&& this.useCount == other.getUseCount()
				&& ((this.readOnlySection == null && other.getReadOnlySection() == null) || (this.readOnlySection != null && this.readOnlySection
						.equals(other.getReadOnlySection())))
				&& ((this.writableSection == null && other.getWritableSection() == null) || (this.writableSection != null && this.writableSection
						.equals(other.getWritableSection())))
				&& ((this.textSection == null && other.getTextSection() == null) || (this.textSection != null && this.textSection
						.equals(other.getTextSection())))
				&& ((this.dataSection == null && other.getDataSection() == null) || (this.dataSection != null && this.dataSection
						.equals(other.getDataSection())))
				&& ((this.bssSection == null && other.getBssSection() == null) || (this.bssSection != null && this.bssSection
						.equals(other.getBssSection())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	@Override
	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = super.hashCode();
		_hashCode += getId();
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getVersion() != null) {
			_hashCode += getVersion().hashCode();
		}
		if (getFilename() != null) {
			_hashCode += getFilename().hashCode();
		}
		if (getOptionString() != null) {
			_hashCode += getOptionString().hashCode();
		}
		_hashCode += (isLoaded() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += getUseCount();
		if (getReadOnlySection() != null) {
			_hashCode += getReadOnlySection().hashCode();
		}
		if (getWritableSection() != null) {
			_hashCode += getWritableSection().hashCode();
		}
		if (getTextSection() != null) {
			_hashCode += getTextSection().hashCode();
		}
		if (getDataSection() != null) {
			_hashCode += getDataSection().hashCode();
		}
		if (getBssSection() != null) {
			_hashCode += getBssSection().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			KernelModuleInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KernelModuleInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("version");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"version"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("filename");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"filename"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("optionString");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"optionString"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("loaded");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"loaded"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("enabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"enabled"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("useCount");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"useCount"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("readOnlySection");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"readOnlySection"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KernelModuleSectionInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("writableSection");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"writableSection"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KernelModuleSectionInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("textSection");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"textSection"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KernelModuleSectionInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dataSection");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"dataSection"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KernelModuleSectionInfo"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("bssSection");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"bssSection"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"KernelModuleSectionInfo"));
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
