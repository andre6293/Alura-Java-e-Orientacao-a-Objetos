package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        int idade = 29;

        Integer idadeRef = Integer.valueOf(29); //autoboxing

        System.out.println(idadeRef.floatValue());

//        System.out.println(Integer.MAX_VALUE);

        System.out.println("Um inteiro custa " + Integer.SIZE + " bits");
        System.out.println("Equivalente a " + Integer.BYTES + " bytes");


        int valor = idadeRef.intValue(); //unboxing

        String s = args[0]; //"10"
//        Integer numero = Integer.valueOf(s);
        Integer numero = Integer.parseInt(s);
        System.out.println(numero + "² = " + numero * numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //autoboxing
    }
}
