package br.com.test;

import br.com.modelo.Conta;
import br.com.modelo.ContaCorrente;
import br.com.modelo.ContaPoupanca;
import br.com.modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente cc = new ContaCorrente(77, 777);
        cc.deposito(200);

        ContaPoupanca cp = new ContaPoupanca(88, 888);
        cp.deposito(100);

        cc.transfere(50,cp);

        ContaCorrente contaTeste = new ContaCorrente(123, 123);

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
        System.out.println("Conta teste: " + contaTeste);
        System.out.println("Conta teste: " + contaTeste);
        System.out.println("Conta teste: " + contaTeste);

        System.out.println(cc);
        System.out.println(cp);
    }
}
