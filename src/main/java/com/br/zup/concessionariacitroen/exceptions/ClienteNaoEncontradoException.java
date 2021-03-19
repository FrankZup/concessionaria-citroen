package com.br.zup.concessionariacitroen.exceptions;

public class ClienteNaoEncontradoException extends ExcecaoBasica {
    public ClienteNaoEncontradoException(){
        super("Cliente não encontrado", 422, null, "Unprocesable Entity");
    }
}
