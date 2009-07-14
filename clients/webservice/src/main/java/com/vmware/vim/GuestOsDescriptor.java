/**
 * GuestOsDescriptor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class GuestOsDescriptor extends com.vmware.vim.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String id;

	private java.lang.String family;

	private java.lang.String fullName;

	private int supportedMaxCPUs;

	private int supportedMinMemMB;

	private int supportedMaxMemMB;

	private int recommendedMemMB;

	private int recommendedColorDepth;

	private java.lang.String[] supportedDiskControllerList;

	private java.lang.String recommendedSCSIController;

	private java.lang.String recommendedDiskController;

	private int supportedNumDisks;

	private int recommendedDiskSizeMB;

	private java.lang.String[] supportedEthernetCard;

	private java.lang.String recommendedEthernetCard;

	private java.lang.Boolean supportsSlaveDisk;

	private com.vmware.vim.HostCpuIdInfo[] cpuFeatureMask;

	private boolean supportsWakeOnLan;

	public GuestOsDescriptor() {
	}

	public GuestOsDescriptor(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			java.lang.String id, java.lang.String family,
			java.lang.String fullName, int supportedMaxCPUs,
			int supportedMinMemMB, int supportedMaxMemMB, int recommendedMemMB,
			int recommendedColorDepth,
			java.lang.String[] supportedDiskControllerList,
			java.lang.String recommendedSCSIController,
			java.lang.String recommendedDiskController, int supportedNumDisks,
			int recommendedDiskSizeMB,
			java.lang.String[] supportedEthernetCard,
			java.lang.String recommendedEthernetCard,
			java.lang.Boolean supportsSlaveDisk,
			com.vmware.vim.HostCpuIdInfo[] cpuFeatureMask,
			boolean supportsWakeOnLan) {
		super(dynamicType, dynamicProperty);
		this.id = id;
		this.family = family;
		this.fullName = fullName;
		this.supportedMaxCPUs = supportedMaxCPUs;
		this.supportedMinMemMB = supportedMinMemMB;
		this.supportedMaxMemMB = supportedMaxMemMB;
		this.recommendedMemMB = recommendedMemMB;
		this.recommendedColorDepth = recommendedColorDepth;
		this.supportedDiskControllerList = supportedDiskControllerList;
		this.recommendedSCSIController = recommendedSCSIController;
		this.recommendedDiskController = recommendedDiskController;
		this.supportedNumDisks = supportedNumDisks;
		this.recommendedDiskSizeMB = recommendedDiskSizeMB;
		this.supportedEthernetCard = supportedEthernetCard;
		this.recommendedEthernetCard = recommendedEthernetCard;
		this.supportsSlaveDisk = supportsSlaveDisk;
		this.cpuFeatureMask = cpuFeatureMask;
		this.supportsWakeOnLan = supportsWakeOnLan;
	}

	/**
	 * Gets the id value for this GuestOsDescriptor.
	 * 
	 * @return id
	 */
	public java.lang.String getId() {
		return id;
	}

	/**
	 * Sets the id value for this GuestOsDescriptor.
	 * 
	 * @param id
	 */
	public void setId(java.lang.String id) {
		this.id = id;
	}

	/**
	 * Gets the family value for this GuestOsDescriptor.
	 * 
	 * @return family
	 */
	public java.lang.String getFamily() {
		return family;
	}

	/**
	 * Sets the family value for this GuestOsDescriptor.
	 * 
	 * @param family
	 */
	public void setFamily(java.lang.String family) {
		this.family = family;
	}

	/**
	 * Gets the fullName value for this GuestOsDescriptor.
	 * 
	 * @return fullName
	 */
	public java.lang.String getFullName() {
		return fullName;
	}

	/**
	 * Sets the fullName value for this GuestOsDescriptor.
	 * 
	 * @param fullName
	 */
	public void setFullName(java.lang.String fullName) {
		this.fullName = fullName;
	}

	/**
	 * Gets the supportedMaxCPUs value for this GuestOsDescriptor.
	 * 
	 * @return supportedMaxCPUs
	 */
	public int getSupportedMaxCPUs() {
		return supportedMaxCPUs;
	}

	/**
	 * Sets the supportedMaxCPUs value for this GuestOsDescriptor.
	 * 
	 * @param supportedMaxCPUs
	 */
	public void setSupportedMaxCPUs(int supportedMaxCPUs) {
		this.supportedMaxCPUs = supportedMaxCPUs;
	}

	/**
	 * Gets the supportedMinMemMB value for this GuestOsDescriptor.
	 * 
	 * @return supportedMinMemMB
	 */
	public int getSupportedMinMemMB() {
		return supportedMinMemMB;
	}

	/**
	 * Sets the supportedMinMemMB value for this GuestOsDescriptor.
	 * 
	 * @param supportedMinMemMB
	 */
	public void setSupportedMinMemMB(int supportedMinMemMB) {
		this.supportedMinMemMB = supportedMinMemMB;
	}

	/**
	 * Gets the supportedMaxMemMB value for this GuestOsDescriptor.
	 * 
	 * @return supportedMaxMemMB
	 */
	public int getSupportedMaxMemMB() {
		return supportedMaxMemMB;
	}

	/**
	 * Sets the supportedMaxMemMB value for this GuestOsDescriptor.
	 * 
	 * @param supportedMaxMemMB
	 */
	public void setSupportedMaxMemMB(int supportedMaxMemMB) {
		this.supportedMaxMemMB = supportedMaxMemMB;
	}

	/**
	 * Gets the recommendedMemMB value for this GuestOsDescriptor.
	 * 
	 * @return recommendedMemMB
	 */
	public int getRecommendedMemMB() {
		return recommendedMemMB;
	}

	/**
	 * Sets the recommendedMemMB value for this GuestOsDescriptor.
	 * 
	 * @param recommendedMemMB
	 */
	public void setRecommendedMemMB(int recommendedMemMB) {
		this.recommendedMemMB = recommendedMemMB;
	}

	/**
	 * Gets the recommendedColorDepth value for this GuestOsDescriptor.
	 * 
	 * @return recommendedColorDepth
	 */
	public int getRecommendedColorDepth() {
		return recommendedColorDepth;
	}

	/**
	 * Sets the recommendedColorDepth value for this GuestOsDescriptor.
	 * 
	 * @param recommendedColorDepth
	 */
	public void setRecommendedColorDepth(int recommendedColorDepth) {
		this.recommendedColorDepth = recommendedColorDepth;
	}

	/**
	 * Gets the supportedDiskControllerList value for this GuestOsDescriptor.
	 * 
	 * @return supportedDiskControllerList
	 */
	public java.lang.String[] getSupportedDiskControllerList() {
		return supportedDiskControllerList;
	}

	/**
	 * Sets the supportedDiskControllerList value for this GuestOsDescriptor.
	 * 
	 * @param supportedDiskControllerList
	 */
	public void setSupportedDiskControllerList(
			java.lang.String[] supportedDiskControllerList) {
		this.supportedDiskControllerList = supportedDiskControllerList;
	}

	public java.lang.String getSupportedDiskControllerList(int i) {
		return this.supportedDiskControllerList[i];
	}

	public void setSupportedDiskControllerList(int i, java.lang.String _value) {
		this.supportedDiskControllerList[i] = _value;
	}

	/**
	 * Gets the recommendedSCSIController value for this GuestOsDescriptor.
	 * 
	 * @return recommendedSCSIController
	 */
	public java.lang.String getRecommendedSCSIController() {
		return recommendedSCSIController;
	}

	/**
	 * Sets the recommendedSCSIController value for this GuestOsDescriptor.
	 * 
	 * @param recommendedSCSIController
	 */
	public void setRecommendedSCSIController(
			java.lang.String recommendedSCSIController) {
		this.recommendedSCSIController = recommendedSCSIController;
	}

	/**
	 * Gets the recommendedDiskController value for this GuestOsDescriptor.
	 * 
	 * @return recommendedDiskController
	 */
	public java.lang.String getRecommendedDiskController() {
		return recommendedDiskController;
	}

	/**
	 * Sets the recommendedDiskController value for this GuestOsDescriptor.
	 * 
	 * @param recommendedDiskController
	 */
	public void setRecommendedDiskController(
			java.lang.String recommendedDiskController) {
		this.recommendedDiskController = recommendedDiskController;
	}

	/**
	 * Gets the supportedNumDisks value for this GuestOsDescriptor.
	 * 
	 * @return supportedNumDisks
	 */
	public int getSupportedNumDisks() {
		return supportedNumDisks;
	}

	/**
	 * Sets the supportedNumDisks value for this GuestOsDescriptor.
	 * 
	 * @param supportedNumDisks
	 */
	public void setSupportedNumDisks(int supportedNumDisks) {
		this.supportedNumDisks = supportedNumDisks;
	}

	/**
	 * Gets the recommendedDiskSizeMB value for this GuestOsDescriptor.
	 * 
	 * @return recommendedDiskSizeMB
	 */
	public int getRecommendedDiskSizeMB() {
		return recommendedDiskSizeMB;
	}

	/**
	 * Sets the recommendedDiskSizeMB value for this GuestOsDescriptor.
	 * 
	 * @param recommendedDiskSizeMB
	 */
	public void setRecommendedDiskSizeMB(int recommendedDiskSizeMB) {
		this.recommendedDiskSizeMB = recommendedDiskSizeMB;
	}

	/**
	 * Gets the supportedEthernetCard value for this GuestOsDescriptor.
	 * 
	 * @return supportedEthernetCard
	 */
	public java.lang.String[] getSupportedEthernetCard() {
		return supportedEthernetCard;
	}

	/**
	 * Sets the supportedEthernetCard value for this GuestOsDescriptor.
	 * 
	 * @param supportedEthernetCard
	 */
	public void setSupportedEthernetCard(
			java.lang.String[] supportedEthernetCard) {
		this.supportedEthernetCard = supportedEthernetCard;
	}

	public java.lang.String getSupportedEthernetCard(int i) {
		return this.supportedEthernetCard[i];
	}

	public void setSupportedEthernetCard(int i, java.lang.String _value) {
		this.supportedEthernetCard[i] = _value;
	}

	/**
	 * Gets the recommendedEthernetCard value for this GuestOsDescriptor.
	 * 
	 * @return recommendedEthernetCard
	 */
	public java.lang.String getRecommendedEthernetCard() {
		return recommendedEthernetCard;
	}

	/**
	 * Sets the recommendedEthernetCard value for this GuestOsDescriptor.
	 * 
	 * @param recommendedEthernetCard
	 */
	public void setRecommendedEthernetCard(
			java.lang.String recommendedEthernetCard) {
		this.recommendedEthernetCard = recommendedEthernetCard;
	}

	/**
	 * Gets the supportsSlaveDisk value for this GuestOsDescriptor.
	 * 
	 * @return supportsSlaveDisk
	 */
	public java.lang.Boolean getSupportsSlaveDisk() {
		return supportsSlaveDisk;
	}

	/**
	 * Sets the supportsSlaveDisk value for this GuestOsDescriptor.
	 * 
	 * @param supportsSlaveDisk
	 */
	public void setSupportsSlaveDisk(java.lang.Boolean supportsSlaveDisk) {
		this.supportsSlaveDisk = supportsSlaveDisk;
	}

	/**
	 * Gets the cpuFeatureMask value for this GuestOsDescriptor.
	 * 
	 * @return cpuFeatureMask
	 */
	public com.vmware.vim.HostCpuIdInfo[] getCpuFeatureMask() {
		return cpuFeatureMask;
	}

	/**
	 * Sets the cpuFeatureMask value for this GuestOsDescriptor.
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
	 * Gets the supportsWakeOnLan value for this GuestOsDescriptor.
	 * 
	 * @return supportsWakeOnLan
	 */
	public boolean isSupportsWakeOnLan() {
		return supportsWakeOnLan;
	}

	/**
	 * Sets the supportsWakeOnLan value for this GuestOsDescriptor.
	 * 
	 * @param supportsWakeOnLan
	 */
	public void setSupportsWakeOnLan(boolean supportsWakeOnLan) {
		this.supportsWakeOnLan = supportsWakeOnLan;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof GuestOsDescriptor)) {
			return false;
		}
		GuestOsDescriptor other = (GuestOsDescriptor) obj;
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
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id
						.equals(other.getId())))
				&& ((this.family == null && other.getFamily() == null) || (this.family != null && this.family
						.equals(other.getFamily())))
				&& ((this.fullName == null && other.getFullName() == null) || (this.fullName != null && this.fullName
						.equals(other.getFullName())))
				&& this.supportedMaxCPUs == other.getSupportedMaxCPUs()
				&& this.supportedMinMemMB == other.getSupportedMinMemMB()
				&& this.supportedMaxMemMB == other.getSupportedMaxMemMB()
				&& this.recommendedMemMB == other.getRecommendedMemMB()
				&& this.recommendedColorDepth == other
						.getRecommendedColorDepth()
				&& ((this.supportedDiskControllerList == null && other
						.getSupportedDiskControllerList() == null) || (this.supportedDiskControllerList != null && java.util.Arrays
						.equals(this.supportedDiskControllerList, other
								.getSupportedDiskControllerList())))
				&& ((this.recommendedSCSIController == null && other
						.getRecommendedSCSIController() == null) || (this.recommendedSCSIController != null && this.recommendedSCSIController
						.equals(other.getRecommendedSCSIController())))
				&& ((this.recommendedDiskController == null && other
						.getRecommendedDiskController() == null) || (this.recommendedDiskController != null && this.recommendedDiskController
						.equals(other.getRecommendedDiskController())))
				&& this.supportedNumDisks == other.getSupportedNumDisks()
				&& this.recommendedDiskSizeMB == other
						.getRecommendedDiskSizeMB()
				&& ((this.supportedEthernetCard == null && other
						.getSupportedEthernetCard() == null) || (this.supportedEthernetCard != null && java.util.Arrays
						.equals(this.supportedEthernetCard, other
								.getSupportedEthernetCard())))
				&& ((this.recommendedEthernetCard == null && other
						.getRecommendedEthernetCard() == null) || (this.recommendedEthernetCard != null && this.recommendedEthernetCard
						.equals(other.getRecommendedEthernetCard())))
				&& ((this.supportsSlaveDisk == null && other
						.getSupportsSlaveDisk() == null) || (this.supportsSlaveDisk != null && this.supportsSlaveDisk
						.equals(other.getSupportsSlaveDisk())))
				&& ((this.cpuFeatureMask == null && other.getCpuFeatureMask() == null) || (this.cpuFeatureMask != null && java.util.Arrays
						.equals(this.cpuFeatureMask, other.getCpuFeatureMask())))
				&& this.supportsWakeOnLan == other.isSupportsWakeOnLan();
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
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		if (getFamily() != null) {
			_hashCode += getFamily().hashCode();
		}
		if (getFullName() != null) {
			_hashCode += getFullName().hashCode();
		}
		_hashCode += getSupportedMaxCPUs();
		_hashCode += getSupportedMinMemMB();
		_hashCode += getSupportedMaxMemMB();
		_hashCode += getRecommendedMemMB();
		_hashCode += getRecommendedColorDepth();
		if (getSupportedDiskControllerList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSupportedDiskControllerList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSupportedDiskControllerList(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getRecommendedSCSIController() != null) {
			_hashCode += getRecommendedSCSIController().hashCode();
		}
		if (getRecommendedDiskController() != null) {
			_hashCode += getRecommendedDiskController().hashCode();
		}
		_hashCode += getSupportedNumDisks();
		_hashCode += getRecommendedDiskSizeMB();
		if (getSupportedEthernetCard() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSupportedEthernetCard()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSupportedEthernetCard(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getRecommendedEthernetCard() != null) {
			_hashCode += getRecommendedEthernetCard().hashCode();
		}
		if (getSupportsSlaveDisk() != null) {
			_hashCode += getSupportsSlaveDisk().hashCode();
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
		_hashCode += (isSupportsWakeOnLan() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			GuestOsDescriptor.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"GuestOsDescriptor"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("family");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "family"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fullName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"fullName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supportedMaxCPUs");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"supportedMaxCPUs"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supportedMinMemMB");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"supportedMinMemMB"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supportedMaxMemMB");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"supportedMaxMemMB"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("recommendedMemMB");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"recommendedMemMB"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("recommendedColorDepth");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"recommendedColorDepth"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supportedDiskControllerList");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"supportedDiskControllerList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("recommendedSCSIController");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"recommendedSCSIController"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("recommendedDiskController");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"recommendedDiskController"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supportedNumDisks");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"supportedNumDisks"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("recommendedDiskSizeMB");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"recommendedDiskSizeMB"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supportedEthernetCard");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"supportedEthernetCard"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("recommendedEthernetCard");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"recommendedEthernetCard"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supportsSlaveDisk");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"supportsSlaveDisk"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
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
		elemField.setFieldName("supportsWakeOnLan");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"supportsWakeOnLan"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
