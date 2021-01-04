package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

        //Fluxo de saída com um arquivo
//        OutputStream fileOut = new FileOutputStream("lorem2.txt");
//        Writer writer = new OutputStreamWriter(fileOut);
//        BufferedWriter bw = new BufferedWriter(writer);

        FileWriter fw = new FileWriter("lorem2.txt");

        fw.write("A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart.");
//        fw.write("\n");
        fw.write(System.lineSeparator()); //preferível em relação ao \n porque essa forma fará \r\n no Windows
        fw.write(System.lineSeparator());
        fw.write("asd asd ddsa asd ccc");
        fw.close();
    }
}
