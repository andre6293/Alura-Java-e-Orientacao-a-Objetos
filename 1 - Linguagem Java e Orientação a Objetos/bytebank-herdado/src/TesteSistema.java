public class TesteSistema {
    
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(1324);

        Administrador adm = new Administrador();
        adm.setSenha(2222);
        
        SistemaInterno si = new SistemaInterno();
        si.autenticar(adm);
    }
}
