package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

    public static void main(String[] args){

//        System.out.println("x");
//        System.out.println(3);
//        System.out.println(true);

        ContaCorrente cc = new ContaCorrente(123, 12345);
        ContaPoupanca cp = new ContaPoupanca(321, 54321);
        Cliente c = new Cliente();

        System.out.println(cc);
        System.out.println(cp);
        System.out.println(c);

    }

    static void println() {}
    static void println(int n) {}
    static void println(boolean bool) {}
    static void println(Object o) {}
}