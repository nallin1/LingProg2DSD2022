public class Poupanca extends Conta {
    private double taxa;

    @Override
    public void mostra() {
        System.out.println("É UMA POUPANÇA !!");
    }

    public double getTaxa() {
        return this.taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
