import java.util.ArrayList;

public class ShowDeRock {
    public static void main(String[] args) {
        Vip v1 = new Vip();
        v1.setValor(200);
        v1.setValorAdicional(100);
        Comum c1 = new Comum();
        Vip v2 = new Vip();

        ArrayList<Ingresso> listaIngressos = new ArrayList<>();

        listaIngressos.add(v1);
        listaIngressos.add(c1);
        listaIngressos.add(v2);

        for(Ingresso ing: listaIngressos) {

        }
    }
}
