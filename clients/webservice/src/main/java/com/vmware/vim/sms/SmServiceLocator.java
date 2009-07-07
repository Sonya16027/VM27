/**
 * SmServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class SmServiceLocator extends org.apache.axis.client.Service implements com.vmware.vim.sms.SmService {

    public SmServiceLocator() {
    }


    public SmServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SmServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for smPort
    private java.lang.String smPort_address = "http://localhost/sms/services/smService";

    public java.lang.String getsmPortAddress() {
        return smPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String smPortWSDDServiceName = "smPort";

    public java.lang.String getsmPortWSDDServiceName() {
        return smPortWSDDServiceName;
    }

    public void setsmPortWSDDServiceName(java.lang.String name) {
        smPortWSDDServiceName = name;
    }

    public com.vmware.vim.sms.SmPortType getsmPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(smPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsmPort(endpoint);
    }

    public com.vmware.vim.sms.SmPortType getsmPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.vmware.vim.sms.SmBindingStub _stub = new com.vmware.vim.sms.SmBindingStub(portAddress, this);
            _stub.setPortName(getsmPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsmPortEndpointAddress(java.lang.String address) {
        smPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.vmware.vim.sms.SmPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.vmware.vim.sms.SmBindingStub _stub = new com.vmware.vim.sms.SmBindingStub(new java.net.URL(smPort_address), this);
                _stub.setPortName(getsmPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("smPort".equals(inputPortName)) {
            return getsmPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sm1Service", "smService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sm1Service", "smPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("smPort".equals(portName)) {
            setsmPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
