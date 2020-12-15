public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario("Nico", "111111111-11", 5000);
        
        System.out.println(nico.getNome());
        // nico.salario = 200.0;
        nico.setSalario(200.00);

        System.out.println(nico.getSalario());
    }
}
