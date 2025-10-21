package com.PedroNunes.Cadastro.Usuario.SprinBoot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(name="nome", nullable=false)
    private String nome;
    @Column(name="email", unique=true)
    private String email;
    @Column(name="senha", nullable=false)
    private String senha;
    @Transient
    private EmailVerificacao validarEmail;
    public Usuario() {
    }

    public Usuario(String nome,String email,String senha) {
        this.nome = nome;
        this.validarEmail = new EmailVerificacao(email);
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

    public void setEmail(String email) {
        this.validarEmail = new EmailVerificacao(email);   //Obtem o email e verifica se é válido!

        if (validarEmail != null){
            this.email = validarEmail.getEmailValidacao();   //Caso seja válido, atribui diretamente ao email da classe!
        }
        else{
            this.email = null;
        }
    }

    public String getSenha() {
        return senha;
    }
}
