package br.com.bytebank.banco.model;


import br.com.bytebank.banco.teste.AutenticacaoUtil;

public class Cliente extends Pessoa implements Autenticavel {

    private int numeroIdentificador;
    private AutenticacaoUtil autenticador;

    // Constructor
    public Cliente(String nome, String cpf, int idade, Endereco endereco, int numeroIdentificador) {
        super(nome, cpf, idade, endereco);
        this.numeroIdentificador = numeroIdentificador;
        this.autenticador = new AutenticacaoUtil();
    }

    public Cliente(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    // Getters and Setters
    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
