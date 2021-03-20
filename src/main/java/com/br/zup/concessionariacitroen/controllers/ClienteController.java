package com.br.zup.concessionariacitroen.controllers;

import com.br.zup.concessionariacitroen.models.Cliente;
import com.br.zup.concessionariacitroen.services.ServiceCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ServiceCliente serviceCliente;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente cadastrarCliente(@RequestBody @Valid Cliente cliente) {
        return serviceCliente.cadastrarCliente(cliente);
    }

    @GetMapping("{cpf}/")
    public Cliente pesquisarCliente(@PathVariable String cpf) {
        return serviceCliente.pesquisarClientePeloCPF(cpf);
    }

    @GetMapping
    public List<Cliente> listarClientes(){
        return serviceCliente.listarClientes();
    }
}