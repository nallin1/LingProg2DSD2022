package Exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
        Pessoa einstein = new Pessoa(14, 3, 1879,"albert einstein");

        Pessoa newton = new Pessoa(4, 1, 1643, "Isaac Newton");

        System.out.println("A idade do Newton seria: " + newton.calculaIdade());
        System.out.println("A idade do Einstein seria: " + einstein.calculaIdade());
    }
}
