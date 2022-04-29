public class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public Ingresso() {
        this.valor = 100;
    }

    public void imprimeValor() {
        System.out.println("O valor é: " + this.valor);
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }
}
