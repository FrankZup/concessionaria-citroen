package com.br.zup.concessionariacitroen.exceptions;

public class CarroNaoEncontradoException extends ExcecaoBasica{
    public CarroNaoEncontradoException() {
        super("Este carro não pertence a marca CITROEN",
                404,
                "modelo, Cor, Motor, Transmissão, Rodas, TipoCarro",
                "Not Found");
    }
}
