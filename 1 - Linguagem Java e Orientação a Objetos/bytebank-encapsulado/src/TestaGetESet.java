public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24444);

        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("Abelardo Bernardes");
        // conta.titular = "Paulo"; // privado

        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Desenvolvedor");
    }
}