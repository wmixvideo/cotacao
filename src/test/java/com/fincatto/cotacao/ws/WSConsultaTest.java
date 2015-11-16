package com.fincatto.cotacao.ws;

import com.fincatto.cotacao.classes.Cotacao;
import com.fincatto.cotacao.classes.Moeda;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WSConsultaTest {

    @Test
    public void testDeveRetornarACotacaoPorData() {
        final LocalDate data = LocalDate.of(2015, 7, 27);
        final Cotacao cotacaoEsperada = new Cotacao(data, Moeda.DOLAR_VENDA, new BigDecimal("3.3557"));
        Assert.assertEquals(cotacaoEsperada, new WSConsulta().getCotacao(Moeda.DOLAR_VENDA, data));
    }

    @Test
    public void testDeveRetornarAsCotacoesPorPeriodo() {
        final List<Cotacao> cotacoesEsperadas = new ArrayList<>();
        cotacoesEsperadas.add(new Cotacao(LocalDate.of(2015, 7, 13), Moeda.EURO_COMPRA, new BigDecimal("3.4807000")));
        cotacoesEsperadas.add(new Cotacao(LocalDate.of(2015, 7, 14), Moeda.EURO_COMPRA, new BigDecimal("3.4390000")));
        cotacoesEsperadas.add(new Cotacao(LocalDate.of(2015, 7, 15), Moeda.EURO_COMPRA, new BigDecimal("3.4565000")));
        cotacoesEsperadas.add(new Cotacao(LocalDate.of(2015, 7, 16), Moeda.EURO_COMPRA, new BigDecimal("3.4183000")));
        cotacoesEsperadas.add(new Cotacao(LocalDate.of(2015, 7, 17), Moeda.EURO_COMPRA, new BigDecimal("3.4515000")));
        Assert.assertArrayEquals(cotacoesEsperadas.toArray(), new WSConsulta().getCotacao(Moeda.EURO_COMPRA, LocalDate.of(2015, 7, 13), LocalDate.of(2015, 7, 17)).toArray());
    }

    @Test
    public void testDeveIgnorarFinalDeSemana() {
        Assert.assertEquals(2, new WSConsulta().getCotacao(Moeda.DOLAR_VENDA, LocalDate.of(2015, 7, 17), LocalDate.of(2015, 7, 20)).size());
    }

    @Test
    public void testDeveRetornarNuloQuandoForFeriado() {
        final LocalDate data = LocalDate.of(2015, 6, 4);
        Assert.assertNull(new WSConsulta().getCotacao(Moeda.DOLAR_VENDA, data));
    }

    @Test
    public void testDeveRetornarNuloQuandoForFinalDeSemana() {
        final LocalDate data = LocalDate.of(2015, 7, 5);
        Assert.assertNull(new WSConsulta().getCotacao(Moeda.DOLAR_VENDA, data));
    }

    @Test
    public void testDeveRetornarNuloQuandoDataForPosteriorAHoje() {
        final LocalDate data = LocalDate.now().plusDays(1);
        Assert.assertNull(new WSConsulta().getCotacao(Moeda.DOLAR_VENDA, data));
    }

    @Test
    public void testGaranteQueTodasAsMoedasEstaoOperacionais() {
        final LocalDate data = LocalDate.of(2015, 9, 18);
        final WSConsulta wsConsulta = new WSConsulta();
        for (Moeda moeda : Moeda.values()) {
            Assert.assertNotNull(wsConsulta.getCotacao(moeda, data));
        }
    }

    @Test
    public void testBuscaIndiceIGPMData() throws RemoteException {
        final WSConsulta wsConsulta = new WSConsulta();
        final Cotacao cotacao = wsConsulta.getCotacao(Moeda.IGPM, LocalDate.of(2015,1,1));
        final Cotacao cotacaoEsperada = new Cotacao(LocalDate.of(2015,1,1), Moeda.IGPM, new BigDecimal("0.76"));
        Assert.assertNotNull(cotacao);
        Assert.assertEquals(cotacaoEsperada, cotacao);
    }

    @Test
    public void testBuscaIndiceIGPMPeriodo() throws RemoteException {
        final WSConsulta wsConsulta = new WSConsulta();
        final List<Cotacao> cotacoes = wsConsulta.getCotacao(Moeda.IGPM, LocalDate.of(2014, 1, 1), LocalDate.of(2014, 12, 31));
        Assert.assertNotNull(cotacoes);
        Assert.assertEquals(cotacoes.size(), 12);
    }
}
