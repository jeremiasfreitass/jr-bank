public class TesteTributaveis {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(3614,1234);
        contaCorrente.deposito(100);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.registra(contaCorrente);
        calculadorDeImposto.registra(seguroDeVida);

        System.out.println(calculadorDeImposto.getTotalImposto());
    }
}
