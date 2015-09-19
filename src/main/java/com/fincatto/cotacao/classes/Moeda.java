package com.fincatto.cotacao.classes;

public enum Moeda {
    DOLAR_VENDA(1, "D\u00f3lar (venda)"),
    DOLAR_COMPRA(10813, "D\u00f3lar (compra)"),
    EURO_VENDA(21619, "Euro (venda)"),
    EURO_COMPRA(21620, "Euro (compra)"),
    IENE_VENDA(21621, "Iene (venda)"),
    IENE_COMPRA(21622, "Iene (compra)"),
    LIBRA_ESTERLINE_VENDA(21623, "Libra esterlina (venda)"),
    LIBRA_ESTERLINE_COMPRA(21624, "Libra esterlina (compra)"),
    FRANCO_SUICO_VENDA(21625, "Franco Su\u00ed\u00e7o (venda)"),
    FRANCO_SUICO_COMPRA(21626, "Franco Su\u00ed\u00e7o (compra)"),
    COROA_DINAMARQUESA_VENDA(21627, "Coroa Dinamarquesa (venda)"),
    COROA_DINAMARQUESA_COMPRA(21628, "Coroa Dinamarquesa (compra)"),
    COROA_NOROEGUESA_VENDA(21629, "Coroa Norueguesa (venda)"),
    COROA_NOROEGUESA_COMPRA(21630, "Coroa Norueguesa (compra)"),
    COROA_SUECA_VENDA(21631, "Coroa Sueca (venda)"),
    COROA_SUECA_COMPRA(21632, "Coroa Sueca (compra)"),
    DOLAR_AUSTRALIANO_VENDA(21633, "D\u00f3lar Australiano (venda)"),
    DOLAR_AUSTRALIANO_COMPRA(21634, "D\u00f3lar Australiano (compra)"),
    DOLAR_CANADENSE_VENDA(21635, "D\u00f3lar Canadense (venda)"),
    DOLAR_CANADENSE_COMPRA(21636, "D\u00f3lar Canadense (compra))");

    private final long codigo;
    private final String descricao;

    Moeda(final long codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
