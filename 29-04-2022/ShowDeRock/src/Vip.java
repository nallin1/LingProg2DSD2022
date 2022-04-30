public class Vip extends Ingresso {
    private double valorAdicional;

    public Vip() {
        this.setValor(200);
        this.valorAdicional = 50;
    }

    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
