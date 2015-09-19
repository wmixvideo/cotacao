package com.fincatto.cotacao.classes;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Cotacao {

    private final Moeda moeda;
    private final LocalDate data;
    private final BigDecimal valor;

    public Cotacao(final LocalDate data, final Moeda moeda, final BigDecimal valor) {
        this.data = data;
        this.moeda = moeda;
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    public BigDecimal getValor() {
        return valor;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Cotacao cotacao = (Cotacao) o;
        return moeda == cotacao.moeda &&
                Objects.equals(data, cotacao.data) &&
                Objects.equals(valor, cotacao.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moeda, data, valor);
    }
}
