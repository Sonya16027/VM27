/**
 * FormatVmfs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class FormatVmfs  implements java.io.Serializable {
    private com.vmware.vim.ManagedObjectReference _this;

    private com.vmware.vim.HostVmfsSpec createSpec;

    public FormatVmfs() {
    }

    public FormatVmfs(
           com.vmware.vim.ManagedObjectReference _this,
           com.vmware.vim.HostVmfsSpec createSpec) {
           this._this = _this;
           this.createSpec = createSpec;
    }


    /**
     * Gets the _this value for this FormatVmfs.
     * 
     * @return _this
     */
    public com.vmware.vim.ManagedObjectReference get_this() {
        return _this;
    }


    /**
     * Sets the _this value for this FormatVmfs.
     * 
     * @param _this
     */
    public void set_this(com.vmware.vim.ManagedObjectReference _this) {
        this._this = _this;
    }


    /**
     * Gets the createSpec value for this FormatVmfs.
     * 
     * @return createSpec
     */
    public com.vmware.vim.HostVmfsSpec getCreateSpec() {
        return createSpec;
    }


    /**
     * Sets the createSpec value for this FormatVmfs.
     * 
     * @param createSpec
     */
    public void setCreateSpec(com.vmware.vim.HostVmfsSpec createSpec) {
        this.createSpec = createSpec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FormatVmfs)) return false;
        FormatVmfs other = (FormatVmfs) obj;
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
            ((this.createSpec==null && other.getCreateSpec()==null) || 
             (this.createSpec!=null &&
              this.createSpec.equals(other.getCreateSpec())));
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
        if (getCreateSpec() != null) {
            _hashCode += getCreateSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FormatVmfs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", ">FormatVmfs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_this");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "createSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostVmfsSpec"));
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
