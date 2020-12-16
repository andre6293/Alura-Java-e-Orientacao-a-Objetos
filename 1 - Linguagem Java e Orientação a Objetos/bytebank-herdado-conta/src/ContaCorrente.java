public class ContaCorrente extends Conta {
    
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean sacar(double valor) {
        double valorSacar = valor + 0.20;
        return super.sacar(valorSacar);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }
}
