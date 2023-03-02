public class CriaConta {
    public static void main(String[] args) {

//        Conta primeiraConta = new Conta();
//        primeiraConta.sacar(200);
//
//        Conta segundaConta = new Conta();
//        segundaConta.deposito(350.3);
//
//        System.out.println("O saldo da primeira conta é " + primeiraConta.getSaldo());
//        System.out.println("O saldo da segunda conta é " + segundaConta.getSaldo());

        Conta contaJere = new Conta(1234, 9999);
        Conta contaJere1 = new Conta(1234, 9999);
        Conta contaJere2 = new Conta(1234, 9999);
        Cliente jere = new Cliente();

        contaJere.setNumero(31018);
        System.out.println(contaJere.getNumero());

        contaJere.setTitular(jere);

        jere.setNome("Jeremias Freitas");

        System.out.println(contaJere.getTitular().getNome());

        contaJere.getTitular().setProfissao("Programador");
        System.out.println(contaJere.getTitular().getProfissao());

        System.out.println("Total de contas: " + Conta.getTotal());





    }
}