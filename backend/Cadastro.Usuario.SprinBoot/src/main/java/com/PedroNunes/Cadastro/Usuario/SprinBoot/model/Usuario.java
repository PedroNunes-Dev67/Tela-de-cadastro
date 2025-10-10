package com.PedroNunes.Cadastro.Usuario.SprinBoot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(name="nome", unique=true, nullable=false)
    private String nome;
    @Column(name="email", nullable=false)
    private String email;
    @Column(name="senha", nullable=false)
    private String senha;

    public Usuario() {
    }

    public Usuario(String nome,String email,String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

}
