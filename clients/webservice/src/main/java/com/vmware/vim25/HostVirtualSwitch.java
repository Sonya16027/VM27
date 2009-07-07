/**
 * HostVirtualSwitch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostVirtualSwitch  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String key;

    private int numPorts;

    private int numPortsAvailable;

    private java.lang.Integer mtu;

    private java.lang.String[] portgroup;

    private java.lang.String[] pnic;

    private com.vmware.vim25.HostVirtualSwitchSpec spec;

    public HostVirtualSwitch() {
    }

    public HostVirtualSwitch(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String name,
           java.lang.String key,
           int numPorts,
           int numPortsAvailable,
           java.lang.Integer mtu,
           java.lang.String[] portgroup,
           java.lang.String[] pnic,
           com.vmware.vim25.HostVirtualSwitchSpec spec) {
        super(
            dynamicType,
            dynamicProperty);
        this.name = name;
        this.key = key;
        this.numPorts = numPorts;
        this.numPortsAvailable = numPortsAvailable;
        this.mtu = mtu;
        this.portgroup = portgroup;
        this.pnic = pnic;
        this.spec = spec;
    }


    /**
     * Gets the name value for this HostVirtualSwitch.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HostVirtualSwitch.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the key value for this HostVirtualSwitch.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this HostVirtualSwitch.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the numPorts value for this HostVirtualSwitch.
     * 
     * @return numPorts
     */
    public int getNumPorts() {
        return numPorts;
    }


    /**
     * Sets the numPorts value for this HostVirtualSwitch.
     * 
     * @param numPorts
     */
    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }


    /**
     * Gets the numPortsAvailable value for this HostVirtualSwitch.
     * 
     * @return numPortsAvailable
     */
    public int getNumPortsAvailable() {
        return numPortsAvailable;
    }


    /**
     * Sets the numPortsAvailable value for this HostVirtualSwitch.
     * 
     * @param numPortsAvailable
     */
    public void setNumPortsAvailable(int numPortsAvailable) {
        this.numPortsAvailable = numPortsAvailable;
    }


    /**
     * Gets the mtu value for this HostVirtualSwitch.
     * 
     * @return mtu
     */
    public java.lang.Integer getMtu() {
        return mtu;
    }


    /**
     * Sets the mtu value for this HostVirtualSwitch.
     * 
     * @param mtu
     */
    public void setMtu(java.lang.Integer mtu) {
        this.mtu = mtu;
    }


    /**
     * Gets the portgroup value for this HostVirtualSwitch.
     * 
     * @return portgroup
     */
    public java.lang.String[] getPortgroup() {
        return portgroup;
    }


    /**
     * Sets the portgroup value for this HostVirtualSwitch.
     * 
     * @param portgroup
     */
    public void setPortgroup(java.lang.String[] portgroup) {
        this.portgroup = portgroup;
    }

    public java.lang.String getPortgroup(int i) {
        return this.portgroup[i];
    }

    public void setPortgroup(int i, java.lang.String _value) {
        this.portgroup[i] = _value;
    }


    /**
     * Gets the pnic value for this HostVirtualSwitch.
     * 
     * @return pnic
     */
    public java.lang.String[] getPnic() {
        return pnic;
    }


    /**
     * Sets the pnic value for this HostVirtualSwitch.
     * 
     * @param pnic
     */
    public void setPnic(java.lang.String[] pnic) {
        this.pnic = pnic;
    }

    public java.lang.String getPnic(int i) {
        return this.pnic[i];
    }

    public void setPnic(int i, java.lang.String _value) {
        this.pnic[i] = _value;
    }


    /**
     * Gets the spec value for this HostVirtualSwitch.
     * 
     * @return spec
     */
    public com.vmware.vim25.HostVirtualSwitchSpec getSpec() {
        return spec;
    }


    /**
     * Sets the spec value for this HostVirtualSwitch.
     * 
     * @param spec
     */
    public void setSpec(com.vmware.vim25.HostVirtualSwitchSpec spec) {
        this.spec = spec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostVirtualSwitch)) return false;
        HostVirtualSwitch other = (HostVirtualSwitch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            this.numPorts == other.getNumPorts() &&
            this.numPortsAvailable == other.getNumPortsAvailable() &&
            ((this.mtu==null && other.getMtu()==null) || 
             (this.mtu!=null &&
              this.mtu.equals(other.getMtu()))) &&
            ((this.portgroup==null && other.getPortgroup()==null) || 
             (this.portgroup!=null &&
              java.util.Arrays.equals(this.portgroup, other.getPortgroup()))) &&
            ((this.pnic==null && other.getPnic()==null) || 
             (this.pnic!=null &&
              java.util.Arrays.equals(this.pnic, other.getPnic()))) &&
            ((this.spec==null && other.getSpec()==null) || 
             (this.spec!=null &&
              this.spec.equals(other.getSpec())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        _hashCode += getNumPorts();
        _hashCode += getNumPortsAvailable();
        if (getMtu() != null) {
            _hashCode += getMtu().hashCode();
        }
        if (getPortgroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPortgroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPortgroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPnic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPnic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPnic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpec() != null) {
            _hashCode += getSpec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostVirtualSwitch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPorts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numPorts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPortsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numPortsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtu");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "mtu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "portgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "spec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostVirtualSwitchSpec"));
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
