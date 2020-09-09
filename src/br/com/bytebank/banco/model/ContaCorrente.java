package br.com.bytebank.banco.model;

public class ContaCorrente extends Conta implements Tributavel {


    public ContaCorrente(double saldo, int agencia, int numero, Pessoa titular) {
        super(saldo, agencia, numero, titular);
    }

    public ContaCorrente() {
    }

    @Override
    public void deposita(double valor) {
        super.saldo = super.saldo + valor;
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.1;
    }
}
