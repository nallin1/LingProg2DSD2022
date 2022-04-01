public class Bolsista extends Aluno {
    private double bolsa;

    public Bolsista (String nome, int idade, int ra, double bolsa) {
        super(nome, idade, ra);
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void mostra() {
        super.mostra();
        System.out.println("É UM BOLSISTA");
    }
}
