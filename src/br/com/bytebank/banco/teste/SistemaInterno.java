package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.Gerente;

public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Gerente gerente){
        boolean autenticou = gerente.autentica(senha);
        if (autenticou){
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Acesso Negado.");
        }
    }
}
