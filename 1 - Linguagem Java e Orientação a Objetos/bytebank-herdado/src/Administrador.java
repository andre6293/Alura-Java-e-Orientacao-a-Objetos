public class Administrador extends FuncionarioAutenticavel {

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação de administradores");
        return 50;
    }
}
