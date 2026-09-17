package com.example.ac1p2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ac1p2.models.Diretor;

import java.util.List;

public interface DiretorRepository extends JpaRepository<Diretor, Long> {

    // Retorna todos os diretores cujo nome comece com o valor informado
    List<Diretor> findByNomeStartingWith(String nome);
}