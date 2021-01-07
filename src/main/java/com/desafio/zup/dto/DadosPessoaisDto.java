package com.desafio.zup.dto;

import com.sun.istack.NotNull;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DadosPessoaisDto {

    @NotNull
    @NotEmpty
    private String nome;

    @NotNull
    @NotEmpty
    private String email;

    @NotNull
    @NotEmpty
    private String cpf;

    @NotNull
    @NotEmpty
    private String dataNascimento;
}
