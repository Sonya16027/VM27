/**
 * ResourcePoolQuickStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ResourcePoolQuickStats  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.Long overallCpuUsage;

    private java.lang.Long overallCpuDemand;

    private java.lang.Long guestMemoryUsage;

    private java.lang.Long hostMemoryUsage;

    private java.lang.Long distributedCpuEntitlement;

    private java.lang.Long distributedMemoryEntitlement;

    private java.lang.Integer staticCpuEntitlement;

    private java.lang.Integer staticMemoryEntitlement;

    private java.lang.Long privateMemory;

    private java.lang.Long sharedMemory;

    private java.lang.Long swappedMemory;

    private java.lang.Long balloonedMemory;

    private java.lang.Long overheadMemory;

    private java.lang.Long consumedOverheadMemory;

    public ResourcePoolQuickStats() {
    }

    public ResourcePoolQuickStats(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.Long overallCpuUsage,
           java.lang.Long overallCpuDemand,
           java.lang.Long guestMemoryUsage,
           java.lang.Long hostMemoryUsage,
           java.lang.Long distributedCpuEntitlement,
           java.lang.Long distributedMemoryEntitlement,
           java.lang.Integer staticCpuEntitlement,
           java.lang.Integer staticMemoryEntitlement,
           java.lang.Long privateMemory,
           java.lang.Long sharedMemory,
           java.lang.Long swappedMemory,
           java.lang.Long balloonedMemory,
           java.lang.Long overheadMemory,
           java.lang.Long consumedOverheadMemory) {
        super(
            dynamicType,
            dynamicProperty);
        this.overallCpuUsage = overallCpuUsage;
        this.overallCpuDemand = overallCpuDemand;
        this.guestMemoryUsage = guestMemoryUsage;
        this.hostMemoryUsage = hostMemoryUsage;
        this.distributedCpuEntitlement = distributedCpuEntitlement;
        this.distributedMemoryEntitlement = distributedMemoryEntitlement;
        this.staticCpuEntitlement = staticCpuEntitlement;
        this.staticMemoryEntitlement = staticMemoryEntitlement;
        this.privateMemory = privateMemory;
        this.sharedMemory = sharedMemory;
        this.swappedMemory = swappedMemory;
        this.balloonedMemory = balloonedMemory;
        this.overheadMemory = overheadMemory;
        this.consumedOverheadMemory = consumedOverheadMemory;
    }


    /**
     * Gets the overallCpuUsage value for this ResourcePoolQuickStats.
     * 
     * @return overallCpuUsage
     */
    public java.lang.Long getOverallCpuUsage() {
        return overallCpuUsage;
    }


    /**
     * Sets the overallCpuUsage value for this ResourcePoolQuickStats.
     * 
     * @param overallCpuUsage
     */
    public void setOverallCpuUsage(java.lang.Long overallCpuUsage) {
        this.overallCpuUsage = overallCpuUsage;
    }


    /**
     * Gets the overallCpuDemand value for this ResourcePoolQuickStats.
     * 
     * @return overallCpuDemand
     */
    public java.lang.Long getOverallCpuDemand() {
        return overallCpuDemand;
    }


    /**
     * Sets the overallCpuDemand value for this ResourcePoolQuickStats.
     * 
     * @param overallCpuDemand
     */
    public void setOverallCpuDemand(java.lang.Long overallCpuDemand) {
        this.overallCpuDemand = overallCpuDemand;
    }


    /**
     * Gets the guestMemoryUsage value for this ResourcePoolQuickStats.
     * 
     * @return guestMemoryUsage
     */
    public java.lang.Long getGuestMemoryUsage() {
        return guestMemoryUsage;
    }


    /**
     * Sets the guestMemoryUsage value for this ResourcePoolQuickStats.
     * 
     * @param guestMemoryUsage
     */
    public void setGuestMemoryUsage(java.lang.Long guestMemoryUsage) {
        this.guestMemoryUsage = guestMemoryUsage;
    }


    /**
     * Gets the hostMemoryUsage value for this ResourcePoolQuickStats.
     * 
     * @return hostMemoryUsage
     */
    public java.lang.Long getHostMemoryUsage() {
        return hostMemoryUsage;
    }


    /**
     * Sets the hostMemoryUsage value for this ResourcePoolQuickStats.
     * 
     * @param hostMemoryUsage
     */
    public void setHostMemoryUsage(java.lang.Long hostMemoryUsage) {
        this.hostMemoryUsage = hostMemoryUsage;
    }


    /**
     * Gets the distributedCpuEntitlement value for this ResourcePoolQuickStats.
     * 
     * @return distributedCpuEntitlement
     */
    public java.lang.Long getDistributedCpuEntitlement() {
        return distributedCpuEntitlement;
    }


    /**
     * Sets the distributedCpuEntitlement value for this ResourcePoolQuickStats.
     * 
     * @param distributedCpuEntitlement
     */
    public void setDistributedCpuEntitlement(java.lang.Long distributedCpuEntitlement) {
        this.distributedCpuEntitlement = distributedCpuEntitlement;
    }


    /**
     * Gets the distributedMemoryEntitlement value for this ResourcePoolQuickStats.
     * 
     * @return distributedMemoryEntitlement
     */
    public java.lang.Long getDistributedMemoryEntitlement() {
        return distributedMemoryEntitlement;
    }


    /**
     * Sets the distributedMemoryEntitlement value for this ResourcePoolQuickStats.
     * 
     * @param distributedMemoryEntitlement
     */
    public void setDistributedMemoryEntitlement(java.lang.Long distributedMemoryEntitlement) {
        this.distributedMemoryEntitlement = distributedMemoryEntitlement;
    }


    /**
     * Gets the staticCpuEntitlement value for this ResourcePoolQuickStats.
     * 
     * @return staticCpuEntitlement
     */
    public java.lang.Integer getStaticCpuEntitlement() {
        return staticCpuEntitlement;
    }


    /**
     * Sets the staticCpuEntitlement value for this ResourcePoolQuickStats.
     * 
     * @param staticCpuEntitlement
     */
    public void setStaticCpuEntitlement(java.lang.Integer staticCpuEntitlement) {
        this.staticCpuEntitlement = staticCpuEntitlement;
    }


    /**
     * Gets the staticMemoryEntitlement value for this ResourcePoolQuickStats.
     * 
     * @return staticMemoryEntitlement
     */
    public java.lang.Integer getStaticMemoryEntitlement() {
        return staticMemoryEntitlement;
    }


    /**
     * Sets the staticMemoryEntitlement value for this ResourcePoolQuickStats.
     * 
     * @param staticMemoryEntitlement
     */
    public void setStaticMemoryEntitlement(java.lang.Integer staticMemoryEntitlement) {
        this.staticMemoryEntitlement = staticMemoryEntitlement;
    }


    /**
     * Gets the privateMemory value for this ResourcePoolQuickStats.
     * 
     * @return privateMemory
     */
    public java.lang.Long getPrivateMemory() {
        return privateMemory;
    }


    /**
     * Sets the privateMemory value for this ResourcePoolQuickStats.
     * 
     * @param privateMemory
     */
    public void setPrivateMemory(java.lang.Long privateMemory) {
        this.privateMemory = privateMemory;
    }


    /**
     * Gets the sharedMemory value for this ResourcePoolQuickStats.
     * 
     * @return sharedMemory
     */
    public java.lang.Long getSharedMemory() {
        return sharedMemory;
    }


    /**
     * Sets the sharedMemory value for this ResourcePoolQuickStats.
     * 
     * @param sharedMemory
     */
    public void setSharedMemory(java.lang.Long sharedMemory) {
        this.sharedMemory = sharedMemory;
    }


    /**
     * Gets the swappedMemory value for this ResourcePoolQuickStats.
     * 
     * @return swappedMemory
     */
    public java.lang.Long getSwappedMemory() {
        return swappedMemory;
    }


    /**
     * Sets the swappedMemory value for this ResourcePoolQuickStats.
     * 
     * @param swappedMemory
     */
    public void setSwappedMemory(java.lang.Long swappedMemory) {
        this.swappedMemory = swappedMemory;
    }


    /**
     * Gets the balloonedMemory value for this ResourcePoolQuickStats.
     * 
     * @return balloonedMemory
     */
    public java.lang.Long getBalloonedMemory() {
        return balloonedMemory;
    }


    /**
     * Sets the balloonedMemory value for this ResourcePoolQuickStats.
     * 
     * @param balloonedMemory
     */
    public void setBalloonedMemory(java.lang.Long balloonedMemory) {
        this.balloonedMemory = balloonedMemory;
    }


    /**
     * Gets the overheadMemory value for this ResourcePoolQuickStats.
     * 
     * @return overheadMemory
     */
    public java.lang.Long getOverheadMemory() {
        return overheadMemory;
    }


    /**
     * Sets the overheadMemory value for this ResourcePoolQuickStats.
     * 
     * @param overheadMemory
     */
    public void setOverheadMemory(java.lang.Long overheadMemory) {
        this.overheadMemory = overheadMemory;
    }


    /**
     * Gets the consumedOverheadMemory value for this ResourcePoolQuickStats.
     * 
     * @return consumedOverheadMemory
     */
    public java.lang.Long getConsumedOverheadMemory() {
        return consumedOverheadMemory;
    }


    /**
     * Sets the consumedOverheadMemory value for this ResourcePoolQuickStats.
     * 
     * @param consumedOverheadMemory
     */
    public void setConsumedOverheadMemory(java.lang.Long consumedOverheadMemory) {
        this.consumedOverheadMemory = consumedOverheadMemory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourcePoolQuickStats)) return false;
        ResourcePoolQuickStats other = (ResourcePoolQuickStats) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.overallCpuUsage==null && other.getOverallCpuUsage()==null) || 
             (this.overallCpuUsage!=null &&
              this.overallCpuUsage.equals(other.getOverallCpuUsage()))) &&
            ((this.overallCpuDemand==null && other.getOverallCpuDemand()==null) || 
             (this.overallCpuDemand!=null &&
              this.overallCpuDemand.equals(other.getOverallCpuDemand()))) &&
            ((this.guestMemoryUsage==null && other.getGuestMemoryUsage()==null) || 
             (this.guestMemoryUsage!=null &&
              this.guestMemoryUsage.equals(other.getGuestMemoryUsage()))) &&
            ((this.hostMemoryUsage==null && other.getHostMemoryUsage()==null) || 
             (this.hostMemoryUsage!=null &&
              this.hostMemoryUsage.equals(other.getHostMemoryUsage()))) &&
            ((this.distributedCpuEntitlement==null && other.getDistributedCpuEntitlement()==null) || 
             (this.distributedCpuEntitlement!=null &&
              this.distributedCpuEntitlement.equals(other.getDistributedCpuEntitlement()))) &&
            ((this.distributedMemoryEntitlement==null && other.getDistributedMemoryEntitlement()==null) || 
             (this.distributedMemoryEntitlement!=null &&
              this.distributedMemoryEntitlement.equals(other.getDistributedMemoryEntitlement()))) &&
            ((this.staticCpuEntitlement==null && other.getStaticCpuEntitlement()==null) || 
             (this.staticCpuEntitlement!=null &&
              this.staticCpuEntitlement.equals(other.getStaticCpuEntitlement()))) &&
            ((this.staticMemoryEntitlement==null && other.getStaticMemoryEntitlement()==null) || 
             (this.staticMemoryEntitlement!=null &&
              this.staticMemoryEntitlement.equals(other.getStaticMemoryEntitlement()))) &&
            ((this.privateMemory==null && other.getPrivateMemory()==null) || 
             (this.privateMemory!=null &&
              this.privateMemory.equals(other.getPrivateMemory()))) &&
            ((this.sharedMemory==null && other.getSharedMemory()==null) || 
             (this.sharedMemory!=null &&
              this.sharedMemory.equals(other.getSharedMemory()))) &&
            ((this.swappedMemory==null && other.getSwappedMemory()==null) || 
             (this.swappedMemory!=null &&
              this.swappedMemory.equals(other.getSwappedMemory()))) &&
            ((this.balloonedMemory==null && other.getBalloonedMemory()==null) || 
             (this.balloonedMemory!=null &&
              this.balloonedMemory.equals(other.getBalloonedMemory()))) &&
            ((this.overheadMemory==null && other.getOverheadMemory()==null) || 
             (this.overheadMemory!=null &&
              this.overheadMemory.equals(other.getOverheadMemory()))) &&
            ((this.consumedOverheadMemory==null && other.getConsumedOverheadMemory()==null) || 
             (this.consumedOverheadMemory!=null &&
              this.consumedOverheadMemory.equals(other.getConsumedOverheadMemory())));
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
        if (getOverallCpuUsage() != null) {
            _hashCode += getOverallCpuUsage().hashCode();
        }
        if (getOverallCpuDemand() != null) {
            _hashCode += getOverallCpuDemand().hashCode();
        }
        if (getGuestMemoryUsage() != null) {
            _hashCode += getGuestMemoryUsage().hashCode();
        }
        if (getHostMemoryUsage() != null) {
            _hashCode += getHostMemoryUsage().hashCode();
        }
        if (getDistributedCpuEntitlement() != null) {
            _hashCode += getDistributedCpuEntitlement().hashCode();
        }
        if (getDistributedMemoryEntitlement() != null) {
            _hashCode += getDistributedMemoryEntitlement().hashCode();
        }
        if (getStaticCpuEntitlement() != null) {
            _hashCode += getStaticCpuEntitlement().hashCode();
        }
        if (getStaticMemoryEntitlement() != null) {
            _hashCode += getStaticMemoryEntitlement().hashCode();
        }
        if (getPrivateMemory() != null) {
            _hashCode += getPrivateMemory().hashCode();
        }
        if (getSharedMemory() != null) {
            _hashCode += getSharedMemory().hashCode();
        }
        if (getSwappedMemory() != null) {
            _hashCode += getSwappedMemory().hashCode();
        }
        if (getBalloonedMemory() != null) {
            _hashCode += getBalloonedMemory().hashCode();
        }
        if (getOverheadMemory() != null) {
            _hashCode += getOverheadMemory().hashCode();
        }
        if (getConsumedOverheadMemory() != null) {
            _hashCode += getConsumedOverheadMemory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResourcePoolQuickStats.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourcePoolQuickStats"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallCpuUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "overallCpuUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallCpuDemand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "overallCpuDemand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestMemoryUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "guestMemoryUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostMemoryUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostMemoryUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedCpuEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedCpuEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedMemoryEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedMemoryEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticCpuEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "staticCpuEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticMemoryEntitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "staticMemoryEntitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateMemory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "privateMemory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedMemory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sharedMemory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swappedMemory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "swappedMemory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balloonedMemory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "balloonedMemory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overheadMemory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "overheadMemory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumedOverheadMemory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "consumedOverheadMemory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
