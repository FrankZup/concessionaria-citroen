package com.br.zup.concessionariacitroen.services;

import com.br.zup.concessionariacitroen.enums.Modelo;
import com.br.zup.concessionariacitroen.exceptions.CarroDuplicadoException;
import com.br.zup.concessionariacitroen.exceptions.CarroNaoEncontradoException;
import com.br.zup.concessionariacitroen.exceptions.EstoqueVazioException;
import com.br.zup.concessionariacitroen.models.Carro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarroService {
    private List<Carro> carros = new ArrayList<>();

    public Carro pesquisarCarroPeloModelo(Modelo modelo){
        for (Carro carro : carros){
            if (carro.getModelo().equals(modelo)){
                return carro;
            }
        }
        throw new CarroNaoEncontradoException();
    }

    public Carro pesquisarCarro(Carro carro) {
        return pesquisarCarroPeloModelo(carro.getModelo());
    }

    public boolean verificarSeCarroExiste(Carro carro) {
        for(Carro carroIndex : carros) {
            if(carroIndex.getModelo().equals(carro.getModelo())) {
                throw new CarroDuplicadoException();
            }
        }
        return false;
    }

    public List<Carro> listarTodosCarrosEmEstoque() {
        if(carros.isEmpty()) {
            throw new EstoqueVazioException();
        }
        return carros;
    }

    public Carro cadastrarCarro(Carro carro) {
        if(!verificarSeCarroExiste(carro));
        carros.add(carro);
        return carro;
    }

    public boolean removerCarroDoEstoque(Carro carro) {
        verificarSeCarroExiste(carro);
        carros.remove(carro);

        return true;
    }

    public boolean efetuarBaixaDoEstoque(Carro carro, int quantidade) {
        if (carro.getQuantidade() > 0) {
            carro.setQuantidade(carro.getQuantidade() - quantidade);
            return true;
        }
        throw new EstoqueVazioException();
    }
}
