package com.desafio.zup.controller;


import com.desafio.zup.dto.DadosPessoaisDto;
import com.desafio.zup.model.DadosPessoaisModel;
import com.desafio.zup.repository.DadosPessoaisRepository;
import jakarta.validation.Valid;
import org.postgresql.util.PSQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados-pessoais")
public class DadosPessoaisController {

    @Autowired
    private DadosPessoaisRepository repository;

    @PostMapping(value = "/cad")
    public ResponseEntity<DadosPessoaisDto> cadastrar(@RequestBody @Valid DadosPessoaisDto dadosPessoaisDto) {

        DadosPessoaisModel data = new DadosPessoaisModel();
        data.setNome(dadosPessoaisDto.getNome());
        data.setCpf(dadosPessoaisDto.getCpf());
        data.setEmail(dadosPessoaisDto.getEmail());
        data.setDataNascimento(dadosPessoaisDto.getDataNascimento());

        try {
            repository.save(data);
        }catch (Exception e){
            throw new PSQLException("Dados duplicados");
        }
        System.out.println(dadosPessoaisDto);
        return new ResponseEntity<DadosPessoaisDto>(HttpStatus.OK);

    }
}
