/**
 * VimServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VimServiceLocator extends org.apache.axis.client.Service implements
		com.vmware.vim25.VimService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VimServiceLocator() {
	}

	public VimServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public VimServiceLocator(java.lang.String wsdlLoc,
			javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for VimPort
	private java.lang.String VimPort_address = "https://localhost/sdk/vimService";

	public java.lang.String getVimPortAddress() {
		return VimPort_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String VimPortWSDDServiceName = "VimPort";

	public java.lang.String getVimPortWSDDServiceName() {
		return VimPortWSDDServiceName;
	}

	public void setVimPortWSDDServiceName(java.lang.String name) {
		VimPortWSDDServiceName = name;
	}

	public com.vmware.vim25.VimPortType getVimPort()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(VimPort_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getVimPort(endpoint);
	}

	public com.vmware.vim25.VimPortType getVimPort(java.net.URL portAddress)
			throws javax.xml.rpc.ServiceException {
		try {
			com.vmware.vim25.VimBindingStub _stub = new com.vmware.vim25.VimBindingStub(
					portAddress, this);
			_stub.setPortName(getVimPortWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setVimPortEndpointAddress(java.lang.String address) {
		VimPort_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	@Override
	public java.rmi.Remote getPort(Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		try {
			if (com.vmware.vim25.VimPortType.class
					.isAssignableFrom(serviceEndpointInterface)) {
				com.vmware.vim25.VimBindingStub _stub = new com.vmware.vim25.VimBindingStub(
						new java.net.URL(VimPort_address), this);
				_stub.setPortName(getVimPortWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException(
				"There is no stub implementation for the interface:  "
						+ (serviceEndpointInterface == null ? "null"
								: serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	@Override
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName,
			Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("VimPort".equals(inputPortName)) {
			return getVimPort();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	@Override
	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("urn:vim25Service", "VimService");
	}

	private java.util.HashSet ports = null;

	@Override
	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("urn:vim25Service",
					"VimPort"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("VimPort".equals(portName)) {
			setVimPortEndpointAddress(address);
		} else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(
					" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName,
			java.lang.String address) throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
