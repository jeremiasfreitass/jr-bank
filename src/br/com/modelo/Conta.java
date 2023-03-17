package br.com.modelo;

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    Cliente titular;
    private static int total;

    public abstract void deposito(double valor);

    public void sacar(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.sacar(valor);
        destino.deposito(valor);
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Conta(int agencia, int numero) {
        total ++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
