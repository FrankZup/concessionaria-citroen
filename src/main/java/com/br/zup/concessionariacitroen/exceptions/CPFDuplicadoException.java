package com.br.zup.concessionariacitroen.exceptions;

public class CPFDuplicadoException extends ExcecaoBasica {
    public CPFDuplicadoException(){
        super("Cliente já cadastrado", 422, null, "Unprocesable Entity");
    }
}
