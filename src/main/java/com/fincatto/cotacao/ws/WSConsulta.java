package com.fincatto.cotacao.ws;

import com.fincatto.cotacao.classes.Cotacao;
import com.fincatto.cotacao.classes.Moeda;
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

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final FachadaWSSGS FACHADA = new FachadaWSSGSProxy();

    public Cotacao getCotacao(final Moeda moeda, final LocalDate data) {
        try {
            final BigDecimal valor = FACHADA.getValor(moeda.getCodigo(), FORMATTER.format(data));
            return new Cotacao(data, moeda, valor);
        } catch (RemoteException e) {
            return null;
        }
    }

    public List<Cotacao> getCotacao(final Moeda moeda, final LocalDate dataInicio, final LocalDate dataFim) {
        try {
            final long[] moedas = {moeda.getCodigo()};
            final List<Cotacao> cotacoes = new ArrayList<>();
            for (WSValorSerieVO valorSerieVO : FACHADA.getValoresSeriesVO(moedas, FORMATTER.format(dataInicio), FORMATTER.format(dataFim))[0].getValores()) {
                final LocalDate data = LocalDate.of(valorSerieVO.getAno(), valorSerieVO.getMes(), valorSerieVO.getDia());
                cotacoes.add(new Cotacao(data, moeda, valorSerieVO.getValor()));
            }
            return cotacoes;
        } catch (RemoteException e) {
            return Collections.EMPTY_LIST;
        }
    }
}
