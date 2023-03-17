package br.com.modelo;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String message){
        super(message);
    }
}
