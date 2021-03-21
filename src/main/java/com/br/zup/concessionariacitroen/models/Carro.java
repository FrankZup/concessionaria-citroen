package com.br.zup.concessionariacitroen.models;

import com.br.zup.concessionariacitroen.enums.TipoCarro;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class Carro extends Automovel{
    private final String MARCA = "Citroen";

    @NotNull
    @NotEmpty
    private TipoCarro tipoCarro;

    @NotEmpty
    @NotNull
    @Positive
    @Max(32766)
    private int quantidade;

    public Carro() {
    }

    public String getMARCA() { return MARCA; }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "MARCA=" + MARCA +
                "tipoCarro=" + tipoCarro +
                ", modelo=" + getModelo() +
                ", cor=" + getCor() +
                ", motor=" + getMotor() +
                ", transmissao=" + getTransmissao() +
                ", rodas=" + getRodas() +
                ", quantidade=" + quantidade +
                '}';
    }
}
