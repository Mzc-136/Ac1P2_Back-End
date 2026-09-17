package com.example.ac1p2.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor 
@AllArgsConstructor 
public class Diretor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // Relacionamento Um Diretor para Muitos Filmes
    @OneToMany(mappedBy = "diretor", cascade = CascadeType.ALL)
    private List<Filme> filmes = new ArrayList<>();

    public Diretor(String nome) {
        this.nome = nome;
    }
}