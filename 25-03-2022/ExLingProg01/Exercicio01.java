/**
 * Exercicio01
*/
public class Exercicio01 {
    public static void main(String[] args) {
        Poupanca poupanca1 = new Poupanca();
        Poupanca poupanca2 = new Poupanca();

        poupanca1.setSaldo(2000);
        poupanca2.setSaldo(3000);

        System.out.println("A taxa de juros mensal da poupança 1 é: " + poupanca1.calcularJurosMensais());
        System.out.println("O novo saldo de poupança 1 é: " + poupanca1.getSaldo());

        System.out.println("\nA taxa de juros mensal da poupança 2 é: " + poupanca2.calcularJurosMensais());
        System.out.println("O novo saldo de poupança 2 é: " + poupanca2.getSaldo());

        Poupanca.modificaTaxaJuro(0.04);

        System.out.println("\nA taxa de juros mensal da poupança 1 é: " + poupanca1.calcularJurosMensais());
        System.out.println("O novo saldo de poupança 1 é: " + poupanca1.getSaldo());

        System.out.println("\nA taxa de juros mensal da poupança 2 é: " + poupanca2.calcularJurosMensais());
        System.out.println("O novo saldo de poupança 2 é: " + poupanca2.getSaldo());
    }
}