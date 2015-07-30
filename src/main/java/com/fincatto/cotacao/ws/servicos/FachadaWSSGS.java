/**
 * FachadaWSSGS.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fincatto.cotacao.ws.servicos;

import com.fincatto.cotacao.ws.comum.WSSerieVO;

public interface FachadaWSSGS extends java.rmi.Remote {

    public WSSerieVO[] getValoresSeriesVO(long[] in0, String in1, String in2) throws java.rmi.RemoteException;

    public WSSerieVO getUltimosValoresSerieVO(long in0, long in1) throws java.rmi.RemoteException;

    public String getValoresSeriesXML(long[] in0, String in1, String in2) throws java.rmi.RemoteException;

    public WSSerieVO getUltimoValorVO(long in0) throws java.rmi.RemoteException;

    public String getUltimoValorXML(long in0) throws java.rmi.RemoteException;

    public java.math.BigDecimal getValor(long in0, String in1) throws java.rmi.RemoteException;

    public java.math.BigDecimal getValorEspecial(long in0, String in1, String in2) throws java.rmi.RemoteException;
}
