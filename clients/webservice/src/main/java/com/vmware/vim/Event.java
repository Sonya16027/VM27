/**
 * Event.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class Event  extends com.vmware.vim.DynamicData  implements java.io.Serializable {
    private int key;

    private int chainId;

    private java.util.Calendar createdTime;

    private java.lang.String userName;

    private com.vmware.vim.DatacenterEventArgument datacenter;

    private com.vmware.vim.ComputeResourceEventArgument computeResource;

    private com.vmware.vim.HostEventArgument host;

    private com.vmware.vim.VmEventArgument vm;

    private java.lang.String fullFormattedMessage;

    public Event() {
    }

    public Event(
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
           java.lang.String fullFormattedMessage) {
        super(
            dynamicType,
            dynamicProperty);
        this.key = key;
        this.chainId = chainId;
        this.createdTime = createdTime;
        this.userName = userName;
        this.datacenter = datacenter;
        this.computeResource = computeResource;
        this.host = host;
        this.vm = vm;
        this.fullFormattedMessage = fullFormattedMessage;
    }


    /**
     * Gets the key value for this Event.
     * 
     * @return key
     */
    public int getKey() {
        return key;
    }


    /**
     * Sets the key value for this Event.
     * 
     * @param key
     */
    public void setKey(int key) {
        this.key = key;
    }


    /**
     * Gets the chainId value for this Event.
     * 
     * @return chainId
     */
    public int getChainId() {
        return chainId;
    }


    /**
     * Sets the chainId value for this Event.
     * 
     * @param chainId
     */
    public void setChainId(int chainId) {
        this.chainId = chainId;
    }


    /**
     * Gets the createdTime value for this Event.
     * 
     * @return createdTime
     */
    public java.util.Calendar getCreatedTime() {
        return createdTime;
    }


    /**
     * Sets the createdTime value for this Event.
     * 
     * @param createdTime
     */
    public void setCreatedTime(java.util.Calendar createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * Gets the userName value for this Event.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this Event.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the datacenter value for this Event.
     * 
     * @return datacenter
     */
    public com.vmware.vim.DatacenterEventArgument getDatacenter() {
        return datacenter;
    }


    /**
     * Sets the datacenter value for this Event.
     * 
     * @param datacenter
     */
    public void setDatacenter(com.vmware.vim.DatacenterEventArgument datacenter) {
        this.datacenter = datacenter;
    }


    /**
     * Gets the computeResource value for this Event.
     * 
     * @return computeResource
     */
    public com.vmware.vim.ComputeResourceEventArgument getComputeResource() {
        return computeResource;
    }


    /**
     * Sets the computeResource value for this Event.
     * 
     * @param computeResource
     */
    public void setComputeResource(com.vmware.vim.ComputeResourceEventArgument computeResource) {
        this.computeResource = computeResource;
    }


    /**
     * Gets the host value for this Event.
     * 
     * @return host
     */
    public com.vmware.vim.HostEventArgument getHost() {
        return host;
    }


    /**
     * Sets the host value for this Event.
     * 
     * @param host
     */
    public void setHost(com.vmware.vim.HostEventArgument host) {
        this.host = host;
    }


    /**
     * Gets the vm value for this Event.
     * 
     * @return vm
     */
    public com.vmware.vim.VmEventArgument getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this Event.
     * 
     * @param vm
     */
    public void setVm(com.vmware.vim.VmEventArgument vm) {
        this.vm = vm;
    }


    /**
     * Gets the fullFormattedMessage value for this Event.
     * 
     * @return fullFormattedMessage
     */
    public java.lang.String getFullFormattedMessage() {
        return fullFormattedMessage;
    }


    /**
     * Sets the fullFormattedMessage value for this Event.
     * 
     * @param fullFormattedMessage
     */
    public void setFullFormattedMessage(java.lang.String fullFormattedMessage) {
        this.fullFormattedMessage = fullFormattedMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Event)) return false;
        Event other = (Event) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.key == other.getKey() &&
            this.chainId == other.getChainId() &&
            ((this.createdTime==null && other.getCreatedTime()==null) || 
             (this.createdTime!=null &&
              this.createdTime.equals(other.getCreatedTime()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.datacenter==null && other.getDatacenter()==null) || 
             (this.datacenter!=null &&
              this.datacenter.equals(other.getDatacenter()))) &&
            ((this.computeResource==null && other.getComputeResource()==null) || 
             (this.computeResource!=null &&
              this.computeResource.equals(other.getComputeResource()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.vm==null && other.getVm()==null) || 
             (this.vm!=null &&
              this.vm.equals(other.getVm()))) &&
            ((this.fullFormattedMessage==null && other.getFullFormattedMessage()==null) || 
             (this.fullFormattedMessage!=null &&
              this.fullFormattedMessage.equals(other.getFullFormattedMessage())));
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
        _hashCode += getKey();
        _hashCode += getChainId();
        if (getCreatedTime() != null) {
            _hashCode += getCreatedTime().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getDatacenter() != null) {
            _hashCode += getDatacenter().hashCode();
        }
        if (getComputeResource() != null) {
            _hashCode += getComputeResource().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getVm() != null) {
            _hashCode += getVm().hashCode();
        }
        if (getFullFormattedMessage() != null) {
            _hashCode += getFullFormattedMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Event.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2", "Event"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chainId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "chainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "createdTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datacenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "datacenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "DatacenterEventArgument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computeResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "computeResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "ComputeResourceEventArgument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "HostEventArgument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2", "VmEventArgument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullFormattedMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2", "fullFormattedMessage"));
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
