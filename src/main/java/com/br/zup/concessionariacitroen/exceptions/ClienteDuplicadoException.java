package com.br.zup.concessionariacitroen.exceptions;

public class ClienteDuplicadoException extends ExcecaoBasica {
    public ClienteDuplicadoException(){
        super("Cliente já cadastrado", 422,
                "cpf",  "Unprocesable Entity");
    }
}
