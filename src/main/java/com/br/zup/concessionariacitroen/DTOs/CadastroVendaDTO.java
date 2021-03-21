package com.br.zup.concessionariacitroen.DTOs;

import com.br.zup.concessionariacitroen.models.Pedido;
import com.br.zup.concessionariacitroen.models.Venda;

import java.time.LocalDate;

public class CadastroVendaDTO {
    private Pedido pedido;

    public CadastroVendaDTO() {}

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Venda converterDTOParaVenda() {
        Venda venda = new Venda();
        long numeroVenda = venda.getNumeroVenda();
        venda.setNumeroVenda(+numeroVenda);
        venda.setPedido(this.pedido);
        venda.setDataVenda(LocalDate.now());

        return venda;
    }
}
