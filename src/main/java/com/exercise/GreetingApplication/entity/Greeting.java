package com.exercise.GreetingApplication.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Greeting")
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String provincia;
    private String saluto;

    public Greeting() {}

    public Greeting(String nome, String provincia, String saluto) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = saluto;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getSaluto() {
        return saluto;
    }
}
