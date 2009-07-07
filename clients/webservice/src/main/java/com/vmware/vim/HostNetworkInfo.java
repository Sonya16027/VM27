/**
 * HostNetworkInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostNetworkInfo  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private com.vmware.vim.HostVirtualSwitch[] vswitch;

    private com.vmware.vim.HostPortGroup[] portgroup;

    private com.vmware.vim.PhysicalNic[] pnic;

    private com.vmware.vim.HostVirtualNic[] vnic;

    private com.vmware.vim.HostVirtualNic[] consoleVnic;

    private com.vmware.vim.HostDnsConfig dnsConfig;

    private com.vmware.vim.HostIpRouteConfig ipRouteConfig;

    private com.vmware.vim.HostIpRouteConfig consoleIpRouteConfig;

    public HostNetworkInfo() {
    }

    public HostNetworkInfo(
           java.lang.String dynamicType,
           com.vmware.vim.DynamicProperty[] dynamicProperty,
           com.vmware.vim.HostVirtualSwitch[] vswitch,
           com.vmware.vim.HostPortGroup[] portgroup,
           com.vmware.vim.PhysicalNic[] pnic,
           com.vmware.vim.HostVirtualNic[] vnic,
           com.vmware.vim.HostVirtualNic[] consoleVnic,
           com.vmware.vim.HostDnsConfig dnsConfig,
           com.vmware.vim.HostIpRouteConfig ipRouteConfig,
           com.vmware.vim.HostIpRouteConfig consoleIpRouteConfig) {
        super(
            dynamicType,
            dynamicProperty);
        this.vswitch = vswitch;
        this.portgroup = portgroup;
        this.pnic = pnic;
        this.vnic = vnic;
        this.consoleVnic = consoleVnic;
        this.dnsConfig = dnsConfig;
        this.ipRouteConfig = ipRouteConfig;
        this.consoleIpRouteConfig = consoleIpRouteConfig;
    }


    /**
     * Gets the vswitch value for this HostNetworkInfo.
     * 
     * @return vswitch
     */
    public com.vmware.vim.HostVirtualSwitch[] getVswitch() {
        return vswitch;
    }


    /**
     * Sets the vswitch value for this HostNetworkInfo.
     * 
     * @param vswitch
     */
    public void setVswitch(com.vmware.vim.HostVirtualSwitch[] vswitch) {
        this.vswitch = vswitch;
    }

    public com.vmware.vim.HostVirtualSwitch getVswitch(int i) {
        return this.vswitch[i];
    }

    public void setVswitch(int i, com.vmware.vim.HostVirtualSwitch _value) {
        this.vswitch[i] = _value;
    }


    /**
     * Gets the portgroup value for this HostNetworkInfo.
     * 
     * @return portgroup
     */
    public com.vmware.vim.HostPortGroup[] getPortgroup() {
        return portgroup;
    }


    /**
     * Sets the portgroup value for this HostNetworkInfo.
     * 
     * @param portgroup
     */
    public void setPortgroup(com.vmware.vim.HostPortGroup[] portgroup) {
        this.portgroup = portgroup;
    }

    public com.vmware.vim.HostPortGroup getPortgroup(int i) {
        return this.portgroup[i];
    }

    public void setPortgroup(int i, com.vmware.vim.HostPortGroup _value) {
        this.portgroup[i] = _value;
    }


    /**
     * Gets the pnic value for this HostNetworkInfo.
     * 
     * @return pnic
     */
    public com.vmware.vim.PhysicalNic[] getPnic() {
        return pnic;
    }


    /**
     * Sets the pnic value for this HostNetworkInfo.
     * 
     * @param pnic
     */
    public void setPnic(com.vmware.vim.PhysicalNic[] pnic) {
        this.pnic = pnic;
    }

    public com.vmware.vim.PhysicalNic getPnic(int i) {
        return this.pnic[i];
    }

    public void setPnic(int i, com.vmware.vim.PhysicalNic _value) {
        this.pnic[i] = _value;
    }


    /**
     * Gets the vnic value for this HostNetworkInfo.
     * 
     * @return vnic
     */
    public com.vmware.vim.HostVirtualNic[] getVnic() {
        return vnic;
    }


    /**
     * Sets the vnic value for this HostNetworkInfo.
     * 
     * @param vnic
     */
    public void setVnic(com.vmware.vim.HostVirtualNic[] vnic) {
        this.vnic = vnic;
    }

    public com.vmware.vim.HostVirtualNic getVnic(int i) {
        return this.vnic[i];
    }

    public void setVnic(int i, com.vmware.vim.HostVirtualNic _value) {
        this.vnic[i] = _value;
    }


    /**
     * Gets the consoleVnic value for this HostNetworkInfo.
     * 
     * @return consoleVnic
     */
    public com.vmware.vim.HostVirtualNic[] getConsoleVnic() {
        return consoleVnic;
    }


    /**
     * Sets the consoleVnic value for this HostNetworkInfo.
     * 
     * @param consoleVnic
     */
    public void setConsoleVnic(com.vmware.vim.HostVirtualNic[] consoleVnic) {
        this.consoleVnic = consoleVnic;
    }

    public com.vmware.vim.HostVirtualNic getConsoleVnic(int i) {
        return this.consoleVnic[i];
    }

    public void setConsoleVnic(int i, com.vmware.vim.HostVirtualNic _value) {
        this.consoleVnic[i] = _value;
    }


    /**
     * Gets the dnsConfig value for this HostNetworkInfo.
     * 
     * @return dnsConfig
     */
    public com.vmware.vim.HostDnsConfig getDnsConfig() {
        return dnsConfig;
    }


    /**
     * Sets the dnsConfig value for this HostNetworkInfo.
     * 
     * @param dnsConfig
     */
    public void setDnsConfig(com.vmware.vim.HostDnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }


    /**
     * Gets the ipRouteConfig value for this HostNetworkInfo.
     * 
     * @return ipRouteConfig
     */
    public com.vmware.vim.HostIpRouteConfig getIpRouteConfig() {
        return ipRouteConfig;
    }


    /**
     * Sets the ipRouteConfig value for this HostNetworkInfo.
     * 
     * @param ipRouteConfig
     */
    public void setIpRouteConfig(com.vmware.vim.HostIpRouteConfig ipRouteConfig) {
        this.ipRouteConfig = ipRouteConfig;
    }


    /**
     * Gets the consoleIpRouteConfig value for this HostNetworkInfo.
     * 
     * @return consoleIpRouteConfig
     */
    public com.vmware.vim.HostIpRouteConfig getConsoleIpRouteConfig() {
        return consoleIpRouteConfig;
    }


    /**
     * Sets the consoleIpRouteConfig value for this HostNetworkInfo.
     * 
     * @param consoleIpRouteConfig
     */
    public void setConsoleIpRouteConfig(com.vmware.vim.HostIpRouteConfig consoleIpRouteConfig) {
        this.consoleIpRouteConfig = consoleIpRouteConfig;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostNetworkInfo)) return false;
        HostNetworkInfo other = (HostNetworkInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vswitch==null && other.getVswitch()==null) || 
             (this.vswitch!=null &&
              java.util.Arrays.equals(this.vswitch, other.getVswitch()))) &&
            ((this.portgroup==null && other.getPortgroup()==null) || 
             (this.portgroup!=null &&
              java.util.Arrays.equals(this.portgroup, other.getPortgroup()))) &&
            ((this.pnic==null && other.getPnic()==null) || 
             (this.pnic!=null &&
              java.util.Arrays.equals(this.pnic, other.getPnic()))) &&
            ((this.vnic==null && other.getVnic()==null) || 
             (this.vnic!=null &&
              java.util.Arrays.equals(this.vnic, other.getVnic()))) &&
            ((this.consoleVnic==null && other.getConsoleVnic()==null) || 
             (this.consoleVnic!=null &&
              java.util.Arrays.equals(this.consoleVnic, other.getConsoleVnic()))) &&
            ((this.dnsConfig==null && other.getDnsConfig()==null) || 
             (this.dnsConfig!=null &&
              this.dnsConfig.equals(other.getDnsConfig()))) &&
            ((this.ipRouteConfig==null && other.getIpRouteConfig()==null) || 
             (this.ipRouteConfig!=null &&
              this.ipRouteConfig.equals(other.getIpRouteConfig()))) &&
            ((this.consoleIpRouteConfig==null && other.getConsoleIpRouteConfig()==null) || 
             (this.consoleIpRouteConfig!=null &&
              this.consoleIpRouteConfig.equals(other.getConsoleIpRouteConfig())));
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
        if (getVswitch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVswitch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVswitch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getVnic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVnic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVnic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConsoleVnic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConsoleVnic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConsoleVnic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDnsConfig() != null) {
            _hashCode += getDnsConfig().hashCode();
        }
        if (getIpRouteConfig() != null) {
            _hashCode += getIpRouteConfig().hashCode();
        }
        if (getConsoleIpRouteConfig() != null) {
            _hashCode += getConsoleIpRouteConfig().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostNetworkInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostNetworkInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vswitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "vswitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostVirtualSwitch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "portgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostPortGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "pnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "PhysicalNic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "vnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostVirtualNic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consoleVnic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "consoleVnic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostVirtualNic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "dnsConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostDnsConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipRouteConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "ipRouteConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostIpRouteConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consoleIpRouteConfig");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "consoleIpRouteConfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostIpRouteConfig"));
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
