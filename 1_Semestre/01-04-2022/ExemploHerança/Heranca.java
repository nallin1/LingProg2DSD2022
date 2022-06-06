/**
 * App
 */
public class Heranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Tania", 25);
        // p1.setNome("Tania");
        // p1.setIdade(25);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

        Aluno al1 = new Aluno("Joao", 15, 12314);
        // al1.setIdade(15);
        // al1.setNome("Joao");
        // al1.setRa(21324);
        System.out.println("Nome: " + al1.getNome());
        System.out.println("Idade: " + al1.getIdade());
        System.out.println("RA: " + al1.getRa());

        Professor prof1 = new Professor("Rampin", 23, 10000);
        //prof1.setIdade(124);
        //prof1.setNome("Rampin");
        //prof1.setSalario(10000);
        System.out.println("Nome: " + prof1.getNome());
        System.out.println("Idade: " + prof1.getIdade());
        System.out.println("RA: " + prof1.getSalario());

        Bolsista bols1 = new Bolsista("Joaozinho", 18, 12313, 213.3);
        System.out.println("");
    }
}