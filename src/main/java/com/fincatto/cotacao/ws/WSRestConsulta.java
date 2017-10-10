package com.fincatto.cotacao.ws;

import java.net.HttpURLConnection;

import javax.json.Json;
import javax.ws.rs.core.HttpHeaders;

import com.fincatto.cotacao.classes.Cotacao;
import com.fincatto.cotacao.classes.FatorAcumuladoSelic;
import com.ibm.wsdl.extensions.http.HTTPConstants;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Client RestFul para recuperação do fator acumulado da Taxa Selic.
 * A Interface web correspondente está disponível em: http://www.bcb.gov.br/htms/selic/selicacumul.asp
 * 
 * A URL completa do serviço é: 
 * https://www3.bcb.gov.br/selic/rest/fatoresAcumulados/pub/search?parametrosOrdenacao=[{"nome":"periodo","decrescente":false}]&page=1&pageSize=20
 * 
 * @author Thiago Nascimento Rodrigues
 * @email nascimenthiago@gmail.com
 * 
 * @since 2017-10-10
 *
 */
public class WSRestConsulta {

	private static final String RESTFUL_URL = "https://www3.bcb.gov.br/selic/rest/fatoresAcumulados/pub/search";
	
	public FatorAcumuladoSelic getFatorAcumuladoSelic(final int mes, final int ano) {

		Client client = Client.create();
		WebResource webResource = client.resource(RESTFUL_URL);
		String jsonParams = Json.createObjectBuilder()
				.add("campoPeriodo", "mensal")
				.add("dataInicial", "")
				.add("dataFinal", "")
				.add("mes", mes)
				.add("ano", ano)
				.build().toString();
		
		ClientResponse response = webResource.type("application/json") .post(ClientResponse.class, jsonParams);

		if (response.getStatus() != HttpURLConnection.HTTP_OK) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}

		
		
		System.out.println("Output from Server .... \n");
		String output = response.getEntity(String.class);
		System.out.println(output);
		
		return null;
	}
}
