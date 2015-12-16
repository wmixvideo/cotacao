/**
 * FachadaWSSGSServiceLocator.java
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fincatto.cotacao.ws.servicos;

import java.net.URL;

public class FachadaWSSGSServiceLocator extends org.apache.axis.client.Service implements FachadaWSSGSService {

    private final String FachadaWSSGS_address = "https://www3.bcb.gov.br/wssgs/services/FachadaWSSGS";

    public FachadaWSSGSServiceLocator() {
    }

    private String getFachadaWSSGSWSDDServiceName() {
        return "FachadaWSSGS";
    }

    public FachadaWSSGS getFachadaWSSGS() throws javax.xml.rpc.ServiceException {
        try {
            return getFachadaWSSGS(new URL(FachadaWSSGS_address));
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
    }

    public FachadaWSSGS getFachadaWSSGS(java.net.URL portAddress) {
        try {
            FachadaWSSGSSoapBindingStub stub = new FachadaWSSGSSoapBindingStub(portAddress, this);
            stub.setPortName(getFachadaWSSGSWSDDServiceName());
            return stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
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
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface.getName()));
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
}
