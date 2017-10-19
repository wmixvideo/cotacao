package com.tnas.cotacao.service.backport.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fincatto.cotacao.classes.Indice;

import lombok.Data;


@Data
public class Cotacao implements Comparable<Cotacao>, Serializable {

	private static final long serialVersionUID = 5260660033534101367L;

	private Indice indice;
    private Date data;
    private BigDecimal valor;
    
    public Cotacao(final Date data, final Indice indice, final BigDecimal valor) {
        this.data = data;
        this.indice = indice;
        this.valor = valor;
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
