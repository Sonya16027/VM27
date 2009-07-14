/**
 * LicenseDiagnostics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class LicenseDiagnostics extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.util.Calendar sourceLastChanged;

	private java.lang.String sourceLost;

	private float sourceLatency;

	private java.lang.String licenseRequests;

	private java.lang.String licenseRequestFailures;

	private java.lang.String licenseFeatureUnknowns;

	private com.vmware.vim25.LicenseManagerState opState;

	private java.util.Calendar lastStatusUpdate;

	private java.lang.String opFailureMessage;

	public LicenseDiagnostics() {
	}

	public LicenseDiagnostics(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.util.Calendar sourceLastChanged, java.lang.String sourceLost,
			float sourceLatency, java.lang.String licenseRequests,
			java.lang.String licenseRequestFailures,
			java.lang.String licenseFeatureUnknowns,
			com.vmware.vim25.LicenseManagerState opState,
			java.util.Calendar lastStatusUpdate,
			java.lang.String opFailureMessage) {
		super(dynamicType, dynamicProperty);
		this.sourceLastChanged = sourceLastChanged;
		this.sourceLost = sourceLost;
		this.sourceLatency = sourceLatency;
		this.licenseRequests = licenseRequests;
		this.licenseRequestFailures = licenseRequestFailures;
		this.licenseFeatureUnknowns = licenseFeatureUnknowns;
		this.opState = opState;
		this.lastStatusUpdate = lastStatusUpdate;
		this.opFailureMessage = opFailureMessage;
	}

	/**
	 * Gets the sourceLastChanged value for this LicenseDiagnostics.
	 * 
	 * @return sourceLastChanged
	 */
	public java.util.Calendar getSourceLastChanged() {
		return sourceLastChanged;
	}

	/**
	 * Sets the sourceLastChanged value for this LicenseDiagnostics.
	 * 
	 * @param sourceLastChanged
	 */
	public void setSourceLastChanged(java.util.Calendar sourceLastChanged) {
		this.sourceLastChanged = sourceLastChanged;
	}

	/**
	 * Gets the sourceLost value for this LicenseDiagnostics.
	 * 
	 * @return sourceLost
	 */
	public java.lang.String getSourceLost() {
		return sourceLost;
	}

	/**
	 * Sets the sourceLost value for this LicenseDiagnostics.
	 * 
	 * @param sourceLost
	 */
	public void setSourceLost(java.lang.String sourceLost) {
		this.sourceLost = sourceLost;
	}

	/**
	 * Gets the sourceLatency value for this LicenseDiagnostics.
	 * 
	 * @return sourceLatency
	 */
	public float getSourceLatency() {
		return sourceLatency;
	}

	/**
	 * Sets the sourceLatency value for this LicenseDiagnostics.
	 * 
	 * @param sourceLatency
	 */
	public void setSourceLatency(float sourceLatency) {
		this.sourceLatency = sourceLatency;
	}

	/**
	 * Gets the licenseRequests value for this LicenseDiagnostics.
	 * 
	 * @return licenseRequests
	 */
	public java.lang.String getLicenseRequests() {
		return licenseRequests;
	}

	/**
	 * Sets the licenseRequests value for this LicenseDiagnostics.
	 * 
	 * @param licenseRequests
	 */
	public void setLicenseRequests(java.lang.String licenseRequests) {
		this.licenseRequests = licenseRequests;
	}

	/**
	 * Gets the licenseRequestFailures value for this LicenseDiagnostics.
	 * 
	 * @return licenseRequestFailures
	 */
	public java.lang.String getLicenseRequestFailures() {
		return licenseRequestFailures;
	}

	/**
	 * Sets the licenseRequestFailures value for this LicenseDiagnostics.
	 * 
	 * @param licenseRequestFailures
	 */
	public void setLicenseRequestFailures(
			java.lang.String licenseRequestFailures) {
		this.licenseRequestFailures = licenseRequestFailures;
	}

	/**
	 * Gets the licenseFeatureUnknowns value for this LicenseDiagnostics.
	 * 
	 * @return licenseFeatureUnknowns
	 */
	public java.lang.String getLicenseFeatureUnknowns() {
		return licenseFeatureUnknowns;
	}

	/**
	 * Sets the licenseFeatureUnknowns value for this LicenseDiagnostics.
	 * 
	 * @param licenseFeatureUnknowns
	 */
	public void setLicenseFeatureUnknowns(
			java.lang.String licenseFeatureUnknowns) {
		this.licenseFeatureUnknowns = licenseFeatureUnknowns;
	}

	/**
	 * Gets the opState value for this LicenseDiagnostics.
	 * 
	 * @return opState
	 */
	public com.vmware.vim25.LicenseManagerState getOpState() {
		return opState;
	}

	/**
	 * Sets the opState value for this LicenseDiagnostics.
	 * 
	 * @param opState
	 */
	public void setOpState(com.vmware.vim25.LicenseManagerState opState) {
		this.opState = opState;
	}

	/**
	 * Gets the lastStatusUpdate value for this LicenseDiagnostics.
	 * 
	 * @return lastStatusUpdate
	 */
	public java.util.Calendar getLastStatusUpdate() {
		return lastStatusUpdate;
	}

	/**
	 * Sets the lastStatusUpdate value for this LicenseDiagnostics.
	 * 
	 * @param lastStatusUpdate
	 */
	public void setLastStatusUpdate(java.util.Calendar lastStatusUpdate) {
		this.lastStatusUpdate = lastStatusUpdate;
	}

	/**
	 * Gets the opFailureMessage value for this LicenseDiagnostics.
	 * 
	 * @return opFailureMessage
	 */
	public java.lang.String getOpFailureMessage() {
		return opFailureMessage;
	}

	/**
	 * Sets the opFailureMessage value for this LicenseDiagnostics.
	 * 
	 * @param opFailureMessage
	 */
	public void setOpFailureMessage(java.lang.String opFailureMessage) {
		this.opFailureMessage = opFailureMessage;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof LicenseDiagnostics)) {
			return false;
		}
		LicenseDiagnostics other = (LicenseDiagnostics) obj;
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
				&& ((this.sourceLastChanged == null && other
						.getSourceLastChanged() == null) || (this.sourceLastChanged != null && this.sourceLastChanged
						.equals(other.getSourceLastChanged())))
				&& ((this.sourceLost == null && other.getSourceLost() == null) || (this.sourceLost != null && this.sourceLost
						.equals(other.getSourceLost())))
				&& this.sourceLatency == other.getSourceLatency()
				&& ((this.licenseRequests == null && other.getLicenseRequests() == null) || (this.licenseRequests != null && this.licenseRequests
						.equals(other.getLicenseRequests())))
				&& ((this.licenseRequestFailures == null && other
						.getLicenseRequestFailures() == null) || (this.licenseRequestFailures != null && this.licenseRequestFailures
						.equals(other.getLicenseRequestFailures())))
				&& ((this.licenseFeatureUnknowns == null && other
						.getLicenseFeatureUnknowns() == null) || (this.licenseFeatureUnknowns != null && this.licenseFeatureUnknowns
						.equals(other.getLicenseFeatureUnknowns())))
				&& ((this.opState == null && other.getOpState() == null) || (this.opState != null && this.opState
						.equals(other.getOpState())))
				&& ((this.lastStatusUpdate == null && other
						.getLastStatusUpdate() == null) || (this.lastStatusUpdate != null && this.lastStatusUpdate
						.equals(other.getLastStatusUpdate())))
				&& ((this.opFailureMessage == null && other
						.getOpFailureMessage() == null) || (this.opFailureMessage != null && this.opFailureMessage
						.equals(other.getOpFailureMessage())));
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
		if (getSourceLastChanged() != null) {
			_hashCode += getSourceLastChanged().hashCode();
		}
		if (getSourceLost() != null) {
			_hashCode += getSourceLost().hashCode();
		}
		_hashCode += new Float(getSourceLatency()).hashCode();
		if (getLicenseRequests() != null) {
			_hashCode += getLicenseRequests().hashCode();
		}
		if (getLicenseRequestFailures() != null) {
			_hashCode += getLicenseRequestFailures().hashCode();
		}
		if (getLicenseFeatureUnknowns() != null) {
			_hashCode += getLicenseFeatureUnknowns().hashCode();
		}
		if (getOpState() != null) {
			_hashCode += getOpState().hashCode();
		}
		if (getLastStatusUpdate() != null) {
			_hashCode += getLastStatusUpdate().hashCode();
		}
		if (getOpFailureMessage() != null) {
			_hashCode += getOpFailureMessage().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			LicenseDiagnostics.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LicenseDiagnostics"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sourceLastChanged");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sourceLastChanged"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sourceLost");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sourceLost"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sourceLatency");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"sourceLatency"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "float"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licenseRequests");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"licenseRequests"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licenseRequestFailures");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"licenseRequestFailures"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licenseFeatureUnknowns");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"licenseFeatureUnknowns"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("opState");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"opState"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LicenseManagerState"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("lastStatusUpdate");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"lastStatusUpdate"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("opFailureMessage");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"opFailureMessage"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
