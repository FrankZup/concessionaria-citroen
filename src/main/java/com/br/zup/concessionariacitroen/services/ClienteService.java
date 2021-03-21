package com.br.zup.concessionariacitroen.services;

import com.br.zup.concessionariacitroen.exceptions.CarroDuplicadoException;
import com.br.zup.concessionariacitroen.exceptions.ClienteDuplicadoException;
import com.br.zup.concessionariacitroen.exceptions.ClienteNaoEncontradoException;
import com.br.zup.concessionariacitroen.models.Carro;
import com.br.zup.concessionariacitroen.models.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private static List<Cliente> clientes = new ArrayList<>();

    public Cliente cadastrarCliente(Cliente cliente) {
        if (!verificarClienteExiste(cliente)) {
            clientes.add(cliente);
        }

        return cliente;
    }

    public boolean verificarClienteExiste(Cliente cliente){
        for (Cliente objetoCliente : clientes){
            if (objetoCliente.getCpf().equals(cliente.getCpf())){
                throw new ClienteDuplicadoException();
            }
        }
        return false;
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
        throw new ClienteNaoEncontradoException();
    }
}
