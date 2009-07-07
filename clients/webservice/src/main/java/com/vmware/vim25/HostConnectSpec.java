/**
 * HostConnectSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostConnectSpec  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String hostName;

    private java.lang.Integer port;

    private java.lang.String sslThumbprint;

    private java.lang.String userName;

    private java.lang.String password;

    private com.vmware.vim25.ManagedObjectReference vmFolder;

    private boolean force;

    private java.lang.String vimAccountName;

    private java.lang.String vimAccountPassword;

    private java.lang.String managementIp;

    public HostConnectSpec() {
    }

    public HostConnectSpec(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String hostName,
           java.lang.Integer port,
           java.lang.String sslThumbprint,
           java.lang.String userName,
           java.lang.String password,
           com.vmware.vim25.ManagedObjectReference vmFolder,
           boolean force,
           java.lang.String vimAccountName,
           java.lang.String vimAccountPassword,
           java.lang.String managementIp) {
        super(
            dynamicType,
            dynamicProperty);
        this.hostName = hostName;
        this.port = port;
        this.sslThumbprint = sslThumbprint;
        this.userName = userName;
        this.password = password;
        this.vmFolder = vmFolder;
        this.force = force;
        this.vimAccountName = vimAccountName;
        this.vimAccountPassword = vimAccountPassword;
        this.managementIp = managementIp;
    }


    /**
     * Gets the hostName value for this HostConnectSpec.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this HostConnectSpec.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the port value for this HostConnectSpec.
     * 
     * @return port
     */
    public java.lang.Integer getPort() {
        return port;
    }


    /**
     * Sets the port value for this HostConnectSpec.
     * 
     * @param port
     */
    public void setPort(java.lang.Integer port) {
        this.port = port;
    }


    /**
     * Gets the sslThumbprint value for this HostConnectSpec.
     * 
     * @return sslThumbprint
     */
    public java.lang.String getSslThumbprint() {
        return sslThumbprint;
    }


    /**
     * Sets the sslThumbprint value for this HostConnectSpec.
     * 
     * @param sslThumbprint
     */
    public void setSslThumbprint(java.lang.String sslThumbprint) {
        this.sslThumbprint = sslThumbprint;
    }


    /**
     * Gets the userName value for this HostConnectSpec.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this HostConnectSpec.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the password value for this HostConnectSpec.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this HostConnectSpec.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the vmFolder value for this HostConnectSpec.
     * 
     * @return vmFolder
     */
    public com.vmware.vim25.ManagedObjectReference getVmFolder() {
        return vmFolder;
    }


    /**
     * Sets the vmFolder value for this HostConnectSpec.
     * 
     * @param vmFolder
     */
    public void setVmFolder(com.vmware.vim25.ManagedObjectReference vmFolder) {
        this.vmFolder = vmFolder;
    }


    /**
     * Gets the force value for this HostConnectSpec.
     * 
     * @return force
     */
    public boolean isForce() {
        return force;
    }


    /**
     * Sets the force value for this HostConnectSpec.
     * 
     * @param force
     */
    public void setForce(boolean force) {
        this.force = force;
    }


    /**
     * Gets the vimAccountName value for this HostConnectSpec.
     * 
     * @return vimAccountName
     */
    public java.lang.String getVimAccountName() {
        return vimAccountName;
    }


    /**
     * Sets the vimAccountName value for this HostConnectSpec.
     * 
     * @param vimAccountName
     */
    public void setVimAccountName(java.lang.String vimAccountName) {
        this.vimAccountName = vimAccountName;
    }


    /**
     * Gets the vimAccountPassword value for this HostConnectSpec.
     * 
     * @return vimAccountPassword
     */
    public java.lang.String getVimAccountPassword() {
        return vimAccountPassword;
    }


    /**
     * Sets the vimAccountPassword value for this HostConnectSpec.
     * 
     * @param vimAccountPassword
     */
    public void setVimAccountPassword(java.lang.String vimAccountPassword) {
        this.vimAccountPassword = vimAccountPassword;
    }


    /**
     * Gets the managementIp value for this HostConnectSpec.
     * 
     * @return managementIp
     */
    public java.lang.String getManagementIp() {
        return managementIp;
    }


    /**
     * Sets the managementIp value for this HostConnectSpec.
     * 
     * @param managementIp
     */
    public void setManagementIp(java.lang.String managementIp) {
        this.managementIp = managementIp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostConnectSpec)) return false;
        HostConnectSpec other = (HostConnectSpec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.sslThumbprint==null && other.getSslThumbprint()==null) || 
             (this.sslThumbprint!=null &&
              this.sslThumbprint.equals(other.getSslThumbprint()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.vmFolder==null && other.getVmFolder()==null) || 
             (this.vmFolder!=null &&
              this.vmFolder.equals(other.getVmFolder()))) &&
            this.force == other.isForce() &&
            ((this.vimAccountName==null && other.getVimAccountName()==null) || 
             (this.vimAccountName!=null &&
              this.vimAccountName.equals(other.getVimAccountName()))) &&
            ((this.vimAccountPassword==null && other.getVimAccountPassword()==null) || 
             (this.vimAccountPassword!=null &&
              this.vimAccountPassword.equals(other.getVimAccountPassword()))) &&
            ((this.managementIp==null && other.getManagementIp()==null) || 
             (this.managementIp!=null &&
              this.managementIp.equals(other.getManagementIp())));
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
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getSslThumbprint() != null) {
            _hashCode += getSslThumbprint().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getVmFolder() != null) {
            _hashCode += getVmFolder().hashCode();
        }
        _hashCode += (isForce() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVimAccountName() != null) {
            _hashCode += getVimAccountName().hashCode();
        }
        if (getVimAccountPassword() != null) {
            _hashCode += getVimAccountPassword().hashCode();
        }
        if (getManagementIp() != null) {
            _hashCode += getManagementIp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostConnectSpec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostConnectSpec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslThumbprint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sslThumbprint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ManagedObjectReference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("force");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "force"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vimAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vimAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vimAccountPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vimAccountPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managementIp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "managementIp"));
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
