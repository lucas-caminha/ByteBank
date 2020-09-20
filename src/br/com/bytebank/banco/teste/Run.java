package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

import java.util.ArrayList;

public class Run {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList();

        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        ContaCorrente c3 = new ContaCorrente();

        lista.add(c1);
        lista.add(c2);
        lista.add(c3);

        System.out.println(lista.size());

        //foreach
        for(Object oRef : lista){
            System.out.println(oRef);
        }





    }
}
