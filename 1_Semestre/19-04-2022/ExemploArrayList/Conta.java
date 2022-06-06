public class Conta {
    private double saldo;

    public void mostra() {
        System.out.println("É UMA CONTA !!");
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
