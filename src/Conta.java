  public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    Cliente titular;
    private static int total;

    public abstract void deposito(double valor);

    public boolean sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino){
        if(sacar(valor)){
            destino.deposito(valor);
            return true;
        }
        return false;
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
