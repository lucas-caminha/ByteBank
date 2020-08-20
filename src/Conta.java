public class Conta {

    // Atributos.
    
    private double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular;

    // Constructors.
    public Conta(double saldo, int agencia, int numero, Cliente titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
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

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    // Deposita o valor na conta
    public void deposita(double valor){
        this.saldo += valor;
    }

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
