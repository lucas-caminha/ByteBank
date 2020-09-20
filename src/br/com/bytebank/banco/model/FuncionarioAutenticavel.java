package br.com.bytebank.banco.model;

import br.com.bytebank.banco.model.Endereco;
import br.com.bytebank.banco.model.Funcionario;

public abstract class FuncionarioAutenticavel extends Funcionario {

    protected int senha;

    public FuncionarioAutenticavel() {
    }

    public FuncionarioAutenticavel(String nome, String cpf, int idade, Endereco endereco, double salario, int senha) {
        super(nome, cpf, idade, endereco, salario);
        this.senha = senha;
    }

    // Getters and Setters
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if (this.senha == senha){
            return true;
        } else{
            return false;
        }
    }

}
