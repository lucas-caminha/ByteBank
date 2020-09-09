package br.com.bytebank.banco.model;

public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}
