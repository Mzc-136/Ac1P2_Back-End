package com.example.ac1p2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private Integer duracao;

    // Relacionamento Muitos Filmes para Um Diretor
    @ManyToOne
    @JoinColumn(name = "diretor_id")
    @ToString.Exclude // Evita recursão infinita no toString() do Lombok
    private Diretor diretor;

    public Filme(String titulo, Integer duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public Filme(String titulo, Integer duracao, Diretor diretor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.diretor = diretor;
    }
}    