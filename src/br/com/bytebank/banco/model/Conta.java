package br.com.bytebank.banco.model;

public abstract class Conta {

    // Atributos.
    protected double saldo;
    private int agencia;
    private int numero;
    private Pessoa titular;

    private static int totalContas;

    // Constructors.
    public Conta(double saldo, int agencia, int numero, Pessoa titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        Conta.totalContas++;
    }

    public Conta() {
    }

    // Getters and Setters.
    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Nº da Agencia não pode ter valor menor ou igual a 0.");
        } else {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    // Deposita o valor na conta
    public abstract void deposita(double valor);

    // Saca o valor verificando se o saldo é maior que o valor solicitado.
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }

    // Transfere o valor, verificando se o saldo da conta de origem é maior que o valor solicitado.
    public boolean transfere(double valor, Conta contaDestino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.deposita(valor);
            return true;
        } else{
            return false;
        }
    }

}
