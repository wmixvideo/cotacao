package com.tnas.cotacao.service.backport.remote;

import java.util.Date;

import javax.ejb.Remote;

import com.fincatto.cotacao.classes.Indice;
import com.tnas.cotacao.service.backport.model.Cotacao;

@Remote
public interface BACENBackportRemote {

	Cotacao getCotacao(Indice indice, Date data);
}
