package com.tnas.cotacao.service.backport;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.fincatto.cotacao.classes.Indice;
import com.tnas.cotacao.service.backport.model.Cotacao;
import com.tnas.cotacao.service.backport.remote.BACENBackportRemote;
import com.tnas.cotacao.service.remote.BACENRemoteService;

@Stateless
public class BACENBackportService implements BACENBackportRemote {

	@EJB(mappedName="ejb:bacen-service-1.0.0/cotacao-service-1.0.0//BACENService!com.tnas.cotacao.service.remote.BACENRemoteService")
	private BACENRemoteService bacenService;

	@Override
	public Cotacao getCotacao(Indice indice, Date data) {
		
		LocalDate localDate = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		com.fincatto.cotacao.classes.Cotacao cotacaoResponse = this.bacenService.getCotacao(indice, localDate);
		Date dataCotacao = java.sql.Date.valueOf(cotacaoResponse.getData());
		
		return new Cotacao(dataCotacao, indice, cotacaoResponse.getValor());
	}
	
	
}
