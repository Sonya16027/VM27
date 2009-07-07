/**
 * SetMultipathLunPolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class SetMultipathLunPolicy  implements java.io.Serializable {
    private com.vmware.vim.ManagedObjectReference _this;

    private java.lang.String lunId;

    private com.vmware.vim.HostMultipathInfoLogicalUnitPolicy policy;

    public SetMultipathLunPolicy() {
    }

    public SetMultipathLunPolicy(
           com.vmware.vim.ManagedObjectReference _this,
           java.lang.String lunId,
           com.vmware.vim.HostMultipathInfoLogicalUnitPolicy policy) {
           this._this = _this;
           this.lunId = lunId;
           this.policy = policy;
    }


    /**
     * Gets the _this value for this SetMultipathLunPolicy.
     * 
     * @return _this
     */
    public com.vmware.vim.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this SetMultipathLunPolicy.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the lunId value for this SetMultipathLunPolicy.
     * 
     * @return lunId
     */
    public java.lang.String getLunId() {
        return lunId;
    }


    /**
     * Sets the lunId value for this SetMultipathLunPolicy.
     * 
     * @param lunId
     */
    public void setLunId(java.lang.String lunId) {
        this.lunId = lunId;
    }


    /**
     * Gets the policy value for this SetMultipathLunPolicy.
     * 
     * @return policy
     */
    public com.vmware.vim.HostMultipathInfoLogicalUnitPolicy getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this SetMultipathLunPolicy.
     * 
     * @param policy
     */
    public void setPolicy(com.vmware.vim.HostMultipathInfoLogicalUnitPolicy policy) {
        this.policy = policy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetMultipathLunPolicy)) return false;
        SetMultipathLunPolicy other = (SetMultipathLunPolicy) obj;
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
            ((this.lunId==null && other.getLunId()==null) || 
             (this.lunId!=null &&
              this.lunId.equals(other.getLunId()))) &&
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy())));
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
        if (getLunId() != null) {
            _hashCode += getLunId().hashCode();
        }
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetMultipathLunPolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", ">SetMultipathLunPolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lunId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "lunId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostMultipathInfoLogicalUnitPolicy"));
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
