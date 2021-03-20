package com.br.zup.concessionariacitroen.exceptions;

public class EstoqueVazioException extends ExcecaoBasica{
    public EstoqueVazioException() {
        super("O estoque está vazio",
                404,
                "Lista carros na classe CarroService",
                "Not Found");
    }
}
