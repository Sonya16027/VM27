/**
 * HostMultipathInfoPath.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostMultipathInfoPath  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String name;

    private java.lang.String pathState;

    private java.lang.String adapter;

    private java.lang.String lun;

    private com.vmware.vim.HostTargetTransport transport;

    public HostMultipathInfoPath() {
    }

    public HostMultipathInfoPath(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           java.lang.String key,
           java.lang.String name,
           java.lang.String pathState,
           java.lang.String adapter,
           java.lang.String lun,
           com.vmware.vim.HostTargetTransport transport) {
        super(
            dynamicType,
            dynamicProperty);
        this.key = key;
        this.name = name;
        this.pathState = pathState;
        this.adapter = adapter;
        this.lun = lun;
        this.transport = transport;
    }


    /**
     * Gets the key value for this HostMultipathInfoPath.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this HostMultipathInfoPath.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the name value for this HostMultipathInfoPath.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HostMultipathInfoPath.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the pathState value for this HostMultipathInfoPath.
     * 
     * @return pathState
     */
    public java.lang.String getPathState() {
        return pathState;
    }


    /**
     * Sets the pathState value for this HostMultipathInfoPath.
     * 
     * @param pathState
     */
    public void setPathState(java.lang.String pathState) {
        this.pathState = pathState;
    }


    /**
     * Gets the adapter value for this HostMultipathInfoPath.
     * 
     * @return adapter
     */
    public java.lang.String getAdapter() {
        return adapter;
    }


    /**
     * Sets the adapter value for this HostMultipathInfoPath.
     * 
     * @param adapter
     */
    public void setAdapter(java.lang.String adapter) {
        this.adapter = adapter;
    }


    /**
     * Gets the lun value for this HostMultipathInfoPath.
     * 
     * @return lun
     */
    public java.lang.String getLun() {
        return lun;
    }


    /**
     * Sets the lun value for this HostMultipathInfoPath.
     * 
     * @param lun
     */
    public void setLun(java.lang.String lun) {
        this.lun = lun;
    }


    /**
     * Gets the transport value for this HostMultipathInfoPath.
     * 
     * @return transport
     */
    public com.vmware.vim.HostTargetTransport getTransport() {
        return transport;
    }


    /**
     * Sets the transport value for this HostMultipathInfoPath.
     * 
     * @param transport
     */
    public void setTransport(com.vmware.vim.HostTargetTransport transport) {
        this.transport = transport;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostMultipathInfoPath)) return false;
        HostMultipathInfoPath other = (HostMultipathInfoPath) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.pathState==null && other.getPathState()==null) || 
             (this.pathState!=null &&
              this.pathState.equals(other.getPathState()))) &&
            ((this.adapter==null && other.getAdapter()==null) || 
             (this.adapter!=null &&
              this.adapter.equals(other.getAdapter()))) &&
            ((this.lun==null && other.getLun()==null) || 
             (this.lun!=null &&
              this.lun.equals(other.getLun()))) &&
            ((this.transport==null && other.getTransport()==null) || 
             (this.transport!=null &&
              this.transport.equals(other.getTransport())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPathState() != null) {
            _hashCode += getPathState().hashCode();
        }
        if (getAdapter() != null) {
            _hashCode += getAdapter().hashCode();
        }
        if (getLun() != null) {
            _hashCode += getLun().hashCode();
        }
        if (getTransport() != null) {
            _hashCode += getTransport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostMultipathInfoPath.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostMultipathInfoPath"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "pathState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adapter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "adapter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lun");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "lun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "transport"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostTargetTransport"));
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
