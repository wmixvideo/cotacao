# Cotacao
Sistema para busca de cotações do Banco Central do Brasil

[![Build Status](https://api.travis-ci.org/wmixvideo/cotacao.png)](http://travis-ci.org/#!/wmixvideo/cotacao)
[![Coverage Status](https://coveralls.io/repos/wmixvideo/cotacao/badge.svg?branch=master&service=github)](https://coveralls.io/github/wmixvideo/cotacao?branch=master)

## Exemplos de uso

### Consulta de Dolar
new WSConsulta().getCotacao(Moeda.DOLAR_VENDA, LocalDate.of(2015, 7, 27))

##Consulta de Euro
new WSConsulta().getCotacao(Moeda.EURO_COMPRA, LocalDate.of(2015, 7, 27))

##Consulta de Coroa Sueca
new WSConsulta().getCotacao(Moeda.COROA_SUECA_COMPRA, LocalDate.of(2015, 7, 27))
