/**
 * VirtualDiskFlatVer2BackingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualDiskFlatVer2BackingInfo  extends com.vmware.vim25.VirtualDeviceFileBackingInfo  implements java.io.Serializable {
    private java.lang.String diskMode;

    private java.lang.Boolean split;

    private java.lang.Boolean writeThrough;

    private java.lang.Boolean thinProvisioned;

    private java.lang.Boolean eagerlyScrub;

    private java.lang.String uuid;

    private java.lang.String contentId;

    private java.lang.String changeId;

    private com.vmware.vim25.VirtualDiskFlatVer2BackingInfo parent;

    public VirtualDiskFlatVer2BackingInfo() {
    }

    public VirtualDiskFlatVer2BackingInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String fileName,
           com.vmware.vim25.ManagedObjectReference datastore,
           java.lang.String diskMode,
           java.lang.Boolean split,
           java.lang.Boolean writeThrough,
           java.lang.Boolean thinProvisioned,
           java.lang.Boolean eagerlyScrub,
           java.lang.String uuid,
           java.lang.String contentId,
           java.lang.String changeId,
           com.vmware.vim25.VirtualDiskFlatVer2BackingInfo parent) {
        super(
            dynamicType,
            dynamicProperty,
            fileName,
            datastore);
        this.diskMode = diskMode;
        this.split = split;
        this.writeThrough = writeThrough;
        this.thinProvisioned = thinProvisioned;
        this.eagerlyScrub = eagerlyScrub;
        this.uuid = uuid;
        this.contentId = contentId;
        this.changeId = changeId;
        this.parent = parent;
    }


    /**
     * Gets the diskMode value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @return diskMode
     */
    public java.lang.String getDiskMode() {
        return diskMode;
    }


    /**
     * Sets the diskMode value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @param diskMode
     */
    public void setDiskMode(java.lang.String diskMode) {
        this.diskMode = diskMode;
    }


    /**
     * Gets the split value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @return split
     */
    public java.lang.Boolean getSplit() {
        return split;
    }


    /**
     * Sets the split value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @param split
     */
    public void setSplit(java.lang.Boolean split) {
        this.split = split;
    }


    /**
     * Gets the writeThrough value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @return writeThrough
     */
    public java.lang.Boolean getWriteThrough() {
        return writeThrough;
    }


    /**
     * Sets the writeThrough value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @param writeThrough
     */
    public void setWriteThrough(java.lang.Boolean writeThrough) {
        this.writeThrough = writeThrough;
    }


    /**
     * Gets the thinProvisioned value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @return thinProvisioned
     */
    public java.lang.Boolean getThinProvisioned() {
        return thinProvisioned;
    }


    /**
     * Sets the thinProvisioned value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @param thinProvisioned
     */
    public void setThinProvisioned(java.lang.Boolean thinProvisioned) {
        this.thinProvisioned = thinProvisioned;
    }


    /**
     * Gets the eagerlyScrub value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @return eagerlyScrub
     */
    public java.lang.Boolean getEagerlyScrub() {
        return eagerlyScrub;
    }


    /**
     * Sets the eagerlyScrub value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @param eagerlyScrub
     */
    public void setEagerlyScrub(java.lang.Boolean eagerlyScrub) {
        this.eagerlyScrub = eagerlyScrub;
    }


    /**
     * Gets the uuid value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the contentId value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @return contentId
     */
    public java.lang.String getContentId() {
        return contentId;
    }


    /**
     * Sets the contentId value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @param contentId
     */
    public void setContentId(java.lang.String contentId) {
        this.contentId = contentId;
    }


    /**
     * Gets the changeId value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @return changeId
     */
    public java.lang.String getChangeId() {
        return changeId;
    }


    /**
     * Sets the changeId value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @param changeId
     */
    public void setChangeId(java.lang.String changeId) {
        this.changeId = changeId;
    }


    /**
     * Gets the parent value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @return parent
     */
    public com.vmware.vim25.VirtualDiskFlatVer2BackingInfo getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this VirtualDiskFlatVer2BackingInfo.
     * 
     * @param parent
     */
    public void setParent(com.vmware.vim25.VirtualDiskFlatVer2BackingInfo parent) {
        this.parent = parent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualDiskFlatVer2BackingInfo)) return false;
        VirtualDiskFlatVer2BackingInfo other = (VirtualDiskFlatVer2BackingInfo) obj;
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
            ((this.thinProvisioned==null && other.getThinProvisioned()==null) || 
             (this.thinProvisioned!=null &&
              this.thinProvisioned.equals(other.getThinProvisioned()))) &&
            ((this.eagerlyScrub==null && other.getEagerlyScrub()==null) || 
             (this.eagerlyScrub!=null &&
              this.eagerlyScrub.equals(other.getEagerlyScrub()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.contentId==null && other.getContentId()==null) || 
             (this.contentId!=null &&
              this.contentId.equals(other.getContentId()))) &&
            ((this.changeId==null && other.getChangeId()==null) || 
             (this.changeId!=null &&
              this.changeId.equals(other.getChangeId()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent())));
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
        if (getThinProvisioned() != null) {
            _hashCode += getThinProvisioned().hashCode();
        }
        if (getEagerlyScrub() != null) {
            _hashCode += getEagerlyScrub().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getContentId() != null) {
            _hashCode += getContentId().hashCode();
        }
        if (getChangeId() != null) {
            _hashCode += getChangeId().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualDiskFlatVer2BackingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskFlatVer2BackingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "diskMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("split");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "split"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeThrough");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "writeThrough"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thinProvisioned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "thinProvisioned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eagerlyScrub");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eagerlyScrub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "contentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "changeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDiskFlatVer2BackingInfo"));
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
