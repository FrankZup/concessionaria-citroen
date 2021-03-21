package com.br.zup.concessionariacitroen.models;

import com.br.zup.concessionariacitroen.enums.TipoCarro;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class Carro extends Automovel{
    @NotNull
    @NotEmpty
    private TipoCarro tipoCarro;

    @NotEmpty
    @NotNull
    @Positive
    @Max(32766)
    private short quantidade;

    public Carro() {
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public short getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(short quantidade) {
        this.quantidade = quantidade;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "tipoCarro=" + tipoCarro +
                ", quantidade=" + quantidade +
                '}';
    }
}
