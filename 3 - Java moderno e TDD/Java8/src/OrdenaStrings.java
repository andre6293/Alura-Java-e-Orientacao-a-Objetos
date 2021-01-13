import java.util.*;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do código");
        palavras.add("caelum");

        ComparadorPorTamanho comparador = new ComparadorPorTamanho();
        Collections.sort(palavras, comparador);

        System.out.println(palavras);

//        for (String p : palavras) {
//            System.out.println(p);
//        }

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);

    }
}

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}


class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}