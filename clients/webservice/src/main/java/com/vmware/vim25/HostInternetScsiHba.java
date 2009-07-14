/**
 * HostInternetScsiHba.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostInternetScsiHba extends com.vmware.vim25.HostHostBusAdapter
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean isSoftwareBased;

	private com.vmware.vim25.HostInternetScsiHbaDiscoveryCapabilities discoveryCapabilities;

	private com.vmware.vim25.HostInternetScsiHbaDiscoveryProperties discoveryProperties;

	private com.vmware.vim25.HostInternetScsiHbaAuthenticationCapabilities authenticationCapabilities;

	private com.vmware.vim25.HostInternetScsiHbaAuthenticationProperties authenticationProperties;

	private com.vmware.vim25.HostInternetScsiHbaDigestCapabilities digestCapabilities;

	private com.vmware.vim25.HostInternetScsiHbaDigestProperties digestProperties;

	private com.vmware.vim25.HostInternetScsiHbaIPCapabilities ipCapabilities;

	private com.vmware.vim25.HostInternetScsiHbaIPProperties ipProperties;

	private com.vmware.vim25.OptionDef[] supportedAdvancedOptions;

	private com.vmware.vim25.HostInternetScsiHbaParamValue[] advancedOptions;

	private java.lang.String iScsiName;

	private java.lang.String iScsiAlias;

	private com.vmware.vim25.HostInternetScsiHbaSendTarget[] configuredSendTarget;

	private com.vmware.vim25.HostInternetScsiHbaStaticTarget[] configuredStaticTarget;

	private java.lang.Integer maxSpeedMb;

	private java.lang.Integer currentSpeedMb;

	public HostInternetScsiHba() {
	}

	public HostInternetScsiHba(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String key,
			java.lang.String device,
			int bus,
			java.lang.String status,
			java.lang.String model,
			java.lang.String driver,
			java.lang.String pci,
			boolean isSoftwareBased,
			com.vmware.vim25.HostInternetScsiHbaDiscoveryCapabilities discoveryCapabilities,
			com.vmware.vim25.HostInternetScsiHbaDiscoveryProperties discoveryProperties,
			com.vmware.vim25.HostInternetScsiHbaAuthenticationCapabilities authenticationCapabilities,
			com.vmware.vim25.HostInternetScsiHbaAuthenticationProperties authenticationProperties,
			com.vmware.vim25.HostInternetScsiHbaDigestCapabilities digestCapabilities,
			com.vmware.vim25.HostInternetScsiHbaDigestProperties digestProperties,
			com.vmware.vim25.HostInternetScsiHbaIPCapabilities ipCapabilities,
			com.vmware.vim25.HostInternetScsiHbaIPProperties ipProperties,
			com.vmware.vim25.OptionDef[] supportedAdvancedOptions,
			com.vmware.vim25.HostInternetScsiHbaParamValue[] advancedOptions,
			java.lang.String iScsiName,
			java.lang.String iScsiAlias,
			com.vmware.vim25.HostInternetScsiHbaSendTarget[] configuredSendTarget,
			com.vmware.vim25.HostInternetScsiHbaStaticTarget[] configuredStaticTarget,
			java.lang.Integer maxSpeedMb, java.lang.Integer currentSpeedMb) {
		super(dynamicType, dynamicProperty, key, device, bus, status, model,
				driver, pci);
		this.isSoftwareBased = isSoftwareBased;
		this.discoveryCapabilities = discoveryCapabilities;
		this.discoveryProperties = discoveryProperties;
		this.authenticationCapabilities = authenticationCapabilities;
		this.authenticationProperties = authenticationProperties;
		this.digestCapabilities = digestCapabilities;
		this.digestProperties = digestProperties;
		this.ipCapabilities = ipCapabilities;
		this.ipProperties = ipProperties;
		this.supportedAdvancedOptions = supportedAdvancedOptions;
		this.advancedOptions = advancedOptions;
		this.iScsiName = iScsiName;
		this.iScsiAlias = iScsiAlias;
		this.configuredSendTarget = configuredSendTarget;
		this.configuredStaticTarget = configuredStaticTarget;
		this.maxSpeedMb = maxSpeedMb;
		this.currentSpeedMb = currentSpeedMb;
	}

	/**
	 * Gets the isSoftwareBased value for this HostInternetScsiHba.
	 * 
	 * @return isSoftwareBased
	 */
	public boolean isIsSoftwareBased() {
		return isSoftwareBased;
	}

	/**
	 * Sets the isSoftwareBased value for this HostInternetScsiHba.
	 * 
	 * @param isSoftwareBased
	 */
	public void setIsSoftwareBased(boolean isSoftwareBased) {
		this.isSoftwareBased = isSoftwareBased;
	}

	/**
	 * Gets the discoveryCapabilities value for this HostInternetScsiHba.
	 * 
	 * @return discoveryCapabilities
	 */
	public com.vmware.vim25.HostInternetScsiHbaDiscoveryCapabilities getDiscoveryCapabilities() {
		return discoveryCapabilities;
	}

	/**
	 * Sets the discoveryCapabilities value for this HostInternetScsiHba.
	 * 
	 * @param discoveryCapabilities
	 */
	public void setDiscoveryCapabilities(
			com.vmware.vim25.HostInternetScsiHbaDiscoveryCapabilities discoveryCapabilities) {
		this.discoveryCapabilities = discoveryCapabilities;
	}

	/**
	 * Gets the discoveryProperties value for this HostInternetScsiHba.
	 * 
	 * @return discoveryProperties
	 */
	public com.vmware.vim25.HostInternetScsiHbaDiscoveryProperties getDiscoveryProperties() {
		return discoveryProperties;
	}

	/**
	 * Sets the discoveryProperties value for this HostInternetScsiHba.
	 * 
	 * @param discoveryProperties
	 */
	public void setDiscoveryProperties(
			com.vmware.vim25.HostInternetScsiHbaDiscoveryProperties discoveryProperties) {
		this.discoveryProperties = discoveryProperties;
	}

	/**
	 * Gets the authenticationCapabilities value for this HostInternetScsiHba.
	 * 
	 * @return authenticationCapabilities
	 */
	public com.vmware.vim25.HostInternetScsiHbaAuthenticationCapabilities getAuthenticationCapabilities() {
		return authenticationCapabilities;
	}

	/**
	 * Sets the authenticationCapabilities value for this HostInternetScsiHba.
	 * 
	 * @param authenticationCapabilities
	 */
	public void setAuthenticationCapabilities(
			com.vmware.vim25.HostInternetScsiHbaAuthenticationCapabilities authenticationCapabilities) {
		this.authenticationCapabilities = authenticationCapabilities;
	}

	/**
	 * Gets the authenticationProperties value for this HostInternetScsiHba.
	 * 
	 * @return authenticationProperties
	 */
	public com.vmware.vim25.HostInternetScsiHbaAuthenticationProperties getAuthenticationProperties() {
		return authenticationProperties;
	}

	/**
	 * Sets the authenticationProperties value for this HostInternetScsiHba.
	 * 
	 * @param authenticationProperties
	 */
	public void setAuthenticationProperties(
			com.vmware.vim25.HostInternetScsiHbaAuthenticationProperties authenticationProperties) {
		this.authenticationProperties = authenticationProperties;
	}

	/**
	 * Gets the digestCapabilities value for this HostInternetScsiHba.
	 * 
	 * @return digestCapabilities
	 */
	public com.vmware.vim25.HostInternetScsiHbaDigestCapabilities getDigestCapabilities() {
		return digestCapabilities;
	}

	/**
	 * Sets the digestCapabilities value for this HostInternetScsiHba.
	 * 
	 * @param digestCapabilities
	 */
	public void setDigestCapabilities(
			com.vmware.vim25.HostInternetScsiHbaDigestCapabilities digestCapabilities) {
		this.digestCapabilities = digestCapabilities;
	}

	/**
	 * Gets the digestProperties value for this HostInternetScsiHba.
	 * 
	 * @return digestProperties
	 */
	public com.vmware.vim25.HostInternetScsiHbaDigestProperties getDigestProperties() {
		return digestProperties;
	}

	/**
	 * Sets the digestProperties value for this HostInternetScsiHba.
	 * 
	 * @param digestProperties
	 */
	public void setDigestProperties(
			com.vmware.vim25.HostInternetScsiHbaDigestProperties digestProperties) {
		this.digestProperties = digestProperties;
	}

	/**
	 * Gets the ipCapabilities value for this HostInternetScsiHba.
	 * 
	 * @return ipCapabilities
	 */
	public com.vmware.vim25.HostInternetScsiHbaIPCapabilities getIpCapabilities() {
		return ipCapabilities;
	}

	/**
	 * Sets the ipCapabilities value for this HostInternetScsiHba.
	 * 
	 * @param ipCapabilities
	 */
	public void setIpCapabilities(
			com.vmware.vim25.HostInternetScsiHbaIPCapabilities ipCapabilities) {
		this.ipCapabilities = ipCapabilities;
	}

	/**
	 * Gets the ipProperties value for this HostInternetScsiHba.
	 * 
	 * @return ipProperties
	 */
	public com.vmware.vim25.HostInternetScsiHbaIPProperties getIpProperties() {
		return ipProperties;
	}

	/**
	 * Sets the ipProperties value for this HostInternetScsiHba.
	 * 
	 * @param ipProperties
	 */
	public void setIpProperties(
			com.vmware.vim25.HostInternetScsiHbaIPProperties ipProperties) {
		this.ipProperties = ipProperties;
	}

	/**
	 * Gets the supportedAdvancedOptions value for this HostInternetScsiHba.
	 * 
	 * @return supportedAdvancedOptions
	 */
	public com.vmware.vim25.OptionDef[] getSupportedAdvancedOptions() {
		return supportedAdvancedOptions;
	}

	/**
	 * Sets the supportedAdvancedOptions value for this HostInternetScsiHba.
	 * 
	 * @param supportedAdvancedOptions
	 */
	public void setSupportedAdvancedOptions(
			com.vmware.vim25.OptionDef[] supportedAdvancedOptions) {
		this.supportedAdvancedOptions = supportedAdvancedOptions;
	}

	public com.vmware.vim25.OptionDef getSupportedAdvancedOptions(int i) {
		return this.supportedAdvancedOptions[i];
	}

	public void setSupportedAdvancedOptions(int i,
			com.vmware.vim25.OptionDef _value) {
		this.supportedAdvancedOptions[i] = _value;
	}

	/**
	 * Gets the advancedOptions value for this HostInternetScsiHba.
	 * 
	 * @return advancedOptions
	 */
	public com.vmware.vim25.HostInternetScsiHbaParamValue[] getAdvancedOptions() {
		return advancedOptions;
	}

	/**
	 * Sets the advancedOptions value for this HostInternetScsiHba.
	 * 
	 * @param advancedOptions
	 */
	public void setAdvancedOptions(
			com.vmware.vim25.HostInternetScsiHbaParamValue[] advancedOptions) {
		this.advancedOptions = advancedOptions;
	}

	public com.vmware.vim25.HostInternetScsiHbaParamValue getAdvancedOptions(
			int i) {
		return this.advancedOptions[i];
	}

	public void setAdvancedOptions(int i,
			com.vmware.vim25.HostInternetScsiHbaParamValue _value) {
		this.advancedOptions[i] = _value;
	}

	/**
	 * Gets the iScsiName value for this HostInternetScsiHba.
	 * 
	 * @return iScsiName
	 */
	public java.lang.String getIScsiName() {
		return iScsiName;
	}

	/**
	 * Sets the iScsiName value for this HostInternetScsiHba.
	 * 
	 * @param iScsiName
	 */
	public void setIScsiName(java.lang.String iScsiName) {
		this.iScsiName = iScsiName;
	}

	/**
	 * Gets the iScsiAlias value for this HostInternetScsiHba.
	 * 
	 * @return iScsiAlias
	 */
	public java.lang.String getIScsiAlias() {
		return iScsiAlias;
	}

	/**
	 * Sets the iScsiAlias value for this HostInternetScsiHba.
	 * 
	 * @param iScsiAlias
	 */
	public void setIScsiAlias(java.lang.String iScsiAlias) {
		this.iScsiAlias = iScsiAlias;
	}

	/**
	 * Gets the configuredSendTarget value for this HostInternetScsiHba.
	 * 
	 * @return configuredSendTarget
	 */
	public com.vmware.vim25.HostInternetScsiHbaSendTarget[] getConfiguredSendTarget() {
		return configuredSendTarget;
	}

	/**
	 * Sets the configuredSendTarget value for this HostInternetScsiHba.
	 * 
	 * @param configuredSendTarget
	 */
	public void setConfiguredSendTarget(
			com.vmware.vim25.HostInternetScsiHbaSendTarget[] configuredSendTarget) {
		this.configuredSendTarget = configuredSendTarget;
	}

	public com.vmware.vim25.HostInternetScsiHbaSendTarget getConfiguredSendTarget(
			int i) {
		return this.configuredSendTarget[i];
	}

	public void setConfiguredSendTarget(int i,
			com.vmware.vim25.HostInternetScsiHbaSendTarget _value) {
		this.configuredSendTarget[i] = _value;
	}

	/**
	 * Gets the configuredStaticTarget value for this HostInternetScsiHba.
	 * 
	 * @return configuredStaticTarget
	 */
	public com.vmware.vim25.HostInternetScsiHbaStaticTarget[] getConfiguredStaticTarget() {
		return configuredStaticTarget;
	}

	/**
	 * Sets the configuredStaticTarget value for this HostInternetScsiHba.
	 * 
	 * @param configuredStaticTarget
	 */
	public void setConfiguredStaticTarget(
			com.vmware.vim25.HostInternetScsiHbaStaticTarget[] configuredStaticTarget) {
		this.configuredStaticTarget = configuredStaticTarget;
	}

	public com.vmware.vim25.HostInternetScsiHbaStaticTarget getConfiguredStaticTarget(
			int i) {
		return this.configuredStaticTarget[i];
	}

	public void setConfiguredStaticTarget(int i,
			com.vmware.vim25.HostInternetScsiHbaStaticTarget _value) {
		this.configuredStaticTarget[i] = _value;
	}

	/**
	 * Gets the maxSpeedMb value for this HostInternetScsiHba.
	 * 
	 * @return maxSpeedMb
	 */
	public java.lang.Integer getMaxSpeedMb() {
		return maxSpeedMb;
	}

	/**
	 * Sets the maxSpeedMb value for this HostInternetScsiHba.
	 * 
	 * @param maxSpeedMb
	 */
	public void setMaxSpeedMb(java.lang.Integer maxSpeedMb) {
		this.maxSpeedMb = maxSpeedMb;
	}

	/**
	 * Gets the currentSpeedMb value for this HostInternetScsiHba.
	 * 
	 * @return currentSpeedMb
	 */
	public java.lang.Integer getCurrentSpeedMb() {
		return currentSpeedMb;
	}

	/**
	 * Sets the currentSpeedMb value for this HostInternetScsiHba.
	 * 
	 * @param currentSpeedMb
	 */
	public void setCurrentSpeedMb(java.lang.Integer currentSpeedMb) {
		this.currentSpeedMb = currentSpeedMb;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostInternetScsiHba)) {
			return false;
		}
		HostInternetScsiHba other = (HostInternetScsiHba) obj;
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
				&& this.isSoftwareBased == other.isIsSoftwareBased()
				&& ((this.discoveryCapabilities == null && other
						.getDiscoveryCapabilities() == null) || (this.discoveryCapabilities != null && this.discoveryCapabilities
						.equals(other.getDiscoveryCapabilities())))
				&& ((this.discoveryProperties == null && other
						.getDiscoveryProperties() == null) || (this.discoveryProperties != null && this.discoveryProperties
						.equals(other.getDiscoveryProperties())))
				&& ((this.authenticationCapabilities == null && other
						.getAuthenticationCapabilities() == null) || (this.authenticationCapabilities != null && this.authenticationCapabilities
						.equals(other.getAuthenticationCapabilities())))
				&& ((this.authenticationProperties == null && other
						.getAuthenticationProperties() == null) || (this.authenticationProperties != null && this.authenticationProperties
						.equals(other.getAuthenticationProperties())))
				&& ((this.digestCapabilities == null && other
						.getDigestCapabilities() == null) || (this.digestCapabilities != null && this.digestCapabilities
						.equals(other.getDigestCapabilities())))
				&& ((this.digestProperties == null && other
						.getDigestProperties() == null) || (this.digestProperties != null && this.digestProperties
						.equals(other.getDigestProperties())))
				&& ((this.ipCapabilities == null && other.getIpCapabilities() == null) || (this.ipCapabilities != null && this.ipCapabilities
						.equals(other.getIpCapabilities())))
				&& ((this.ipProperties == null && other.getIpProperties() == null) || (this.ipProperties != null && this.ipProperties
						.equals(other.getIpProperties())))
				&& ((this.supportedAdvancedOptions == null && other
						.getSupportedAdvancedOptions() == null) || (this.supportedAdvancedOptions != null && java.util.Arrays
						.equals(this.supportedAdvancedOptions, other
								.getSupportedAdvancedOptions())))
				&& ((this.advancedOptions == null && other.getAdvancedOptions() == null) || (this.advancedOptions != null && java.util.Arrays
						.equals(this.advancedOptions, other
								.getAdvancedOptions())))
				&& ((this.iScsiName == null && other.getIScsiName() == null) || (this.iScsiName != null && this.iScsiName
						.equals(other.getIScsiName())))
				&& ((this.iScsiAlias == null && other.getIScsiAlias() == null) || (this.iScsiAlias != null && this.iScsiAlias
						.equals(other.getIScsiAlias())))
				&& ((this.configuredSendTarget == null && other
						.getConfiguredSendTarget() == null) || (this.configuredSendTarget != null && java.util.Arrays
						.equals(this.configuredSendTarget, other
								.getConfiguredSendTarget())))
				&& ((this.configuredStaticTarget == null && other
						.getConfiguredStaticTarget() == null) || (this.configuredStaticTarget != null && java.util.Arrays
						.equals(this.configuredStaticTarget, other
								.getConfiguredStaticTarget())))
				&& ((this.maxSpeedMb == null && other.getMaxSpeedMb() == null) || (this.maxSpeedMb != null && this.maxSpeedMb
						.equals(other.getMaxSpeedMb())))
				&& ((this.currentSpeedMb == null && other.getCurrentSpeedMb() == null) || (this.currentSpeedMb != null && this.currentSpeedMb
						.equals(other.getCurrentSpeedMb())));
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
		_hashCode += (isIsSoftwareBased() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getDiscoveryCapabilities() != null) {
			_hashCode += getDiscoveryCapabilities().hashCode();
		}
		if (getDiscoveryProperties() != null) {
			_hashCode += getDiscoveryProperties().hashCode();
		}
		if (getAuthenticationCapabilities() != null) {
			_hashCode += getAuthenticationCapabilities().hashCode();
		}
		if (getAuthenticationProperties() != null) {
			_hashCode += getAuthenticationProperties().hashCode();
		}
		if (getDigestCapabilities() != null) {
			_hashCode += getDigestCapabilities().hashCode();
		}
		if (getDigestProperties() != null) {
			_hashCode += getDigestProperties().hashCode();
		}
		if (getIpCapabilities() != null) {
			_hashCode += getIpCapabilities().hashCode();
		}
		if (getIpProperties() != null) {
			_hashCode += getIpProperties().hashCode();
		}
		if (getSupportedAdvancedOptions() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSupportedAdvancedOptions()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSupportedAdvancedOptions(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getAdvancedOptions() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getAdvancedOptions()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getAdvancedOptions(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getIScsiName() != null) {
			_hashCode += getIScsiName().hashCode();
		}
		if (getIScsiAlias() != null) {
			_hashCode += getIScsiAlias().hashCode();
		}
		if (getConfiguredSendTarget() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getConfiguredSendTarget()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getConfiguredSendTarget(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getConfiguredStaticTarget() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getConfiguredStaticTarget()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getConfiguredStaticTarget(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getMaxSpeedMb() != null) {
			_hashCode += getMaxSpeedMb().hashCode();
		}
		if (getCurrentSpeedMb() != null) {
			_hashCode += getCurrentSpeedMb().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostInternetScsiHba.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHba"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("isSoftwareBased");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"isSoftwareBased"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("discoveryCapabilities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"discoveryCapabilities"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaDiscoveryCapabilities"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("discoveryProperties");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"discoveryProperties"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaDiscoveryProperties"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("authenticationCapabilities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"authenticationCapabilities"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaAuthenticationCapabilities"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("authenticationProperties");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"authenticationProperties"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaAuthenticationProperties"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("digestCapabilities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"digestCapabilities"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaDigestCapabilities"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("digestProperties");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"digestProperties"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaDigestProperties"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipCapabilities");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipCapabilities"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaIPCapabilities"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ipProperties");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ipProperties"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaIPProperties"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supportedAdvancedOptions");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"supportedAdvancedOptions"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"OptionDef"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("advancedOptions");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"advancedOptions"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaParamValue"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("IScsiName");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"iScsiName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("IScsiAlias");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"iScsiAlias"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("configuredSendTarget");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"configuredSendTarget"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaSendTarget"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("configuredStaticTarget");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"configuredStaticTarget"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaStaticTarget"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("maxSpeedMb");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"maxSpeedMb"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("currentSpeedMb");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"currentSpeedMb"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
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
