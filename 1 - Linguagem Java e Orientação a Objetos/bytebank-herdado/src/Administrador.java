public class Administrador extends Funcionario implements Autenticavel {

    private final Autenticador autenticador;

    public Administrador() {
        this.autenticador = new Autenticador();
    }

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação de administradores");
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticar(senha);
    }

    @Override
    public boolean autenticar(int senha) {
        return this.autenticador.autenticar(senha);
    }
}
