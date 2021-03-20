package com.br.zup.concessionariacitroen.services;

import com.br.zup.concessionariacitroen.exceptions.NaoHaVendasCadastradasException;
import com.br.zup.concessionariacitroen.models.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VendaService {

    private static List<Venda> vendas = new ArrayList<>();

    @Autowired
    PedidoService pedidoService;

    /**
     *Método que permite criar efetuar uma nova venda
     **/

    public Venda efetuarVenda(Venda venda){
        for(Venda vendaIndex : vendas) {
            if(vendaIndex.equals(venda)) {
                return vendaIndex;
            }
        }
        throw new RuntimeException();
    }
    /**
     *Método que permite visualizar todas as vendas realizadas
     **/
    public List<Venda> listarVendas(){
        return vendas;
    }
    /**
     *Método que permite pesquisar venda pelo cpf do cliente
     **/
    public List <Venda> pesquisarVendaPeloCPFdoCliente(String cpf) {
        List<Venda> vendasDoClienteInformado = new ArrayList<>();
        verificarSeHaVendas();
        for (Venda objetoVenda : vendas){
            if (objetoVenda.getPedido().getCliente().getCpf().equals(cpf)) {
                vendasDoClienteInformado.add(objetoVenda);
            }
        }

        return vendasDoClienteInformado;
    }
    /**
     *Método que permite verificar se há vendas cadastradas
     **/
    private void verificarSeHaVendas(){
        if (vendas.isEmpty() || vendas == null){
            throw new NaoHaVendasCadastradasException();
        }
    }
}
