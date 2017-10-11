package com.tnas.cotacao.service;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

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
		BACENRemoteService bacenService = (BACENRemoteService) context.lookup("ejb:/cotacao-service-0.0.1//BACENService!com.tnas.cotacao.service.remote.BACENRemoteService");
		
//		System.out.println(bacenService.getHelloWorld());
	}

}
