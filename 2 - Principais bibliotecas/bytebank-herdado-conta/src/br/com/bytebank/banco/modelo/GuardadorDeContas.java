package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0; //o valor padrão já está implícito na linha 10, declarado para manter a consistência com a aula
    }


    public void adicionar(Conta ref) {
        this.referencias[posicaoLivre] = ref;
        this.posicaoLivre++;

    }

    public int getQuantidadeDeElementos() {
        return posicaoLivre;
    }

    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }
}
