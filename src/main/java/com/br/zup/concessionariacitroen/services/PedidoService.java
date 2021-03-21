package com.br.zup.concessionariacitroen.services;

import com.br.zup.concessionariacitroen.exceptions.PedidoNaoEncontradoException;
import com.br.zup.concessionariacitroen.exceptions.VendaDuplicadaException;
import com.br.zup.concessionariacitroen.models.Carro;
import com.br.zup.concessionariacitroen.models.Pedido;
import com.br.zup.concessionariacitroen.models.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    private static List<Pedido> pedidos = new ArrayList<>();

    @Autowired
    CarroService carroService;
    /**
     *Método que permite o cadastro de um novo pedido, desde que tenha o carro em estoque
     **/

    public Pedido cadastrarPedido(Pedido pedido) {
        pedidos.add(pedido);
        carroService.efetuarBaixaDoEstoque(pedido.getCarro(), pedido.getQuantidade());

        return pedido;
    }
    /**
     *Método que permite visualizar todos os pedidos cadastrados
     **/
    public List<Pedido> listarTodosPedidos() {
        return pedidos;
    }
    /**
     *Método que permite pesquisar o pedido pelo número do pedido
     **/
    public Pedido pesquisarPedidoPeloNumero(long numeroPedido) {
        for (Pedido pedido : pedidos) {
            if (pedido.getNumeroPedido() == numeroPedido) {
                return pedido;
            }
        }
        throw new PedidoNaoEncontradoException();
    }
}
