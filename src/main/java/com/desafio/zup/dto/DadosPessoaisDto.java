package com.desafio.zup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DadosPessoaisDto {

    private String nome;
    private String email;
    private String cpf;
    private String dataNascimento;
}