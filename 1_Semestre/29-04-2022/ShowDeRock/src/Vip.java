public class Vip extends Ingresso {
    private double valorAdicional;

<<<<<<< HEAD
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
=======
    public double getValorAdicional() {
        return this.valorAdicional;
>>>>>>> origin/main
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
