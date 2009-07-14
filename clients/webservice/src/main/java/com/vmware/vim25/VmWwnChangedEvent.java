/**
 * VmWwnChangedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmWwnChangedEvent extends com.vmware.vim25.VmEvent implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long[] oldNodeWwns;

	private long[] oldPortWwns;

	private long[] newNodeWwns;

	private long[] newPortWwns;

	public VmWwnChangedEvent() {
	}

	public VmWwnChangedEvent(java.lang.String dynamicType,
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
			boolean template, long[] oldNodeWwns, long[] oldPortWwns,
			long[] newNodeWwns, long[] newPortWwns) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag, template);
		this.oldNodeWwns = oldNodeWwns;
		this.oldPortWwns = oldPortWwns;
		this.newNodeWwns = newNodeWwns;
		this.newPortWwns = newPortWwns;
	}

	/**
	 * Gets the oldNodeWwns value for this VmWwnChangedEvent.
	 * 
	 * @return oldNodeWwns
	 */
	public long[] getOldNodeWwns() {
		return oldNodeWwns;
	}

	/**
	 * Sets the oldNodeWwns value for this VmWwnChangedEvent.
	 * 
	 * @param oldNodeWwns
	 */
	public void setOldNodeWwns(long[] oldNodeWwns) {
		this.oldNodeWwns = oldNodeWwns;
	}

	public long getOldNodeWwns(int i) {
		return this.oldNodeWwns[i];
	}

	public void setOldNodeWwns(int i, long _value) {
		this.oldNodeWwns[i] = _value;
	}

	/**
	 * Gets the oldPortWwns value for this VmWwnChangedEvent.
	 * 
	 * @return oldPortWwns
	 */
	public long[] getOldPortWwns() {
		return oldPortWwns;
	}

	/**
	 * Sets the oldPortWwns value for this VmWwnChangedEvent.
	 * 
	 * @param oldPortWwns
	 */
	public void setOldPortWwns(long[] oldPortWwns) {
		this.oldPortWwns = oldPortWwns;
	}

	public long getOldPortWwns(int i) {
		return this.oldPortWwns[i];
	}

	public void setOldPortWwns(int i, long _value) {
		this.oldPortWwns[i] = _value;
	}

	/**
	 * Gets the newNodeWwns value for this VmWwnChangedEvent.
	 * 
	 * @return newNodeWwns
	 */
	public long[] getNewNodeWwns() {
		return newNodeWwns;
	}

	/**
	 * Sets the newNodeWwns value for this VmWwnChangedEvent.
	 * 
	 * @param newNodeWwns
	 */
	public void setNewNodeWwns(long[] newNodeWwns) {
		this.newNodeWwns = newNodeWwns;
	}

	public long getNewNodeWwns(int i) {
		return this.newNodeWwns[i];
	}

	public void setNewNodeWwns(int i, long _value) {
		this.newNodeWwns[i] = _value;
	}

	/**
	 * Gets the newPortWwns value for this VmWwnChangedEvent.
	 * 
	 * @return newPortWwns
	 */
	public long[] getNewPortWwns() {
		return newPortWwns;
	}

	/**
	 * Sets the newPortWwns value for this VmWwnChangedEvent.
	 * 
	 * @param newPortWwns
	 */
	public void setNewPortWwns(long[] newPortWwns) {
		this.newPortWwns = newPortWwns;
	}

	public long getNewPortWwns(int i) {
		return this.newPortWwns[i];
	}

	public void setNewPortWwns(int i, long _value) {
		this.newPortWwns[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmWwnChangedEvent)) {
			return false;
		}
		VmWwnChangedEvent other = (VmWwnChangedEvent) obj;
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
				&& ((this.oldNodeWwns == null && other.getOldNodeWwns() == null) || (this.oldNodeWwns != null && java.util.Arrays
						.equals(this.oldNodeWwns, other.getOldNodeWwns())))
				&& ((this.oldPortWwns == null && other.getOldPortWwns() == null) || (this.oldPortWwns != null && java.util.Arrays
						.equals(this.oldPortWwns, other.getOldPortWwns())))
				&& ((this.newNodeWwns == null && other.getNewNodeWwns() == null) || (this.newNodeWwns != null && java.util.Arrays
						.equals(this.newNodeWwns, other.getNewNodeWwns())))
				&& ((this.newPortWwns == null && other.getNewPortWwns() == null) || (this.newPortWwns != null && java.util.Arrays
						.equals(this.newPortWwns, other.getNewPortWwns())));
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
		if (getOldNodeWwns() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getOldNodeWwns()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getOldNodeWwns(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getOldPortWwns() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getOldPortWwns()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getOldPortWwns(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getNewNodeWwns() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getNewNodeWwns()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getNewNodeWwns(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getNewPortWwns() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getNewPortWwns()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getNewPortWwns(), i);
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
			VmWwnChangedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmWwnChangedEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("oldNodeWwns");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"oldNodeWwns"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("oldPortWwns");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"oldPortWwns"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("newNodeWwns");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"newNodeWwns"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("newPortWwns");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"newPortWwns"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long"));
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
