public class Teste {

    public static void main(String[] args) {



        Endereco enderecoLucas = new Endereco("Rua", "Jardim", 12, "Barra", "New York", "xxxxx-xxx");
        Cliente lucas = new Cliente("Lucas", "xxx.xxx.xxx-xx", 41, enderecoLucas);

        Conta c1 = new Conta(0,1,4443332, lucas);

        System.out.println(c1.getTitular().getNome());
        System.out.println(c1.getTitular().getEndereco().getBairro());

        System.out.println(Conta.getTotalContas());



    }
}
