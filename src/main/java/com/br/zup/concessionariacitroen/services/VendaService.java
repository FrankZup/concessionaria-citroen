package com.br.zup.concessionariacitroen.services;

import com.br.zup.concessionariacitroen.exceptions.NaoHaVendasCadastradasException;
import com.br.zup.concessionariacitroen.exceptions.VendaDuplicadaException;
import com.br.zup.concessionariacitroen.models.Carro;
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
        verificarSeHaVendaPeloNumeroPedido(venda.getPedido().getNumeroPedido());
        venda.setNumeroVenda(numeroVendaAtual() + 1);
        vendas.add(venda);

        return venda;
    }
    /**
     *Método que permite visualizar todas as vendas realizadas
     **/
    public List<Venda> listarVendas(){
        return vendas;
    }

    public Venda pesquisarVendaPeloNumeroDaVenda(long numeroVenda) {
        for (Venda objetoVenda : vendas){
            if (objetoVenda.getNumeroVenda() == numeroVenda) {
                return objetoVenda;
            }
        }
        throw new NaoHaVendasCadastradasException();
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

    public boolean verificarSeHaVendaPeloNumeroPedido(long numeroPedido) {
        for(Venda venda : vendas) {
            if(venda.getPedido().getNumeroPedido() == numeroPedido) {
                throw new VendaDuplicadaException();
            }
        }
        return false;
    }

    private long numeroVendaAtual() {
        long numeroVendaAtual;
        if(vendas.size() == 0) {
            return numeroVendaAtual = 500L;
        }
        numeroVendaAtual = vendas.get(vendas.size () - 1).getNumeroVenda();
        return numeroVendaAtual;
    }
}
