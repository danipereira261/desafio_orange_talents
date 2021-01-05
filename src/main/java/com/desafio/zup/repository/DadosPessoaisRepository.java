package com.desafio.zup.repository;

import com.desafio.zup.model.DadosPessoaisModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosPessoaisRepository extends JpaRepository<DadosPessoaisModel, Long> {
}
