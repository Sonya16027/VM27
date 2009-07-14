/**
 * HostWwnConflictEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostWwnConflictEvent extends com.vmware.vim25.HostEvent implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.VmEventArgument[] conflictedVms;

	private com.vmware.vim25.HostEventArgument[] conflictedHosts;

	private long wwn;

	public HostWwnConflictEvent() {
	}

	public HostWwnConflictEvent(java.lang.String dynamicType,
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
			com.vmware.vim25.VmEventArgument[] conflictedVms,
			com.vmware.vim25.HostEventArgument[] conflictedHosts, long wwn) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag);
		this.conflictedVms = conflictedVms;
		this.conflictedHosts = conflictedHosts;
		this.wwn = wwn;
	}

	/**
	 * Gets the conflictedVms value for this HostWwnConflictEvent.
	 * 
	 * @return conflictedVms
	 */
	public com.vmware.vim25.VmEventArgument[] getConflictedVms() {
		return conflictedVms;
	}

	/**
	 * Sets the conflictedVms value for this HostWwnConflictEvent.
	 * 
	 * @param conflictedVms
	 */
	public void setConflictedVms(
			com.vmware.vim25.VmEventArgument[] conflictedVms) {
		this.conflictedVms = conflictedVms;
	}

	public com.vmware.vim25.VmEventArgument getConflictedVms(int i) {
		return this.conflictedVms[i];
	}

	public void setConflictedVms(int i, com.vmware.vim25.VmEventArgument _value) {
		this.conflictedVms[i] = _value;
	}

	/**
	 * Gets the conflictedHosts value for this HostWwnConflictEvent.
	 * 
	 * @return conflictedHosts
	 */
	public com.vmware.vim25.HostEventArgument[] getConflictedHosts() {
		return conflictedHosts;
	}

	/**
	 * Sets the conflictedHosts value for this HostWwnConflictEvent.
	 * 
	 * @param conflictedHosts
	 */
	public void setConflictedHosts(
			com.vmware.vim25.HostEventArgument[] conflictedHosts) {
		this.conflictedHosts = conflictedHosts;
	}

	public com.vmware.vim25.HostEventArgument getConflictedHosts(int i) {
		return this.conflictedHosts[i];
	}

	public void setConflictedHosts(int i,
			com.vmware.vim25.HostEventArgument _value) {
		this.conflictedHosts[i] = _value;
	}

	/**
	 * Gets the wwn value for this HostWwnConflictEvent.
	 * 
	 * @return wwn
	 */
	public long getWwn() {
		return wwn;
	}

	/**
	 * Sets the wwn value for this HostWwnConflictEvent.
	 * 
	 * @param wwn
	 */
	public void setWwn(long wwn) {
		this.wwn = wwn;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostWwnConflictEvent)) {
			return false;
		}
		HostWwnConflictEvent other = (HostWwnConflictEvent) obj;
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
				&& ((this.conflictedVms == null && other.getConflictedVms() == null) || (this.conflictedVms != null && java.util.Arrays
						.equals(this.conflictedVms, other.getConflictedVms())))
				&& ((this.conflictedHosts == null && other.getConflictedHosts() == null) || (this.conflictedHosts != null && java.util.Arrays
						.equals(this.conflictedHosts, other
								.getConflictedHosts())))
				&& this.wwn == other.getWwn();
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
		if (getConflictedVms() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getConflictedVms()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getConflictedVms(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getConflictedHosts() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getConflictedHosts()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getConflictedHosts(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		_hashCode += new Long(getWwn()).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			HostWwnConflictEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostWwnConflictEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("conflictedVms");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"conflictedVms"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmEventArgument"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("conflictedHosts");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"conflictedHosts"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostEventArgument"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("wwn");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "wwn"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
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
