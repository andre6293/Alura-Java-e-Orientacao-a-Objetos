public class EditorVideo extends Funcionario {
    
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação de editores de vídeo");
        return super.getBonificacao() + 100;
    }
}
