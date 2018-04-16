package com.fincatto.cotacao.ws.servicos;

import com.fincatto.cotacao.ws.comum.WSSerieVO;

import javax.xml.rpc.ServiceException;

public class FachadaWSSGSProxy implements FachadaWSSGS {

    private FachadaWSSGS fachadaWSSGS = null;

    public FachadaWSSGSProxy() throws ServiceException {
        fachadaWSSGS = new FachadaWSSGSServiceLocator().getFachadaWSSGS();
    }

    public WSSerieVO[] getValoresSeriesVO(long[] in0, String in1, String in2) throws java.rmi.RemoteException {
        return fachadaWSSGS.getValoresSeriesVO(in0, in1, in2);
    }

    public WSSerieVO getUltimosValoresSerieVO(long in0, long in1) throws java.rmi.RemoteException {
        return fachadaWSSGS.getUltimosValoresSerieVO(in0, in1);
    }

    public String getValoresSeriesXML(long[] in0, String in1, String in2) throws java.rmi.RemoteException {
        return fachadaWSSGS.getValoresSeriesXML(in0, in1, in2);
    }

    public WSSerieVO getUltimoValorVO(long in0) throws java.rmi.RemoteException {
        return fachadaWSSGS.getUltimoValorVO(in0);
    }

    public String getUltimoValorXML(long in0) throws java.rmi.RemoteException {
        return fachadaWSSGS.getUltimoValorXML(in0);
    }

    public java.math.BigDecimal getValor(long in0, String in1) throws java.rmi.RemoteException {
        return fachadaWSSGS.getValor(in0, in1);
    }

    public java.math.BigDecimal getValorEspecial(long in0, String in1, String in2) throws java.rmi.RemoteException {
        return fachadaWSSGS.getValorEspecial(in0, in1, in2);
    }
}