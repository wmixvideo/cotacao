package com.fincatto.cotacao.services;

import com.fincatto.cotacao.model.Moeda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ConsultaCotacaoTest {

    @Test
    public void testDeveRetornarACotacaoDeVendaPorData() throws Exception {
        final LocalDate data = LocalDate.of(2015, 7, 27);
        Assertions.assertEquals(new BigDecimal("3.35570"), new ConsultaCotacao().getCotacao(Moeda.USD, data).getValorVenda());
    }

    @Test
    public void testDeveRetornarACotacaoDeCompraPorData() throws Exception {
        final LocalDate data = LocalDate.of(2015, 7, 27);
        Assertions.assertEquals(new BigDecimal("3.35510"), new ConsultaCotacao().getCotacao(Moeda.USD, data).getValorCompra());
    }

    @Test
    public void testDeveRetornarNuloQuandoForFeriado() throws Exception {
        final LocalDate data = LocalDate.of(2015, 6, 4);
        Assertions.assertNull(new ConsultaCotacao().getCotacao(Moeda.USD, data));
    }

    @Test
    public void testDeveRetornarNuloQuandoForFinalDeSemana() throws Exception {
        final LocalDate data = LocalDate.of(2015, 7, 5);
        Assertions.assertNull(new ConsultaCotacao().getCotacao(Moeda.USD, data));
    }

    @Test
    public void testDeveRetornarNuloQuandoDataForPosteriorAHoje() throws Exception {
        final LocalDate data = LocalDate.now().plusDays(1);
        Assertions.assertNull(new ConsultaCotacao().getCotacao(Moeda.USD, data));
    }

    @Test
    public void testGaranteQueTodasAsMoedasEstaoOperacionais() throws Exception {
        final LocalDate data = LocalDate.of(2015, 9, 18);
        final ConsultaCotacao consultaCotacao = new ConsultaCotacao();
        for (Moeda moeda : Moeda.values()) {
            Assertions.assertNotNull(consultaCotacao.getCotacao(moeda, data));
        }
    }
}