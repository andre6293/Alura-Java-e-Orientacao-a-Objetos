package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {

//        Conta[] contas = new Conta[5];
        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(10, 11);
        referencias[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(22, 22);
        referencias[1] = cc2;

        ContaPoupanca cp1 = new ContaPoupanca(31, 134);
        referencias[3] = cp1;

        Cliente cliente = new Cliente();
        referencias[4] = cliente;

        System.out.println(referencias[1]);
        System.out.println(referencias[3]);

        ContaPoupanca ref = (ContaPoupanca) referencias[3]; //type cast


    }
}
