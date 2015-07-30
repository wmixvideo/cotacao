package com.fincatto.cotacao.ws;

import com.fincatto.cotacao.modelo.Cotacao;
import com.fincatto.cotacao.modelo.Moeda;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WSConsultaTest {

    @Test
    public void testDeveRetornarACotacaoPorData() throws Exception {
        final LocalDate data = LocalDate.of(2015, 7, 27);
        final Cotacao cotacaoEsperada = new Cotacao(data, Moeda.DOLAR_VENDA, new BigDecimal("3.3557"));
        Assert.assertEquals(cotacaoEsperada, new WSConsulta().getCotacao(Moeda.DOLAR_VENDA, data));
    }

    @Test
    public void testDeveRetornarAsCotacoesPorPeriodo() throws Exception {
        final List<Cotacao> cotacoesEsperadas = new ArrayList<>();
        cotacoesEsperadas.add(new Cotacao(LocalDate.of(2015, 7, 13), Moeda.EURO_COMPRA, new BigDecimal("3.4807000")));
        cotacoesEsperadas.add(new Cotacao(LocalDate.of(2015, 7, 14), Moeda.EURO_COMPRA, new BigDecimal("3.4390000")));
        cotacoesEsperadas.add(new Cotacao(LocalDate.of(2015, 7, 15), Moeda.EURO_COMPRA, new BigDecimal("3.4565000")));
        cotacoesEsperadas.add(new Cotacao(LocalDate.of(2015, 7, 16), Moeda.EURO_COMPRA, new BigDecimal("3.4183000")));
        cotacoesEsperadas.add(new Cotacao(LocalDate.of(2015, 7, 17), Moeda.EURO_COMPRA, new BigDecimal("3.4515000")));
        Assert.assertArrayEquals(cotacoesEsperadas.toArray(), new WSConsulta().getCotacao(Moeda.EURO_COMPRA, LocalDate.of(2015, 7, 13), LocalDate.of(2015, 7, 17)).toArray());
    }

    @Test
    public void testDeveIgnorarFinalDeSemana() throws Exception {
        Assert.assertEquals(2, new WSConsulta().getCotacao(Moeda.DOLAR_AUSTRALIANO_VENDA, LocalDate.of(2015, 7, 17), LocalDate.of(2015, 7, 20)).size());
    }

    @Test
    public void testDeveRetornarNuloQuandoForFeriado() throws Exception {
        final LocalDate data = LocalDate.of(2015, 6, 4);
        Assert.assertNull(new WSConsulta().getCotacao(Moeda.COROA_DINAMARQUESA_COMPRA, data));
    }

    @Test
    public void testDeveRetornarNuloQuandoForFinalDeSemana() throws Exception {
        final LocalDate data = LocalDate.of(2015, 7, 5);
        Assert.assertNull(new WSConsulta().getCotacao(Moeda.FRANCO_SUICO_VENDA, data));
    }

    @Test
    public void testDeveRetornarNuloQuandoDataForPosteriorAHoje() throws Exception {
        final LocalDate data = LocalDate.now().plusDays(1);
        Assert.assertNull(new WSConsulta().getCotacao(Moeda.IENE_COMPRA, data));
    }
}
