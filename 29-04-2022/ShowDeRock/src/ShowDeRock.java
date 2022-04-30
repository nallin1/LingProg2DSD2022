import java.util.ArrayList;

public class ShowDeRock {
    public static void main(String[] args) {
<<<<<<< HEAD
        double faturamentoTotal=0;
        System.out.println("Show de ROCK !!");

        Vip vip1 = new Vip(100, 700);
        Ingresso ing1 = new Ingresso();
        Comum c1 = new Comum();
        Vip vip2 = new Vip();

        ArrayList<Ingresso> arrayIngressos = new ArrayList<>();

        arrayIngressos.add(vip1);
        arrayIngressos.add(vip2);
        arrayIngressos.add(c1);
        arrayIngressos.add(ing1);

        for (Ingresso ing: arrayIngressos) {
            //System.out.println(ing.getValor());
            faturamentoTotal += ing.getValor();

            if(ing instanceof Vip) {
                Vip i = (Vip) ing;
                //System.out.println("O valor adicional é: "+i.getValorAdicional());
                faturamentoTotal += i.getValorAdicional();

            }
        }
        System.out.println("O faturamento total é:" + faturamentoTotal);
=======
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
>>>>>>> origin/main
    }
}
