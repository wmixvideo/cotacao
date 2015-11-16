package com.fincatto.cotacao.classes;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Cotacao implements Comparable<Cotacao> {

    private final Indice indice;
    private final LocalDate data;
    private final BigDecimal valor;

    public Cotacao(final LocalDate data, final Indice indice, final BigDecimal valor) {
        this.data = data;
        this.indice = indice;
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public Indice getIndice() {
        return indice;
    }

    public BigDecimal getValor() {
        return valor;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Cotacao cotacao = (Cotacao) o;
        return indice == cotacao.indice &&
                Objects.equals(data, cotacao.data) &&
                Objects.equals(valor, cotacao.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indice, data, valor);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cotacao{");
        sb.append("data=").append(data);
        sb.append(", indice=").append(indice);
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(final Cotacao cotacao) {
        final int indiceCompareResult = this.indice.getDescricao().compareTo(cotacao.getIndice().getDescricao());
        if (indiceCompareResult == 0) {
            return this.data.compareTo(cotacao.getData());
        }
        return indiceCompareResult;
    }
}