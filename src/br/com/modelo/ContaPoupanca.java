package br.com.modelo;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposito(double valor) {
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta Poupança: " + super.toString();
    }
}
