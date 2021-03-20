package com.br.zup.concessionariacitroen.models;

import com.br.zup.concessionariacitroen.enums.TipoCarro;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Carro extends Automovel{
    @NotNull
    @NotEmpty
    private TipoCarro tipoCarro;

    Carro() {
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }
}
