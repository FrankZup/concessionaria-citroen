package com.br.zup.concessionariacitroen.DTOs;

import com.br.zup.concessionariacitroen.enums.Modelo;
import com.br.zup.concessionariacitroen.enums.TipoPagamento;
import com.br.zup.concessionariacitroen.models.Carro;
import com.br.zup.concessionariacitroen.models.Cliente;
import com.br.zup.concessionariacitroen.models.Pedido;

import java.time.LocalDate;

public class CadastroPedidoDTO {
    private Modelo modeloCarro;
    private String cpfCliente;
    private TipoPagamento tipoPagamento;
    private int quantidade;

    CadastroPedidoDTO() {}

    public Modelo getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(Modelo modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
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

    public Pedido converterDTOParaPedido(Carro carro, Cliente cliente){
        Pedido pedido = new Pedido();
        long numeroPedido = pedido.getNumeroPedido();
        pedido.setNumeroPedido(+numeroPedido);
        pedido.setCliente(cliente);
        pedido.setCarro(carro);
        pedido.setTipoPagamento(this.tipoPagamento);
        pedido.setQuantidade(this.quantidade);
        pedido.setDataCompra(LocalDate.now());

        return pedido;
    }
}
