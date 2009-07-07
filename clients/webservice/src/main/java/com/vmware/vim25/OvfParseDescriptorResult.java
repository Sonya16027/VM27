/**
 * OvfParseDescriptorResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class OvfParseDescriptorResult  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private java.lang.String[] eula;

    private com.vmware.vim25.OvfNetworkInfo[] network;

    private java.lang.String[] ipAllocationScheme;

    private java.lang.String[] ipProtocols;

    private com.vmware.vim25.VAppPropertyInfo[] property;

    private com.vmware.vim25.VAppProductInfo productInfo;

    private java.lang.String annotation;

    private java.lang.Long approximateDownloadSize;

    private java.lang.Long approximateFlatDeploymentSize;

    private java.lang.Long approximateSparseDeploymentSize;

    private java.lang.String defaultEntityName;

    private boolean virtualApp;

    private com.vmware.vim25.OvfDeploymentOption[] deploymentOption;

    private java.lang.String defaultDeploymentOption;

    private com.vmware.vim25.LocalizedMethodFault[] error;

    private com.vmware.vim25.LocalizedMethodFault[] warning;

    public OvfParseDescriptorResult() {
    }

    public OvfParseDescriptorResult(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           java.lang.String[] eula,
           com.vmware.vim25.OvfNetworkInfo[] network,
           java.lang.String[] ipAllocationScheme,
           java.lang.String[] ipProtocols,
           com.vmware.vim25.VAppPropertyInfo[] property,
           com.vmware.vim25.VAppProductInfo productInfo,
           java.lang.String annotation,
           java.lang.Long approximateDownloadSize,
           java.lang.Long approximateFlatDeploymentSize,
           java.lang.Long approximateSparseDeploymentSize,
           java.lang.String defaultEntityName,
           boolean virtualApp,
           com.vmware.vim25.OvfDeploymentOption[] deploymentOption,
           java.lang.String defaultDeploymentOption,
           com.vmware.vim25.LocalizedMethodFault[] error,
           com.vmware.vim25.LocalizedMethodFault[] warning) {
        super(
            dynamicType,
            dynamicProperty);
        this.eula = eula;
        this.network = network;
        this.ipAllocationScheme = ipAllocationScheme;
        this.ipProtocols = ipProtocols;
        this.property = property;
        this.productInfo = productInfo;
        this.annotation = annotation;
        this.approximateDownloadSize = approximateDownloadSize;
        this.approximateFlatDeploymentSize = approximateFlatDeploymentSize;
        this.approximateSparseDeploymentSize = approximateSparseDeploymentSize;
        this.defaultEntityName = defaultEntityName;
        this.virtualApp = virtualApp;
        this.deploymentOption = deploymentOption;
        this.defaultDeploymentOption = defaultDeploymentOption;
        this.error = error;
        this.warning = warning;
    }


    /**
     * Gets the eula value for this OvfParseDescriptorResult.
     * 
     * @return eula
     */
    public java.lang.String[] getEula() {
        return eula;
    }


    /**
     * Sets the eula value for this OvfParseDescriptorResult.
     * 
     * @param eula
     */
    public void setEula(java.lang.String[] eula) {
        this.eula = eula;
    }

    public java.lang.String getEula(int i) {
        return this.eula[i];
    }

    public void setEula(int i, java.lang.String _value) {
        this.eula[i] = _value;
    }


    /**
     * Gets the network value for this OvfParseDescriptorResult.
     * 
     * @return network
     */
    public com.vmware.vim25.OvfNetworkInfo[] getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this OvfParseDescriptorResult.
     * 
     * @param network
     */
    public void setNetwork(com.vmware.vim25.OvfNetworkInfo[] network) {
        this.network = network;
    }

    public com.vmware.vim25.OvfNetworkInfo getNetwork(int i) {
        return this.network[i];
    }

    public void setNetwork(int i, com.vmware.vim25.OvfNetworkInfo _value) {
        this.network[i] = _value;
    }


    /**
     * Gets the ipAllocationScheme value for this OvfParseDescriptorResult.
     * 
     * @return ipAllocationScheme
     */
    public java.lang.String[] getIpAllocationScheme() {
        return ipAllocationScheme;
    }


    /**
     * Sets the ipAllocationScheme value for this OvfParseDescriptorResult.
     * 
     * @param ipAllocationScheme
     */
    public void setIpAllocationScheme(java.lang.String[] ipAllocationScheme) {
        this.ipAllocationScheme = ipAllocationScheme;
    }

    public java.lang.String getIpAllocationScheme(int i) {
        return this.ipAllocationScheme[i];
    }

    public void setIpAllocationScheme(int i, java.lang.String _value) {
        this.ipAllocationScheme[i] = _value;
    }


    /**
     * Gets the ipProtocols value for this OvfParseDescriptorResult.
     * 
     * @return ipProtocols
     */
    public java.lang.String[] getIpProtocols() {
        return ipProtocols;
    }


    /**
     * Sets the ipProtocols value for this OvfParseDescriptorResult.
     * 
     * @param ipProtocols
     */
    public void setIpProtocols(java.lang.String[] ipProtocols) {
        this.ipProtocols = ipProtocols;
    }

    public java.lang.String getIpProtocols(int i) {
        return this.ipProtocols[i];
    }

    public void setIpProtocols(int i, java.lang.String _value) {
        this.ipProtocols[i] = _value;
    }


    /**
     * Gets the property value for this OvfParseDescriptorResult.
     * 
     * @return property
     */
    public com.vmware.vim25.VAppPropertyInfo[] getProperty() {
        return property;
    }


    /**
     * Sets the property value for this OvfParseDescriptorResult.
     * 
     * @param property
     */
    public void setProperty(com.vmware.vim25.VAppPropertyInfo[] property) {
        this.property = property;
    }

    public com.vmware.vim25.VAppPropertyInfo getProperty(int i) {
        return this.property[i];
    }

    public void setProperty(int i, com.vmware.vim25.VAppPropertyInfo _value) {
        this.property[i] = _value;
    }


    /**
     * Gets the productInfo value for this OvfParseDescriptorResult.
     * 
     * @return productInfo
     */
    public com.vmware.vim25.VAppProductInfo getProductInfo() {
        return productInfo;
    }


    /**
     * Sets the productInfo value for this OvfParseDescriptorResult.
     * 
     * @param productInfo
     */
    public void setProductInfo(com.vmware.vim25.VAppProductInfo productInfo) {
        this.productInfo = productInfo;
    }


    /**
     * Gets the annotation value for this OvfParseDescriptorResult.
     * 
     * @return annotation
     */
    public java.lang.String getAnnotation() {
        return annotation;
    }


    /**
     * Sets the annotation value for this OvfParseDescriptorResult.
     * 
     * @param annotation
     */
    public void setAnnotation(java.lang.String annotation) {
        this.annotation = annotation;
    }


    /**
     * Gets the approximateDownloadSize value for this OvfParseDescriptorResult.
     * 
     * @return approximateDownloadSize
     */
    public java.lang.Long getApproximateDownloadSize() {
        return approximateDownloadSize;
    }


    /**
     * Sets the approximateDownloadSize value for this OvfParseDescriptorResult.
     * 
     * @param approximateDownloadSize
     */
    public void setApproximateDownloadSize(java.lang.Long approximateDownloadSize) {
        this.approximateDownloadSize = approximateDownloadSize;
    }


    /**
     * Gets the approximateFlatDeploymentSize value for this OvfParseDescriptorResult.
     * 
     * @return approximateFlatDeploymentSize
     */
    public java.lang.Long getApproximateFlatDeploymentSize() {
        return approximateFlatDeploymentSize;
    }


    /**
     * Sets the approximateFlatDeploymentSize value for this OvfParseDescriptorResult.
     * 
     * @param approximateFlatDeploymentSize
     */
    public void setApproximateFlatDeploymentSize(java.lang.Long approximateFlatDeploymentSize) {
        this.approximateFlatDeploymentSize = approximateFlatDeploymentSize;
    }


    /**
     * Gets the approximateSparseDeploymentSize value for this OvfParseDescriptorResult.
     * 
     * @return approximateSparseDeploymentSize
     */
    public java.lang.Long getApproximateSparseDeploymentSize() {
        return approximateSparseDeploymentSize;
    }


    /**
     * Sets the approximateSparseDeploymentSize value for this OvfParseDescriptorResult.
     * 
     * @param approximateSparseDeploymentSize
     */
    public void setApproximateSparseDeploymentSize(java.lang.Long approximateSparseDeploymentSize) {
        this.approximateSparseDeploymentSize = approximateSparseDeploymentSize;
    }


    /**
     * Gets the defaultEntityName value for this OvfParseDescriptorResult.
     * 
     * @return defaultEntityName
     */
    public java.lang.String getDefaultEntityName() {
        return defaultEntityName;
    }


    /**
     * Sets the defaultEntityName value for this OvfParseDescriptorResult.
     * 
     * @param defaultEntityName
     */
    public void setDefaultEntityName(java.lang.String defaultEntityName) {
        this.defaultEntityName = defaultEntityName;
    }


    /**
     * Gets the virtualApp value for this OvfParseDescriptorResult.
     * 
     * @return virtualApp
     */
    public boolean isVirtualApp() {
        return virtualApp;
    }


    /**
     * Sets the virtualApp value for this OvfParseDescriptorResult.
     * 
     * @param virtualApp
     */
    public void setVirtualApp(boolean virtualApp) {
        this.virtualApp = virtualApp;
    }


    /**
     * Gets the deploymentOption value for this OvfParseDescriptorResult.
     * 
     * @return deploymentOption
     */
    public com.vmware.vim25.OvfDeploymentOption[] getDeploymentOption() {
        return deploymentOption;
    }


    /**
     * Sets the deploymentOption value for this OvfParseDescriptorResult.
     * 
     * @param deploymentOption
     */
    public void setDeploymentOption(com.vmware.vim25.OvfDeploymentOption[] deploymentOption) {
        this.deploymentOption = deploymentOption;
    }

    public com.vmware.vim25.OvfDeploymentOption getDeploymentOption(int i) {
        return this.deploymentOption[i];
    }

    public void setDeploymentOption(int i, com.vmware.vim25.OvfDeploymentOption _value) {
        this.deploymentOption[i] = _value;
    }


    /**
     * Gets the defaultDeploymentOption value for this OvfParseDescriptorResult.
     * 
     * @return defaultDeploymentOption
     */
    public java.lang.String getDefaultDeploymentOption() {
        return defaultDeploymentOption;
    }


    /**
     * Sets the defaultDeploymentOption value for this OvfParseDescriptorResult.
     * 
     * @param defaultDeploymentOption
     */
    public void setDefaultDeploymentOption(java.lang.String defaultDeploymentOption) {
        this.defaultDeploymentOption = defaultDeploymentOption;
    }


    /**
     * Gets the error value for this OvfParseDescriptorResult.
     * 
     * @return error
     */
    public com.vmware.vim25.LocalizedMethodFault[] getError() {
        return error;
    }


    /**
     * Sets the error value for this OvfParseDescriptorResult.
     * 
     * @param error
     */
    public void setError(com.vmware.vim25.LocalizedMethodFault[] error) {
        this.error = error;
    }

    public com.vmware.vim25.LocalizedMethodFault getError(int i) {
        return this.error[i];
    }

    public void setError(int i, com.vmware.vim25.LocalizedMethodFault _value) {
        this.error[i] = _value;
    }


    /**
     * Gets the warning value for this OvfParseDescriptorResult.
     * 
     * @return warning
     */
    public com.vmware.vim25.LocalizedMethodFault[] getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this OvfParseDescriptorResult.
     * 
     * @param warning
     */
    public void setWarning(com.vmware.vim25.LocalizedMethodFault[] warning) {
        this.warning = warning;
    }

    public com.vmware.vim25.LocalizedMethodFault getWarning(int i) {
        return this.warning[i];
    }

    public void setWarning(int i, com.vmware.vim25.LocalizedMethodFault _value) {
        this.warning[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OvfParseDescriptorResult)) return false;
        OvfParseDescriptorResult other = (OvfParseDescriptorResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eula==null && other.getEula()==null) || 
             (this.eula!=null &&
              java.util.Arrays.equals(this.eula, other.getEula()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              java.util.Arrays.equals(this.network, other.getNetwork()))) &&
            ((this.ipAllocationScheme==null && other.getIpAllocationScheme()==null) || 
             (this.ipAllocationScheme!=null &&
              java.util.Arrays.equals(this.ipAllocationScheme, other.getIpAllocationScheme()))) &&
            ((this.ipProtocols==null && other.getIpProtocols()==null) || 
             (this.ipProtocols!=null &&
              java.util.Arrays.equals(this.ipProtocols, other.getIpProtocols()))) &&
            ((this.property==null && other.getProperty()==null) || 
             (this.property!=null &&
              java.util.Arrays.equals(this.property, other.getProperty()))) &&
            ((this.productInfo==null && other.getProductInfo()==null) || 
             (this.productInfo!=null &&
              this.productInfo.equals(other.getProductInfo()))) &&
            ((this.annotation==null && other.getAnnotation()==null) || 
             (this.annotation!=null &&
              this.annotation.equals(other.getAnnotation()))) &&
            ((this.approximateDownloadSize==null && other.getApproximateDownloadSize()==null) || 
             (this.approximateDownloadSize!=null &&
              this.approximateDownloadSize.equals(other.getApproximateDownloadSize()))) &&
            ((this.approximateFlatDeploymentSize==null && other.getApproximateFlatDeploymentSize()==null) || 
             (this.approximateFlatDeploymentSize!=null &&
              this.approximateFlatDeploymentSize.equals(other.getApproximateFlatDeploymentSize()))) &&
            ((this.approximateSparseDeploymentSize==null && other.getApproximateSparseDeploymentSize()==null) || 
             (this.approximateSparseDeploymentSize!=null &&
              this.approximateSparseDeploymentSize.equals(other.getApproximateSparseDeploymentSize()))) &&
            ((this.defaultEntityName==null && other.getDefaultEntityName()==null) || 
             (this.defaultEntityName!=null &&
              this.defaultEntityName.equals(other.getDefaultEntityName()))) &&
            this.virtualApp == other.isVirtualApp() &&
            ((this.deploymentOption==null && other.getDeploymentOption()==null) || 
             (this.deploymentOption!=null &&
              java.util.Arrays.equals(this.deploymentOption, other.getDeploymentOption()))) &&
            ((this.defaultDeploymentOption==null && other.getDefaultDeploymentOption()==null) || 
             (this.defaultDeploymentOption!=null &&
              this.defaultDeploymentOption.equals(other.getDefaultDeploymentOption()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              java.util.Arrays.equals(this.error, other.getError()))) &&
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              java.util.Arrays.equals(this.warning, other.getWarning())));
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
        if (getEula() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEula());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEula(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetwork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetwork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetwork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpAllocationScheme() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpAllocationScheme());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpAllocationScheme(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpProtocols() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpProtocols());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpProtocols(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProperty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductInfo() != null) {
            _hashCode += getProductInfo().hashCode();
        }
        if (getAnnotation() != null) {
            _hashCode += getAnnotation().hashCode();
        }
        if (getApproximateDownloadSize() != null) {
            _hashCode += getApproximateDownloadSize().hashCode();
        }
        if (getApproximateFlatDeploymentSize() != null) {
            _hashCode += getApproximateFlatDeploymentSize().hashCode();
        }
        if (getApproximateSparseDeploymentSize() != null) {
            _hashCode += getApproximateSparseDeploymentSize().hashCode();
        }
        if (getDefaultEntityName() != null) {
            _hashCode += getDefaultEntityName().hashCode();
        }
        _hashCode += (isVirtualApp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDeploymentOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeploymentOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeploymentOption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultDeploymentOption() != null) {
            _hashCode += getDefaultDeploymentOption().hashCode();
        }
        if (getError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getError(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWarning() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWarning());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWarning(), i);
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
        new org.apache.axis.description.TypeDesc(OvfParseDescriptorResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfParseDescriptorResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eula");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "eula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfNetworkInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAllocationScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipAllocationScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipProtocols");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ipProtocols"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "property"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppPropertyInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "productInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VAppProductInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annotation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "annotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approximateDownloadSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "approximateDownloadSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approximateFlatDeploymentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "approximateFlatDeploymentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approximateSparseDeploymentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "approximateSparseDeploymentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultEntityName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultEntityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualApp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "virtualApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deploymentOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "deploymentOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "OvfDeploymentOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultDeploymentOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "defaultDeploymentOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "warning"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "LocalizedMethodFault"));
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
