public class SistemaInterno {

    private int senha = 2222;


    public void autenticar(FuncionarioAutenticavel fa) {
        boolean autenticou = fa.autenticar(this.senha);

        if (autenticou) {
            System.out.println("Pode entrar no sistema.");
        } else {
            System.out.println("Não pode entrar no sistema.");
        }
    }
}
