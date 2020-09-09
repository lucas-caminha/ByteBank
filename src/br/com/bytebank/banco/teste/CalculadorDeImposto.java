package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.Tributavel;

public class CalculadorDeImposto implements Tributavel {

    private double totalImposto;

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }


    @Override
    public double getValorImposto() {
        return this.totalImposto;
    }
}
