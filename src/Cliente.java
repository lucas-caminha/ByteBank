public class Cliente extends Pessoa {

    private int numeroIdentificador;

    // Constructor
    public Cliente(String nome, String cpf, int idade, Endereco endereco, int numeroIdentificador) {
        super(nome, cpf, idade, endereco);
        this.numeroIdentificador = numeroIdentificador;
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
}
