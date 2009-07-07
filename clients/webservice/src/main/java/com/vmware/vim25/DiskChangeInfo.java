/**
 * DiskChangeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DiskChangeInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private long startOffset;

    private long length;

    private com.vmware.vim25.DiskChangeExtent[] changedArea;

    public DiskChangeInfo() {
    }

    public DiskChangeInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           long startOffset,
           long length,
           com.vmware.vim25.DiskChangeExtent[] changedArea) {
        super(
            dynamicType,
            dynamicProperty);
        this.startOffset = startOffset;
        this.length = length;
        this.changedArea = changedArea;
    }


    /**
     * Gets the startOffset value for this DiskChangeInfo.
     * 
     * @return startOffset
     */
    public long getStartOffset() {
        return startOffset;
    }


    /**
     * Sets the startOffset value for this DiskChangeInfo.
     * 
     * @param startOffset
     */
    public void setStartOffset(long startOffset) {
        this.startOffset = startOffset;
    }


    /**
     * Gets the length value for this DiskChangeInfo.
     * 
     * @return length
     */
    public long getLength() {
        return length;
    }


    /**
     * Sets the length value for this DiskChangeInfo.
     * 
     * @param length
     */
    public void setLength(long length) {
        this.length = length;
    }


    /**
     * Gets the changedArea value for this DiskChangeInfo.
     * 
     * @return changedArea
     */
    public com.vmware.vim25.DiskChangeExtent[] getChangedArea() {
        return changedArea;
    }


    /**
     * Sets the changedArea value for this DiskChangeInfo.
     * 
     * @param changedArea
     */
    public void setChangedArea(com.vmware.vim25.DiskChangeExtent[] changedArea) {
        this.changedArea = changedArea;
    }

    public com.vmware.vim25.DiskChangeExtent getChangedArea(int i) {
        return this.changedArea[i];
    }

    public void setChangedArea(int i, com.vmware.vim25.DiskChangeExtent _value) {
        this.changedArea[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DiskChangeInfo)) return false;
        DiskChangeInfo other = (DiskChangeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.startOffset == other.getStartOffset() &&
            this.length == other.getLength() &&
            ((this.changedArea==null && other.getChangedArea()==null) || 
             (this.changedArea!=null &&
              java.util.Arrays.equals(this.changedArea, other.getChangedArea())));
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
        _hashCode += new Long(getStartOffset()).hashCode();
        _hashCode += new Long(getLength()).hashCode();
        if (getChangedArea() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangedArea());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangedArea(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DiskChangeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DiskChangeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "startOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedArea");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "changedArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DiskChangeExtent"));
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
