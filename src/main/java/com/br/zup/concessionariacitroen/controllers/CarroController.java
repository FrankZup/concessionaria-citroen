package com.br.zup.concessionariacitroen.controllers;


import com.br.zup.concessionariacitroen.DTOs.CadastroCarroDTO;
import com.br.zup.concessionariacitroen.enums.Modelo;
import com.br.zup.concessionariacitroen.exceptions.CarroNaoEncontradoException;
import com.br.zup.concessionariacitroen.models.Carro;
import com.br.zup.concessionariacitroen.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("carros/")
public class CarroController {
    @Autowired
    private CarroService carroService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Carro cadastrarCarro(@RequestBody @Valid CadastroCarroDTO cadastroCarroDTO){
        return carroService.cadastrarCarro(cadastroCarroDTO.converterDTOParaCarro());

    }

    @GetMapping
    public List<Carro> listarTodosCarrosEmEstoque(){
        return carroService.listarTodosCarrosEmEstoque();
    }

    @GetMapping({"{modelo}/"})
    public Carro pesquisarCarroPeloModelo(@PathVariable Modelo modelo) {
            return carroService.pesquisarCarroPeloModelo(modelo);
    }
}
