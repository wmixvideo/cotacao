# Cotacao
Sistema para busca de índices e cotações de moedas do Banco Central do Brasil.

Para uma listagem completa das moedas e índices suportados, veja a lista: http://egas.digital/cotacoes.txt

[![Build Status](https://api.travis-ci.org/wmixvideo/cotacao.png)](http://travis-ci.org/#!/wmixvideo/cotacao)
[![Coverage Status](https://coveralls.io/repos/wmixvideo/cotacao/badge.svg?branch=master&service=github)](https://coveralls.io/github/wmixvideo/cotacao?branch=master)

## Exemplos de uso

### Consulta de Dolar
```
new WSConsulta().getCotacao(Indice.DOLAR_VENDA, LocalDate.of(2015, 7, 27))
```

### Consulta de Euro
```
new WSConsulta().getCotacao(Indice.EURO_COMPRA, LocalDate.of(2015, 7, 27))
```

### Consulta do IGPM
```
new WSConsulta().getCotacao(Indice.IGPM, LocalDate.of(2015, 7, 27))
```

### Consulta de Ouro
```
new WSConsulta().getCotacao(Indice.OURO_BMF, LocalDate.of(2015, 7, 27))
```

### Consulta da Selic
```
new WSConsulta().getCotacao(Indice.SELIC, LocalDate.of(2015, 7, 27))
```
