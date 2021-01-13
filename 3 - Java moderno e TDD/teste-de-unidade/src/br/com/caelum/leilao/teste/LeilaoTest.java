package br.com.caelum.leilao.teste;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;
import br.com.caelum.leilao.servico.Avaliador;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeilaoTest {

    @Test
    public void deveReceberUmLance() {
        Leilao leilao = new Leilao("Macbook");
        assertEquals(0, leilao.getLances().size());

        leilao.propoe(new Lance(new Usuario("Shepard"), 3000.0));
        assertEquals(1, leilao.getLances().size());
        assertEquals(3000.0, leilao.getLances().get(0).getValor(), 0.0001);
    }

    @Test
    public void deveReceberVariosLances() {
        Leilao leilao = new Leilao("Macbook");

        leilao.propoe(new Lance(new Usuario("Urdnot Wrex"), 2000.0));
        leilao.propoe(new Lance(new Usuario("Liara Tsoni"), 2500.0));
        leilao.propoe(new Lance(new Usuario("Garrus Vakarian"), 3000.0));

        assertEquals(3, leilao.getLances().size());
        assertEquals(2000, leilao.getLances().get(0).getValor(), 0.0001);
        assertEquals(2500, leilao.getLances().get(1).getValor(), 0.0001);
        assertEquals(3000, leilao.getLances().get(2).getValor(), 0.0001);

    }

    @Test
    public void naoDeveAceitarDoisLancesSeguidosDoMesmoUsuario() {
        Leilao leilao = new Leilao("Produto x");
        Usuario mordin = new Usuario("Mordin Solus");

        leilao.propoe(new Lance(mordin, 300.0));
        leilao.propoe(new Lance(mordin, 400.0));

        assertEquals(1, leilao.getLances().size());
        assertEquals(300, leilao.getLances().get(0).getValor(), 0.0001);
    }

    @Test
    public void naoDeveAceitarMaisDoQueCincoLancesDoMesmoUsuario() {
        Leilao leilao = new Leilao("Produto y");
        Usuario miranda = new Usuario("Miranda Lawson");
        Usuario ashley = new Usuario("Ashley Williams");

        leilao.propoe(new Lance(miranda, 100.0));
        leilao.propoe(new Lance(ashley, 200.0));

        leilao.propoe(new Lance(miranda, 300.0));
        leilao.propoe(new Lance(ashley, 400.0));

        leilao.propoe(new Lance(miranda, 500.0));
        leilao.propoe(new Lance(ashley, 600.0));

        leilao.propoe(new Lance(miranda, 700.0));
        leilao.propoe(new Lance(ashley, 800.0));

        leilao.propoe(new Lance(miranda, 900.0));
        leilao.propoe(new Lance(ashley, 1000.0));

        leilao.propoe(new Lance(miranda, 1100.0)); // DEVE SER IGNORADO


        assertEquals(10, leilao.getLances().size());
        assertEquals(1000.0, leilao.getLances().get(leilao.getLances().size() - 1).getValor(), 0.0001);
    }

    @Test
    public void dobraLance() {
        Leilao leilao = new Leilao("produto z");
        Usuario jacob = new Usuario("Jacob Taylor");
        Usuario kasumi = new Usuario("Kasumi Goto");


        leilao.propoe(new Lance(jacob, 300.0));
        leilao.propoe(new Lance(kasumi, 400.0));
        leilao.dobraLance(jacob);

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avaliar(leilao);

        assertEquals(600.0, leiloeiro.getMaiorDeTodos(), 0.0001);

    }

    @Test
    public void naoDeveDobrarSemLanceAnterior() {
        Leilao leilao = new Leilao("produto z");
        Usuario jacob = new Usuario("Jacob Taylor");

        leilao.dobraLance(jacob);

        assertEquals(0, leilao.getLances().size());
    }
}
