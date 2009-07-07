/**
 * ProfileExecuteResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ProfileExecuteResult  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String status;

    private com.vmware.vim25.HostConfigSpec configSpec;

    private java.lang.String[] inapplicablePath;

    private com.vmware.vim25.ProfileDeferredPolicyOptionParameter[] requireInput;

    private com.vmware.vim25.ProfileExecuteError[] error;

    public ProfileExecuteResult() {
    }

    public ProfileExecuteResult(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String status,
           com.vmware.vim25.HostConfigSpec configSpec,
           java.lang.String[] inapplicablePath,
           com.vmware.vim25.ProfileDeferredPolicyOptionParameter[] requireInput,
           com.vmware.vim25.ProfileExecuteError[] error) {
        super(
            dynamicType,
            dynamicProperty);
        this.status = status;
        this.configSpec = configSpec;
        this.inapplicablePath = inapplicablePath;
        this.requireInput = requireInput;
        this.error = error;
    }


    /**
     * Gets the status value for this ProfileExecuteResult.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProfileExecuteResult.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the configSpec value for this ProfileExecuteResult.
     * 
     * @return configSpec
     */
    public com.vmware.vim25.HostConfigSpec getConfigSpec() {
        return configSpec;
    }


    /**
     * Sets the configSpec value for this ProfileExecuteResult.
     * 
     * @param configSpec
     */
    public void setConfigSpec(com.vmware.vim25.HostConfigSpec configSpec) {
        this.configSpec = configSpec;
    }


    /**
     * Gets the inapplicablePath value for this ProfileExecuteResult.
     * 
     * @return inapplicablePath
     */
    public java.lang.String[] getInapplicablePath() {
        return inapplicablePath;
    }


    /**
     * Sets the inapplicablePath value for this ProfileExecuteResult.
     * 
     * @param inapplicablePath
     */
    public void setInapplicablePath(java.lang.String[] inapplicablePath) {
        this.inapplicablePath = inapplicablePath;
    }

    public java.lang.String getInapplicablePath(int i) {
        return this.inapplicablePath[i];
    }

    public void setInapplicablePath(int i, java.lang.String _value) {
        this.inapplicablePath[i] = _value;
    }


    /**
     * Gets the requireInput value for this ProfileExecuteResult.
     * 
     * @return requireInput
     */
    public com.vmware.vim25.ProfileDeferredPolicyOptionParameter[] getRequireInput() {
        return requireInput;
    }


    /**
     * Sets the requireInput value for this ProfileExecuteResult.
     * 
     * @param requireInput
     */
    public void setRequireInput(com.vmware.vim25.ProfileDeferredPolicyOptionParameter[] requireInput) {
        this.requireInput = requireInput;
    }

    public com.vmware.vim25.ProfileDeferredPolicyOptionParameter getRequireInput(int i) {
        return this.requireInput[i];
    }

    public void setRequireInput(int i, com.vmware.vim25.ProfileDeferredPolicyOptionParameter _value) {
        this.requireInput[i] = _value;
    }


    /**
     * Gets the error value for this ProfileExecuteResult.
     * 
     * @return error
     */
    public com.vmware.vim25.ProfileExecuteError[] getError() {
        return error;
    }


    /**
     * Sets the error value for this ProfileExecuteResult.
     * 
     * @param error
     */
    public void setError(com.vmware.vim25.ProfileExecuteError[] error) {
        this.error = error;
    }

    public com.vmware.vim25.ProfileExecuteError getError(int i) {
        return this.error[i];
    }

    public void setError(int i, com.vmware.vim25.ProfileExecuteError _value) {
        this.error[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProfileExecuteResult)) return false;
        ProfileExecuteResult other = (ProfileExecuteResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.configSpec==null && other.getConfigSpec()==null) || 
             (this.configSpec!=null &&
              this.configSpec.equals(other.getConfigSpec()))) &&
            ((this.inapplicablePath==null && other.getInapplicablePath()==null) || 
             (this.inapplicablePath!=null &&
              java.util.Arrays.equals(this.inapplicablePath, other.getInapplicablePath()))) &&
            ((this.requireInput==null && other.getRequireInput()==null) || 
             (this.requireInput!=null &&
              java.util.Arrays.equals(this.requireInput, other.getRequireInput()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              java.util.Arrays.equals(this.error, other.getError())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getConfigSpec() != null) {
            _hashCode += getConfigSpec().hashCode();
        }
        if (getInapplicablePath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInapplicablePath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInapplicablePath(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequireInput() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequireInput());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequireInput(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getError(), i);
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
        new org.apache.axis.description.TypeDesc(ProfileExecuteResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileExecuteResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configSpec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "configSpec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostConfigSpec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inapplicablePath");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "inapplicablePath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireInput");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "requireInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileDeferredPolicyOptionParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ProfileExecuteError"));
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
