package br.com.test;

import br.com.Conta;
import br.com.ContaCorrente;
import br.com.SaldoInsuficienteException;

public class TesteSacar {
    public static void main(String[] args) {

        Conta conta = new ContaCorrente(123,123);

        conta.deposito(200.0);
        try {
            conta.sacar(210.0);
        }catch(SaldoInsuficienteException e){
            System.out.println("Ex: " + e.getMessage());
        }
        System.out.println(conta.getSaldo());
    }
}
