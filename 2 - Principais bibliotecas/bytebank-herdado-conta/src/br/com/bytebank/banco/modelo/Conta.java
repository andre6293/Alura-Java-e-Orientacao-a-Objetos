package br.com.bytebank.banco.modelo;

/**
 * Classe representa o molde de uma conta
 *
 * @author ander
 *
 */

public abstract  class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;


    /**
     * Construtor para inicializar um objeto Conta a partir da agencia e numero.
     * @param agencia
     * @param numero
     */

    public Conta (int agencia, int numero){
        total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void depositar(double valor);


    /**
     * Valor precisa ser maior do que o saldo.
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor do saque: " + valor);
        }
        this.saldo -= valor;
    }

    public void tranferir(double valor, Conta contaDestino) throws SaldoInsuficienteException {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // GETTERS AND SETTERS
    public static int getTotal() {
        return total;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Valor inválido para agência de conta.");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Valor inválido para número de conta.");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Número: " + this.getNumero() + "\nAgência: " + this.getAgencia();
    }

    @Override
    public boolean equals(Object cc3) {
        Conta ref = (Conta) cc3;
        if(this.getAgencia() != ref.getAgencia()) {
            return false;
        }

        return this.numero == ref.getNumero();
    }
}