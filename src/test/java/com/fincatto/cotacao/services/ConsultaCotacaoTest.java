package com.fincatto.cotacao.services;

import com.fincatto.cotacao.model.Moeda;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ConsultaCotacaoTest {

    @Test
    public void testDeveRetornarACotacaoDeVendaPorData() throws Exception {
        final LocalDate data = LocalDate.of(2015, 7, 27);
        Assert.assertEquals(new BigDecimal("3.35570"), new ConsultaCotacao().getCotacao(Moeda.USD, data).getValorVenda());
    }

    @Test
    public void testDeveRetornarACotacaoDeCompraPorData() throws Exception {
        final LocalDate data = LocalDate.of(2015, 7, 27);
        Assert.assertEquals(new BigDecimal("3.35510"), new ConsultaCotacao().getCotacao(Moeda.USD, data).getValorCompra());
    }

    @Test
    public void testDeveRetornarNuloQuandoForFeriado() throws Exception {
        final LocalDate data = LocalDate.of(2015, 6, 4);
        Assert.assertNull(new ConsultaCotacao().getCotacao(Moeda.USD, data));
    }

    @Test
    public void testDeveRetornarNuloQuandoForFinalDeSemana() throws Exception {
        final LocalDate data = LocalDate.of(2015, 7, 5);
        Assert.assertNull(new ConsultaCotacao().getCotacao(Moeda.USD, data));
    }

    @Test
    public void testDeveRetornarNuloQuandoDataForPosteriorAHoje() throws Exception {
        final LocalDate data = LocalDate.now().plusDays(1);
        Assert.assertNull(new ConsultaCotacao().getCotacao(Moeda.USD, data));
    }

    @Test
    public void testGaranteQueTodasAsMoedasEstaoOperacionais() throws Exception {
        final LocalDate data = LocalDate.of(2015, 9, 18);
        final ConsultaCotacao consultaCotacao = new ConsultaCotacao();
        for (Moeda moeda : Moeda.values()) {
            Assert.assertNotNull(consultaCotacao.getCotacao(moeda, data));
        }
    }
}