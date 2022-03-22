package Exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Item item1 = new Item(201329, 200, "Hard Drive", 70.69);

        System.out.println("Os valores do Item 1 são: " + item1.getCodigo() + item1.getQuantItem() + item1.getDescricao() + item1.getPrecoItem());

        System.out.println("O total do preço a pagar é: " + item1.getTotal(item1.getQuantItem(), item1.getPrecoItem()));
    }
}
