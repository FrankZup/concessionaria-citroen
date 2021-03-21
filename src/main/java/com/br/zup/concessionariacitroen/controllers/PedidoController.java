package com.br.zup.concessionariacitroen.controllers;


import com.br.zup.concessionariacitroen.DTOs.CadastroPedidoDTO;
import com.br.zup.concessionariacitroen.models.Automovel;
import com.br.zup.concessionariacitroen.models.Carro;
import com.br.zup.concessionariacitroen.models.Cliente;
import com.br.zup.concessionariacitroen.models.Pedido;
import com.br.zup.concessionariacitroen.services.CarroService;
import com.br.zup.concessionariacitroen.services.ClienteService;
import com.br.zup.concessionariacitroen.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("pedidos/")
public class PedidoController {

    @Autowired
    PedidoService servicePedido;

    @Autowired
    ClienteService clienteService;

    @Autowired
    CarroService carroService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pedido cadastrarPedido(@RequestBody @Valid CadastroPedidoDTO cadastroPedidoDTO) {
        Carro carro = carroService.pesquisarCarroPeloModelo(cadastroPedidoDTO.getModeloCarro());
        System.out.println(carro);
        Cliente cliente = clienteService.pesquisarClientePeloCPF(cadastroPedidoDTO.getCpfCliente());
        System.out.println(cliente);
        return servicePedido.cadastrarPedido(cadastroPedidoDTO.converterDTOParaPedido(carro, cliente));
    }

    @GetMapping("{numeroPedido}/")
    public Pedido pesquisarPedido(@PathVariable long numeroPedido) {
        return servicePedido.pesquisarPedidoPeloNumero(numeroPedido);
    }

    @GetMapping
    public List<Pedido> listarPedidos(){
        return servicePedido.listarTodosPedidos();
    }
}
