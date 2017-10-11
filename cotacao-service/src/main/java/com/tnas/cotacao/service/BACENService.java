package com.tnas.cotacao.service;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.SortedSet;

import javax.ejb.Stateless;

import com.fincatto.cotacao.classes.Cotacao;
import com.fincatto.cotacao.classes.Indice;
import com.fincatto.cotacao.ws.WSConsulta;
import com.tnas.cotacao.service.remote.BACENRemoteService;

@Stateless
public class BACENService implements BACENRemoteService {

	private WSConsulta wsConsulta;
	
	public BACENService() {
		this.wsConsulta = new WSConsulta();
	}
	
	@Override
	public Cotacao getCotacao(Indice indice, LocalDate data) {
		return this.wsConsulta.getCotacao(indice, data);
	}
	
	public SortedSet<Cotacao> getCotacao(final Indice indice, final LocalDate dataInicio, final LocalDate dataFim) {
		try {
			return this.wsConsulta.getCotacao(indice, dataInicio, dataFim);
		} 
		catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
