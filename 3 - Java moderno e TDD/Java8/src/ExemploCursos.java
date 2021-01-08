import java.util.*;
import java.util.stream.Collectors;

class Curso {

    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCursos {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("Javascript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos)); // method reference

//        cursos.forEach(curso -> System.out.println(curso.getName() + ", " + curso.getAlunos()));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(curso -> curso.getAlunos()) // ou Curso::getAlunos
                .average()
                .ifPresent(System.out::println);
//                .forEach(System.out::println);
//                .forEach(c -> System.out.println(c.getName() + ", " + c.getAlunos()));

        List<Curso> resultado = cursos = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .collect(Collectors.toList());

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny()
                .ifPresent(c1 -> System.out.println(c1.getNome()));

        cursos.stream() // parallelStream() consegue processar em paralelo, nos diferentes threads da CPUY
                .filter(curso -> curso.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        curso -> curso.getNome(), // Curso::getNome
                        curso -> curso.getAlunos()))// Curso::getAlunos
                .forEach((s, integer) -> System.out.println(s + " tem " + integer + " alunos"));

        // média de alunos por curso
        cursos.stream()
                .mapToInt(Curso::getAlunos)
                .average()
                .ifPresent(System.out::println);

        // Resultado de uma stream para List
        List<Curso> collect = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .collect(Collectors.toList());


    }
}