public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1234, 33231);

        conta.setAgencia(-50);
        conta.setNumero(-40);

        Conta conta2 = new Conta(1234, 33232);

        System.out.println(Conta.getTotal());
    }
}