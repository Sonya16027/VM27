/**
 * DVPortStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DVPortStatus  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private boolean linkUp;

    private boolean blocked;

    private com.vmware.vim25.NumericRange[] vlanIds;

    private java.lang.Boolean trunkingMode;

    private java.lang.Integer mtu;

    private java.lang.String linkPeer;

    private java.lang.String macAddress;

    public DVPortStatus() {
    }

    public DVPortStatus(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean linkUp,
           boolean blocked,
           com.vmware.vim25.NumericRange[] vlanIds,
           java.lang.Boolean trunkingMode,
           java.lang.Integer mtu,
           java.lang.String linkPeer,
           java.lang.String macAddress) {
        super(
            dynamicType,
            dynamicProperty);
        this.linkUp = linkUp;
        this.blocked = blocked;
        this.vlanIds = vlanIds;
        this.trunkingMode = trunkingMode;
        this.mtu = mtu;
        this.linkPeer = linkPeer;
        this.macAddress = macAddress;
    }


    /**
     * Gets the linkUp value for this DVPortStatus.
     * 
     * @return linkUp
     */
    public boolean isLinkUp() {
        return linkUp;
    }


    /**
     * Sets the linkUp value for this DVPortStatus.
     * 
     * @param linkUp
     */
    public void setLinkUp(boolean linkUp) {
        this.linkUp = linkUp;
    }


    /**
     * Gets the blocked value for this DVPortStatus.
     * 
     * @return blocked
     */
    public boolean isBlocked() {
        return blocked;
    }


    /**
     * Sets the blocked value for this DVPortStatus.
     * 
     * @param blocked
     */
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }


    /**
     * Gets the vlanIds value for this DVPortStatus.
     * 
     * @return vlanIds
     */
    public com.vmware.vim25.NumericRange[] getVlanIds() {
        return vlanIds;
    }


    /**
     * Sets the vlanIds value for this DVPortStatus.
     * 
     * @param vlanIds
     */
    public void setVlanIds(com.vmware.vim25.NumericRange[] vlanIds) {
        this.vlanIds = vlanIds;
    }

    public com.vmware.vim25.NumericRange getVlanIds(int i) {
        return this.vlanIds[i];
    }

    public void setVlanIds(int i, com.vmware.vim25.NumericRange _value) {
        this.vlanIds[i] = _value;
    }


    /**
     * Gets the trunkingMode value for this DVPortStatus.
     * 
     * @return trunkingMode
     */
    public java.lang.Boolean getTrunkingMode() {
        return trunkingMode;
    }


    /**
     * Sets the trunkingMode value for this DVPortStatus.
     * 
     * @param trunkingMode
     */
    public void setTrunkingMode(java.lang.Boolean trunkingMode) {
        this.trunkingMode = trunkingMode;
    }


    /**
     * Gets the mtu value for this DVPortStatus.
     * 
     * @return mtu
     */
    public java.lang.Integer getMtu() {
        return mtu;
    }


    /**
     * Sets the mtu value for this DVPortStatus.
     * 
     * @param mtu
     */
    public void setMtu(java.lang.Integer mtu) {
        this.mtu = mtu;
    }


    /**
     * Gets the linkPeer value for this DVPortStatus.
     * 
     * @return linkPeer
     */
    public java.lang.String getLinkPeer() {
        return linkPeer;
    }


    /**
     * Sets the linkPeer value for this DVPortStatus.
     * 
     * @param linkPeer
     */
    public void setLinkPeer(java.lang.String linkPeer) {
        this.linkPeer = linkPeer;
    }


    /**
     * Gets the macAddress value for this DVPortStatus.
     * 
     * @return macAddress
     */
    public java.lang.String getMacAddress() {
        return macAddress;
    }


    /**
     * Sets the macAddress value for this DVPortStatus.
     * 
     * @param macAddress
     */
    public void setMacAddress(java.lang.String macAddress) {
        this.macAddress = macAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DVPortStatus)) return false;
        DVPortStatus other = (DVPortStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.linkUp == other.isLinkUp() &&
            this.blocked == other.isBlocked() &&
            ((this.vlanIds==null && other.getVlanIds()==null) || 
             (this.vlanIds!=null &&
              java.util.Arrays.equals(this.vlanIds, other.getVlanIds()))) &&
            ((this.trunkingMode==null && other.getTrunkingMode()==null) || 
             (this.trunkingMode!=null &&
              this.trunkingMode.equals(other.getTrunkingMode()))) &&
            ((this.mtu==null && other.getMtu()==null) || 
             (this.mtu!=null &&
              this.mtu.equals(other.getMtu()))) &&
            ((this.linkPeer==null && other.getLinkPeer()==null) || 
             (this.linkPeer!=null &&
              this.linkPeer.equals(other.getLinkPeer()))) &&
            ((this.macAddress==null && other.getMacAddress()==null) || 
             (this.macAddress!=null &&
              this.macAddress.equals(other.getMacAddress())));
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
        _hashCode += (isLinkUp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBlocked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVlanIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVlanIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVlanIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrunkingMode() != null) {
            _hashCode += getTrunkingMode().hashCode();
        }
        if (getMtu() != null) {
            _hashCode += getMtu().hashCode();
        }
        if (getLinkPeer() != null) {
            _hashCode += getLinkPeer().hashCode();
        }
        if (getMacAddress() != null) {
            _hashCode += getMacAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DVPortStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DVPortStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkUp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "linkUp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blocked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "blocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlanIds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vlanIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NumericRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunkingMode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "trunkingMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("linkPeer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "linkPeer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "macAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
