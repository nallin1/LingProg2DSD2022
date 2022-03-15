package Exercicio04;

public class Estoque {
    private String nome;
    private int qtdAtual, qtdMinima;

    public Estoque() {
        nome = "";
        qtdAtual = 0;
        qtdMinima = 0;
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return this.qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return this.qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public int reporEstoque(int qtd) {
        qtdAtual = qtdAtual+qtd;

        return qtdAtual;
    }

    public int darBaixaEstoque(int qtd) {
        qtdAtual = qtdAtual-qtd;

        return qtdAtual;
    }

}
