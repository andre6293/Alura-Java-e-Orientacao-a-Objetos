package br.com.caelum.leilao.teste;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import org.junit.Before;
import org.junit.Test;

public class LanceTest {

    private Leilao leilao;
    private Usuario usuario;

    @Before
    public void criaLeilao() {
        leilao = new Leilao("Produto x");
        usuario = new Usuario("Fulano");
    }


    @Test(expected = IllegalArgumentException.class)
    public void naoDeveReceberValoresNegativos() {
        leilao.propoe(new Lance(usuario, -100.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveReceberZeroComoValor() {
        leilao.propoe(new Lance(usuario, 0));
    }
}
