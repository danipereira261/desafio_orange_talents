package com.desafio.zup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DadosPessoaisDto {

    @NotNull(message = "Nome obrigatório")
    @NotEmpty(message = "Nome não pode ser vazio")
    private String nome;

    @NotNull(message = "Email obrigatório")
    @NotEmpty(message = "Email não pode ser vazio")
    @Email(message = "Email precisa ser válido")
    private String email;

    @NotNull(message = "Cpf obrigatório")
    @NotEmpty(message = "Cpf não pode ser vazio")
    @CPF(message = "CPF precisa ser válido")
    private String cpf;

    @NotNull(message = "Data Nascimento obrigatório")
    @NotEmpty(message = "Data Nascimento não pode ser vazio")
    private String dataNascimento;
}