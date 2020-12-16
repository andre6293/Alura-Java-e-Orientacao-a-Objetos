public class TestaReferencias {
    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setNome("Marcos");
        g.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registrar(g);
        controle.registrar(ev);
        controle.registrar(d);
        
        System.out.println(controle.getSoma());
    }
}
