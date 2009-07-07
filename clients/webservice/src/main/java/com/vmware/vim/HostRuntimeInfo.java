/**
 * HostRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostRuntimeInfo  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.HostSystemConnectionState connectionState;

    private boolean inMaintenanceMode;

    private java.util.Calendar bootTime;

    public HostRuntimeInfo() {
    }

    public HostRuntimeInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           com.vmware.vim.HostSystemConnectionState connectionState,
           boolean inMaintenanceMode,
           java.util.Calendar bootTime) {
        super(
            dynamicType,
            dynamicProperty);
        this.connectionState = connectionState;
        this.inMaintenanceMode = inMaintenanceMode;
        this.bootTime = bootTime;
    }


    /**
     * Gets the connectionState value for this HostRuntimeInfo.
     * 
     * @return connectionState
     */
    public com.vmware.vim.HostSystemConnectionState getConnectionState() {
        return connectionState;
    }


    /**
     * Sets the connectionState value for this HostRuntimeInfo.
     * 
     * @param connectionState
     */
    public void setConnectionState(com.vmware.vim.HostSystemConnectionState connectionState) {
        this.connectionState = connectionState;
    }


    /**
     * Gets the inMaintenanceMode value for this HostRuntimeInfo.
     * 
     * @return inMaintenanceMode
     */
    public boolean isInMaintenanceMode() {
        return inMaintenanceMode;
    }


    /**
     * Sets the inMaintenanceMode value for this HostRuntimeInfo.
     * 
     * @param inMaintenanceMode
     */
    public void setInMaintenanceMode(boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
    }


    /**
     * Gets the bootTime value for this HostRuntimeInfo.
     * 
     * @return bootTime
     */
    public java.util.Calendar getBootTime() {
        return bootTime;
    }


    /**
     * Sets the bootTime value for this HostRuntimeInfo.
     * 
     * @param bootTime
     */
    public void setBootTime(java.util.Calendar bootTime) {
        this.bootTime = bootTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostRuntimeInfo)) return false;
        HostRuntimeInfo other = (HostRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.connectionState==null && other.getConnectionState()==null) || 
             (this.connectionState!=null &&
              this.connectionState.equals(other.getConnectionState()))) &&
            this.inMaintenanceMode == other.isInMaintenanceMode() &&
            ((this.bootTime==null && other.getBootTime()==null) || 
             (this.bootTime!=null &&
              this.bootTime.equals(other.getBootTime())));
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
        if (getConnectionState() != null) {
            _hashCode += getConnectionState().hashCode();
        }
        _hashCode += (isInMaintenanceMode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBootTime() != null) {
            _hashCode += getBootTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "connectionState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostSystemConnectionState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inMaintenanceMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "inMaintenanceMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bootTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "bootTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
