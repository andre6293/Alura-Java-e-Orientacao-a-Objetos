public class TesteConexao {

    public static void main(String[] args) {

        try (Conexao conexao = new Conexao()){ // com o AutoCloseable não é necessário ter o finally pois ele está ímplicito
            conexao.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Erro de conexão");
        }

//--------------------------------------------------------
//        Conexao con = null;
//        try {
//            con = new Conexao();
//            con.leDados();
//        } catch (IllegalStateException ex){
//            System.out.println("Erro de conexão");
//        } finally {
//            if (con != null) {
//                con.close();
//            }
//        }
    }
}
