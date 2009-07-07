/**
 * PowerOnFtSecondaryFailed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class PowerOnFtSecondaryFailed  extends com.vmware.vim25.VmFaultToleranceIssue  implements java.io.Serializable {
    private com.vmware.vim25.ManagedObjectReference vm;

    private java.lang.String vmName;

    private com.vmware.vim25.FtIssuesOnHostHostSelectionType hostSelectionBy;

    private com.vmware.vim25.LocalizedMethodFault[] hostErrors;

    private com.vmware.vim25.LocalizedMethodFault rootCause;

    public PowerOnFtSecondaryFailed() {
    }

    public PowerOnFtSecondaryFailed(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.LocalizedMethodFault faultCause,
           com.vmware.vim25.LocalizableMessage[] faultMessage,
           com.vmware.vim25.ManagedObjectReference vm,
           java.lang.String vmName,
           com.vmware.vim25.FtIssuesOnHostHostSelectionType hostSelectionBy,
           com.vmware.vim25.LocalizedMethodFault[] hostErrors,
           com.vmware.vim25.LocalizedMethodFault rootCause) {
        super(
            dynamicType,
            dynamicProperty,
            faultCause,
            faultMessage);
        this.vm = vm;
        this.vmName = vmName;
        this.hostSelectionBy = hostSelectionBy;
        this.hostErrors = hostErrors;
        this.rootCause = rootCause;
    }


    /**
     * Gets the vm value for this PowerOnFtSecondaryFailed.
     * 
     * @return vm
     */
    public com.vmware.vim25.ManagedObjectReference getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this PowerOnFtSecondaryFailed.
     * 
     * @param vm
     */
    public void setVm(com.vmware.vim25.ManagedObjectReference vm) {
        this.vm = vm;
    }


    /**
     * Gets the vmName value for this PowerOnFtSecondaryFailed.
     * 
     * @return vmName
     */
    public java.lang.String getVmName() {
        return vmName;
    }


    /**
     * Sets the vmName value for this PowerOnFtSecondaryFailed.
     * 
     * @param vmName
     */
    public void setVmName(java.lang.String vmName) {
        this.vmName = vmName;
    }


    /**
     * Gets the hostSelectionBy value for this PowerOnFtSecondaryFailed.
     * 
     * @return hostSelectionBy
     */
    public com.vmware.vim25.FtIssuesOnHostHostSelectionType getHostSelectionBy() {
        return hostSelectionBy;
    }


    /**
     * Sets the hostSelectionBy value for this PowerOnFtSecondaryFailed.
     * 
     * @param hostSelectionBy
     */
    public void setHostSelectionBy(com.vmware.vim25.FtIssuesOnHostHostSelectionType hostSelectionBy) {
        this.hostSelectionBy = hostSelectionBy;
    }


    /**
     * Gets the hostErrors value for this PowerOnFtSecondaryFailed.
     * 
     * @return hostErrors
     */
    public com.vmware.vim25.LocalizedMethodFault[] getHostErrors() {
        return hostErrors;
    }


    /**
     * Sets the hostErrors value for this PowerOnFtSecondaryFailed.
     * 
     * @param hostErrors
     */
    public void setHostErrors(com.vmware.vim25.LocalizedMethodFault[] hostErrors) {
        this.hostErrors = hostErrors;
    }

    public com.vmware.vim25.LocalizedMethodFault getHostErrors(int i) {
        return this.hostErrors[i];
    }

    public void setHostErrors(int i, com.vmware.vim25.LocalizedMethodFault _value) {
        this.hostErrors[i] = _value;
    }


    /**
     * Gets the rootCause value for this PowerOnFtSecondaryFailed.
     * 
     * @return rootCause
     */
    public com.vmware.vim25.LocalizedMethodFault getRootCause() {
        return rootCause;
    }


    /**
     * Sets the rootCause value for this PowerOnFtSecondaryFailed.
     * 
     * @param rootCause
     */
    public void setRootCause(com.vmware.vim25.LocalizedMethodFault rootCause) {
        this.rootCause = rootCause;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PowerOnFtSecondaryFailed)) return false;
        PowerOnFtSecondaryFailed other = (PowerOnFtSecondaryFailed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm()))) &&
            ((this.vmName==null && other.getVmName()==null) || 
             (this.vmName!=null &&
              this.vmName.equals(other.getVmName()))) &&
            ((this.hostSelectionBy==null && other.getHostSelectionBy()==null) || 
             (this.hostSelectionBy!=null &&
              this.hostSelectionBy.equals(other.getHostSelectionBy()))) &&
            ((this.hostErrors==null && other.getHostErrors()==null) || 
             (this.hostErrors!=null &&
              java.util.Arrays.equals(this.hostErrors, other.getHostErrors()))) &&
            ((this.rootCause==null && other.getRootCause()==null) || 
             (this.rootCause!=null &&
              this.rootCause.equals(other.getRootCause())));
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
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        if (getVmName() != null) {
            _hashCode += getVmName().hashCode();
        }
        if (getHostSelectionBy() != null) {
            _hashCode += getHostSelectionBy().hashCode();
        }
        if (getHostErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRootCause() != null) {
            _hashCode += getRootCause().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PowerOnFtSecondaryFailed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "PowerOnFtSecondaryFailed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostSelectionBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostSelectionBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FtIssuesOnHostHostSelectionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootCause");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "rootCause"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
