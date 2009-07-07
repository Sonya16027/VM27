/**
 * DistributedVirtualSwitchPortCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DistributedVirtualSwitchPortCriteria  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.Boolean connected;

    private java.lang.Boolean active;

    private java.lang.Boolean uplinkPort;

    private com.vmware.vim25.ManagedObjectReference scope;

    private java.lang.String[] portgroupKey;

    private java.lang.Boolean inside;

    private java.lang.String[] portKey;

    public DistributedVirtualSwitchPortCriteria() {
    }

    public DistributedVirtualSwitchPortCriteria(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.Boolean connected,
           java.lang.Boolean active,
           java.lang.Boolean uplinkPort,
           com.vmware.vim25.ManagedObjectReference scope,
           java.lang.String[] portgroupKey,
           java.lang.Boolean inside,
           java.lang.String[] portKey) {
        super(
            dynamicType,
            dynamicProperty);
        this.connected = connected;
        this.active = active;
        this.uplinkPort = uplinkPort;
        this.scope = scope;
        this.portgroupKey = portgroupKey;
        this.inside = inside;
        this.portKey = portKey;
    }


    /**
     * Gets the connected value for this DistributedVirtualSwitchPortCriteria.
     * 
     * @return connected
     */
    public java.lang.Boolean getConnected() {
        return connected;
    }


    /**
     * Sets the connected value for this DistributedVirtualSwitchPortCriteria.
     * 
     * @param connected
     */
    public void setConnected(java.lang.Boolean connected) {
        this.connected = connected;
    }


    /**
     * Gets the active value for this DistributedVirtualSwitchPortCriteria.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this DistributedVirtualSwitchPortCriteria.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the uplinkPort value for this DistributedVirtualSwitchPortCriteria.
     * 
     * @return uplinkPort
     */
    public java.lang.Boolean getUplinkPort() {
        return uplinkPort;
    }


    /**
     * Sets the uplinkPort value for this DistributedVirtualSwitchPortCriteria.
     * 
     * @param uplinkPort
     */
    public void setUplinkPort(java.lang.Boolean uplinkPort) {
        this.uplinkPort = uplinkPort;
    }


    /**
     * Gets the scope value for this DistributedVirtualSwitchPortCriteria.
     * 
     * @return scope
     */
    public com.vmware.vim25.ManagedObjectReference getScope() {
        return scope;
    }


    /**
     * Sets the scope value for this DistributedVirtualSwitchPortCriteria.
     * 
     * @param scope
     */
    public void setScope(com.vmware.vim25.ManagedObjectReference scope) {
        this.scope = scope;
    }


    /**
     * Gets the portgroupKey value for this DistributedVirtualSwitchPortCriteria.
     * 
     * @return portgroupKey
     */
    public java.lang.String[] getPortgroupKey() {
        return portgroupKey;
    }


    /**
     * Sets the portgroupKey value for this DistributedVirtualSwitchPortCriteria.
     * 
     * @param portgroupKey
     */
    public void setPortgroupKey(java.lang.String[] portgroupKey) {
        this.portgroupKey = portgroupKey;
    }

    public java.lang.String getPortgroupKey(int i) {
        return this.portgroupKey[i];
    }

    public void setPortgroupKey(int i, java.lang.String _value) {
        this.portgroupKey[i] = _value;
    }


    /**
     * Gets the inside value for this DistributedVirtualSwitchPortCriteria.
     * 
     * @return inside
     */
    public java.lang.Boolean getInside() {
        return inside;
    }


    /**
     * Sets the inside value for this DistributedVirtualSwitchPortCriteria.
     * 
     * @param inside
     */
    public void setInside(java.lang.Boolean inside) {
        this.inside = inside;
    }


    /**
     * Gets the portKey value for this DistributedVirtualSwitchPortCriteria.
     * 
     * @return portKey
     */
    public java.lang.String[] getPortKey() {
        return portKey;
    }


    /**
     * Sets the portKey value for this DistributedVirtualSwitchPortCriteria.
     * 
     * @param portKey
     */
    public void setPortKey(java.lang.String[] portKey) {
        this.portKey = portKey;
    }

    public java.lang.String getPortKey(int i) {
        return this.portKey[i];
    }

    public void setPortKey(int i, java.lang.String _value) {
        this.portKey[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DistributedVirtualSwitchPortCriteria)) return false;
        DistributedVirtualSwitchPortCriteria other = (DistributedVirtualSwitchPortCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.connected==null && other.getConnected()==null) || 
             (this.connected!=null &&
              this.connected.equals(other.getConnected()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.uplinkPort==null && other.getUplinkPort()==null) || 
             (this.uplinkPort!=null &&
              this.uplinkPort.equals(other.getUplinkPort()))) &&
            ((this.scope==null && other.getScope()==null) || 
             (this.scope!=null &&
              this.scope.equals(other.getScope()))) &&
            ((this.portgroupKey==null && other.getPortgroupKey()==null) || 
             (this.portgroupKey!=null &&
              java.util.Arrays.equals(this.portgroupKey, other.getPortgroupKey()))) &&
            ((this.inside==null && other.getInside()==null) || 
             (this.inside!=null &&
              this.inside.equals(other.getInside()))) &&
            ((this.portKey==null && other.getPortKey()==null) || 
             (this.portKey!=null &&
              java.util.Arrays.equals(this.portKey, other.getPortKey())));
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
        if (getConnected() != null) {
            _hashCode += getConnected().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getUplinkPort() != null) {
            _hashCode += getUplinkPort().hashCode();
        }
        if (getScope() != null) {
            _hashCode += getScope().hashCode();
        }
        if (getPortgroupKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortgroupKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortgroupKey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInside() != null) {
            _hashCode += getInside().hashCode();
        }
        if (getPortKey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortKey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortKey(), i);
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
        new org.apache.axis.description.TypeDesc(DistributedVirtualSwitchPortCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchPortCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "connected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uplinkPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uplinkPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portgroupKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portgroupKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inside");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "inside"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
