/**
 * VmRestartedOnAlternateHostEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VmRestartedOnAlternateHostEvent  extends com.vmware.vim.VmPoweredOnEvent  implements java.io.Serializable {
    private com.vmware.vim.HostEventArgument sourceHost;

    public VmRestartedOnAlternateHostEvent() {
    }

    public VmRestartedOnAlternateHostEvent(
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
           com.vmware.vim.HostEventArgument sourceHost) {
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
        this.sourceHost = sourceHost;
    }


    /**
     * Gets the sourceHost value for this VmRestartedOnAlternateHostEvent.
     * 
     * @return sourceHost
     */
    public com.vmware.vim.HostEventArgument getSourceHost() {
        return sourceHost;
    }


    /**
     * Sets the sourceHost value for this VmRestartedOnAlternateHostEvent.
     * 
     * @param sourceHost
     */
    public void setSourceHost(com.vmware.vim.HostEventArgument sourceHost) {
        this.sourceHost = sourceHost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmRestartedOnAlternateHostEvent)) return false;
        VmRestartedOnAlternateHostEvent other = (VmRestartedOnAlternateHostEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sourceHost==null && other.getSourceHost()==null) || 
             (this.sourceHost!=null &&
              this.sourceHost.equals(other.getSourceHost())));
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
        if (getSourceHost() != null) {
            _hashCode += getSourceHost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmRestartedOnAlternateHostEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VmRestartedOnAlternateHostEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "sourceHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostEventArgument"));
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
