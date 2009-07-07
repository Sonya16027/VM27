/**
 * ClusterDasFailoverLevelAdvancedRuntimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ClusterDasFailoverLevelAdvancedRuntimeInfo  extends com.vmware.vim25.ClusterDasAdvancedRuntimeInfo  implements java.io.Serializable {
    private com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo slotInfo;

    private int totalSlots;

    private int usedSlots;

    private int unreservedSlots;

    private int totalVms;

    private int totalHosts;

    private int totalGoodHosts;

    private com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[] hostSlots;

    public ClusterDasFailoverLevelAdvancedRuntimeInfo() {
    }

    public ClusterDasFailoverLevelAdvancedRuntimeInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.ClusterDasHostInfo dasHostInfo,
           com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo slotInfo,
           int totalSlots,
           int usedSlots,
           int unreservedSlots,
           int totalVms,
           int totalHosts,
           int totalGoodHosts,
           com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[] hostSlots) {
        super(
            dynamicType,
            dynamicProperty,
            dasHostInfo);
        this.slotInfo = slotInfo;
        this.totalSlots = totalSlots;
        this.usedSlots = usedSlots;
        this.unreservedSlots = unreservedSlots;
        this.totalVms = totalVms;
        this.totalHosts = totalHosts;
        this.totalGoodHosts = totalGoodHosts;
        this.hostSlots = hostSlots;
    }


    /**
     * Gets the slotInfo value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @return slotInfo
     */
    public com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo getSlotInfo() {
        return slotInfo;
    }


    /**
     * Sets the slotInfo value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @param slotInfo
     */
    public void setSlotInfo(com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo slotInfo) {
        this.slotInfo = slotInfo;
    }


    /**
     * Gets the totalSlots value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @return totalSlots
     */
    public int getTotalSlots() {
        return totalSlots;
    }


    /**
     * Sets the totalSlots value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @param totalSlots
     */
    public void setTotalSlots(int totalSlots) {
        this.totalSlots = totalSlots;
    }


    /**
     * Gets the usedSlots value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @return usedSlots
     */
    public int getUsedSlots() {
        return usedSlots;
    }


    /**
     * Sets the usedSlots value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @param usedSlots
     */
    public void setUsedSlots(int usedSlots) {
        this.usedSlots = usedSlots;
    }


    /**
     * Gets the unreservedSlots value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @return unreservedSlots
     */
    public int getUnreservedSlots() {
        return unreservedSlots;
    }


    /**
     * Sets the unreservedSlots value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @param unreservedSlots
     */
    public void setUnreservedSlots(int unreservedSlots) {
        this.unreservedSlots = unreservedSlots;
    }


    /**
     * Gets the totalVms value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @return totalVms
     */
    public int getTotalVms() {
        return totalVms;
    }


    /**
     * Sets the totalVms value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @param totalVms
     */
    public void setTotalVms(int totalVms) {
        this.totalVms = totalVms;
    }


    /**
     * Gets the totalHosts value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @return totalHosts
     */
    public int getTotalHosts() {
        return totalHosts;
    }


    /**
     * Sets the totalHosts value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @param totalHosts
     */
    public void setTotalHosts(int totalHosts) {
        this.totalHosts = totalHosts;
    }


    /**
     * Gets the totalGoodHosts value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @return totalGoodHosts
     */
    public int getTotalGoodHosts() {
        return totalGoodHosts;
    }


    /**
     * Sets the totalGoodHosts value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @param totalGoodHosts
     */
    public void setTotalGoodHosts(int totalGoodHosts) {
        this.totalGoodHosts = totalGoodHosts;
    }


    /**
     * Gets the hostSlots value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @return hostSlots
     */
    public com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[] getHostSlots() {
        return hostSlots;
    }


    /**
     * Sets the hostSlots value for this ClusterDasFailoverLevelAdvancedRuntimeInfo.
     * 
     * @param hostSlots
     */
    public void setHostSlots(com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots[] hostSlots) {
        this.hostSlots = hostSlots;
    }

    public com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots getHostSlots(int i) {
        return this.hostSlots[i];
    }

    public void setHostSlots(int i, com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots _value) {
        this.hostSlots[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterDasFailoverLevelAdvancedRuntimeInfo)) return false;
        ClusterDasFailoverLevelAdvancedRuntimeInfo other = (ClusterDasFailoverLevelAdvancedRuntimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.slotInfo==null && other.getSlotInfo()==null) || 
             (this.slotInfo!=null &&
              this.slotInfo.equals(other.getSlotInfo()))) &&
            this.totalSlots == other.getTotalSlots() &&
            this.usedSlots == other.getUsedSlots() &&
            this.unreservedSlots == other.getUnreservedSlots() &&
            this.totalVms == other.getTotalVms() &&
            this.totalHosts == other.getTotalHosts() &&
            this.totalGoodHosts == other.getTotalGoodHosts() &&
            ((this.hostSlots==null && other.getHostSlots()==null) || 
             (this.hostSlots!=null &&
              java.util.Arrays.equals(this.hostSlots, other.getHostSlots())));
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
        if (getSlotInfo() != null) {
            _hashCode += getSlotInfo().hashCode();
        }
        _hashCode += getTotalSlots();
        _hashCode += getUsedSlots();
        _hashCode += getUnreservedSlots();
        _hashCode += getTotalVms();
        _hashCode += getTotalHosts();
        _hashCode += getTotalGoodHosts();
        if (getHostSlots() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHostSlots());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHostSlots(), i);
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
        new org.apache.axis.description.TypeDesc(ClusterDasFailoverLevelAdvancedRuntimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasFailoverLevelAdvancedRuntimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slotInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "slotInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSlots");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "totalSlots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedSlots");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "usedSlots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unreservedSlots");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "unreservedSlots"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalVms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "totalVms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalHosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "totalHosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalGoodHosts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "totalGoodHosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostSlots");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostSlots"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ClusterDasFailoverLevelAdvancedRuntimeInfoHostSlots"));
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
