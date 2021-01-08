import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Curso {

    private String name;
    private int alunos;

    public Curso(String name, int alunos) {
        this.name = name;
        this.alunos = alunos;
    }

    public String getName() {
        return name;
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

        int sum = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(curso -> curso.getAlunos()) // ou Curso::getAlunos
                .sum();
//                .forEach(System.out::println);
//                .forEach(c -> System.out.println(c.getName() + ", " + c.getAlunos()));
        System.out.println(sum);
    }
}


