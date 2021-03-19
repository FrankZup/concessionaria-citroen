package com.br.zup.concessionariacitroen.models;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cliente {
    @NotEmpty(message = "Nome não pode estar vazio")
    @NotNull(message = "Nome não pode ser nulo")
    @Size(min = 3, message = "Quantidade mínima de caractéres 3")
    private String nome;

    @CPF(message = "CPF inválido")
    private String cpf;

    @Email(message = "E-mail inválido")
    private String email;

    @NotEmpty(message = "Telefone não pode estar vazio")
    @NotNull(message = "Telefone não pode ser nulo")
    @Size(min =10, message = "Quantidade mínima de caractéres 10 DDD+número")
    private String telefone;

    @NotEmpty(message = "Endereço não pode estar vazio")
    @NotNull(message = "Endereço não pode ser nulo")
    @Size(min = 3, message = "Quantidade mínima de caractéres 3")
    private String endereco;

    public Cliente() {}

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}
