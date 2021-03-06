package com.lamppit.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lamppit.desafio.model.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer>{

}
