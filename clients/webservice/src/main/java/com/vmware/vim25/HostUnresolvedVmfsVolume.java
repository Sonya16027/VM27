/**
 * HostUnresolvedVmfsVolume.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostUnresolvedVmfsVolume  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.HostUnresolvedVmfsExtent[] extent;

    private java.lang.String vmfsLabel;

    private java.lang.String vmfsUuid;

    private int totalBlocks;

    private com.vmware.vim25.HostUnresolvedVmfsVolumeResolveStatus resolveStatus;

    public HostUnresolvedVmfsVolume() {
    }

    public HostUnresolvedVmfsVolume(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.HostUnresolvedVmfsExtent[] extent,
           java.lang.String vmfsLabel,
           java.lang.String vmfsUuid,
           int totalBlocks,
           com.vmware.vim25.HostUnresolvedVmfsVolumeResolveStatus resolveStatus) {
        super(
            dynamicType,
            dynamicProperty);
        this.extent = extent;
        this.vmfsLabel = vmfsLabel;
        this.vmfsUuid = vmfsUuid;
        this.totalBlocks = totalBlocks;
        this.resolveStatus = resolveStatus;
    }


    /**
     * Gets the extent value for this HostUnresolvedVmfsVolume.
     * 
     * @return extent
     */
    public com.vmware.vim25.HostUnresolvedVmfsExtent[] getExtent() {
        return extent;
    }


    /**
     * Sets the extent value for this HostUnresolvedVmfsVolume.
     * 
     * @param extent
     */
    public void setExtent(com.vmware.vim25.HostUnresolvedVmfsExtent[] extent) {
        this.extent = extent;
    }

    public com.vmware.vim25.HostUnresolvedVmfsExtent getExtent(int i) {
        return this.extent[i];
    }

    public void setExtent(int i, com.vmware.vim25.HostUnresolvedVmfsExtent _value) {
        this.extent[i] = _value;
    }


    /**
     * Gets the vmfsLabel value for this HostUnresolvedVmfsVolume.
     * 
     * @return vmfsLabel
     */
    public java.lang.String getVmfsLabel() {
        return vmfsLabel;
    }


    /**
     * Sets the vmfsLabel value for this HostUnresolvedVmfsVolume.
     * 
     * @param vmfsLabel
     */
    public void setVmfsLabel(java.lang.String vmfsLabel) {
        this.vmfsLabel = vmfsLabel;
    }


    /**
     * Gets the vmfsUuid value for this HostUnresolvedVmfsVolume.
     * 
     * @return vmfsUuid
     */
    public java.lang.String getVmfsUuid() {
        return vmfsUuid;
    }


    /**
     * Sets the vmfsUuid value for this HostUnresolvedVmfsVolume.
     * 
     * @param vmfsUuid
     */
    public void setVmfsUuid(java.lang.String vmfsUuid) {
        this.vmfsUuid = vmfsUuid;
    }


    /**
     * Gets the totalBlocks value for this HostUnresolvedVmfsVolume.
     * 
     * @return totalBlocks
     */
    public int getTotalBlocks() {
        return totalBlocks;
    }


    /**
     * Sets the totalBlocks value for this HostUnresolvedVmfsVolume.
     * 
     * @param totalBlocks
     */
    public void setTotalBlocks(int totalBlocks) {
        this.totalBlocks = totalBlocks;
    }


    /**
     * Gets the resolveStatus value for this HostUnresolvedVmfsVolume.
     * 
     * @return resolveStatus
     */
    public com.vmware.vim25.HostUnresolvedVmfsVolumeResolveStatus getResolveStatus() {
        return resolveStatus;
    }


    /**
     * Sets the resolveStatus value for this HostUnresolvedVmfsVolume.
     * 
     * @param resolveStatus
     */
    public void setResolveStatus(com.vmware.vim25.HostUnresolvedVmfsVolumeResolveStatus resolveStatus) {
        this.resolveStatus = resolveStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostUnresolvedVmfsVolume)) return false;
        HostUnresolvedVmfsVolume other = (HostUnresolvedVmfsVolume) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.extent==null && other.getExtent()==null) || 
             (this.extent!=null &&
              java.util.Arrays.equals(this.extent, other.getExtent()))) &&
            ((this.vmfsLabel==null && other.getVmfsLabel()==null) || 
             (this.vmfsLabel!=null &&
              this.vmfsLabel.equals(other.getVmfsLabel()))) &&
            ((this.vmfsUuid==null && other.getVmfsUuid()==null) || 
             (this.vmfsUuid!=null &&
              this.vmfsUuid.equals(other.getVmfsUuid()))) &&
            this.totalBlocks == other.getTotalBlocks() &&
            ((this.resolveStatus==null && other.getResolveStatus()==null) || 
             (this.resolveStatus!=null &&
              this.resolveStatus.equals(other.getResolveStatus())));
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
        if (getExtent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVmfsLabel() != null) {
            _hashCode += getVmfsLabel().hashCode();
        }
        if (getVmfsUuid() != null) {
            _hashCode += getVmfsUuid().hashCode();
        }
        _hashCode += getTotalBlocks();
        if (getResolveStatus() != null) {
            _hashCode += getResolveStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostUnresolvedVmfsVolume.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostUnresolvedVmfsVolume"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "extent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostUnresolvedVmfsExtent"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmfsLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmfsLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmfsUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmfsUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBlocks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "totalBlocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolveStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resolveStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostUnresolvedVmfsVolumeResolveStatus"));
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
