/**
 * VirtualDiskSparseVer1BackingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualDiskSparseVer1BackingInfo  extends com.vmware.vim.VirtualDeviceFileBackingInfo  implements java.io.Serializable {
    private java.lang.String diskMode;

    private java.lang.Boolean split;

    private java.lang.Boolean writeThrough;

    private java.lang.Long spaceUsedInKB;

    public VirtualDiskSparseVer1BackingInfo() {
    }

    public VirtualDiskSparseVer1BackingInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String fileName,
           com.vmware.vim.ManagedObjectReference datastore,
           java.lang.String diskMode,
           java.lang.Boolean split,
           java.lang.Boolean writeThrough,
           java.lang.Long spaceUsedInKB) {
        super(
            dynamicType,
            dynamicProperty,
            fileName,
            datastore);
        this.diskMode = diskMode;
        this.split = split;
        this.writeThrough = writeThrough;
        this.spaceUsedInKB = spaceUsedInKB;
    }


    /**
     * Gets the diskMode value for this VirtualDiskSparseVer1BackingInfo.
     * 
     * @return diskMode
     */
    public java.lang.String getDiskMode() {
        return diskMode;
    }


    /**
     * Sets the diskMode value for this VirtualDiskSparseVer1BackingInfo.
     * 
     * @param diskMode
     */
    public void setDiskMode(java.lang.String diskMode) {
        this.diskMode = diskMode;
    }


    /**
     * Gets the split value for this VirtualDiskSparseVer1BackingInfo.
     * 
     * @return split
     */
    public java.lang.Boolean getSplit() {
        return split;
    }


    /**
     * Sets the split value for this VirtualDiskSparseVer1BackingInfo.
     * 
     * @param split
     */
    public void setSplit(java.lang.Boolean split) {
        this.split = split;
    }


    /**
     * Gets the writeThrough value for this VirtualDiskSparseVer1BackingInfo.
     * 
     * @return writeThrough
     */
    public java.lang.Boolean getWriteThrough() {
        return writeThrough;
    }


    /**
     * Sets the writeThrough value for this VirtualDiskSparseVer1BackingInfo.
     * 
     * @param writeThrough
     */
    public void setWriteThrough(java.lang.Boolean writeThrough) {
        this.writeThrough = writeThrough;
    }


    /**
     * Gets the spaceUsedInKB value for this VirtualDiskSparseVer1BackingInfo.
     * 
     * @return spaceUsedInKB
     */
    public java.lang.Long getSpaceUsedInKB() {
        return spaceUsedInKB;
    }


    /**
     * Sets the spaceUsedInKB value for this VirtualDiskSparseVer1BackingInfo.
     * 
     * @param spaceUsedInKB
     */
    public void setSpaceUsedInKB(java.lang.Long spaceUsedInKB) {
        this.spaceUsedInKB = spaceUsedInKB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskSparseVer1BackingInfo)) return false;
        VirtualDiskSparseVer1BackingInfo other = (VirtualDiskSparseVer1BackingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.diskMode==null && other.getDiskMode()==null) || 
             (this.diskMode!=null &&
              this.diskMode.equals(other.getDiskMode()))) &&
            ((this.split==null && other.getSplit()==null) || 
             (this.split!=null &&
              this.split.equals(other.getSplit()))) &&
            ((this.writeThrough==null && other.getWriteThrough()==null) || 
             (this.writeThrough!=null &&
              this.writeThrough.equals(other.getWriteThrough()))) &&
            ((this.spaceUsedInKB==null && other.getSpaceUsedInKB()==null) || 
             (this.spaceUsedInKB!=null &&
              this.spaceUsedInKB.equals(other.getSpaceUsedInKB())));
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
        if (getDiskMode() != null) {
            _hashCode += getDiskMode().hashCode();
        }
        if (getSplit() != null) {
            _hashCode += getSplit().hashCode();
        }
        if (getWriteThrough() != null) {
            _hashCode += getWriteThrough().hashCode();
        }
        if (getSpaceUsedInKB() != null) {
            _hashCode += getSpaceUsedInKB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDiskSparseVer1BackingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VirtualDiskSparseVer1BackingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "diskMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("split");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "split"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeThrough");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "writeThrough"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spaceUsedInKB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "spaceUsedInKB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
