/**
 * ModeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ModeInfo  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.String browse;

    private java.lang.String read;

    private java.lang.String modify;

    private java.lang.String use;

    private java.lang.String admin;

    private java.lang.String full;

    public ModeInfo() {
    }

    public ModeInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String browse,
           java.lang.String read,
           java.lang.String modify,
           java.lang.String use,
           java.lang.String admin,
           java.lang.String full) {
        super(
            dynamicType,
            dynamicProperty);
        this.browse = browse;
        this.read = read;
        this.modify = modify;
        this.use = use;
        this.admin = admin;
        this.full = full;
    }


    /**
     * Gets the browse value for this ModeInfo.
     * 
     * @return browse
     */
    public java.lang.String getBrowse() {
        return browse;
    }


    /**
     * Sets the browse value for this ModeInfo.
     * 
     * @param browse
     */
    public void setBrowse(java.lang.String browse) {
        this.browse = browse;
    }


    /**
     * Gets the read value for this ModeInfo.
     * 
     * @return read
     */
    public java.lang.String getRead() {
        return read;
    }


    /**
     * Sets the read value for this ModeInfo.
     * 
     * @param read
     */
    public void setRead(java.lang.String read) {
        this.read = read;
    }


    /**
     * Gets the modify value for this ModeInfo.
     * 
     * @return modify
     */
    public java.lang.String getModify() {
        return modify;
    }


    /**
     * Sets the modify value for this ModeInfo.
     * 
     * @param modify
     */
    public void setModify(java.lang.String modify) {
        this.modify = modify;
    }


    /**
     * Gets the use value for this ModeInfo.
     * 
     * @return use
     */
    public java.lang.String getUse() {
        return use;
    }


    /**
     * Sets the use value for this ModeInfo.
     * 
     * @param use
     */
    public void setUse(java.lang.String use) {
        this.use = use;
    }


    /**
     * Gets the admin value for this ModeInfo.
     * 
     * @return admin
     */
    public java.lang.String getAdmin() {
        return admin;
    }


    /**
     * Sets the admin value for this ModeInfo.
     * 
     * @param admin
     */
    public void setAdmin(java.lang.String admin) {
        this.admin = admin;
    }


    /**
     * Gets the full value for this ModeInfo.
     * 
     * @return full
     */
    public java.lang.String getFull() {
        return full;
    }


    /**
     * Sets the full value for this ModeInfo.
     * 
     * @param full
     */
    public void setFull(java.lang.String full) {
        this.full = full;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModeInfo)) return false;
        ModeInfo other = (ModeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.browse==null && other.getBrowse()==null) || 
             (this.browse!=null &&
              this.browse.equals(other.getBrowse()))) &&
            ((this.read==null && other.getRead()==null) || 
             (this.read!=null &&
              this.read.equals(other.getRead()))) &&
            ((this.modify==null && other.getModify()==null) || 
             (this.modify!=null &&
              this.modify.equals(other.getModify()))) &&
            ((this.use==null && other.getUse()==null) || 
             (this.use!=null &&
              this.use.equals(other.getUse()))) &&
            ((this.admin==null && other.getAdmin()==null) || 
             (this.admin!=null &&
              this.admin.equals(other.getAdmin()))) &&
            ((this.full==null && other.getFull()==null) || 
             (this.full!=null &&
              this.full.equals(other.getFull())));
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
        if (getBrowse() != null) {
            _hashCode += getBrowse().hashCode();
        }
        if (getRead() != null) {
            _hashCode += getRead().hashCode();
        }
        if (getModify() != null) {
            _hashCode += getModify().hashCode();
        }
        if (getUse() != null) {
            _hashCode += getUse().hashCode();
        }
        if (getAdmin() != null) {
            _hashCode += getAdmin().hashCode();
        }
        if (getFull() != null) {
            _hashCode += getFull().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ModeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "browse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("read");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "read"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modify");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "modify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("use");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "use"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "admin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("full");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "full"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
