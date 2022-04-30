public class Ingresso {
    private double valor;

    public Ingresso() {
        this.valor = 10;
    }

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void imprimeValor() {
        System.out.println("O valor é: " + this.valor);
    }
}
