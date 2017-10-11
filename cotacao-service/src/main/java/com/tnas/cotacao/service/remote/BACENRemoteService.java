package com.tnas.cotacao.service.remote;

import java.time.LocalDate;
import java.util.SortedSet;

import javax.ejb.Remote;

import com.fincatto.cotacao.classes.Cotacao;
import com.fincatto.cotacao.classes.Indice;

@Remote
public interface BACENRemoteService {
	
	Cotacao getCotacao(Indice indice, LocalDate data);
	
	SortedSet<Cotacao> getCotacao(final Indice indice, final LocalDate dataInicio, final LocalDate dataFim);
}
