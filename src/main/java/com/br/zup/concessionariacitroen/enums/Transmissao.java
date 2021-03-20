package com.br.zup.concessionariacitroen.enums;

public enum Transmissao {
    AUTOMATICA("AUTOMATICA"),
    MANUAL("MANUAL");

    private String descricao;
    Transmissao(String descricao){
        this.descricao = descricao;
}
}
