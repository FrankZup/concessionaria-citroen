package com.br.zup.concessionariacitroen.models;

import com.br.zup.concessionariacitroen.enums.TipoPagamento;

import java.time.LocalDate;
import java.util.Objects;

public class Pedido {
    private long numeroPedido;
    private Carro carro;
    private Cliente cliente;
    private LocalDate dataCompra;
    private TipoPagamento tipoPagamento;
    private int quantidade;

    public Pedido() {}

    public long getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(long numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return numeroPedido == pedido.numeroPedido;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroPedido);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                "Cliente{" +
                "nome='" + cliente.getNome() + '\'' +
                ", cpf='" + cliente.getCpf() + '\'' +
                ", email='" + cliente.getEmail() + '\'' +
                ", telefone='" + cliente.getTelefone() + '\'' +
                ", endereco='" + cliente.getEndereco() + '\'' +
                '}' +
                "Carro{" +
                "tipoCarro=" + carro.getTipoCarro() +
                "MARCA='" + carro.getMARCA() + '\'' +
                ", modelo=" + carro.getModelo() +
                ", cor=" + carro.getCor() +
                ", motor=" + carro.getMotor() +
                ", transmissao=" + carro.getTransmissao() +
                ", rodas=" + carro.getRodas() +
                '}' +
                ", dataCompra=" + dataCompra +
                ", tipoPagamento=" + tipoPagamento +
                ", quantidade=" + quantidade +
                '}';
    }
}
