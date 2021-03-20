package com.br.zup.concessionariacitroen.services;

import com.br.zup.concessionariacitroen.enums.Modelo;
import com.br.zup.concessionariacitroen.exceptions.CarroDuplicadoException;
import com.br.zup.concessionariacitroen.exceptions.CarroNaoEncontradoException;
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
        if(pesquisarCarro(carro) != null) {
            throw new CarroDuplicadoException();
        }
        return true;
    }

    public Carro cadastrarCarro(Carro carro) {
        verificarSeCarroExiste(carro);
        carros.add(carro);
        return carro;
    }
}
