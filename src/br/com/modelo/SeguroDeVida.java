package br.com.modelo;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 100;
    }
}
