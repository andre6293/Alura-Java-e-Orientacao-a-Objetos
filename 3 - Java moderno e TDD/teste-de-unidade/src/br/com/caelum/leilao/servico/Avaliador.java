package br.com.caelum.leilao.servico;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Avaliador {
    private double maiorDeTodos = Double.NEGATIVE_INFINITY;
    private double menorDeTodos = Double.POSITIVE_INFINITY;
    List<Lance> maiores;

    public void avaliar(Leilao leilao) {
        if (leilao.getLances().size() == 0) {
            throw new RuntimeException("Não é possível avaliar leilões sem lances.");
        }

        for(Lance lance : leilao.getLances()) {
            if(lance.getValor() > maiorDeTodos)
                maiorDeTodos = lance.getValor();
            if(lance.getValor() < menorDeTodos)
                menorDeTodos = lance.getValor();
        }

        maiores = new ArrayList<Lance>(leilao.getLances());
        Collections.sort(maiores, (o1, o2) -> Double.compare(o2.getValor(), o1.getValor()));
        maiores = maiores.subList(0, maiores.size() > 3 ? 3 : maiores.size());
    }

    public double getMaiorDeTodos() {
        return maiorDeTodos;
    }

    public double getMenorDeTodos() {
        return menorDeTodos;
    }

    public List<Lance> getTresMaiores() {
        return maiores;
    }
}
