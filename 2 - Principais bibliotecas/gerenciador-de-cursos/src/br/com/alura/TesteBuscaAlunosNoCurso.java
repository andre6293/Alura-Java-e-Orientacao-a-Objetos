package br.com.alura;

public class TesteBuscaAlunosNoCurso {

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

        System.out.println("Quem é o aluno com matrícula 1234");
        Aluno aluno = javaColecoes.buscaMatriculado(124);

        System.out.println(aluno);
    }
}
