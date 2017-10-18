package com.tnas.cotacao.service;

import java.time.LocalDate;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.fincatto.cotacao.classes.Cotacao;
import com.fincatto.cotacao.classes.Indice;
import com.tnas.cotacao.service.remote.BACENRemoteService;

public class BACENServiceStandaloneClient {

 	public static void main(String[] args) throws NamingException {
		
		// Defining JNDI properties - (!) Other properties are set in jboss-ejb-client.proerties
		final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
				
		// Setting JNDI Context
		final Context context = new InitialContext(jndiProperties);
		
		// Using the JNDI name of the EJB following this pattern :
		// "ejb:{EarName}/{ModuleName}/{DeploymentName}/{EJBClassName}!{EJBInterfaceFullyQualifiedName}"
		BACENRemoteService bacenService = (BACENRemoteService) context.lookup("ejb:bacen-service-1.0.0/cotacao-service-1.0.0//BACENService!com.tnas.cotacao.service.remote.BACENRemoteService");
		
	 	Cotacao cotacao = bacenService.getCotacao(Indice.SELIC_FATOR_ACUMULADO, LocalDate.of(2017, 6, 1));
		
		System.out.println("Cotacao Selic Fator Acumulado " + cotacao.getValor());
	}

}
