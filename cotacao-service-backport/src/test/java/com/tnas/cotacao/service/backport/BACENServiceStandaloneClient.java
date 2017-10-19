package com.tnas.cotacao.service.backport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.fincatto.cotacao.classes.Indice;
import com.tnas.cotacao.service.backport.model.Cotacao;
import com.tnas.cotacao.service.backport.remote.BACENBackportRemote;

public class BACENServiceStandaloneClient {
	
	private static final String JNDI_EJB = 
			"ejb:bacen-backport-service-1.0.0/cotacao-service-backport-1.0.0//BACENBackportService!com.tnas.cotacao.service.backport.remote.BACENBackportRemote";
	
 	public static void main(String[] args) throws NamingException, ParseException {
		
		// Defining JNDI properties - (!) Other properties are set in jboss-ejb-client.proerties
		final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
//		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
				
		// Setting JNDI Context
		final Context context = new InitialContext(jndiProperties);
		
		// Using the JNDI name of the EJB following this pattern :
		// "ejb:{EarName}/{ModuleName}/{DeploymentName}/{EJBClassName}!{EJBInterfaceFullyQualifiedName}"
		BACENBackportRemote bacenService = (BACENBackportRemote) context.lookup(JNDI_EJB);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
	 	Cotacao cotacao = bacenService.getCotacao(Indice.SELIC_FATOR_ACUMULADO, sdf.parse("2017-06-01"));
		
		System.out.println("Cotacao Selic Fator Acumulado " + cotacao.getValor());
	}
}
