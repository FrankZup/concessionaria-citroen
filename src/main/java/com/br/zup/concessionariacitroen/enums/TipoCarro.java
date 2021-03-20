package com.br.zup.concessionariacitroen.enums;

public enum TipoCarro {
    SUV("SUV"), CROSSOVER("CROSSOVER"), HATCH("HATCH"), SEDAN("SEDAN");

    private String descricao;

    TipoCarro(String descricao) {
        this.descricao = descricao;
    }
}
