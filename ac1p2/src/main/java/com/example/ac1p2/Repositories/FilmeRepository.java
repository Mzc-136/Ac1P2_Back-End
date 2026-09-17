package com.example.ac1p2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ac1p2.models.Filme;

import java.util.List;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

    // Retorna todos os filmes com duração maior que o valor informado
    List<Filme> findByDuracaoGreaterThan(Integer duracao);

    // Retorna todos os filmes com duração menor ou igual ao valor informado
    List<Filme> findByDuracaoLessThanEqual(Integer duracao);

    // Retorna todos os filmes cujo título comece com o texto informado
    List<Filme> findByTituloStartingWith(String titulo);
}