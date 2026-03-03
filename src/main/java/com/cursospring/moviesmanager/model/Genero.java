package com.cursospring.moviesmanager.model;

import jakarta.persistence.*;

@Entity
@Table(name="t_genre")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public Genero() {
    }

    public Genero(String name) {
        this.name = name;
    }

    public Genero(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
