package com.br.zup.concessionariacitroen.DTOs;

import com.br.zup.concessionariacitroen.models.Pedido;
import com.br.zup.concessionariacitroen.models.Venda;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class CadastroVendaDTO {
    @NotNull
    private long pedido;

    public CadastroVendaDTO() {}

    public long getPedido() {
        return pedido;
    }

    public void setPedido(long pedido) {
        this.pedido = pedido;
    }

    public Venda converterDTOParaVenda(Pedido pedido) {
        Venda venda = new Venda();
        long numeroVenda = venda.getNumeroVenda();
        venda.setNumeroVenda(+numeroVenda);
        venda.setPedido(pedido);
        venda.setDataVenda(LocalDate.now());

        return venda;
    }
}
