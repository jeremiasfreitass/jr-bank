package br.com.test;

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

        System.out.println("Saldo br.com.modelo.Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo br.com.modelo.Conta Poupança: " + cp.getSaldo());

        System.out.println(cc);
    }
}
