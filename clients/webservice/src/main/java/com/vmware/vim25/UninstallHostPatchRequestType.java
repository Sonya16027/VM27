/**
 * UninstallHostPatchRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class UninstallHostPatchRequestType  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference _this;

    private java.lang.String[] bulletinIds;

    private com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec spec;

    public UninstallHostPatchRequestType() {
    }

    public UninstallHostPatchRequestType(
           com.vmware.vim25.ManagedObjectReference _this,
           java.lang.String[] bulletinIds,
           com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec spec) {
           this._this = _this;
           this.bulletinIds = bulletinIds;
           this.spec = spec;
    }


    /**
     * Gets the _this value for this UninstallHostPatchRequestType.
     * 
     * @return _this
     */
    public com.vmware.vim25.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this UninstallHostPatchRequestType.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the bulletinIds value for this UninstallHostPatchRequestType.
     * 
     * @return bulletinIds
     */
    public java.lang.String[] getBulletinIds() {
        return bulletinIds;
    }


    /**
     * Sets the bulletinIds value for this UninstallHostPatchRequestType.
     * 
     * @param bulletinIds
     */
    public void setBulletinIds(java.lang.String[] bulletinIds) {
        this.bulletinIds = bulletinIds;
    }

    public java.lang.String getBulletinIds(int i) {
        return this.bulletinIds[i];
    }

    public void setBulletinIds(int i, java.lang.String _value) {
        this.bulletinIds[i] = _value;
    }


    /**
     * Gets the spec value for this UninstallHostPatchRequestType.
     * 
     * @return spec
     */
    public com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this UninstallHostPatchRequestType.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec spec) {
        this.spec = spec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UninstallHostPatchRequestType)) return false;
        UninstallHostPatchRequestType other = (UninstallHostPatchRequestType) obj;
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
            ((this.bulletinIds==null && other.getBulletinIds()==null) || 
             (this.bulletinIds!=null &&
              java.util.Arrays.equals(this.bulletinIds, other.getBulletinIds()))) &&
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec())));
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
        if (getBulletinIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBulletinIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBulletinIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UninstallHostPatchRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "UninstallHostPatchRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulletinIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "bulletinIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostPatchManagerPatchManagerOperationSpec"));
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
