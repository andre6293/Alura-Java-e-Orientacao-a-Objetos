package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue()); //unboxing

        Double dRef = Double.valueOf(3.2); //autoboxing
        System.out.println(dRef.doubleValue()); //unboxing

        Boolean bRef = Boolean.TRUE; //autoboxing
        System.out.println(bRef.booleanValue()); //unboxing

        Number refNumero = Float.valueOf(2f);

        List<Number> lista = new ArrayList<>();

        lista.add(idadeRef);
        lista.add(dRef);
        lista.add(refNumero);

        System.out.println(lista.toString());

    }
}
