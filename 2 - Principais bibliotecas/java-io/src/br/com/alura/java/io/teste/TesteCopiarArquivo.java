package br.com.alura.java.io.teste;

import java.io.*;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com um arquivo
//        InputStream fileIn = new FileInputStream("lorem.txt");
        InputStream fileIn = System.in;
        InputStreamReader reader = new InputStreamReader(fileIn);
        BufferedReader br = new BufferedReader(reader);

        //Fluxo de saída com um arquivo
        OutputStream fileOut = System.out; //new FileOutputStream("lorem2.txt");
        Writer writer = new OutputStreamWriter(fileOut);
        BufferedWriter bw = new BufferedWriter(writer);

        String linha = br.readLine();

        while(linha != null && !linha.isEmpty()) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }
        br.close();
        bw.close();
    }
}
