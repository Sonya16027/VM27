/**
 * ClusterRecommendation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterRecommendation extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String key;

	private java.lang.String type;

	private java.util.Calendar time;

	private int rating;

	private java.lang.String reason;

	private java.lang.String reasonText;

	private java.lang.String[] prerequisite;

	private com.vmware.vim25.ClusterAction[] action;

	private com.vmware.vim25.ManagedObjectReference target;

	public ClusterRecommendation() {
	}

	public ClusterRecommendation(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			java.lang.String key, java.lang.String type,
			java.util.Calendar time, int rating, java.lang.String reason,
			java.lang.String reasonText, java.lang.String[] prerequisite,
			com.vmware.vim25.ClusterAction[] action,
			com.vmware.vim25.ManagedObjectReference target) {
		super(dynamicType, dynamicProperty);
		this.key = key;
		this.type = type;
		this.time = time;
		this.rating = rating;
		this.reason = reason;
		this.reasonText = reasonText;
		this.prerequisite = prerequisite;
		this.action = action;
		this.target = target;
	}

	/**
	 * Gets the key value for this ClusterRecommendation.
	 * 
	 * @return key
	 */
	public java.lang.String getKey() {
		return key;
	}

	/**
	 * Sets the key value for this ClusterRecommendation.
	 * 
	 * @param key
	 */
	public void setKey(java.lang.String key) {
		this.key = key;
	}

	/**
	 * Gets the type value for this ClusterRecommendation.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * Sets the type value for this ClusterRecommendation.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 * Gets the time value for this ClusterRecommendation.
	 * 
	 * @return time
	 */
	public java.util.Calendar getTime() {
		return time;
	}

	/**
	 * Sets the time value for this ClusterRecommendation.
	 * 
	 * @param time
	 */
	public void setTime(java.util.Calendar time) {
		this.time = time;
	}

	/**
	 * Gets the rating value for this ClusterRecommendation.
	 * 
	 * @return rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * Sets the rating value for this ClusterRecommendation.
	 * 
	 * @param rating
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * Gets the reason value for this ClusterRecommendation.
	 * 
	 * @return reason
	 */
	public java.lang.String getReason() {
		return reason;
	}

	/**
	 * Sets the reason value for this ClusterRecommendation.
	 * 
	 * @param reason
	 */
	public void setReason(java.lang.String reason) {
		this.reason = reason;
	}

	/**
	 * Gets the reasonText value for this ClusterRecommendation.
	 * 
	 * @return reasonText
	 */
	public java.lang.String getReasonText() {
		return reasonText;
	}

	/**
	 * Sets the reasonText value for this ClusterRecommendation.
	 * 
	 * @param reasonText
	 */
	public void setReasonText(java.lang.String reasonText) {
		this.reasonText = reasonText;
	}

	/**
	 * Gets the prerequisite value for this ClusterRecommendation.
	 * 
	 * @return prerequisite
	 */
	public java.lang.String[] getPrerequisite() {
		return prerequisite;
	}

	/**
	 * Sets the prerequisite value for this ClusterRecommendation.
	 * 
	 * @param prerequisite
	 */
	public void setPrerequisite(java.lang.String[] prerequisite) {
		this.prerequisite = prerequisite;
	}

	public java.lang.String getPrerequisite(int i) {
		return this.prerequisite[i];
	}

	public void setPrerequisite(int i, java.lang.String _value) {
		this.prerequisite[i] = _value;
	}

	/**
	 * Gets the action value for this ClusterRecommendation.
	 * 
	 * @return action
	 */
	public com.vmware.vim25.ClusterAction[] getAction() {
		return action;
	}

	/**
	 * Sets the action value for this ClusterRecommendation.
	 * 
	 * @param action
	 */
	public void setAction(com.vmware.vim25.ClusterAction[] action) {
		this.action = action;
	}

	public com.vmware.vim25.ClusterAction getAction(int i) {
		return this.action[i];
	}

	public void setAction(int i, com.vmware.vim25.ClusterAction _value) {
		this.action[i] = _value;
	}

	/**
	 * Gets the target value for this ClusterRecommendation.
	 * 
	 * @return target
	 */
	public com.vmware.vim25.ManagedObjectReference getTarget() {
		return target;
	}

	/**
	 * Sets the target value for this ClusterRecommendation.
	 * 
	 * @param target
	 */
	public void setTarget(com.vmware.vim25.ManagedObjectReference target) {
		this.target = target;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ClusterRecommendation)) {
			return false;
		}
		ClusterRecommendation other = (ClusterRecommendation) obj;
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
				&& ((this.type == null && other.getType() == null) || (this.type != null && this.type
						.equals(other.getType())))
				&& ((this.time == null && other.getTime() == null) || (this.time != null && this.time
						.equals(other.getTime())))
				&& this.rating == other.getRating()
				&& ((this.reason == null && other.getReason() == null) || (this.reason != null && this.reason
						.equals(other.getReason())))
				&& ((this.reasonText == null && other.getReasonText() == null) || (this.reasonText != null && this.reasonText
						.equals(other.getReasonText())))
				&& ((this.prerequisite == null && other.getPrerequisite() == null) || (this.prerequisite != null && java.util.Arrays
						.equals(this.prerequisite, other.getPrerequisite())))
				&& ((this.action == null && other.getAction() == null) || (this.action != null && java.util.Arrays
						.equals(this.action, other.getAction())))
				&& ((this.target == null && other.getTarget() == null) || (this.target != null && this.target
						.equals(other.getTarget())));
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
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		if (getTime() != null) {
			_hashCode += getTime().hashCode();
		}
		_hashCode += getRating();
		if (getReason() != null) {
			_hashCode += getReason().hashCode();
		}
		if (getReasonText() != null) {
			_hashCode += getReasonText().hashCode();
		}
		if (getPrerequisite() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPrerequisite()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPrerequisite(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getAction() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getAction()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getAction(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getTarget() != null) {
			_hashCode += getTarget().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ClusterRecommendation.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterRecommendation"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("key");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "type"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("time");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "time"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rating");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"rating"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reason");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"reason"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reasonText");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"reasonText"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("prerequisite");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"prerequisite"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("action");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"action"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ClusterAction"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("target");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"target"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
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
