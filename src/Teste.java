public class Teste {

    public static void main(String[] args) {

        Conta c1 = new Conta();

        Endereco enderecoLucas = new Endereco("Rua", "Jardim", 12, "Barra", "New York", "xxxxx-xxx");
        Cliente lucas = new Cliente("Lucas", "xxx.xxx.xxx-xx", 41, enderecoLucas);

        c1.setTitular(lucas);

        System.out.println(c1.getTitular().getNome());
        System.out.println(c1.getTitular().getEndereco().getBairro());


    }
}
