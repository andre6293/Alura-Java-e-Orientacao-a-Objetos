package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

    public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente(123, 4532);
        c.depositar(200);
        try {
            c.sacar(300);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }

        System.out.println(c.getSaldo());
    }
}
