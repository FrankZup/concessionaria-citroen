package com.br.zup.concessionariacitroen.controllers;

import com.br.zup.concessionariacitroen.enums.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public abstract class Automovel {
    private final String MARCA = "Citroen";

    @NotNull
    @NotEmpty
    private Modelo modelo;

    @NotNull
    @NotEmpty
    private Cor cor;

    @NotNull
    @NotEmpty
    private Motor motor;

    @NotNull
    @NotEmpty
    private Transmissao transmissao;

    @NotNull
    @NotEmpty
    private Rodas rodas;

    Automovel() {}

    public Modelo getModelo() { return modelo; }
    public void setModelo(Modelo modelo) { this.modelo = modelo; }

    public Cor getCor() { return cor; }
    public void setCor(Cor cor) { this.cor = cor; }

    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; }

    public Transmissao getTransmissao() { return transmissao; }
    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    public Rodas getRodas() { return rodas; }
    public void setRodas(Rodas rodas) { this.rodas = rodas; }
}
