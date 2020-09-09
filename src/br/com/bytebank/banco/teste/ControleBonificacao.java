package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.Funcionario;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario funcionario){
        double bonificacao = funcionario.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double getSoma() {
        return this.soma;
    }
}
