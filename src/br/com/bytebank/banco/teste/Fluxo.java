package br.com.bytebank.banco.teste;

public class Fluxo {

    public static void main(String[] args) {
        //System.out.println("Ini do main");
        //metodo1();
        //System.out.println("Fim do main");
        for (int i = 0; i < 10; i++){
            sequenciaFibonacci(i);
        }
    }

    static int sequenciaFibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return sequenciaFibonacci(n - 1) + sequenciaFibonacci(n - 2);
        }
    }


    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try{
            metodo2();
        } catch (ArithmeticException  | NullPointerException exception){
            System.out.println("Exception " + exception.getMessage());
            exception.printStackTrace();
        }

        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        throw new MinhaException("Minha Exception");

        //System.out.println("Fim do metodo2");
    }
}