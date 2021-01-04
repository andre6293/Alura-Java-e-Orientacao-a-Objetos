package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Cliente cliente = new Cliente();
//        cliente.setNome("Carlos");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("123123123-12");
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();

        System.out.printf("Nome: %s\nCPF: %s\nProfissão: %s%n", cliente.getNome(), cliente.getCpf(), cliente.getProfissao());
    }
}
