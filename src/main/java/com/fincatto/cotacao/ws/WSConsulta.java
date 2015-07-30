package com.fincatto.cotacao.ws;

import com.fincatto.cotacao.modelo.Cotacao;
import com.fincatto.cotacao.modelo.Moeda;
import com.fincatto.cotacao.ws.comum.WSValorSerieVO;
import com.fincatto.cotacao.ws.servicos.FachadaWSSGS;
import com.fincatto.cotacao.ws.servicos.FachadaWSSGSProxy;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WSConsulta {

    private static final String DATE_PATTERN = "dd/MM/yyyy";
    private final FachadaWSSGS fachada;

    public WSConsulta() {
        this.fachada = new FachadaWSSGSProxy();
    }

    public Cotacao getCotacao(final Moeda moeda, final LocalDate data) throws Exception {
        try {
            final BigDecimal valor = fachada.getValor(moeda.getCodigo(), DateTimeFormatter.ofPattern(DATE_PATTERN).format(data));
            return new Cotacao(data, moeda, valor);
        } catch (RemoteException e) {
            return null;
        }
    }

    public List<Cotacao> getCotacao(final Moeda moeda, final LocalDate dataInicio, final LocalDate dataFim) throws Exception {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        final long[] moedas = {moeda.getCodigo()};
        final List<Cotacao> cotacoes = new ArrayList<>();
        try {
            for (WSValorSerieVO valorSerieVO : fachada.getValoresSeriesVO(moedas, formatter.format(dataInicio), formatter.format(dataFim))[0].getValores()) {
                cotacoes.add(new Cotacao(LocalDate.of(valorSerieVO.getAno(), valorSerieVO.getMes(), valorSerieVO.getDia()), moeda, valorSerieVO.getValor()));
            }
            return cotacoes;
        } catch (RemoteException e) {
            return Collections.EMPTY_LIST;
        }

    }
}
