package br.com.exercicios.testes;

import br.com.exercicios.classes.AnoBissexto;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnoBissextoTest {

    @Test
    public void anoBissexto() {
        AnoBissexto aB = new AnoBissexto();
        assertTrue(aB.ehBissexto(2012));
        assertTrue(aB.ehBissexto(2016));
        assertTrue(aB.ehBissexto(2020));
    }

    @Test
    public void anoNaoBissexto() {
        AnoBissexto aB = new AnoBissexto();
        assertFalse(aB.ehBissexto(2013));
        assertFalse(aB.ehBissexto(2015));
        assertFalse(aB.ehBissexto(2021));
    }
}
