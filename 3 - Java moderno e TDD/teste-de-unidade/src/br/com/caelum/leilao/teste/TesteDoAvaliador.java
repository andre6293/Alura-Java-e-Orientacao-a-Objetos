package br.com.caelum.leilao.teste;

import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TesteDoAvaliador {
    
    @Test
    public void deveEntenderLancesEmOrdemCrescente() {
        
        // parte 1: cenário
        Usuario joao = new Usuario("João");
        Usuario jose = new Usuario("José");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 5");

        leilao.propoe(new Lance(maria, 250.0));
        leilao.propoe(new Lance(joao, 300.0));
        leilao.propoe(new Lance(jose, 400.0));
        
        // parte 2: ação
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avaliar(leilao);

        // parte 3: validação
        double maiorEsperado = 400.0;
        double menorEsperado = 250.0;

        assertEquals(maiorEsperado, leiloeiro.getMaiorDeTodos(), 0.00001);
        assertEquals(menorEsperado, leiloeiro.getMenorDeTodos(), 0.00001);
    }

    @Test
    public void deveEntenderLeilaoComApenasUmLance() {

        // parte 1: cenário
        Usuario joao = new Usuario("João");

        Leilao leilao = new Leilao("Playstation 5");

        leilao.propoe(new Lance(joao, 1000.0));

        // parte 2: ação
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avaliar(leilao);

        // parte 3: validação
        double maiorEsperado = 1000.0;
        double menorEsperado = 1000.0;

        assertEquals(maiorEsperado, leiloeiro.getMaiorDeTodos(), 0.00001);
        assertEquals(menorEsperado, leiloeiro.getMenorDeTodos(), 0.00001);
    }

    @Test
    public void deveEncontrarTresMaiores() {
        Usuario joao = new Usuario("Joao");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 5");

        leilao.propoe(new Lance(joao, 400.0));
        leilao.propoe(new Lance(maria, 450.0));
        leilao.propoe(new Lance(joao, 550.0));
        leilao.propoe(new Lance(maria, 580.0));

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avaliar(leilao);

        List<Lance> maiores = leiloeiro.getTresMaiores();
        assertEquals(3, maiores.size());
        assertEquals(580.0, maiores.get(0).getValor(), 0.00001);
        assertEquals(550.0, maiores.get(1).getValor(), 0.00001);
        assertEquals(450.0, maiores.get(2).getValor(), 0.00001);
    }
}
