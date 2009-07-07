/**
 * Event.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class Event  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private int key;

    private int chainId;

    private java.util.Calendar createdTime;

    private java.lang.String userName;

    private com.vmware.vim25.DatacenterEventArgument datacenter;

    private com.vmware.vim25.ComputeResourceEventArgument computeResource;

    private com.vmware.vim25.HostEventArgument host;

    private com.vmware.vim25.VmEventArgument vm;

    private com.vmware.vim25.DatastoreEventArgument ds;

    private com.vmware.vim25.NetworkEventArgument net;

    private com.vmware.vim25.DvsEventArgument dvs;

    private java.lang.String fullFormattedMessage;

    private java.lang.String changeTag;

    public Event() {
    }

    public Event(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int key,
           int chainId,
           java.util.Calendar createdTime,
           java.lang.String userName,
           com.vmware.vim25.DatacenterEventArgument datacenter,
           com.vmware.vim25.ComputeResourceEventArgument computeResource,
           com.vmware.vim25.HostEventArgument host,
           com.vmware.vim25.VmEventArgument vm,
           com.vmware.vim25.DatastoreEventArgument ds,
           com.vmware.vim25.NetworkEventArgument net,
           com.vmware.vim25.DvsEventArgument dvs,
           java.lang.String fullFormattedMessage,
           java.lang.String changeTag) {
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
        this.ds = ds;
        this.net = net;
        this.dvs = dvs;
        this.fullFormattedMessage = fullFormattedMessage;
        this.changeTag = changeTag;
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
    public com.vmware.vim25.DatacenterEventArgument getDatacenter() {
        return datacenter;
    }


    /**
     * Sets the datacenter value for this Event.
     * 
     * @param datacenter
     */
    public void setDatacenter(com.vmware.vim25.DatacenterEventArgument datacenter) {
        this.datacenter = datacenter;
    }


    /**
     * Gets the computeResource value for this Event.
     * 
     * @return computeResource
     */
    public com.vmware.vim25.ComputeResourceEventArgument getComputeResource() {
        return computeResource;
    }


    /**
     * Sets the computeResource value for this Event.
     * 
     * @param computeResource
     */
    public void setComputeResource(com.vmware.vim25.ComputeResourceEventArgument computeResource) {
        this.computeResource = computeResource;
    }


    /**
     * Gets the host value for this Event.
     * 
     * @return host
     */
    public com.vmware.vim25.HostEventArgument getHost() {
        return host;
    }


    /**
     * Sets the host value for this Event.
     * 
     * @param host
     */
    public void setHost(com.vmware.vim25.HostEventArgument host) {
        this.host = host;
    }


    /**
     * Gets the vm value for this Event.
     * 
     * @return vm
     */
    public com.vmware.vim25.VmEventArgument getVm() {
        return vm;
    }


    /**
     * Sets the vm value for this Event.
     * 
     * @param vm
     */
    public void setVm(com.vmware.vim25.VmEventArgument vm) {
        this.vm = vm;
    }


    /**
     * Gets the ds value for this Event.
     * 
     * @return ds
     */
    public com.vmware.vim25.DatastoreEventArgument getDs() {
        return ds;
    }


    /**
     * Sets the ds value for this Event.
     * 
     * @param ds
     */
    public void setDs(com.vmware.vim25.DatastoreEventArgument ds) {
        this.ds = ds;
    }


    /**
     * Gets the net value for this Event.
     * 
     * @return net
     */
    public com.vmware.vim25.NetworkEventArgument getNet() {
        return net;
    }


    /**
     * Sets the net value for this Event.
     * 
     * @param net
     */
    public void setNet(com.vmware.vim25.NetworkEventArgument net) {
        this.net = net;
    }


    /**
     * Gets the dvs value for this Event.
     * 
     * @return dvs
     */
    public com.vmware.vim25.DvsEventArgument getDvs() {
        return dvs;
    }


    /**
     * Sets the dvs value for this Event.
     * 
     * @param dvs
     */
    public void setDvs(com.vmware.vim25.DvsEventArgument dvs) {
        this.dvs = dvs;
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


    /**
     * Gets the changeTag value for this Event.
     * 
     * @return changeTag
     */
    public java.lang.String getChangeTag() {
        return changeTag;
    }


    /**
     * Sets the changeTag value for this Event.
     * 
     * @param changeTag
     */
    public void setChangeTag(java.lang.String changeTag) {
        this.changeTag = changeTag;
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
            ((this.ds==null && other.getDs()==null) || 
             (this.ds!=null &&
              this.ds.equals(other.getDs()))) &&
            ((this.net==null && other.getNet()==null) || 
             (this.net!=null &&
              this.net.equals(other.getNet()))) &&
            ((this.dvs==null && other.getDvs()==null) || 
             (this.dvs!=null &&
              this.dvs.equals(other.getDvs()))) &&
            ((this.fullFormattedMessage==null && other.getFullFormattedMessage()==null) || 
             (this.fullFormattedMessage!=null &&
              this.fullFormattedMessage.equals(other.getFullFormattedMessage()))) &&
            ((this.changeTag==null && other.getChangeTag()==null) || 
             (this.changeTag!=null &&
              this.changeTag.equals(other.getChangeTag())));
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
        if (getDs() != null) {
            _hashCode += getDs().hashCode();
        }
        if (getNet() != null) {
            _hashCode += getNet().hashCode();
        }
        if (getDvs() != null) {
            _hashCode += getDvs().hashCode();
        }
        if (getFullFormattedMessage() != null) {
            _hashCode += getFullFormattedMessage().hashCode();
        }
        if (getChangeTag() != null) {
            _hashCode += getChangeTag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Event.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "Event"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chainId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "chainId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "createdTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datacenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datacenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatacenterEventArgument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computeResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "computeResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ComputeResourceEventArgument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "HostEventArgument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmEventArgument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DatastoreEventArgument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("net");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "net"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "NetworkEventArgument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dvs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "dvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsEventArgument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullFormattedMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fullFormattedMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeTag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "changeTag"));
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
