public class TesteContas {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(77, 777);
        cc.deposito(200);

        ContaPoupanca cp = new ContaPoupanca(88, 888);
        cp.deposito(100);

        cc.transfere(50,cp);

        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
    }
}
