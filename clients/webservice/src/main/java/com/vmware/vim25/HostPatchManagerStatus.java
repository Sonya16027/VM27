/**
 * HostPatchManagerStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostPatchManagerStatus extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String id;

	private boolean applicable;

	private java.lang.String[] reason;

	private java.lang.String integrity;

	private boolean installed;

	private java.lang.String[] installState;

	private com.vmware.vim25.HostPatchManagerStatusPrerequisitePatch[] prerequisitePatch;

	private boolean restartRequired;

	private boolean reconnectRequired;

	private boolean vmOffRequired;

	private java.lang.String[] supersededPatchIds;

	public HostPatchManagerStatus() {
	}

	public HostPatchManagerStatus(
			java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String id,
			boolean applicable,
			java.lang.String[] reason,
			java.lang.String integrity,
			boolean installed,
			java.lang.String[] installState,
			com.vmware.vim25.HostPatchManagerStatusPrerequisitePatch[] prerequisitePatch,
			boolean restartRequired, boolean reconnectRequired,
			boolean vmOffRequired, java.lang.String[] supersededPatchIds) {
		super(dynamicType, dynamicProperty);
		this.id = id;
		this.applicable = applicable;
		this.reason = reason;
		this.integrity = integrity;
		this.installed = installed;
		this.installState = installState;
		this.prerequisitePatch = prerequisitePatch;
		this.restartRequired = restartRequired;
		this.reconnectRequired = reconnectRequired;
		this.vmOffRequired = vmOffRequired;
		this.supersededPatchIds = supersededPatchIds;
	}

	/**
	 * Gets the id value for this HostPatchManagerStatus.
	 * 
	 * @return id
	 */
	public java.lang.String getId() {
		return id;
	}

	/**
	 * Sets the id value for this HostPatchManagerStatus.
	 * 
	 * @param id
	 */
	public void setId(java.lang.String id) {
		this.id = id;
	}

	/**
	 * Gets the applicable value for this HostPatchManagerStatus.
	 * 
	 * @return applicable
	 */
	public boolean isApplicable() {
		return applicable;
	}

	/**
	 * Sets the applicable value for this HostPatchManagerStatus.
	 * 
	 * @param applicable
	 */
	public void setApplicable(boolean applicable) {
		this.applicable = applicable;
	}

	/**
	 * Gets the reason value for this HostPatchManagerStatus.
	 * 
	 * @return reason
	 */
	public java.lang.String[] getReason() {
		return reason;
	}

	/**
	 * Sets the reason value for this HostPatchManagerStatus.
	 * 
	 * @param reason
	 */
	public void setReason(java.lang.String[] reason) {
		this.reason = reason;
	}

	public java.lang.String getReason(int i) {
		return this.reason[i];
	}

	public void setReason(int i, java.lang.String _value) {
		this.reason[i] = _value;
	}

	/**
	 * Gets the integrity value for this HostPatchManagerStatus.
	 * 
	 * @return integrity
	 */
	public java.lang.String getIntegrity() {
		return integrity;
	}

	/**
	 * Sets the integrity value for this HostPatchManagerStatus.
	 * 
	 * @param integrity
	 */
	public void setIntegrity(java.lang.String integrity) {
		this.integrity = integrity;
	}

	/**
	 * Gets the installed value for this HostPatchManagerStatus.
	 * 
	 * @return installed
	 */
	public boolean isInstalled() {
		return installed;
	}

	/**
	 * Sets the installed value for this HostPatchManagerStatus.
	 * 
	 * @param installed
	 */
	public void setInstalled(boolean installed) {
		this.installed = installed;
	}

	/**
	 * Gets the installState value for this HostPatchManagerStatus.
	 * 
	 * @return installState
	 */
	public java.lang.String[] getInstallState() {
		return installState;
	}

	/**
	 * Sets the installState value for this HostPatchManagerStatus.
	 * 
	 * @param installState
	 */
	public void setInstallState(java.lang.String[] installState) {
		this.installState = installState;
	}

	public java.lang.String getInstallState(int i) {
		return this.installState[i];
	}

	public void setInstallState(int i, java.lang.String _value) {
		this.installState[i] = _value;
	}

	/**
	 * Gets the prerequisitePatch value for this HostPatchManagerStatus.
	 * 
	 * @return prerequisitePatch
	 */
	public com.vmware.vim25.HostPatchManagerStatusPrerequisitePatch[] getPrerequisitePatch() {
		return prerequisitePatch;
	}

	/**
	 * Sets the prerequisitePatch value for this HostPatchManagerStatus.
	 * 
	 * @param prerequisitePatch
	 */
	public void setPrerequisitePatch(
			com.vmware.vim25.HostPatchManagerStatusPrerequisitePatch[] prerequisitePatch) {
		this.prerequisitePatch = prerequisitePatch;
	}

	public com.vmware.vim25.HostPatchManagerStatusPrerequisitePatch getPrerequisitePatch(
			int i) {
		return this.prerequisitePatch[i];
	}

	public void setPrerequisitePatch(int i,
			com.vmware.vim25.HostPatchManagerStatusPrerequisitePatch _value) {
		this.prerequisitePatch[i] = _value;
	}

	/**
	 * Gets the restartRequired value for this HostPatchManagerStatus.
	 * 
	 * @return restartRequired
	 */
	public boolean isRestartRequired() {
		return restartRequired;
	}

	/**
	 * Sets the restartRequired value for this HostPatchManagerStatus.
	 * 
	 * @param restartRequired
	 */
	public void setRestartRequired(boolean restartRequired) {
		this.restartRequired = restartRequired;
	}

	/**
	 * Gets the reconnectRequired value for this HostPatchManagerStatus.
	 * 
	 * @return reconnectRequired
	 */
	public boolean isReconnectRequired() {
		return reconnectRequired;
	}

	/**
	 * Sets the reconnectRequired value for this HostPatchManagerStatus.
	 * 
	 * @param reconnectRequired
	 */
	public void setReconnectRequired(boolean reconnectRequired) {
		this.reconnectRequired = reconnectRequired;
	}

	/**
	 * Gets the vmOffRequired value for this HostPatchManagerStatus.
	 * 
	 * @return vmOffRequired
	 */
	public boolean isVmOffRequired() {
		return vmOffRequired;
	}

	/**
	 * Sets the vmOffRequired value for this HostPatchManagerStatus.
	 * 
	 * @param vmOffRequired
	 */
	public void setVmOffRequired(boolean vmOffRequired) {
		this.vmOffRequired = vmOffRequired;
	}

	/**
	 * Gets the supersededPatchIds value for this HostPatchManagerStatus.
	 * 
	 * @return supersededPatchIds
	 */
	public java.lang.String[] getSupersededPatchIds() {
		return supersededPatchIds;
	}

	/**
	 * Sets the supersededPatchIds value for this HostPatchManagerStatus.
	 * 
	 * @param supersededPatchIds
	 */
	public void setSupersededPatchIds(java.lang.String[] supersededPatchIds) {
		this.supersededPatchIds = supersededPatchIds;
	}

	public java.lang.String getSupersededPatchIds(int i) {
		return this.supersededPatchIds[i];
	}

	public void setSupersededPatchIds(int i, java.lang.String _value) {
		this.supersededPatchIds[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostPatchManagerStatus)) {
			return false;
		}
		HostPatchManagerStatus other = (HostPatchManagerStatus) obj;
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
				&& this.applicable == other.isApplicable()
				&& ((this.reason == null && other.getReason() == null) || (this.reason != null && java.util.Arrays
						.equals(this.reason, other.getReason())))
				&& ((this.integrity == null && other.getIntegrity() == null) || (this.integrity != null && this.integrity
						.equals(other.getIntegrity())))
				&& this.installed == other.isInstalled()
				&& ((this.installState == null && other.getInstallState() == null) || (this.installState != null && java.util.Arrays
						.equals(this.installState, other.getInstallState())))
				&& ((this.prerequisitePatch == null && other
						.getPrerequisitePatch() == null) || (this.prerequisitePatch != null && java.util.Arrays
						.equals(this.prerequisitePatch, other
								.getPrerequisitePatch())))
				&& this.restartRequired == other.isRestartRequired()
				&& this.reconnectRequired == other.isReconnectRequired()
				&& this.vmOffRequired == other.isVmOffRequired()
				&& ((this.supersededPatchIds == null && other
						.getSupersededPatchIds() == null) || (this.supersededPatchIds != null && java.util.Arrays
						.equals(this.supersededPatchIds, other
								.getSupersededPatchIds())));
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
		_hashCode += (isApplicable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getReason() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getReason()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getReason(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getIntegrity() != null) {
			_hashCode += getIntegrity().hashCode();
		}
		_hashCode += (isInstalled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getInstallState() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getInstallState()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getInstallState(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getPrerequisitePatch() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPrerequisitePatch()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPrerequisitePatch(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += (isRestartRequired() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isReconnectRequired() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isVmOffRequired() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		if (getSupersededPatchIds() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getSupersededPatchIds()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getSupersededPatchIds(), i);
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
			HostPatchManagerStatus.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPatchManagerStatus"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "id"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("applicable");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"applicable"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reason");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"reason"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("integrity");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"integrity"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("installed");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"installed"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("installState");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"installState"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("prerequisitePatch");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"prerequisitePatch"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPatchManagerStatusPrerequisitePatch"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("restartRequired");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"restartRequired"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reconnectRequired");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"reconnectRequired"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmOffRequired");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"vmOffRequired"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("supersededPatchIds");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"supersededPatchIds"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
