package com.br.zup.concessionariacitroen.exceptions;

public class VendaDuplicadaException extends ExcecaoBasica {
    public VendaDuplicadaException() {
    super(
        "Já existe essa venda",
                422,
                "numeroVenda",
                "Unprocesable Entity"
        );
    }
}
