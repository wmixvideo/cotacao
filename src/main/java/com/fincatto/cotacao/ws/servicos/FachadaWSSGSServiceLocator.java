/**
 * FachadaWSSGSServiceLocator.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fincatto.cotacao.ws.servicos;

public class FachadaWSSGSServiceLocator extends org.apache.axis.client.Service implements FachadaWSSGSService {

    public FachadaWSSGSServiceLocator() {
    }

    public FachadaWSSGSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FachadaWSSGSServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FachadaWSSGS
    private String FachadaWSSGS_address = "https://www3.bcb.gov.br/wssgs/services/FachadaWSSGS";

    public String getFachadaWSSGSAddress() {
        return FachadaWSSGS_address;
    }

    // The WSDD service name defaults to the port name.
    private String FachadaWSSGSWSDDServiceName = "FachadaWSSGS";

    public String getFachadaWSSGSWSDDServiceName() {
        return FachadaWSSGSWSDDServiceName;
    }

    public void setFachadaWSSGSWSDDServiceName(String name) {
        FachadaWSSGSWSDDServiceName = name;
    }

    public FachadaWSSGS getFachadaWSSGS() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FachadaWSSGS_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFachadaWSSGS(endpoint);
    }

    public FachadaWSSGS getFachadaWSSGS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            FachadaWSSGSSoapBindingStub _stub = new FachadaWSSGSSoapBindingStub(portAddress, this);
            _stub.setPortName(getFachadaWSSGSWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFachadaWSSGSEndpointAddress(String address) {
        FachadaWSSGS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (FachadaWSSGS.class.isAssignableFrom(serviceEndpointInterface)) {
                FachadaWSSGSSoapBindingStub _stub = new FachadaWSSGSSoapBindingStub(new java.net.URL(FachadaWSSGS_address), this);
                _stub.setPortName(getFachadaWSSGSWSDDServiceName());
                return _stub;
            }
        } catch (Throwable t) {
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
        String inputPortName = portName.getLocalPart();
        if ("FachadaWSSGS".equals(inputPortName)) {
            return getFachadaWSSGS();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://www3.bcb.gov.br/wssgs/services/FachadaWSSGS", "FachadaWSSGSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://www3.bcb.gov.br/wssgs/services/FachadaWSSGS", "FachadaWSSGS"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

        if ("FachadaWSSGS".equals(portName)) {
            setFachadaWSSGSEndpointAddress(address);
        } else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
