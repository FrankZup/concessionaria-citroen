package com.br.zup.concessionariacitroen.exceptions;

public class PedidoNaoEncontradoException extends ExcecaoBasica {
    public PedidoNaoEncontradoException() {
        super("Pedido não encontrado", 404, "numeroPedido", "Not Found");
    }
}
