package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAlunos {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando ArrayList", 23));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Fernanda Montenegro", 1321);
        Aluno a2 = new Aluno("Alain Delon", 1234);
        Aluno a3 = new Aluno("Fausto Fanti", 1738);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(System.out::println);


// ---------------------

        for (Aluno aluno : javaColecoes.getAlunos()) {
            System.out.println(aluno);
        }
//        Acima a melhor forma antes do Java 8, não era possível antes do Java 5 (2004),
//        sendo necessário o uso de um iterator para exibir os itens de um Set
// ---------------------

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        Acima o método antigo (anterior ao Java 5)
// ---------------------

        Vector<Aluno> vetor = new Vector<>(); // threadsafe, mas o uso não é recomendado

        System.out.println("O(a) aluno(a) " + a1.getNome() + " está matriculado: " + javaColecoes.estaMatriculado(a1));

        Aluno fernanda = new Aluno("Fernanda Montenegro", 132);
        System.out.println(javaColecoes.estaMatriculado(fernanda));

        System.out.println("O a1 é equals à Fernanda?");
        System.out.println(a1.equals(fernanda));
    }
}
