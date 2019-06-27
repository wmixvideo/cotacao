package com.fincatto.cotacao.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Cotacao implements Comparable<Cotacao> {

    private final Moeda moeda;
    private final LocalDate data;
    private final BigDecimal valorCompra, valorVenda;

    public Cotacao(final LocalDate data, final Moeda moeda, final BigDecimal valorCompra, final BigDecimal valorVenda) {
        this.data = data;
        this.moeda = moeda;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
    }

    public LocalDate getData() {
        return data;
    }

    private Moeda getMoeda() {
        return moeda;
    }

    public BigDecimal getValorCompra() {
        return valorCompra;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Cotacao cotacao = (Cotacao) o;
        return moeda == cotacao.moeda &&
                Objects.equals(data, cotacao.data) &&
                Objects.equals(valorCompra, cotacao.valorCompra) &&
                Objects.equals(valorVenda, cotacao.valorVenda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moeda, data, valorCompra, valorVenda);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cotacao{");
        sb.append("data=").append(data);
        sb.append(", moeda=").append(moeda);
        sb.append(", valorCompra=").append(valorCompra);
        sb.append(", valorVenda=").append(valorVenda);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(final Cotacao cotacao) {
        final int indiceCompareResult = this.moeda.compareTo(cotacao.getMoeda());
        if (indiceCompareResult == 0) {
            return this.data.compareTo(cotacao.getData());
        }
        return indiceCompareResult;
    }
}