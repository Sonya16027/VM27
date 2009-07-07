/**
 * DistributedVirtualPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DistributedVirtualPort  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private com.vmware.vim25.DVPortConfigInfo config;

    private java.lang.String dvsUuid;

    private java.lang.String portgroupKey;

    private com.vmware.vim25.ManagedObjectReference proxyHost;

    private com.vmware.vim25.DistributedVirtualSwitchPortConnectee connectee;

    private boolean conflict;

    private java.lang.String conflictPortKey;

    private com.vmware.vim25.DVPortState state;

    private java.lang.Integer connectionCookie;

    private java.util.Calendar lastStatusChange;

    public DistributedVirtualPort() {
    }

    public DistributedVirtualPort(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String key,
           com.vmware.vim25.DVPortConfigInfo config,
           java.lang.String dvsUuid,
           java.lang.String portgroupKey,
           com.vmware.vim25.ManagedObjectReference proxyHost,
           com.vmware.vim25.DistributedVirtualSwitchPortConnectee connectee,
           boolean conflict,
           java.lang.String conflictPortKey,
           com.vmware.vim25.DVPortState state,
           java.lang.Integer connectionCookie,
           java.util.Calendar lastStatusChange) {
        super(
            dynamicType,
            dynamicProperty);
        this.key = key;
        this.config = config;
        this.dvsUuid = dvsUuid;
        this.portgroupKey = portgroupKey;
        this.proxyHost = proxyHost;
        this.connectee = connectee;
        this.conflict = conflict;
        this.conflictPortKey = conflictPortKey;
        this.state = state;
        this.connectionCookie = connectionCookie;
        this.lastStatusChange = lastStatusChange;
    }


    /**
     * Gets the key value for this DistributedVirtualPort.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this DistributedVirtualPort.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the config value for this DistributedVirtualPort.
     * 
     * @return config
     */
    public com.vmware.vim25.DVPortConfigInfo getConfig() {
        return config;
    }


    /**
     * Sets the config value for this DistributedVirtualPort.
     * 
     * @param config
     */
    public void setConfig(com.vmware.vim25.DVPortConfigInfo config) {
        this.config = config;
    }


    /**
     * Gets the dvsUuid value for this DistributedVirtualPort.
     * 
     * @return dvsUuid
     */
    public java.lang.String getDvsUuid() {
        return dvsUuid;
    }


    /**
     * Sets the dvsUuid value for this DistributedVirtualPort.
     * 
     * @param dvsUuid
     */
    public void setDvsUuid(java.lang.String dvsUuid) {
        this.dvsUuid = dvsUuid;
    }


    /**
     * Gets the portgroupKey value for this DistributedVirtualPort.
     * 
     * @return portgroupKey
     */
    public java.lang.String getPortgroupKey() {
        return portgroupKey;
    }


    /**
     * Sets the portgroupKey value for this DistributedVirtualPort.
     * 
     * @param portgroupKey
     */
    public void setPortgroupKey(java.lang.String portgroupKey) {
        this.portgroupKey = portgroupKey;
    }


    /**
     * Gets the proxyHost value for this DistributedVirtualPort.
     * 
     * @return proxyHost
     */
    public com.vmware.vim25.ManagedObjectReference getProxyHost() {
        return proxyHost;
    }


    /**
     * Sets the proxyHost value for this DistributedVirtualPort.
     * 
     * @param proxyHost
     */
    public void setProxyHost(com.vmware.vim25.ManagedObjectReference proxyHost) {
        this.proxyHost = proxyHost;
    }


    /**
     * Gets the connectee value for this DistributedVirtualPort.
     * 
     * @return connectee
     */
    public com.vmware.vim25.DistributedVirtualSwitchPortConnectee getConnectee() {
        return connectee;
    }


    /**
     * Sets the connectee value for this DistributedVirtualPort.
     * 
     * @param connectee
     */
    public void setConnectee(com.vmware.vim25.DistributedVirtualSwitchPortConnectee connectee) {
        this.connectee = connectee;
    }


    /**
     * Gets the conflict value for this DistributedVirtualPort.
     * 
     * @return conflict
     */
    public boolean isConflict() {
        return conflict;
    }


    /**
     * Sets the conflict value for this DistributedVirtualPort.
     * 
     * @param conflict
     */
    public void setConflict(boolean conflict) {
        this.conflict = conflict;
    }


    /**
     * Gets the conflictPortKey value for this DistributedVirtualPort.
     * 
     * @return conflictPortKey
     */
    public java.lang.String getConflictPortKey() {
        return conflictPortKey;
    }


    /**
     * Sets the conflictPortKey value for this DistributedVirtualPort.
     * 
     * @param conflictPortKey
     */
    public void setConflictPortKey(java.lang.String conflictPortKey) {
        this.conflictPortKey = conflictPortKey;
    }


    /**
     * Gets the state value for this DistributedVirtualPort.
     * 
     * @return state
     */
    public com.vmware.vim25.DVPortState getState() {
        return state;
    }


    /**
     * Sets the state value for this DistributedVirtualPort.
     * 
     * @param state
     */
    public void setState(com.vmware.vim25.DVPortState state) {
        this.state = state;
    }


    /**
     * Gets the connectionCookie value for this DistributedVirtualPort.
     * 
     * @return connectionCookie
     */
    public java.lang.Integer getConnectionCookie() {
        return connectionCookie;
    }


    /**
     * Sets the connectionCookie value for this DistributedVirtualPort.
     * 
     * @param connectionCookie
     */
    public void setConnectionCookie(java.lang.Integer connectionCookie) {
        this.connectionCookie = connectionCookie;
    }


    /**
     * Gets the lastStatusChange value for this DistributedVirtualPort.
     * 
     * @return lastStatusChange
     */
    public java.util.Calendar getLastStatusChange() {
        return lastStatusChange;
    }


    /**
     * Sets the lastStatusChange value for this DistributedVirtualPort.
     * 
     * @param lastStatusChange
     */
    public void setLastStatusChange(java.util.Calendar lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualPort)) return false;
        DistributedVirtualPort other = (DistributedVirtualPort) obj;
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
            ((this.config==null && other.getConfig()==null) || 
             (this.config!=null &&
              this.config.equals(other.getConfig()))) &&
            ((this.dvsUuid==null && other.getDvsUuid()==null) || 
             (this.dvsUuid!=null &&
              this.dvsUuid.equals(other.getDvsUuid()))) &&
            ((this.portgroupKey==null && other.getPortgroupKey()==null) || 
             (this.portgroupKey!=null &&
              this.portgroupKey.equals(other.getPortgroupKey()))) &&
            ((this.proxyHost==null && other.getProxyHost()==null) || 
             (this.proxyHost!=null &&
              this.proxyHost.equals(other.getProxyHost()))) &&
            ((this.connectee==null && other.getConnectee()==null) || 
             (this.connectee!=null &&
              this.connectee.equals(other.getConnectee()))) &&
            this.conflict == other.isConflict() &&
            ((this.conflictPortKey==null && other.getConflictPortKey()==null) || 
             (this.conflictPortKey!=null &&
              this.conflictPortKey.equals(other.getConflictPortKey()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.connectionCookie==null && other.getConnectionCookie()==null) || 
             (this.connectionCookie!=null &&
              this.connectionCookie.equals(other.getConnectionCookie()))) &&
            ((this.lastStatusChange==null && other.getLastStatusChange()==null) || 
             (this.lastStatusChange!=null &&
              this.lastStatusChange.equals(other.getLastStatusChange())));
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
        if (getConfig() != null) {
            _hashCode += getConfig().hashCode();
        }
        if (getDvsUuid() != null) {
            _hashCode += getDvsUuid().hashCode();
        }
        if (getPortgroupKey() != null) {
            _hashCode += getPortgroupKey().hashCode();
        }
        if (getProxyHost() != null) {
            _hashCode += getProxyHost().hashCode();
        }
        if (getConnectee() != null) {
            _hashCode += getConnectee().hashCode();
        }
        _hashCode += (isConflict() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getConflictPortKey() != null) {
            _hashCode += getConflictPortKey().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getConnectionCookie() != null) {
            _hashCode += getConnectionCookie().hashCode();
        }
        if (getLastStatusChange() != null) {
            _hashCode += getLastStatusChange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DistributedVirtualPort.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualPort"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("config");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "config"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVPortConfigInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvsUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvsUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portgroupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portgroupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyHost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "proxyHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "connectee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchPortConnectee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conflict");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "conflict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conflictPortKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "conflictPortKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVPortState"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionCookie");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "connectionCookie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastStatusChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "lastStatusChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
