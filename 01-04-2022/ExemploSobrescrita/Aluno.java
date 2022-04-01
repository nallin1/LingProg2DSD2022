public class Aluno extends Pessoa {
    private int ra;

    public Aluno(String nome, int idade, int ra) {
        super(nome, idade);
        this.ra = ra;
        this.nome = nome;
    }

    public int getRa() {
        return this.ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    @Override
    public void mostra() {
        System.out.println("É UM ALUNO!!");
    }
}
