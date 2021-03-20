package com.br.zup.concessionariacitroen.DTOs;

import com.br.zup.concessionariacitroen.enums.*;
import com.br.zup.concessionariacitroen.models.Carro;

public class CadastroCarroDTO {
    private Modelo modelo;
    private Cor cor;
    private Motor motor;
    private Transmissao transmissao;
    private Rodas rodas;
    private TipoCarro tipoCarro;
    private short quantidade;

    CadastroCarroDTO() {}

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    public Rodas getRodas() {
        return rodas;
    }

    public void setRodas(Rodas rodas) {
        this.rodas = rodas;
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public short getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(short quantidade) {
        this.quantidade = quantidade;
    }

    public Carro converterDTOParaCarro(){
        Carro carro = new Carro();
        carro.setModelo(this.modelo);
        carro.setTipoCarro(this.tipoCarro);
        carro.setCor(this.cor);
        carro.setMotor(this.motor);
        carro.setTransmissao(this.transmissao);
        carro.setRodas(this.rodas);
        carro.setQuantidade(this.quantidade);

        return carro;
    }
}

