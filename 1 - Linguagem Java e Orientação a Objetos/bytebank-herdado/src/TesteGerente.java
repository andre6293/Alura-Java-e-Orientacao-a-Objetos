public class TesteGerente {
    public static void main(String[] args) {

        Autenticavel referencia = new Cliente();



        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("123123123-12");
        g1.setSalario(5000.0);

        System.out.println("Nome : " + g1.getNome());
        System.out.println("CPF : " + g1.getCpf());
        System.out.println("Salario: " + g1.getSalario());

        g1.setSenha(2222);
        boolean autenticou = g1.autenticar(2222);

        System.out.println("Autenticou: " + autenticou);

        System.out.println("Bonificação: " + g1.getBonificacao());
    }
}
