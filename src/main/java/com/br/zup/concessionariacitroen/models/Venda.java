package com.br.zup.concessionariacitroen.models;

import java.time.LocalDate;

public class Venda{
    private long numeroVenda;
    private Pedido pedido;
    private LocalDate dataVenda;

    public Venda() {}

    public Venda(Pedido numeroPedido) {
        this.numeroVenda += numeroVenda;
        this.pedido = numeroPedido;
        this.dataVenda = LocalDate.now();
    }

    public long getNumeroVenda() {
        return numeroVenda;
    }

    public void setNumeroVenda(long numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

}
