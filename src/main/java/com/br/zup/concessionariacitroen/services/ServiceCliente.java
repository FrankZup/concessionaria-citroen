package com.br.zup.concessionariacitroen.services;

import com.br.zup.concessionariacitroen.exceptions.CPFDuplicadoException;
import com.br.zup.concessionariacitroen.models.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCliente {

    private static List<Cliente> clientes = new ArrayList<>();

    public Cliente cadastrarCliente(Cliente cliente) {

        if ( !clientes.contains(cliente)) {

            clientes.add(cliente);
            return cliente;
        }
        throw new CPFDuplicadoException();
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Cliente pesquisarClientePeloCPF(String cpf){
        for (Cliente objetoCliente : clientes){
            if (objetoCliente.getCpf().equals(cpf)){
                return objetoCliente;
            }
        }
        throw new RuntimeException("Cliente não encontrado");
    }
}
