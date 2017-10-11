package com.fincatto.cotacao.ws;

import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.json.Json;
import javax.ws.rs.core.MediaType;

import com.fincatto.cotacao.classes.Cotacao;
import com.fincatto.cotacao.classes.Indice;
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
	private static final int PRIMEIRO_DIA_MES = 1;
	private static WSRestConsulta _instance;
	
	public static final WSRestConsulta getInstance() {
		if (_instance == null)
			_instance = new WSRestConsulta();
		return _instance;
	}
	
	private WSRestConsulta() { }
	
	public Cotacao getFatorAcumuladoSelic(final int mes, final int ano) {

		Client client = Client.create();
		WebResource webResource = client.resource(RESTFUL_URL);
		String jsonParams = Json.createObjectBuilder()
				.add("campoPeriodo", "mensal")
				.add("dataInicial", "")
				.add("dataFinal", "")
				.add("mes", mes)
				.add("ano", ano)
				.build().toString();
		
		ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE) .post(ClientResponse.class, jsonParams);

		if (response.getStatus() != HttpURLConnection.HTTP_OK) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}

		String output = response.getEntity(String.class);
		BigDecimal fator;
						
		Pattern pattern = Pattern.compile("fator:\\s([\\d|\\.]+)\\,");
		Matcher matcher = pattern.matcher(output); 
		
		if (matcher.find()) {
			fator = new BigDecimal(matcher.group(1));
		}
		else {
			throw new RuntimeException("Failed: Fator has not been found in the HTTP Response.");
		}
		
		return new Cotacao(LocalDate.of(ano, mes, PRIMEIRO_DIA_MES), Indice.SELIC_FATOR_ACUMULADO, fator);
	}
}
