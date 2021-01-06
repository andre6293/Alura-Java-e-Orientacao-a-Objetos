package br.com.alura;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

//        javaColecoes.getAulas().add(new Aula("Trabalhando ArrayList", 23)); // Collections.unmodifiableList(aulas) no método getAulas() é impossível usar esse método da lista
        javaColecoes.adiciona(new Aula("Trabalhando ArrayList", 23));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        System.out.println(javaColecoes.getAulas());
g    }
}
