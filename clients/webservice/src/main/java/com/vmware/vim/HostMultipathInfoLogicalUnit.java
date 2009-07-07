/**
 * HostMultipathInfoLogicalUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostMultipathInfoLogicalUnit  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String id;

    private java.lang.String lun;

    private com.vmware.vim.HostMultipathInfoPath[] path;

    private com.vmware.vim.HostMultipathInfoLogicalUnitPolicy policy;

    public HostMultipathInfoLogicalUnit() {
    }

    public HostMultipathInfoLogicalUnit(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String key,
           java.lang.String id,
           java.lang.String lun,
           com.vmware.vim.HostMultipathInfoPath[] path,
           com.vmware.vim.HostMultipathInfoLogicalUnitPolicy policy) {
        super(
            dynamicType,
            dynamicProperty);
        this.key = key;
        this.id = id;
        this.lun = lun;
        this.path = path;
        this.policy = policy;
    }


    /**
     * Gets the key value for this HostMultipathInfoLogicalUnit.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this HostMultipathInfoLogicalUnit.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the id value for this HostMultipathInfoLogicalUnit.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this HostMultipathInfoLogicalUnit.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the lun value for this HostMultipathInfoLogicalUnit.
     * 
     * @return lun
     */
    public java.lang.String getLun() {
        return lun;
    }


    /**
     * Sets the lun value for this HostMultipathInfoLogicalUnit.
     * 
     * @param lun
     */
    public void setLun(java.lang.String lun) {
        this.lun = lun;
    }


    /**
     * Gets the path value for this HostMultipathInfoLogicalUnit.
     * 
     * @return path
     */
    public com.vmware.vim.HostMultipathInfoPath[] getPath() {
        return path;
    }


    /**
     * Sets the path value for this HostMultipathInfoLogicalUnit.
     * 
     * @param path
     */
    public void setPath(com.vmware.vim.HostMultipathInfoPath[] path) {
        this.path = path;
    }

    public com.vmware.vim.HostMultipathInfoPath getPath(int i) {
        return this.path[i];
    }

    public void setPath(int i, com.vmware.vim.HostMultipathInfoPath _value) {
        this.path[i] = _value;
    }


    /**
     * Gets the policy value for this HostMultipathInfoLogicalUnit.
     * 
     * @return policy
     */
    public com.vmware.vim.HostMultipathInfoLogicalUnitPolicy getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this HostMultipathInfoLogicalUnit.
     * 
     * @param policy
     */
    public void setPolicy(com.vmware.vim.HostMultipathInfoLogicalUnitPolicy policy) {
        this.policy = policy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostMultipathInfoLogicalUnit)) return false;
        HostMultipathInfoLogicalUnit other = (HostMultipathInfoLogicalUnit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.lun==null && other.getLun()==null) || 
             (this.lun!=null &&
              this.lun.equals(other.getLun()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              java.util.Arrays.equals(this.path, other.getPath()))) &&
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
        int _hashCode = super.hashCode();
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLun() != null) {
            _hashCode += getLun().hashCode();
        }
        if (getPath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPath(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostMultipathInfoLogicalUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostMultipathInfoLogicalUnit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lun");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "lun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "path"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostMultipathInfoPath"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
