import java.util.ArrayList;

public class ShowDeRock {
    public static void main(String[] args) {
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
    }
}
