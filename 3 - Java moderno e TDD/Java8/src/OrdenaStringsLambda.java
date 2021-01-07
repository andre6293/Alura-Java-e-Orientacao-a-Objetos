import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStringsLambda {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

//        Collections.sort(palavras, (s1, s2) -> s1.length() - s2.length());

//        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(palavras);

        palavras.forEach(s -> System.out.println(s));

//        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length); // exatamente igual à linha superior
        System.out.println(palavras);
    }
}


