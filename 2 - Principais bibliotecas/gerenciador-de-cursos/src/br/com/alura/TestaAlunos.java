package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Pablo Picasso");
        alunos.add("Paul Cézanne");
        alunos.add("Vincent Van Gogh");
        alunos.add("Amedeo Modigliani");
        alunos.add("Ivan Aivazovsky");
        alunos.add("Tarsila do Amaral");
        alunos.add("Amedeo Modigliani"); // não adiciona items repetidos, não emite erros ao tentar

        System.out.println(alunos);
        System.out.println(alunos.size());

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        alunos.remove("Vincent Van Gogh");
        System.out.println(pauloEstaMatriculado);

//        for (String aluno:alunos) {
//            System.out.println(aluno);
//        }
        alunos.forEach(System.out::println);


    }
}
