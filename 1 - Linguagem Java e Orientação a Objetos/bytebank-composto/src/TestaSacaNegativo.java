public class TestaSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        conta.saca(300);
        System.out.println(conta.getSaldo());
    }
}
