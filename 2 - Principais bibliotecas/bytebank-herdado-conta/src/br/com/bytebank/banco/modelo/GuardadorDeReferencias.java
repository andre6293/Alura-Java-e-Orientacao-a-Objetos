package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias() {
        this.referencias = new Object[10];
        this.posicaoLivre = 0; //o valor padrão já está implícito na linha 10, declarado para manter a consistência com a aula
    }


    public void adicionar(Object ref) {
        this.referencias[posicaoLivre] = ref;
        this.posicaoLivre++;

    }

    public int getQuantidadeDeElementos() {
        return posicaoLivre;
    }

    public Object getReferencia(int pos) {
        return this.referencias[pos];
    }
}
