package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

        //Fluxo de saída com um arquivo
//        OutputStream fileOut = new FileOutputStream("lorem2.txt");
//        Writer writer = new OutputStreamWriter(fileOut);
//        BufferedWriter bw = new BufferedWriter(writer);

//        FileWriter fw = new FileWriter("lorem2.txt");

        PrintStream ps = new PrintStream("lorem2.txt");

        ps.println("A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart.");
        ps.println();
        ps.println();
        ps.println("asd asd ddsa asd ccc");

        ps.close();
    }
}
