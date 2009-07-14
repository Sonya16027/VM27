/**
 * DVSTrafficShapingPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVSTrafficShapingPolicy extends com.vmware.vim25.InheritablePolicy
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.BoolPolicy enabled;

	private com.vmware.vim25.LongPolicy averageBandwidth;

	private com.vmware.vim25.LongPolicy peakBandwidth;

	private com.vmware.vim25.LongPolicy burstSize;

	public DVSTrafficShapingPolicy() {
	}

	public DVSTrafficShapingPolicy(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			boolean inherited, com.vmware.vim25.BoolPolicy enabled,
			com.vmware.vim25.LongPolicy averageBandwidth,
			com.vmware.vim25.LongPolicy peakBandwidth,
			com.vmware.vim25.LongPolicy burstSize) {
		super(dynamicType, dynamicProperty, inherited);
		this.enabled = enabled;
		this.averageBandwidth = averageBandwidth;
		this.peakBandwidth = peakBandwidth;
		this.burstSize = burstSize;
	}

	/**
	 * Gets the enabled value for this DVSTrafficShapingPolicy.
	 * 
	 * @return enabled
	 */
	public com.vmware.vim25.BoolPolicy getEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled value for this DVSTrafficShapingPolicy.
	 * 
	 * @param enabled
	 */
	public void setEnabled(com.vmware.vim25.BoolPolicy enabled) {
		this.enabled = enabled;
	}

	/**
	 * Gets the averageBandwidth value for this DVSTrafficShapingPolicy.
	 * 
	 * @return averageBandwidth
	 */
	public com.vmware.vim25.LongPolicy getAverageBandwidth() {
		return averageBandwidth;
	}

	/**
	 * Sets the averageBandwidth value for this DVSTrafficShapingPolicy.
	 * 
	 * @param averageBandwidth
	 */
	public void setAverageBandwidth(com.vmware.vim25.LongPolicy averageBandwidth) {
		this.averageBandwidth = averageBandwidth;
	}

	/**
	 * Gets the peakBandwidth value for this DVSTrafficShapingPolicy.
	 * 
	 * @return peakBandwidth
	 */
	public com.vmware.vim25.LongPolicy getPeakBandwidth() {
		return peakBandwidth;
	}

	/**
	 * Sets the peakBandwidth value for this DVSTrafficShapingPolicy.
	 * 
	 * @param peakBandwidth
	 */
	public void setPeakBandwidth(com.vmware.vim25.LongPolicy peakBandwidth) {
		this.peakBandwidth = peakBandwidth;
	}

	/**
	 * Gets the burstSize value for this DVSTrafficShapingPolicy.
	 * 
	 * @return burstSize
	 */
	public com.vmware.vim25.LongPolicy getBurstSize() {
		return burstSize;
	}

	/**
	 * Sets the burstSize value for this DVSTrafficShapingPolicy.
	 * 
	 * @param burstSize
	 */
	public void setBurstSize(com.vmware.vim25.LongPolicy burstSize) {
		this.burstSize = burstSize;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DVSTrafficShapingPolicy)) {
			return false;
		}
		DVSTrafficShapingPolicy other = (DVSTrafficShapingPolicy) obj;
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
				&& ((this.enabled == null && other.getEnabled() == null) || (this.enabled != null && this.enabled
						.equals(other.getEnabled())))
				&& ((this.averageBandwidth == null && other
						.getAverageBandwidth() == null) || (this.averageBandwidth != null && this.averageBandwidth
						.equals(other.getAverageBandwidth())))
				&& ((this.peakBandwidth == null && other.getPeakBandwidth() == null) || (this.peakBandwidth != null && this.peakBandwidth
						.equals(other.getPeakBandwidth())))
				&& ((this.burstSize == null && other.getBurstSize() == null) || (this.burstSize != null && this.burstSize
						.equals(other.getBurstSize())));
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
		if (getEnabled() != null) {
			_hashCode += getEnabled().hashCode();
		}
		if (getAverageBandwidth() != null) {
			_hashCode += getAverageBandwidth().hashCode();
		}
		if (getPeakBandwidth() != null) {
			_hashCode += getPeakBandwidth().hashCode();
		}
		if (getBurstSize() != null) {
			_hashCode += getBurstSize().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DVSTrafficShapingPolicy.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DVSTrafficShapingPolicy"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("enabled");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"enabled"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"BoolPolicy"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("averageBandwidth");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"averageBandwidth"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LongPolicy"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("peakBandwidth");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"peakBandwidth"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LongPolicy"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("burstSize");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"burstSize"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LongPolicy"));
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
