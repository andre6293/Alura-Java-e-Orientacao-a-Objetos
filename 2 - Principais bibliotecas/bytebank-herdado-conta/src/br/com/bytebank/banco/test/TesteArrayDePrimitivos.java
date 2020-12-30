package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {


    public static void main(String[] args) {

//      int[] idades = {3, 2, 1};
        int[] idades = new int[5]; // inicializa a array com o valor 0

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
            System.out.println(idades[i]);
        }
  }
}
