package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setNome("Carlos");
        cliente.setProfissao("Dev");
        cliente.setCpf("123123123-12");

        ContaCorrente cc = new ContaCorrente(1234, 123456789);
        cc.depositar(200);
        cc.setTitular(cliente);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}