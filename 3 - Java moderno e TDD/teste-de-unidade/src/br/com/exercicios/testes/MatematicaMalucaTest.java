package br.com.exercicios.testes;

import br.com.exercicios.classes.MatematicaMaluca;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatematicaMalucaTest {

    MatematicaMaluca classe = new MatematicaMaluca();

    @Test
    public void entradaMaiorDoQue30 () {
        assertEquals(50*4, classe.contaMaluca(50));
    }

    @Test
    public void entradaMaiorDoQue10 () {
        assertEquals(12*3, classe.contaMaluca(12));
    }

    @Test
    public void entradaMenorDoQue10 () {
        assertEquals(6*2, classe.contaMaluca(6));
    }

}
