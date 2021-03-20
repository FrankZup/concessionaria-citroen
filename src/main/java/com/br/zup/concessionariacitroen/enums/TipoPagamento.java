package com.br.zup.concessionariacitroen.enums;

public enum TipoPagamento {
    DINHEIRO("DINHEIRO"),
    CARTAO_CREDITO("CARTAO_CREDITO"),
    BOLETO("BOLETO"),
    FINANCIAMENTO("FINANCIAMENTO");

    private String descricao;

    TipoPagamento(String descricao) {
        this.descricao = descricao;
    }
}
