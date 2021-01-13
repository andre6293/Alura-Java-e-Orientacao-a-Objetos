package br.com.exercicios.classes;

public class NotaFiscal {

    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calculaImposto(NotaFiscal nf) {
        if (nf.getValor() > 2000) return nf.getValor() * 0.03;
        return nf.getValor() * 0.02;
    }
}
