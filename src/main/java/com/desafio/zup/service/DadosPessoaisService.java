package com.desafio.zup.service;

import com.desafio.zup.dto.DadosPessoaisDto;
import com.desafio.zup.exception.InvalidParamException;
import com.desafio.zup.model.DadosPessoaisModel;
import com.desafio.zup.repository.DadosPessoaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadosPessoaisService {

    @Autowired
    private DadosPessoaisRepository repository;

    public void process(DadosPessoaisDto dadosPessoaisDto) throws InvalidParamException {

        DadosPessoaisModel dataModel = new DadosPessoaisModel();
        dataModel.setNome(dadosPessoaisDto.getNome());
        dataModel.setCpf(dadosPessoaisDto.getCpf());
        dataModel.setEmail(dadosPessoaisDto.getEmail());
        dataModel.setDataNascimento(dadosPessoaisDto.getDataNascimento());

        try {
            repository.save(dataModel);
        } catch (Exception e) {
            throw new InvalidParamException("Dados duplicados");
        }
    }
}
