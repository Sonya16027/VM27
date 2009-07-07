/**
 * VirtualMachineRelocateSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualMachineRelocateSpec  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.ManagedObjectReference datastore;

    private com.vmware.vim.ManagedObjectReference pool;

    private com.vmware.vim.ManagedObjectReference host;

    private com.vmware.vim.VirtualMachineRelocateSpecDiskLocator[] disk;

    private com.vmware.vim.VirtualMachineRelocateTransformation transform;

    public VirtualMachineRelocateSpec() {
    }

    public VirtualMachineRelocateSpec(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           com.vmware.vim.ManagedObjectReference datastore,
           com.vmware.vim.ManagedObjectReference pool,
           com.vmware.vim.ManagedObjectReference host,
           com.vmware.vim.VirtualMachineRelocateSpecDiskLocator[] disk,
           com.vmware.vim.VirtualMachineRelocateTransformation transform) {
        super(
            dynamicType,
            dynamicProperty);
        this.datastore = datastore;
        this.pool = pool;
        this.host = host;
        this.disk = disk;
        this.transform = transform;
    }


    /**
     * Gets the datastore value for this VirtualMachineRelocateSpec.
     * 
     * @return datastore
     */
    public com.vmware.vim.ManagedObjectReference getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this VirtualMachineRelocateSpec.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.vim.ManagedObjectReference datastore) {
        this.datastore = datastore;
    }


    /**
     * Gets the pool value for this VirtualMachineRelocateSpec.
     * 
     * @return pool
     */
    public com.vmware.vim.ManagedObjectReference getPool() {
        return pool;
    }


    /**
     * Sets the pool value for this VirtualMachineRelocateSpec.
     * 
     * @param pool
     */
    public void setPool(com.vmware.vim.ManagedObjectReference pool) {
        this.pool = pool;
    }


    /**
     * Gets the host value for this VirtualMachineRelocateSpec.
     * 
     * @return host
     */
    public com.vmware.vim.ManagedObjectReference getHost() {
        return host;
    }


    /**
     * Sets the host value for this VirtualMachineRelocateSpec.
     * 
     * @param host
     */
    public void setHost(com.vmware.vim.ManagedObjectReference host) {
        this.host = host;
    }


    /**
     * Gets the disk value for this VirtualMachineRelocateSpec.
     * 
     * @return disk
     */
    public com.vmware.vim.VirtualMachineRelocateSpecDiskLocator[] getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this VirtualMachineRelocateSpec.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.vim.VirtualMachineRelocateSpecDiskLocator[] disk) {
        this.disk = disk;
    }

    public com.vmware.vim.VirtualMachineRelocateSpecDiskLocator getDisk(int i) {
        return this.disk[i];
    }

    public void setDisk(int i, com.vmware.vim.VirtualMachineRelocateSpecDiskLocator _value) {
        this.disk[i] = _value;
    }


    /**
     * Gets the transform value for this VirtualMachineRelocateSpec.
     * 
     * @return transform
     */
    public com.vmware.vim.VirtualMachineRelocateTransformation getTransform() {
        return transform;
    }


    /**
     * Sets the transform value for this VirtualMachineRelocateSpec.
     * 
     * @param transform
     */
    public void setTransform(com.vmware.vim.VirtualMachineRelocateTransformation transform) {
        this.transform = transform;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineRelocateSpec)) return false;
        VirtualMachineRelocateSpec other = (VirtualMachineRelocateSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              this.datastore.equals(other.getDatastore()))) &&
            ((this.pool==null && other.getPool()==null) || 
             (this.pool!=null &&
              this.pool.equals(other.getPool()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.disk==null && other.getDisk()==null) || 
             (this.disk!=null &&
              java.util.Arrays.equals(this.disk, other.getDisk()))) &&
            ((this.transform==null && other.getTransform()==null) || 
             (this.transform!=null &&
              this.transform.equals(other.getTransform())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDatastore() != null) {
            _hashCode += getDatastore().hashCode();
        }
        if (getPool() != null) {
            _hashCode += getPool().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getDisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransform() != null) {
            _hashCode += getTransform().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineRelocateSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineRelocateSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "datastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pool");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "pool"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineRelocateSpecDiskLocator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transform");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "transform"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualMachineRelocateTransformation"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
