/**
 * VmFaultToleranceStateChangedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmFaultToleranceStateChangedEvent  extends com.vmware.vim25.VmEvent  implements java.io.Serializable {
    private com.vmware.vim25.VirtualMachineFaultToleranceState oldState;

    private com.vmware.vim25.VirtualMachineFaultToleranceState newState;

    public VmFaultToleranceStateChangedEvent() {
    }

    public VmFaultToleranceStateChangedEvent(
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
           com.vmware.vim25.VirtualMachineFaultToleranceState oldState,
           com.vmware.vim25.VirtualMachineFaultToleranceState newState) {
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
        this.oldState = oldState;
        this.newState = newState;
    }


    /**
     * Gets the oldState value for this VmFaultToleranceStateChangedEvent.
     * 
     * @return oldState
     */
    public com.vmware.vim25.VirtualMachineFaultToleranceState getOldState() {
        return oldState;
    }


    /**
     * Sets the oldState value for this VmFaultToleranceStateChangedEvent.
     * 
     * @param oldState
     */
    public void setOldState(com.vmware.vim25.VirtualMachineFaultToleranceState oldState) {
        this.oldState = oldState;
    }


    /**
     * Gets the newState value for this VmFaultToleranceStateChangedEvent.
     * 
     * @return newState
     */
    public com.vmware.vim25.VirtualMachineFaultToleranceState getNewState() {
        return newState;
    }


    /**
     * Sets the newState value for this VmFaultToleranceStateChangedEvent.
     * 
     * @param newState
     */
    public void setNewState(com.vmware.vim25.VirtualMachineFaultToleranceState newState) {
        this.newState = newState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmFaultToleranceStateChangedEvent)) return false;
        VmFaultToleranceStateChangedEvent other = (VmFaultToleranceStateChangedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.oldState==null && other.getOldState()==null) || 
             (this.oldState!=null &&
              this.oldState.equals(other.getOldState()))) &&
            ((this.newState==null && other.getNewState()==null) || 
             (this.newState!=null &&
              this.newState.equals(other.getNewState())));
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
        if (getOldState() != null) {
            _hashCode += getOldState().hashCode();
        }
        if (getNewState() != null) {
            _hashCode += getNewState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VmFaultToleranceStateChangedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VmFaultToleranceStateChangedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "oldState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFaultToleranceState"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "newState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFaultToleranceState"));
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
