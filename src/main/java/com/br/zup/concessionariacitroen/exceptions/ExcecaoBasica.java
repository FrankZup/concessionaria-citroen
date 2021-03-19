package com.br.zup.concessionariacitroen.exceptions;

public class ExcecaoBasica extends RuntimeException {
    private int status;
    private String campo;
    private String motivo;
    private String tipoErro;

    public ExcecaoBasica(String message, int status, String campo, String motivo, String tipoErro) {
        super(message);
        this.status = status;
        this.campo = campo;
        this.motivo = motivo;
        this.tipoErro = tipoErro;
    }

    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }

    public String getCampo() { return campo; }
    public void setCampo(String campo) { this.campo = campo; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public String getTipoErro() { return tipoErro; }
    public void setTipoErro(String tipoErro) { this.tipoErro = tipoErro; }
}
