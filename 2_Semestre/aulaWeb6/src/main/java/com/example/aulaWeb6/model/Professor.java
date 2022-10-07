package com.example.aulaWeb6.model;

import javax.persistence.*;

@Entity
@Table(name = "ProfessorWeb")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matricula;

    @Column
    private String nome;

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
