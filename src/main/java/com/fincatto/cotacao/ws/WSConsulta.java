package com.fincatto.cotacao.ws;

import com.fincatto.cotacao.classes.Cotacao;
import com.fincatto.cotacao.classes.Indice;
import com.fincatto.cotacao.ws.comum.WSValorSerieVO;
import com.fincatto.cotacao.ws.servicos.FachadaWSSGS;
import com.fincatto.cotacao.ws.servicos.FachadaWSSGSProxy;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.SortedSet;
import java.util.TreeSet;

public class WSConsulta {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final FachadaWSSGS FACHADA = new FachadaWSSGSProxy();

    public Cotacao getCotacao(final Indice indice, final LocalDate data) {
        try {
            final BigDecimal valor = FACHADA.getValor(indice.getCodigo(), FORMATTER.format(data));
            return new Cotacao(data, indice, valor);
        } catch (RemoteException e) {
            return null;
        }
    }

    public SortedSet<Cotacao> getCotacao(final Indice indice, final LocalDate dataInicio, final LocalDate dataFim) throws RemoteException {
        final SortedSet<Cotacao> cotacoes = new TreeSet<Cotacao>();
        final long[] moedas = {indice.getCodigo()};
        for (WSValorSerieVO valorSerieVO : FACHADA.getValoresSeriesVO(moedas, FORMATTER.format(dataInicio), FORMATTER.format(dataFim))[0].getValores()) {
            final LocalDate data = LocalDate.of(valorSerieVO.getAno(), valorSerieVO.getMes(), valorSerieVO.getDia());
            cotacoes.add(new Cotacao(data, indice, valorSerieVO.getValor()));
        }
        return cotacoes;
    }
}
