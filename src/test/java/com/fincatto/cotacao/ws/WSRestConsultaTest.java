package com.fincatto.cotacao.ws;

import org.junit.Test;

public class WSRestConsultaTest {

    @Test
    public void testFatorAcumuladoTaxaSelic() {
    	new WSRestConsulta().getFatorAcumuladoSelic(6, 2017);
    }
}
