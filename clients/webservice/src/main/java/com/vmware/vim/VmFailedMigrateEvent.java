/**
 * VmFailedMigrateEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VmFailedMigrateEvent  extends com.vmware.vim.VmEvent  implements java.io.Serializable {
    private com.vmware.vim.HostEventArgument destHost;

    private com.vmware.vim.LocalizedMethodFault reason;

    public VmFailedMigrateEvent() {
    }

    public VmFailedMigrateEvent(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           int key,
           int chainId,
           java.util.Calendar createdTime,
           java.lang.String userName,
           com.vmware.vim.DatacenterEventArgument datacenter,
           com.vmware.vim.ComputeResourceEventArgument computeResource,
           com.vmware.vim.HostEventArgument host,
           com.vmware.vim.VmEventArgument vm,
           java.lang.String fullFormattedMessage,
           boolean template,
           com.vmware.vim.HostEventArgument destHost,
           com.vmware.vim.LocalizedMethodFault reason) {
        super(
            dynamicType,
            dynamicProperty,
            key,
            chainId,
            createdTime,
            userName,
            datacenter,
            computeResource,
            host,
            vm,
            fullFormattedMessage,
            template);
        this.destHost = destHost;
        this.reason = reason;
    }


    /**
     * Gets the destHost value for this VmFailedMigrateEvent.
     * 
     * @return destHost
     */
    public com.vmware.vim.HostEventArgument getDestHost() {
        return destHost;
    }


    /**
     * Sets the destHost value for this VmFailedMigrateEvent.
     * 
     * @param destHost
     */
    public void setDestHost(com.vmware.vim.HostEventArgument destHost) {
        this.destHost = destHost;
    }


    /**
     * Gets the reason value for this VmFailedMigrateEvent.
     * 
     * @return reason
     */
    public com.vmware.vim.LocalizedMethodFault getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this VmFailedMigrateEvent.
     * 
     * @param reason
     */
    public void setReason(com.vmware.vim.LocalizedMethodFault reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmFailedMigrateEvent)) return false;
        VmFailedMigrateEvent other = (VmFailedMigrateEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.destHost==null && other.getDestHost()==null) || 
             (this.destHost!=null &&
              this.destHost.equals(other.getDestHost()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getDestHost() != null) {
            _hashCode += getDestHost().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmFailedMigrateEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VmFailedMigrateEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "destHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostEventArgument"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "LocalizedMethodFault"));
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
