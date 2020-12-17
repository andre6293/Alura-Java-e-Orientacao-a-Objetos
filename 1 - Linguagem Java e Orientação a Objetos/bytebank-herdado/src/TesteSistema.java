public class TesteSistema {
    
    public static void main(String[] args) {
         Gerente g = new Gerente();
         g.setSenha(1324);

         Administrador adm = new Administrador();
         adm.setSenha(2222);

         Cliente cliente = new Cliente();
         cliente.setSenha(2222);
        
         SistemaInterno si = new SistemaInterno();
         si.autenticar(g);
         si.autenticar(adm);
         si.autenticar(cliente);
    }
}
