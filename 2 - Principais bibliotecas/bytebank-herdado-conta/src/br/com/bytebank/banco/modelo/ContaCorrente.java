package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel {
    
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        double valorSacar = valor + 0.20;
        super.sacar(valorSacar);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public String toString() {
        return "Tipo: CC, " + super.toString();
    }
}
