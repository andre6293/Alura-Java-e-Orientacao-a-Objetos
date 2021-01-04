package br.com.alura.java.io.teste;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com um arquivo
        FileInputStream fileIn = new FileInputStream("lorem.txt");
        InputStreamReader reader = new InputStreamReader(fileIn, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(reader);

        String linha = br.readLine();

        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();
    }
}
