public class Gerente extends Funcionario{

    public int senha;

    // METHODS
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        }
        return false;
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação de gerentes");
        return super.getSalario() + super.getBonificacao();
    }

    // GETTERS and SETTERS
    public void setSenha(int senha) {
        this.senha = senha;
    }
}
