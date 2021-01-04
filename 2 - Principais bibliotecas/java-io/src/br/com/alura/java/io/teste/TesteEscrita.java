package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        //Fluxo de saída com um arquivo
        OutputStream fileOut = new FileOutputStream("lorem2.txt");
        Writer writer = new OutputStreamWriter(fileOut);
        BufferedWriter bw = new BufferedWriter(writer);

        bw.write("A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart.");

        bw.close();
    }
}
