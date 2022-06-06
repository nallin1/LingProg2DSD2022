package Exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Joao", "Da Silva", 100);
        System.out.println("O salario do funcionário é: " + func1.getSalarioMens());
        System.out.println("O salario anual do funcionário é: " + func1.salarioAnual());

        Funcionario func2 = new Funcionario("Aline", "Soares", 2500);
        System.out.println("O salario anual do funcionário é: " + func2.salarioAnual());
        
        func1.setSalarioMens(func1.getSalarioMens()+func1.getSalarioMens()*10/100);
        System.out.println("SALARIO DO FUNC1 DEPOIS DO AUMENTO: " + func1.getSalarioMens());
        System.out.println("SALARIO ANUAL DO FUNC1 DEPOIS DO AUMENTO: " + func1.salarioAnual());

        func2.setSalarioMens(func2.getSalarioMens()+func2.getSalarioMens()*10/100);
        System.out.println("SALARIO DO FUNC2 DEPOIS DO AUMENTO: " + func2.getSalarioMens());
        System.out.println("SALARIO ANUAL DO FUNC2 DEPOIS DO AUMENTO: " + func2.salarioAnual());
    }
}
