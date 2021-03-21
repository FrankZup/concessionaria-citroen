package com.br.zup.concessionariacitroen.controllers;

import com.br.zup.concessionariacitroen.DTOs.CadastroVendaDTO;
import com.br.zup.concessionariacitroen.models.Pedido;
import com.br.zup.concessionariacitroen.models.Venda;
import com.br.zup.concessionariacitroen.services.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("vendas/")
public class VendaController {
    @Autowired
    VendaService vendaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Venda cadastrarVendaDTO(@RequestBody @Valid CadastroVendaDTO cadastroVendaDTO) {
        return vendaService.efetuarVenda(cadastroVendaDTO.converterDTOParaVenda());
    }

    @GetMapping("{cpf}/")
    public List<Venda> pesquisarVendaPorCpf(@PathVariable String cpf) {
        return vendaService.pesquisarVendaPeloCPFdoCliente(cpf);
    }

    @GetMapping
    public List<Venda> listarPedidos(){
        return vendaService.listarVendas();
    }
}
