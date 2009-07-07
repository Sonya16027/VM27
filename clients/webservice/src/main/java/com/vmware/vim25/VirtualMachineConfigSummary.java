/**
 * VirtualMachineConfigSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineConfigSummary  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String name;

    private boolean template;

    private java.lang.String vmPathName;

    private java.lang.Integer memorySizeMB;

    private java.lang.Integer cpuReservation;

    private java.lang.Integer memoryReservation;

    private java.lang.Integer numCpu;

    private java.lang.Integer numEthernetCards;

    private java.lang.Integer numVirtualDisks;

    private java.lang.String uuid;

    private java.lang.String instanceUuid;

    private java.lang.String guestId;

    private java.lang.String guestFullName;

    private java.lang.String annotation;

    private com.vmware.vim25.VAppProductInfo product;

    private java.lang.Boolean installBootRequired;

    private com.vmware.vim25.FaultToleranceConfigInfo ftInfo;

    public VirtualMachineConfigSummary() {
    }

    public VirtualMachineConfigSummary(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String name,
           boolean template,
           java.lang.String vmPathName,
           java.lang.Integer memorySizeMB,
           java.lang.Integer cpuReservation,
           java.lang.Integer memoryReservation,
           java.lang.Integer numCpu,
           java.lang.Integer numEthernetCards,
           java.lang.Integer numVirtualDisks,
           java.lang.String uuid,
           java.lang.String instanceUuid,
           java.lang.String guestId,
           java.lang.String guestFullName,
           java.lang.String annotation,
           com.vmware.vim25.VAppProductInfo product,
           java.lang.Boolean installBootRequired,
           com.vmware.vim25.FaultToleranceConfigInfo ftInfo) {
        super(
            dynamicType,
            dynamicProperty);
        this.name = name;
        this.template = template;
        this.vmPathName = vmPathName;
        this.memorySizeMB = memorySizeMB;
        this.cpuReservation = cpuReservation;
        this.memoryReservation = memoryReservation;
        this.numCpu = numCpu;
        this.numEthernetCards = numEthernetCards;
        this.numVirtualDisks = numVirtualDisks;
        this.uuid = uuid;
        this.instanceUuid = instanceUuid;
        this.guestId = guestId;
        this.guestFullName = guestFullName;
        this.annotation = annotation;
        this.product = product;
        this.installBootRequired = installBootRequired;
        this.ftInfo = ftInfo;
    }


    /**
     * Gets the name value for this VirtualMachineConfigSummary.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this VirtualMachineConfigSummary.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the template value for this VirtualMachineConfigSummary.
     * 
     * @return template
     */
    public boolean isTemplate() {
        return template;
    }


    /**
     * Sets the template value for this VirtualMachineConfigSummary.
     * 
     * @param template
     */
    public void setTemplate(boolean template) {
        this.template = template;
    }


    /**
     * Gets the vmPathName value for this VirtualMachineConfigSummary.
     * 
     * @return vmPathName
     */
    public java.lang.String getVmPathName() {
        return vmPathName;
    }


    /**
     * Sets the vmPathName value for this VirtualMachineConfigSummary.
     * 
     * @param vmPathName
     */
    public void setVmPathName(java.lang.String vmPathName) {
        this.vmPathName = vmPathName;
    }


    /**
     * Gets the memorySizeMB value for this VirtualMachineConfigSummary.
     * 
     * @return memorySizeMB
     */
    public java.lang.Integer getMemorySizeMB() {
        return memorySizeMB;
    }


    /**
     * Sets the memorySizeMB value for this VirtualMachineConfigSummary.
     * 
     * @param memorySizeMB
     */
    public void setMemorySizeMB(java.lang.Integer memorySizeMB) {
        this.memorySizeMB = memorySizeMB;
    }


    /**
     * Gets the cpuReservation value for this VirtualMachineConfigSummary.
     * 
     * @return cpuReservation
     */
    public java.lang.Integer getCpuReservation() {
        return cpuReservation;
    }


    /**
     * Sets the cpuReservation value for this VirtualMachineConfigSummary.
     * 
     * @param cpuReservation
     */
    public void setCpuReservation(java.lang.Integer cpuReservation) {
        this.cpuReservation = cpuReservation;
    }


    /**
     * Gets the memoryReservation value for this VirtualMachineConfigSummary.
     * 
     * @return memoryReservation
     */
    public java.lang.Integer getMemoryReservation() {
        return memoryReservation;
    }


    /**
     * Sets the memoryReservation value for this VirtualMachineConfigSummary.
     * 
     * @param memoryReservation
     */
    public void setMemoryReservation(java.lang.Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
    }


    /**
     * Gets the numCpu value for this VirtualMachineConfigSummary.
     * 
     * @return numCpu
     */
    public java.lang.Integer getNumCpu() {
        return numCpu;
    }


    /**
     * Sets the numCpu value for this VirtualMachineConfigSummary.
     * 
     * @param numCpu
     */
    public void setNumCpu(java.lang.Integer numCpu) {
        this.numCpu = numCpu;
    }


    /**
     * Gets the numEthernetCards value for this VirtualMachineConfigSummary.
     * 
     * @return numEthernetCards
     */
    public java.lang.Integer getNumEthernetCards() {
        return numEthernetCards;
    }


    /**
     * Sets the numEthernetCards value for this VirtualMachineConfigSummary.
     * 
     * @param numEthernetCards
     */
    public void setNumEthernetCards(java.lang.Integer numEthernetCards) {
        this.numEthernetCards = numEthernetCards;
    }


    /**
     * Gets the numVirtualDisks value for this VirtualMachineConfigSummary.
     * 
     * @return numVirtualDisks
     */
    public java.lang.Integer getNumVirtualDisks() {
        return numVirtualDisks;
    }


    /**
     * Sets the numVirtualDisks value for this VirtualMachineConfigSummary.
     * 
     * @param numVirtualDisks
     */
    public void setNumVirtualDisks(java.lang.Integer numVirtualDisks) {
        this.numVirtualDisks = numVirtualDisks;
    }


    /**
     * Gets the uuid value for this VirtualMachineConfigSummary.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this VirtualMachineConfigSummary.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }


    /**
     * Gets the instanceUuid value for this VirtualMachineConfigSummary.
     * 
     * @return instanceUuid
     */
    public java.lang.String getInstanceUuid() {
        return instanceUuid;
    }


    /**
     * Sets the instanceUuid value for this VirtualMachineConfigSummary.
     * 
     * @param instanceUuid
     */
    public void setInstanceUuid(java.lang.String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }


    /**
     * Gets the guestId value for this VirtualMachineConfigSummary.
     * 
     * @return guestId
     */
    public java.lang.String getGuestId() {
        return guestId;
    }


    /**
     * Sets the guestId value for this VirtualMachineConfigSummary.
     * 
     * @param guestId
     */
    public void setGuestId(java.lang.String guestId) {
        this.guestId = guestId;
    }


    /**
     * Gets the guestFullName value for this VirtualMachineConfigSummary.
     * 
     * @return guestFullName
     */
    public java.lang.String getGuestFullName() {
        return guestFullName;
    }


    /**
     * Sets the guestFullName value for this VirtualMachineConfigSummary.
     * 
     * @param guestFullName
     */
    public void setGuestFullName(java.lang.String guestFullName) {
        this.guestFullName = guestFullName;
    }


    /**
     * Gets the annotation value for this VirtualMachineConfigSummary.
     * 
     * @return annotation
     */
    public java.lang.String getAnnotation() {
        return annotation;
    }


    /**
     * Sets the annotation value for this VirtualMachineConfigSummary.
     * 
     * @param annotation
     */
    public void setAnnotation(java.lang.String annotation) {
        this.annotation = annotation;
    }


    /**
     * Gets the product value for this VirtualMachineConfigSummary.
     * 
     * @return product
     */
    public com.vmware.vim25.VAppProductInfo getProduct() {
        return product;
    }


    /**
     * Sets the product value for this VirtualMachineConfigSummary.
     * 
     * @param product
     */
    public void setProduct(com.vmware.vim25.VAppProductInfo product) {
        this.product = product;
    }


    /**
     * Gets the installBootRequired value for this VirtualMachineConfigSummary.
     * 
     * @return installBootRequired
     */
    public java.lang.Boolean getInstallBootRequired() {
        return installBootRequired;
    }


    /**
     * Sets the installBootRequired value for this VirtualMachineConfigSummary.
     * 
     * @param installBootRequired
     */
    public void setInstallBootRequired(java.lang.Boolean installBootRequired) {
        this.installBootRequired = installBootRequired;
    }


    /**
     * Gets the ftInfo value for this VirtualMachineConfigSummary.
     * 
     * @return ftInfo
     */
    public com.vmware.vim25.FaultToleranceConfigInfo getFtInfo() {
        return ftInfo;
    }


    /**
     * Sets the ftInfo value for this VirtualMachineConfigSummary.
     * 
     * @param ftInfo
     */
    public void setFtInfo(com.vmware.vim25.FaultToleranceConfigInfo ftInfo) {
        this.ftInfo = ftInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VirtualMachineConfigSummary)) return false;
        VirtualMachineConfigSummary other = (VirtualMachineConfigSummary) obj;
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
            this.template == other.isTemplate() &&
            ((this.vmPathName==null && other.getVmPathName()==null) || 
             (this.vmPathName!=null &&
              this.vmPathName.equals(other.getVmPathName()))) &&
            ((this.memorySizeMB==null && other.getMemorySizeMB()==null) || 
             (this.memorySizeMB!=null &&
              this.memorySizeMB.equals(other.getMemorySizeMB()))) &&
            ((this.cpuReservation==null && other.getCpuReservation()==null) || 
             (this.cpuReservation!=null &&
              this.cpuReservation.equals(other.getCpuReservation()))) &&
            ((this.memoryReservation==null && other.getMemoryReservation()==null) || 
             (this.memoryReservation!=null &&
              this.memoryReservation.equals(other.getMemoryReservation()))) &&
            ((this.numCpu==null && other.getNumCpu()==null) || 
             (this.numCpu!=null &&
              this.numCpu.equals(other.getNumCpu()))) &&
            ((this.numEthernetCards==null && other.getNumEthernetCards()==null) || 
             (this.numEthernetCards!=null &&
              this.numEthernetCards.equals(other.getNumEthernetCards()))) &&
            ((this.numVirtualDisks==null && other.getNumVirtualDisks()==null) || 
             (this.numVirtualDisks!=null &&
              this.numVirtualDisks.equals(other.getNumVirtualDisks()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid()))) &&
            ((this.instanceUuid==null && other.getInstanceUuid()==null) || 
             (this.instanceUuid!=null &&
              this.instanceUuid.equals(other.getInstanceUuid()))) &&
            ((this.guestId==null && other.getGuestId()==null) || 
             (this.guestId!=null &&
              this.guestId.equals(other.getGuestId()))) &&
            ((this.guestFullName==null && other.getGuestFullName()==null) || 
             (this.guestFullName!=null &&
              this.guestFullName.equals(other.getGuestFullName()))) &&
            ((this.annotation==null && other.getAnnotation()==null) || 
             (this.annotation!=null &&
              this.annotation.equals(other.getAnnotation()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.installBootRequired==null && other.getInstallBootRequired()==null) || 
             (this.installBootRequired!=null &&
              this.installBootRequired.equals(other.getInstallBootRequired()))) &&
            ((this.ftInfo==null && other.getFtInfo()==null) || 
             (this.ftInfo!=null &&
              this.ftInfo.equals(other.getFtInfo())));
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
        _hashCode += (isTemplate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVmPathName() != null) {
            _hashCode += getVmPathName().hashCode();
        }
        if (getMemorySizeMB() != null) {
            _hashCode += getMemorySizeMB().hashCode();
        }
        if (getCpuReservation() != null) {
            _hashCode += getCpuReservation().hashCode();
        }
        if (getMemoryReservation() != null) {
            _hashCode += getMemoryReservation().hashCode();
        }
        if (getNumCpu() != null) {
            _hashCode += getNumCpu().hashCode();
        }
        if (getNumEthernetCards() != null) {
            _hashCode += getNumEthernetCards().hashCode();
        }
        if (getNumVirtualDisks() != null) {
            _hashCode += getNumVirtualDisks().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        if (getInstanceUuid() != null) {
            _hashCode += getInstanceUuid().hashCode();
        }
        if (getGuestId() != null) {
            _hashCode += getGuestId().hashCode();
        }
        if (getGuestFullName() != null) {
            _hashCode += getGuestFullName().hashCode();
        }
        if (getAnnotation() != null) {
            _hashCode += getAnnotation().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getInstallBootRequired() != null) {
            _hashCode += getInstallBootRequired().hashCode();
        }
        if (getFtInfo() != null) {
            _hashCode += getFtInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VirtualMachineConfigSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineConfigSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "template"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmPathName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "vmPathName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memorySizeMB");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memorySizeMB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpuReservation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cpuReservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryReservation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "memoryReservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCpu");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numCpu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numEthernetCards");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numEthernetCards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numVirtualDisks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numVirtualDisks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceUuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "instanceUuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "guestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "guestFullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "annotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppProductInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installBootRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "installBootRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ftInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "FaultToleranceConfigInfo"));
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
