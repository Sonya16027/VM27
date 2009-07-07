/**
 * ClusterDasConfigInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ClusterDasConfigInfo  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean enabled;

    private java.lang.Integer failoverLevel;

    private java.lang.Boolean admissionControlEnabled;

    private com.vmware.vim.OptionValue[] option;

    public ClusterDasConfigInfo() {
    }

    public ClusterDasConfigInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.Boolean enabled,
           java.lang.Integer failoverLevel,
           java.lang.Boolean admissionControlEnabled,
           com.vmware.vim.OptionValue[] option) {
        super(
            dynamicType,
            dynamicProperty);
        this.enabled = enabled;
        this.failoverLevel = failoverLevel;
        this.admissionControlEnabled = admissionControlEnabled;
        this.option = option;
    }


    /**
     * Gets the enabled value for this ClusterDasConfigInfo.
     * 
     * @return enabled
     */
    public java.lang.Boolean getEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this ClusterDasConfigInfo.
     * 
     * @param enabled
     */
    public void setEnabled(java.lang.Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the failoverLevel value for this ClusterDasConfigInfo.
     * 
     * @return failoverLevel
     */
    public java.lang.Integer getFailoverLevel() {
        return failoverLevel;
    }


    /**
     * Sets the failoverLevel value for this ClusterDasConfigInfo.
     * 
     * @param failoverLevel
     */
    public void setFailoverLevel(java.lang.Integer failoverLevel) {
        this.failoverLevel = failoverLevel;
    }


    /**
     * Gets the admissionControlEnabled value for this ClusterDasConfigInfo.
     * 
     * @return admissionControlEnabled
     */
    public java.lang.Boolean getAdmissionControlEnabled() {
        return admissionControlEnabled;
    }


    /**
     * Sets the admissionControlEnabled value for this ClusterDasConfigInfo.
     * 
     * @param admissionControlEnabled
     */
    public void setAdmissionControlEnabled(java.lang.Boolean admissionControlEnabled) {
        this.admissionControlEnabled = admissionControlEnabled;
    }


    /**
     * Gets the option value for this ClusterDasConfigInfo.
     * 
     * @return option
     */
    public com.vmware.vim.OptionValue[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this ClusterDasConfigInfo.
     * 
     * @param option
     */
    public void setOption(com.vmware.vim.OptionValue[] option) {
        this.option = option;
    }

    public com.vmware.vim.OptionValue getOption(int i) {
        return this.option[i];
    }

    public void setOption(int i, com.vmware.vim.OptionValue _value) {
        this.option[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDasConfigInfo)) return false;
        ClusterDasConfigInfo other = (ClusterDasConfigInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enabled==null && other.getEnabled()==null) || 
             (this.enabled!=null &&
              this.enabled.equals(other.getEnabled()))) &&
            ((this.failoverLevel==null && other.getFailoverLevel()==null) || 
             (this.failoverLevel!=null &&
              this.failoverLevel.equals(other.getFailoverLevel()))) &&
            ((this.admissionControlEnabled==null && other.getAdmissionControlEnabled()==null) || 
             (this.admissionControlEnabled!=null &&
              this.admissionControlEnabled.equals(other.getAdmissionControlEnabled()))) &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              java.util.Arrays.equals(this.option, other.getOption())));
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
        if (getEnabled() != null) {
            _hashCode += getEnabled().hashCode();
        }
        if (getFailoverLevel() != null) {
            _hashCode += getFailoverLevel().hashCode();
        }
        if (getAdmissionControlEnabled() != null) {
            _hashCode += getAdmissionControlEnabled().hashCode();
        }
        if (getOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOption(), i);
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
        new org.apache.axis.description.TypeDesc(ClusterDasConfigInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ClusterDasConfigInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failoverLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "failoverLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admissionControlEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "admissionControlEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "option"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "OptionValue"));
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
