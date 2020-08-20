public class Funcionario extends Pessoa{

    private double salario;

    // Constructors.
    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, int idade, Endereco endereco, double salario) {
        super(nome, cpf, idade, endereco);
        this.salario = salario;
    }


    // Getters and Setters.
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Metods

    // Bonificação.
    public double getBonificacao(){
        return this.salario * 0.05;
    }
}
