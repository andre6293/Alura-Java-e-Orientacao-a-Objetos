package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.depositar(100.0);

        SeguroDeVida sv = new SeguroDeVida();

        CalculadorImposto calc = new CalculadorImposto();

        calc.registrar(cc);
        calc.registrar(sv);

        System.out.println(calc.getTotalImposto());

    }
}
