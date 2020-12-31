package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 112);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(2, 13);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(24, 152);
        lista.add(cc4);

        for (Object o : lista) {
            System.out.println(o);
        }
    }
}
