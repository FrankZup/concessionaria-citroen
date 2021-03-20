package com.br.zup.concessionariacitroen.enums;

public enum Cor {
    PRETO_PERLA("PRETO_PERLA"),
    VERMELHO_ADEN("VERMELHO_ADEN"),
    CINZA_GRAFITO("CINZA_GRAFITO"),
    BRANCO_NACRE("BRANCO_NACRE");

    private String descricao;

    Cor(String descricao){
        this.descricao = descricao;
    }
}
