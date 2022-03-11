package Exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Joao", "Da Silva", 1500.5);
        System.out.println("O salario do funcionário é: " + func1.getSalarioMens());
        System.out.println("O salario anual do funcionário é: " + func1.salarioAnual());
    }
}
