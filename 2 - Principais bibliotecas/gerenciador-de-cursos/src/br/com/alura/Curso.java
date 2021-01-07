package br.com.alura;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>(); //É uma boa prática gerar objetos com o tipo mais abrangente
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaPorAluno = new HashMap<>();

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

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaPorAluno.put(aluno.getNumeroMatricula(), aluno);
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

    public Aluno buscaMatriculado(int numero) {
        if(!matriculaPorAluno.containsKey(numero)) {
            throw new NoSuchElementException("Matrícula " + numero + " não encontrada.");
        }
        return matriculaPorAluno.get(numero);
    }
}
