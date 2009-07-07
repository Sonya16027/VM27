/**
 * GuestInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class GuestInfo  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private com.vmware.vim25.VirtualMachineToolsStatus toolsStatus;

    private java.lang.String toolsVersionStatus;

    private java.lang.String toolsRunningStatus;

    private java.lang.String toolsVersion;

    private java.lang.String guestId;

    private java.lang.String guestFamily;

    private java.lang.String guestFullName;

    private java.lang.String hostName;

    private java.lang.String ipAddress;

    private com.vmware.vim25.GuestNicInfo[] net;

    private com.vmware.vim25.GuestDiskInfo[] disk;

    private com.vmware.vim25.GuestScreenInfo screen;

    private java.lang.String guestState;

    public GuestInfo() {
    }

    public GuestInfo(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           com.vmware.vim25.VirtualMachineToolsStatus toolsStatus,
           java.lang.String toolsVersionStatus,
           java.lang.String toolsRunningStatus,
           java.lang.String toolsVersion,
           java.lang.String guestId,
           java.lang.String guestFamily,
           java.lang.String guestFullName,
           java.lang.String hostName,
           java.lang.String ipAddress,
           com.vmware.vim25.GuestNicInfo[] net,
           com.vmware.vim25.GuestDiskInfo[] disk,
           com.vmware.vim25.GuestScreenInfo screen,
           java.lang.String guestState) {
        super(
            dynamicType,
            dynamicProperty);
        this.toolsStatus = toolsStatus;
        this.toolsVersionStatus = toolsVersionStatus;
        this.toolsRunningStatus = toolsRunningStatus;
        this.toolsVersion = toolsVersion;
        this.guestId = guestId;
        this.guestFamily = guestFamily;
        this.guestFullName = guestFullName;
        this.hostName = hostName;
        this.ipAddress = ipAddress;
        this.net = net;
        this.disk = disk;
        this.screen = screen;
        this.guestState = guestState;
    }


    /**
     * Gets the toolsStatus value for this GuestInfo.
     * 
     * @return toolsStatus
     */
    public com.vmware.vim25.VirtualMachineToolsStatus getToolsStatus() {
        return toolsStatus;
    }


    /**
     * Sets the toolsStatus value for this GuestInfo.
     * 
     * @param toolsStatus
     */
    public void setToolsStatus(com.vmware.vim25.VirtualMachineToolsStatus toolsStatus) {
        this.toolsStatus = toolsStatus;
    }


    /**
     * Gets the toolsVersionStatus value for this GuestInfo.
     * 
     * @return toolsVersionStatus
     */
    public java.lang.String getToolsVersionStatus() {
        return toolsVersionStatus;
    }


    /**
     * Sets the toolsVersionStatus value for this GuestInfo.
     * 
     * @param toolsVersionStatus
     */
    public void setToolsVersionStatus(java.lang.String toolsVersionStatus) {
        this.toolsVersionStatus = toolsVersionStatus;
    }


    /**
     * Gets the toolsRunningStatus value for this GuestInfo.
     * 
     * @return toolsRunningStatus
     */
    public java.lang.String getToolsRunningStatus() {
        return toolsRunningStatus;
    }


    /**
     * Sets the toolsRunningStatus value for this GuestInfo.
     * 
     * @param toolsRunningStatus
     */
    public void setToolsRunningStatus(java.lang.String toolsRunningStatus) {
        this.toolsRunningStatus = toolsRunningStatus;
    }


    /**
     * Gets the toolsVersion value for this GuestInfo.
     * 
     * @return toolsVersion
     */
    public java.lang.String getToolsVersion() {
        return toolsVersion;
    }


    /**
     * Sets the toolsVersion value for this GuestInfo.
     * 
     * @param toolsVersion
     */
    public void setToolsVersion(java.lang.String toolsVersion) {
        this.toolsVersion = toolsVersion;
    }


    /**
     * Gets the guestId value for this GuestInfo.
     * 
     * @return guestId
     */
    public java.lang.String getGuestId() {
        return guestId;
    }


    /**
     * Sets the guestId value for this GuestInfo.
     * 
     * @param guestId
     */
    public void setGuestId(java.lang.String guestId) {
        this.guestId = guestId;
    }


    /**
     * Gets the guestFamily value for this GuestInfo.
     * 
     * @return guestFamily
     */
    public java.lang.String getGuestFamily() {
        return guestFamily;
    }


    /**
     * Sets the guestFamily value for this GuestInfo.
     * 
     * @param guestFamily
     */
    public void setGuestFamily(java.lang.String guestFamily) {
        this.guestFamily = guestFamily;
    }


    /**
     * Gets the guestFullName value for this GuestInfo.
     * 
     * @return guestFullName
     */
    public java.lang.String getGuestFullName() {
        return guestFullName;
    }


    /**
     * Sets the guestFullName value for this GuestInfo.
     * 
     * @param guestFullName
     */
    public void setGuestFullName(java.lang.String guestFullName) {
        this.guestFullName = guestFullName;
    }


    /**
     * Gets the hostName value for this GuestInfo.
     * 
     * @return hostName
     */
    public java.lang.String getHostName() {
        return hostName;
    }


    /**
     * Sets the hostName value for this GuestInfo.
     * 
     * @param hostName
     */
    public void setHostName(java.lang.String hostName) {
        this.hostName = hostName;
    }


    /**
     * Gets the ipAddress value for this GuestInfo.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this GuestInfo.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the net value for this GuestInfo.
     * 
     * @return net
     */
    public com.vmware.vim25.GuestNicInfo[] getNet() {
        return net;
    }


    /**
     * Sets the net value for this GuestInfo.
     * 
     * @param net
     */
    public void setNet(com.vmware.vim25.GuestNicInfo[] net) {
        this.net = net;
    }

    public com.vmware.vim25.GuestNicInfo getNet(int i) {
        return this.net[i];
    }

    public void setNet(int i, com.vmware.vim25.GuestNicInfo _value) {
        this.net[i] = _value;
    }


    /**
     * Gets the disk value for this GuestInfo.
     * 
     * @return disk
     */
    public com.vmware.vim25.GuestDiskInfo[] getDisk() {
        return disk;
    }


    /**
     * Sets the disk value for this GuestInfo.
     * 
     * @param disk
     */
    public void setDisk(com.vmware.vim25.GuestDiskInfo[] disk) {
        this.disk = disk;
    }

    public com.vmware.vim25.GuestDiskInfo getDisk(int i) {
        return this.disk[i];
    }

    public void setDisk(int i, com.vmware.vim25.GuestDiskInfo _value) {
        this.disk[i] = _value;
    }


    /**
     * Gets the screen value for this GuestInfo.
     * 
     * @return screen
     */
    public com.vmware.vim25.GuestScreenInfo getScreen() {
        return screen;
    }


    /**
     * Sets the screen value for this GuestInfo.
     * 
     * @param screen
     */
    public void setScreen(com.vmware.vim25.GuestScreenInfo screen) {
        this.screen = screen;
    }


    /**
     * Gets the guestState value for this GuestInfo.
     * 
     * @return guestState
     */
    public java.lang.String getGuestState() {
        return guestState;
    }


    /**
     * Sets the guestState value for this GuestInfo.
     * 
     * @param guestState
     */
    public void setGuestState(java.lang.String guestState) {
        this.guestState = guestState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GuestInfo)) return false;
        GuestInfo other = (GuestInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.toolsStatus==null && other.getToolsStatus()==null) || 
             (this.toolsStatus!=null &&
              this.toolsStatus.equals(other.getToolsStatus()))) &&
            ((this.toolsVersionStatus==null && other.getToolsVersionStatus()==null) || 
             (this.toolsVersionStatus!=null &&
              this.toolsVersionStatus.equals(other.getToolsVersionStatus()))) &&
            ((this.toolsRunningStatus==null && other.getToolsRunningStatus()==null) || 
             (this.toolsRunningStatus!=null &&
              this.toolsRunningStatus.equals(other.getToolsRunningStatus()))) &&
            ((this.toolsVersion==null && other.getToolsVersion()==null) || 
             (this.toolsVersion!=null &&
              this.toolsVersion.equals(other.getToolsVersion()))) &&
            ((this.guestId==null && other.getGuestId()==null) || 
             (this.guestId!=null &&
              this.guestId.equals(other.getGuestId()))) &&
            ((this.guestFamily==null && other.getGuestFamily()==null) || 
             (this.guestFamily!=null &&
              this.guestFamily.equals(other.getGuestFamily()))) &&
            ((this.guestFullName==null && other.getGuestFullName()==null) || 
             (this.guestFullName!=null &&
              this.guestFullName.equals(other.getGuestFullName()))) &&
            ((this.hostName==null && other.getHostName()==null) || 
             (this.hostName!=null &&
              this.hostName.equals(other.getHostName()))) &&
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.net==null && other.getNet()==null) || 
             (this.net!=null &&
              java.util.Arrays.equals(this.net, other.getNet()))) &&
            ((this.disk==null && other.getDisk()==null) || 
             (this.disk!=null &&
              java.util.Arrays.equals(this.disk, other.getDisk()))) &&
            ((this.screen==null && other.getScreen()==null) || 
             (this.screen!=null &&
              this.screen.equals(other.getScreen()))) &&
            ((this.guestState==null && other.getGuestState()==null) || 
             (this.guestState!=null &&
              this.guestState.equals(other.getGuestState())));
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
        if (getToolsStatus() != null) {
            _hashCode += getToolsStatus().hashCode();
        }
        if (getToolsVersionStatus() != null) {
            _hashCode += getToolsVersionStatus().hashCode();
        }
        if (getToolsRunningStatus() != null) {
            _hashCode += getToolsRunningStatus().hashCode();
        }
        if (getToolsVersion() != null) {
            _hashCode += getToolsVersion().hashCode();
        }
        if (getGuestId() != null) {
            _hashCode += getGuestId().hashCode();
        }
        if (getGuestFamily() != null) {
            _hashCode += getGuestFamily().hashCode();
        }
        if (getGuestFullName() != null) {
            _hashCode += getGuestFullName().hashCode();
        }
        if (getHostName() != null) {
            _hashCode += getHostName().hashCode();
        }
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getNet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScreen() != null) {
            _hashCode += getScreen().hashCode();
        }
        if (getGuestState() != null) {
            _hashCode += getGuestState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GuestInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toolsStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "toolsStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineToolsStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toolsVersionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "toolsVersionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toolsRunningStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "toolsRunningStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toolsVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "toolsVersion"));
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
        elemField.setFieldName("guestFamily");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "guestFamily"));
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
        elemField.setFieldName("hostName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "hostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("net");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "net"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestNicInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestDiskInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("screen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "screen"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "GuestScreenInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "guestState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
