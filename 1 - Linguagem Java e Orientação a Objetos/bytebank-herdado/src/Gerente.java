public class Gerente extends FuncionarioAutenticavel {

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação de gerentes");
        return super.getSalario();
    }
}
