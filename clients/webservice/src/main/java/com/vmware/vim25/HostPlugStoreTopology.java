/**
 * HostPlugStoreTopology.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostPlugStoreTopology extends com.vmware.vim25.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.HostPlugStoreTopologyAdapter[] adapter;

	private com.vmware.vim25.HostPlugStoreTopologyPath[] path;

	private com.vmware.vim25.HostPlugStoreTopologyTarget[] target;

	private com.vmware.vim25.HostPlugStoreTopologyDevice[] device;

	private com.vmware.vim25.HostPlugStoreTopologyPlugin[] plugin;

	public HostPlugStoreTopology() {
	}

	public HostPlugStoreTopology(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.HostPlugStoreTopologyAdapter[] adapter,
			com.vmware.vim25.HostPlugStoreTopologyPath[] path,
			com.vmware.vim25.HostPlugStoreTopologyTarget[] target,
			com.vmware.vim25.HostPlugStoreTopologyDevice[] device,
			com.vmware.vim25.HostPlugStoreTopologyPlugin[] plugin) {
		super(dynamicType, dynamicProperty);
		this.adapter = adapter;
		this.path = path;
		this.target = target;
		this.device = device;
		this.plugin = plugin;
	}

	/**
	 * Gets the adapter value for this HostPlugStoreTopology.
	 * 
	 * @return adapter
	 */
	public com.vmware.vim25.HostPlugStoreTopologyAdapter[] getAdapter() {
		return adapter;
	}

	/**
	 * Sets the adapter value for this HostPlugStoreTopology.
	 * 
	 * @param adapter
	 */
	public void setAdapter(
			com.vmware.vim25.HostPlugStoreTopologyAdapter[] adapter) {
		this.adapter = adapter;
	}

	public com.vmware.vim25.HostPlugStoreTopologyAdapter getAdapter(int i) {
		return this.adapter[i];
	}

	public void setAdapter(int i,
			com.vmware.vim25.HostPlugStoreTopologyAdapter _value) {
		this.adapter[i] = _value;
	}

	/**
	 * Gets the path value for this HostPlugStoreTopology.
	 * 
	 * @return path
	 */
	public com.vmware.vim25.HostPlugStoreTopologyPath[] getPath() {
		return path;
	}

	/**
	 * Sets the path value for this HostPlugStoreTopology.
	 * 
	 * @param path
	 */
	public void setPath(com.vmware.vim25.HostPlugStoreTopologyPath[] path) {
		this.path = path;
	}

	public com.vmware.vim25.HostPlugStoreTopologyPath getPath(int i) {
		return this.path[i];
	}

	public void setPath(int i, com.vmware.vim25.HostPlugStoreTopologyPath _value) {
		this.path[i] = _value;
	}

	/**
	 * Gets the target value for this HostPlugStoreTopology.
	 * 
	 * @return target
	 */
	public com.vmware.vim25.HostPlugStoreTopologyTarget[] getTarget() {
		return target;
	}

	/**
	 * Sets the target value for this HostPlugStoreTopology.
	 * 
	 * @param target
	 */
	public void setTarget(com.vmware.vim25.HostPlugStoreTopologyTarget[] target) {
		this.target = target;
	}

	public com.vmware.vim25.HostPlugStoreTopologyTarget getTarget(int i) {
		return this.target[i];
	}

	public void setTarget(int i,
			com.vmware.vim25.HostPlugStoreTopologyTarget _value) {
		this.target[i] = _value;
	}

	/**
	 * Gets the device value for this HostPlugStoreTopology.
	 * 
	 * @return device
	 */
	public com.vmware.vim25.HostPlugStoreTopologyDevice[] getDevice() {
		return device;
	}

	/**
	 * Sets the device value for this HostPlugStoreTopology.
	 * 
	 * @param device
	 */
	public void setDevice(com.vmware.vim25.HostPlugStoreTopologyDevice[] device) {
		this.device = device;
	}

	public com.vmware.vim25.HostPlugStoreTopologyDevice getDevice(int i) {
		return this.device[i];
	}

	public void setDevice(int i,
			com.vmware.vim25.HostPlugStoreTopologyDevice _value) {
		this.device[i] = _value;
	}

	/**
	 * Gets the plugin value for this HostPlugStoreTopology.
	 * 
	 * @return plugin
	 */
	public com.vmware.vim25.HostPlugStoreTopologyPlugin[] getPlugin() {
		return plugin;
	}

	/**
	 * Sets the plugin value for this HostPlugStoreTopology.
	 * 
	 * @param plugin
	 */
	public void setPlugin(com.vmware.vim25.HostPlugStoreTopologyPlugin[] plugin) {
		this.plugin = plugin;
	}

	public com.vmware.vim25.HostPlugStoreTopologyPlugin getPlugin(int i) {
		return this.plugin[i];
	}

	public void setPlugin(int i,
			com.vmware.vim25.HostPlugStoreTopologyPlugin _value) {
		this.plugin[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostPlugStoreTopology)) {
			return false;
		}
		HostPlugStoreTopology other = (HostPlugStoreTopology) obj;
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
				&& ((this.adapter == null && other.getAdapter() == null) || (this.adapter != null && java.util.Arrays
						.equals(this.adapter, other.getAdapter())))
				&& ((this.path == null && other.getPath() == null) || (this.path != null && java.util.Arrays
						.equals(this.path, other.getPath())))
				&& ((this.target == null && other.getTarget() == null) || (this.target != null && java.util.Arrays
						.equals(this.target, other.getTarget())))
				&& ((this.device == null && other.getDevice() == null) || (this.device != null && java.util.Arrays
						.equals(this.device, other.getDevice())))
				&& ((this.plugin == null && other.getPlugin() == null) || (this.plugin != null && java.util.Arrays
						.equals(this.plugin, other.getPlugin())));
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
		if (getAdapter() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getAdapter()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getAdapter(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getPath() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getPath()); i++) {
				java.lang.Object obj = java.lang.reflect.Array
						.get(getPath(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getTarget() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getTarget()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getTarget(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getDevice() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getDevice()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getDevice(),
						i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getPlugin() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getPlugin()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getPlugin(),
						i);
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
			HostPlugStoreTopology.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPlugStoreTopology"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("adapter");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"adapter"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPlugStoreTopologyAdapter"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("path");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "path"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPlugStoreTopologyPath"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("target");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"target"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPlugStoreTopologyTarget"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("device");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"device"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPlugStoreTopologyDevice"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("plugin");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"plugin"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostPlugStoreTopologyPlugin"));
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
