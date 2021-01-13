package br.com.exercicios.testes;

import br.com.exercicios.classes.NotaFiscal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NotaFiscalTest {

    @Test
    public void testaValorAcimaDe2000() {
        NotaFiscal nf = new NotaFiscal();
        nf.setValor(3000.0);

        assertEquals(3000.0 * 0.03, nf.calculaImposto(nf), 0.0001);
    }

    @Test
    public void testaValorAbaixoDe2000() {
        NotaFiscal nf = new NotaFiscal();
        nf.setValor(1200.0);

        assertEquals(1200.0 * 0.02, nf.calculaImposto(nf), 0.0001);
    }
}
