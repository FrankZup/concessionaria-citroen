package com.br.zup.concessionariacitroen.controllers;


import com.br.zup.concessionariacitroen.DTOs.CadastroPedidoDTO;
import com.br.zup.concessionariacitroen.models.Pedido;
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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pedido cadastrarPedidoDTO(@RequestBody @Valid CadastroPedidoDTO cadastroPedidoDTO) {
        System.out.println(cadastroPedidoDTO);
        return servicePedido.cadastrarPedido(cadastroPedidoDTO.converterDTOParaPedido());
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
