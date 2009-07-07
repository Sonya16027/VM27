/**
 * VirtualMachineFileLayoutEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineFileLayoutEx  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.VirtualMachineFileLayoutExFileInfo[] file;

    private com.vmware.vim25.VirtualMachineFileLayoutExDiskLayout[] disk;

    private com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout[] snapshot;

    private java.util.Calendar timestamp;

    public VirtualMachineFileLayoutEx() {
    }

    public VirtualMachineFileLayoutEx(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.VirtualMachineFileLayoutExFileInfo[] file,
           com.vmware.vim25.VirtualMachineFileLayoutExDiskLayout[] disk,
           com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout[] snapshot,
           java.util.Calendar timestamp) {
        super(
            dynamicType,
            dynamicProperty);
        this.file = file;
        this.disk = disk;
        this.snapshot = snapshot;
        this.timestamp = timestamp;
    }


    /**
     * Gets the file value for this VirtualMachineFileLayoutEx.
     * 
     * @return file
     */
    public com.vmware.vim25.VirtualMachineFileLayoutExFileInfo[] getFile() {
        return file;
    }


    /**
     * Sets the file value for this VirtualMachineFileLayoutEx.
     * 
     * @param file
     */
    public void setFile(com.vmware.vim25.VirtualMachineFileLayoutExFileInfo[] file) {
        this.file = file;
    }

    public com.vmware.vim25.VirtualMachineFileLayoutExFileInfo getFile(int i) {
        return this.file[i];
    }

    public void setFile(int i, com.vmware.vim25.VirtualMachineFileLayoutExFileInfo _value) {
        this.file[i] = _value;
    }


    /**
     * Gets the disk value for this VirtualMachineFileLayoutEx.
     * 
     * @return disk
     */
    public com.vmware.vim25.VirtualMachineFileLayoutExDiskLayout[] getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this VirtualMachineFileLayoutEx.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.vim25.VirtualMachineFileLayoutExDiskLayout[] disk) {
        this.disk = disk;
    }

    public com.vmware.vim25.VirtualMachineFileLayoutExDiskLayout getDisk(int i) {
        return this.disk[i];
    }

    public void setDisk(int i, com.vmware.vim25.VirtualMachineFileLayoutExDiskLayout _value) {
        this.disk[i] = _value;
    }


    /**
     * Gets the snapshot value for this VirtualMachineFileLayoutEx.
     * 
     * @return snapshot
     */
    public com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout[] getSnapshot() {
        return snapshot;
    }


    /**
     * Sets the snapshot value for this VirtualMachineFileLayoutEx.
     * 
     * @param snapshot
     */
    public void setSnapshot(com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout[] snapshot) {
        this.snapshot = snapshot;
    }

    public com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout getSnapshot(int i) {
        return this.snapshot[i];
    }

    public void setSnapshot(int i, com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout _value) {
        this.snapshot[i] = _value;
    }


    /**
     * Gets the timestamp value for this VirtualMachineFileLayoutEx.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this VirtualMachineFileLayoutEx.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineFileLayoutEx)) return false;
        VirtualMachineFileLayoutEx other = (VirtualMachineFileLayoutEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.file==null && other.getFile()==null) || 
             (this.file!=null &&
              java.util.Arrays.equals(this.file, other.getFile()))) &&
            ((this.disk==null && other.getDisk()==null) || 
             (this.disk!=null &&
              java.util.Arrays.equals(this.disk, other.getDisk()))) &&
            ((this.snapshot==null && other.getSnapshot()==null) || 
             (this.snapshot!=null &&
              java.util.Arrays.equals(this.snapshot, other.getSnapshot()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp())));
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
        if (getFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getSnapshot() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSnapshot());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSnapshot(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineFileLayoutEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileLayoutEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "file"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileLayoutExFileInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileLayoutExDiskLayout"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshot");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "snapshot"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFileLayoutExSnapshotLayout"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
