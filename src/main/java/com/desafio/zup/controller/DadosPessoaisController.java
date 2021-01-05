package com.desafio.zup.controller;


import com.desafio.zup.dto.DadosPessoaisDto;
import com.desafio.zup.model.DadosPessoaisModel;
import com.desafio.zup.repository.DadosPessoaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados-pessoais")
public class DadosPessoaisController {

    @Autowired
    private DadosPessoaisRepository repository;

    @PostMapping
    public String cadastrar(@RequestBody DadosPessoaisDto dadosPessoaisDto) {

        DadosPessoaisModel data = new DadosPessoaisModel();
        data.setNome(dadosPessoaisDto.getNome());
        data.setCpf(dadosPessoaisDto.getCpf());
        data.setEmail(dadosPessoaisDto.getEmail());
        data.setDataNascimento(dadosPessoaisDto.getDataNascimento());




        repository.save(data);
        System.out.println(dadosPessoaisDto);
        return "Sucesso";

    }
}
