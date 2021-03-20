package com.br.zup.concessionariacitroen.models;

import java.time.LocalDate;
import java.util.Objects;

public class Pedido {
    private int numeroPedido = 1000;
    private Carro carro;
    private Cliente cliente;
    private LocalDate dataCompra;
    private TipoPagamento tipoPagamento;

    public Pedido() {}

    public Pedido(Carro carro, Cliente cliente, TipoPagamento tipoPagamento) {
        this.numeroPedido += numeroPedido;
        this.carro = carro;
        this.cliente = cliente;
        this.dataCompra = LocalDate.now();
        this.tipoPagamento = tipoPagamento;
    }

    public int getNumeroPedido() {
        return numeroPedido;
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
}
