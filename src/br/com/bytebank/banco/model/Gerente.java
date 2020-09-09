package br.com.bytebank.banco.model;

import br.com.bytebank.banco.teste.AutenticacaoUtil;

public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    // Constructors
    public Gerente(String nome, String cpf, int idade, Endereco endereco, double salario, int senha) {
        super(nome, cpf, idade, endereco, salario);
        this.autenticador.setSenha(senha);
    }

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.2;
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
