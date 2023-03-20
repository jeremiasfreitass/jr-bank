package br.com.modelo;

public class ContaCorrente extends Conta implements Tributavel {
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        double valorASacar = valor + 0.2;
        super.sacar(valorASacar);
    }

    @Override
    public void deposito(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public String toString() {
        return "Conta Corrente. Número: " + getNumero();
    }
}
