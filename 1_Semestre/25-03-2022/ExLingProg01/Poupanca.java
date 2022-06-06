public class Poupanca {
    private static double taxaJurosAnual = 0.03;
    private double saldo;

    public double calcularJurosMensais() {
        double jurosMensais = (saldo*taxaJurosAnual)/12;
        saldo += jurosMensais;
        return jurosMensais;
    }

    public static void modificaTaxaJuro(double novoValorTaxaJurosAnual) {
        taxaJurosAnual = novoValorTaxaJurosAnual;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}