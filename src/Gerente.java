public class Gerente extends Funcionario {

    private int senha;

    // Constructors
    public Gerente(String nome, String cpf, int idade, Endereco endereco, double salario, int senha) {
        super(nome, cpf, idade, endereco, salario);
        this.senha = senha;
    }

    public Gerente() {
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

    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.1;
    }
}
