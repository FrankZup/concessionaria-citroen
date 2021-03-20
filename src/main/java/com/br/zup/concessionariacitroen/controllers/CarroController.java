package com.br.zup.concessionariacitroen.controllers;


import com.br.zup.concessionariacitroen.DTOs.CadastroCarroDTO;
import com.br.zup.concessionariacitroen.models.Carro;
import com.br.zup.concessionariacitroen.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
}
