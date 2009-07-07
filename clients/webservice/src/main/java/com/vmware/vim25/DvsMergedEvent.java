/**
 * DvsMergedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DvsMergedEvent  extends com.vmware.vim25.DvsEvent  implements java.io.Serializable {
    private com.vmware.vim25.DvsEventArgument sourceDvs;

    private com.vmware.vim25.DvsEventArgument destinationDvs;

    public DvsMergedEvent() {
    }

    public DvsMergedEvent(
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
           com.vmware.vim25.DvsEventArgument sourceDvs,
           com.vmware.vim25.DvsEventArgument destinationDvs) {
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
            changeTag);
        this.sourceDvs = sourceDvs;
        this.destinationDvs = destinationDvs;
    }


    /**
     * Gets the sourceDvs value for this DvsMergedEvent.
     * 
     * @return sourceDvs
     */
    public com.vmware.vim25.DvsEventArgument getSourceDvs() {
        return sourceDvs;
    }


    /**
     * Sets the sourceDvs value for this DvsMergedEvent.
     * 
     * @param sourceDvs
     */
    public void setSourceDvs(com.vmware.vim25.DvsEventArgument sourceDvs) {
        this.sourceDvs = sourceDvs;
    }


    /**
     * Gets the destinationDvs value for this DvsMergedEvent.
     * 
     * @return destinationDvs
     */
    public com.vmware.vim25.DvsEventArgument getDestinationDvs() {
        return destinationDvs;
    }


    /**
     * Sets the destinationDvs value for this DvsMergedEvent.
     * 
     * @param destinationDvs
     */
    public void setDestinationDvs(com.vmware.vim25.DvsEventArgument destinationDvs) {
        this.destinationDvs = destinationDvs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DvsMergedEvent)) return false;
        DvsMergedEvent other = (DvsMergedEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sourceDvs==null && other.getSourceDvs()==null) || 
             (this.sourceDvs!=null &&
              this.sourceDvs.equals(other.getSourceDvs()))) &&
            ((this.destinationDvs==null && other.getDestinationDvs()==null) || 
             (this.destinationDvs!=null &&
              this.destinationDvs.equals(other.getDestinationDvs())));
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
        if (getSourceDvs() != null) {
            _hashCode += getSourceDvs().hashCode();
        }
        if (getDestinationDvs() != null) {
            _hashCode += getDestinationDvs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DvsMergedEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsMergedEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDvs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sourceDvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsEventArgument"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationDvs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "destinationDvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DvsEventArgument"));
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
