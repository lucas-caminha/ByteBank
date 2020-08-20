public class Run {

    public static void main(String[] args) {

        Endereco enderecoGerente =
                new Endereco("Rua", "Jardim", 23, "Barra", "Salvador", "44422-123");

        Gerente gerente =
                new Gerente("Lucas", "444.333.222-00", 43, enderecoGerente, 3000.00, 9980);

        System.out.println(gerente.getBonificacao());




    }
}
