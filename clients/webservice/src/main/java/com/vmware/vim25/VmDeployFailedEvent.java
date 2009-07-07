/**
 * VmDeployFailedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmDeployFailedEvent  extends com.vmware.vim25.VmEvent  implements java.io.Serializable {
    private com.vmware.vim25.EntityEventArgument destDatastore;

    private com.vmware.vim25.LocalizedMethodFault reason;

    public VmDeployFailedEvent() {
    }

    public VmDeployFailedEvent(
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
           java.lang.String changeTag,
           boolean template,
           com.vmware.vim25.EntityEventArgument destDatastore,
           com.vmware.vim25.LocalizedMethodFault reason) {
        super(
            dynamicType,
            dynamicProperty,
            key,
            chainId,
            createdTime,
            userName,
            datacenter,
            computeResource,
            host,
            vm,
            ds,
            net,
            dvs,
            fullFormattedMessage,
            changeTag,
            template);
        this.destDatastore = destDatastore;
        this.reason = reason;
    }


    /**
     * Gets the destDatastore value for this VmDeployFailedEvent.
     * 
     * @return destDatastore
     */
    public com.vmware.vim25.EntityEventArgument getDestDatastore() {
        return destDatastore;
    }


    /**
     * Sets the destDatastore value for this VmDeployFailedEvent.
     * 
     * @param destDatastore
     */
    public void setDestDatastore(com.vmware.vim25.EntityEventArgument destDatastore) {
        this.destDatastore = destDatastore;
    }


    /**
     * Gets the reason value for this VmDeployFailedEvent.
     * 
     * @return reason
     */
    public com.vmware.vim25.LocalizedMethodFault getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this VmDeployFailedEvent.
     * 
     * @param reason
     */
    public void setReason(com.vmware.vim25.LocalizedMethodFault reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmDeployFailedEvent)) return false;
        VmDeployFailedEvent other = (VmDeployFailedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.destDatastore==null && other.getDestDatastore()==null) || 
             (this.destDatastore!=null &&
              this.destDatastore.equals(other.getDestDatastore()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
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
        if (getDestDatastore() != null) {
            _hashCode += getDestDatastore().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmDeployFailedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmDeployFailedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destDatastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destDatastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "EntityEventArgument"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
