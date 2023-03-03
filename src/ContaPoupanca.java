public class ContaPoupanca extends Conta{
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposito(double valor) {
        super.saldo += valor;
    }

}
