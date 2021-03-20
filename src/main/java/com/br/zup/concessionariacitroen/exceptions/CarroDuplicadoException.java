package com.br.zup.concessionariacitroen.exceptions;

public class CarroDuplicadoException extends ExcecaoBasica{
    public CarroDuplicadoException() {
    super("Carro já cadastrado, necessário somente incluir unidades no estoque.",
            422,
            "modelo, Cor, Motor, Transmissão, Rodas, TipoCarro",
            "Unprocesable Entity");
    }
}
