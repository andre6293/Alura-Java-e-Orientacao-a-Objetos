package br.com.caelum.leilao.teste;

import br.com.caelum.leilao.builder.CriadorDeLeilao;
import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class AvaliadorTestSimplificado {

    private Avaliador leiloeiro;
    private Usuario joao;
    private Usuario jose;
    private Usuario maria;

    @Before
    public void criaAvaliador() {
        leiloeiro = new Avaliador();
        joao = new Usuario("João");
        jose = new Usuario("José");
        maria = new Usuario("Maria");
    }

    @After
    public void finaliza() {
        System.out.println("Teste completado.");
    }

    @Test
    public void deveEntenderLancesEmOrdemCrescente() {
        Leilao leilao = new Leilao("Playstation 5");

        leilao.propoe(new Lance(maria, 250.0));
        leilao.propoe(new Lance(joao, 300.0));
        leilao.propoe(new Lance(jose, 400.0));
        
        leiloeiro.avaliar(leilao);

        double maiorEsperado = 400.0;
        double menorEsperado = 250.0;

        assertThat(leiloeiro.getMaiorDeTodos(), equalTo(400.0));
        assertThat(leiloeiro.getMenorDeTodos(), equalTo(250.0));
    }

    @Test
    public void deveEntenderLeilaoComApenasUmLance() {
        Leilao leilao = new Leilao("Playstation 5");
        leilao.propoe(new Lance(joao, 1000.0));

        leiloeiro.avaliar(leilao);

        double maiorEsperado = 1000.0;
        double menorEsperado = 1000.0;

        assertThat(leiloeiro.getMaiorDeTodos(), equalTo(1000.0));
        assertThat(leiloeiro.getMenorDeTodos(), equalTo(1000.0));
    }

    @Test
    public void deveEncontrarTresMaiores() {
        Leilao leilao = new CriadorDeLeilao().para("Playstation 5")
                .lance(joao, 400.0)
                .lance(maria, 450.0)
                .lance(joao, 550.0)
                .lance(maria, 580)
                .constroi();

        leiloeiro.avaliar(leilao);

        List<Lance> maiores = leiloeiro.getTresMaiores();
        assertEquals(3, maiores.size());
        assertThat(maiores, hasItems(
                new Lance(maria, 580),
                new Lance(joao, 550),
                new Lance(maria, 450)
                ));
    }

    @Test(expected = RuntimeException.class)
    public void naoDeveAvaliarLeiloesSemLances() {
        Leilao leilao = new CriadorDeLeilao().para("Produto xyz")
                .constroi();
        leiloeiro.avaliar(leilao);
    }
}
