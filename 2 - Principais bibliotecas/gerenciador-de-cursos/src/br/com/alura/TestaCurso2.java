package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando ArrayList", 23));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        ArrayList<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas); // o método getAulas() devolve uma Collections.unmodifiableList

        System.out.println(aulas);
        System.out.printf("Este curso tem %d minutos\n", javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);
    }
}
