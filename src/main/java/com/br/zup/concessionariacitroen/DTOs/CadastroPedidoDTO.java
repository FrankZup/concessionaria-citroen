package com.br.zup.concessionariacitroen.DTOs;

import com.br.zup.concessionariacitroen.enums.TipoPagamento;
import com.br.zup.concessionariacitroen.models.Carro;
import com.br.zup.concessionariacitroen.models.Cliente;
import com.br.zup.concessionariacitroen.models.Pedido;

import java.time.LocalDate;

public class CadastroPedidoDTO {
    private Carro carro;
    private Cliente cliente;
    private TipoPagamento tipoPagamento;

    CadastroPedidoDTO() {}

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

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Pedido converterDTOParaPedido(){
        Pedido pedido = new Pedido();
        long numeroPedido = pedido.getNumeroPedido();
        pedido.setNumeroPedido(+numeroPedido);
        pedido.setCliente(this.cliente);
        pedido.setCarro(this.carro);
        pedido.setTipoPagamento(this.tipoPagamento);
        //pedido.setDataCompra(LocalDate.now());

        return pedido;
    }
}
