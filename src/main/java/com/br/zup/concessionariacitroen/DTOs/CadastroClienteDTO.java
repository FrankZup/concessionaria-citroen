package com.br.zup.concessionariacitroen.DTOs;

import com.br.zup.concessionariacitroen.models.Carro;
import com.br.zup.concessionariacitroen.models.Cliente;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class CadastroClienteDTO {
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
    @NotBlank(message = "Não é permitido cadastrar espaços em branco")
    private String telefone;

    @NotEmpty(message = "Endereço não pode estar vazio")
    @NotNull(message = "Endereço não pode ser nulo")
    @NotBlank(message = "Não é permitido cadastrar espaços em branco")
    @Size(min = 3, message = "Quantidade mínima de caractéres 3")
    private String endereco;

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

    public Cliente converterDTOParaCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome(this.nome);
        cliente.setCpf(this.cpf);
        cliente.setEmail(this.email);
        cliente.setTelefone(this.telefone);
        cliente.setEndereco(this.endereco);
        cliente.setDataCadastro(LocalDate.now());

        return cliente;
    }
}
