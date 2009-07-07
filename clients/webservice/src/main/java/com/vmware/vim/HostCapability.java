/**
 * HostCapability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostCapability  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private boolean recursiveResourcePoolsSupported;

    private boolean rebootSupported;

    private boolean shutdownSupported;

    private boolean vmotionSupported;

    private java.lang.Integer maxSupportedVMs;

    private java.lang.Integer maxRunningVMs;

    private java.lang.Integer maxSupportedVcpus;

    private boolean datastorePrincipalSupported;

    private boolean sanSupported;

    private boolean nfsSupported;

    private boolean iscsiSupported;

    private boolean vlanTaggingSupported;

    private boolean nicTeamingSupported;

    private boolean highGuestMemSupported;

    private boolean maintenanceModeSupported;

    private boolean suspendedRelocateSupported;

    public HostCapability() {
    }

    public HostCapability(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           boolean recursiveResourcePoolsSupported,
           boolean rebootSupported,
           boolean shutdownSupported,
           boolean vmotionSupported,
           java.lang.Integer maxSupportedVMs,
           java.lang.Integer maxRunningVMs,
           java.lang.Integer maxSupportedVcpus,
           boolean datastorePrincipalSupported,
           boolean sanSupported,
           boolean nfsSupported,
           boolean iscsiSupported,
           boolean vlanTaggingSupported,
           boolean nicTeamingSupported,
           boolean highGuestMemSupported,
           boolean maintenanceModeSupported,
           boolean suspendedRelocateSupported) {
        super(
            dynamicType,
            dynamicProperty);
        this.recursiveResourcePoolsSupported = recursiveResourcePoolsSupported;
        this.rebootSupported = rebootSupported;
        this.shutdownSupported = shutdownSupported;
        this.vmotionSupported = vmotionSupported;
        this.maxSupportedVMs = maxSupportedVMs;
        this.maxRunningVMs = maxRunningVMs;
        this.maxSupportedVcpus = maxSupportedVcpus;
        this.datastorePrincipalSupported = datastorePrincipalSupported;
        this.sanSupported = sanSupported;
        this.nfsSupported = nfsSupported;
        this.iscsiSupported = iscsiSupported;
        this.vlanTaggingSupported = vlanTaggingSupported;
        this.nicTeamingSupported = nicTeamingSupported;
        this.highGuestMemSupported = highGuestMemSupported;
        this.maintenanceModeSupported = maintenanceModeSupported;
        this.suspendedRelocateSupported = suspendedRelocateSupported;
    }


    /**
     * Gets the recursiveResourcePoolsSupported value for this HostCapability.
     * 
     * @return recursiveResourcePoolsSupported
     */
    public boolean isRecursiveResourcePoolsSupported() {
        return recursiveResourcePoolsSupported;
    }


    /**
     * Sets the recursiveResourcePoolsSupported value for this HostCapability.
     * 
     * @param recursiveResourcePoolsSupported
     */
    public void setRecursiveResourcePoolsSupported(boolean recursiveResourcePoolsSupported) {
        this.recursiveResourcePoolsSupported = recursiveResourcePoolsSupported;
    }


    /**
     * Gets the rebootSupported value for this HostCapability.
     * 
     * @return rebootSupported
     */
    public boolean isRebootSupported() {
        return rebootSupported;
    }


    /**
     * Sets the rebootSupported value for this HostCapability.
     * 
     * @param rebootSupported
     */
    public void setRebootSupported(boolean rebootSupported) {
        this.rebootSupported = rebootSupported;
    }


    /**
     * Gets the shutdownSupported value for this HostCapability.
     * 
     * @return shutdownSupported
     */
    public boolean isShutdownSupported() {
        return shutdownSupported;
    }


    /**
     * Sets the shutdownSupported value for this HostCapability.
     * 
     * @param shutdownSupported
     */
    public void setShutdownSupported(boolean shutdownSupported) {
        this.shutdownSupported = shutdownSupported;
    }


    /**
     * Gets the vmotionSupported value for this HostCapability.
     * 
     * @return vmotionSupported
     */
    public boolean isVmotionSupported() {
        return vmotionSupported;
    }


    /**
     * Sets the vmotionSupported value for this HostCapability.
     * 
     * @param vmotionSupported
     */
    public void setVmotionSupported(boolean vmotionSupported) {
        this.vmotionSupported = vmotionSupported;
    }


    /**
     * Gets the maxSupportedVMs value for this HostCapability.
     * 
     * @return maxSupportedVMs
     */
    public java.lang.Integer getMaxSupportedVMs() {
        return maxSupportedVMs;
    }


    /**
     * Sets the maxSupportedVMs value for this HostCapability.
     * 
     * @param maxSupportedVMs
     */
    public void setMaxSupportedVMs(java.lang.Integer maxSupportedVMs) {
        this.maxSupportedVMs = maxSupportedVMs;
    }


    /**
     * Gets the maxRunningVMs value for this HostCapability.
     * 
     * @return maxRunningVMs
     */
    public java.lang.Integer getMaxRunningVMs() {
        return maxRunningVMs;
    }


    /**
     * Sets the maxRunningVMs value for this HostCapability.
     * 
     * @param maxRunningVMs
     */
    public void setMaxRunningVMs(java.lang.Integer maxRunningVMs) {
        this.maxRunningVMs = maxRunningVMs;
    }


    /**
     * Gets the maxSupportedVcpus value for this HostCapability.
     * 
     * @return maxSupportedVcpus
     */
    public java.lang.Integer getMaxSupportedVcpus() {
        return maxSupportedVcpus;
    }


    /**
     * Sets the maxSupportedVcpus value for this HostCapability.
     * 
     * @param maxSupportedVcpus
     */
    public void setMaxSupportedVcpus(java.lang.Integer maxSupportedVcpus) {
        this.maxSupportedVcpus = maxSupportedVcpus;
    }


    /**
     * Gets the datastorePrincipalSupported value for this HostCapability.
     * 
     * @return datastorePrincipalSupported
     */
    public boolean isDatastorePrincipalSupported() {
        return datastorePrincipalSupported;
    }


    /**
     * Sets the datastorePrincipalSupported value for this HostCapability.
     * 
     * @param datastorePrincipalSupported
     */
    public void setDatastorePrincipalSupported(boolean datastorePrincipalSupported) {
        this.datastorePrincipalSupported = datastorePrincipalSupported;
    }


    /**
     * Gets the sanSupported value for this HostCapability.
     * 
     * @return sanSupported
     */
    public boolean isSanSupported() {
        return sanSupported;
    }


    /**
     * Sets the sanSupported value for this HostCapability.
     * 
     * @param sanSupported
     */
    public void setSanSupported(boolean sanSupported) {
        this.sanSupported = sanSupported;
    }


    /**
     * Gets the nfsSupported value for this HostCapability.
     * 
     * @return nfsSupported
     */
    public boolean isNfsSupported() {
        return nfsSupported;
    }


    /**
     * Sets the nfsSupported value for this HostCapability.
     * 
     * @param nfsSupported
     */
    public void setNfsSupported(boolean nfsSupported) {
        this.nfsSupported = nfsSupported;
    }


    /**
     * Gets the iscsiSupported value for this HostCapability.
     * 
     * @return iscsiSupported
     */
    public boolean isIscsiSupported() {
        return iscsiSupported;
    }


    /**
     * Sets the iscsiSupported value for this HostCapability.
     * 
     * @param iscsiSupported
     */
    public void setIscsiSupported(boolean iscsiSupported) {
        this.iscsiSupported = iscsiSupported;
    }


    /**
     * Gets the vlanTaggingSupported value for this HostCapability.
     * 
     * @return vlanTaggingSupported
     */
    public boolean isVlanTaggingSupported() {
        return vlanTaggingSupported;
    }


    /**
     * Sets the vlanTaggingSupported value for this HostCapability.
     * 
     * @param vlanTaggingSupported
     */
    public void setVlanTaggingSupported(boolean vlanTaggingSupported) {
        this.vlanTaggingSupported = vlanTaggingSupported;
    }


    /**
     * Gets the nicTeamingSupported value for this HostCapability.
     * 
     * @return nicTeamingSupported
     */
    public boolean isNicTeamingSupported() {
        return nicTeamingSupported;
    }


    /**
     * Sets the nicTeamingSupported value for this HostCapability.
     * 
     * @param nicTeamingSupported
     */
    public void setNicTeamingSupported(boolean nicTeamingSupported) {
        this.nicTeamingSupported = nicTeamingSupported;
    }


    /**
     * Gets the highGuestMemSupported value for this HostCapability.
     * 
     * @return highGuestMemSupported
     */
    public boolean isHighGuestMemSupported() {
        return highGuestMemSupported;
    }


    /**
     * Sets the highGuestMemSupported value for this HostCapability.
     * 
     * @param highGuestMemSupported
     */
    public void setHighGuestMemSupported(boolean highGuestMemSupported) {
        this.highGuestMemSupported = highGuestMemSupported;
    }


    /**
     * Gets the maintenanceModeSupported value for this HostCapability.
     * 
     * @return maintenanceModeSupported
     */
    public boolean isMaintenanceModeSupported() {
        return maintenanceModeSupported;
    }


    /**
     * Sets the maintenanceModeSupported value for this HostCapability.
     * 
     * @param maintenanceModeSupported
     */
    public void setMaintenanceModeSupported(boolean maintenanceModeSupported) {
        this.maintenanceModeSupported = maintenanceModeSupported;
    }


    /**
     * Gets the suspendedRelocateSupported value for this HostCapability.
     * 
     * @return suspendedRelocateSupported
     */
    public boolean isSuspendedRelocateSupported() {
        return suspendedRelocateSupported;
    }


    /**
     * Sets the suspendedRelocateSupported value for this HostCapability.
     * 
     * @param suspendedRelocateSupported
     */
    public void setSuspendedRelocateSupported(boolean suspendedRelocateSupported) {
        this.suspendedRelocateSupported = suspendedRelocateSupported;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostCapability)) return false;
        HostCapability other = (HostCapability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.recursiveResourcePoolsSupported == other.isRecursiveResourcePoolsSupported() &&
            this.rebootSupported == other.isRebootSupported() &&
            this.shutdownSupported == other.isShutdownSupported() &&
            this.vmotionSupported == other.isVmotionSupported() &&
            ((this.maxSupportedVMs==null && other.getMaxSupportedVMs()==null) || 
             (this.maxSupportedVMs!=null &&
              this.maxSupportedVMs.equals(other.getMaxSupportedVMs()))) &&
            ((this.maxRunningVMs==null && other.getMaxRunningVMs()==null) || 
             (this.maxRunningVMs!=null &&
              this.maxRunningVMs.equals(other.getMaxRunningVMs()))) &&
            ((this.maxSupportedVcpus==null && other.getMaxSupportedVcpus()==null) || 
             (this.maxSupportedVcpus!=null &&
              this.maxSupportedVcpus.equals(other.getMaxSupportedVcpus()))) &&
            this.datastorePrincipalSupported == other.isDatastorePrincipalSupported() &&
            this.sanSupported == other.isSanSupported() &&
            this.nfsSupported == other.isNfsSupported() &&
            this.iscsiSupported == other.isIscsiSupported() &&
            this.vlanTaggingSupported == other.isVlanTaggingSupported() &&
            this.nicTeamingSupported == other.isNicTeamingSupported() &&
            this.highGuestMemSupported == other.isHighGuestMemSupported() &&
            this.maintenanceModeSupported == other.isMaintenanceModeSupported() &&
            this.suspendedRelocateSupported == other.isSuspendedRelocateSupported();
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
        _hashCode += (isRecursiveResourcePoolsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRebootSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isShutdownSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVmotionSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMaxSupportedVMs() != null) {
            _hashCode += getMaxSupportedVMs().hashCode();
        }
        if (getMaxRunningVMs() != null) {
            _hashCode += getMaxRunningVMs().hashCode();
        }
        if (getMaxSupportedVcpus() != null) {
            _hashCode += getMaxSupportedVcpus().hashCode();
        }
        _hashCode += (isDatastorePrincipalSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSanSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNfsSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIscsiSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVlanTaggingSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNicTeamingSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHighGuestMemSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMaintenanceModeSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSuspendedRelocateSupported() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostCapability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostCapability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recursiveResourcePoolsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "recursiveResourcePoolsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rebootSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "rebootSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shutdownSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "shutdownSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmotionSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "vmotionSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSupportedVMs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "maxSupportedVMs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRunningVMs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "maxRunningVMs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSupportedVcpus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "maxSupportedVcpus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastorePrincipalSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "datastorePrincipalSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sanSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "sanSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfsSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "nfsSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iscsiSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "iscsiSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanTaggingSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "vlanTaggingSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicTeamingSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "nicTeamingSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highGuestMemSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "highGuestMemSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceModeSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "maintenanceModeSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendedRelocateSupported");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "suspendedRelocateSupported"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
