public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        }catch(ArithmeticException | NullPointerException ex){ // pode usar a super classe Exception em razão do polimorfismo das linguagens OO
            String msg = ex.getMessage();
            System.out.println("Exception: " + msg);
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");

        throw new ArithmeticException("Não deu certo. Erro aritmético");

//        System.out.println("Fim do metodo2");
    }
}
