/**
 * ResourcePoolMovedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ResourcePoolMovedEvent extends com.vmware.vim25.ResourcePoolEvent
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ResourcePoolEventArgument oldParent;

	private com.vmware.vim25.ResourcePoolEventArgument newParent;

	public ResourcePoolMovedEvent() {
	}

	public ResourcePoolMovedEvent(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int key,
			int chainId, java.util.Calendar createdTime,
			java.lang.String userName,
			com.vmware.vim25.DatacenterEventArgument datacenter,
			com.vmware.vim25.ComputeResourceEventArgument computeResource,
			com.vmware.vim25.HostEventArgument host,
			com.vmware.vim25.VmEventArgument vm,
			com.vmware.vim25.DatastoreEventArgument ds,
			com.vmware.vim25.NetworkEventArgument net,
			com.vmware.vim25.DvsEventArgument dvs,
			java.lang.String fullFormattedMessage, java.lang.String changeTag,
			com.vmware.vim25.ResourcePoolEventArgument resourcePool,
			com.vmware.vim25.ResourcePoolEventArgument oldParent,
			com.vmware.vim25.ResourcePoolEventArgument newParent) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag, resourcePool);
		this.oldParent = oldParent;
		this.newParent = newParent;
	}

	/**
	 * Gets the oldParent value for this ResourcePoolMovedEvent.
	 * 
	 * @return oldParent
	 */
	public com.vmware.vim25.ResourcePoolEventArgument getOldParent() {
		return oldParent;
	}

	/**
	 * Sets the oldParent value for this ResourcePoolMovedEvent.
	 * 
	 * @param oldParent
	 */
	public void setOldParent(
			com.vmware.vim25.ResourcePoolEventArgument oldParent) {
		this.oldParent = oldParent;
	}

	/**
	 * Gets the newParent value for this ResourcePoolMovedEvent.
	 * 
	 * @return newParent
	 */
	public com.vmware.vim25.ResourcePoolEventArgument getNewParent() {
		return newParent;
	}

	/**
	 * Sets the newParent value for this ResourcePoolMovedEvent.
	 * 
	 * @param newParent
	 */
	public void setNewParent(
			com.vmware.vim25.ResourcePoolEventArgument newParent) {
		this.newParent = newParent;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ResourcePoolMovedEvent)) {
			return false;
		}
		ResourcePoolMovedEvent other = (ResourcePoolMovedEvent) obj;
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
				&& ((this.oldParent == null && other.getOldParent() == null) || (this.oldParent != null && this.oldParent
						.equals(other.getOldParent())))
				&& ((this.newParent == null && other.getNewParent() == null) || (this.newParent != null && this.newParent
						.equals(other.getNewParent())));
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
		if (getOldParent() != null) {
			_hashCode += getOldParent().hashCode();
		}
		if (getNewParent() != null) {
			_hashCode += getNewParent().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ResourcePoolMovedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ResourcePoolMovedEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("oldParent");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"oldParent"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ResourcePoolEventArgument"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("newParent");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"newParent"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ResourcePoolEventArgument"));
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
