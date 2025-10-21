package com.PedroNunes.Cadastro.Usuario.SprinBoot.model;

public class EmailVerificacao {
    private String emailValidacao;

    public EmailVerificacao() {
    }

    public EmailVerificacao(String emailAnalisado) {
        String[] vetor = emailAnalisado.split("@");
        if(vetor.length>1) {                    //Verifica se o email foi "splitado"
            this.emailValidacao = emailAnalisado;
        } else {
            this.emailValidacao = null;         //Caso não retornará null.
        }
    }

    public String getEmailValidacao() {
        return emailValidacao;
    }
}
