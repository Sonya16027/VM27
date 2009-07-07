/**
 * PromoteDisksRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PromoteDisksRequestType  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference _this;

    private boolean unlink;

    private com.vmware.vim25.VirtualDisk[] disks;

    public PromoteDisksRequestType() {
    }

    public PromoteDisksRequestType(
           com.vmware.vim25.ManagedObjectReference _this,
           boolean unlink,
           com.vmware.vim25.VirtualDisk[] disks) {
           this._this = _this;
           this.unlink = unlink;
           this.disks = disks;
    }


    /**
     * Gets the _this value for this PromoteDisksRequestType.
     * 
     * @return _this
     */
    public com.vmware.vim25.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this PromoteDisksRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the unlink value for this PromoteDisksRequestType.
     * 
     * @return unlink
     */
    public boolean isUnlink() {
        return unlink;
    }


    /**
     * Sets the unlink value for this PromoteDisksRequestType.
     * 
     * @param unlink
     */
    public void setUnlink(boolean unlink) {
        this.unlink = unlink;
    }


    /**
     * Gets the disks value for this PromoteDisksRequestType.
     * 
     * @return disks
     */
    public com.vmware.vim25.VirtualDisk[] getDisks() {
        return disks;
    }


    /**
     * Sets the disks value for this PromoteDisksRequestType.
     * 
     * @param disks
     */
    public void setDisks(com.vmware.vim25.VirtualDisk[] disks) {
        this.disks = disks;
    }

    public com.vmware.vim25.VirtualDisk getDisks(int i) {
        return this.disks[i];
    }

    public void setDisks(int i, com.vmware.vim25.VirtualDisk _value) {
        this.disks[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromoteDisksRequestType)) return false;
        PromoteDisksRequestType other = (PromoteDisksRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._this==null && other.get_this()==null) || 
             (this._this!=null &&
              this._this.equals(other.get_this()))) &&
            this.unlink == other.isUnlink() &&
            ((this.disks==null && other.getDisks()==null) || 
             (this.disks!=null &&
              java.util.Arrays.equals(this.disks, other.getDisks())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_this() != null) {
            _hashCode += get_this().hashCode();
        }
        _hashCode += (isUnlink() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDisks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisks(), i);
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
        new org.apache.axis.description.TypeDesc(PromoteDisksRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PromoteDisksRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "unlink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualDisk"));
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
