/**
 * HostApplyProfile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostApplyProfile  extends com.vmware.vim25.ApplyProfile  implements java.io.Serializable {
    private com.vmware.vim25.HostMemoryProfile memory;

    private com.vmware.vim25.StorageProfile storage;

    private com.vmware.vim25.NetworkProfile network;

    private com.vmware.vim25.DateTimeProfile datetime;

    private com.vmware.vim25.FirewallProfile firewall;

    private com.vmware.vim25.SecurityProfile security;

    private com.vmware.vim25.ServiceProfile[] service;

    private com.vmware.vim25.OptionProfile[] option;

    private com.vmware.vim25.UserProfile[] userAccount;

    private com.vmware.vim25.UserGroupProfile[] usergroupAccount;

    public HostApplyProfile() {
    }

    public HostApplyProfile(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           boolean enabled,
           com.vmware.vim25.ProfilePolicy[] policy,
           com.vmware.vim25.HostMemoryProfile memory,
           com.vmware.vim25.StorageProfile storage,
           com.vmware.vim25.NetworkProfile network,
           com.vmware.vim25.DateTimeProfile datetime,
           com.vmware.vim25.FirewallProfile firewall,
           com.vmware.vim25.SecurityProfile security,
           com.vmware.vim25.ServiceProfile[] service,
           com.vmware.vim25.OptionProfile[] option,
           com.vmware.vim25.UserProfile[] userAccount,
           com.vmware.vim25.UserGroupProfile[] usergroupAccount) {
        super(
            dynamicType,
            dynamicProperty,
            enabled,
            policy);
        this.memory = memory;
        this.storage = storage;
        this.network = network;
        this.datetime = datetime;
        this.firewall = firewall;
        this.security = security;
        this.service = service;
        this.option = option;
        this.userAccount = userAccount;
        this.usergroupAccount = usergroupAccount;
    }


    /**
     * Gets the memory value for this HostApplyProfile.
     * 
     * @return memory
     */
    public com.vmware.vim25.HostMemoryProfile getMemory() {
        return memory;
    }


    /**
     * Sets the memory value for this HostApplyProfile.
     * 
     * @param memory
     */
    public void setMemory(com.vmware.vim25.HostMemoryProfile memory) {
        this.memory = memory;
    }


    /**
     * Gets the storage value for this HostApplyProfile.
     * 
     * @return storage
     */
    public com.vmware.vim25.StorageProfile getStorage() {
        return storage;
    }


    /**
     * Sets the storage value for this HostApplyProfile.
     * 
     * @param storage
     */
    public void setStorage(com.vmware.vim25.StorageProfile storage) {
        this.storage = storage;
    }


    /**
     * Gets the network value for this HostApplyProfile.
     * 
     * @return network
     */
    public com.vmware.vim25.NetworkProfile getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this HostApplyProfile.
     * 
     * @param network
     */
    public void setNetwork(com.vmware.vim25.NetworkProfile network) {
        this.network = network;
    }


    /**
     * Gets the datetime value for this HostApplyProfile.
     * 
     * @return datetime
     */
    public com.vmware.vim25.DateTimeProfile getDatetime() {
        return datetime;
    }


    /**
     * Sets the datetime value for this HostApplyProfile.
     * 
     * @param datetime
     */
    public void setDatetime(com.vmware.vim25.DateTimeProfile datetime) {
        this.datetime = datetime;
    }


    /**
     * Gets the firewall value for this HostApplyProfile.
     * 
     * @return firewall
     */
    public com.vmware.vim25.FirewallProfile getFirewall() {
        return firewall;
    }


    /**
     * Sets the firewall value for this HostApplyProfile.
     * 
     * @param firewall
     */
    public void setFirewall(com.vmware.vim25.FirewallProfile firewall) {
        this.firewall = firewall;
    }


    /**
     * Gets the security value for this HostApplyProfile.
     * 
     * @return security
     */
    public com.vmware.vim25.SecurityProfile getSecurity() {
        return security;
    }


    /**
     * Sets the security value for this HostApplyProfile.
     * 
     * @param security
     */
    public void setSecurity(com.vmware.vim25.SecurityProfile security) {
        this.security = security;
    }


    /**
     * Gets the service value for this HostApplyProfile.
     * 
     * @return service
     */
    public com.vmware.vim25.ServiceProfile[] getService() {
        return service;
    }


    /**
     * Sets the service value for this HostApplyProfile.
     * 
     * @param service
     */
    public void setService(com.vmware.vim25.ServiceProfile[] service) {
        this.service = service;
    }

    public com.vmware.vim25.ServiceProfile getService(int i) {
        return this.service[i];
    }

    public void setService(int i, com.vmware.vim25.ServiceProfile _value) {
        this.service[i] = _value;
    }


    /**
     * Gets the option value for this HostApplyProfile.
     * 
     * @return option
     */
    public com.vmware.vim25.OptionProfile[] getOption() {
        return option;
    }


    /**
     * Sets the option value for this HostApplyProfile.
     * 
     * @param option
     */
    public void setOption(com.vmware.vim25.OptionProfile[] option) {
        this.option = option;
    }

    public com.vmware.vim25.OptionProfile getOption(int i) {
        return this.option[i];
    }

    public void setOption(int i, com.vmware.vim25.OptionProfile _value) {
        this.option[i] = _value;
    }


    /**
     * Gets the userAccount value for this HostApplyProfile.
     * 
     * @return userAccount
     */
    public com.vmware.vim25.UserProfile[] getUserAccount() {
        return userAccount;
    }


    /**
     * Sets the userAccount value for this HostApplyProfile.
     * 
     * @param userAccount
     */
    public void setUserAccount(com.vmware.vim25.UserProfile[] userAccount) {
        this.userAccount = userAccount;
    }

    public com.vmware.vim25.UserProfile getUserAccount(int i) {
        return this.userAccount[i];
    }

    public void setUserAccount(int i, com.vmware.vim25.UserProfile _value) {
        this.userAccount[i] = _value;
    }


    /**
     * Gets the usergroupAccount value for this HostApplyProfile.
     * 
     * @return usergroupAccount
     */
    public com.vmware.vim25.UserGroupProfile[] getUsergroupAccount() {
        return usergroupAccount;
    }


    /**
     * Sets the usergroupAccount value for this HostApplyProfile.
     * 
     * @param usergroupAccount
     */
    public void setUsergroupAccount(com.vmware.vim25.UserGroupProfile[] usergroupAccount) {
        this.usergroupAccount = usergroupAccount;
    }

    public com.vmware.vim25.UserGroupProfile getUsergroupAccount(int i) {
        return this.usergroupAccount[i];
    }

    public void setUsergroupAccount(int i, com.vmware.vim25.UserGroupProfile _value) {
        this.usergroupAccount[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostApplyProfile)) return false;
        HostApplyProfile other = (HostApplyProfile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.memory==null && other.getMemory()==null) || 
             (this.memory!=null &&
              this.memory.equals(other.getMemory()))) &&
            ((this.storage==null && other.getStorage()==null) || 
             (this.storage!=null &&
              this.storage.equals(other.getStorage()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.datetime==null && other.getDatetime()==null) || 
             (this.datetime!=null &&
              this.datetime.equals(other.getDatetime()))) &&
            ((this.firewall==null && other.getFirewall()==null) || 
             (this.firewall!=null &&
              this.firewall.equals(other.getFirewall()))) &&
            ((this.security==null && other.getSecurity()==null) || 
             (this.security!=null &&
              this.security.equals(other.getSecurity()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              java.util.Arrays.equals(this.service, other.getService()))) &&
            ((this.option==null && other.getOption()==null) || 
             (this.option!=null &&
              java.util.Arrays.equals(this.option, other.getOption()))) &&
            ((this.userAccount==null && other.getUserAccount()==null) || 
             (this.userAccount!=null &&
              java.util.Arrays.equals(this.userAccount, other.getUserAccount()))) &&
            ((this.usergroupAccount==null && other.getUsergroupAccount()==null) || 
             (this.usergroupAccount!=null &&
              java.util.Arrays.equals(this.usergroupAccount, other.getUsergroupAccount())));
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
        if (getMemory() != null) {
            _hashCode += getMemory().hashCode();
        }
        if (getStorage() != null) {
            _hashCode += getStorage().hashCode();
        }
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getDatetime() != null) {
            _hashCode += getDatetime().hashCode();
        }
        if (getFirewall() != null) {
            _hashCode += getFirewall().hashCode();
        }
        if (getSecurity() != null) {
            _hashCode += getSecurity().hashCode();
        }
        if (getService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getService(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsergroupAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsergroupAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsergroupAccount(), i);
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
        new org.apache.axis.description.TypeDesc(HostApplyProfile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostApplyProfile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostMemoryProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "storage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "StorageProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetworkProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datetime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DateTimeProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewall");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "firewall"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FirewallProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("security");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "security"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "SecurityProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ServiceProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "option"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OptionProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "UserProfile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usergroupAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "usergroupAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "UserGroupProfile"));
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
