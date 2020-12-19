public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {

        int a = 3;
        int b = a / 0;

        ContaCorrente outra = null;
        outra.depositar(200);

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.depositar(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.depositar(200.0);

        cc.tranferir(10.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
