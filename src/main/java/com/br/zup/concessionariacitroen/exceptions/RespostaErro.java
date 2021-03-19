package com.br.zup.concessionariacitroen.exceptions;

import org.springframework.http.HttpStatus;

import java.util.List;

public class RespostaErro {
    private String tipoErro;
    private int codigo;
    private HttpStatus status;
    private List<ObjetoErro> objetosDeErro;

    public RespostaErro(String tipoErro, int codigo, HttpStatus status, List<ObjetoErro> objetosDeErro) {
        this.tipoErro = tipoErro;
        this.codigo = codigo;
        this.status = status;
        this.objetosDeErro = objetosDeErro;
    }

    public RespostaErro() { }

    public String getTipoErro() { return tipoErro; }
    public void setTipoErro(String tipoErro) { this.tipoErro = tipoErro; }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public HttpStatus getStatus() { return status; }
    public void setStatus(HttpStatus status) { this.status = status; }

    public List<ObjetoErro> getObjetosDeErro() { return objetosDeErro; }
    public void setObjetosDeErro(List<ObjetoErro> objetosDeErro) {
        this.objetosDeErro = objetosDeErro;
    }
}
