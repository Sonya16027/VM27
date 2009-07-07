/**
 * PrivilegePolicyDef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PrivilegePolicyDef  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String createPrivilege;

    private java.lang.String readPrivilege;

    private java.lang.String updatePrivilege;

    private java.lang.String deletePrivilege;

    public PrivilegePolicyDef() {
    }

    public PrivilegePolicyDef(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String createPrivilege,
           java.lang.String readPrivilege,
           java.lang.String updatePrivilege,
           java.lang.String deletePrivilege) {
        super(
            dynamicType,
            dynamicProperty);
        this.createPrivilege = createPrivilege;
        this.readPrivilege = readPrivilege;
        this.updatePrivilege = updatePrivilege;
        this.deletePrivilege = deletePrivilege;
    }


    /**
     * Gets the createPrivilege value for this PrivilegePolicyDef.
     * 
     * @return createPrivilege
     */
    public java.lang.String getCreatePrivilege() {
        return createPrivilege;
    }


    /**
     * Sets the createPrivilege value for this PrivilegePolicyDef.
     * 
     * @param createPrivilege
     */
    public void setCreatePrivilege(java.lang.String createPrivilege) {
        this.createPrivilege = createPrivilege;
    }


    /**
     * Gets the readPrivilege value for this PrivilegePolicyDef.
     * 
     * @return readPrivilege
     */
    public java.lang.String getReadPrivilege() {
        return readPrivilege;
    }


    /**
     * Sets the readPrivilege value for this PrivilegePolicyDef.
     * 
     * @param readPrivilege
     */
    public void setReadPrivilege(java.lang.String readPrivilege) {
        this.readPrivilege = readPrivilege;
    }


    /**
     * Gets the updatePrivilege value for this PrivilegePolicyDef.
     * 
     * @return updatePrivilege
     */
    public java.lang.String getUpdatePrivilege() {
        return updatePrivilege;
    }


    /**
     * Sets the updatePrivilege value for this PrivilegePolicyDef.
     * 
     * @param updatePrivilege
     */
    public void setUpdatePrivilege(java.lang.String updatePrivilege) {
        this.updatePrivilege = updatePrivilege;
    }


    /**
     * Gets the deletePrivilege value for this PrivilegePolicyDef.
     * 
     * @return deletePrivilege
     */
    public java.lang.String getDeletePrivilege() {
        return deletePrivilege;
    }


    /**
     * Sets the deletePrivilege value for this PrivilegePolicyDef.
     * 
     * @param deletePrivilege
     */
    public void setDeletePrivilege(java.lang.String deletePrivilege) {
        this.deletePrivilege = deletePrivilege;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrivilegePolicyDef)) return false;
        PrivilegePolicyDef other = (PrivilegePolicyDef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createPrivilege==null && other.getCreatePrivilege()==null) || 
             (this.createPrivilege!=null &&
              this.createPrivilege.equals(other.getCreatePrivilege()))) &&
            ((this.readPrivilege==null && other.getReadPrivilege()==null) || 
             (this.readPrivilege!=null &&
              this.readPrivilege.equals(other.getReadPrivilege()))) &&
            ((this.updatePrivilege==null && other.getUpdatePrivilege()==null) || 
             (this.updatePrivilege!=null &&
              this.updatePrivilege.equals(other.getUpdatePrivilege()))) &&
            ((this.deletePrivilege==null && other.getDeletePrivilege()==null) || 
             (this.deletePrivilege!=null &&
              this.deletePrivilege.equals(other.getDeletePrivilege())));
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
        if (getCreatePrivilege() != null) {
            _hashCode += getCreatePrivilege().hashCode();
        }
        if (getReadPrivilege() != null) {
            _hashCode += getReadPrivilege().hashCode();
        }
        if (getUpdatePrivilege() != null) {
            _hashCode += getUpdatePrivilege().hashCode();
        }
        if (getDeletePrivilege() != null) {
            _hashCode += getDeletePrivilege().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrivilegePolicyDef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PrivilegePolicyDef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createPrivilege");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "createPrivilege"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readPrivilege");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "readPrivilege"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatePrivilege");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "updatePrivilege"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletePrivilege");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deletePrivilege"));
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
