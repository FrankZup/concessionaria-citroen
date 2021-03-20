package com.br.zup.concessionariacitroen.exceptions;

public class NaoHaVendasCadastradasException extends ExcecaoBasica{
    public NaoHaVendasCadastradasException() {
        super("Não há vendas cadastradas", 404, "numeroVenda", "Not Found");
    }
}
