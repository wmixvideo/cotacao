package com.fincatto.cotacao.classes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FatorAcumuladoSelic extends Cotacao {

	public FatorAcumuladoSelic(LocalDate data, Indice indice, BigDecimal valor) {
		super(data, Indice.SELIC_FATOR_ACUMULADO, valor);
	}

}
