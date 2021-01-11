package com.desafio.zup.controller;

import com.desafio.zup.dto.DadosPessoaisDto;
import com.desafio.zup.exception.InvalidParamException;
import com.desafio.zup.model.DadosPessoaisModel;
import com.desafio.zup.repository.DadosPessoaisRepository;
import com.desafio.zup.service.DadosPessoaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados-pessoais")
public class DadosPessoaisController {

    @Autowired
    private DadosPessoaisService service;

    @PostMapping(value = "/cad")
    public ResponseEntity<DadosPessoaisDto> cadastrar(@RequestBody @Valid DadosPessoaisDto dadosPessoaisDto)
            throws InvalidParamException {

        service.process(dadosPessoaisDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}