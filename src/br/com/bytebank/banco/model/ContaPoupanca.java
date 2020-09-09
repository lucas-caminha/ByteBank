package br.com.bytebank.banco.model;

public class ContaPoupanca extends Conta {




    @Override
    public void deposita(double valor) {
        super.saldo = super.saldo + valor;
    }
}
