package br.com.alura;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>(); //É uma boa prática gerar objetos com o tipo mais abrangente
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
//        return aulas;
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public int getTempoTotal() {
//        int tempoTotal = 0;
//        for (Aula aula: aulas) {
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal;
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " + nome + ", Tempo total: "
                + this.getTempoTotal() + " minutos, Aulas: " + this.getAulas();
    }

    public void matricular(Aluno a1) {
        this.alunos.add(a1);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public boolean estaMatriculado(String nomeAluno) {
        for (Aluno aluno: alunos) {
            if (aluno.getNome().equals(nomeAluno))
                return true;
        }
        return false;
    }
}
