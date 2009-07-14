/**
 * HostService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostService extends com.vmware.vim25.DynamicData implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String key;

	private java.lang.String label;

	private boolean required;

	private boolean uninstallable;

	private boolean running;

	private java.lang.String[] ruleset;

	private java.lang.String policy;

	public HostService() {
	}

	public HostService(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String key, java.lang.String label, boolean required,
			boolean uninstallable, boolean running, java.lang.String[] ruleset,
			java.lang.String policy) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.label = label;
		this.required = required;
		this.uninstallable = uninstallable;
		this.running = running;
		this.ruleset = ruleset;
		this.policy = policy;
	}

	/**
	 * Gets the key value for this HostService.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this HostService.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the label value for this HostService.
	 * 
	 * @return label
	 */
	public java.lang.String getLabel() {
		return label;
	}

	/**
	 * Sets the label value for this HostService.
	 * 
	 * @param label
	 */
	public void setLabel(java.lang.String label) {
		this.label = label;
	}

	/**
	 * Gets the required value for this HostService.
	 * 
	 * @return required
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * Sets the required value for this HostService.
	 * 
	 * @param required
	 */
	public void setRequired(boolean required) {
		this.required = required;
	}

	/**
	 * Gets the uninstallable value for this HostService.
	 * 
	 * @return uninstallable
	 */
	public boolean isUninstallable() {
		return uninstallable;
	}

	/**
	 * Sets the uninstallable value for this HostService.
	 * 
	 * @param uninstallable
	 */
	public void setUninstallable(boolean uninstallable) {
		this.uninstallable = uninstallable;
	}

	/**
	 * Gets the running value for this HostService.
	 * 
	 * @return running
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * Sets the running value for this HostService.
	 * 
	 * @param running
	 */
	public void setRunning(boolean running) {
		this.running = running;
	}

	/**
	 * Gets the ruleset value for this HostService.
	 * 
	 * @return ruleset
	 */
	public java.lang.String[] getRuleset() {
		return ruleset;
	}

	/**
	 * Sets the ruleset value for this HostService.
	 * 
	 * @param ruleset
	 */
	public void setRuleset(java.lang.String[] ruleset) {
		this.ruleset = ruleset;
	}

	public java.lang.String getRuleset(int i) {
		return this.ruleset[i];
	}

	public void setRuleset(int i, java.lang.String _value) {
		this.ruleset[i] = _value;
	}

	/**
	 * Gets the policy value for this HostService.
	 * 
	 * @return policy
	 */
	public java.lang.String getPolicy() {
		return policy;
	}

	/**
	 * Sets the policy value for this HostService.
	 * 
	 * @param policy
	 */
	public void setPolicy(java.lang.String policy) {
		this.policy = policy;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostService)) {
			return false;
		}
		HostService other = (HostService) obj;
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
				&& ((this.key == null && other.getKey() == null) || (this.key != null && this.key
						.equals(other.getKey())))
				&& ((this.label == null && other.getLabel() == null) || (this.label != null && this.label
						.equals(other.getLabel())))
				&& this.required == other.isRequired()
				&& this.uninstallable == other.isUninstallable()
				&& this.running == other.isRunning()
				&& ((this.ruleset == null && other.getRuleset() == null) || (this.ruleset != null && java.util.Arrays
						.equals(this.ruleset, other.getRuleset())))
				&& ((this.policy == null && other.getPolicy() == null) || (this.policy != null && this.policy
						.equals(other.getPolicy())));
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
		if (getKey() != null) {
			_hashCode += getKey().hashCode();
		}
		if (getLabel() != null) {
			_hashCode += getLabel().hashCode();
		}
		_hashCode += (isRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += (isUninstallable() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isRunning() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		if (getRuleset() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getRuleset()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getRuleset(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getPolicy() != null) {
			_hashCode += getPolicy().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostService.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostService"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("label");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "label"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("required");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"required"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("uninstallable");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"uninstallable"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("running");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"running"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ruleset");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"ruleset"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("policy");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"policy"));
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
